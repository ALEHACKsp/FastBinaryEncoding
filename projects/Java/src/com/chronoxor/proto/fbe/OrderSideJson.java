// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.7.0.0

package com.chronoxor.proto.fbe;;

public final class OrderSideJson implements com.google.gson.JsonSerializer<com.chronoxor.proto.OrderSide>, com.google.gson.JsonDeserializer<com.chronoxor.proto.OrderSide>
{
    @Override
    public com.google.gson.JsonElement serialize(com.chronoxor.proto.OrderSide src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context)
    {
        return new com.google.gson.JsonPrimitive(src.getRaw());
    }

    @Override
    public com.chronoxor.proto.OrderSide deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException
    {
        return new com.chronoxor.proto.OrderSide(json.getAsJsonPrimitive().getAsByte());
    }
}
