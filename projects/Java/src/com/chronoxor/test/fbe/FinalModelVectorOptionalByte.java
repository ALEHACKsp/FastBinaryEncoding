// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.7.0.0

package com.chronoxor.test.fbe;

// Fast Binary Encoding OptionalByte vector final model
public final class FinalModelVectorOptionalByte extends com.chronoxor.fbe.FinalModel
{
    private final FinalModelOptionalByte _model;

    public FinalModelVectorOptionalByte(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
        _model = new FinalModelOptionalByte(buffer, offset);
    }

    // Get the allocation size
    public long fbeAllocationSize(Byte[] values)
    {
        long size = 4;
        for (var value : values)
            size += _model.fbeAllocationSize(value);
        return size;
    }
    public long fbeAllocationSize(java.util.ArrayList<Byte> values)
    {
        long size = 4;
        for (var value : values)
            size += _model.fbeAllocationSize(value);
        return size;
    }
    public long fbeAllocationSize(java.util.LinkedList<Byte> values)
    {
        long size = 4;
        for (var value : values)
            size += _model.fbeAllocationSize(value);
        return size;
    }
    public long fbeAllocationSize(java.util.HashSet<Byte> values)
    {
        long size = 4;
        for (var value : values)
            size += _model.fbeAllocationSize(value);
        return size;
    }

    // Check if the vector is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return Long.MAX_VALUE;

        int fbeVectorSize = readInt32(fbeOffset());

        long size = 4;
        _model.fbeOffset(fbeOffset() + 4);
        for (int i = fbeVectorSize; i-- > 0;)
        {
            long offset = _model.verify();
            if (offset == Long.MAX_VALUE)
                return Long.MAX_VALUE;
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Get the vector as java.util.ArrayList
    public long get(java.util.ArrayList<Byte> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeVectorSize = readInt32(fbeOffset());
        if (fbeVectorSize == 0)
            return 4;

        values.ensureCapacity((int)fbeVectorSize);

        long size = 4;
        var offset = new com.chronoxor.fbe.Size();
        _model.fbeOffset(fbeOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            Byte value = _model.get(offset);
            values.add(value);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Get the vector as java.util.LinkedList
    public long get(java.util.LinkedList<Byte> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeVectorSize = readInt32(fbeOffset());
        if (fbeVectorSize == 0)
            return 4;

        long size = 4;
        var offset = new com.chronoxor.fbe.Size();
        _model.fbeOffset(fbeOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            Byte value = _model.get(offset);
            values.add(value);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Get the vector as java.util.HashSet
    public long get(java.util.HashSet<Byte> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeVectorSize = readInt32(fbeOffset());
        if (fbeVectorSize == 0)
            return 4;

        long size = 4;
        var offset = new com.chronoxor.fbe.Size();
        _model.fbeOffset(fbeOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            Byte value = _model.get(offset);
            values.add(value);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Set the vector as java.util.ArrayList
    public long set(java.util.ArrayList<Byte> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        write(fbeOffset(), (int)values.size());

        long size = 4;
        _model.fbeOffset(fbeOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Set the vector as java.util.LinkedList
    public long set(java.util.LinkedList<Byte> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        write(fbeOffset(), (int)values.size());

        long size = 4;
        _model.fbeOffset(fbeOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Set the vector as java.util.HashSet
    public long set(java.util.HashSet<Byte> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        write(fbeOffset(), (int)values.size());

        long size = 4;
        _model.fbeOffset(fbeOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }
}
