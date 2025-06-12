package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;

public class zzo extends zza {
    public zzo(String s, int v) {
        super(s, v);
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected void zza(Bundle bundle0, Object object0) {
        this.zza(bundle0, ((String)object0));
    }

    protected void zza(Bundle bundle0, String s) {
        bundle0.putString(this.getName(), s);
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzc(DataHolder dataHolder0, int v, int v1) {
        return this.zzi(dataHolder0, v, v1);
    }

    protected String zzi(DataHolder dataHolder0, int v, int v1) {
        return dataHolder0.zzd(this.getName(), v, v1);
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzj(Bundle bundle0) {
        return this.zzq(bundle0);
    }

    protected String zzq(Bundle bundle0) {
        return bundle0.getString(this.getName());
    }
}

