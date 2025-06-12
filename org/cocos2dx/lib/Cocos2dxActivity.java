package org.cocos2dx.lib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.preference.PreferenceManager.OnActivityResultListener;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import com.sdkbox.plugin.SDKBox;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

public abstract class Cocos2dxActivity extends Activity implements Cocos2dxHelperListener {
    public class Cocos2dxEGLConfigChooser implements GLSurfaceView.EGLConfigChooser {
        class ConfigValue implements Comparable {
            public EGLConfig config;
            public int[] configAttribs;
            public int value;

            public ConfigValue(EGL10 egl, EGLDisplay display, EGLConfig config) {
                this.value = 0;
                this.config = config;
                this.configAttribs = new int[6];
                int[] arr_v = this.configAttribs;
                arr_v[0] = cocos2dxActivity$Cocos2dxEGLConfigChooser0.findConfigAttrib(egl, display, config, 0x3024, 0);
                int[] arr_v1 = this.configAttribs;
                arr_v1[1] = cocos2dxActivity$Cocos2dxEGLConfigChooser0.findConfigAttrib(egl, display, config, 0x3023, 0);
                int[] arr_v2 = this.configAttribs;
                arr_v2[2] = cocos2dxActivity$Cocos2dxEGLConfigChooser0.findConfigAttrib(egl, display, config, 0x3022, 0);
                int[] arr_v3 = this.configAttribs;
                arr_v3[3] = cocos2dxActivity$Cocos2dxEGLConfigChooser0.findConfigAttrib(egl, display, config, 0x3021, 0);
                int[] arr_v4 = this.configAttribs;
                arr_v4[4] = cocos2dxActivity$Cocos2dxEGLConfigChooser0.findConfigAttrib(egl, display, config, 0x3025, 0);
                int[] arr_v5 = this.configAttribs;
                arr_v5[5] = cocos2dxActivity$Cocos2dxEGLConfigChooser0.findConfigAttrib(egl, display, config, 0x3026, 0);
                this.calcValue();
            }

            public ConfigValue(int[] attribs) {
                this.config = null;
                this.value = 0;
                this.configAttribs = attribs;
                this.calcValue();
            }

            private void calcValue() {
                if(this.configAttribs[4] > 0) {
                    this.value = this.value + 0x20000000 + (this.configAttribs[4] % 0x40 << 6);
                }
                if(this.configAttribs[5] > 0) {
                    this.value = this.value + 0x10000000 + this.configAttribs[5] % 0x40;
                }
                if(this.configAttribs[3] > 0) {
                    this.value = this.value + 0x40000000 + (this.configAttribs[3] % 16 << 24);
                }
                if(this.configAttribs[1] > 0) {
                    this.value += this.configAttribs[1] % 16 << 20;
                }
                if(this.configAttribs[2] > 0) {
                    this.value += this.configAttribs[2] % 16 << 16;
                }
                if(this.configAttribs[0] > 0) {
                    this.value += this.configAttribs[0] % 16 << 12;
                }
            }

            @Override
            public int compareTo(Object x0) {
                return this.compareTo(((ConfigValue)x0));
            }

            public int compareTo(ConfigValue another) {
                if(this.value < another.value) {
                    return -1;
                }
                return this.value <= another.value ? 0 : 1;
            }

            @Override
            public String toString() {
                return "{ color: " + this.configAttribs[3] + this.configAttribs[2] + this.configAttribs[1] + this.configAttribs[0] + "; depth: " + this.configAttribs[4] + "; stencil: " + this.configAttribs[5] + ";}";
            }
        }

        protected int[] configAttribs;

        public Cocos2dxEGLConfigChooser(int redSize, int greenSize, int blueSize, int alphaSize, int depthSize, int stencilSize) {
            this.configAttribs = new int[]{redSize, greenSize, blueSize, alphaSize, depthSize, stencilSize};
        }

        public Cocos2dxEGLConfigChooser(int[] attribs) {
            this.configAttribs = attribs;
        }

        @Override  // android.opengl.GLSurfaceView$EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl, EGLDisplay display) {
            EGLConfig[] configs = new EGLConfig[1];
            int[] numConfigs = new int[1];
            if(egl.eglChooseConfig(display, new int[]{0x3024, this.configAttribs[0], 0x3023, this.configAttribs[1], 0x3022, this.configAttribs[2], 0x3021, this.configAttribs[3], 0x3025, this.configAttribs[4], 0x3026, this.configAttribs[5], 0x3040, 4, 0x3038}, configs, 1, numConfigs) && numConfigs[0] > 0) {
                return configs[0];
            }
            int[] arr_v1 = {0x3040, 4, 0x3038};
            if(egl.eglChooseConfig(display, arr_v1, null, 0, numConfigs) && numConfigs[0] > 0) {
                int num = numConfigs[0];
                ConfigValue[] cfgVals = new ConfigValue[num];
                EGLConfig[] configs = new EGLConfig[num];
                egl.eglChooseConfig(display, arr_v1, configs, num, numConfigs);
                for(int i = 0; i < num; ++i) {
                    cfgVals[i] = new ConfigValue(this, egl, display, configs[i]);
                }
                ConfigValue cocos2dxActivity$Cocos2dxEGLConfigChooser$ConfigValue0 = new ConfigValue(this, this.configAttribs);
                int lo = 0;
                int hi = num;
                while(lo < hi - 1) {
                    int mi = (lo + hi) / 2;
                    if(cocos2dxActivity$Cocos2dxEGLConfigChooser$ConfigValue0.compareTo(cfgVals[mi]) < 0) {
                        hi = mi;
                    }
                    else {
                        lo = mi;
                    }
                }
                if(lo != num - 1) {
                    ++lo;
                }
                Log.w("cocos2d", "Can\'t find EGLConfig match: " + cocos2dxActivity$Cocos2dxEGLConfigChooser$ConfigValue0 + ", instead of closest one:" + cfgVals[lo]);
                return cfgVals[lo].config;
            }
            Log.e("device_policy", "Can not select an EGLConfig for rendering.");
            return null;
        }

        private int findConfigAttrib(EGL10 egl, EGLDisplay display, EGLConfig config, int attribute, int defaultValue) {
            int[] value = new int[1];
            return egl.eglGetConfigAttrib(display, config, attribute, value) ? value[0] : defaultValue;
        }
    }

    private static final String TAG;
    private boolean hasFocus;
    private Cocos2dxEditBoxHelper mEditBoxHelper;
    protected ResizeLayout mFrameLayout;
    private int[] mGLContextAttrs;
    private Cocos2dxGLSurfaceView mGLSurfaceView;
    private Cocos2dxHandler mHandler;
    private Cocos2dxVideoHelper mVideoHelper;
    private Cocos2dxWebViewHelper mWebViewHelper;
    private static Cocos2dxActivity sContext;

    static {
        Cocos2dxActivity.TAG = "Cocos2dxActivity";
        Cocos2dxActivity.sContext = null;
    }

    public Cocos2dxActivity() {
        this.mGLSurfaceView = null;
        this.mGLContextAttrs = null;
        this.mHandler = null;
        this.mVideoHelper = null;
        this.mWebViewHelper = null;
        this.mEditBoxHelper = null;
        this.hasFocus = false;
        this.mFrameLayout = null;
    }

    public static Context getContext() {
        return Cocos2dxActivity.sContext;
    }

    private static native int[] getGLContextAttrs() {
    }

    public Cocos2dxGLSurfaceView getGLSurfaceView() {
        return this.mGLSurfaceView;
    }

    public void init() {
        ViewGroup.LayoutParams framelayout_params = new ViewGroup.LayoutParams(-1, -1);
        this.mFrameLayout = new ResizeLayout(this);
        this.mFrameLayout.setLayoutParams(framelayout_params);
        ViewGroup.LayoutParams edittext_layout_params = new ViewGroup.LayoutParams(-1, -2);
        Cocos2dxEditBox edittext = new Cocos2dxEditBox(this);
        edittext.setLayoutParams(edittext_layout_params);
        this.mFrameLayout.addView(edittext);
        this.mGLSurfaceView = this.onCreateView();
        this.mFrameLayout.addView(this.mGLSurfaceView);
        if(Cocos2dxActivity.isAndroidEmulator()) {
            this.mGLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        }
        this.mGLSurfaceView.setCocos2dxRenderer(new Cocos2dxRenderer());
        this.mGLSurfaceView.setCocos2dxEditText(edittext);
        this.setContentView(this.mFrameLayout);
    }

    private static final boolean isAndroidEmulator() {
        Log.d("Cocos2dxActivity", "model=" + Build.MODEL);
        String product = Build.PRODUCT;
        Log.d("Cocos2dxActivity", "product=" + product);
        boolean isEmulator = product != null && (product.equals("sdk") || product.contains("_sdk") || product.contains("sdk_"));
        Log.d("Cocos2dxActivity", "isEmulator=" + isEmulator);
        return isEmulator;
    }

    @Override  // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        for(Object object0: Cocos2dxHelper.getOnActivityResultListeners()) {
            ((PreferenceManager.OnActivityResultListener)object0).onActivityResult(requestCode, resultCode, data);
        }
        if(!SDKBox.onActivityResult(requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        if(!SDKBox.onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.onLoadNativeLibraries();
        SDKBox.init(this);
        Cocos2dxActivity.sContext = this;
        this.mHandler = new Cocos2dxHandler(this);
        Cocos2dxHelper.init(this);
        this.mGLContextAttrs = Cocos2dxActivity.getGLContextAttrs();
        this.init();
        if(this.mVideoHelper == null) {
            this.mVideoHelper = new Cocos2dxVideoHelper(this, this.mFrameLayout);
        }
        if(this.mWebViewHelper == null) {
            this.mWebViewHelper = new Cocos2dxWebViewHelper(this.mFrameLayout);
        }
        if(this.mEditBoxHelper == null) {
            this.mEditBoxHelper = new Cocos2dxEditBoxHelper(this.mFrameLayout);
        }
        this.getWindow().setSoftInputMode(0x20);
    }

    public Cocos2dxGLSurfaceView onCreateView() {
        Cocos2dxGLSurfaceView glSurfaceView = new Cocos2dxGLSurfaceView(this);
        if(this.mGLContextAttrs[3] > 0) {
            glSurfaceView.getHolder().setFormat(-3);
        }
        glSurfaceView.setEGLConfigChooser(new Cocos2dxEGLConfigChooser(this, this.mGLContextAttrs));
        return glSurfaceView;
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    protected void onLoadNativeLibraries() {
        try {
            System.loadLibrary(this.getPackageManager().getApplicationInfo("org.dyndns.vivi.SkskShogi", 0x80).metaData.getString("android.app.lib_name"));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override  // android.app.Activity
    protected void onPause() {
        Log.d("Cocos2dxActivity", "onPause()");
        super.onPause();
        SDKBox.onPause();
        Cocos2dxHelper.onPause();
        this.mGLSurfaceView.onPause();
    }

    @Override  // android.app.Activity
    protected void onResume() {
        Log.d("Cocos2dxActivity", "onResume()");
        super.onResume();
        SDKBox.onResume();
        this.resumeIfHasFocus();
    }

    @Override  // android.app.Activity
    protected void onStart() {
        super.onStart();
        SDKBox.onStart();
    }

    @Override  // android.app.Activity
    protected void onStop() {
        super.onStop();
        SDKBox.onStop();
    }

    @Override  // android.app.Activity
    public void onWindowFocusChanged(boolean hasFocus) {
        Log.d("Cocos2dxActivity", "onWindowFocusChanged() hasFocus=" + hasFocus);
        super.onWindowFocusChanged(hasFocus);
        this.hasFocus = hasFocus;
        this.resumeIfHasFocus();
    }

    private void resumeIfHasFocus() {
        if(this.hasFocus) {
            Cocos2dxHelper.onResume();
            this.mGLSurfaceView.onResume();
        }
    }

    @Override  // org.cocos2dx.lib.Cocos2dxHelper$Cocos2dxHelperListener
    public void runOnGLThread(Runnable pRunnable) {
        this.mGLSurfaceView.queueEvent(pRunnable);
    }

    public void setKeepScreenOn(boolean value) {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxActivity.this.mGLSurfaceView.setKeepScreenOn(value);
            }
        });
    }

    @Override  // org.cocos2dx.lib.Cocos2dxHelper$Cocos2dxHelperListener
    public void showDialog(String pTitle, String pMessage) {
        Message msg = new Message();
        msg.what = 1;
        msg.obj = new DialogMessage(pTitle, pMessage);
        this.mHandler.sendMessage(msg);
    }
}

