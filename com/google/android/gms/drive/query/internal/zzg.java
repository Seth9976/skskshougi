package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import com.google.android.gms.drive.query.Filter;
import java.util.List;

public class zzg implements zzf {
    private Boolean zzaid;

    private zzg() {
        this.zzaid = Boolean.FALSE;
    }

    public static boolean zza(Filter filter0) {
        return filter0 == null ? false : ((Boolean)filter0.zza(new zzg())).booleanValue();
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzb(zzb zzb0, Object object0) {
        return this.zzc(zzb0, object0);
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzb(Operator operator0, MetadataField metadataField0, Object object0) {
        return this.zzc(operator0, metadataField0, object0);
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzb(Operator operator0, List list0) {
        return this.zzc(operator0, list0);
    }

    public Boolean zzc(zzb zzb0, Object object0) {
        return this.zzaid;
    }

    public Boolean zzc(Operator operator0, MetadataField metadataField0, Object object0) {
        return this.zzaid;
    }

    public Boolean zzc(Operator operator0, List list0) {
        return this.zzaid;
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzcC(String s) {
        return this.zzcD(s);
    }

    public Boolean zzcD(String s) {
        if(!s.isEmpty()) {
            this.zzaid = Boolean.TRUE;
        }
        return this.zzaid;
    }

    public Boolean zzd(Boolean boolean0) {
        return this.zzaid;
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzd(MetadataField metadataField0, Object object0) {
        return this.zze(metadataField0, object0);
    }

    public Boolean zze(MetadataField metadataField0, Object object0) {
        return this.zzaid;
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zze(MetadataField metadataField0) {
        return this.zzf(metadataField0);
    }

    public Boolean zzf(MetadataField metadataField0) {
        return this.zzaid;
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzqe() {
        return this.zzqh();
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzqf() {
        return this.zzqg();
    }

    public Boolean zzqg() {
        return this.zzaid;
    }

    public Boolean zzqh() {
        return this.zzaid;
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzv(Object object0) {
        return this.zzd(((Boolean)object0));
    }
}

