package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.zzf;
import java.util.List;

public class zzc implements zzf {
    public String zza(zzb zzb0, Object object0) {
        return String.format("contains(%s,%s)", zzb0.getName(), object0);
    }

    public String zza(Operator operator0, MetadataField metadataField0, Object object0) {
        return String.format("cmp(%s,%s,%s)", operator0.getTag(), metadataField0.getName(), object0);
    }

    public String zza(Operator operator0, List list0) {
        StringBuilder stringBuilder0 = new StringBuilder(operator0.getTag() + "(");
        String s = "";
        for(Object object0: list0) {
            stringBuilder0.append(s);
            stringBuilder0.append(((String)object0));
            s = ",";
        }
        return stringBuilder0.append(")").toString();
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzb(zzb zzb0, Object object0) {
        return this.zza(zzb0, object0);
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzb(Operator operator0, MetadataField metadataField0, Object object0) {
        return this.zza(operator0, metadataField0, object0);
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzb(Operator operator0, List list0) {
        return this.zza(operator0, list0);
    }

    public String zzc(MetadataField metadataField0, Object object0) {
        return String.format("has(%s,%s)", metadataField0.getName(), object0);
    }

    public String zzcA(String s) {
        return String.format("not(%s)", s);
    }

    public String zzcB(String s) {
        return String.format("fullTextSearch(%s)", s);
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzcC(String s) {
        return this.zzcB(s);
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzd(MetadataField metadataField0, Object object0) {
        return this.zzc(metadataField0, object0);
    }

    public String zzd(MetadataField metadataField0) {
        return String.format("fieldOnly(%s)", metadataField0.getName());
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zze(MetadataField metadataField0) {
        return this.zzd(metadataField0);
    }

    public String zzqc() [...] // Inlined contents

    public String zzqd() [...] // Inlined contents

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzqe() {
        return "ownedByMe()";
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzqf() {
        return "all()";
    }

    @Override  // com.google.android.gms.drive.query.internal.zzf
    public Object zzv(Object object0) {
        return this.zzcA(((String)object0));
    }
}

