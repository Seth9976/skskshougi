package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class zzbl {
    protected Object zzqt;
    private static MessageDigest zzrK;

    static {
        zzbl.zzrK = null;
    }

    public zzbl() {
        this.zzqt = new Object();
    }

    protected MessageDigest zzcu() {
        synchronized(this.zzqt) {
            if(zzbl.zzrK != null) {
                return zzbl.zzrK;
            }
            for(int v1 = 0; v1 < 2; ++v1) {
                try {
                    zzbl.zzrK = MessageDigest.getInstance("MD5");
                }
                catch(NoSuchAlgorithmException unused_ex) {
                }
            }
            return zzbl.zzrK;
        }
    }

    abstract byte[] zzy(String arg1);
}

