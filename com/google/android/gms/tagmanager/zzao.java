package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzao extends zzak {
    private static final String ID;

    static {
        zzao.ID = "_gtmv";
    }

    public zzao() {
        super("_gtmv", new String[0]);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        return zzdf.zzI("4.00");
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

