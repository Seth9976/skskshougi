package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.dynamic.zzg.zza;

public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int mColor;
    private int mSize;
    private View zzVZ;
    private View.OnClickListener zzWa;

    public SignInButton(Context context) {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SignInButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.zzWa = null;
        this.setStyle(0, 0);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view) {
        if(this.zzWa != null && view == this.zzVZ) {
            this.zzWa.onClick(this);
        }
    }

    public void setColorScheme(int colorScheme) {
        this.setStyle(this.mSize, colorScheme);
    }

    @Override  // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.zzVZ.setEnabled(enabled);
    }

    @Override  // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        this.zzWa = listener;
        if(this.zzVZ != null) {
            this.zzVZ.setOnClickListener(this);
        }
    }

    public void setSize(int buttonSize) {
        this.setStyle(buttonSize, this.mColor);
    }

    public void setStyle(int buttonSize, int colorScheme) {
        zzu.zza(buttonSize >= 0 && buttonSize < 3, "Unknown button size %d", new Object[]{buttonSize});
        zzu.zza(colorScheme >= 0 && colorScheme < 2, "Unknown color scheme %s", new Object[]{colorScheme});
        this.mSize = buttonSize;
        this.mColor = colorScheme;
        this.zzaf(this.getContext());
    }

    private static Button zza(Context context0, int v, int v1) {
        Button button0 = new zzy(context0);
        ((zzy)button0).zza(context0.getResources(), v, v1);
        return button0;
    }

    private void zzaf(Context context0) {
        if(this.zzVZ != null) {
            this.removeView(this.zzVZ);
        }
        try {
            this.zzVZ = zzx.zzb(context0, this.mSize, this.mColor);
        }
        catch(zza unused_ex) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            this.zzVZ = SignInButton.zza(context0, this.mSize, this.mColor);
        }
        this.addView(this.zzVZ);
        this.zzVZ.setEnabled(this.isEnabled());
        this.zzVZ.setOnClickListener(this);
    }
}

