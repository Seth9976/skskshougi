package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzaf.zzc;
import com.google.android.gms.internal.zzaf.zzd;
import com.google.android.gms.internal.zzaf.zzi;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzaj {
    private static void zza(DataLayer dataLayer0, zzd zzaf$zzd0) {
        zza[] arr_zzag$zza = zzaf$zzd0.zzhX;
        for(int v = 0; v < arr_zzag$zza.length; ++v) {
            dataLayer0.zzen(zzdf.zzg(arr_zzag$zza[v]));
        }
    }

    public static void zza(DataLayer dataLayer0, zzi zzaf$zzi0) {
        if(zzaf$zzi0.zziM == null) {
            zzbg.zzaC("supplemental missing experimentSupplemental");
            return;
        }
        zzaj.zza(dataLayer0, zzaf$zzi0.zziM);
        zzaj.zzb(dataLayer0, zzaf$zzi0.zziM);
        zzaj.zzc(dataLayer0, zzaf$zzi0.zziM);
    }

    private static void zzb(DataLayer dataLayer0, zzd zzaf$zzd0) {
        zza[] arr_zzag$zza = zzaf$zzd0.zzhW;
        for(int v = 0; v < arr_zzag$zza.length; ++v) {
            Map map0 = zzaj.zzc(arr_zzag$zza[v]);
            if(map0 != null) {
                dataLayer0.push(map0);
            }
        }
    }

    private static Map zzc(zza zzag$zza0) {
        Object object0 = zzdf.zzl(zzag$zza0);
        if(!(object0 instanceof Map)) {
            zzbg.zzaC(("value: " + object0 + " is not a map value, ignored."));
            return null;
        }
        return (Map)object0;
    }

    private static void zzc(DataLayer dataLayer0, zzd zzaf$zzd0) {
        zzc[] arr_zzaf$zzc = zzaf$zzd0.zzhY;
        for(int v = 0; v < arr_zzaf$zzc.length; ++v) {
            zzc zzaf$zzc0 = arr_zzaf$zzc[v];
            if(zzaf$zzc0.zzaC == null) {
                zzbg.zzaC("GaExperimentRandom: No key");
            }
            else {
                Long long0 = dataLayer0.get(zzaf$zzc0.zzaC);
                Long long1 = long0 instanceof Number ? long0.longValue() : null;
                long v1 = zzaf$zzc0.zzhS;
                long v2 = zzaf$zzc0.zzhT;
                if(!zzaf$zzc0.zzhU || long1 == null || ((long)long1) < v1 || ((long)long1) > v2) {
                    if(v1 <= v2) {
                        long0 = Math.round(Math.random() * ((double)(v2 - v1)) + ((double)v1));
                    }
                    else {
                        zzbg.zzaC("GaExperimentRandom: random range invalid");
                        continue;
                    }
                }
                dataLayer0.zzen(zzaf$zzc0.zzaC);
                Map map0 = dataLayer0.zzj(zzaf$zzc0.zzaC, long0);
                if(zzaf$zzc0.zzhV > 0L) {
                    if(map0.containsKey("gtm")) {
                        Object object0 = map0.get("gtm");
                        if(object0 instanceof Map) {
                            ((Map)object0).put("lifetime", zzaf$zzc0.zzhV);
                        }
                        else {
                            zzbg.zzaC("GaExperimentRandom: gtm not a map");
                        }
                    }
                    else {
                        map0.put("gtm", DataLayer.mapOf(new Object[]{"lifetime", zzaf$zzc0.zzhV}));
                    }
                }
                dataLayer0.push(map0);
            }
        }
    }
}

