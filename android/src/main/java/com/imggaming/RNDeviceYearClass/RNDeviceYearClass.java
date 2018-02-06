package com.imggaming.RNDeviceYearClass;

import com.facebook.device.yearclass.YearClass;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

public class RNDeviceYearClass extends ReactContextBaseJavaModule {

  public RNDeviceYearClass(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "RNDeviceYearClass";
  }

  /**
   * Function to be shared to react-native, it returns the
   * year this Android device was considered high end.
   *
   * @return { Promise } yearClass
   */
  @ReactMethod
  public void getYearClass(Promise promise) {
    try {
      int yearClass;
      yearClass = YearClass.get(getCurrentActivity());
      promise.resolve(yearClass);
    } catch (Exception e) {
      promise.reject(e);
    }
  }
}
