package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;

public class zzg extends zza {
    public zzg(String s, int v) {
        super(s, v);
    }

    protected void zza(Bundle bundle0, Long long0) {
        bundle0.putLong(this.getName(), ((long)long0));
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected void zza(Bundle bundle0, Object object0) {
        this.zza(bundle0, ((Long)object0));
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzc(DataHolder dataHolder0, int v, int v1) {
        return this.zzh(dataHolder0, v, v1);
    }

    protected Long zzh(DataHolder dataHolder0, int v, int v1) {
        return dataHolder0.zzb(this.getName(), v, v1);
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzj(Bundle bundle0) {
        return this.zzn(bundle0);
    }

    protected Long zzn(Bundle bundle0) {
        return bundle0.getLong(this.getName());
    }
}

