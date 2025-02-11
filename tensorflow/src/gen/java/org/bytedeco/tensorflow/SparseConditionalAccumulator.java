// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** A conditional accumulator for aggregating sparse gradients.
 * 
 *  The accumulator accepts gradients marked with local_step greater or
 *  equal to the most recent global_step known to the accumulator. The
 *  average can be extracted from the accumulator, provided sufficient
 *  gradients have been accumulated. Extracting the average automatically
 *  resets the aggregate to 0, and increments the global_step recorded by
 *  the accumulator.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * dtype: The type of the value being accumulated.
 *  * shape: The shape of the values.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * container: If non-empty, this accumulator is placed in the given container.
 *  Otherwise, a default container is used.
 *  * shared_name: If non-empty, this accumulator will be shared under the given name
 *  across multiple sessions.
 * 
 *  Returns:
 *  * {@code Output}: The handle to the accumulator. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseConditionalAccumulator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseConditionalAccumulator(Pointer p) { super(p); }

  /** Optional attribute setters for SparseConditionalAccumulator */
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
  
    /** If non-empty, this accumulator is placed in the given container.
     *  Otherwise, a default container is used.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Container(@StringPiece BytePointer x);
    public native @ByVal Attrs Container(@StringPiece String x);

    /** If non-empty, this accumulator will be shared under the given name
     *  across multiple sessions.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs SharedName(@StringPiece BytePointer x);
    public native @ByVal Attrs SharedName(@StringPiece String x);

    /** Defaults to "MEAN" */
    public native @ByVal Attrs ReductionType(@StringPiece BytePointer x);
    public native @ByVal Attrs ReductionType(@StringPiece String x);

    public native @StringPiece BytePointer container_(); public native Attrs container_(BytePointer setter);
    public native @StringPiece BytePointer shared_name_(); public native Attrs shared_name_(BytePointer setter);
    public native @StringPiece BytePointer reduction_type_(); public native Attrs reduction_type_(BytePointer setter);
  }
  public SparseConditionalAccumulator(@Const @ByRef Scope scope, @Cast("tensorflow::DataType") int dtype,
                               @ByVal PartialTensorShape shape) { super((Pointer)null); allocate(scope, dtype, shape); }
  private native void allocate(@Const @ByRef Scope scope, @Cast("tensorflow::DataType") int dtype,
                               @ByVal PartialTensorShape shape);
  public SparseConditionalAccumulator(@Const @ByRef Scope scope, @Cast("tensorflow::DataType") int dtype,
                               @ByVal PartialTensorShape shape, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, dtype, shape, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @Cast("tensorflow::DataType") int dtype,
                               @ByVal PartialTensorShape shape, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Container(@StringPiece BytePointer x);
  public static native @ByVal Attrs Container(@StringPiece String x);
  public static native @ByVal Attrs SharedName(@StringPiece BytePointer x);
  public static native @ByVal Attrs SharedName(@StringPiece String x);
  public static native @ByVal Attrs ReductionType(@StringPiece BytePointer x);
  public static native @ByVal Attrs ReductionType(@StringPiece String x);

  public native @ByRef Operation operation(); public native SparseConditionalAccumulator operation(Operation setter);
  public native @ByRef Output handle(); public native SparseConditionalAccumulator handle(Output setter);
}
