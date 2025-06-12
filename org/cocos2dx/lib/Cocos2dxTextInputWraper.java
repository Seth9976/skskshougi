package org.cocos2dx.lib;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

public class Cocos2dxTextInputWraper implements TextWatcher, TextView.OnEditorActionListener {
    private static final String TAG;
    private final Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;
    private String mOriginText;
    private String mText;

    static {
        Cocos2dxTextInputWraper.TAG = "Cocos2dxTextInputWraper";
    }

    public Cocos2dxTextInputWraper(Cocos2dxGLSurfaceView pCocos2dxGLSurfaceView) {
        this.mCocos2dxGLSurfaceView = pCocos2dxGLSurfaceView;
    }

    @Override  // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        if(this.isFullScreenEdit()) {
            return;
        }
        int old_i = 0;
        int new_i;
        for(new_i = 0; old_i < this.mText.length() && new_i < s.length() && this.mText.charAt(old_i) == s.charAt(new_i); ++new_i) {
            ++old_i;
        }
        while(old_i < this.mText.length()) {
            this.mCocos2dxGLSurfaceView.deleteBackward();
            ++old_i;
        }
        if(s.length() - new_i > 0) {
            String s = s.subSequence(new_i, s.length()).toString();
            this.mCocos2dxGLSurfaceView.insertText(s);
        }
        this.mText = s.toString();
    }

    @Override  // android.text.TextWatcher
    public void beforeTextChanged(CharSequence pCharSequence, int start, int count, int after) {
        this.mText = pCharSequence.toString();
    }

    private boolean isFullScreenEdit() {
        return ((InputMethodManager)this.mCocos2dxGLSurfaceView.getCocos2dxEditText().getContext().getSystemService("input_method")).isFullscreenMode();
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public boolean onEditorAction(TextView pTextView, int pActionID, KeyEvent pKeyEvent) {
        if(this.mCocos2dxGLSurfaceView.getCocos2dxEditText() == pTextView && this.isFullScreenEdit()) {
            if(this.mOriginText != null) {
                for(int i = this.mOriginText.length(); i > 0; --i) {
                    this.mCocos2dxGLSurfaceView.deleteBackward();
                }
            }
            String text = pTextView.getText().toString();
            if(text != null) {
                if(text.compareTo("") == 0) {
                    text = "\n";
                }
                if(10 != text.charAt(text.length() - 1)) {
                    text = text + '\n';
                }
            }
            this.mCocos2dxGLSurfaceView.insertText(text);
        }
        if(pActionID == 6) {
            this.mCocos2dxGLSurfaceView.requestFocus();
        }
        return false;
    }

    @Override  // android.text.TextWatcher
    public void onTextChanged(CharSequence pCharSequence, int start, int before, int count) {
    }

    public void setOriginText(String pOriginText) {
        this.mOriginText = pOriginText;
    }
}

