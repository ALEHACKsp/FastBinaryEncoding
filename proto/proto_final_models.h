// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.7.0.0

#pragma once

#if defined(__clang__)
#pragma clang system_header
#elif defined(__GNUC__)
#pragma GCC system_header
#elif defined(_MSC_VER)
#pragma system_header
#endif

#include "fbe_final_models.h"

#include "proto.h"

namespace FBE {

// Fast Binary Encoding ::proto::OrderSide final model
template <>
class FinalModel<::proto::OrderSide> : public FinalModelBase<::proto::OrderSide, uint8_t>
{
public:
    using FinalModelBase<::proto::OrderSide, uint8_t>::FinalModelBase;
};

// Fast Binary Encoding ::proto::OrderType final model
template <>
class FinalModel<::proto::OrderType> : public FinalModelBase<::proto::OrderType, uint8_t>
{
public:
    using FinalModelBase<::proto::OrderType, uint8_t>::FinalModelBase;
};

// Fast Binary Encoding ::proto::State final model
template <>
class FinalModel<::proto::State> : public FinalModelBase<::proto::State, uint8_t>
{
public:
    using FinalModelBase<::proto::State, uint8_t>::FinalModelBase;
};

// Fast Binary Encoding ::proto::Order final model
template <>
class FinalModel<::proto::Order>
{
public:
    FinalModel(FBEBuffer& buffer, size_t offset) noexcept;

    // Get the allocation size
    size_t fbe_allocation_size(const ::proto::Order& fbe_value) const noexcept;
    // Get the final offset
    size_t fbe_offset() const noexcept { return _offset; }
    // Set the final offset
    size_t fbe_offset(size_t offset) const noexcept { return _offset = offset; }
    // Get the final type
    static constexpr size_t fbe_type() noexcept { return 1; }

    // Shift the current final offset
    void fbe_shift(size_t size) noexcept { _offset += size; }
    // Unshift the current final offset
    void fbe_unshift(size_t size) noexcept { _offset -= size; }

    // Check if the struct value is valid
    size_t verify() const noexcept;
    // Check if the struct fields are valid
    size_t verify_fields() const noexcept;

    // Get the struct value
    size_t get(::proto::Order& fbe_value) const noexcept;
    // Get the struct fields values
    size_t get_fields(::proto::Order& fbe_value) const noexcept;

    // Set the struct value
    size_t set(const ::proto::Order& fbe_value) noexcept;
    // Set the struct fields values
    size_t set_fields(const ::proto::Order& fbe_value) noexcept;

private:
    FBEBuffer& _buffer;
    mutable size_t _offset;

public:
    FinalModel<int32_t> id;
    FinalModel<std::string> symbol;
    FinalModel<::proto::OrderSide> side;
    FinalModel<::proto::OrderType> type;
    FinalModel<double> price;
    FinalModel<double> volume;
};

namespace proto {

// Fast Binary Encoding Order final model
class OrderFinalModel : public FBE::Model
{
public:
    OrderFinalModel() : _model(this->buffer(), 8) {}
    OrderFinalModel(const std::shared_ptr<FBEBuffer>& buffer) : FBE::Model(buffer), _model(this->buffer(), 8) {}

    // Get the model type
    static constexpr size_t fbe_type() noexcept { return FinalModel<::proto::Order>::fbe_type(); }

    // Check if the struct value is valid
    bool verify();

    // Serialize the struct value
    size_t serialize(const ::proto::Order& value);
    // Deserialize the struct value
    size_t deserialize(::proto::Order& value) const noexcept;

    // Move to the next struct value
    void next(size_t prev) noexcept { _model.fbe_shift(prev); }

private:
    FinalModel<::proto::Order> _model;
};

} // namespace proto

// Fast Binary Encoding ::proto::Balance final model
template <>
class FinalModel<::proto::Balance>
{
public:
    FinalModel(FBEBuffer& buffer, size_t offset) noexcept;

    // Get the allocation size
    size_t fbe_allocation_size(const ::proto::Balance& fbe_value) const noexcept;
    // Get the final offset
    size_t fbe_offset() const noexcept { return _offset; }
    // Set the final offset
    size_t fbe_offset(size_t offset) const noexcept { return _offset = offset; }
    // Get the final type
    static constexpr size_t fbe_type() noexcept { return 2; }

    // Shift the current final offset
    void fbe_shift(size_t size) noexcept { _offset += size; }
    // Unshift the current final offset
    void fbe_unshift(size_t size) noexcept { _offset -= size; }

    // Check if the struct value is valid
    size_t verify() const noexcept;
    // Check if the struct fields are valid
    size_t verify_fields() const noexcept;

    // Get the struct value
    size_t get(::proto::Balance& fbe_value) const noexcept;
    // Get the struct fields values
    size_t get_fields(::proto::Balance& fbe_value) const noexcept;

    // Set the struct value
    size_t set(const ::proto::Balance& fbe_value) noexcept;
    // Set the struct fields values
    size_t set_fields(const ::proto::Balance& fbe_value) noexcept;

private:
    FBEBuffer& _buffer;
    mutable size_t _offset;

public:
    FinalModel<std::string> currency;
    FinalModel<double> amount;
};

namespace proto {

// Fast Binary Encoding Balance final model
class BalanceFinalModel : public FBE::Model
{
public:
    BalanceFinalModel() : _model(this->buffer(), 8) {}
    BalanceFinalModel(const std::shared_ptr<FBEBuffer>& buffer) : FBE::Model(buffer), _model(this->buffer(), 8) {}

    // Get the model type
    static constexpr size_t fbe_type() noexcept { return FinalModel<::proto::Balance>::fbe_type(); }

    // Check if the struct value is valid
    bool verify();

    // Serialize the struct value
    size_t serialize(const ::proto::Balance& value);
    // Deserialize the struct value
    size_t deserialize(::proto::Balance& value) const noexcept;

    // Move to the next struct value
    void next(size_t prev) noexcept { _model.fbe_shift(prev); }

private:
    FinalModel<::proto::Balance> _model;
};

} // namespace proto

// Fast Binary Encoding ::proto::Account final model
template <>
class FinalModel<::proto::Account>
{
public:
    FinalModel(FBEBuffer& buffer, size_t offset) noexcept;

    // Get the allocation size
    size_t fbe_allocation_size(const ::proto::Account& fbe_value) const noexcept;
    // Get the final offset
    size_t fbe_offset() const noexcept { return _offset; }
    // Set the final offset
    size_t fbe_offset(size_t offset) const noexcept { return _offset = offset; }
    // Get the final type
    static constexpr size_t fbe_type() noexcept { return 3; }

    // Shift the current final offset
    void fbe_shift(size_t size) noexcept { _offset += size; }
    // Unshift the current final offset
    void fbe_unshift(size_t size) noexcept { _offset -= size; }

    // Check if the struct value is valid
    size_t verify() const noexcept;
    // Check if the struct fields are valid
    size_t verify_fields() const noexcept;

    // Get the struct value
    size_t get(::proto::Account& fbe_value) const noexcept;
    // Get the struct fields values
    size_t get_fields(::proto::Account& fbe_value) const noexcept;

    // Set the struct value
    size_t set(const ::proto::Account& fbe_value) noexcept;
    // Set the struct fields values
    size_t set_fields(const ::proto::Account& fbe_value) noexcept;

private:
    FBEBuffer& _buffer;
    mutable size_t _offset;

public:
    FinalModel<int32_t> id;
    FinalModel<std::string> name;
    FinalModel<::proto::State> state;
    FinalModel<::proto::Balance> wallet;
    FinalModel<std::optional<::proto::Balance>> asset;
    FinalModelVector<::proto::Order> orders;
};

namespace proto {

// Fast Binary Encoding Account final model
class AccountFinalModel : public FBE::Model
{
public:
    AccountFinalModel() : _model(this->buffer(), 8) {}
    AccountFinalModel(const std::shared_ptr<FBEBuffer>& buffer) : FBE::Model(buffer), _model(this->buffer(), 8) {}

    // Get the model type
    static constexpr size_t fbe_type() noexcept { return FinalModel<::proto::Account>::fbe_type(); }

    // Check if the struct value is valid
    bool verify();

    // Serialize the struct value
    size_t serialize(const ::proto::Account& value);
    // Deserialize the struct value
    size_t deserialize(::proto::Account& value) const noexcept;

    // Move to the next struct value
    void next(size_t prev) noexcept { _model.fbe_shift(prev); }

private:
    FinalModel<::proto::Account> _model;
};

} // namespace proto

// Fast Binary Encoding ::proto::OrderMessage final model
template <>
class FinalModel<::proto::OrderMessage>
{
public:
    FinalModel(FBEBuffer& buffer, size_t offset) noexcept;

    // Get the allocation size
    size_t fbe_allocation_size(const ::proto::OrderMessage& fbe_value) const noexcept;
    // Get the final offset
    size_t fbe_offset() const noexcept { return _offset; }
    // Set the final offset
    size_t fbe_offset(size_t offset) const noexcept { return _offset = offset; }
    // Get the final type
    static constexpr size_t fbe_type() noexcept { return 1; }

    // Shift the current final offset
    void fbe_shift(size_t size) noexcept { _offset += size; }
    // Unshift the current final offset
    void fbe_unshift(size_t size) noexcept { _offset -= size; }

    // Check if the struct value is valid
    size_t verify() const noexcept;
    // Check if the struct fields are valid
    size_t verify_fields() const noexcept;

    // Get the struct value
    size_t get(::proto::OrderMessage& fbe_value) const noexcept;
    // Get the struct fields values
    size_t get_fields(::proto::OrderMessage& fbe_value) const noexcept;

    // Set the struct value
    size_t set(const ::proto::OrderMessage& fbe_value) noexcept;
    // Set the struct fields values
    size_t set_fields(const ::proto::OrderMessage& fbe_value) noexcept;

private:
    FBEBuffer& _buffer;
    mutable size_t _offset;

public:
    FinalModel<::proto::Order> body;
};

namespace proto {

// Fast Binary Encoding OrderMessage final model
class OrderMessageFinalModel : public FBE::Model
{
public:
    OrderMessageFinalModel() : _model(this->buffer(), 8) {}
    OrderMessageFinalModel(const std::shared_ptr<FBEBuffer>& buffer) : FBE::Model(buffer), _model(this->buffer(), 8) {}

    // Get the model type
    static constexpr size_t fbe_type() noexcept { return FinalModel<::proto::OrderMessage>::fbe_type(); }

    // Check if the struct value is valid
    bool verify();

    // Serialize the struct value
    size_t serialize(const ::proto::OrderMessage& value);
    // Deserialize the struct value
    size_t deserialize(::proto::OrderMessage& value) const noexcept;

    // Move to the next struct value
    void next(size_t prev) noexcept { _model.fbe_shift(prev); }

private:
    FinalModel<::proto::OrderMessage> _model;
};

} // namespace proto

// Fast Binary Encoding ::proto::BalanceMessage final model
template <>
class FinalModel<::proto::BalanceMessage>
{
public:
    FinalModel(FBEBuffer& buffer, size_t offset) noexcept;

    // Get the allocation size
    size_t fbe_allocation_size(const ::proto::BalanceMessage& fbe_value) const noexcept;
    // Get the final offset
    size_t fbe_offset() const noexcept { return _offset; }
    // Set the final offset
    size_t fbe_offset(size_t offset) const noexcept { return _offset = offset; }
    // Get the final type
    static constexpr size_t fbe_type() noexcept { return 2; }

    // Shift the current final offset
    void fbe_shift(size_t size) noexcept { _offset += size; }
    // Unshift the current final offset
    void fbe_unshift(size_t size) noexcept { _offset -= size; }

    // Check if the struct value is valid
    size_t verify() const noexcept;
    // Check if the struct fields are valid
    size_t verify_fields() const noexcept;

    // Get the struct value
    size_t get(::proto::BalanceMessage& fbe_value) const noexcept;
    // Get the struct fields values
    size_t get_fields(::proto::BalanceMessage& fbe_value) const noexcept;

    // Set the struct value
    size_t set(const ::proto::BalanceMessage& fbe_value) noexcept;
    // Set the struct fields values
    size_t set_fields(const ::proto::BalanceMessage& fbe_value) noexcept;

private:
    FBEBuffer& _buffer;
    mutable size_t _offset;

public:
    FinalModel<::proto::Balance> body;
};

namespace proto {

// Fast Binary Encoding BalanceMessage final model
class BalanceMessageFinalModel : public FBE::Model
{
public:
    BalanceMessageFinalModel() : _model(this->buffer(), 8) {}
    BalanceMessageFinalModel(const std::shared_ptr<FBEBuffer>& buffer) : FBE::Model(buffer), _model(this->buffer(), 8) {}

    // Get the model type
    static constexpr size_t fbe_type() noexcept { return FinalModel<::proto::BalanceMessage>::fbe_type(); }

    // Check if the struct value is valid
    bool verify();

    // Serialize the struct value
    size_t serialize(const ::proto::BalanceMessage& value);
    // Deserialize the struct value
    size_t deserialize(::proto::BalanceMessage& value) const noexcept;

    // Move to the next struct value
    void next(size_t prev) noexcept { _model.fbe_shift(prev); }

private:
    FinalModel<::proto::BalanceMessage> _model;
};

} // namespace proto

// Fast Binary Encoding ::proto::AccountMessage final model
template <>
class FinalModel<::proto::AccountMessage>
{
public:
    FinalModel(FBEBuffer& buffer, size_t offset) noexcept;

    // Get the allocation size
    size_t fbe_allocation_size(const ::proto::AccountMessage& fbe_value) const noexcept;
    // Get the final offset
    size_t fbe_offset() const noexcept { return _offset; }
    // Set the final offset
    size_t fbe_offset(size_t offset) const noexcept { return _offset = offset; }
    // Get the final type
    static constexpr size_t fbe_type() noexcept { return 3; }

    // Shift the current final offset
    void fbe_shift(size_t size) noexcept { _offset += size; }
    // Unshift the current final offset
    void fbe_unshift(size_t size) noexcept { _offset -= size; }

    // Check if the struct value is valid
    size_t verify() const noexcept;
    // Check if the struct fields are valid
    size_t verify_fields() const noexcept;

    // Get the struct value
    size_t get(::proto::AccountMessage& fbe_value) const noexcept;
    // Get the struct fields values
    size_t get_fields(::proto::AccountMessage& fbe_value) const noexcept;

    // Set the struct value
    size_t set(const ::proto::AccountMessage& fbe_value) noexcept;
    // Set the struct fields values
    size_t set_fields(const ::proto::AccountMessage& fbe_value) noexcept;

private:
    FBEBuffer& _buffer;
    mutable size_t _offset;

public:
    FinalModel<::proto::Account> body;
};

namespace proto {

// Fast Binary Encoding AccountMessage final model
class AccountMessageFinalModel : public FBE::Model
{
public:
    AccountMessageFinalModel() : _model(this->buffer(), 8) {}
    AccountMessageFinalModel(const std::shared_ptr<FBEBuffer>& buffer) : FBE::Model(buffer), _model(this->buffer(), 8) {}

    // Get the model type
    static constexpr size_t fbe_type() noexcept { return FinalModel<::proto::AccountMessage>::fbe_type(); }

    // Check if the struct value is valid
    bool verify();

    // Serialize the struct value
    size_t serialize(const ::proto::AccountMessage& value);
    // Deserialize the struct value
    size_t deserialize(::proto::AccountMessage& value) const noexcept;

    // Move to the next struct value
    void next(size_t prev) noexcept { _model.fbe_shift(prev); }

private:
    FinalModel<::proto::AccountMessage> _model;
};

} // namespace proto

} // namespace FBE
