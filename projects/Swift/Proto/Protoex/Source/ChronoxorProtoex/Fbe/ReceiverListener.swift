// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.7.0.0

import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding Protoex receiver listener
public protocol ReceiverListener: ChronoxorProto.ReceiverListener {
    func onReceive(value: ChronoxorProtoex.OrderMessage)
    func onReceive(value: ChronoxorProtoex.BalanceMessage)
    func onReceive(value: ChronoxorProtoex.AccountMessage)
}

public extension ReceiverListener {
    func onReceive(value: ChronoxorProtoex.OrderMessage) {}
    func onReceive(value: ChronoxorProtoex.BalanceMessage) {}
    func onReceive(value: ChronoxorProtoex.AccountMessage) {}
}
