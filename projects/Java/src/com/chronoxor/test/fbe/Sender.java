// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.7.0.0

package com.chronoxor.test.fbe;

// Fast Binary Encoding com.chronoxor.test sender
public class Sender extends com.chronoxor.fbe.Sender
{
    // Imported senders
    public final com.chronoxor.proto.fbe.Sender protoSender;

    // Sender models accessors

    public Sender()
    {
        super(false);
        protoSender = new com.chronoxor.proto.fbe.Sender(getBuffer());
    }
    public Sender(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, false);
        protoSender = new com.chronoxor.proto.fbe.Sender(getBuffer());
    }

    public long send(Object obj)
    {

        // Try to send using imported senders
        long result = 0;
        result = protoSender.send(obj);
        if (result > 0)
            return result;

        return 0;
    }


    // Send message handler
    @Override
    protected long onSend(byte[] buffer, long offset, long size) { throw new UnsupportedOperationException("com.chronoxor.test.fbe.Sender.onSend() not implemented!"); }
}
