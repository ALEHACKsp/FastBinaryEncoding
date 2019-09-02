// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.3.0.0

package com.chronoxor.fbe;

// Fast Binary Encoding base sender
public abstract class Sender
{
    private Buffer _buffer;
    private boolean _logging;
    private boolean _final;

    // Get the bytes buffer
    public Buffer getBuffer() { return _buffer; }

    // Get the final protocol flag
    public boolean getFinal() { return _final; }

    // Get the logging flag
    public boolean getLogging() { return _logging; }
    // Enable/Disable logging
    public void setLogging(boolean enable) { _logging = enable; }

    protected Sender(boolean finalProto) { _buffer = new Buffer(); _final = finalProto; }
    protected Sender(Buffer buffer, boolean finalProto) { _buffer = buffer; _final = finalProto; }

    // Reset the sender buffer
    public void reset() { _buffer.reset(); }

    // Send serialized buffer.
    // Direct call of the method requires knowledge about internals of FBE models serialization.
    // Use it with care!
    public long sendSerialized(long serialized)
    {
        assert (serialized > 0) : "Invalid size of the serialized buffer!";
        if (serialized <= 0)
            return 0;

        // Shift the send buffer
        _buffer.shift(serialized);

        // Send the value
        long sent = onSend(_buffer.getData(), 0, _buffer.getSize());
        _buffer.remove(0, sent);
        return sent;
    }

    // Send message handler
    protected abstract long onSend(byte[] buffer, long offset, long size);
    // Send log message handler
    protected void onSendLog(String message) {}
}