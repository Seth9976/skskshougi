package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.zzb;
import java.util.ArrayList;
import java.util.Collection;

public class zzi extends zzb {
    public zzi(String s, Collection collection0, Collection collection1, int v) {
        super(s, collection0, collection1, v);
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected void zza(Bundle bundle0, Object object0) {
        this.zza(bundle0, ((Collection)object0));
    }

    protected void zza(Bundle bundle0, Collection collection0) {
        bundle0.putParcelableArrayList(this.getName(), (collection0 instanceof ArrayList ? ((ArrayList)collection0) : new ArrayList(collection0)));
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzj(Bundle bundle0) {
        return this.zzo(bundle0);
    }

    protected Collection zzo(Bundle bundle0) {
        return bundle0.getParcelableArrayList(this.getName());
    }
}

