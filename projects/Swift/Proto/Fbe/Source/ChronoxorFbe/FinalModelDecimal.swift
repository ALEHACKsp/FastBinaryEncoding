// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.7.0.0

import Foundation

// Fast Binary Encoding decimal final model
public class FinalModelDecimal: FinalModel {
    public var _buffer = Buffer()
    public var _offset: Int = 0

    // Field size
    public let fbeSize: Int = 16

    public init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset
    }

    public func fbeAllocationSize(value: Decimal) -> Int {
        return fbeSize
    }

    public func verify() -> Int {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return Int.max
        }

        return fbeSize
    }

    // Get the value
    public func get(size: inout Size) -> Decimal {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return Decimal.zero
        }

        let lowScaleField = Decimal(string: "18446744073709551616")!
        let midScaleField = Decimal(string: "4294967296")!

        let flags = readUInt32(offset: fbeOffset + 12)
        let negative = (flags & 0x80000000) != 0
        let scale = -Int((flags & 0x7FFFFFFF) >> 16)
        let sign: FloatingPointSign = negative ? .minus : .plus

        var result = Decimal(readUInt32(offset: fbeOffset + 8)) * lowScaleField
        result += Decimal(readUInt32(offset: fbeOffset + 4)) * midScaleField
        result += Decimal(readUInt32(offset: fbeOffset + 0))
        result = Decimal(sign: sign, exponent: scale, significand: result)

        if result.exponent != scale {
            var zero = Decimal(sign: sign, exponent: scale, significand: .zero)
            NSDecimalNormalize(&result, &zero, .up)
        }

        size.value = fbeSize
        return result
    }

    // Set the value
    public func set(value: Decimal) throws -> Int {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        var valueRef = value
        if valueRef.exponent > 0 {
            // Try to normalize decimal number for .NET Decimal format
            var zero = Decimal.zero
            let error = NSDecimalNormalize(&valueRef, &zero, .up)
            if error != .noError {
                // Issue during normalize decimal number
                write(offset: fbeOffset, value: UInt8.zero, valueCount: fbeSize)
                return 0
            }
        }

        // Get scale
        let scale = UInt8(abs(valueRef.exponent))
        if scale < 0 || scale > 28 {
            // Value scale exceeds .NET Decimal limit of [0, 28]
            write(offset: fbeOffset, value: UInt8.zero, valueCount: fbeSize)
            return 0
        }

        // Get byte array
        let unscaledBytes = withUnsafeBytes(of: valueRef) {
            Array($0)
        }

        // Write unscaled value to bytes 0-11
        var index = 0
        let straterIndex = unscaledBytes.count - min(unscaledBytes.count, 16)
        let bytes = Array(unscaledBytes[straterIndex..<min(unscaledBytes.count, 16)])
        while index < 12 {
            write(offset: fbeOffset + index, value: bytes[index])
            index += 1
        }

        // Fill remaining bytes with zeros
        while index < 14 {
            write(offset: fbeOffset + index, value: Int8.zero)
            index += 1
        }

        // Write scale at byte 14
        write(offset: fbeOffset + 14, value: scale)

        // Write signum at byte 15
        write(offset: fbeOffset + 15, value: UInt8(value.isSignMinus ? 128: 0))
        return fbeSize
    }
}
