package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzck;
import com.google.android.gms.internal.zzcq.zza;
import com.google.android.gms.internal.zzgd;
import java.util.List;

@zzgd
public class zze extends zza implements com.google.android.gms.ads.internal.formats.zzg.zza {
    private final Object zzqt;
    private final String zzvh;
    private final List zzvi;
    private final String zzvj;
    private final String zzvl;
    private final com.google.android.gms.ads.internal.formats.zza zzvp;
    private zzg zzvq;
    private final zzc zzvr;
    private final String zzvs;

    public zze(String s, List list0, String s1, zzc zzc0, String s2, String s3, com.google.android.gms.ads.internal.formats.zza zza0) {
        this.zzqt = new Object();
        this.zzvh = s;
        this.zzvi = list0;
        this.zzvj = s1;
        this.zzvr = zzc0;
        this.zzvl = s2;
        this.zzvs = s3;
        this.zzvp = zza0;
    }

    @Override  // com.google.android.gms.internal.zzcq
    public String getBody() {
        return this.zzvj;
    }

    @Override  // com.google.android.gms.ads.internal.formats.zzg$zza
    public String getCustomTemplateId() {
        return "";
    }

    @Override  // com.google.android.gms.internal.zzcq
    public List getImages() {
        return this.zzvi;
    }

    @Override  // com.google.android.gms.ads.internal.formats.zzg$zza
    public void zza(zzg zzg0) {
        synchronized(this.zzqt) {
            this.zzvq = zzg0;
        }
    }

    @Override  // com.google.android.gms.internal.zzcq
    public zzd zzdD() {
        return com.google.android.gms.dynamic.zze.zzw(this.zzvq);
    }

    @Override  // com.google.android.gms.ads.internal.formats.zzg$zza
    public String zzdE() {
        return "1";
    }

    @Override  // com.google.android.gms.ads.internal.formats.zzg$zza
    public com.google.android.gms.ads.internal.formats.zza zzdF() {
        return this.zzvp;
    }

    @Override  // com.google.android.gms.internal.zzcq
    public zzck zzdG() {
        return this.zzvr;
    }

    @Override  // com.google.android.gms.internal.zzcq
    public String zzdH() {
        return this.zzvs;
    }

    @Override  // com.google.android.gms.internal.zzcq
    public String zzdx() {
        return this.zzvh;
    }

    @Override  // com.google.android.gms.internal.zzcq
    public String zzdz() {
        return this.zzvl;
    }
}

