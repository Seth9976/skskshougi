package com.google.android.gms.tagmanager;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

class zzt extends zzak {
    public interface zza {
        Object zzd(String arg1, Map arg2);
    }

    private static final String ID;
    private static final String zzaKr;
    private static final String zzaLd;
    private final zza zzaLe;

    static {
        zzt.ID = "_func";
        zzt.zzaLd = "function_call_macro_name";
        zzt.zzaKr = "additional_params";
    }

    public zzt(zza zzt$zza0) {
        super("_func", new String[]{"function_call_macro_name"});
        this.zzaLe = zzt$zza0;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public com.google.android.gms.internal.zzag.zza zzE(Map map0) {
        String s = zzdf.zzg(((com.google.android.gms.internal.zzag.zza)map0.get("function_call_macro_name")));
        HashMap hashMap0 = new HashMap();
        com.google.android.gms.internal.zzag.zza zzag$zza0 = (com.google.android.gms.internal.zzag.zza)map0.get("additional_params");
        if(zzag$zza0 != null) {
            Object object0 = zzdf.zzl(zzag$zza0);
            if(!(object0 instanceof Map)) {
                zzbg.zzaC("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return zzdf.zzzQ();
            }
            for(Object object1: ((Map)object0).entrySet()) {
                hashMap0.put(((Map.Entry)object1).getKey().toString(), ((Map.Entry)object1).getValue());
            }
        }
        try {
            return zzdf.zzI(this.zzaLe.zzd(s, hashMap0));
        }
        catch(Exception exception0) {
            zzbg.zzaC(("Custom macro/tag " + s + " threw exception " + exception0.getMessage()));
            return zzdf.zzzQ();
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return false;
    }
}

