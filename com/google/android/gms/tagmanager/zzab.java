package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzab extends zzak {
    private static final String ID;

    static {
        zzab.ID = "_dn";
    }

    public zzab() {
        super("_dn", new String[0]);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        return zzdf.zzI((Build.MODEL.startsWith(Build.MANUFACTURER) || Build.MANUFACTURER.equals("unknown") ? Build.MODEL : Build.MANUFACTURER + " " + Build.MODEL));
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

