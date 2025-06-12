package com.google.android.gms.iid;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class zza {
    public static KeyPair zzud() {
        try {
            KeyPairGenerator keyPairGenerator0 = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator0.initialize(0x800);
            return keyPairGenerator0.generateKeyPair();
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new AssertionError(noSuchAlgorithmException0);
        }
    }
}

