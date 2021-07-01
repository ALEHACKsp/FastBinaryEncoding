// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.7.0.0

import ChronoxorFbe
import Foundation

// Fast Binary Encoding ChronoxorProto sender
open class Sender: ChronoxorFbe.SenderProtocol {
    // Sender models accessors
    private let OrderMessageModel: OrderMessageModel
    private let BalanceMessageModel: BalanceMessageModel
    private let AccountMessageModel: AccountMessageModel

    public var buffer: Buffer = Buffer()
    public var final: Bool = false

    public init() {
        OrderMessageModel = ChronoxorProto.OrderMessageModel(buffer: buffer)
        BalanceMessageModel = ChronoxorProto.BalanceMessageModel(buffer: buffer)
        AccountMessageModel = ChronoxorProto.AccountMessageModel(buffer: buffer)
        build(with: false)
    }

    public init(buffer: ChronoxorFbe.Buffer) {
        OrderMessageModel = ChronoxorProto.OrderMessageModel(buffer: buffer)
        BalanceMessageModel = ChronoxorProto.BalanceMessageModel(buffer: buffer)
        AccountMessageModel = ChronoxorProto.AccountMessageModel(buffer: buffer)
        build(with: buffer, final: false)
    }

    public func send(obj: Any) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(obj: obj, listener: listener)
    }

    public func send(obj: Any, listener: ChronoxorFbe.SenderListener) throws -> Int {
        let objType = type(of: obj)
        if objType == ChronoxorProto.OrderMessage.self, let value = obj as? ChronoxorProto.OrderMessage { return try send(value: value, listener: listener) }
        if objType == ChronoxorProto.BalanceMessage.self, let value = obj as? ChronoxorProto.BalanceMessage { return try send(value: value, listener: listener) }
        if objType == ChronoxorProto.AccountMessage.self, let value = obj as? ChronoxorProto.AccountMessage { return try send(value: value, listener: listener) }

        return 0
    }

    public func send(value: ChronoxorProto.OrderMessage) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(value: value, listener: listener)
    }

    public func send(value: ChronoxorProto.OrderMessage, listener: ChronoxorFbe.SenderListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try OrderMessageModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProto.OrderMessage serialization failed!")
        assert(OrderMessageModel.verify(), "ChronoxorProto.OrderMessage validation failed!")

        // Log the value
        if listener.logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(listener: listener, serialized: serialized)
    }

    public func send(value: ChronoxorProto.BalanceMessage) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(value: value, listener: listener)
    }

    public func send(value: ChronoxorProto.BalanceMessage, listener: ChronoxorFbe.SenderListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try BalanceMessageModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProto.BalanceMessage serialization failed!")
        assert(BalanceMessageModel.verify(), "ChronoxorProto.BalanceMessage validation failed!")

        // Log the value
        if listener.logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(listener: listener, serialized: serialized)
    }

    public func send(value: ChronoxorProto.AccountMessage) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(value: value, listener: listener)
    }

    public func send(value: ChronoxorProto.AccountMessage, listener: ChronoxorFbe.SenderListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try AccountMessageModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProto.AccountMessage serialization failed!")
        assert(AccountMessageModel.verify(), "ChronoxorProto.AccountMessage validation failed!")

        // Log the value
        if listener.logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(listener: listener, serialized: serialized)
    }
}
