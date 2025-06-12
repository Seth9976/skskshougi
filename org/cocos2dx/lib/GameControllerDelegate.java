package org.cocos2dx.lib;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

public interface GameControllerDelegate {
    public interface ControllerEventListener {
        void onAxisEvent(String arg1, int arg2, int arg3, float arg4, boolean arg5);

        void onButtonEvent(String arg1, int arg2, int arg3, boolean arg4, float arg5, boolean arg6);

        void onConnected(String arg1, int arg2);

        void onDisconnected(String arg1, int arg2);
    }

    public static final int BUTTON_A = 1004;
    public static final int BUTTON_B = 1005;
    public static final int BUTTON_C = 1006;
    public static final int BUTTON_DPAD_CENTER = 0x3F6;
    public static final int BUTTON_DPAD_DOWN = 0x3F3;
    public static final int BUTTON_DPAD_LEFT = 0x3F4;
    public static final int BUTTON_DPAD_RIGHT = 0x3F5;
    public static final int BUTTON_DPAD_UP = 1010;
    public static final int BUTTON_LEFT_SHOULDER = 0x3F7;
    public static final int BUTTON_LEFT_THUMBSTICK = 0x3FB;
    public static final int BUTTON_LEFT_TRIGGER = 0x3F9;
    public static final int BUTTON_RIGHT_SHOULDER = 0x3F8;
    public static final int BUTTON_RIGHT_THUMBSTICK = 1020;
    public static final int BUTTON_RIGHT_TRIGGER = 0x3FA;
    public static final int BUTTON_SELECT = 0x3FE;
    public static final int BUTTON_START = 0x3FD;
    public static final int BUTTON_X = 1007;
    public static final int BUTTON_Y = 0x3F0;
    public static final int BUTTON_Z = 1009;
    public static final int KEY_BASE = 1000;
    public static final int THUMBSTICK_LEFT_X = 1000;
    public static final int THUMBSTICK_LEFT_Y = 1001;
    public static final int THUMBSTICK_RIGHT_X = 1002;
    public static final int THUMBSTICK_RIGHT_Y = 1003;

    boolean dispatchGenericMotionEvent(MotionEvent arg1);

    boolean dispatchKeyEvent(KeyEvent arg1);

    void onCreate(Context arg1);

    void onDestroy();

    void onPause();

    void onResume();

    void setControllerEventListener(ControllerEventListener arg1);
}

