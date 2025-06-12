package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzbz extends zzak {
    private static final String ID;
    private static final zza zzaMB;

    static {
        zzbz.ID = "_p";
        zzbz.zzaMB = zzdf.zzI("Android");
    }

    public zzbz() {
        super("_p", new String[0]);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        return zzbz.zzaMB;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

