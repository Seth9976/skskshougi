package com.sdkbox.plugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SDKBox {
    public static final String TAG = "SDKBOX_CORE";
    protected static String _IAP_Verification_Server_Path;
    protected static String _applicationToken;
    protected static String _cdid;
    private static ExecutorService _pool;
    protected static Method _reflectRunOnGLThread;
    protected static Context _sContext;
    protected static CopyOnWriteArraySet _sListeners;
    protected static Handler _sMainThreadHandler;
    protected static HashMap _sPluginObjects;

    static {
        SDKBox._pool = Executors.newFixedThreadPool(4);
        SDKBox._sContext = null;
        SDKBox._sMainThreadHandler = null;
        SDKBox._sListeners = new CopyOnWriteArraySet();
        SDKBox._reflectRunOnGLThread = null;
        SDKBox._sPluginObjects = new HashMap();
        SDKBox._IAP_Verification_Server_Path = "http://54.218.45.21/SSS";
        SDKBox._applicationToken = null;
        SDKBox._cdid = null;
    }

    public static void addListener(PluginListener listener) {
        SDKBox._sListeners.add(listener);
    }

    public static void debugEndpoint(String e) {
        SdkboxLog.enableRemote(e);
    }

    public static void executeInBackground(Runnable r) {
        SDKBox._pool.execute(r);
    }

    public static String getApplicationToken() {
        return SDKBox._applicationToken;
    }

    public static String getCDID() {
        return SDKBox._cdid;
    }

    public static Context getContext() {
        return SDKBox._sContext;
    }

    // 去混淆评级： 低(20)
    public static String getVerificationAddress() {
        return "http://54.218.45.21/SSS";
    }

    public static void init(Context context) {
        SDKBox._sContext = context;
        if(SDKBox._sMainThreadHandler == null) {
            SDKBox._sMainThreadHandler = new Handler();
        }
        SdkboxLog.i("SDKBOX_CORE", "Sdkbox Droid starting.", new Object[0]);
        try {
            SDKBox._reflectRunOnGLThread = SDKBox._sContext.getClass().getMethod("runOnGLThread", Runnable.class);
        }
        catch(Exception unused_ex) {
            SdkboxLog.i("SDKBOX_CORE", "Context class has no method: \'runOnGLThread\'. All methods will run in main thread.", new Object[0]);
        }
        SDKBox.nativeInit(context.getClass().getClassLoader());
    }

    protected static Object initPlugin(String classFullName) {
        Class c;
        SdkboxLog.i("SDKBOX_CORE", "Initialization request for plugin: \'" + classFullName + "\'", new Object[0]);
        try {
            c = Class.forName(classFullName.replace('/', '.'));
        }
        catch(ClassNotFoundException e) {
            SdkboxLog.e("SDKBOX_CORE", "Plugin " + classFullName + " not found.", new Object[0]);
            e.printStackTrace();
            return null;
        }
        try {
            Context context0 = SDKBox.getContext();
            if(context0 == null) {
                SdkboxLog.e("SDKBOX_CORE", "Plugin " + classFullName + " had no suitable constructor for initialization.", new Object[0]);
                return null;
            }
            Object pluginObject = SDKBox._sPluginObjects.get(classFullName);
            if(pluginObject != null) {
                return pluginObject;
            }
            try {
                Object o = null;
                Method method0 = c.getDeclaredMethod("getInstance", Context.class);
                if(method0 != null) {
                    o = method0.invoke(null, context0);
                }
                pluginObject = o;
            }
            catch(Exception unused_ex) {
                pluginObject = null;
            }
            if(pluginObject == null) {
                pluginObject = c.getDeclaredConstructor(Context.class).newInstance(context0);
            }
            SDKBox._sPluginObjects.put(classFullName, pluginObject);
            return pluginObject;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static native void nativeInit(ClassLoader arg0) {
    }

    public static boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        boolean result = true;
        for(Object object0: SDKBox._sListeners) {
            result = result && ((PluginListener)object0).onActivityResult(requestCode, resultCode, data);
        }
        return result;
    }

    public static boolean onBackPressed() {
        boolean result = false;
        for(Object object0: SDKBox._sListeners) {
            result = result || ((PluginListener)object0).onBackPressed();
        }
        return result;
    }

    public static void onDestroy() {
        for(Object p: SDKBox._sListeners) {
            ((PluginListener)p).onDestroy();
        }
    }

    public static void onPause() {
        for(Object listener: SDKBox._sListeners) {
            ((PluginListener)listener).onPause();
        }
    }

    public static void onResume() {
        for(Object listener: SDKBox._sListeners) {
            ((PluginListener)listener).onResume();
        }
    }

    public static void onStart() {
        for(Object listener: SDKBox._sListeners) {
            ((PluginListener)listener).onStart();
        }
    }

    public static void onStop() {
        for(Object listener: SDKBox._sListeners) {
            ((PluginListener)listener).onStop();
        }
    }

    public static void removeListener(PluginListener listener) {
        SDKBox._sListeners.remove(listener);
    }

    public static void runOnGLThread(Runnable r) {
        if(SDKBox._reflectRunOnGLThread != null) {
            try {
                SDKBox._reflectRunOnGLThread.invoke(SDKBox._sContext, r);
            }
            catch(Exception unused_ex) {
                SDKBox.runOnMainThread(r);
            }
            return;
        }
        SDKBox.runOnMainThread(r);
    }

    public static void runOnMainThread(Runnable r) {
        if(SDKBox._sContext != null) {
            ((Activity)SDKBox._sContext).runOnUiThread(r);
            return;
        }
        SdkboxLog.i("SDKBOX_CORE", "Runnable executed in current thread.", new Object[0]);
        r.run();
    }

    public static void setNativeApplicationInfo(String token, String cdid, String verification) {
        SDKBox._applicationToken = token;
        SDKBox._cdid = cdid;
        SDKBox._IAP_Verification_Server_Path = verification;
    }
}

