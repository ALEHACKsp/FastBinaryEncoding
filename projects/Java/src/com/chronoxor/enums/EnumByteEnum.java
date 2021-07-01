// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.7.0.0

package com.chronoxor.enums;

public enum EnumByteEnum
{
    ENUM_VALUE_0((byte)0 + 0)
    , ENUM_VALUE_1((byte)0 + 0)
    , ENUM_VALUE_2((byte)0 + 1)
    , ENUM_VALUE_3((byte)254 + 0)
    , ENUM_VALUE_4((byte)254 + 1)
    , ENUM_VALUE_5(ENUM_VALUE_3.getRaw())
    ;

    private byte value;

    EnumByteEnum(byte value) { this.value = value; }
    EnumByteEnum(int value) { this.value = (byte)value; }
    EnumByteEnum(EnumByteEnum value) { this.value = value.value; }

    public byte getRaw() { return value; }

    public static EnumByteEnum mapValue(byte value) { return mapping.get(value); }

    @Override
    public String toString()
    {
        if (this == ENUM_VALUE_0) return "ENUM_VALUE_0";
        if (this == ENUM_VALUE_1) return "ENUM_VALUE_1";
        if (this == ENUM_VALUE_2) return "ENUM_VALUE_2";
        if (this == ENUM_VALUE_3) return "ENUM_VALUE_3";
        if (this == ENUM_VALUE_4) return "ENUM_VALUE_4";
        if (this == ENUM_VALUE_5) return "ENUM_VALUE_5";
        return "<unknown>";
    }

    private static final java.util.Map<Byte, EnumByteEnum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : EnumByteEnum.values())
            mapping.put(value.value, value);
    }
}
