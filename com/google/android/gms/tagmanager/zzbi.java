package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzbi extends zzak {
    private static final String ID;
    private static final String zzaLE;

    static {
        zzbi.ID = "_ls";
        zzbi.zzaLE = "arg0";
    }

    // 去混淆评级： 低(20)
    public zzbi() {
        super("_ls", new String[]{"arg0"});
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        return zzdf.zzI(zzdf.zzg(((zza)map0.get("arg0"))).toLowerCase());
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

