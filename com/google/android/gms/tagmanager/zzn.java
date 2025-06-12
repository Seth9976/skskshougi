package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzn extends zzak {
    private static final String ID;
    private static final String VALUE;

    static {
        zzn.ID = "_c";
        zzn.VALUE = "value";
    }

    // 去混淆评级： 低(20)
    public zzn() {
        super("_c", new String[]{"value"});
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        return (zza)map0.get("value");
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }

    // 去混淆评级： 低(20)
    public static String zzyk() [...] // Potential decryptor

    // 去混淆评级： 低(20)
    public static String zzyl() [...] // Potential decryptor
}

