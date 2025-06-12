package com.google.android.gms.internal;

import java.util.concurrent.TimeUnit;

@zzgd
public class zzht implements zzhv {
    private final Object zzGK;
    private final zzhw zzGM;

    public zzht(Object object0) {
        this.zzGK = object0;
        this.zzGM = new zzhw();
        this.zzGM.zzgy();
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public Object get() {
        return this.zzGK;
    }

    @Override
    public Object get(long timeout, TimeUnit unit) {
        return this.zzGK;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    @Override  // com.google.android.gms.internal.zzhv
    public void zzb(Runnable runnable0) {
        this.zzGM.zzb(runnable0);
    }
}

