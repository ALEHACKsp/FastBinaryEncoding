// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.7.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding StructNested field model
@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods", "ReplaceGetOrSet")
class FieldModelStructNested(buffer: com.chronoxor.fbe.Buffer, offset: Long) : com.chronoxor.fbe.FieldModel(buffer, offset)
{
    val parent: FieldModelStructOptional = FieldModelStructOptional(buffer, 4 + 4)
    val f1000: FieldModelEnumSimple = FieldModelEnumSimple(buffer, parent.fbeOffset + parent.fbeBody - 4 - 4)
    val f1001: FieldModelOptionalEnumSimple = FieldModelOptionalEnumSimple(buffer, f1000.fbeOffset + f1000.fbeSize)
    val f1002: FieldModelEnumTyped = FieldModelEnumTyped(buffer, f1001.fbeOffset + f1001.fbeSize)
    val f1003: FieldModelOptionalEnumTyped = FieldModelOptionalEnumTyped(buffer, f1002.fbeOffset + f1002.fbeSize)
    val f1004: FieldModelFlagsSimple = FieldModelFlagsSimple(buffer, f1003.fbeOffset + f1003.fbeSize)
    val f1005: FieldModelOptionalFlagsSimple = FieldModelOptionalFlagsSimple(buffer, f1004.fbeOffset + f1004.fbeSize)
    val f1006: FieldModelFlagsTyped = FieldModelFlagsTyped(buffer, f1005.fbeOffset + f1005.fbeSize)
    val f1007: FieldModelOptionalFlagsTyped = FieldModelOptionalFlagsTyped(buffer, f1006.fbeOffset + f1006.fbeSize)
    val f1008: FieldModelStructSimple = FieldModelStructSimple(buffer, f1007.fbeOffset + f1007.fbeSize)
    val f1009: FieldModelOptionalStructSimple = FieldModelOptionalStructSimple(buffer, f1008.fbeOffset + f1008.fbeSize)
    val f1010: FieldModelStructOptional = FieldModelStructOptional(buffer, f1009.fbeOffset + f1009.fbeSize)
    val f1011: FieldModelOptionalStructOptional = FieldModelOptionalStructOptional(buffer, f1010.fbeOffset + f1010.fbeSize)

    // Field size
    override val fbeSize: Long = 4

    // Field body size
    val fbeBody: Long = (4 + 4
        + parent.fbeBody - 4 - 4
        + f1000.fbeSize
        + f1001.fbeSize
        + f1002.fbeSize
        + f1003.fbeSize
        + f1004.fbeSize
        + f1005.fbeSize
        + f1006.fbeSize
        + f1007.fbeSize
        + f1008.fbeSize
        + f1009.fbeSize
        + f1010.fbeSize
        + f1011.fbeSize
        )

    // Field extra size
    override val fbeExtra: Long get()
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeStructOffset = readUInt32(fbeOffset).toLong()
        if ((fbeStructOffset == 0L) || ((_buffer.offset + fbeStructOffset + 4) > _buffer.size))
            return 0

        _buffer.shift(fbeStructOffset)

        val fbeResult = (fbeBody
            + parent.fbeExtra
            + f1000.fbeExtra
            + f1001.fbeExtra
            + f1002.fbeExtra
            + f1003.fbeExtra
            + f1004.fbeExtra
            + f1005.fbeExtra
            + f1006.fbeExtra
            + f1007.fbeExtra
            + f1008.fbeExtra
            + f1009.fbeExtra
            + f1010.fbeExtra
            + f1011.fbeExtra
            )

        _buffer.unshift(fbeStructOffset)

        return fbeResult
    }

    // Field type
    var fbeType: Long = fbeTypeConst

    companion object
    {
        const val fbeTypeConst: Long = 112
    }

    // Check if the struct value is valid
    fun verify(fbeVerifyType: Boolean = true): Boolean
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return true

        val fbeStructOffset = readUInt32(fbeOffset).toLong()
        if ((fbeStructOffset == 0L) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size))
            return false

        val fbeStructSize = readUInt32(fbeStructOffset).toLong()
        if (fbeStructSize < (4 + 4))
            return false

        val fbeStructType = readUInt32(fbeStructOffset + 4).toLong()
        if (fbeVerifyType && (fbeStructType != fbeType))
            return false

        _buffer.shift(fbeStructOffset)
        val fbeResult = verifyFields(fbeStructSize)
        _buffer.unshift(fbeStructOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    @Suppress("UNUSED_PARAMETER")
    fun verifyFields(fbeStructSize: Long): Boolean
    {
        var fbeCurrentSize = 4L + 4L

        if ((fbeCurrentSize + parent.fbeBody - 4 - 4) > fbeStructSize)
            return true
        if (!parent.verifyFields(fbeStructSize))
            return false
        fbeCurrentSize += parent.fbeBody - 4 - 4

        if ((fbeCurrentSize + f1000.fbeSize) > fbeStructSize)
            return true
        if (!f1000.verify())
            return false
        fbeCurrentSize += f1000.fbeSize

        if ((fbeCurrentSize + f1001.fbeSize) > fbeStructSize)
            return true
        if (!f1001.verify())
            return false
        fbeCurrentSize += f1001.fbeSize

        if ((fbeCurrentSize + f1002.fbeSize) > fbeStructSize)
            return true
        if (!f1002.verify())
            return false
        fbeCurrentSize += f1002.fbeSize

        if ((fbeCurrentSize + f1003.fbeSize) > fbeStructSize)
            return true
        if (!f1003.verify())
            return false
        fbeCurrentSize += f1003.fbeSize

        if ((fbeCurrentSize + f1004.fbeSize) > fbeStructSize)
            return true
        if (!f1004.verify())
            return false
        fbeCurrentSize += f1004.fbeSize

        if ((fbeCurrentSize + f1005.fbeSize) > fbeStructSize)
            return true
        if (!f1005.verify())
            return false
        fbeCurrentSize += f1005.fbeSize

        if ((fbeCurrentSize + f1006.fbeSize) > fbeStructSize)
            return true
        if (!f1006.verify())
            return false
        fbeCurrentSize += f1006.fbeSize

        if ((fbeCurrentSize + f1007.fbeSize) > fbeStructSize)
            return true
        if (!f1007.verify())
            return false
        fbeCurrentSize += f1007.fbeSize

        if ((fbeCurrentSize + f1008.fbeSize) > fbeStructSize)
            return true
        if (!f1008.verify())
            return false
        fbeCurrentSize += f1008.fbeSize

        if ((fbeCurrentSize + f1009.fbeSize) > fbeStructSize)
            return true
        if (!f1009.verify())
            return false
        fbeCurrentSize += f1009.fbeSize

        if ((fbeCurrentSize + f1010.fbeSize) > fbeStructSize)
            return true
        if (!f1010.verify())
            return false
        fbeCurrentSize += f1010.fbeSize

        if ((fbeCurrentSize + f1011.fbeSize) > fbeStructSize)
            return true
        if (!f1011.verify())
            return false
        fbeCurrentSize += f1011.fbeSize

        return true
    }

    // Get the struct value (begin phase)
    fun getBegin(): Long
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeStructOffset = readUInt32(fbeOffset).toLong()
        assert((fbeStructOffset > 0) && ((_buffer.offset + fbeStructOffset + 4 + 4) <= _buffer.size)) { "Model is broken!" }
        if ((fbeStructOffset == 0L) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size))
            return 0

        val fbeStructSize = readUInt32(fbeStructOffset).toLong()
        assert(fbeStructSize >= (4 + 4)) { "Model is broken!" }
        if (fbeStructSize < (4 + 4))
            return 0

        _buffer.shift(fbeStructOffset)
        return fbeStructOffset
    }

    // Get the struct value (end phase)
    fun getEnd(fbeBegin: Long)
    {
        _buffer.unshift(fbeBegin)
    }

    // Get the struct value
    fun get(fbeValue: com.chronoxor.test.StructNested = com.chronoxor.test.StructNested()): com.chronoxor.test.StructNested
    {
        val fbeBegin = getBegin()
        if (fbeBegin == 0L)
            return fbeValue

        val fbeStructSize = readUInt32(0).toLong()
        getFields(fbeValue, fbeStructSize)
        getEnd(fbeBegin)
        return fbeValue
    }

    // Get the struct fields values
    @Suppress("UNUSED_PARAMETER")
    fun getFields(fbeValue: com.chronoxor.test.StructNested, fbeStructSize: Long)
    {
        var fbeCurrentSize = 4L + 4L

        if ((fbeCurrentSize + parent.fbeBody - 4 - 4) <= fbeStructSize)
            parent.getFields(fbeValue, fbeStructSize)
        fbeCurrentSize += parent.fbeBody - 4 - 4

        if ((fbeCurrentSize + f1000.fbeSize) <= fbeStructSize)
            fbeValue.f1000 = f1000.get()
        else
            fbeValue.f1000 = com.chronoxor.test.EnumSimple()
        fbeCurrentSize += f1000.fbeSize

        if ((fbeCurrentSize + f1001.fbeSize) <= fbeStructSize)
            fbeValue.f1001 = f1001.get()
        else
            fbeValue.f1001 = null
        fbeCurrentSize += f1001.fbeSize

        if ((fbeCurrentSize + f1002.fbeSize) <= fbeStructSize)
            fbeValue.f1002 = f1002.get(com.chronoxor.test.EnumTyped.ENUM_VALUE_2)
        else
            fbeValue.f1002 = com.chronoxor.test.EnumTyped.ENUM_VALUE_2
        fbeCurrentSize += f1002.fbeSize

        if ((fbeCurrentSize + f1003.fbeSize) <= fbeStructSize)
            fbeValue.f1003 = f1003.get(null)
        else
            fbeValue.f1003 = null
        fbeCurrentSize += f1003.fbeSize

        if ((fbeCurrentSize + f1004.fbeSize) <= fbeStructSize)
            fbeValue.f1004 = f1004.get()
        else
            fbeValue.f1004 = com.chronoxor.test.FlagsSimple()
        fbeCurrentSize += f1004.fbeSize

        if ((fbeCurrentSize + f1005.fbeSize) <= fbeStructSize)
            fbeValue.f1005 = f1005.get()
        else
            fbeValue.f1005 = null
        fbeCurrentSize += f1005.fbeSize

        if ((fbeCurrentSize + f1006.fbeSize) <= fbeStructSize)
            fbeValue.f1006 = f1006.get(com.chronoxor.test.FlagsTyped.fromSet(java.util.EnumSet.of(com.chronoxor.test.FlagsTyped.FLAG_VALUE_2.value, com.chronoxor.test.FlagsTyped.FLAG_VALUE_4.value, com.chronoxor.test.FlagsTyped.FLAG_VALUE_6.value)))
        else
            fbeValue.f1006 = com.chronoxor.test.FlagsTyped.fromSet(java.util.EnumSet.of(com.chronoxor.test.FlagsTyped.FLAG_VALUE_2.value, com.chronoxor.test.FlagsTyped.FLAG_VALUE_4.value, com.chronoxor.test.FlagsTyped.FLAG_VALUE_6.value))
        fbeCurrentSize += f1006.fbeSize

        if ((fbeCurrentSize + f1007.fbeSize) <= fbeStructSize)
            fbeValue.f1007 = f1007.get(null)
        else
            fbeValue.f1007 = null
        fbeCurrentSize += f1007.fbeSize

        if ((fbeCurrentSize + f1008.fbeSize) <= fbeStructSize)
            fbeValue.f1008 = f1008.get()
        else
            fbeValue.f1008 = com.chronoxor.test.StructSimple()
        fbeCurrentSize += f1008.fbeSize

        if ((fbeCurrentSize + f1009.fbeSize) <= fbeStructSize)
            fbeValue.f1009 = f1009.get()
        else
            fbeValue.f1009 = null
        fbeCurrentSize += f1009.fbeSize

        if ((fbeCurrentSize + f1010.fbeSize) <= fbeStructSize)
            fbeValue.f1010 = f1010.get()
        else
            fbeValue.f1010 = com.chronoxor.test.StructOptional()
        fbeCurrentSize += f1010.fbeSize

        if ((fbeCurrentSize + f1011.fbeSize) <= fbeStructSize)
            fbeValue.f1011 = f1011.get(null)
        else
            fbeValue.f1011 = null
        fbeCurrentSize += f1011.fbeSize
    }

    // Set the struct value (begin phase)
    fun setBegin(): Long
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeStructSize = fbeBody
        val fbeStructOffset = _buffer.allocate(fbeStructSize) - _buffer.offset
        assert((fbeStructOffset > 0) && ((_buffer.offset + fbeStructOffset + fbeStructSize) <= _buffer.size)) { "Model is broken!" }
        if ((fbeStructOffset <= 0) || ((_buffer.offset + fbeStructOffset + fbeStructSize) > _buffer.size))
            return 0

        write(fbeOffset, fbeStructOffset.toUInt())
        write(fbeStructOffset, fbeStructSize.toUInt())
        write(fbeStructOffset + 4, fbeType.toUInt())

        _buffer.shift(fbeStructOffset)
        return fbeStructOffset
    }

    // Set the struct value (end phase)
    fun setEnd(fbeBegin: Long)
    {
        _buffer.unshift(fbeBegin)
    }

    // Set the struct value
    fun set(fbeValue: com.chronoxor.test.StructNested)
    {
        val fbeBegin = setBegin()
        if (fbeBegin == 0L)
            return

        setFields(fbeValue)
        setEnd(fbeBegin)
    }

    // Set the struct fields values
    @Suppress("UNUSED_PARAMETER")
    fun setFields(fbeValue: com.chronoxor.test.StructNested)
    {
        parent.setFields(fbeValue)
        f1000.set(fbeValue.f1000)
        f1001.set(fbeValue.f1001)
        f1002.set(fbeValue.f1002)
        f1003.set(fbeValue.f1003)
        f1004.set(fbeValue.f1004)
        f1005.set(fbeValue.f1005)
        f1006.set(fbeValue.f1006)
        f1007.set(fbeValue.f1007)
        f1008.set(fbeValue.f1008)
        f1009.set(fbeValue.f1009)
        f1010.set(fbeValue.f1010)
        f1011.set(fbeValue.f1011)
    }
}
