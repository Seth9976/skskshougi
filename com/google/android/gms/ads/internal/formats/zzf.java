package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzck;
import com.google.android.gms.internal.zzcs.zza;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzkw;
import java.util.Arrays;
import java.util.List;

@zzgd
public class zzf extends zza implements com.google.android.gms.ads.internal.formats.zzg.zza {
    private final Object zzqt;
    private final com.google.android.gms.ads.internal.formats.zza zzvp;
    private zzg zzvq;
    private final String zzvt;
    private final zzkw zzvu;
    private final zzkw zzvv;

    public zzf(String s, zzkw zzkw0, zzkw zzkw1, com.google.android.gms.ads.internal.formats.zza zza0) {
        this.zzqt = new Object();
        this.zzvt = s;
        this.zzvu = zzkw0;
        this.zzvv = zzkw1;
        this.zzvp = zza0;
    }

    @Override  // com.google.android.gms.internal.zzcs
    public List getAvailableAssetNames() {
        int v = 0;
        String[] arr_s = new String[this.zzvu.size() + this.zzvv.size()];
        int v2 = 0;
        for(int v1 = 0; v1 < this.zzvu.size(); ++v1) {
            arr_s[v2] = (String)this.zzvu.keyAt(v1);
            ++v2;
        }
        while(v < this.zzvv.size()) {
            arr_s[v2] = (String)this.zzvv.keyAt(v);
            ++v;
            ++v2;
        }
        return Arrays.asList(arr_s);
    }

    @Override  // com.google.android.gms.ads.internal.formats.zzg$zza, com.google.android.gms.internal.zzcs
    public String getCustomTemplateId() {
        return this.zzvt;
    }

    @Override  // com.google.android.gms.internal.zzcs
    public void performClick(String assetName) {
        synchronized(this.zzqt) {
            if(this.zzvq == null) {
                zzb.zzaz("Attempt to call performClick before ad initialized.");
                return;
            }
            this.zzvq.performClick(assetName);
        }
    }

    @Override  // com.google.android.gms.internal.zzcs
    public void recordImpression() {
        synchronized(this.zzqt) {
            if(this.zzvq == null) {
                zzb.zzaz("Attempt to perform recordImpression before ad initialized.");
                return;
            }
            this.zzvq.recordImpression();
        }
    }

    @Override  // com.google.android.gms.internal.zzcs
    public String zzQ(String s) {
        return (String)this.zzvv.get(s);
    }

    @Override  // com.google.android.gms.internal.zzcs
    public zzck zzR(String s) {
        return (zzck)this.zzvu.get(s);
    }

    @Override  // com.google.android.gms.ads.internal.formats.zzg$zza
    public void zza(zzg zzg0) {
        synchronized(this.zzqt) {
            this.zzvq = zzg0;
        }
    }

    @Override  // com.google.android.gms.ads.internal.formats.zzg$zza
    public String zzdE() {
        return "3";
    }

    @Override  // com.google.android.gms.ads.internal.formats.zzg$zza
    public com.google.android.gms.ads.internal.formats.zza zzdF() {
        return this.zzvp;
    }
}

