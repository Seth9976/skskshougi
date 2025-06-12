package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.Map;

@zzgd
public class zzds implements zzdg {
    @Override  // com.google.android.gms.internal.zzdg
    public void zza(zzid zzid0, Map map0) {
        zzdq zzdq0 = zzo.zzbH();
        if(map0.containsKey("abort")) {
            if(!zzdq0.zza(zzid0)) {
                zzb.zzaC("Precache abort but no preload task running.");
            }
            return;
        }
        String s = (String)map0.get("src");
        if(s == null) {
            zzb.zzaC("Precache video action is missing the src parameter.");
            return;
        }
        if(zzdq0.zzb(zzid0)) {
            zzb.zzaC("Precache task already running.");
            return;
        }
        new zzdp(zzid0, s).zzgi();
    }
}

