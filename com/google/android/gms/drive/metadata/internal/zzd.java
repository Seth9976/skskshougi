package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Date;

public class zzd extends com.google.android.gms.drive.metadata.zzd {
    public zzd(String s, int v) {
        super(s, v);
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected void zza(Bundle bundle0, Object object0) {
        this.zza(bundle0, ((Date)object0));
    }

    protected void zza(Bundle bundle0, Date date0) {
        bundle0.putLong(this.getName(), date0.getTime());
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzc(DataHolder dataHolder0, int v, int v1) {
        return this.zzf(dataHolder0, v, v1);
    }

    protected Date zzf(DataHolder dataHolder0, int v, int v1) {
        return new Date(dataHolder0.zzb(this.getName(), v, v1));
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzj(Bundle bundle0) {
        return this.zzl(bundle0);
    }

    protected Date zzl(Bundle bundle0) {
        return new Date(bundle0.getLong(this.getName()));
    }
}

