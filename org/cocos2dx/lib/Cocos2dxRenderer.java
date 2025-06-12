package org.cocos2dx.lib;

import android.opengl.GLSurfaceView.Renderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class Cocos2dxRenderer implements GLSurfaceView.Renderer {
    private static final long NANOSECONDSPERMICROSECOND = 1000000L;
    private static final long NANOSECONDSPERSECOND = 1000000000L;
    private long mLastTickInNanoSeconds;
    private boolean mNativeInitCompleted;
    private int mScreenHeight;
    private int mScreenWidth;
    private static long sAnimationInterval;

    static {
        Cocos2dxRenderer.sAnimationInterval = 0xFE502AL;
    }

    public Cocos2dxRenderer() {
        this.mNativeInitCompleted = false;
    }

    public String getContentText() {
        return Cocos2dxRenderer.nativeGetContentText();
    }

    public void handleActionCancel(int[] ids, float[] xs, float[] ys) {
        Cocos2dxRenderer.nativeTouchesCancel(ids, xs, ys);
    }

    public void handleActionDown(int id, float x, float y) {
        Cocos2dxRenderer.nativeTouchesBegin(id, x, y);
    }

    public void handleActionMove(int[] ids, float[] xs, float[] ys) {
        Cocos2dxRenderer.nativeTouchesMove(ids, xs, ys);
    }

    public void handleActionUp(int id, float x, float y) {
        Cocos2dxRenderer.nativeTouchesEnd(id, x, y);
    }

    public void handleDeleteBackward() {
        Cocos2dxRenderer.nativeDeleteBackward();
    }

    public void handleInsertText(String text) {
        Cocos2dxRenderer.nativeInsertText(text);
    }

    public void handleKeyDown(int keyCode) {
        Cocos2dxRenderer.nativeKeyEvent(keyCode, true);
    }

    public void handleKeyUp(int keyCode) {
        Cocos2dxRenderer.nativeKeyEvent(keyCode, false);
    }

    public void handleOnPause() {
        if(!this.mNativeInitCompleted) {
            return;
        }
        Cocos2dxHelper.onEnterBackground();
        Cocos2dxRenderer.nativeOnPause();
    }

    public void handleOnResume() {
        Cocos2dxHelper.onEnterForeground();
        Cocos2dxRenderer.nativeOnResume();
    }

    private static native void nativeDeleteBackward() {
    }

    private static native String nativeGetContentText() {
    }

    private static native void nativeInit(int arg0, int arg1) {
    }

    private static native void nativeInsertText(String arg0) {
    }

    private static native boolean nativeKeyEvent(int arg0, boolean arg1) {
    }

    private static native void nativeOnPause() {
    }

    private static native void nativeOnResume() {
    }

    private static native void nativeOnSurfaceChanged(int arg0, int arg1) {
    }

    private static native void nativeRender() {
    }

    private static native void nativeTouchesBegin(int arg0, float arg1, float arg2) {
    }

    private static native void nativeTouchesCancel(int[] arg0, float[] arg1, float[] arg2) {
    }

    private static native void nativeTouchesEnd(int arg0, float arg1, float arg2) {
    }

    private static native void nativeTouchesMove(int[] arg0, float[] arg1, float[] arg2) {
    }

    @Override  // android.opengl.GLSurfaceView$Renderer
    public void onDrawFrame(GL10 gl) {
        if(((double)Cocos2dxRenderer.sAnimationInterval) <= 16666666.666667) {
            Cocos2dxRenderer.nativeRender();
            return;
        }
        long interval = System.nanoTime() - this.mLastTickInNanoSeconds;
        if(interval < Cocos2dxRenderer.sAnimationInterval) {
            try {
                Thread.sleep((Cocos2dxRenderer.sAnimationInterval - interval) / 1000000L);
            }
            catch(Exception unused_ex) {
            }
        }
        this.mLastTickInNanoSeconds = System.nanoTime();
        Cocos2dxRenderer.nativeRender();
    }

    @Override  // android.opengl.GLSurfaceView$Renderer
    public void onSurfaceChanged(GL10 GL10, int width, int height) {
        Cocos2dxRenderer.nativeOnSurfaceChanged(width, height);
    }

    @Override  // android.opengl.GLSurfaceView$Renderer
    public void onSurfaceCreated(GL10 GL10, EGLConfig EGLConfig) {
        Cocos2dxRenderer.nativeInit(this.mScreenWidth, this.mScreenHeight);
        this.mLastTickInNanoSeconds = System.nanoTime();
        this.mNativeInitCompleted = true;
    }

    public static void setAnimationInterval(float animationInterval) {
        Cocos2dxRenderer.sAnimationInterval = (long)(1000000000.0f * animationInterval);
    }

    public void setScreenWidthAndHeight(int surfaceWidth, int surfaceHeight) {
        this.mScreenWidth = surfaceWidth;
        this.mScreenHeight = surfaceHeight;
    }
}

