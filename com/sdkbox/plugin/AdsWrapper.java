package com.sdkbox.plugin;

import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;

public class AdsWrapper {
    public static final int POS_BOTTOM = 4;
    public static final int POS_BOTTOM_LEFT = 5;
    public static final int POS_BOTTOM_RIGHT = 6;
    public static final int POS_CENTER = 0;
    public static final int POS_TOP = 1;
    public static final int POS_TOP_LEFT = 2;
    public static final int POS_TOP_RIGHT = 3;
    public static final int RESULT_CODE_AdsDismissed = 2;
    public static final int RESULT_CODE_AdsReceived = 0;
    public static final int RESULT_CODE_AdsShown = 1;
    public static final int RESULT_CODE_NetworkError = 5;
    public static final int RESULT_CODE_PointsSpendFailed = 4;
    public static final int RESULT_CODE_PointsSpendSucceed = 3;
    public static final int RESULT_CODE_UnknownError = 6;

    public static void addAdView(WindowManager mWm, View adView, int pos) {
        WindowManager.LayoutParams mLayoutParams = new WindowManager.LayoutParams();
        mLayoutParams.type = 1000;
        mLayoutParams.width = -2;
        mLayoutParams.height = -2;
        mLayoutParams.flags |= 8;
        switch(pos) {
            case 0: {
                mLayoutParams.gravity = 17;
                break;
            }
            case 1: {
                mLayoutParams.gravity = 0x30;
                break;
            }
            case 2: {
                mLayoutParams.gravity = 51;
                break;
            }
            case 3: {
                mLayoutParams.gravity = 53;
                break;
            }
            case 4: {
                mLayoutParams.gravity = 80;
                break;
            }
            case 5: {
                mLayoutParams.gravity = 83;
                break;
            }
            case 6: {
                mLayoutParams.gravity = 85;
            }
        }
        mWm.addView(adView, mLayoutParams);
    }

    // 检测为 lambda 实现。
    private static native void nativeOnAdsResult(String arg0, int arg1, String arg2) {
    }

    // 检测为 lambda 实现。
    private static native void nativeOnPlayerGetPoints(String arg0, int arg1) {
    }

    public static void onAdsResult(InterfaceAds adapter, int code, String msg) {
        SDKBox.runOnGLThread(() -> {
        });

        final class com.sdkbox.plugin.AdsWrapper.1 implements Runnable {
            com.sdkbox.plugin.AdsWrapper.1(InterfaceAds interfaceAds0, int v, String s) {
            }

            @Override
            public void run() {
                AdsWrapper.nativeOnAdsResult(this.val$curObj.getClass().getName().replace('.', '/'), this.val$curCode, this.val$curMsg);
            }
        }

    }

    public static void onPlayerGetPoints(InterfaceAds adapter, int points) {
        SDKBox.runOnGLThread(() -> {
        });

        final class com.sdkbox.plugin.AdsWrapper.2 implements Runnable {
            com.sdkbox.plugin.AdsWrapper.2(InterfaceAds interfaceAds0, int v) {
            }

            @Override
            public void run() {
                AdsWrapper.nativeOnPlayerGetPoints(this.val$curAdapter.getClass().getName().replace('.', '/'), this.val$curPoints);
            }
        }

    }
}

