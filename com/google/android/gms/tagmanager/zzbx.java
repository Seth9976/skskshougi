package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzbx extends zzak {
    private static final String ID;

    static {
        zzbx.ID = "_ov";
    }

    public zzbx() {
        super("_ov", new String[0]);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        return zzdf.zzI(Build.VERSION.RELEASE);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

