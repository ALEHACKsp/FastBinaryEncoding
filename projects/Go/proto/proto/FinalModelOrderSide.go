// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.7.0.0

package proto

import "errors"
import "../fbe"

// Fast Binary Encoding OrderSide final model
type FinalModelOrderSide struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int
}

// Create a new OrderSide final model
func NewFinalModelOrderSide(buffer *fbe.Buffer, offset int) *FinalModelOrderSide {
    return &FinalModelOrderSide{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelOrderSide) FBEAllocationSize(value *OrderSide) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelOrderSide) FBESize() int { return 1 }

// Get the final offset
func (fm *FinalModelOrderSide) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelOrderSide) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelOrderSide) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelOrderSide) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelOrderSide) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelOrderSide) Get() (*OrderSide, int, error) {
    var value OrderSide
    size, err := fm.GetValueDefault(&value, OrderSide(0))
    return &value, size, err
}

// Get the value with provided default value
func (fm *FinalModelOrderSide) GetDefault(defaults OrderSide) (*OrderSide, int, error) {
    var value OrderSide
    size, err := fm.GetValueDefault(&value, defaults)
    return &value, size, err
}

// Get the value by the given pointer
func (fm *FinalModelOrderSide) GetValue(value *OrderSide) (int, error) {
    return fm.GetValueDefault(value, OrderSide(0))
}

// Get the value by the given pointer with provided default value
func (fm *FinalModelOrderSide) GetValueDefault(value *OrderSide, defaults OrderSide) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return 0, errors.New("model is broken")
    }

    *value = OrderSide(fbe.ReadByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return fm.FBESize(), nil
}

// Set the value by the given pointer
func (fm *FinalModelOrderSide) Set(value *OrderSide) (int, error) {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FinalModelOrderSide) SetValue(value OrderSide) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbe.WriteByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), byte(value))
    return fm.FBESize(), nil
}
