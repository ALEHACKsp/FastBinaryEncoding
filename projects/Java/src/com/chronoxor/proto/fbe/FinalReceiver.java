// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.7.0.0

package com.chronoxor.proto.fbe;

// Fast Binary Encoding com.chronoxor.proto final receiver
public class FinalReceiver extends com.chronoxor.fbe.Receiver
{
    // Receiver values accessors
    private final com.chronoxor.proto.OrderMessage OrderMessageValue;
    private final com.chronoxor.proto.BalanceMessage BalanceMessageValue;
    private final com.chronoxor.proto.AccountMessage AccountMessageValue;

    // Receiver models accessors
    private final OrderMessageFinalModel OrderMessageModel;
    private final BalanceMessageFinalModel BalanceMessageModel;
    private final AccountMessageFinalModel AccountMessageModel;

    public FinalReceiver()
    {
        super(true);
        OrderMessageValue = new com.chronoxor.proto.OrderMessage();
        OrderMessageModel = new OrderMessageFinalModel();
        BalanceMessageValue = new com.chronoxor.proto.BalanceMessage();
        BalanceMessageModel = new BalanceMessageFinalModel();
        AccountMessageValue = new com.chronoxor.proto.AccountMessage();
        AccountMessageModel = new AccountMessageFinalModel();
    }
    public FinalReceiver(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, true);
        OrderMessageValue = new com.chronoxor.proto.OrderMessage();
        OrderMessageModel = new OrderMessageFinalModel();
        BalanceMessageValue = new com.chronoxor.proto.BalanceMessage();
        BalanceMessageModel = new BalanceMessageFinalModel();
        AccountMessageValue = new com.chronoxor.proto.AccountMessage();
        AccountMessageModel = new AccountMessageFinalModel();
    }

    // Receive handlers
    protected void onReceive(com.chronoxor.proto.OrderMessage value) {}
    protected void onReceive(com.chronoxor.proto.BalanceMessage value) {}
    protected void onReceive(com.chronoxor.proto.AccountMessage value) {}

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            case (int)com.chronoxor.proto.fbe.OrderMessageFinalModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                OrderMessageModel.attach(buffer, offset);
                assert OrderMessageModel.verify() : "proto.OrderMessage validation failed!";
                long deserialized = OrderMessageModel.deserialize(OrderMessageValue);
                assert (deserialized > 0) : "proto.OrderMessage deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = OrderMessageValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(OrderMessageValue);
                return true;
            }
            case (int)com.chronoxor.proto.fbe.BalanceMessageFinalModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                BalanceMessageModel.attach(buffer, offset);
                assert BalanceMessageModel.verify() : "proto.BalanceMessage validation failed!";
                long deserialized = BalanceMessageModel.deserialize(BalanceMessageValue);
                assert (deserialized > 0) : "proto.BalanceMessage deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = BalanceMessageValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(BalanceMessageValue);
                return true;
            }
            case (int)com.chronoxor.proto.fbe.AccountMessageFinalModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                AccountMessageModel.attach(buffer, offset);
                assert AccountMessageModel.verify() : "proto.AccountMessage validation failed!";
                long deserialized = AccountMessageModel.deserialize(AccountMessageValue);
                assert (deserialized > 0) : "proto.AccountMessage deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = AccountMessageValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(AccountMessageValue);
                return true;
            }
            default: break;
        }

        return false;
    }
}
