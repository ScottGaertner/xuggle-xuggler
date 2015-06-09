/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
public class Global extends RefCounted {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected Global(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.Global_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected Global(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(XugglerJNI.Global_SWIGUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(Global obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new Global object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public Global copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new Global(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Global)
      equal = (((Global)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

  /**
   * The default unit of time that {@link IAudioSamples} and
   * {@link IVideoPicture} time stamps are represented in.
   */
  public static final java.util.concurrent.TimeUnit DEFAULT_TIME_UNIT =
    java.util.concurrent.TimeUnit.MICROSECONDS;

  public static long getVersion() {
    return XugglerJNI.Global_getVersion();
  }

  public static int getVersionMajor() {
    return XugglerJNI.Global_getVersionMajor();
  }

  public static int getVersionMinor() {
    return XugglerJNI.Global_getVersionMinor();
  }

  public static int getVersionRevision() {
    return XugglerJNI.Global_getVersionRevision();
  }

  public static String getVersionStr() {
    return XugglerJNI.Global_getVersionStr();
  }

  public static int getAVFormatVersion() {
    return XugglerJNI.Global_getAVFormatVersion();
  }

  public static String getAVFormatVersionStr() {
    return XugglerJNI.Global_getAVFormatVersionStr();
  }

  public static int getAVCodecVersion() {
    return XugglerJNI.Global_getAVCodecVersion();
  }

  public static String getAVCodecVersionStr() {
    return XugglerJNI.Global_getAVCodecVersionStr();
  }

  public static void init() {
    XugglerJNI.Global_init();
  }

  public static void setFFmpegLoggingLevel(int level) {
    XugglerJNI.Global_setFFmpegLoggingLevel(level);
  }

  public final static long NO_PTS = XugglerJNI.Global_NO_PTS_get();
  public final static long DEFAULT_PTS_PER_SECOND = XugglerJNI.Global_DEFAULT_PTS_PER_SECOND_get();
}
