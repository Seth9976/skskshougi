package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzab;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.plus.internal.zzg;

public final class PlusOneButton extends FrameLayout {
    public class DefaultOnPlusOneClickListener implements View.OnClickListener, OnPlusOneClickListener {
        private final OnPlusOneClickListener zzaHh;
        final PlusOneButton zzaHi;

        public DefaultOnPlusOneClickListener(OnPlusOneClickListener proxy) {
            this.zzaHh = proxy;
        }

        @Override  // android.view.View$OnClickListener
        public void onClick(View view) {
            Intent intent0 = (Intent)PlusOneButton.this.zzaHd.getTag();
            if(this.zzaHh != null) {
                this.zzaHh.onPlusOneClick(intent0);
                return;
            }
            this.onPlusOneClick(intent0);
        }

        @Override  // com.google.android.gms.plus.PlusOneButton$OnPlusOneClickListener
        public void onPlusOneClick(Intent intent) {
            Context context0 = PlusOneButton.this.getContext();
            if(context0 instanceof Activity && intent != null) {
                ((Activity)context0).startActivityForResult(intent, PlusOneButton.this.zzaHf);
            }
        }
    }

    public interface OnPlusOneClickListener {
        void onPlusOneClick(Intent arg1);
    }

    public static final int ANNOTATION_BUBBLE = 1;
    public static final int ANNOTATION_INLINE = 2;
    public static final int ANNOTATION_NONE = 0;
    public static final int DEFAULT_ACTIVITY_REQUEST_CODE = -1;
    public static final int SIZE_MEDIUM = 1;
    public static final int SIZE_SMALL = 0;
    public static final int SIZE_STANDARD = 3;
    public static final int SIZE_TALL = 2;
    private int mSize;
    private String zzF;
    private View zzaHd;
    private int zzaHe;
    private int zzaHf;
    private OnPlusOneClickListener zzaHg;

    public PlusOneButton(Context context) {
        this(context, null);
    }

    public PlusOneButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mSize = PlusOneButton.getSize(context, attrs);
        this.zzaHe = PlusOneButton.getAnnotation(context, attrs);
        this.zzaHf = -1;
        this.zzaf(this.getContext());
        this.isInEditMode();
    }

    protected static int getAnnotation(Context context, AttributeSet attrs) {
        String s = zzab.zza("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attrs, true, false, "PlusOneButton");
        if("INLINE".equalsIgnoreCase(s)) {
            return 2;
        }
        return "NONE".equalsIgnoreCase(s) ? 0 : 1;
    }

    protected static int getSize(Context context, AttributeSet attrs) {
        String s = zzab.zza("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attrs, true, false, "PlusOneButton");
        if("SMALL".equalsIgnoreCase(s)) {
            return 0;
        }
        if("MEDIUM".equalsIgnoreCase(s)) {
            return 1;
        }
        return "TALL".equalsIgnoreCase(s) ? 2 : 3;
    }

    public void initialize(String url, int activityRequestCode) {
        zzu.zza(this.getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
        this.zzF = url;
        this.zzaHf = activityRequestCode;
        this.zzaf(this.getContext());
    }

    public void initialize(String url, OnPlusOneClickListener plusOneClickListener) {
        this.zzF = url;
        this.zzaHf = 0;
        this.zzaf(this.getContext());
        this.setOnPlusOneClickListener(plusOneClickListener);
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.zzaHd.layout(0, 0, right - left, bottom - top);
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        View view0 = this.zzaHd;
        this.measureChild(view0, widthMeasureSpec, heightMeasureSpec);
        this.setMeasuredDimension(view0.getMeasuredWidth(), view0.getMeasuredHeight());
    }

    public void plusOneClick() {
        this.zzaHd.performClick();
    }

    public void setAnnotation(int annotation) {
        this.zzaHe = annotation;
        this.zzaf(this.getContext());
    }

    public void setIntent(Intent intent) {
        this.zzaHd.setTag(intent);
    }

    public void setOnPlusOneClickListener(OnPlusOneClickListener listener) {
        this.zzaHg = listener;
        this.zzaHd.setOnClickListener(new DefaultOnPlusOneClickListener(this, listener));
    }

    public void setSize(int size) {
        this.mSize = size;
        this.zzaf(this.getContext());
    }

    private void zzaf(Context context0) {
        if(this.zzaHd != null) {
            this.removeView(this.zzaHd);
        }
        this.zzaHd = zzg.zza(context0, this.mSize, this.zzaHe, this.zzF, this.zzaHf);
        this.setOnPlusOneClickListener(this.zzaHg);
        this.addView(this.zzaHd);
    }
}

