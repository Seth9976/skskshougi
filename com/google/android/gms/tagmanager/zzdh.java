package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzdh extends zzak {
    private static final String ID;
    private static final String zzaLE;

    static {
        zzdh.ID = "_us";
        zzdh.zzaLE = "arg0";
    }

    // 去混淆评级： 低(20)
    public zzdh() {
        super("_us", new String[]{"arg0"});
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        return zzdf.zzI(zzdf.zzg(((zza)map0.get("arg0"))).toUpperCase());
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

