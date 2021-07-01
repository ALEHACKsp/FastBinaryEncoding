// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.7.0.0

import Foundation
import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding ChronoxorProtoex receiver
open class Receiver: ChronoxorFbe.ReceiverProtocol {
    // Imported receivers
    let ProtoReceiver: ChronoxorProto.Receiver?

    // Receiver values accessors
    private var OrderMessageValue: ChronoxorProtoex.OrderMessage
    private var BalanceMessageValue: ChronoxorProtoex.BalanceMessage
    private var AccountMessageValue: ChronoxorProtoex.AccountMessage

    // Receiver models accessors
    private var OrderMessageModel: OrderMessageModel
    private var BalanceMessageModel: BalanceMessageModel
    private var AccountMessageModel: AccountMessageModel

    public var buffer: Buffer = Buffer()
    public var final: Bool = false

    public init() {
        ProtoReceiver = ChronoxorProto.Receiver(buffer: buffer)
        OrderMessageValue = ChronoxorProtoex.OrderMessage()
        OrderMessageModel = ChronoxorProtoex.OrderMessageModel()
        BalanceMessageValue = ChronoxorProtoex.BalanceMessage()
        BalanceMessageModel = ChronoxorProtoex.BalanceMessageModel()
        AccountMessageValue = ChronoxorProtoex.AccountMessage()
        AccountMessageModel = ChronoxorProtoex.AccountMessageModel()
        build(final: false)
    }

    public init(buffer: ChronoxorFbe.Buffer) {
        ProtoReceiver = ChronoxorProto.Receiver(buffer: buffer)
        OrderMessageValue = ChronoxorProtoex.OrderMessage()
        OrderMessageModel = ChronoxorProtoex.OrderMessageModel()
        BalanceMessageValue = ChronoxorProtoex.BalanceMessage()
        BalanceMessageModel = ChronoxorProtoex.BalanceMessageModel()
        AccountMessageValue = ChronoxorProtoex.AccountMessage()
        AccountMessageModel = ChronoxorProtoex.AccountMessageModel()
        build(with: buffer, final: false)
    }

    open func onReceive(type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        guard let listener = self as? ReceiverListener else { return false }
        return onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: ReceiverListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        switch type {
        case ChronoxorProtoex.OrderMessageModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            OrderMessageModel.attach(buffer: buffer, offset: offset)
            assert(OrderMessageModel.verify(), "Protoex.OrderMessage validation failed!")
            let deserialized = OrderMessageModel.deserialize(value: &OrderMessageValue)
            assert(deserialized > 0, "Protoex.OrderMessage deserialization failed!")

            // Log the value
            if listener.logging {
                let message = OrderMessageValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: OrderMessageValue)
            return true
        case ChronoxorProtoex.BalanceMessageModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            BalanceMessageModel.attach(buffer: buffer, offset: offset)
            assert(BalanceMessageModel.verify(), "Protoex.BalanceMessage validation failed!")
            let deserialized = BalanceMessageModel.deserialize(value: &BalanceMessageValue)
            assert(deserialized > 0, "Protoex.BalanceMessage deserialization failed!")

            // Log the value
            if listener.logging {
                let message = BalanceMessageValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: BalanceMessageValue)
            return true
        case ChronoxorProtoex.AccountMessageModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            AccountMessageModel.attach(buffer: buffer, offset: offset)
            assert(AccountMessageModel.verify(), "Protoex.AccountMessage validation failed!")
            let deserialized = AccountMessageModel.deserialize(value: &AccountMessageValue)
            assert(deserialized > 0, "Protoex.AccountMessage deserialization failed!")

            // Log the value
            if listener.logging {
                let message = AccountMessageValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: AccountMessageValue)
            return true
        default: break
        }

        if let ProtoReceiver = ProtoReceiver, ProtoReceiver.onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size) {
            return true
        }

        return false
    }
}
