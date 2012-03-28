/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btBlock {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btBlock(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btBlock obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btBlock(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPrevious(btBlock value) {
    gdxBulletJNI.btBlock_previous_set(swigCPtr, this, btBlock.getCPtr(value), value);
  }

  public btBlock getPrevious() {
    long cPtr = gdxBulletJNI.btBlock_previous_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btBlock(cPtr, false);
  }

  public void setAddress(SWIGTYPE_p_unsigned_char value) {
    gdxBulletJNI.btBlock_address_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getAddress() {
    long cPtr = gdxBulletJNI.btBlock_address_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public btBlock() {
    this(gdxBulletJNI.new_btBlock(), true);
  }

}
