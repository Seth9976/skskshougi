package org.cocos2dx.lib;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ResizeLayout extends FrameLayout {
    private boolean mEnableForceDoLayout;

    public ResizeLayout(Context context) {
        super(context);
        this.mEnableForceDoLayout = false;
    }

    public ResizeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mEnableForceDoLayout = false;
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        if(this.mEnableForceDoLayout) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ResizeLayout.this.requestLayout();
                    ResizeLayout.this.invalidate();
                }
            }, 41L);
        }
    }

    public void setEnableForceDoLayout(boolean flag) {
        this.mEnableForceDoLayout = flag;
    }
}

