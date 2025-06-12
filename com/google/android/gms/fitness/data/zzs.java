package com.google.android.gms.fitness.data;

import java.util.List;

public class zzs {
    public static int zza(Object object0, List list0) {
        if(object0 == null) {
            return -1;
        }
        int v = list0.indexOf(object0);
        if(v < 0) {
            list0.add(object0);
            return list0.size() - 1;
        }
        return v;
    }
}

