package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class zzcf extends zzcz {
    private static final String ID;
    private static final String zzaMQ;

    static {
        zzcf.ID = "_re";
        zzcf.zzaMQ = "ignore_case";
    }

    public zzcf() {
        super("_re");
    }

    @Override  // com.google.android.gms.tagmanager.zzcz
    protected boolean zza(String s, String s1, Map map0) {
        int v = zzdf.zzk(((zza)map0.get("ignore_case"))).booleanValue() ? 66 : 0x40;
        try {
            return Pattern.compile(s1, v).matcher(s).find();
        }
        catch(PatternSyntaxException unused_ex) {
            return false;
        }
    }
}

