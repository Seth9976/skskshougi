package com.google.android.gms.ads.internal.purchase;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzgd;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

@zzgd
public class zzl {
    public static boolean zza(PublicKey publicKey0, String s, String s1) {
        try {
            Signature signature0 = Signature.getInstance("SHA1withRSA");
            signature0.initVerify(publicKey0);
            signature0.update(s.getBytes());
            if(!signature0.verify(Base64.decode(s1, 0))) {
                zzb.zzaz("Signature verification failed.");
                return false;
            }
            return true;
        }
        catch(NoSuchAlgorithmException unused_ex) {
            zzb.zzaz("NoSuchAlgorithmException.");
            return false;
        }
        catch(InvalidKeyException unused_ex) {
            zzb.zzaz("Invalid key specification.");
            return false;
        }
        catch(SignatureException unused_ex) {
            zzb.zzaz("Signature exception.");
            return false;
        }
    }

    public static PublicKey zzak(String s) {
        try {
            byte[] arr_b = Base64.decode(s, 0);
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arr_b));
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new RuntimeException(noSuchAlgorithmException0);
        }
        catch(InvalidKeySpecException invalidKeySpecException0) {
            zzb.zzaz("Invalid key specification.");
            throw new IllegalArgumentException(invalidKeySpecException0);
        }
    }

    public static boolean zzc(String s, String s1, String s2) {
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || TextUtils.isEmpty(s2)) {
            zzb.zzaz("Purchase verification failed: missing data.");
            return false;
        }
        return zzl.zza(zzl.zzak(s), s1, s2);
    }
}

