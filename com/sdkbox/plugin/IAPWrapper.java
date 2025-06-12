package com.sdkbox.plugin;

public class IAPWrapper {
    public static final int NULL_PRODUCT_LIST = 3;
    public static final int PAYRESULT_CANCEL = 2;
    public static final int PAYRESULT_FAIL = 1;
    public static final int PAYRESULT_NEEDS_VERIFICATION = 5;
    public static final int PAYRESULT_RESTORE = 3;
    public static final int PAYRESULT_SUCCESS = 0;
    public static final int PAYRESULT_TIMEOUT = 4;
    public static final int REQUEST_FAIL = 1;
    public static final int REQUEST_SUCCESS = 0;
    public static final int REQUEST_TIMEOUT = 2;

    // 检测为 lambda 实现。
    private static native void nativeOnInitialized(boolean arg0) {
    }

    // 检测为 lambda 实现。
    private static native void nativeOnPayResult(String arg0, int arg1, String arg2) {
    }

    // 检测为 lambda 实现。
    private static native void nativeOnPayResult2(String arg0, int arg1, String arg2, String arg3, String arg4) {
    }

    // 检测为 lambda 实现。
    private static native void nativeOnRequestResult(String arg0, int arg1, String arg2, String arg3) {
    }

    // 检测为 lambda 实现。
    private static native void nativeOnRestoreComplete(boolean arg0, String arg1) {
    }

    public static void onInitialized(boolean result) {
        SDKBox.runOnGLThread(() -> {
        });

        final class com.sdkbox.plugin.IAPWrapper.1 implements Runnable {
            com.sdkbox.plugin.IAPWrapper.1(boolean z) {
            }

            @Override
            public void run() {
                IAPWrapper.nativeOnInitialized(this.val$result);
            }
        }

    }

    public static void onPayResult(InterfaceIAP obj, int ret, String msg) {
        SDKBox.runOnGLThread(() -> {
        });

        final class com.sdkbox.plugin.IAPWrapper.2 implements Runnable {
            com.sdkbox.plugin.IAPWrapper.2(String s, int v, String s1) {
            }

            @Override
            public void run() {
                IAPWrapper.nativeOnPayResult(this.val$classname, this.val$curRet, this.val$curMsg);
            }
        }

    }

    public static void onPayResult(InterfaceIAP obj, int ret, String msg, String receipt, String payload) {
        SDKBox.runOnGLThread(() -> {
        });

        final class com.sdkbox.plugin.IAPWrapper.3 implements Runnable {
            com.sdkbox.plugin.IAPWrapper.3(String s, int v, String s1, String s2, String s3) {
            }

            @Override
            public void run() {
                IAPWrapper.nativeOnPayResult2(this.val$classname, this.val$ret, this.val$msg, this.val$receipt, this.val$payload);
            }
        }

    }

    public static void onRequestResult(InterfaceIAP obj, int ret, String msg, String data) {
        SDKBox.runOnGLThread(() -> {
        });

        final class com.sdkbox.plugin.IAPWrapper.4 implements Runnable {
            com.sdkbox.plugin.IAPWrapper.4(String s, int v, String s1, String s2) {
            }

            @Override
            public void run() {
                IAPWrapper.nativeOnRequestResult(this.val$classname, this.val$curRet, this.val$curMsg, this.val$curData);
            }
        }

    }

    public static void onRestoreComplete(boolean result, String msg) {
        SDKBox.runOnGLThread(() -> {
        });

        final class com.sdkbox.plugin.IAPWrapper.5 implements Runnable {
            com.sdkbox.plugin.IAPWrapper.5(boolean z, String s) {
            }

            @Override
            public void run() {
                IAPWrapper.nativeOnRestoreComplete(this.val$result, this.val$msg);
            }
        }

    }
}

