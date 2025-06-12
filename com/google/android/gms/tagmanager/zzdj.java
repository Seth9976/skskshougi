package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

class zzdj {
    private static zzbw zza(zzbw zzbw0) {
        try {
            return new zzbw(zzdf.zzI(zzdj.zzeQ(zzdf.zzg(((zza)zzbw0.getObject())))), zzbw0.zzza());
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            zzbg.zzb("Escape URI: unsupported encoding", unsupportedEncodingException0);
            return zzbw0;
        }
    }

    private static zzbw zza(zzbw zzbw0, int v) {
        if(!zzdj.zzn(((zza)zzbw0.getObject()))) {
            zzbg.zzaz("Escaping can only be applied to strings.");
            return zzbw0;
        }
        if(v != 12) {
            zzbg.zzaz(("Unsupported Value Escaping: " + v));
            return zzbw0;
        }
        return zzdj.zza(zzbw0);
    }

    static zzbw zza(zzbw zzbw0, int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            zzbw0 = zzdj.zza(zzbw0, arr_v[v]);
        }
        return zzbw0;
    }

    static String zzeQ(String s) throws UnsupportedEncodingException {
        return URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
    }

    private static boolean zzn(zza zzag$zza0) {
        return zzdf.zzl(zzag$zza0) instanceof String;
    }
}

