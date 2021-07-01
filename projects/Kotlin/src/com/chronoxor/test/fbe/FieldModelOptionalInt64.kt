// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.7.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding optional Int64 field model
class FieldModelOptionalInt64(buffer: com.chronoxor.fbe.Buffer, offset: Long) : com.chronoxor.fbe.FieldModel(buffer, offset)
{
    // Field size
    override val fbeSize: Long = 1 + 4

    // Field extra size
    override val fbeExtra: Long get()
    {
        if (!hasValue())
            return 0

        val fbeOptionalOffset = readUInt32(fbeOffset + 1).toLong()
        if ((fbeOptionalOffset == 0L) || ((_buffer.offset + fbeOptionalOffset + 4) > _buffer.size))
            return 0

        _buffer.shift(fbeOptionalOffset)
        val fbeResult = value.fbeSize + value.fbeExtra
        _buffer.unshift(fbeOptionalOffset)
        return fbeResult
    }

    // Checks if the object contains a value
    fun hasValue(): Boolean
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return false

        val fbeHasValue = readInt8(fbeOffset).toInt()
        return fbeHasValue != 0
    }

    // Base field model value
    val value = com.chronoxor.fbe.FieldModelInt64(buffer, 0)

    // Check if the optional value is valid
    override fun verify(): Boolean
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return true

        val fbeHasValue = readInt8(fbeOffset).toInt()
        if (fbeHasValue == 0)
            return true

        val fbeOptionalOffset = readUInt32(fbeOffset + 1).toLong()
        if (fbeOptionalOffset == 0L)
            return false

        _buffer.shift(fbeOptionalOffset)
        val fbeResult = value.verify()
        _buffer.unshift(fbeOptionalOffset)
        return fbeResult
    }

    // Get the optional value (being phase)
    fun getBegin(): Long
    {
        if (!hasValue())
            return 0

        val fbeOptionalOffset = readUInt32(fbeOffset + 1).toLong()
        assert(fbeOptionalOffset > 0) { "Model is broken!" }
        if (fbeOptionalOffset <= 0)
            return 0

        _buffer.shift(fbeOptionalOffset)
        return fbeOptionalOffset
    }

    // Get the optional value (end phase)
    fun getEnd(fbeBegin: Long)
    {
        _buffer.unshift(fbeBegin)
    }

    // Get the optional value
    fun get(defaults: Long? = null): Long?
    {
        val fbeBegin = getBegin()
        if (fbeBegin == 0L)
            return defaults

        val optional = value.get()
        getEnd(fbeBegin)
        return optional
    }

    // Set the optional value (begin phase)
    fun setBegin(hasValue: Boolean): Long
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return 0

        val fbeHasValue = if (hasValue) 1 else 0
        write(fbeOffset, fbeHasValue.toByte())
        if (fbeHasValue == 0)
            return 0

        val fbeOptionalSize = value.fbeSize
        val fbeOptionalOffset = _buffer.allocate(fbeOptionalSize) - _buffer.offset
        assert((fbeOptionalOffset > 0) && ((_buffer.offset + fbeOptionalOffset + fbeOptionalSize) <= _buffer.size)) { "Model is broken!" }
        if ((fbeOptionalOffset <= 0) || ((_buffer.offset + fbeOptionalOffset + fbeOptionalSize) > _buffer.size))
            return 0

        write(fbeOffset + 1, fbeOptionalOffset.toUInt())

        _buffer.shift(fbeOptionalOffset)
        return fbeOptionalOffset
    }

    // Set the optional value (end phase)
    fun setEnd(fbeBegin: Long)
    {
        _buffer.unshift(fbeBegin)
    }

    // Set the optional value
    fun set(optional: Long?)
    {
        val fbeBegin = setBegin(optional != null)
        if (fbeBegin == 0L)
            return

        value.set(optional!!)
        setEnd(fbeBegin)
    }
}
