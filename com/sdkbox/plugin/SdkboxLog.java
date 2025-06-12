package com.sdkbox.plugin;

import android.util.Log;
import com.sdkbox.services.XMLHttpRequest;
import java.util.HashMap;

public class SdkboxLog {
    public static final int DEBUG = 0;
    public static final int ERROR = 3;
    public static final int INFO = 1;
    public static final String TAG = "SDKBOX_CORE";
    public static final int WARN = 2;
    private static int _defaultLevel;
    private int _level;
    private static HashMap _logs;
    private static String _remoteUrl;
    private String _tag;

    static {
        SdkboxLog._remoteUrl = null;
        SdkboxLog._logs = new HashMap();
        SdkboxLog._defaultLevel = 0;
    }

    public SdkboxLog(String tag) {
        this(tag, 0);
    }

    public SdkboxLog(String tag, int level) {
        this._level = level;
        this._tag = tag;
    }

    public static SdkboxLog GetLog(String tag) {
        SdkboxLog l = (SdkboxLog)SdkboxLog._logs.get(tag);
        if(l == null) {
            l = new SdkboxLog(tag, SdkboxLog._defaultLevel);
            SdkboxLog._logs.put(tag, l);
        }
        return l;
    }

    public static void NewLog(String tag) {
        SdkboxLog.GetLog(tag);
    }

    protected void __l(int l, String format, Object[] p) {
        if(l >= this._level) {
            String str = p.length == 0 ? format : String.format(format, p);
            switch(l) {
                case 0: {
                    Log.d(this._tag, str);
                    return;
                }
                case 1: {
                    Log.i(this._tag, str);
                    return;
                }
                case 2: {
                    Log.w(this._tag, str);
                    return;
                }
                case 3: {
                    Log.e(this._tag, str);
                }
            }
        }
    }

    private static void __remote(String level, String tag, String str) {
        if(SdkboxLog._remoteUrl != null) {
            XMLHttpRequest r = new XMLHttpRequest();
            r.setParameter("msg", "[Java]" + level + "> " + tag + ": " + str);
            r.send("GET", SdkboxLog._remoteUrl, true);
        }
    }

    public static void d(String tag, String format, Object[] str) {
        SdkboxLog sdkboxLog0 = SdkboxLog.GetLog(tag);
        if(sdkboxLog0 != null) {
            sdkboxLog0.d(format, str);
        }
    }

    public void d(String format, Object[] p) {
        this.__l(0, format, p);
    }

    public static void e(String tag, String format, Object[] str) {
        SdkboxLog sdkboxLog0 = SdkboxLog.GetLog(tag);
        if(sdkboxLog0 != null) {
            sdkboxLog0.e(format, str);
        }
    }

    public void e(String format, Object[] p) {
        this.__l(3, format, p);
    }

    public static void enableRemote(String s) {
        SdkboxLog._remoteUrl = s;
    }

    public static void i(String tag, String format, Object[] str) {
        SdkboxLog sdkboxLog0 = SdkboxLog.GetLog(tag);
        if(sdkboxLog0 != null) {
            sdkboxLog0.i(format, str);
        }
    }

    public void i(String format, Object[] p) {
        this.__l(1, format, p);
    }

    public static native void nativeTrack(String arg0, String arg1, String arg2) {
    }

    public static void setDefaultDebugLevel(int l) {
        SdkboxLog._defaultLevel = l;
    }

    public void setLevel(int l) {
        this._level = l;
    }

    public static void setLevelForTag(String tag, int level) {
        SdkboxLog sdkboxLog0 = SdkboxLog.GetLog(tag);
        if(sdkboxLog0 != null) {
            sdkboxLog0.setLevel(level);
            return;
        }
        SdkboxLog.e("SDKBOX_CORE", "SetLevel for Logger with unknown tag: \'%s", new Object[]{tag});
    }

    public static void trace(String TAG, String event, String data) {
        SdkboxLog.nativeTrack(TAG, event, data);
    }

    public static void w(String tag, String format, Object[] str) {
        SdkboxLog sdkboxLog0 = SdkboxLog.GetLog(tag);
        if(sdkboxLog0 != null) {
            sdkboxLog0.w(format, str);
        }
    }

    public void w(String format, Object[] p) {
        this.__l(2, format, p);
    }
}

