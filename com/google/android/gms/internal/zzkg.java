package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class zzkg extends Drawable implements Drawable.Callback {
    static final class zza extends Drawable {
        static final class com.google.android.gms.internal.zzkg.zza.zza extends Drawable.ConstantState {
            private com.google.android.gms.internal.zzkg.zza.zza() {
            }

            com.google.android.gms.internal.zzkg.zza.zza(com.google.android.gms.internal.zzkg.1 zzkg$10) {
            }

            @Override  // android.graphics.drawable.Drawable$ConstantState
            public int getChangingConfigurations() {
                return 0;
            }

            @Override  // android.graphics.drawable.Drawable$ConstantState
            public Drawable newDrawable() {
                return zza.zzZB;
            }
        }

        private static final zza zzZB;
        private static final com.google.android.gms.internal.zzkg.zza.zza zzZC;

        static {
            zza.zzZB = new zza();
            zza.zzZC = new com.google.android.gms.internal.zzkg.zza.zza(null);
        }

        @Override  // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override  // android.graphics.drawable.Drawable
        public Drawable.ConstantState getConstantState() {
            return zza.zzZC;
        }

        @Override  // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override  // android.graphics.drawable.Drawable
        public void setAlpha(int alpha) {
        }

        @Override  // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter cf) {
        }
    }

    static final class zzb extends Drawable.ConstantState {
        int zzZD;
        int zzZE;

        zzb(zzb zzkg$zzb0) {
            if(zzkg$zzb0 != null) {
                this.zzZD = zzkg$zzb0.zzZD;
                this.zzZE = zzkg$zzb0.zzZE;
            }
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return this.zzZD;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public Drawable newDrawable() {
            return new zzkg(this);
        }
    }

    private int mFrom;
    private long zzKT;
    private int zzZA;
    private boolean zzZh;
    private int zzZo;
    private int zzZp;
    private int zzZq;
    private int zzZr;
    private int zzZs;
    private boolean zzZt;
    private zzb zzZu;
    private Drawable zzZv;
    private Drawable zzZw;
    private boolean zzZx;
    private boolean zzZy;
    private boolean zzZz;

    public zzkg(Drawable drawable0, Drawable drawable1) {
        this(null);
        if(drawable0 == null) {
            drawable0 = zza.zzZB;
        }
        this.zzZv = drawable0;
        drawable0.setCallback(this);
        zzb zzkg$zzb0 = this.zzZu;
        zzkg$zzb0.zzZE |= drawable0.getChangingConfigurations();
        if(drawable1 == null) {
            drawable1 = zza.zzZB;
        }
        this.zzZw = drawable1;
        drawable1.setCallback(this);
        zzb zzkg$zzb1 = this.zzZu;
        zzkg$zzb1.zzZE |= drawable1.getChangingConfigurations();
    }

    zzkg(zzb zzkg$zzb0) {
        this.zzZo = 0;
        this.zzZq = 0xFF;
        this.zzZs = 0;
        this.zzZh = true;
        this.zzZu = new zzb(zzkg$zzb0);
    }

    public boolean canConstantState() {
        if(!this.zzZx) {
            this.zzZy = this.zzZv.getConstantState() != null && this.zzZw.getConstantState() != null;
            this.zzZx = true;
        }
        return this.zzZy;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int v = 1;
        int v1 = 0;
        switch(this.zzZo) {
            case 1: {
                this.zzKT = SystemClock.uptimeMillis();
                this.zzZo = 2;
                break;
            }
            case 2: {
                if(this.zzKT >= 0L) {
                    float f = ((float)(SystemClock.uptimeMillis() - this.zzKT)) / ((float)this.zzZr);
                    if(f < 1.0f) {
                        v = 0;
                    }
                    else {
                        this.zzZo = 0;
                    }
                    this.zzZs = (int)(Math.min(f, 1.0f) * ((float)(this.zzZp - this.mFrom)) + ((float)this.mFrom));
                }
                v1 = v;
                break;
            }
            default: {
                v1 = 1;
            }
        }
        int v2 = this.zzZs;
        boolean z = this.zzZh;
        Drawable drawable0 = this.zzZv;
        Drawable drawable1 = this.zzZw;
        if(v1 != 0) {
            if(!z || v2 == 0) {
                drawable0.draw(canvas);
            }
            if(v2 == this.zzZq) {
                drawable1.setAlpha(this.zzZq);
                drawable1.draw(canvas);
            }
            return;
        }
        if(z) {
            drawable0.setAlpha(this.zzZq - v2);
        }
        drawable0.draw(canvas);
        if(z) {
            drawable0.setAlpha(this.zzZq);
        }
        if(v2 > 0) {
            drawable1.setAlpha(v2);
            drawable1.draw(canvas);
            drawable1.setAlpha(this.zzZq);
        }
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.zzZu.zzZD | this.zzZu.zzZE;
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if(this.canConstantState()) {
            zzb zzkg$zzb0 = this.zzZu;
            zzkg$zzb0.zzZD = this.getChangingConfigurations();
            return this.zzZu;
        }
        return null;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.zzZv.getIntrinsicHeight(), this.zzZw.getIntrinsicHeight());
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.zzZv.getIntrinsicWidth(), this.zzZw.getIntrinsicWidth());
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        if(!this.zzZz) {
            this.zzZA = Drawable.resolveOpacity(this.zzZv.getOpacity(), this.zzZw.getOpacity());
            this.zzZz = true;
        }
        return this.zzZA;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(Drawable who) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.invalidateDrawable(this);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if(!this.zzZt && super.mutate() == this) {
            if(!this.canConstantState()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.zzZv.mutate();
            this.zzZw.mutate();
            this.zzZt = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        this.zzZv.setBounds(bounds);
        this.zzZw.setBounds(bounds);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.scheduleDrawable(this, what, when);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if(this.zzZs == this.zzZq) {
            this.zzZs = alpha;
        }
        this.zzZq = alpha;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
        this.zzZv.setColorFilter(cf);
        this.zzZw.setColorFilter(cf);
    }

    public void startTransition(int durationMillis) {
        this.mFrom = 0;
        this.zzZp = this.zzZq;
        this.zzZs = 0;
        this.zzZr = durationMillis;
        this.zzZo = 1;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(Drawable who, Runnable what) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.unscheduleDrawable(this, what);
        }
    }

    public Drawable zznp() {
        return this.zzZw;
    }

    class com.google.android.gms.internal.zzkg.1 {
    }

}

