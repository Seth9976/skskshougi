package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzcr extends zzak {
    private static final String ID;

    static {
        zzcr.ID = "_sv";
    }

    public zzcr() {
        super("_sv", new String[0]);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        return zzdf.zzI(Build.VERSION.SDK_INT);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

