// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.7.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.proto.fbe

// Fast Binary Encoding com.chronoxor.proto sender
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class Sender : com.chronoxor.fbe.Sender, ISenderListener
{
    // Sender models accessors
    val OrderMessageModel: OrderMessageModel
    val BalanceMessageModel: BalanceMessageModel
    val AccountMessageModel: AccountMessageModel

    constructor() : super(false)
    {
        OrderMessageModel = OrderMessageModel(buffer)
        BalanceMessageModel = BalanceMessageModel(buffer)
        AccountMessageModel = AccountMessageModel(buffer)
    }

    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer, false)
    {
        OrderMessageModel = OrderMessageModel(buffer)
        BalanceMessageModel = BalanceMessageModel(buffer)
        AccountMessageModel = AccountMessageModel(buffer)
    }

    fun send(obj: Any): Long
    {
        return sendListener(this, obj)
    }

    @Suppress("JoinDeclarationAndAssignment", "UNUSED_PARAMETER")
    fun sendListener(listener: ISenderListener, obj: Any): Long
    {
        when (obj)
        {
            is com.chronoxor.proto.OrderMessage -> if (obj.fbeType == OrderMessageModel.fbeType) return sendListener(listener, obj)
            is com.chronoxor.proto.BalanceMessage -> if (obj.fbeType == BalanceMessageModel.fbeType) return sendListener(listener, obj)
            is com.chronoxor.proto.AccountMessage -> if (obj.fbeType == AccountMessageModel.fbeType) return sendListener(listener, obj)
        }

        return 0
    }

    fun send(value: com.chronoxor.proto.OrderMessage): Long
    {
        return sendListener(this, value)
    }

    fun sendListener(listener: ISenderListener, value: com.chronoxor.proto.OrderMessage): Long
    {
        // Serialize the value into the FBE stream
        val serialized = OrderMessageModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.proto.OrderMessage serialization failed!" }
        assert(OrderMessageModel.verify()) { "com.chronoxor.proto.OrderMessage validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            listener.onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(listener, serialized)
    }
    fun send(value: com.chronoxor.proto.BalanceMessage): Long
    {
        return sendListener(this, value)
    }

    fun sendListener(listener: ISenderListener, value: com.chronoxor.proto.BalanceMessage): Long
    {
        // Serialize the value into the FBE stream
        val serialized = BalanceMessageModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.proto.BalanceMessage serialization failed!" }
        assert(BalanceMessageModel.verify()) { "com.chronoxor.proto.BalanceMessage validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            listener.onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(listener, serialized)
    }
    fun send(value: com.chronoxor.proto.AccountMessage): Long
    {
        return sendListener(this, value)
    }

    fun sendListener(listener: ISenderListener, value: com.chronoxor.proto.AccountMessage): Long
    {
        // Serialize the value into the FBE stream
        val serialized = AccountMessageModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.proto.AccountMessage serialization failed!" }
        assert(AccountMessageModel.verify()) { "com.chronoxor.proto.AccountMessage validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            listener.onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(listener, serialized)
    }
}
