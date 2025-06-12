package org.cocos2dx.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;
import java.net.URI;
import java.util.concurrent.CountDownLatch;

public class Cocos2dxWebView extends WebView {
    class Cocos2dxWebViewClient extends WebViewClient {
        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            ((Cocos2dxActivity)Cocos2dxWebView.this.getContext()).runOnGLThread(new Runnable() {
                @Override
                public void run() {
                    Cocos2dxWebViewHelper._didFinishLoading(Cocos2dxWebView.this.mViewTag, url);
                }
            });
        }

        @Override  // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            ((Cocos2dxActivity)Cocos2dxWebView.this.getContext()).runOnGLThread(new Runnable() {
                @Override
                public void run() {
                    Cocos2dxWebViewHelper._didFailLoading(Cocos2dxWebView.this.mViewTag, failingUrl);
                }
            });
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String urlString) {
            Cocos2dxActivity activity = (Cocos2dxActivity)Cocos2dxWebView.this.getContext();
            try {
                URI uRI0 = URI.create(urlString);
                if(uRI0 != null && uRI0.getScheme().equals(Cocos2dxWebView.this.mJSScheme)) {
                    activity.runOnGLThread(new Runnable() {
                        @Override
                        public void run() {
                            Cocos2dxWebViewHelper._onJsCallback(Cocos2dxWebView.this.mViewTag, urlString);
                        }
                    });
                    return true;
                }
            }
            catch(Exception unused_ex) {
                Log.d("Cocos2dxWebViewHelper", "Failed to create URI from url");
            }
            boolean[] arr_z = {true};
            CountDownLatch latch = new CountDownLatch(1);
            activity.runOnGLThread(new ShouldStartLoadingWorker(latch, arr_z, Cocos2dxWebView.this.mViewTag, urlString));
            try {
                latch.await();
                return arr_z[0];
            }
            catch(InterruptedException unused_ex) {
                Log.d("Cocos2dxWebViewHelper", "\'shouldOverrideUrlLoading\' failed");
                return arr_z[0];
            }
        }
    }

    private static final String TAG;
    private String mJSScheme;
    private int mViewTag;

    static {
        Cocos2dxWebView.TAG = "Cocos2dxWebViewHelper";
    }

    public Cocos2dxWebView(Context context) {
        this(context, -1);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public Cocos2dxWebView(Context context, int viewTag) {
        super(context);
        this.mViewTag = viewTag;
        this.mJSScheme = "";
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.getSettings().setSupportZoom(false);
        this.getSettings().setJavaScriptEnabled(true);
        try {
            this.getClass().getMethod("removeJavascriptInterface", String.class).invoke(this, "searchBoxJavaBridge_");
        }
        catch(Exception unused_ex) {
            Log.d("Cocos2dxWebViewHelper", "This API level do not support `removeJavascriptInterface`");
        }
        this.setWebViewClient(new Cocos2dxWebViewClient(this));
        this.setWebChromeClient(new WebChromeClient());
    }

    // 去混淆评级： 低(20)
    static String access$200() [...] // Potential decryptor

    public void setJavascriptInterfaceScheme(String scheme) {
        if(scheme == null) {
            scheme = "";
        }
        this.mJSScheme = scheme;
    }

    public void setScalesPageToFit(boolean scalesPageToFit) {
        this.getSettings().setSupportZoom(scalesPageToFit);
    }

    public void setWebViewRect(int left, int top, int maxWidth, int maxHeight) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = left;
        layoutParams.topMargin = top;
        layoutParams.width = maxWidth;
        layoutParams.height = maxHeight;
        layoutParams.gravity = 51;
        this.setLayoutParams(layoutParams);
    }
}

