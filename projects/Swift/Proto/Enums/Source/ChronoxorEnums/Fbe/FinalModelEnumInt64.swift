// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.7.0.0

import ChronoxorFbe

// Fast Binary Encoding EnumInt64 final model
public class FinalModelEnumInt64: FinalModel {

    public var _buffer: Buffer
    public var _offset: Int

    // Final size
    public let fbeSize: Int = 8

    public init(buffer: Buffer = Buffer(), offset: Int = 0) {
        _buffer = buffer
        _offset = offset
    }

    // Get the allocation size
    public func fbeAllocationSize(value: EnumInt64) -> Int { fbeSize }

    public func verify() -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return Int.max
        }

        return fbeSize
    }

    // Get the value
    public func get(size: inout Size) -> EnumInt64 {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return EnumInt64()
        }

        size.value = fbeSize
        return EnumInt64(value: readInt64(offset: fbeOffset))
    }

    // Set the value
    public func set(value: EnumInt64) throws -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        write(offset: fbeOffset, value: value.raw)
        return fbeSize
    }
}
