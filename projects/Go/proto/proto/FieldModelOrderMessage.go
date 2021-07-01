// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.7.0.0

package proto

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// Fast Binary Encoding OrderMessage field model
type FieldModelOrderMessage struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int

    Body *FieldModelOrder
}

// Create a new OrderMessage field model
func NewFieldModelOrderMessage(buffer *fbe.Buffer, offset int) *FieldModelOrderMessage {
    fbeResult := FieldModelOrderMessage{buffer: buffer, offset: offset}
    fbeResult.Body = NewFieldModelOrder(buffer, 4 + 4)
    return &fbeResult
}

// Get the field size
func (fm *FieldModelOrderMessage) FBESize() int { return 4 }

// Get the field body size
func (fm *FieldModelOrderMessage) FBEBody() int {
    fbeResult := 4 + 4 +
        fm.Body.FBESize() +
        0
    return fbeResult
}

// Get the field extra size
func (fm *FieldModelOrderMessage) FBEExtra() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4) > fm.buffer.Size()) {
        return 0
    }

    fm.buffer.Shift(fbeStructOffset)

    fbeResult := fm.FBEBody() +
        fm.Body.FBEExtra() +
        0

    fm.buffer.Unshift(fbeStructOffset)

    return fbeResult
}

// Get the field type
func (fm *FieldModelOrderMessage) FBEType() int { return 1 }

// Get the field offset
func (fm *FieldModelOrderMessage) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelOrderMessage) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelOrderMessage) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelOrderMessage) FBEUnshift(size int) { fm.offset -= size }

// Check if the struct value is valid
func (fm *FieldModelOrderMessage) Verify() bool { return fm.VerifyType(true) }

// Check if the struct value and its type are valid
func (fm *FieldModelOrderMessage) VerifyType(fbeVerifyType bool) bool {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return true
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4 + 4) > fm.buffer.Size()) {
        return false
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset))
    if fbeStructSize < (4 + 4) {
        return false
    }

    fbeStructType := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset + 4))
    if fbeVerifyType && (fbeStructType != fm.FBEType()) {
        return false
    }

    fm.buffer.Shift(fbeStructOffset)
    fbeResult := fm.VerifyFields(fbeStructSize)
    fm.buffer.Unshift(fbeStructOffset)
    return fbeResult
}

// // Check if the struct value fields are valid
func (fm *FieldModelOrderMessage) VerifyFields(fbeStructSize int) bool {
    fbeCurrentSize := 4 + 4

    if (fbeCurrentSize + fm.Body.FBESize()) > fbeStructSize {
        return true
    }
    if !fm.Body.Verify() {
        return false
    }
    fbeCurrentSize += fm.Body.FBESize()

    return true
}

// Get the struct value (begin phase)
func (fm *FieldModelOrderMessage) GetBegin() (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, nil
    }

    fbeStructOffset := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    if (fbeStructOffset == 0) || ((fm.buffer.Offset() + fbeStructOffset + 4 + 4) > fm.buffer.Size()) {
        return 0, errors.New("model is broken")
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset))
    if fbeStructSize < (4 + 4) {
        return 0, errors.New("model is broken")
    }

    fm.buffer.Shift(fbeStructOffset)
    return fbeStructOffset, nil
}

// Get the struct value (end phase)
func (fm *FieldModelOrderMessage) GetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Get the struct value
func (fm *FieldModelOrderMessage) Get() (*OrderMessage, error) {
    fbeResult := NewOrderMessage()
    return fbeResult, fm.GetValue(fbeResult)
}

// Get the struct value by the given pointer
func (fm *FieldModelOrderMessage) GetValue(fbeValue *OrderMessage) error {
    fbeBegin, err := fm.GetBegin()
    if fbeBegin == 0 {
        return err
    }

    fbeStructSize := int(fbe.ReadUInt32(fm.buffer.Data(), fm.buffer.Offset()))
    fm.GetFields(fbeValue, fbeStructSize)
    fm.GetEnd(fbeBegin)
    return nil
}

// Get the struct fields values
func (fm *FieldModelOrderMessage) GetFields(fbeValue *OrderMessage, fbeStructSize int) {
    fbeCurrentSize := 4 + 4

    if (fbeCurrentSize + fm.Body.FBESize()) <= fbeStructSize {
        _ = fm.Body.GetValue(&fbeValue.Body)
    } else {
        fbeValue.Body = *NewOrder()
    }
    fbeCurrentSize += fm.Body.FBESize()
}

// Set the struct value (begin phase)
func (fm *FieldModelOrderMessage) SetBegin() (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbeStructSize := fm.FBEBody()
    fbeStructOffset := fm.buffer.Allocate(fbeStructSize) - fm.buffer.Offset()
    if (fbeStructOffset <= 0) || ((fm.buffer.Offset() + fbeStructOffset + fbeStructSize) > fm.buffer.Size()) {
        return 0, errors.New("model is broken")
    }

    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint32(fbeStructOffset))
    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset, uint32(fbeStructSize))
    fbe.WriteUInt32(fm.buffer.Data(), fm.buffer.Offset() + fbeStructOffset + 4, uint32(fm.FBEType()))

    fm.buffer.Shift(fbeStructOffset)
    return fbeStructOffset, nil
}

// Set the struct value (end phase)
func (fm *FieldModelOrderMessage) SetEnd(fbeBegin int) {
    fm.buffer.Unshift(fbeBegin)
}

// Set the struct value
func (fm *FieldModelOrderMessage) Set(fbeValue *OrderMessage) error {
    fbeBegin, err := fm.SetBegin()
    if fbeBegin == 0 {
        return err
    }

    err = fm.SetFields(fbeValue)
    fm.SetEnd(fbeBegin)
    return err
}

// Set the struct fields values
func (fm *FieldModelOrderMessage) SetFields(fbeValue *OrderMessage) error {
    var err error = nil

    if err = fm.Body.Set(&fbeValue.Body); err != nil {
        return err
    }
    return err
}
