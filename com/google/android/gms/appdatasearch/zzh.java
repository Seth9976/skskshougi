package com.google.android.gms.appdatasearch;

import java.util.HashMap;
import java.util.Map;

public class zzh {
    private static final String[] zzNq;
    private static final Map zzNr;

    static {
        zzh.zzNq = new String[]{"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity"};
        zzh.zzNr = new HashMap(zzh.zzNq.length);
        for(int v = 0; v < zzh.zzNq.length; ++v) {
            zzh.zzNr.put(zzh.zzNq[v], v);
        }
    }

    public static String zzai(int v) {
        return v >= 0 && v < zzh.zzNq.length ? zzh.zzNq[v] : null;
    }

    public static int zzbq(String s) {
        Integer integer0 = (Integer)zzh.zzNr.get(s);
        if(integer0 == null) {
            throw new IllegalArgumentException("[" + s + "] is not a valid global search section name");
        }
        return (int)integer0;
    }

    public static int zzkL() [...] // Potential decryptor
}

