package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class zza implements MetadataField {
    private final Set zzagA;
    private final int zzagB;
    private final String zzagy;
    private final Set zzagz;

    protected zza(String s, int v) {
        this.zzagy = (String)zzu.zzb(s, "fieldName");
        this.zzagz = Collections.singleton(s);
        this.zzagA = Collections.emptySet();
        this.zzagB = v;
    }

    protected zza(String s, Collection collection0, Collection collection1, int v) {
        this.zzagy = (String)zzu.zzb(s, "fieldName");
        this.zzagz = Collections.unmodifiableSet(new HashSet(collection0));
        this.zzagA = Collections.unmodifiableSet(new HashSet(collection1));
        this.zzagB = v;
    }

    @Override  // com.google.android.gms.drive.metadata.MetadataField
    public final String getName() {
        return this.zzagy;
    }

    @Override
    public String toString() {
        return this.zzagy;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.drive.metadata.MetadataField
    public final Object zza(DataHolder dataHolder0, int v, int v1) {
        return this.zzb(dataHolder0, v, v1) ? this.zzc(dataHolder0, v, v1) : null;
    }

    protected abstract void zza(Bundle arg1, Object arg2);

    @Override  // com.google.android.gms.drive.metadata.MetadataField
    public final void zza(DataHolder dataHolder0, MetadataBundle metadataBundle0, int v, int v1) {
        zzu.zzb(dataHolder0, "dataHolder");
        zzu.zzb(metadataBundle0, "bundle");
        if(this.zzb(dataHolder0, v, v1)) {
            metadataBundle0.zzb(this, this.zzc(dataHolder0, v, v1));
        }
    }

    @Override  // com.google.android.gms.drive.metadata.MetadataField
    public final void zza(Object object0, Bundle bundle0) {
        zzu.zzb(bundle0, "bundle");
        if(object0 == null) {
            bundle0.putString(this.getName(), null);
            return;
        }
        this.zza(bundle0, object0);
    }

    protected boolean zzb(DataHolder dataHolder0, int v, int v1) {
        for(Object object0: this.zzagz) {
            if(!dataHolder0.zzbV(((String)object0)) || dataHolder0.zzi(((String)object0), v, v1)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    protected abstract Object zzc(DataHolder arg1, int arg2, int arg3);

    @Override  // com.google.android.gms.drive.metadata.MetadataField
    public final Object zzi(Bundle bundle0) {
        zzu.zzb(bundle0, "bundle");
        return bundle0.get(this.getName()) == null ? null : this.zzj(bundle0);
    }

    protected abstract Object zzj(Bundle arg1);
}

