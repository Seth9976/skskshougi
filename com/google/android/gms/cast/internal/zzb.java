package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zza;

public abstract class zzb extends zza {
    public zzb(GoogleApiClient googleApiClient0) {
        super(zzk.zzNX, googleApiClient0);
    }

    public void zzaL(int v) {
        this.setResult(this.createFailedResult(new Status(v)));
    }

    public void zzd(int v, String s) {
        this.setResult(this.createFailedResult(new Status(v, s, null)));
    }
}

