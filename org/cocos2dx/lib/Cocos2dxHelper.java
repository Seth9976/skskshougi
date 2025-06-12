package org.cocos2dx.lib;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.Vibrator;
import android.preference.PreferenceManager.OnActivityResultListener;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.enhance.gameservice.IGameTuningService.Stub;
import com.enhance.gameservice.IGameTuningService;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class Cocos2dxHelper {
    public interface Cocos2dxHelperListener {
        void runOnGLThread(Runnable arg1);

        void showDialog(String arg1, String arg2);
    }

    private static final int BOOST_TIME = 7;
    private static final String PREFS_NAME = "Cocos2dxPrefsFile";
    private static final int RUNNABLES_PER_FRAME = 5;
    private static ServiceConnection connection;
    private static IGameTuningService mGameServiceBinder;
    private static Set onActivityResultListeners;
    private static boolean sAccelerometerEnabled;
    private static Activity sActivity;
    private static boolean sActivityVisible;
    private static AssetManager sAssetManager;
    private static Cocos2dxMusic sCocos2dMusic;
    private static Cocos2dxSound sCocos2dSound;
    private static Cocos2dxAccelerometer sCocos2dxAccelerometer;
    private static Cocos2dxHelperListener sCocos2dxHelperListener;
    private static String sFileDirectory;
    private static boolean sInited;
    private static String sPackageName;
    private static Vibrator sVibrateService;

    static {
        Cocos2dxHelper.sActivity = null;
        Cocos2dxHelper.onActivityResultListeners = new LinkedHashSet();
        Cocos2dxHelper.sVibrateService = null;
        Cocos2dxHelper.mGameServiceBinder = null;
        Cocos2dxHelper.sInited = false;
        Cocos2dxHelper.connection = new ServiceConnection() {
            @Override  // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                Cocos2dxHelper.mGameServiceBinder = Stub.asInterface(service);
                Cocos2dxHelper.fastLoading(7);
            }

            @Override  // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                Cocos2dxHelper.sActivity.getApplicationContext().unbindService(Cocos2dxHelper.connection);
            }
        };
    }

    public static void addOnActivityResultListener(PreferenceManager.OnActivityResultListener listener) {
        Cocos2dxHelper.onActivityResultListeners.add(listener);
    }

    public static byte[] conversionEncoding(byte[] text, String fromCharset, String newCharset) {
        try {
            return new String(text, fromCharset).getBytes(newCharset);
        }
        catch(UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void deleteValueForKey(String key) {
        SharedPreferences.Editor sharedPreferences$Editor0 = Cocos2dxHelper.sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).edit();
        sharedPreferences$Editor0.remove(key);
        sharedPreferences$Editor0.commit();
    }

    public static void disableAccelerometer() {
        Cocos2dxHelper.sAccelerometerEnabled = false;
        Cocos2dxHelper.sCocos2dxAccelerometer.disable();
    }

    public static void enableAccelerometer() {
        Cocos2dxHelper.sAccelerometerEnabled = true;
        Cocos2dxHelper.sCocos2dxAccelerometer.enable();
    }

    public static void end() {
        Cocos2dxHelper.sCocos2dMusic.end();
        Cocos2dxHelper.sCocos2dSound.end();
    }

    public static int fastLoading(int sec) {
        try {
            return Cocos2dxHelper.mGameServiceBinder == null ? -1 : Cocos2dxHelper.mGameServiceBinder.boostUp(sec);
        }
        catch(Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static Activity getActivity() {
        return Cocos2dxHelper.sActivity;
    }

    public static AssetManager getAssetManager() {
        return Cocos2dxHelper.sAssetManager;
    }

    public static float getBackgroundMusicVolume() {
        return Cocos2dxHelper.sCocos2dMusic.getBackgroundVolume();
    }

    public static boolean getBoolForKey(String key, boolean defaultValue) {
        SharedPreferences sharedPreferences0 = Cocos2dxHelper.sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0);
        try {
            return sharedPreferences0.getBoolean(key, defaultValue);
        }
        catch(Exception ex) {
            ex.printStackTrace();
            Object object0 = sharedPreferences0.getAll().get(key);
            if(object0 instanceof String) {
                return Boolean.parseBoolean(object0.toString());
            }
            return object0 instanceof Integer ? ((int)(((Integer)object0))) != 0 : object0 instanceof Float && ((float)(((Float)object0))) != 0.0f;
        }
    }

    public static String getCocos2dxPackageName() {
        return Cocos2dxHelper.sPackageName;
    }

    public static String getCocos2dxWritablePath() {
        return Cocos2dxHelper.sFileDirectory;
    }

    public static String getCurrentLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static int getDPI() {
        if(Cocos2dxHelper.sActivity != null) {
            DisplayMetrics metrics = new DisplayMetrics();
            WindowManager windowManager0 = Cocos2dxHelper.sActivity.getWindowManager();
            if(windowManager0 != null) {
                Display display0 = windowManager0.getDefaultDisplay();
                if(display0 != null) {
                    display0.getMetrics(metrics);
                    return (int)(metrics.density * 160.0f);
                }
            }
        }
        return -1;
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static double getDoubleForKey(String key, double defaultValue) {
        return (double)Cocos2dxHelper.getFloatForKey(key, ((float)defaultValue));
    }

    public static float getEffectsVolume() {
        return Cocos2dxHelper.sCocos2dSound.getEffectsVolume();
    }

    public static float getFloatForKey(String key, float defaultValue) {
        SharedPreferences sharedPreferences0 = Cocos2dxHelper.sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0);
        try {
            return sharedPreferences0.getFloat(key, defaultValue);
        }
        catch(Exception ex) {
            ex.printStackTrace();
            Object object0 = sharedPreferences0.getAll().get(key);
            if(object0 instanceof String) {
                return Float.parseFloat(object0.toString());
            }
            if(object0 instanceof Integer) {
                return ((Integer)object0).floatValue();
            }
            return !(object0 instanceof Boolean) || !((Boolean)object0).booleanValue() ? 0.0f : 1.0f;
        }
    }

    public static int getIntegerForKey(String key, int defaultValue) {
        SharedPreferences sharedPreferences0 = Cocos2dxHelper.sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0);
        try {
            return sharedPreferences0.getInt(key, defaultValue);
        }
        catch(Exception ex) {
            ex.printStackTrace();
            Object object0 = sharedPreferences0.getAll().get(key);
            if(object0 instanceof String) {
                return Integer.parseInt(object0.toString());
            }
            if(object0 instanceof Float) {
                return ((Float)object0).intValue();
            }
            return !(object0 instanceof Boolean) || !((Boolean)object0).booleanValue() ? 0 : 1;
        }
    }

    public static Set getOnActivityResultListeners() {
        return Cocos2dxHelper.onActivityResultListeners;
    }

    public static String getStringForKey(String key, String defaultValue) {
        SharedPreferences sharedPreferences0 = Cocos2dxHelper.sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0);
        try {
            return sharedPreferences0.getString(key, defaultValue);
        }
        catch(Exception ex) {
            ex.printStackTrace();
            return sharedPreferences0.getAll().get(key).toString();
        }
    }

    public static int getTemperature() {
        try {
            return Cocos2dxHelper.mGameServiceBinder == null ? -1 : Cocos2dxHelper.mGameServiceBinder.getAbstractTemperature();
        }
        catch(Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static String getVersion() {
        try {
            return Cocos2dxActivity.getContext().getPackageManager().getPackageInfo("org.dyndns.vivi.SkskShogi", 0).versionName;
        }
        catch(Exception unused_ex) {
            return "";
        }
    }

    public static void init(Activity activity) {
        Cocos2dxHelper.sActivity = activity;
        Cocos2dxHelper.sCocos2dxHelperListener = (Cocos2dxHelperListener)activity;
        if(!Cocos2dxHelper.sInited) {
            ApplicationInfo applicationInfo0 = activity.getApplicationInfo();
            Cocos2dxHelper.sPackageName = applicationInfo0.packageName;
            Cocos2dxHelper.sFileDirectory = activity.getFilesDir().getAbsolutePath();
            Cocos2dxHelper.nativeSetApkPath(applicationInfo0.sourceDir);
            Cocos2dxHelper.sCocos2dxAccelerometer = new Cocos2dxAccelerometer(activity);
            Cocos2dxHelper.sCocos2dMusic = new Cocos2dxMusic(activity);
            Cocos2dxHelper.sCocos2dSound = new Cocos2dxSound(activity);
            Cocos2dxHelper.sAssetManager = activity.getAssets();
            Cocos2dxHelper.nativeSetContext(activity, Cocos2dxHelper.sAssetManager);
            Cocos2dxBitmap.setContext(activity);
            Cocos2dxHelper.sVibrateService = (Vibrator)activity.getSystemService("vibrator");
            Cocos2dxHelper.sInited = true;
            Intent serviceIntent = new Intent("com.enhance.gameservice.IGameTuningService");
            serviceIntent.setPackage("com.enhance.gameservice");
            activity.getApplicationContext().bindService(serviceIntent, Cocos2dxHelper.connection, 1);
        }
    }

    public static boolean isActivityVisible() {
        return Cocos2dxHelper.sActivityVisible;
    }

    public static boolean isBackgroundMusicPlaying() {
        return Cocos2dxHelper.sCocos2dMusic.isBackgroundMusicPlaying();
    }

    private static native void nativeSetApkPath(String arg0) {
    }

    private static native void nativeSetContext(Context arg0, AssetManager arg1) {
    }

    // 检测为 lambda 实现。
    private static native void nativeSetEditTextDialogResult(byte[] arg0) {
    }

    public static void onEnterBackground() {
        Cocos2dxHelper.sCocos2dSound.onEnterBackground();
        Cocos2dxHelper.sCocos2dMusic.onEnterBackground();
    }

    public static void onEnterForeground() {
        Cocos2dxHelper.sCocos2dSound.onEnterForeground();
        Cocos2dxHelper.sCocos2dMusic.onEnterForeground();
    }

    public static void onPause() {
        Cocos2dxHelper.sActivityVisible = false;
        if(Cocos2dxHelper.sAccelerometerEnabled) {
            Cocos2dxHelper.sCocos2dxAccelerometer.disable();
        }
    }

    public static void onResume() {
        Cocos2dxHelper.sActivityVisible = true;
        if(Cocos2dxHelper.sAccelerometerEnabled) {
            Cocos2dxHelper.sCocos2dxAccelerometer.enable();
        }
    }

    public static boolean openURL(String url) {
        try {
            Intent i = new Intent("android.intent.action.VIEW");
            i.setData(Uri.parse(url));
            Cocos2dxHelper.sActivity.startActivity(i);
            return true;
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public static void pauseAllEffects() {
        Cocos2dxHelper.sCocos2dSound.pauseAllEffects();
    }

    public static void pauseBackgroundMusic() {
        Cocos2dxHelper.sCocos2dMusic.pauseBackgroundMusic();
    }

    public static void pauseEffect(int soundId) {
        Cocos2dxHelper.sCocos2dSound.pauseEffect(soundId);
    }

    public static void playBackgroundMusic(String pPath, boolean isLoop) {
        Cocos2dxHelper.sCocos2dMusic.playBackgroundMusic(pPath, isLoop);
    }

    public static int playEffect(String path, boolean isLoop, float pitch, float pan, float gain) {
        return Cocos2dxHelper.sCocos2dSound.playEffect(path, isLoop, pitch, pan, gain);
    }

    public static void preloadBackgroundMusic(String pPath) {
        Cocos2dxHelper.sCocos2dMusic.preloadBackgroundMusic(pPath);
    }

    public static void preloadEffect(String path) {
        Cocos2dxHelper.sCocos2dSound.preloadEffect(path);
    }

    public static void resumeAllEffects() {
        Cocos2dxHelper.sCocos2dSound.resumeAllEffects();
    }

    public static void resumeBackgroundMusic() {
        Cocos2dxHelper.sCocos2dMusic.resumeBackgroundMusic();
    }

    public static void resumeEffect(int soundId) {
        Cocos2dxHelper.sCocos2dSound.resumeEffect(soundId);
    }

    public static void rewindBackgroundMusic() {
        Cocos2dxHelper.sCocos2dMusic.rewindBackgroundMusic();
    }

    public static void runOnGLThread(Runnable r) {
        ((Cocos2dxActivity)Cocos2dxHelper.sActivity).runOnGLThread(r);
    }

    public static void setAccelerometerInterval(float interval) {
        Cocos2dxHelper.sCocos2dxAccelerometer.setInterval(interval);
    }

    public static void setBackgroundMusicVolume(float volume) {
        Cocos2dxHelper.sCocos2dMusic.setBackgroundVolume(volume);
    }

    public static void setBoolForKey(String key, boolean value) {
        SharedPreferences.Editor sharedPreferences$Editor0 = Cocos2dxHelper.sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).edit();
        sharedPreferences$Editor0.putBoolean(key, value);
        sharedPreferences$Editor0.commit();
    }

    public static void setDoubleForKey(String key, double value) {
        SharedPreferences.Editor sharedPreferences$Editor0 = Cocos2dxHelper.sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).edit();
        sharedPreferences$Editor0.putFloat(key, ((float)value));
        sharedPreferences$Editor0.commit();
    }

    public static void setEditTextDialogResult(String pResult) {
        try {
            byte[] arr_b = pResult.getBytes("UTF8");
            Cocos2dxHelper.sCocos2dxHelperListener.runOnGLThread(() -> {
            });
        }
        catch(UnsupportedEncodingException unused_ex) {
        }

        final class org.cocos2dx.lib.Cocos2dxHelper.2 implements Runnable {
            org.cocos2dx.lib.Cocos2dxHelper.2(byte[] arr_b) {
            }

            @Override
            public void run() {
                Cocos2dxHelper.nativeSetEditTextDialogResult(this.val$bytesUTF8);
            }
        }

    }

    public static void setEffectsVolume(float volume) {
        Cocos2dxHelper.sCocos2dSound.setEffectsVolume(volume);
    }

    public static int setFPS(int fps) {
        try {
            return Cocos2dxHelper.mGameServiceBinder == null ? -1 : Cocos2dxHelper.mGameServiceBinder.setFramePerSecond(fps);
        }
        catch(Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void setFloatForKey(String key, float value) {
        SharedPreferences.Editor sharedPreferences$Editor0 = Cocos2dxHelper.sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).edit();
        sharedPreferences$Editor0.putFloat(key, value);
        sharedPreferences$Editor0.commit();
    }

    public static void setIntegerForKey(String key, int value) {
        SharedPreferences.Editor sharedPreferences$Editor0 = Cocos2dxHelper.sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).edit();
        sharedPreferences$Editor0.putInt(key, value);
        sharedPreferences$Editor0.commit();
    }

    public static void setKeepScreenOn(boolean value) {
        ((Cocos2dxActivity)Cocos2dxHelper.sActivity).setKeepScreenOn(value);
    }

    public static int setLowPowerMode(boolean enable) {
        try {
            return Cocos2dxHelper.mGameServiceBinder == null ? -1 : Cocos2dxHelper.mGameServiceBinder.setGamePowerSaving(enable);
        }
        catch(Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int setResolutionPercent(int per) {
        try {
            return Cocos2dxHelper.mGameServiceBinder == null ? -1 : Cocos2dxHelper.mGameServiceBinder.setPreferredResolution(per);
        }
        catch(Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void setStringForKey(String key, String value) {
        SharedPreferences.Editor sharedPreferences$Editor0 = Cocos2dxHelper.sActivity.getSharedPreferences("Cocos2dxPrefsFile", 0).edit();
        sharedPreferences$Editor0.putString(key, value);
        sharedPreferences$Editor0.commit();
    }

    private static void showDialog(String pTitle, String pMessage) {
        Cocos2dxHelper.sCocos2dxHelperListener.showDialog(pTitle, pMessage);
    }

    public static void stopAllEffects() {
        Cocos2dxHelper.sCocos2dSound.stopAllEffects();
    }

    public static void stopBackgroundMusic() {
        Cocos2dxHelper.sCocos2dMusic.stopBackgroundMusic();
    }

    public static void stopEffect(int soundId) {
        Cocos2dxHelper.sCocos2dSound.stopEffect(soundId);
    }

    public static void terminateProcess() {
        Process.killProcess(Process.myPid());
    }

    public static void unloadEffect(String path) {
        Cocos2dxHelper.sCocos2dSound.unloadEffect(path);
    }

    public static void vibrate(float duration) {
        Cocos2dxHelper.sVibrateService.vibrate(((long)(1000.0f * duration)));
    }
}

