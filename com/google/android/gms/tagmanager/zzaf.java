package com.google.android.gms.tagmanager;

import java.util.Map;

public class zzaf extends zzcz {
    private static final String ID;

    static {
        zzaf.ID = "_eq";
    }

    public zzaf() {
        super("_eq");
    }

    @Override  // com.google.android.gms.tagmanager.zzcz
    protected boolean zza(String s, String s1, Map map0) {
        return s.equals(s1);
    }
}

