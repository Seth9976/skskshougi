package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzck;
import com.google.android.gms.internal.zzco.zza;
import com.google.android.gms.internal.zzgd;
import java.util.List;

@zzgd
public class zzd extends zza implements com.google.android.gms.ads.internal.formats.zzg.zza {
    private final Object zzqt;
    private final String zzvh;
    private final List zzvi;
    private final String zzvj;
    private final zzc zzvk;
    private final String zzvl;
    private final double zzvm;
    private final String zzvn;
    private final String zzvo;
    private final com.google.android.gms.ads.internal.formats.zza zzvp;
    private zzg zzvq;

    public zzd(String s, List list0, String s1, zzc zzc0, String s2, double f, String s3, String s4, com.google.android.gms.ads.internal.formats.zza zza0) {
        this.zzqt = new Object();
        this.zzvh = s;
        this.zzvi = list0;
        this.zzvj = s1;
        this.zzvk = zzc0;
        this.zzvl = s2;
        this.zzvm = f;
        this.zzvn = s3;
        this.zzvo = s4;
        this.zzvp = zza0;
    }

    @Override  // com.google.android.gms.internal.zzco
    public String getBody() {
        return this.zzvj;
    }

    @Override  // com.google.android.gms.ads.internal.formats.zzg$zza
    public String getCustomTemplateId() {
        return "";
    }

    @Override  // com.google.android.gms.internal.zzco
    public List getImages() {
        return this.zzvi;
    }

    @Override  // com.google.android.gms.ads.internal.formats.zzg$zza
    public void zza(zzg zzg0) {
        synchronized(this.zzqt) {
            this.zzvq = zzg0;
        }
    }

    @Override  // com.google.android.gms.internal.zzco
    public double zzdA() {
        return this.zzvm;
    }

    @Override  // com.google.android.gms.internal.zzco
    public String zzdB() {
        return this.zzvn;
    }

    @Override  // com.google.android.gms.internal.zzco
    public String zzdC() {
        return this.zzvo;
    }

    @Override  // com.google.android.gms.internal.zzco
    public com.google.android.gms.dynamic.zzd zzdD() {
        return zze.zzw(this.zzvq);
    }

    @Override  // com.google.android.gms.ads.internal.formats.zzg$zza
    public String zzdE() {
        return "2";
    }

    @Override  // com.google.android.gms.ads.internal.formats.zzg$zza
    public com.google.android.gms.ads.internal.formats.zza zzdF() {
        return this.zzvp;
    }

    @Override  // com.google.android.gms.internal.zzco
    public String zzdx() {
        return this.zzvh;
    }

    @Override  // com.google.android.gms.internal.zzco
    public zzck zzdy() {
        return this.zzvk;
    }

    @Override  // com.google.android.gms.internal.zzco
    public String zzdz() {
        return this.zzvl;
    }
}

