// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.7.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding com.chronoxor.test final receiver
@Suppress("MemberVisibilityCanBePrivate", "PrivatePropertyName", "UNUSED_PARAMETER")
open class FinalReceiver : com.chronoxor.fbe.Receiver, IFinalReceiverListener
{
    // Imported receivers
    var protoReceiver: com.chronoxor.proto.fbe.FinalReceiver

    // Receiver values accessors

    // Receiver models accessors

    constructor() : super(true)
    {
        protoReceiver = com.chronoxor.proto.fbe.FinalReceiver(buffer)
    }

    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer, true)
    {
        protoReceiver = com.chronoxor.proto.fbe.FinalReceiver(buffer)
    }

    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        return onReceiveListener(this, type, buffer, offset, size)
    }

    open fun onReceiveListener(listener: IFinalReceiverListener, type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {

        if (protoReceiver.onReceiveListener(listener, type, buffer, offset, size))
            return true

        return false
    }
}
