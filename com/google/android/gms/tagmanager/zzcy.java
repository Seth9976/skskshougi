package com.google.android.gms.tagmanager;

import java.util.Map;

class zzcy extends zzcz {
    private static final String ID;

    static {
        zzcy.ID = "_sw";
    }

    public zzcy() {
        super("_sw");
    }

    @Override  // com.google.android.gms.tagmanager.zzcz
    protected boolean zza(String s, String s1, Map map0) {
        return s.startsWith(s1);
    }
}

