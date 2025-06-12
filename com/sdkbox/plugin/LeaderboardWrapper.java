package com.sdkbox.plugin;

public class LeaderboardWrapper {
    // 检测为 lambda 实现。
    private static native void nativeOnComplete(String arg0) {
    }

    // 检测为 lambda 实现。
    private static native void nativeOnFailed() {
    }

    public static void onComplete(String result) {
        SDKBox.runOnGLThread(() -> {
        });

        final class com.sdkbox.plugin.LeaderboardWrapper.1 implements Runnable {
            com.sdkbox.plugin.LeaderboardWrapper.1(String s) {
            }

            @Override
            public void run() {
                LeaderboardWrapper.nativeOnComplete(this.val$result);
            }
        }

    }

    public static void onFail() {
        SDKBox.runOnGLThread(() -> {
        });

        final class com.sdkbox.plugin.LeaderboardWrapper.2 implements Runnable {
            @Override
            public void run() {
                LeaderboardWrapper.nativeOnFailed();
            }
        }

    }
}

