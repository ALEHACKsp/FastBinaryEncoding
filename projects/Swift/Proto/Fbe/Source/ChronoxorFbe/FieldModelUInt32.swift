// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.7.0.0

import Foundation

// Fast Binary Encoding UInt32 field model
public class FieldModelUInt32: FieldModel {
    public var _buffer = Buffer()
    public var _offset: Int = 0

    // Field size
    public let fbeSize: Int = 4

    public required init() {
        _buffer = Buffer()
        _offset = 0
    }

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset
    }

    // Get the value
    public func get(defaults: UInt32 = 0) -> UInt32 {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return defaults
        }

        return readUInt32(offset: fbeOffset)
    }

    // Set the value
    public func set(value: UInt32) throws {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return
        }

        write(offset: fbeOffset, value: value)
    }
}
