// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.7.0.0

package com.chronoxor.test.fbe;

// Fast Binary Encoding StructHashEx final model
public final class FinalModelStructHashEx extends com.chronoxor.fbe.FinalModel
{
    public final FinalModelMapStructSimpleStructNested f1;
    public final FinalModelMapStructSimpleOptionalStructNested f2;

    public FinalModelStructHashEx(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
        f1 = new FinalModelMapStructSimpleStructNested(buffer, 0);
        f2 = new FinalModelMapStructSimpleOptionalStructNested(buffer, 0);
    }

    // Get the allocation size
    public long fbeAllocationSize(com.chronoxor.test.StructHashEx fbeValue)
    {
        long fbeResult = 0
            + f1.fbeAllocationSize(fbeValue.f1)
            + f2.fbeAllocationSize(fbeValue.f2)
            ;
        return fbeResult;
    }

    // Get the final type
    public static final long fbeTypeConst = 142;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    @Override
    public long verify()
    {
        _buffer.shift(fbeOffset());
        long fbeResult = verifyFields();
        _buffer.unshift(fbeOffset());
        return fbeResult;
    }

    // Check if the struct fields are valid
    public long verifyFields()
    {
        long fbeCurrentOffset = 0;
        long fbeFieldSize = 0;

        f1.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = f1.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f2.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = f2.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        return fbeCurrentOffset;
    }

    // Get the struct value
    public com.chronoxor.test.StructHashEx get(com.chronoxor.fbe.Size fbeSize) { return get(fbeSize, new com.chronoxor.test.StructHashEx()); }
    public com.chronoxor.test.StructHashEx get(com.chronoxor.fbe.Size fbeSize, com.chronoxor.test.StructHashEx fbeValue)
    {
        _buffer.shift(fbeOffset());
        fbeSize.value = getFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeValue;
    }

    // Get the struct fields values
    public long getFields(com.chronoxor.test.StructHashEx fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new com.chronoxor.fbe.Size(0);

        f1.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1.get(fbeValue.f1);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f2.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f2.get(fbeValue.f2);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }

    // Set the struct value
    public long set(com.chronoxor.test.StructHashEx fbeValue)
    {
        _buffer.shift(fbeOffset());
        long fbeSize = setFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeSize;
    }

    // Set the struct fields values
    public long setFields(com.chronoxor.test.StructHashEx fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new com.chronoxor.fbe.Size();

        f1.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1.set(fbeValue.f1);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f2.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f2.set(fbeValue.f2);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }
}
