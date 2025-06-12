package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.widget.ImageView;

public final class zzki extends ImageView {
    public interface zza {
        Path zzk(int arg1, int arg2);
    }

    private Uri zzZF;
    private int zzZG;
    private int zzZH;
    private zza zzZI;
    private int zzZJ;
    private float zzZK;

    @Override  // android.widget.ImageView
    protected void onDraw(Canvas canvas) {
        if(this.zzZI != null) {
            canvas.clipPath(this.zzZI.zzk(this.getWidth(), this.getHeight()));
        }
        super.onDraw(canvas);
        if(this.zzZH != 0) {
            canvas.drawColor(this.zzZH);
        }
    }

    @Override  // android.widget.ImageView
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int v3;
        int v2;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        switch(this.zzZJ) {
            case 1: {
                v2 = this.getMeasuredHeight();
                v3 = (int)(((float)v2) * this.zzZK);
                break;
            }
            case 2: {
                v3 = this.getMeasuredWidth();
                v2 = (int)(((float)v3) / this.zzZK);
                break;
            }
            default: {
                return;
            }
        }
        this.setMeasuredDimension(v3, v2);
    }

    public void zzbo(int v) {
        this.zzZG = v;
    }

    public void zzi(Uri uri0) {
        this.zzZF = uri0;
    }

    public int zznr() {
        return this.zzZG;
    }
}

