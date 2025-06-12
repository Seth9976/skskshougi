package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class zzbb extends zzak {
    private static final String ID;

    static {
        zzbb.ID = "_l";
    }

    public zzbb() {
        super("_l", new String[0]);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        Locale locale0 = Locale.getDefault();
        if(locale0 == null) {
            return zzdf.zzzQ();
        }
        String s = locale0.getLanguage();
        return s == null ? zzdf.zzzQ() : zzdf.zzI(s.toLowerCase());
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public String zzyM() {
        return super.zzyM();
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public Set zzyN() {
        return super.zzyN();
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return false;
    }
}

