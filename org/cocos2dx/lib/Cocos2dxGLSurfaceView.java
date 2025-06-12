package org.cocos2dx.lib;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;

public class Cocos2dxGLSurfaceView extends GLSurfaceView {
    private static final int HANDLER_CLOSE_IME_KEYBOARD = 3;
    private static final int HANDLER_OPEN_IME_KEYBOARD = 2;
    private static final String TAG;
    private Cocos2dxEditBox mCocos2dxEditText;
    private static Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;
    private Cocos2dxRenderer mCocos2dxRenderer;
    private boolean mSoftKeyboardShown;
    private static Cocos2dxTextInputWraper sCocos2dxTextInputWraper;
    private static Handler sHandler;

    static {
        Cocos2dxGLSurfaceView.TAG = "Cocos2dxGLSurfaceView";
    }

    public Cocos2dxGLSurfaceView(Context context) {
        super(context);
        this.mSoftKeyboardShown = false;
        this.initView();
    }

    public Cocos2dxGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mSoftKeyboardShown = false;
        this.initView();
    }

    public static void closeIMEKeyboard() {
        Message msg = new Message();
        msg.what = 3;
        Cocos2dxGLSurfaceView.sHandler.sendMessage(msg);
    }

    public void deleteBackward() {
        this.queueEvent(new Runnable() {
            @Override
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleDeleteBackward();
            }
        });
    }

    private static void dumpMotionEvent(MotionEvent event) {
        StringBuilder sb = new StringBuilder();
        int v = event.getAction();
        sb.append("event ACTION_").append(new String[]{"DOWN", "UP", "MOVE", "CANCEL", "OUTSIDE", "POINTER_DOWN", "POINTER_UP", "7?", "8?", "9?"}[v & 0xFF]);
        if((v & 0xFF) == 5 || (v & 0xFF) == 6) {
            sb.append("(pid ").append(v >> 8);
            sb.append(")");
        }
        sb.append("[");
        for(int i = 0; i < event.getPointerCount(); ++i) {
            sb.append("#").append(i);
            sb.append("(pid ").append(event.getPointerId(i));
            sb.append(")=").append(((int)event.getX(i)));
            sb.append(",").append(((int)event.getY(i)));
            if(i + 1 < event.getPointerCount()) {
                sb.append(";");
            }
        }
        sb.append("]");
        Log.d("Cocos2dxGLSurfaceView", sb.toString());
    }

    public Cocos2dxEditBox getCocos2dxEditText() {
        return this.mCocos2dxEditText;
    }

    private String getContentText() {
        return this.mCocos2dxRenderer.getContentText();
    }

    public static Cocos2dxGLSurfaceView getInstance() {
        return Cocos2dxGLSurfaceView.mCocos2dxGLSurfaceView;
    }

    protected void initView() {
        this.setEGLContextClientVersion(2);
        this.setFocusableInTouchMode(true);
        Cocos2dxGLSurfaceView.mCocos2dxGLSurfaceView = this;
        Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper = new Cocos2dxTextInputWraper(this);
        Cocos2dxGLSurfaceView.sHandler = new Handler() {
            @Override  // android.os.Handler
            public void handleMessage(Message msg) {
                switch(msg.what) {
                    case 2: {
                        if(Cocos2dxGLSurfaceView.this.mCocos2dxEditText != null && Cocos2dxGLSurfaceView.this.mCocos2dxEditText.requestFocus()) {
                            Cocos2dxGLSurfaceView.this.mCocos2dxEditText.removeTextChangedListener(Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper);
                            Cocos2dxGLSurfaceView.this.mCocos2dxEditText.setText("");
                            String text = (String)msg.obj;
                            Cocos2dxGLSurfaceView.this.mCocos2dxEditText.append(text);
                            Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper.setOriginText(text);
                            Cocos2dxGLSurfaceView.this.mCocos2dxEditText.addTextChangedListener(Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper);
                            ((InputMethodManager)Cocos2dxGLSurfaceView.mCocos2dxGLSurfaceView.getContext().getSystemService("input_method")).showSoftInput(Cocos2dxGLSurfaceView.this.mCocos2dxEditText, 0);
                            Log.d("GLSurfaceView", "showSoftInput");
                            return;
                        }
                        break;
                    }
                    case 3: {
                        if(Cocos2dxGLSurfaceView.this.mCocos2dxEditText != null) {
                            Cocos2dxGLSurfaceView.this.mCocos2dxEditText.removeTextChangedListener(Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper);
                            ((InputMethodManager)Cocos2dxGLSurfaceView.mCocos2dxGLSurfaceView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(Cocos2dxGLSurfaceView.this.mCocos2dxEditText.getWindowToken(), 0);
                            Cocos2dxGLSurfaceView.this.requestFocus();
                            Log.d("GLSurfaceView", "HideSoftInput");
                            return;
                        }
                        break;
                    }
                }
            }
        };
    }

    public void insertText(String pText) {
        this.queueEvent(new Runnable() {
            @Override
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleInsertText(pText);
            }
        });
    }

    public boolean isSoftKeyboardShown() {
        return this.mSoftKeyboardShown;
    }

    @Override  // android.view.View
    public boolean onKeyDown(int pKeyCode, KeyEvent pKeyEvent) {
        switch(pKeyCode) {
            case 4: {
                Cocos2dxVideoHelper.mVideoHandler.sendEmptyMessage(1000);
                break;
            }
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 66: 
            case 82: 
            case 85: {
                break;
            }
            default: {
                return super.onKeyDown(pKeyCode, pKeyEvent);
            }
        }
        this.queueEvent(new Runnable() {
            @Override
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleKeyDown(pKeyCode);
            }
        });
        return true;
    }

    @Override  // android.view.View
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch(keyCode) {
            case 4: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 66: 
            case 82: 
            case 85: {
                this.queueEvent(new Runnable() {
                    @Override
                    public void run() {
                        Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleKeyUp(keyCode);
                    }
                });
                return true;
            }
            default: {
                return super.onKeyUp(keyCode, event);
            }
        }
    }

    @Override  // android.opengl.GLSurfaceView
    public void onPause() {
        this.queueEvent(new Runnable() {
            @Override
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleOnPause();
            }
        });
        this.setRenderMode(0);
    }

    @Override  // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.setRenderMode(1);
        this.queueEvent(new Runnable() {
            @Override
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleOnResume();
            }
        });
    }

    @Override  // android.view.View
    protected void onSizeChanged(int pNewSurfaceWidth, int pNewSurfaceHeight, int pOldSurfaceWidth, int pOldSurfaceHeight) {
        if(!this.isInEditMode()) {
            this.mCocos2dxRenderer.setScreenWidthAndHeight(pNewSurfaceWidth, pNewSurfaceHeight);
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent pMotionEvent) {
        int v = pMotionEvent.getPointerCount();
        int[] ids = new int[v];
        float[] arr_f = new float[v];
        float[] arr_f1 = new float[v];
        if(this.mSoftKeyboardShown) {
            ((InputMethodManager)this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(((Activity)this.getContext()).getCurrentFocus().getWindowToken(), 0);
            this.requestFocus();
            this.mSoftKeyboardShown = false;
        }
        for(int i = 0; i < v; ++i) {
            ids[i] = pMotionEvent.getPointerId(i);
            arr_f[i] = pMotionEvent.getX(i);
            arr_f1[i] = pMotionEvent.getY(i);
        }
        switch(pMotionEvent.getAction() & 0xFF) {
            case 0: {
                this.queueEvent(new Runnable() {
                    @Override
                    public void run() {
                        Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionDown(pMotionEvent.getPointerId(0), arr_f[0], arr_f1[0]);
                    }
                });
                return true;
            }
            case 1: {
                this.queueEvent(new Runnable() {
                    @Override
                    public void run() {
                        Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionUp(pMotionEvent.getPointerId(0), arr_f[0], arr_f1[0]);
                    }
                });
                return true;
            }
            case 2: {
                this.queueEvent(new Runnable() {
                    @Override
                    public void run() {
                        Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionMove(ids, arr_f, arr_f1);
                    }
                });
                return true;
            }
            case 3: {
                this.queueEvent(new Runnable() {
                    @Override
                    public void run() {
                        Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionCancel(ids, arr_f, arr_f1);
                    }
                });
                return true;
            }
            case 5: {
                int v2 = pMotionEvent.getAction();
                this.queueEvent(new Runnable() {
                    @Override
                    public void run() {
                        Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionDown(pMotionEvent.getPointerId(v2 >> 8), pMotionEvent.getX(v2 >> 8), pMotionEvent.getY(v2 >> 8));
                    }
                });
                return true;
            }
            case 6: {
                int v3 = pMotionEvent.getAction();
                this.queueEvent(new Runnable() {
                    @Override
                    public void run() {
                        Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionUp(pMotionEvent.getPointerId(v3 >> 8), pMotionEvent.getX(v3 >> 8), pMotionEvent.getY(v3 >> 8));
                    }
                });
                return true;
            }
            default: {
                return true;
            }
        }
    }

    public static void openIMEKeyboard() {
        Message msg = new Message();
        msg.what = 2;
        msg.obj = Cocos2dxGLSurfaceView.mCocos2dxGLSurfaceView.getContentText();
        Cocos2dxGLSurfaceView.sHandler.sendMessage(msg);
    }

    public static void queueAccelerometer(float x, float y, float z, long timestamp) {
        Cocos2dxGLSurfaceView.mCocos2dxGLSurfaceView.queueEvent(new Runnable() {
            @Override
            public void run() {
                Cocos2dxAccelerometer.onSensorChanged(x, y, z, timestamp);
            }
        });
    }

    public void setCocos2dxEditText(Cocos2dxEditBox pCocos2dxEditText) {
        this.mCocos2dxEditText = pCocos2dxEditText;
        if(this.mCocos2dxEditText != null && Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper != null) {
            this.mCocos2dxEditText.setOnEditorActionListener(Cocos2dxGLSurfaceView.sCocos2dxTextInputWraper);
            this.requestFocus();
        }
    }

    public void setCocos2dxRenderer(Cocos2dxRenderer renderer) {
        this.mCocos2dxRenderer = renderer;
        this.setRenderer(this.mCocos2dxRenderer);
    }

    public void setSoftKeyboardShown(boolean softKeyboardShown) {
        this.mSoftKeyboardShown = softKeyboardShown;
    }
}

