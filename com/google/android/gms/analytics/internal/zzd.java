package com.google.android.gms.analytics.internal;

public abstract class zzd extends zzc {
    private boolean zzJA;
    private boolean zzJz;

    protected zzd(zzf zzf0) {
        super(zzf0);
    }

    // 去混淆评级： 低(20)
    public boolean isInitialized() {
        return this.zzJz && !this.zzJA;
    }

    public void zza() {
        this.zzhn();
        this.zzJz = true;
    }

    protected abstract void zzhn();

    protected void zzia() {
        if(!this.isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }
}

