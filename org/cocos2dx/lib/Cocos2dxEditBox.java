package org.cocos2dx.lib;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;

public class Cocos2dxEditBox extends EditText {
    private final int kEditBoxInputFlagInitialCapsAllCharacters;
    private final int kEditBoxInputFlagInitialCapsSentence;
    private final int kEditBoxInputFlagInitialCapsWord;
    private final int kEditBoxInputFlagPassword;
    private final int kEditBoxInputFlagSensitive;
    private final int kEditBoxInputModeAny;
    private final int kEditBoxInputModeDecimal;
    private final int kEditBoxInputModeEmailAddr;
    private final int kEditBoxInputModeNumeric;
    private final int kEditBoxInputModePhoneNumber;
    private final int kEditBoxInputModeSingleLine;
    private final int kEditBoxInputModeUrl;
    private final int kKeyboardReturnTypeDefault;
    private final int kKeyboardReturnTypeDone;
    private final int kKeyboardReturnTypeGo;
    private final int kKeyboardReturnTypeSearch;
    private final int kKeyboardReturnTypeSend;
    private int mInputFlagConstraints;
    private int mInputModeConstraints;
    private int mMaxLength;
    private float mScaleX;

    public Cocos2dxEditBox(Context context) {
        super(context);
        this.kEditBoxInputModeAny = 0;
        this.kEditBoxInputModeEmailAddr = 1;
        this.kEditBoxInputModeNumeric = 2;
        this.kEditBoxInputModePhoneNumber = 3;
        this.kEditBoxInputModeUrl = 4;
        this.kEditBoxInputModeDecimal = 5;
        this.kEditBoxInputModeSingleLine = 6;
        this.kEditBoxInputFlagPassword = 0;
        this.kEditBoxInputFlagSensitive = 1;
        this.kEditBoxInputFlagInitialCapsWord = 2;
        this.kEditBoxInputFlagInitialCapsSentence = 3;
        this.kEditBoxInputFlagInitialCapsAllCharacters = 4;
        this.kKeyboardReturnTypeDefault = 0;
        this.kKeyboardReturnTypeDone = 1;
        this.kKeyboardReturnTypeSend = 2;
        this.kKeyboardReturnTypeSearch = 3;
        this.kKeyboardReturnTypeGo = 4;
    }

    public float getOpenGLViewScaleX() {
        return this.mScaleX;
    }

    @Override  // android.widget.TextView
    public boolean onKeyDown(int pKeyCode, KeyEvent pKeyEvent) {
        if(pKeyCode != 4) {
            return super.onKeyDown(pKeyCode, pKeyEvent);
        }
        ((Cocos2dxActivity)this.getContext()).getGLSurfaceView().requestFocus();
        return true;
    }

    @Override  // android.widget.TextView
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        return super.onKeyPreIme(keyCode, event);
    }

    public void setEditBoxViewRect(int left, int top, int maxWidth, int maxHeight) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = left;
        layoutParams.topMargin = top;
        layoutParams.width = maxWidth;
        layoutParams.height = maxHeight;
        layoutParams.gravity = 51;
        this.setLayoutParams(layoutParams);
    }

    public void setInputFlag(int inputFlag) {
        switch(inputFlag) {
            case 0: {
                this.mInputFlagConstraints = 0x81;
                this.setTypeface(Typeface.DEFAULT);
                this.setTransformationMethod(new PasswordTransformationMethod());
                break;
            }
            case 1: {
                this.mInputFlagConstraints = 0x80000;
                break;
            }
            case 2: {
                this.mInputFlagConstraints = 0x2000;
                break;
            }
            case 3: {
                this.mInputFlagConstraints = 0x4000;
                break;
            }
            case 4: {
                this.mInputFlagConstraints = 0x1000;
            }
        }
        this.setInputType(this.mInputFlagConstraints | this.mInputModeConstraints);
    }

    public void setInputMode(int inputMode) {
        switch(inputMode) {
            case 0: {
                this.mInputModeConstraints = 0x20001;
                break;
            }
            case 1: {
                this.mInputModeConstraints = 33;
                break;
            }
            case 2: {
                this.mInputModeConstraints = 0x1002;
                break;
            }
            case 3: {
                this.mInputModeConstraints = 3;
                break;
            }
            case 4: {
                this.mInputModeConstraints = 17;
                break;
            }
            case 5: {
                this.mInputModeConstraints = 0x3002;
                break;
            }
            case 6: {
                this.mInputModeConstraints = 1;
            }
        }
        this.setInputType(this.mInputModeConstraints | this.mInputFlagConstraints);
    }

    public void setMaxLength(int maxLength) {
        this.mMaxLength = maxLength;
        this.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.mMaxLength)});
    }

    public void setMultilineEnabled(boolean flag) {
        this.mInputModeConstraints |= 0x20000;
    }

    public void setOpenGLViewScaleX(float mScaleX) {
        this.mScaleX = mScaleX;
    }

    public void setReturnType(int returnType) {
        switch(returnType) {
            case 0: {
                this.setImeOptions(0x10000001);
                return;
            }
            case 1: {
                this.setImeOptions(0x10000006);
                return;
            }
            case 2: {
                this.setImeOptions(0x10000004);
                return;
            }
            case 3: {
                this.setImeOptions(0x10000003);
                return;
            }
            case 4: {
                this.setImeOptions(0x10000002);
                return;
            }
            default: {
                this.setImeOptions(0x10000001);
            }
        }
    }
}

