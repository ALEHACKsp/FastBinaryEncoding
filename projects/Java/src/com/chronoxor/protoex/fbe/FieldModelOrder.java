// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.7.0.0

package com.chronoxor.protoex.fbe;

// Fast Binary Encoding Order field model
public final class FieldModelOrder extends com.chronoxor.fbe.FieldModel
{
    public final com.chronoxor.fbe.FieldModelInt32 id;
    public final com.chronoxor.fbe.FieldModelString symbol;
    public final FieldModelOrderSide side;
    public final FieldModelOrderType type;
    public final com.chronoxor.fbe.FieldModelDouble price;
    public final com.chronoxor.fbe.FieldModelDouble volume;
    public final com.chronoxor.fbe.FieldModelDouble tp;
    public final com.chronoxor.fbe.FieldModelDouble sl;

    public FieldModelOrder(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
        id = new com.chronoxor.fbe.FieldModelInt32(buffer, 4 + 4);
        symbol = new com.chronoxor.fbe.FieldModelString(buffer, id.fbeOffset() + id.fbeSize());
        side = new FieldModelOrderSide(buffer, symbol.fbeOffset() + symbol.fbeSize());
        type = new FieldModelOrderType(buffer, side.fbeOffset() + side.fbeSize());
        price = new com.chronoxor.fbe.FieldModelDouble(buffer, type.fbeOffset() + type.fbeSize());
        volume = new com.chronoxor.fbe.FieldModelDouble(buffer, price.fbeOffset() + price.fbeSize());
        tp = new com.chronoxor.fbe.FieldModelDouble(buffer, volume.fbeOffset() + volume.fbeSize());
        sl = new com.chronoxor.fbe.FieldModelDouble(buffer, tp.fbeOffset() + tp.fbeSize());
    }

    // Get the field size
    @Override
    public long fbeSize() { return 4; }
    // Get the field body size
    public long fbeBody()
    {
        long fbeResult = 4 + 4
            + id.fbeSize()
            + symbol.fbeSize()
            + side.fbeSize()
            + type.fbeSize()
            + price.fbeSize()
            + volume.fbeSize()
            + tp.fbeSize()
            + sl.fbeSize()
            ;
        return fbeResult;
    }
    // Get the field extra size
    @Override
    public long fbeExtra()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(fbeOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4) > _buffer.getSize()))
            return 0;

        _buffer.shift(fbeStructOffset);

        long fbeResult = fbeBody()
            + id.fbeExtra()
            + symbol.fbeExtra()
            + side.fbeExtra()
            + type.fbeExtra()
            + price.fbeExtra()
            + volume.fbeExtra()
            + tp.fbeExtra()
            + sl.fbeExtra()
            ;

        _buffer.unshift(fbeStructOffset);

        return fbeResult;
    }
    // Get the field type
    public static final long fbeTypeConst = 1;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    @Override
    public boolean verify() { return verify(true); }
    public boolean verify(boolean fbeVerifyType)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return true;

        int fbeStructOffset = readInt32(fbeOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return false;

        int fbeStructSize = readInt32(fbeStructOffset);
        if (fbeStructSize < (4 + 4))
            return false;

        int fbeStructType = readInt32(fbeStructOffset + 4);
        if (fbeVerifyType && (fbeStructType != fbeType()))
            return false;

        _buffer.shift(fbeStructOffset);
        boolean fbeResult = verifyFields(fbeStructSize);
        _buffer.unshift(fbeStructOffset);
        return fbeResult;
    }

    // Check if the struct fields are valid
    public boolean verifyFields(long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + id.fbeSize()) > fbeStructSize)
            return true;
        if (!id.verify())
            return false;
        fbeCurrentSize += id.fbeSize();

        if ((fbeCurrentSize + symbol.fbeSize()) > fbeStructSize)
            return true;
        if (!symbol.verify())
            return false;
        fbeCurrentSize += symbol.fbeSize();

        if ((fbeCurrentSize + side.fbeSize()) > fbeStructSize)
            return true;
        if (!side.verify())
            return false;
        fbeCurrentSize += side.fbeSize();

        if ((fbeCurrentSize + type.fbeSize()) > fbeStructSize)
            return true;
        if (!type.verify())
            return false;
        fbeCurrentSize += type.fbeSize();

        if ((fbeCurrentSize + price.fbeSize()) > fbeStructSize)
            return true;
        if (!price.verify())
            return false;
        fbeCurrentSize += price.fbeSize();

        if ((fbeCurrentSize + volume.fbeSize()) > fbeStructSize)
            return true;
        if (!volume.verify())
            return false;
        fbeCurrentSize += volume.fbeSize();

        if ((fbeCurrentSize + tp.fbeSize()) > fbeStructSize)
            return true;
        if (!tp.verify())
            return false;
        fbeCurrentSize += tp.fbeSize();

        if ((fbeCurrentSize + sl.fbeSize()) > fbeStructSize)
            return true;
        if (!sl.verify())
            return false;
        fbeCurrentSize += sl.fbeSize();

        return true;
    }

    // Get the struct value (begin phase)
    public long getBegin()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(fbeOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + 4 + 4) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return 0;

        int fbeStructSize = readInt32(fbeStructOffset);
        assert (fbeStructSize >= (4 + 4)) : "Model is broken!";
        if (fbeStructSize < (4 + 4))
            return 0;

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Get the struct value (end phase)
    public void getEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Get the struct value
    public com.chronoxor.protoex.Order get() { return get(new com.chronoxor.protoex.Order()); }
    public com.chronoxor.protoex.Order get(com.chronoxor.protoex.Order fbeValue)
    {
        long fbeBegin = getBegin();
        if (fbeBegin == 0)
            return fbeValue;

        int fbeStructSize = readInt32(0);
        getFields(fbeValue, fbeStructSize);
        getEnd(fbeBegin);
        return fbeValue;
    }

    // Get the struct fields values
    public void getFields(com.chronoxor.protoex.Order fbeValue, long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + id.fbeSize()) <= fbeStructSize)
            fbeValue.id = id.get();
        else
            fbeValue.id = 0;
        fbeCurrentSize += id.fbeSize();

        if ((fbeCurrentSize + symbol.fbeSize()) <= fbeStructSize)
            fbeValue.symbol = symbol.get();
        else
            fbeValue.symbol = "";
        fbeCurrentSize += symbol.fbeSize();

        if ((fbeCurrentSize + side.fbeSize()) <= fbeStructSize)
            fbeValue.side = side.get();
        else
            fbeValue.side = new com.chronoxor.protoex.OrderSide();
        fbeCurrentSize += side.fbeSize();

        if ((fbeCurrentSize + type.fbeSize()) <= fbeStructSize)
            fbeValue.type = type.get();
        else
            fbeValue.type = new com.chronoxor.protoex.OrderType();
        fbeCurrentSize += type.fbeSize();

        if ((fbeCurrentSize + price.fbeSize()) <= fbeStructSize)
            fbeValue.price = price.get((double)0.0d);
        else
            fbeValue.price = (double)0.0d;
        fbeCurrentSize += price.fbeSize();

        if ((fbeCurrentSize + volume.fbeSize()) <= fbeStructSize)
            fbeValue.volume = volume.get((double)0.0d);
        else
            fbeValue.volume = (double)0.0d;
        fbeCurrentSize += volume.fbeSize();

        if ((fbeCurrentSize + tp.fbeSize()) <= fbeStructSize)
            fbeValue.tp = tp.get((double)10.0d);
        else
            fbeValue.tp = (double)10.0d;
        fbeCurrentSize += tp.fbeSize();

        if ((fbeCurrentSize + sl.fbeSize()) <= fbeStructSize)
            fbeValue.sl = sl.get((double)-10.0d);
        else
            fbeValue.sl = (double)-10.0d;
        fbeCurrentSize += sl.fbeSize();
    }

    // Set the struct value (begin phase)
    public long setBegin()
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructSize = (int)fbeBody();
        int fbeStructOffset = (int)(_buffer.allocate(fbeStructSize) - _buffer.getOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset <= 0) || ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) > _buffer.getSize()))
            return 0;

        write(fbeOffset(), fbeStructOffset);
        write(fbeStructOffset, fbeStructSize);
        write(fbeStructOffset + 4, (int)fbeType());

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Set the struct value (end phase)
    public void setEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Set the struct value
    public void set(com.chronoxor.protoex.Order fbeValue)
    {
        long fbeBegin = setBegin();
        if (fbeBegin == 0)
            return;

        setFields(fbeValue);
        setEnd(fbeBegin);
    }

    // Set the struct fields values
    public void setFields(com.chronoxor.protoex.Order fbeValue)
    {
        id.set(fbeValue.id);
        symbol.set(fbeValue.symbol);
        side.set(fbeValue.side);
        type.set(fbeValue.type);
        price.set(fbeValue.price);
        volume.set(fbeValue.volume);
        tp.set(fbeValue.tp);
        sl.set(fbeValue.sl);
    }
}
