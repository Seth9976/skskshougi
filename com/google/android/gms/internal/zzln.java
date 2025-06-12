package com.google.android.gms.internal;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzu;
import java.util.Set;

public final class zzln {
    public static String[] zza(Scope[] arr_scope) {
        zzu.zzb(arr_scope, "scopes can\'t be null.");
        String[] arr_s = new String[arr_scope.length];
        for(int v = 0; v < arr_scope.length; ++v) {
            arr_s[v] = arr_scope[v].zzmS();
        }
        return arr_s;
    }

    public static String[] zzc(Set set0) {
        zzu.zzb(set0, "scopes can\'t be null.");
        return zzln.zza(((Scope[])set0.toArray(new Scope[set0.size()])));
    }
}

