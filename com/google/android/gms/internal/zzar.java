package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class zzar {
    public class zza extends Exception {
        final zzar zznB;

        public zza() {
        }

        public zza(Throwable throwable0) {
            super(throwable0);
        }
    }

    private final zzap zzmT;
    private final SecureRandom zznA;

    public zzar(zzap zzap0, SecureRandom secureRandom0) {
        this.zzmT = zzap0;
        this.zznA = secureRandom0;
    }

    public byte[] zzc(byte[] arr_b, String s) throws zza {
        if(arr_b.length != 16) {
            throw new zza(this);
        }
        try {
            byte[] arr_b1 = this.zzmT.zza(s, false);
            if(arr_b1.length <= 16) {
                throw new zza(this);
            }
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b1.length);
            byteBuffer0.put(arr_b1);
            byteBuffer0.flip();
            byte[] arr_b2 = new byte[16];
            byte[] arr_b3 = new byte[arr_b1.length - 16];
            byteBuffer0.get(arr_b2);
            byteBuffer0.get(arr_b3);
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
            Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher0.init(2, secretKeySpec0, new IvParameterSpec(arr_b2));
            return cipher0.doFinal(arr_b3);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new zza(this, noSuchAlgorithmException0);
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new zza(this, invalidKeyException0);
        }
        catch(IllegalBlockSizeException illegalBlockSizeException0) {
            throw new zza(this, illegalBlockSizeException0);
        }
        catch(NoSuchPaddingException noSuchPaddingException0) {
            throw new zza(this, noSuchPaddingException0);
        }
        catch(BadPaddingException badPaddingException0) {
            throw new zza(this, badPaddingException0);
        }
        catch(InvalidAlgorithmParameterException invalidAlgorithmParameterException0) {
            throw new zza(this, invalidAlgorithmParameterException0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new zza(this, illegalArgumentException0);
        }
    }

    static void zze(byte[] arr_b) {
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b[v] = (byte)(arr_b[v] ^ 68);
        }
    }

    public byte[] zzl(String s) throws zza {
        try {
            byte[] arr_b = this.zzmT.zza(s, false);
            if(arr_b.length != 0x20) {
                throw new zza(this);
            }
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b, 4, 16);
            byte[] arr_b1 = new byte[16];
            byteBuffer0.get(arr_b1);
            zzar.zze(arr_b1);
            return arr_b1;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new zza(this, illegalArgumentException0);
        }
    }
}

