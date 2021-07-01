// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// Version: 1.7.0.0

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding optional protoOrderSide field model
type FieldModelOptionalprotoOrderSide struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int

    // Base field model value
    value *proto.FieldModelOrderSide
}

// Create a new optional protoOrderSide field model
func NewFieldModelOptionalprotoOrderSide(buffer *fbe.Buffer, offset int) *FieldModelOptionalprotoOrderSide {
    fbeResult := FieldModelOptionalprotoOrderSide{buffer: buffer, offset: offset}
    fbeResult.value = proto.NewFieldModelOrderSide(buffer, 0)
    return &fbeResult
}

// Get the optional field model value
func (fm *FieldModelOptionalprotoOrderSide) Value() *proto.FieldModelOrderSide { return fm.value }

// Get the field size
func (fm *FieldModelOptionalprotoOrderSide) FBESize() int { return 1 + 4 }

// Get the field extra size
func (fm *FieldModelOptionalprotoOrderSide) FBEExtra() int {
    if !fm.HasValue() {
        return 0
    }

    fbeOptionalOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + 1))
    if (fbeOptionalOffset == 0) || ((fm.buffer.Offset() + fbeOptionalOffset + 4) > fm.buffer.Size()) {
        return 0
    }

    fm.buffer.Shift(fbeOptionalOffset)
    fbeResult := fm.value.FBESize() + fm.value.FBEExtra()
    fm.buffer.Unshift(fbeOptionalOffset)
    return fbeResult
}

// Get the field offset
func (fm *FieldModelOptionalprotoOrderSide) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelOptionalprotoOrderSide) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelOptionalprotoOrderSide) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelOptionalprotoOrderSide) FBEUnshift(size int) { fm.offset -= size }

// Check if the object contains a value
func (fm *FieldModelOptionalprotoOrderSide) HasValue() bool {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return false
    }

    fbeHasValue := fbe.ReadUInt8(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset())
    return fbeHasValue != 0
}

// Check if the optional value is valid
func (fm *FieldModelOptionalprotoOrderSide) Verify() bool {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return true
    }

    fbeHasValue := fbe.ReadUInt8(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset())
    if fbeHasValue == 0 {
        return true
    }

    fbeOptionalOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + 1))
    if fbeOptionalOffset == 0 {
        return false
    }

    fm.buffer.Shift(fbeOptionalOffset)
    fbeResult := fm.value.Verify()
    fm.buffer.Unshift(fbeOptionalOffset)
    return fbeResult
}

// Get the optional value (being phase)
func (fm *FieldModelOptionalprotoOrderSide) GetBegin() (int, error) {
    if !fm.HasValue() {
        return 0, nil
    }

    fbeOptionalOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + 1))
    if fbeOptionalOffset <= 0 {
        return 0, errors.New("model is broken")
    }

    fm.buffer.Shift(fbeOptionalOffset)
    return fbeOptionalOffset, nil
}

// Get the optional value (end phase)
func (fm *FieldModelOptionalprotoOrderSide) GetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Get the optional value
func (fm *FieldModelOptionalprotoOrderSide) Get() (*proto.OrderSide, error) {
    var fbeValue *proto.OrderSide = nil

    fbeBegin, err := fm.GetBegin()
    if fbeBegin == 0 {
        return fbeValue, err
    }

    fbeValue = proto.NewOrderSide()

    err = fm.value.GetValue(fbeValue)
    fm.GetEnd(fbeBegin)
    return fbeValue, err
}

// Set the optional value (begin phase)
func (fm *FieldModelOptionalprotoOrderSide) SetBegin(hasValue bool) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, nil
    }

    fbeHasValue := uint8(0)
    if hasValue {
        fbeHasValue = uint8(1)
    }
    fbe.WriteUInt8(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), fbeHasValue)
    if fbeHasValue == 0 {
        return 0, nil
    }

    fbeOptionalSize := fm.value.FBESize()
    fbeOptionalOffset := fm.buffer.Allocate(fbeOptionalSize) - fm.buffer.Offset()
    if (fbeOptionalOffset <= 0) || ((fm.buffer.Offset() + fbeOptionalOffset + fbeOptionalSize) > fm.buffer.Size()) {
        return 0, errors.New("model is broken")
    }

    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset() + 1, uint32(fbeOptionalOffset))

    fm.buffer.Shift(fbeOptionalOffset)
    return fbeOptionalOffset, nil
}

// Set the optional value (end phase)
func (fm *FieldModelOptionalprotoOrderSide) SetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Set the optional value
func (fm *FieldModelOptionalprotoOrderSide) Set(fbeValue *proto.OrderSide) error {
    fbeBegin, err := fm.SetBegin(fbeValue != nil)
    if fbeBegin == 0 {
        return err
    }

    err = fm.value.Set(fbeValue)
    fm.SetEnd(fbeBegin)
    return err
}
