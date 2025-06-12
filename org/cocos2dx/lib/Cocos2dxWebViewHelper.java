package org.cocos2dx.lib;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Cocos2dxWebViewHelper {
    private static final String TAG;
    private static Cocos2dxActivity sCocos2dxActivity;
    private static Handler sHandler;
    private static FrameLayout sLayout;
    private static int viewTag;
    private static SparseArray webViews;

    static {
        Cocos2dxWebViewHelper.TAG = "Cocos2dxWebViewHelper";
        Cocos2dxWebViewHelper.viewTag = 0;
    }

    public Cocos2dxWebViewHelper(FrameLayout layout) {
        Cocos2dxWebViewHelper.sLayout = layout;
        Cocos2dxWebViewHelper.sHandler = new Handler(Looper.myLooper());
        Cocos2dxWebViewHelper.sCocos2dxActivity = (Cocos2dxActivity)Cocos2dxActivity.getContext();
        Cocos2dxWebViewHelper.webViews = new SparseArray();
    }

    public static void _didFailLoading(int index, String message) {
        Cocos2dxWebViewHelper.didFailLoading(index, message);
    }

    public static void _didFinishLoading(int index, String message) {
        Cocos2dxWebViewHelper.didFinishLoading(index, message);
    }

    public static void _onJsCallback(int index, String message) {
        Cocos2dxWebViewHelper.onJsCallback(index, message);
    }

    public static boolean _shouldStartLoading(int index, String message) {
        return !Cocos2dxWebViewHelper.shouldStartLoading(index, message);
    }

    public static Object callInMainThread(Callable callable0) throws ExecutionException, InterruptedException {
        FutureTask task = new FutureTask(callable0);
        Cocos2dxWebViewHelper.sHandler.post(task);
        return task.get();
    }

    public static boolean canGoBack(int index) {
        org.cocos2dx.lib.Cocos2dxWebViewHelper.12 callable = new Callable() {
            public Boolean call() throws Exception {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                return webView == null || !webView.canGoBack() ? false : true;
            }
        };
        try {
            return ((Boolean)Cocos2dxWebViewHelper.callInMainThread(callable)).booleanValue();
        }
        catch(ExecutionException unused_ex) {
            return false;
        }
        catch(InterruptedException unused_ex) {
            return false;
        }
    }

    public static boolean canGoForward(int index) {
        org.cocos2dx.lib.Cocos2dxWebViewHelper.13 callable = new Callable() {
            public Boolean call() throws Exception {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                return webView == null || !webView.canGoForward() ? false : true;
            }
        };
        try {
            return ((Boolean)Cocos2dxWebViewHelper.callInMainThread(callable)).booleanValue();
        }
        catch(ExecutionException unused_ex) {
            return false;
        }
        catch(InterruptedException unused_ex) {
            return false;
        }
    }

    public static int createWebView() {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = new Cocos2dxWebView(Cocos2dxWebViewHelper.sCocos2dxActivity, Cocos2dxWebViewHelper.viewTag);
                Cocos2dxWebViewHelper.sLayout.addView(webView, new FrameLayout.LayoutParams(-2, -2));
                Cocos2dxWebViewHelper.webViews.put(Cocos2dxWebViewHelper.viewTag, webView);
            }
        });
        int v = Cocos2dxWebViewHelper.viewTag;
        Cocos2dxWebViewHelper.viewTag = v + 1;
        return v;
    }

    private static native void didFailLoading(int arg0, String arg1) {
    }

    private static native void didFinishLoading(int arg0, String arg1) {
    }

    public static void evaluateJS(int index, String js) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.loadUrl("javascript:" + js);
                }
            }
        });
    }

    public static void goBack(int index) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.goBack();
                }
            }
        });
    }

    public static void goForward(int index) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.goForward();
                }
            }
        });
    }

    public static void loadData(int index, String data, String mimeType, String encoding, String baseURL) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.loadDataWithBaseURL(baseURL, data, mimeType, encoding, null);
                }
            }
        });
    }

    public static void loadFile(int index, String filePath) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.loadUrl(filePath);
                }
            }
        });
    }

    public static void loadHTMLString(int index, String data, String baseUrl) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.loadDataWithBaseURL(baseUrl, data, null, null, null);
                }
            }
        });
    }

    public static void loadUrl(int index, String url) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.loadUrl(url);
                }
            }
        });
    }

    private static native void onJsCallback(int arg0, String arg1) {
    }

    public static void reload(int index) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.reload();
                }
            }
        });
    }

    public static void removeWebView(int index) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    Cocos2dxWebViewHelper.webViews.remove(index);
                    Cocos2dxWebViewHelper.sLayout.removeView(webView);
                }
            }
        });
    }

    public static void setJavascriptInterfaceScheme(int index, String scheme) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.setJavascriptInterfaceScheme(scheme);
                }
            }
        });
    }

    public static void setScalesPageToFit(int index, boolean scalesPageToFit) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.setScalesPageToFit(scalesPageToFit);
                }
            }
        });
    }

    public static void setVisible(int index, boolean visible) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.setVisibility((visible ? 0 : 8));
                }
            }
        });
    }

    public static void setWebViewRect(int index, int left, int top, int maxWidth, int maxHeight) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.setWebViewRect(left, top, maxWidth, maxHeight);
                }
            }
        });
    }

    private static native boolean shouldStartLoading(int arg0, String arg1) {
    }

    public static void stopLoading(int index) {
        Cocos2dxWebViewHelper.sCocos2dxActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Cocos2dxWebView webView = (Cocos2dxWebView)Cocos2dxWebViewHelper.webViews.get(index);
                if(webView != null) {
                    webView.stopLoading();
                }
            }
        });
    }
}

