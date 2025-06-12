package com.sdkbox.plugin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Build;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.sdkbox.services.TrackingLocalStorage;

public class TrackingInfoAndroid {
    public static final String TAG = "TrackingInfo";
    private static String _cachedAppName;
    private static String _cachedFingerPrint_AndroidId;
    private static String _cachedFingerPrint_Build;
    private static String _cachedFingerPrint_MACAddress;
    private static TrackingLocalStorage tls;

    static {
        TrackingInfoAndroid._cachedAppName = null;
        TrackingInfoAndroid._cachedFingerPrint_Build = null;
        TrackingInfoAndroid._cachedFingerPrint_AndroidId = null;
        TrackingInfoAndroid._cachedFingerPrint_MACAddress = null;
        TrackingInfoAndroid.tls = new TrackingLocalStorage();
    }

    public static boolean IsNetworkAvailable() {
        try {
            NetworkInfo networkInfo0 = ((ConnectivityManager)SDKBox.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
            return networkInfo0 != null && networkInfo0.isConnectedOrConnecting();
        }
        catch(Exception unused_ex) {
            return true;
        }
    }

    private static boolean canAccessWifi() {
        return SDKBox.getContext().checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0;
    }

    private static String capitalize(String str) {
        if(TextUtils.isEmpty(str)) {
            return str;
        }
        char[] arr_c = str.toCharArray();
        boolean capitalizeNext = true;
        String phrase = "";
        for(int v = 0; v < arr_c.length; ++v) {
            int c = arr_c[v];
            if(!capitalizeNext || !Character.isLetter(((char)c))) {
                if(Character.isWhitespace(((char)c))) {
                    capitalizeNext = true;
                }
                phrase = phrase + ((char)c);
            }
            else {
                phrase = phrase + Character.toUpperCase(((char)c));
                capitalizeNext = false;
            }
        }
        return phrase;
    }

    // 去混淆评级： 低(20)
    public static String getAndroidId() {
        return "27637ac3f5a4198e";
    }

    public static String getAppName() {
        String appName;
        try {
            if(TrackingInfoAndroid._cachedAppName != null) {
                return TrackingInfoAndroid._cachedAppName;
            }
            appName = "unknown";
            PackageManager packageManager0 = SDKBox.getContext().getPackageManager();
            appName = packageManager0.getApplicationLabel(packageManager0.getApplicationInfo("org.dyndns.vivi.SkskShogi", 0)).toString();
        }
        catch(Exception e) {
            SdkboxLog.e("TrackingInfo", "Exception: " + e.toString(), new Object[0]);
        }
        TrackingInfoAndroid._cachedAppName = appName;
        return TrackingInfoAndroid._cachedAppName;
    }

    // 去混淆评级： 低(20)
    public static String getAppPackageId() {
        return "org.dyndns.vivi.SkskShogi";
    }

    private static String getCachedFingerPrintBuild() {
        if(TrackingInfoAndroid._cachedFingerPrint_Build != null) {
            return TrackingInfoAndroid._cachedFingerPrint_Build;
        }
        TrackingInfoAndroid._cachedFingerPrint_Build = "0" + ((char)(Build.BOARD.length() % 10)) + "0" + ((char)(Build.BRAND.length() % 10)) + "0" + ((char)(Build.CPU_ABI.length() % 10)) + "0" + ((char)(Build.DEVICE.length() % 10)) + "0" + ((char)(Build.MANUFACTURER.length() % 10)) + "0" + ((char)(Build.MODEL.length() % 10)) + "0" + ((char)(Build.PRODUCT.length() % 10)) + "0" + ((char)(Build.TAGS.length() % 10)) + "0" + ((char)(Build.TYPE.length() % 10)) + "0" + ((char)(Build.USER.length() % 10));
        return TrackingInfoAndroid._cachedFingerPrint_Build;
    }

    public static String getChannel() {
        try {
            String s = SDKBox.getContext().getPackageManager().getApplicationInfo("org.dyndns.vivi.SkskShogi", 0x80).metaData.getString("store");
            if(s != null) {
                String channel = s.toLowerCase();
                if(channel.contains("playphone")) {
                    return "playphone";
                }
                return channel.contains("amazon") ? "amazon" : "googleplay";
            }
        }
        catch(Exception unused_ex) {
        }
        return "googleplay";
    }

    public static String getCountryCode() {
        return SDKBox.getContext().getResources().getConfiguration().locale.getCountry();
    }

    public static String getDeviceFingerprint() {
        Context context0 = SDKBox.getContext();
        String s = TrackingInfoAndroid.getCachedFingerPrintBuild();
        String s1 = Settings.Secure.getString(context0.getContentResolver(), "android_id");
        if(TrackingInfoAndroid.canAccessWifi()) {
            return s + s1 + ((WifiManager)context0.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        }
        SdkboxLog.e("TrackingInfo", "Failed to access wifi, need ACCESS_WIFI_STATE perms?", new Object[0]);
        return s + s1 + "mac-address-unavailable";
    }

    public static String getDeviceName() {
        String model = Build.MODEL;
        return model.startsWith(Build.MANUFACTURER) ? TrackingInfoAndroid.capitalize(model) : TrackingInfoAndroid.capitalize(Build.MANUFACTURER) + " " + model;
    }

    public static String getFingerprintString(String name) {
        String result = "mac-address-unavailable";
        Context context0 = SDKBox.getContext();
        if(name.equals("build")) {
            return TrackingInfoAndroid.getCachedFingerPrintBuild();
        }
        if(name.equals("androidid")) {
            if(TrackingInfoAndroid._cachedFingerPrint_AndroidId != null) {
                return TrackingInfoAndroid._cachedFingerPrint_AndroidId;
            }
            TrackingInfoAndroid._cachedFingerPrint_AndroidId = Settings.Secure.getString(context0.getContentResolver(), "android_id");
            return TrackingInfoAndroid._cachedFingerPrint_AndroidId;
        }
        if(name.equals("macaddress")) {
            if(TrackingInfoAndroid._cachedFingerPrint_MACAddress != null) {
                return TrackingInfoAndroid._cachedFingerPrint_MACAddress;
            }
            if(TrackingInfoAndroid.canAccessWifi()) {
                String s2 = ((WifiManager)context0.getSystemService("wifi")).getConnectionInfo().getMacAddress();
                if(s2 == null) {
                    SdkboxLog.e("TrackingInfo", "getMacAddress returned null", new Object[0]);
                }
                else {
                    result = s2;
                }
            }
            else {
                SdkboxLog.e("TrackingInfo", "Failed to access wifi, need ACCESS_WIFI_STATE perms?", new Object[0]);
            }
            TrackingInfoAndroid._cachedFingerPrint_MACAddress = result;
            return TrackingInfoAndroid._cachedFingerPrint_MACAddress;
        }
        SdkboxLog.e("TrackingInfo", "Requested string unknown " + name, new Object[0]);
        return "";
    }

    public static String getLatitude() {
        return TrackingInfoAndroid.getLongitudeAndLatitude()[1];
    }

    public static String getLongitude() {
        return TrackingInfoAndroid.getLongitudeAndLatitude()[0];
    }

    public static String[] getLongitudeAndLatitude() {
        try {
            LocationManager lm = (LocationManager)SDKBox.getContext().getSystemService("location");
            Location location0 = lm.getLastKnownLocation(((String)lm.getProviders(true).get(0)));
            return new String[]{String.valueOf(location0.getLongitude()), String.valueOf(location0.getLatitude())};
        }
        catch(Exception unused_ex) {
            return new String[]{"-1.0", "-1.0"};
        }
    }

    public static String getMetadata(String key) {
        try {
            return SDKBox.getContext().getPackageManager().getApplicationInfo("org.dyndns.vivi.SkskShogi", 0x80).metaData.getString(key);
        }
        catch(Exception unused_ex) {
            return "";
        }
    }

    public static String getSystemVersion() {
        return Build.VERSION.CODENAME + ", version=" + Build.VERSION.RELEASE + ", SDK=" + Build.VERSION.SDK_INT;
    }

    // 去混淆评级： 低(20)
    public static String getTimestamp() {
        return "1749696389779";
    }

    public static native void onAdvertisingIdInfo(String arg0, boolean arg1) {
    }

    public static void reqAdvertisingIdentifier() {
        SDKBox.executeInBackground(new Runnable() {
            @Override
            public void run() {
                try {
                    Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(SDKBox.getContext());
                    SDKBox.runOnGLThread(new Runnable() {
                        @Override
                        public void run() {
                            TrackingInfoAndroid.onAdvertisingIdInfo(String.valueOf(advertisingIdClient$Info0.getId()), advertisingIdClient$Info0.isLimitAdTrackingEnabled());
                        }
                    });
                }
                catch(Exception e) {
                    SdkboxLog.e("TrackingInfo", "reqAdvertisingIdentifier Exception:" + e.toString(), new Object[0]);
                }
                catch(Error e) {
                    SdkboxLog.e("TrackingInfo", "reqAdvertisingIdentifier Error:" + e.toString(), new Object[0]);
                }
            }
        });
    }

    public static void trackRequest(String url) {
        TrackingInfoAndroid.tls.add(url);
    }
}

