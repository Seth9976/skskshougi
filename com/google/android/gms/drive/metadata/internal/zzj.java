package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.zza;
import java.util.Collection;

public abstract class zzj extends zza {
    public zzj(String s, Collection collection0, Collection collection1, int v) {
        super(s, collection0, collection1, v);
    }

    protected void zza(Bundle bundle0, Parcelable parcelable0) {
        bundle0.putParcelable(this.getName(), parcelable0);
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected void zza(Bundle bundle0, Object object0) {
        this.zza(bundle0, ((Parcelable)object0));
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzj(Bundle bundle0) {
        return this.zzp(bundle0);
    }

    protected Parcelable zzp(Bundle bundle0) {
        return bundle0.getParcelable(this.getName());
    }
}

