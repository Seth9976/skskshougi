package org.cocos2dx.lib;

import java.util.ArrayList;

public class GameControllerAdapter {
    private static ArrayList sRunnableFrameStartList;

    static {
        GameControllerAdapter.sRunnableFrameStartList = null;
    }

    public static void addRunnableToFrameStartList(Runnable runnable) {
        if(GameControllerAdapter.sRunnableFrameStartList == null) {
            GameControllerAdapter.sRunnableFrameStartList = new ArrayList();
        }
        GameControllerAdapter.sRunnableFrameStartList.add(runnable);
    }

    // 检测为 lambda 实现。
    private static native void nativeControllerAxisEvent(String arg0, int arg1, int arg2, float arg3, boolean arg4) {
    }

    // 检测为 lambda 实现。
    private static native void nativeControllerButtonEvent(String arg0, int arg1, int arg2, boolean arg3, float arg4, boolean arg5) {
    }

    // 检测为 lambda 实现。
    private static native void nativeControllerConnected(String arg0, int arg1) {
    }

    // 检测为 lambda 实现。
    private static native void nativeControllerDisconnected(String arg0, int arg1) {
    }

    public static void onAxisEvent(String vendorName, int controller, int axisID, float value, boolean isAnalog) {
        Cocos2dxHelper.runOnGLThread(() -> {
        });

        final class org.cocos2dx.lib.GameControllerAdapter.4 implements Runnable {
            org.cocos2dx.lib.GameControllerAdapter.4(String s, int v, int v1, float f, boolean z) {
            }

            @Override
            public void run() {
                GameControllerAdapter.nativeControllerAxisEvent(this.val$vendorName, this.val$controller, this.val$axisID, this.val$value, this.val$isAnalog);
            }
        }

    }

    public static void onButtonEvent(String vendorName, int controller, int button, boolean isPressed, float value, boolean isAnalog) {
        Cocos2dxHelper.runOnGLThread(() -> {
        });

        final class org.cocos2dx.lib.GameControllerAdapter.3 implements Runnable {
            org.cocos2dx.lib.GameControllerAdapter.3(String s, int v, int v1, boolean z, float f, boolean z1) {
            }

            @Override
            public void run() {
                GameControllerAdapter.nativeControllerButtonEvent(this.val$vendorName, this.val$controller, this.val$button, this.val$isPressed, this.val$value, this.val$isAnalog);
            }
        }

    }

    public static void onConnected(String vendorName, int controller) {
        Cocos2dxHelper.runOnGLThread(() -> {
        });

        final class org.cocos2dx.lib.GameControllerAdapter.1 implements Runnable {
            org.cocos2dx.lib.GameControllerAdapter.1(String s, int v) {
            }

            @Override
            public void run() {
                GameControllerAdapter.nativeControllerConnected(this.val$vendorName, this.val$controller);
            }
        }

    }

    public static void onDisconnected(String vendorName, int controller) {
        Cocos2dxHelper.runOnGLThread(() -> {
        });

        final class org.cocos2dx.lib.GameControllerAdapter.2 implements Runnable {
            org.cocos2dx.lib.GameControllerAdapter.2(String s, int v) {
            }

            @Override
            public void run() {
                GameControllerAdapter.nativeControllerDisconnected(this.val$vendorName, this.val$controller);
            }
        }

    }

    public static void onDrawFrameStart() {
        if(GameControllerAdapter.sRunnableFrameStartList != null) {
            int v = GameControllerAdapter.sRunnableFrameStartList.size();
            for(int i = 0; i < v; ++i) {
                ((Runnable)GameControllerAdapter.sRunnableFrameStartList.get(i)).run();
            }
        }
    }

    public static void removeRunnableFromFrameStartList(Runnable runnable) {
        if(GameControllerAdapter.sRunnableFrameStartList != null) {
            GameControllerAdapter.sRunnableFrameStartList.remove(runnable);
        }
    }
}

