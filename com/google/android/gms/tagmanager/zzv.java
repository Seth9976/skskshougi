package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzv extends zzak {
    private static final String ID;
    private static final String NAME;
    private final DataLayer zzaKz;
    private static final String zzaLo;

    static {
        zzv.ID = "_v";
        zzv.NAME = "name";
        zzv.zzaLo = "default_value";
    }

    public zzv(DataLayer dataLayer0) {
        super("_v", new String[]{"name"});
        this.zzaKz = dataLayer0;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        String s = zzdf.zzg(((zza)map0.get("name")));
        Object object0 = this.zzaKz.get(s);
        if(object0 == null) {
            zza zzag$zza0 = (zza)map0.get("default_value");
            return zzag$zza0 == null ? zzdf.zzzQ() : zzag$zza0;
        }
        return zzdf.zzI(object0);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return false;
    }
}

