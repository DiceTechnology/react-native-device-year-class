import { NativeModules } from 'react-native';

const { RNDeviceYearClass } = NativeModules;

export default {
  getYearClass: RNDeviceYearClass.getYearClass,
  name: 'index.android.js',
};
