/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
public class IStream extends RefCounted {
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
  protected IStream(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.IStream_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected IStream(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(XugglerJNI.IStream_SWIGUpcast(cPtr),
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
  public static long getCPtr(IStream obj) {
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
   * Create a new IStream object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public IStream copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new IStream(swigCPtr, swigCMemOwn, getJavaRefCount());
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
    if (obj instanceof IStream)
      equal = (((IStream)obj).swigCPtr == this.swigCPtr);
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
   * info about this stream
   * @return information about this stream
   */
   
  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();
    
    result.append(this.getClass().getName()+"@"+hashCode()+"[");
    result.append("index:"+getIndex()+";");
    result.append("id:"+getId()+";");
    result.append("streamcoder:"+getStreamCoder()+";");
    result.append("framerate:"+getFrameRate()+";");
    result.append("timebase:"+getTimeBase()+";");
    result.append("direction:"+getDirection()+";");
    result.append("]");
    return result.toString();
  }

  /**
   * Get an ordered sequence of index entries in this {@link IStream}.
   * 
   * @return A list of entries.  Will always return a non-null
   *   list, but if there are no entries the list size will be zero.
   */
  public java.util.List<IIndexEntry> getIndexEntries()
  {
    final int numEntries = getNumIndexEntries();
    java.util.List<IIndexEntry> retval = new java.util.ArrayList<IIndexEntry>(Math.max(numEntries, 10));
    for(int i = 0; i < numEntries; i++) {
      final IIndexEntry entry = getIndexEntry(i);
      if (entry != null) {
       retval.add(entry); 
      }
    }
    
    return retval;
  }


  public IStream.Direction getDirection() {
    return IStream.Direction.swigToEnum(XugglerJNI.IStream_getDirection(swigCPtr, this));
  }

  public int getIndex() {
    return XugglerJNI.IStream_getIndex(swigCPtr, this);
  }

  public int getId() {
    return XugglerJNI.IStream_getId(swigCPtr, this);
  }

  public IStreamCoder getStreamCoder() {
    long cPtr = XugglerJNI.IStream_getStreamCoder(swigCPtr, this);
    return (cPtr == 0) ? null : new IStreamCoder(cPtr, false);
  }

  public IRational getFrameRate() {
    long cPtr = XugglerJNI.IStream_getFrameRate(swigCPtr, this);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

  public IRational getTimeBase() {
    long cPtr = XugglerJNI.IStream_getTimeBase(swigCPtr, this);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

  public long getStartTime() {
    return XugglerJNI.IStream_getStartTime(swigCPtr, this);
  }

  public long getDuration() {
    return XugglerJNI.IStream_getDuration(swigCPtr, this);
  }

  public long getCurrentDts() {
    return XugglerJNI.IStream_getCurrentDts(swigCPtr, this);
  }

  public int getNumIndexEntries() {
    return XugglerJNI.IStream_getNumIndexEntries(swigCPtr, this);
  }

  public long getNumFrames() {
    return XugglerJNI.IStream_getNumFrames(swigCPtr, this);
  }

  public IRational getSampleAspectRatio() {
    long cPtr = XugglerJNI.IStream_getSampleAspectRatio(swigCPtr, this);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

  public void setSampleAspectRatio(IRational newRatio) {
    XugglerJNI.IStream_setSampleAspectRatio(swigCPtr, this, IRational.getCPtr(newRatio), newRatio);
  }

  public String getLanguage() {
    return XugglerJNI.IStream_getLanguage(swigCPtr, this);
  }

  public void setLanguage(String language) {
    XugglerJNI.IStream_setLanguage(swigCPtr, this, language);
  }

  public IContainer getContainer() {
    long cPtr = XugglerJNI.IStream_getContainer(swigCPtr, this);
    return (cPtr == 0) ? null : new IContainer(cPtr, false);
  }

  public int setStreamCoder(IStreamCoder newCoder) {
    return XugglerJNI.IStream_setStreamCoder__SWIG_0(swigCPtr, this, IStreamCoder.getCPtr(newCoder), newCoder);
  }

  public IStream.ParseType getParseType() {
    return IStream.ParseType.swigToEnum(XugglerJNI.IStream_getParseType(swigCPtr, this));
  }

  public void setParseType(IStream.ParseType type) {
    XugglerJNI.IStream_setParseType(swigCPtr, this, type.swigValue());
  }

  public IMetaData getMetaData() {
    long cPtr = XugglerJNI.IStream_getMetaData(swigCPtr, this);
    return (cPtr == 0) ? null : new IMetaData(cPtr, false);
  }

  public void setMetaData(IMetaData data) {
    XugglerJNI.IStream_setMetaData(swigCPtr, this, IMetaData.getCPtr(data), data);
  }

  public int stampOutputPacket(IPacket packet) {
    return XugglerJNI.IStream_stampOutputPacket(swigCPtr, this, IPacket.getCPtr(packet), packet);
  }

  public int setStreamCoder(IStreamCoder newCoder, boolean assumeOnlyStream) {
    return XugglerJNI.IStream_setStreamCoder__SWIG_1(swigCPtr, this, IStreamCoder.getCPtr(newCoder), newCoder, assumeOnlyStream);
  }

  public IIndexEntry findTimeStampEntryInIndex(long wantedTimeStamp, int flags) {
    long cPtr = XugglerJNI.IStream_findTimeStampEntryInIndex(swigCPtr, this, wantedTimeStamp, flags);
    return (cPtr == 0) ? null : new IIndexEntry(cPtr, false);
  }

  public int findTimeStampPositionInIndex(long wantedTimeStamp, int flags) {
    return XugglerJNI.IStream_findTimeStampPositionInIndex(swigCPtr, this, wantedTimeStamp, flags);
  }

  public IIndexEntry getIndexEntry(int position) {
    long cPtr = XugglerJNI.IStream_getIndexEntry(swigCPtr, this, position);
    return (cPtr == 0) ? null : new IIndexEntry(cPtr, false);
  }

  public int addIndexEntry(IIndexEntry entry) {
    return XugglerJNI.IStream_addIndexEntry(swigCPtr, this, IIndexEntry.getCPtr(entry), entry);
  }

  public void setId(int id) {
    XugglerJNI.IStream_setId(swigCPtr, this, id);
  }

  public enum Direction {
    INBOUND,
    OUTBOUND;

    public final int swigValue() {
      return swigValue;
    }

    public static Direction swigToEnum(int swigValue) {
      Direction[] swigValues = Direction.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Direction swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Direction.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Direction() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Direction(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Direction(Direction swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum ParseType {
    PARSE_NONE,
    PARSE_FULL,
    PARSE_HEADERS,
    PARSE_TIMESTAMPS,
    PARSE_FULL_ONCE,
    PARSE_FULL_RAW(XugglerJNI.IStream_PARSE_FULL_RAW_get());

    public final int swigValue() {
      return swigValue;
    }

    public static ParseType swigToEnum(int swigValue) {
      ParseType[] swigValues = ParseType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (ParseType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + ParseType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private ParseType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private ParseType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private ParseType(ParseType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
