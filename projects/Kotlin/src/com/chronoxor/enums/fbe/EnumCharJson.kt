// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.7.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.enums.fbe

class EnumCharJson : com.google.gson.JsonSerializer<com.chronoxor.enums.EnumChar>, com.google.gson.JsonDeserializer<com.chronoxor.enums.EnumChar>
{
    override fun serialize(src: com.chronoxor.enums.EnumChar, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.raw)
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext): com.chronoxor.enums.EnumChar
    {
        return com.chronoxor.enums.EnumChar(json.asJsonPrimitive.asByte)
    }
}
