// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// most things in the environment are just simple value types
// and not special python syntax sugar types
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SimpleValue extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimpleValue(Pointer p) { super(p); }

  public SimpleValue(Value value) { super((Pointer)null); allocate(value); }
  private native void allocate(Value value);
  public native @StdString BytePointer kind();
  public native Value asValue(@Const @ByRef SourceRange range, @ByRef Function m);
  public native @ByVal SugaredValueVector asTuple(
        @Const @ByRef SourceRange loc,
        @ByRef Function m,
        @Const @ByRef(nullValue = "c10::optional<size_t>{}") SizeTOptional size_hint);
  public native @ByVal SugaredValueVector asTuple(
        @Const @ByRef SourceRange loc,
        @ByRef Function m);
  public native @SharedPtr @ByVal SugaredValue attr(
        @Const @ByRef SourceRange loc,
        @ByRef Function m,
        @StdString BytePointer field);
  public native @SharedPtr @ByVal SugaredValue attr(
        @Const @ByRef SourceRange loc,
        @ByRef Function m,
        @StdString String field);

  public native @Cast("bool") boolean hasAttr(@Const @ByRef SourceRange loc, @ByRef Function m, @StdString BytePointer field);
  public native @Cast("bool") boolean hasAttr(@Const @ByRef SourceRange loc, @ByRef Function m, @StdString String field);

  public native void setAttr(
        @Const @ByRef SourceRange loc,
        @ByRef Function m,
        @StdString BytePointer field,
        Value newValue);
  public native void setAttr(
        @Const @ByRef SourceRange loc,
        @ByRef Function m,
        @StdString String field,
        Value newValue);

  public native @SharedPtr @ByVal SugaredValue call(
        @Const @ByRef SourceRange loc,
        @ByRef Function m,
        @ByVal NamedValueArrayRef args,
        @ByVal NamedValueArrayRef kwargs,
        @Cast("size_t") long n_binders);

  public native @SharedPtr @ByVal SugaredValue iter(@Const @ByRef SourceRange loc, @ByRef Function m);

  public native Value getValue();

  public native Value len(@Const @ByRef SourceRange loc, @ByRef Function m);
  public native @SharedPtr @ByVal SugaredValue getitem(
        @Const @ByRef SourceRange loc,
        @ByRef Function m,
        Value idx,
        @SharedPtr @ByVal(nullValue = "c10::TypePtr(nullptr)") Type type_hint);
  public native @SharedPtr @ByVal SugaredValue getitem(
        @Const @ByRef SourceRange loc,
        @ByRef Function m,
        Value idx);
}
