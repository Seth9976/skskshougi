package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import org.json.JSONObject;

public class zzbg implements zzbf {
    private final zzbe zzrh;
    private final HashSet zzri;

    public zzbg(zzbe zzbe0) {
        this.zzrh = zzbe0;
        this.zzri = new HashSet();
    }

    @Override  // com.google.android.gms.internal.zzbe
    public void zza(String s, zzdg zzdg0) {
        this.zzrh.zza(s, zzdg0);
        AbstractMap.SimpleEntry abstractMap$SimpleEntry0 = new AbstractMap.SimpleEntry(s, zzdg0);
        this.zzri.add(abstractMap$SimpleEntry0);
    }

    @Override  // com.google.android.gms.internal.zzbe
    public void zza(String s, String s1) {
        this.zzrh.zza(s, s1);
    }

    @Override  // com.google.android.gms.internal.zzbe
    public void zza(String s, JSONObject jSONObject0) {
        this.zzrh.zza(s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.zzbe
    public void zzb(String s, zzdg zzdg0) {
        this.zzrh.zzb(s, zzdg0);
        AbstractMap.SimpleEntry abstractMap$SimpleEntry0 = new AbstractMap.SimpleEntry(s, zzdg0);
        this.zzri.remove(abstractMap$SimpleEntry0);
    }

    @Override  // com.google.android.gms.internal.zzbf
    public void zzcg() {
        for(Object object0: this.zzri) {
            zzb.zzaB(("Unregistering eventhandler: " + ((zzdg)((AbstractMap.SimpleEntry)object0).getValue()).toString()));
            String s = (String)((AbstractMap.SimpleEntry)object0).getKey();
            zzdg zzdg0 = (zzdg)((AbstractMap.SimpleEntry)object0).getValue();
            this.zzrh.zzb(s, zzdg0);
        }
        this.zzri.clear();
    }
}

