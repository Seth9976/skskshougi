package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzd;
import java.util.HashMap;
import java.util.Map;

@zzgd
public class zzdm implements zzdg {
    private final zzd zzww;
    private final zzep zzwx;
    static final Map zzwy;

    static {
        zzdm.zzwy = new HashMap();
        zzdm.zzwy.put("resize", 1);
        zzdm.zzwy.put("playVideo", 2);
        zzdm.zzwy.put("storePicture", 3);
        zzdm.zzwy.put("createCalendarEvent", 4);
        zzdm.zzwy.put("setOrientationProperties", 5);
        zzdm.zzwy.put("closeResizedAd", 6);
    }

    public zzdm(zzd zzd0, zzep zzep0) {
        this.zzww = zzd0;
        this.zzwx = zzep0;
    }

    @Override  // com.google.android.gms.internal.zzdg
    public void zza(zzid zzid0, Map map0) {
        String s = (String)map0.get("a");
        int v = (int)(((Integer)zzdm.zzwy.get(s)));
        if(v != 5 && this.zzww != null && !this.zzww.zzbd()) {
            this.zzww.zzo(null);
            return;
        }
        switch(v) {
            case 1: {
                this.zzwx.zzh(map0);
                return;
            }
            case 3: {
                new zzer(zzid0, map0).execute();
                return;
            }
            case 4: {
                new zzeo(zzid0, map0).execute();
                return;
            }
            case 5: {
                new zzeq(zzid0, map0).execute();
                return;
            }
            case 6: {
                this.zzwx.zzn(true);
                return;
            }
            default: {
                zzb.zzaA("Unknown MRAID command called.");
            }
        }
    }
}

