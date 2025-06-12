package com.google.android.gms.internal;

import java.util.HashMap;

public class zzli {
    public static void zza(StringBuilder stringBuilder0, HashMap hashMap0) {
        stringBuilder0.append("{");
        boolean z = true;
        for(Object object0: hashMap0.keySet()) {
            if(!z) {
                stringBuilder0.append(",");
            }
            String s = (String)hashMap0.get(((String)object0));
            stringBuilder0.append("\"").append(((String)object0)).append("\":");
            if(s == null) {
                stringBuilder0.append("null");
            }
            else {
                stringBuilder0.append("\"").append(s).append("\"");
            }
            z = false;
        }
        stringBuilder0.append("}");
    }
}

