// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.7.0.0

#pragma once

#if defined(__clang__)
#pragma clang system_header
#elif defined(__GNUC__)
#pragma GCC system_header
#elif defined(_MSC_VER)
#pragma system_header
#endif

#include "fbe_models.h"

#include "enums.h"

namespace FBE {

// Fast Binary Encoding ::enums::EnumByte field model
template <>
class FieldModel<::enums::EnumByte> : public FieldModelBase<::enums::EnumByte, uint8_t>
{
public:
    using FieldModelBase<::enums::EnumByte, uint8_t>::FieldModelBase;
};

// Fast Binary Encoding ::enums::EnumChar field model
template <>
class FieldModel<::enums::EnumChar> : public FieldModelBase<::enums::EnumChar, uint8_t>
{
public:
    using FieldModelBase<::enums::EnumChar, uint8_t>::FieldModelBase;
};

// Fast Binary Encoding ::enums::EnumWChar field model
template <>
class FieldModel<::enums::EnumWChar> : public FieldModelBase<::enums::EnumWChar, uint32_t>
{
public:
    using FieldModelBase<::enums::EnumWChar, uint32_t>::FieldModelBase;
};

// Fast Binary Encoding ::enums::EnumInt8 field model
template <>
class FieldModel<::enums::EnumInt8> : public FieldModelBase<::enums::EnumInt8, int8_t>
{
public:
    using FieldModelBase<::enums::EnumInt8, int8_t>::FieldModelBase;
};

// Fast Binary Encoding ::enums::EnumUInt8 field model
template <>
class FieldModel<::enums::EnumUInt8> : public FieldModelBase<::enums::EnumUInt8, uint8_t>
{
public:
    using FieldModelBase<::enums::EnumUInt8, uint8_t>::FieldModelBase;
};

// Fast Binary Encoding ::enums::EnumInt16 field model
template <>
class FieldModel<::enums::EnumInt16> : public FieldModelBase<::enums::EnumInt16, int16_t>
{
public:
    using FieldModelBase<::enums::EnumInt16, int16_t>::FieldModelBase;
};

// Fast Binary Encoding ::enums::EnumUInt16 field model
template <>
class FieldModel<::enums::EnumUInt16> : public FieldModelBase<::enums::EnumUInt16, uint16_t>
{
public:
    using FieldModelBase<::enums::EnumUInt16, uint16_t>::FieldModelBase;
};

// Fast Binary Encoding ::enums::EnumInt32 field model
template <>
class FieldModel<::enums::EnumInt32> : public FieldModelBase<::enums::EnumInt32, int32_t>
{
public:
    using FieldModelBase<::enums::EnumInt32, int32_t>::FieldModelBase;
};

// Fast Binary Encoding ::enums::EnumUInt32 field model
template <>
class FieldModel<::enums::EnumUInt32> : public FieldModelBase<::enums::EnumUInt32, uint32_t>
{
public:
    using FieldModelBase<::enums::EnumUInt32, uint32_t>::FieldModelBase;
};

// Fast Binary Encoding ::enums::EnumInt64 field model
template <>
class FieldModel<::enums::EnumInt64> : public FieldModelBase<::enums::EnumInt64, int64_t>
{
public:
    using FieldModelBase<::enums::EnumInt64, int64_t>::FieldModelBase;
};

// Fast Binary Encoding ::enums::EnumUInt64 field model
template <>
class FieldModel<::enums::EnumUInt64> : public FieldModelBase<::enums::EnumUInt64, uint64_t>
{
public:
    using FieldModelBase<::enums::EnumUInt64, uint64_t>::FieldModelBase;
};

// Fast Binary Encoding ::enums::Enums field model
template <>
class FieldModel<::enums::Enums>
{
public:
    FieldModel(FBEBuffer& buffer, size_t offset) noexcept;

    // Get the field offset
    size_t fbe_offset() const noexcept { return _offset; }
    // Get the field size
    size_t fbe_size() const noexcept { return 4; }
    // Get the field body size
    size_t fbe_body() const noexcept;
    // Get the field extra size
    size_t fbe_extra() const noexcept;
    // Get the field type
    static constexpr size_t fbe_type() noexcept { return 1; }

    // Shift the current field offset
    void fbe_shift(size_t size) noexcept { _offset += size; }
    // Unshift the current field offset
    void fbe_unshift(size_t size) noexcept { _offset -= size; }

    // Check if the struct value is valid
    bool verify(bool fbe_verify_type = true) const noexcept;
    // Check if the struct fields are valid
    bool verify_fields(size_t fbe_struct_size) const noexcept;

    // Get the struct value (begin phase)
    size_t get_begin() const noexcept;
    // Get the struct value (end phase)
    void get_end(size_t fbe_begin) const noexcept;

    // Get the struct value
    void get(::enums::Enums& fbe_value) const noexcept;
    // Get the struct fields values
    void get_fields(::enums::Enums& fbe_value, size_t fbe_struct_size) const noexcept;

    // Set the struct value (begin phase)
    size_t set_begin();
    // Set the struct value (end phase)
    void set_end(size_t fbe_begin);

    // Set the struct value
    void set(const ::enums::Enums& fbe_value) noexcept;
    // Set the struct fields values
    void set_fields(const ::enums::Enums& fbe_value) noexcept;

private:
    FBEBuffer& _buffer;
    size_t _offset;

public:
    FieldModel<::enums::EnumByte> byte0;
    FieldModel<::enums::EnumByte> byte1;
    FieldModel<::enums::EnumByte> byte2;
    FieldModel<::enums::EnumByte> byte3;
    FieldModel<::enums::EnumByte> byte4;
    FieldModel<::enums::EnumByte> byte5;
    FieldModel<::enums::EnumChar> char0;
    FieldModel<::enums::EnumChar> char1;
    FieldModel<::enums::EnumChar> char2;
    FieldModel<::enums::EnumChar> char3;
    FieldModel<::enums::EnumChar> char4;
    FieldModel<::enums::EnumChar> char5;
    FieldModel<::enums::EnumWChar> wchar0;
    FieldModel<::enums::EnumWChar> wchar1;
    FieldModel<::enums::EnumWChar> wchar2;
    FieldModel<::enums::EnumWChar> wchar3;
    FieldModel<::enums::EnumWChar> wchar4;
    FieldModel<::enums::EnumWChar> wchar5;
    FieldModel<::enums::EnumInt8> int8b0;
    FieldModel<::enums::EnumInt8> int8b1;
    FieldModel<::enums::EnumInt8> int8b2;
    FieldModel<::enums::EnumInt8> int8b3;
    FieldModel<::enums::EnumInt8> int8b4;
    FieldModel<::enums::EnumInt8> int8b5;
    FieldModel<::enums::EnumUInt8> uint8b0;
    FieldModel<::enums::EnumUInt8> uint8b1;
    FieldModel<::enums::EnumUInt8> uint8b2;
    FieldModel<::enums::EnumUInt8> uint8b3;
    FieldModel<::enums::EnumUInt8> uint8b4;
    FieldModel<::enums::EnumUInt8> uint8b5;
    FieldModel<::enums::EnumInt16> int16b0;
    FieldModel<::enums::EnumInt16> int16b1;
    FieldModel<::enums::EnumInt16> int16b2;
    FieldModel<::enums::EnumInt16> int16b3;
    FieldModel<::enums::EnumInt16> int16b4;
    FieldModel<::enums::EnumInt16> int16b5;
    FieldModel<::enums::EnumUInt16> uint16b0;
    FieldModel<::enums::EnumUInt16> uint16b1;
    FieldModel<::enums::EnumUInt16> uint16b2;
    FieldModel<::enums::EnumUInt16> uint16b3;
    FieldModel<::enums::EnumUInt16> uint16b4;
    FieldModel<::enums::EnumUInt16> uint16b5;
    FieldModel<::enums::EnumInt32> int32b0;
    FieldModel<::enums::EnumInt32> int32b1;
    FieldModel<::enums::EnumInt32> int32b2;
    FieldModel<::enums::EnumInt32> int32b3;
    FieldModel<::enums::EnumInt32> int32b4;
    FieldModel<::enums::EnumInt32> int32b5;
    FieldModel<::enums::EnumUInt32> uint32b0;
    FieldModel<::enums::EnumUInt32> uint32b1;
    FieldModel<::enums::EnumUInt32> uint32b2;
    FieldModel<::enums::EnumUInt32> uint32b3;
    FieldModel<::enums::EnumUInt32> uint32b4;
    FieldModel<::enums::EnumUInt32> uint32b5;
    FieldModel<::enums::EnumInt64> int64b0;
    FieldModel<::enums::EnumInt64> int64b1;
    FieldModel<::enums::EnumInt64> int64b2;
    FieldModel<::enums::EnumInt64> int64b3;
    FieldModel<::enums::EnumInt64> int64b4;
    FieldModel<::enums::EnumInt64> int64b5;
    FieldModel<::enums::EnumUInt64> uint64b0;
    FieldModel<::enums::EnumUInt64> uint64b1;
    FieldModel<::enums::EnumUInt64> uint64b2;
    FieldModel<::enums::EnumUInt64> uint64b3;
    FieldModel<::enums::EnumUInt64> uint64b4;
    FieldModel<::enums::EnumUInt64> uint64b5;
};

namespace enums {

// Fast Binary Encoding Enums model
class EnumsModel : public FBE::Model
{
public:
    EnumsModel() : model(this->buffer(), 4) {}
    EnumsModel(const std::shared_ptr<FBEBuffer>& buffer) : FBE::Model(buffer), model(this->buffer(), 4) {}

    // Get the model size
    size_t fbe_size() const noexcept { return model.fbe_size() + model.fbe_extra(); }
    // Get the model type
    static constexpr size_t fbe_type() noexcept { return FieldModel<::enums::Enums>::fbe_type(); }

    // Check if the struct value is valid
    bool verify();

    // Create a new model (begin phase)
    size_t create_begin();
    // Create a new model (end phase)
    size_t create_end(size_t fbe_begin);

    // Serialize the struct value
    size_t serialize(const ::enums::Enums& value);
    // Deserialize the struct value
    size_t deserialize(::enums::Enums& value) const noexcept;

    // Move to the next struct value
    void next(size_t prev) noexcept { model.fbe_shift(prev); }

public:
    FieldModel<::enums::Enums> model;
};

} // namespace enums

} // namespace FBE
