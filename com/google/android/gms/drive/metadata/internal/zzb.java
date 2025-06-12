package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;
import java.util.Collection;

public class zzb extends zza {
    public zzb(String s, int v) {
        super(s, v);
    }

    public zzb(String s, Collection collection0, Collection collection1, int v) {
        super(s, collection0, collection1, v);
    }

    protected void zza(Bundle bundle0, Boolean boolean0) {
        bundle0.putBoolean(this.getName(), boolean0.booleanValue());
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected void zza(Bundle bundle0, Object object0) {
        this.zza(bundle0, ((Boolean)object0));
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzc(DataHolder dataHolder0, int v, int v1) {
        return this.zze(dataHolder0, v, v1);
    }

    protected Boolean zze(DataHolder dataHolder0, int v, int v1) {
        return Boolean.valueOf(dataHolder0.zze(this.getName(), v, v1));
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzj(Bundle bundle0) {
        return this.zzk(bundle0);
    }

    protected Boolean zzk(Bundle bundle0) {
        return Boolean.valueOf(bundle0.getBoolean(this.getName()));
    }
}

