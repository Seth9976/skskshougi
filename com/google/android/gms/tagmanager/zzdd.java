package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

abstract class zzdd extends zzak {
    public zzdd(String s, String[] arr_s) {
        super(s, arr_s);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        this.zzG(map0);
        return zzdf.zzzQ();
    }

    public abstract void zzG(Map arg1);

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return false;
    }
}

