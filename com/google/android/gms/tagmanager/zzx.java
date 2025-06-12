package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.List;
import java.util.Map;

class zzx extends zzdd {
    private static final String ID;
    private static final String VALUE;
    private final DataLayer zzaKz;
    private static final String zzaLz;

    static {
        zzx.ID = "_dlw";
        zzx.VALUE = "value";
        zzx.zzaLz = "clear_data_layer_prefix";
    }

    public zzx(DataLayer dataLayer0) {
        super("_dlw", new String[]{"value"});
        this.zzaKz = dataLayer0;
    }

    @Override  // com.google.android.gms.tagmanager.zzdd
    public void zzG(Map map0) {
        this.zzb(((zza)map0.get("value")));
        this.zza(((zza)map0.get("clear_data_layer_prefix")));
    }

    private void zza(zza zzag$zza0) {
        if(zzag$zza0 != null && zzag$zza0 != zzdf.zzzK()) {
            String s = zzdf.zzg(zzag$zza0);
            if(s != "") {
                this.zzaKz.zzen(s);
            }
        }
    }

    private void zzb(zza zzag$zza0) {
        if(zzag$zza0 != null && zzag$zza0 != zzdf.zzzK()) {
            Object object0 = zzdf.zzl(zzag$zza0);
            if(object0 instanceof List) {
                for(Object object1: ((List)object0)) {
                    if(object1 instanceof Map) {
                        this.zzaKz.push(((Map)object1));
                    }
                }
            }
        }
    }
}

