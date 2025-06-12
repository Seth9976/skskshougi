package com.google.android.gms.internal;

import android.util.Base64;

class zzah implements zzap {
    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.zzap
    public String zza(byte[] arr_b, boolean z) {
        return z ? Base64.encodeToString(arr_b, 11) : Base64.encodeToString(arr_b, 2);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.zzap
    public byte[] zza(String s, boolean z) throws IllegalArgumentException {
        return z ? Base64.decode(s, 11) : Base64.decode(s, 2);
    }
}

