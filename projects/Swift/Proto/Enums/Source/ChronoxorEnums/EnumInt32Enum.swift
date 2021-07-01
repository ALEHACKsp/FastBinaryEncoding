// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.7.0.0

import Foundation

public enum EnumInt32Enum {
    typealias RawValue = Int32
    case ENUM_VALUE_0
    case ENUM_VALUE_1
    case ENUM_VALUE_2
    case ENUM_VALUE_3
    case ENUM_VALUE_4
    case ENUM_VALUE_5

    var rawValue: RawValue {
        switch self {
        case .ENUM_VALUE_0: return 0 + 0
        case .ENUM_VALUE_1: return -2147483648 + 0
        case .ENUM_VALUE_2: return -2147483648 + 1
        case .ENUM_VALUE_3: return 2147483646 + 0
        case .ENUM_VALUE_4: return 2147483646 + 1
        case .ENUM_VALUE_5: return Self.ENUM_VALUE_3.rawValue
        }
    }

    init(value: Int8) { self = EnumInt32Enum(rawValue: NSNumber(value: value).int32Value) }
    init(value: Int16) { self = EnumInt32Enum(rawValue: NSNumber(value: value).int32Value) }
    init(value: Int32) { self = EnumInt32Enum(rawValue: NSNumber(value: value).int32Value) }
    init(value: Int64) { self = EnumInt32Enum(rawValue: NSNumber(value: value).int32Value) }
    init(value: EnumInt32Enum) { self = EnumInt32Enum(rawValue: value.rawValue) }
    init(rawValue: Int32) { self = Self.mapValue(value: rawValue)! }

    var description: String {
        switch self {
        case .ENUM_VALUE_0: return "ENUM_VALUE_0"
        case .ENUM_VALUE_1: return "ENUM_VALUE_1"
        case .ENUM_VALUE_2: return "ENUM_VALUE_2"
        case .ENUM_VALUE_3: return "ENUM_VALUE_3"
        case .ENUM_VALUE_4: return "ENUM_VALUE_4"
        case .ENUM_VALUE_5: return "ENUM_VALUE_5"
        }
    }

    static let rawValuesMap: [RawValue: EnumInt32Enum] = {
        var value = [RawValue: EnumInt32Enum]()
        value[EnumInt32Enum.ENUM_VALUE_0.rawValue] = .ENUM_VALUE_0
        value[EnumInt32Enum.ENUM_VALUE_1.rawValue] = .ENUM_VALUE_1
        value[EnumInt32Enum.ENUM_VALUE_2.rawValue] = .ENUM_VALUE_2
        value[EnumInt32Enum.ENUM_VALUE_3.rawValue] = .ENUM_VALUE_3
        value[EnumInt32Enum.ENUM_VALUE_4.rawValue] = .ENUM_VALUE_4
        value[EnumInt32Enum.ENUM_VALUE_5.rawValue] = .ENUM_VALUE_5
        return value
    }()

    static func mapValue(value: Int32) -> EnumInt32Enum? {
        return rawValuesMap[value]
    }
}
