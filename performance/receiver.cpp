//
// Created by Ivan Shynkarenka on 19.05.2018
//

#include "benchmark/cppbenchmark.h"

#include "../proto/proto_protocol.h"

class MySender : public FBE::proto::Sender
{
protected:
    size_t onSend(const void* data, size_t size) override { return 0; }
};

class MyReceiver : public FBE::proto::Receiver
{
public:
    size_t log_size() const noexcept { return _log_size; }

protected:
    void onReceive(const proto::OrderMessage& value) override {}
    void onReceive(const proto::BalanceMessage& value) override {}
    void onReceive(const proto::AccountMessage& value) override {}

    void onReceiveLog(const std::string& message) const override { _log_size += message.size(); }

private:
    mutable size_t _log_size;
};

class SendFixture
{
protected:
    MySender sender;
    MyReceiver receiver;
    proto::AccountMessage account;

    SendFixture()
    {
        // Create a new account with some orders
        account.body = { 1, "Test", proto::State::good, { "USD", 1000.0 }, std::make_optional<proto::Balance>({ "EUR", 100.0 }), {} };
        account.body.orders.emplace_back(1, "EURUSD", proto::OrderSide::buy, proto::OrderType::market, 1.23456, 1000.0);
        account.body.orders.emplace_back(2, "EURUSD", proto::OrderSide::sell, proto::OrderType::limit, 1.0, 100.0);
        account.body.orders.emplace_back(3, "EURUSD", proto::OrderSide::buy, proto::OrderType::stop, 1.5, 10.0);

        // Serialize and send the account
        sender.send(account);
    }
};

BENCHMARK_FIXTURE(SendFixture, "Receive")
{
    // Receive the account from the sender
    receiver.receive(sender.buffer().data(), sender.buffer().size());
}

/*
BENCHMARK_FIXTURE(SendFixture, "Receive with logs")
{
    // Enable logging
    receiver.logging(true);

    // Receive the account from the sender
    receiver.receive(sender.buffer().data(), sender.buffer().size());
}
*/

BENCHMARK_MAIN()
