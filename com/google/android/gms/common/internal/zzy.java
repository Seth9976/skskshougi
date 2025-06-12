package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.R.color;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.string;

public final class zzy extends Button {
    public zzy(Context context0) {
        this(context0, null);
    }

    public zzy(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x1010048);
    }

    private void zza(Resources resources0) {
        this.setTypeface(Typeface.DEFAULT_BOLD);
        this.setTextSize(14.0f);
        float f = resources0.getDisplayMetrics().density;
        this.setMinHeight(((int)(f * 48.0f + 0.5f)));
        this.setMinWidth(((int)(f * 48.0f + 0.5f)));
    }

    public void zza(Resources resources0, int v, int v1) {
        zzu.zza(v >= 0 && v < 3, "Unknown button size %d", new Object[]{v});
        zzu.zza(v1 >= 0 && v1 < 2, "Unknown color scheme %s", new Object[]{v1});
        this.zza(resources0);
        this.zzb(resources0, v, v1);
        this.zzc(resources0, v, v1);
    }

    private int zzb(int v, int v1, int v2) {
        switch(v) {
            case 0: {
                return v1;
            }
            case 1: {
                return v2;
            }
            default: {
                throw new IllegalStateException("Unknown color scheme: " + v);
            }
        }
    }

    private void zzb(Resources resources0, int v, int v1) {
        int v2;
        switch(v) {
            case 0: 
            case 1: {
                v2 = this.zzb(v1, drawable.common_signin_btn_text_dark, drawable.common_signin_btn_text_light);
                break;
            }
            case 2: {
                v2 = this.zzb(v1, drawable.common_signin_btn_icon_dark, drawable.common_signin_btn_icon_light);
                break;
            }
            default: {
                throw new IllegalStateException("Unknown button size: " + v);
            }
        }
        if(v2 == -1) {
            throw new IllegalStateException("Could not find background resource!");
        }
        this.setBackgroundDrawable(resources0.getDrawable(v2));
    }

    private void zzc(Resources resources0, int v, int v1) {
        this.setTextColor(resources0.getColorStateList(this.zzb(v1, color.common_signin_btn_text_dark, color.common_signin_btn_text_light)));
        switch(v) {
            case 0: {
                this.setText(resources0.getString(string.common_signin_button_text));
                return;
            }
            case 1: {
                this.setText(resources0.getString(string.common_signin_button_text_long));
                return;
            }
            case 2: {
                this.setText(null);
                return;
            }
            default: {
                throw new IllegalStateException("Unknown button size: " + v);
            }
        }
    }
}

