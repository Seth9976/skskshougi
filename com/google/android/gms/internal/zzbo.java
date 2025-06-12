package com.google.android.gms.internal;

import java.security.MessageDigest;

public class zzbo extends zzbl {
    private MessageDigest zzrS;

    byte[] zza(String[] arr_s) {
        byte[] arr_b = new byte[arr_s.length];
        for(int v = 0; v < arr_s.length; ++v) {
            arr_b[v] = this.zzj(zzbn.zzB(arr_s[v]));
        }
        return arr_b;
    }

    byte zzj(int v) {
        return (byte)(v & 0xFF ^ (0xFF00 & v) >> 8 ^ (0xFF0000 & v) >> 16 ^ (0xFF000000 & v) >> 24);
    }

    @Override  // com.google.android.gms.internal.zzbl
    public byte[] zzy(String s) {
        byte[] arr_b = this.zza(s.split(" "));
        this.zzrS = this.zzcu();
        synchronized(this.zzqt) {
            if(this.zzrS == null) {
                return new byte[0];
            }
            this.zzrS.reset();
            this.zzrS.update(arr_b);
            byte[] arr_b1 = this.zzrS.digest();
            byte[] arr_b2 = new byte[(arr_b1.length > 4 ? 4 : arr_b1.length)];
            System.arraycopy(arr_b1, 0, arr_b2, 0, arr_b2.length);
            return arr_b2;
        }
    }
}

