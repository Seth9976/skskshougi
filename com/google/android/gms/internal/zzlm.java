package com.google.android.gms.internal;

public final class zzlm {
    private static int zza(StackTraceElement[] arr_stackTraceElement, StackTraceElement[] arr_stackTraceElement1) {
        int v = 0;
        int v1 = arr_stackTraceElement1.length;
        int v2 = arr_stackTraceElement.length;
        while(true) {
            --v2;
            if(v2 < 0) {
                break;
            }
            --v1;
            if(v1 < 0 || !arr_stackTraceElement1[v1].equals(arr_stackTraceElement[v2])) {
                break;
            }
            ++v;
        }
        return v;
    }

    public static String zzpa() [...] // Potential decryptor
}

