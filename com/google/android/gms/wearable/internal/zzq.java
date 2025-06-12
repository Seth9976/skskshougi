package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzu;

public final class zzq extends zza {
    private zzj zzaTY;
    private zzr zzaUc;
    private final Object zzqt;

    public zzq() {
        this.zzqt = new Object();
    }

    public void zza(zzr zzr0) {
        zzj zzj0;
        synchronized(this.zzqt) {
            this.zzaUc = (zzr)zzu.zzu(zzr0);
            zzj0 = this.zzaTY;
        }
        if(zzj0 != null) {
            zzr0.zzb(zzj0);
        }
    }

    @Override  // com.google.android.gms.wearable.internal.zzaq
    public void zzw(int v, int v1) {
        zzj zzj0;
        zzr zzr0;
        synchronized(this.zzqt) {
            zzr0 = this.zzaUc;
            zzj0 = new zzj(v, v1);
            this.zzaTY = zzj0;
        }
        if(zzr0 != null) {
            zzr0.zzb(zzj0);
        }
    }
}

