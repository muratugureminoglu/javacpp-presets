// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class RecurrentParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecurrentParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RecurrentParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RecurrentParameter position(long position) {
        return (RecurrentParameter)super.position(position);
    }
    @Override public RecurrentParameter getPointer(long i) {
        return new RecurrentParameter((Pointer)this).offsetAddress(i);
    }

  public RecurrentParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RecurrentParameter(@Const @ByRef RecurrentParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RecurrentParameter from);

  public native @ByRef @Name("operator =") RecurrentParameter put(@Const @ByRef RecurrentParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef RecurrentParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RecurrentParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(RecurrentParameter other);
  

  // implements Message ----------------------------------------------

  public native final RecurrentParameter New();

  public native final RecurrentParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef RecurrentParameter from);
  public native void MergeFrom(@Const @ByRef RecurrentParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional .caffe.FillerParameter weight_filler = 2;
  public native @Cast("bool") boolean has_weight_filler();
  public native void clear_weight_filler();
  @MemberGetter public static native int kWeightFillerFieldNumber();
  public static final int kWeightFillerFieldNumber = kWeightFillerFieldNumber();
  public native @Const @ByRef FillerParameter weight_filler();
  public native FillerParameter release_weight_filler();
  public native FillerParameter mutable_weight_filler();
  public native void set_allocated_weight_filler(FillerParameter weight_filler);

  // optional .caffe.FillerParameter bias_filler = 3;
  public native @Cast("bool") boolean has_bias_filler();
  public native void clear_bias_filler();
  @MemberGetter public static native int kBiasFillerFieldNumber();
  public static final int kBiasFillerFieldNumber = kBiasFillerFieldNumber();
  public native @Const @ByRef FillerParameter bias_filler();
  public native FillerParameter release_bias_filler();
  public native FillerParameter mutable_bias_filler();
  public native void set_allocated_bias_filler(FillerParameter bias_filler);

  // optional uint32 num_output = 1 [default = 0];
  public native @Cast("bool") boolean has_num_output();
  public native void clear_num_output();
  @MemberGetter public static native int kNumOutputFieldNumber();
  public static final int kNumOutputFieldNumber = kNumOutputFieldNumber();
  public native @Cast("google::protobuf::uint32") int num_output();
  public native void set_num_output(@Cast("google::protobuf::uint32") int value);

  // optional bool debug_info = 4 [default = false];
  public native @Cast("bool") boolean has_debug_info();
  public native void clear_debug_info();
  @MemberGetter public static native int kDebugInfoFieldNumber();
  public static final int kDebugInfoFieldNumber = kDebugInfoFieldNumber();
  public native @Cast("bool") boolean debug_info();
  public native void set_debug_info(@Cast("bool") boolean value);

  // optional bool expose_hidden = 5 [default = false];
  public native @Cast("bool") boolean has_expose_hidden();
  public native void clear_expose_hidden();
  @MemberGetter public static native int kExposeHiddenFieldNumber();
  public static final int kExposeHiddenFieldNumber = kExposeHiddenFieldNumber();
  public native @Cast("bool") boolean expose_hidden();
  public native void set_expose_hidden(@Cast("bool") boolean value);
}
