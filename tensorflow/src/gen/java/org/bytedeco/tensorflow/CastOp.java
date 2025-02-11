// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Cast x of type SrcT to y of DstT.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The y tensor. */
@Name("tensorflow::ops::Cast") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CastOp extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CastOp(Pointer p) { super(p); }

  /** Optional attribute setters for Cast */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** Defaults to false */
    public native @ByVal Attrs Truncate(@Cast("bool") boolean x);

    public native @Cast("bool") boolean Truncate_(); public native Attrs Truncate_(boolean setter);
  }
  public CastOp(@Const @ByRef Scope scope, @ByVal Input x, @Cast("tensorflow::DataType") int DstT) { super((Pointer)null); allocate(scope, x, DstT); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x, @Cast("tensorflow::DataType") int DstT);
  public CastOp(@Const @ByRef Scope scope, @ByVal Input x, @Cast("tensorflow::DataType") int DstT,
       @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, x, DstT, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x, @Cast("tensorflow::DataType") int DstT,
       @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Truncate(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native CastOp operation(Operation setter);
  public native @ByRef Output y(); public native CastOp y(Output setter);
}
