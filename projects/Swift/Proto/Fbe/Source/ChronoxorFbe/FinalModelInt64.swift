// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.7.0.0

import Foundation

// Fast Binary Encoding Int64 final model
public class FinalModelInt64: FinalModel {
    public var _buffer = Buffer()
    public var _offset: Int = 0

    public init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset
    }

    // Get the allocation size
    public func fbeAllocationSize(value: Int64) -> Int {
        return fbeSize
    }

    // Field size
    public let fbeSize: Int = 8

    // Check if the value is valid
    public func verify() -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return Int.max
        }

        return fbeSize
    }

    // Get the value
    public func get(size: inout Size) -> Int64 {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return 0
        }

        size.value = fbeSize
        return readInt64(offset: fbeOffset)
    }

    // Set the value
    public func set(value: Int64) throws -> Int {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        write(offset: fbeOffset, value: value)
        return fbeSize
    }
}
