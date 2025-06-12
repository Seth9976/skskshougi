package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzad extends zzak {
    private static final String ID;
    private static final String zzaLE;
    private static final String zzaLF;
    private static final String zzaLG;
    private static final String zzaLH;

    static {
        zzad.ID = "_enc";
        zzad.zzaLE = "arg0";
        zzad.zzaLF = "no_padding";
        zzad.zzaLG = "input_format";
        zzad.zzaLH = "output_format";
    }

    // 去混淆评级： 低(20)
    public zzad() {
        super("_enc", new String[]{"arg0"});
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        byte[] arr_b;
        zza zzag$zza0 = (zza)map0.get("arg0");
        if(zzag$zza0 == null || zzag$zza0 == zzdf.zzzQ()) {
            return zzdf.zzzQ();
        }
        String s = zzdf.zzg(zzag$zza0);
        zza zzag$zza1 = (zza)map0.get("input_format");
        String s1 = zzag$zza1 == null ? "text" : zzdf.zzg(zzag$zza1);
        zza zzag$zza2 = (zza)map0.get("output_format");
        String s2 = zzag$zza2 == null ? "base16" : zzdf.zzg(zzag$zza2);
        zza zzag$zza3 = (zza)map0.get("no_padding");
        int v = zzag$zza3 == null || !zzdf.zzk(zzag$zza3).booleanValue() ? 2 : 3;
        try {
            if("text".equals(s1)) {
                arr_b = s.getBytes();
            }
            else if("base16".equals(s1)) {
                arr_b = zzk.zzee(s);
            }
            else if(!"base64".equals(s1)) {
                if(!"base64url".equals(s1)) {
                    zzbg.zzaz(("Encode: unknown input format: " + s1));
                    return zzdf.zzzQ();
                }
                arr_b = Base64.decode(s, v | 8);
            }
            else {
                arr_b = Base64.decode(s, v);
            }
        }
        catch(IllegalArgumentException unused_ex) {
            zzbg.zzaz("Encode: invalid input:");
            return zzdf.zzzQ();
        }
        if("base16".equals(s2)) {
            return zzdf.zzI(zzk.zzi(arr_b));
        }
        if("base64".equals(s2)) {
            return zzdf.zzI(Base64.encodeToString(arr_b, v));
        }
        if("base64url".equals(s2)) {
            return zzdf.zzI(Base64.encodeToString(arr_b, v | 8));
        }
        zzbg.zzaz(("Encode: unknown output format: " + s2));
        return zzdf.zzzQ();
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

