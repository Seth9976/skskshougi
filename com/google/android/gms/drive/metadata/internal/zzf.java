package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;

public class zzf extends zza {
    public zzf(String s, int v) {
        super(s, v);
    }

    protected void zza(Bundle bundle0, Integer integer0) {
        bundle0.putInt(this.getName(), ((int)integer0));
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected void zza(Bundle bundle0, Object object0) {
        this.zza(bundle0, ((Integer)object0));
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzc(DataHolder dataHolder0, int v, int v1) {
        return this.zzg(dataHolder0, v, v1);
    }

    protected Integer zzg(DataHolder dataHolder0, int v, int v1) {
        return dataHolder0.zzc(this.getName(), v, v1);
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzj(Bundle bundle0) {
        return this.zzm(bundle0);
    }

    protected Integer zzm(Bundle bundle0) {
        return bundle0.getInt(this.getName());
    }
}

