// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.7.0.0

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding test final receiver
type FinalReceiver struct {
    *fbe.Receiver
    protoReceiver *proto.FinalReceiver

}

// Create a new test final receiver with an empty buffer
func NewFinalReceiver() *FinalReceiver {
    return NewFinalReceiverWithBuffer(fbe.NewEmptyBuffer())
}

// Create a new test final receiver with the given buffer
func NewFinalReceiverWithBuffer(buffer *fbe.Buffer) *FinalReceiver {
    receiver := &FinalReceiver{
        fbe.NewReceiver(buffer, true),
        proto.NewFinalReceiverWithBuffer(buffer),
    }
    receiver.SetupHandlerOnReceive(receiver)
    return receiver
}

// Imported receivers

// Get the proto receiver
func (r *FinalReceiver) ProtoReceiver() *proto.FinalReceiver { return r.protoReceiver }
// Set the proto receiver
func (r *FinalReceiver) SetProtoReceiver(receiver *proto.FinalReceiver) { r.protoReceiver = receiver }

// Setup handlers
func (r *FinalReceiver) SetupHandlers(handlers interface{}) {
    r.Receiver.SetupHandlers(handlers)
    r.protoReceiver.SetupHandlers(handlers)
}


// Receive message handler
func (r *FinalReceiver) OnReceive(fbeType int, buffer []byte) (bool, error) {
    switch fbeType {
    default:
        _ = fbeType
        break
    }

    if r.protoReceiver != nil {
        if ok, err := r.protoReceiver.OnReceive(fbeType, buffer); ok {
            return ok, err
        }
    }

    return false, nil
}
