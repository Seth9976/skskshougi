package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.support.v4.content.ContextCompat;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class zzd {
    SharedPreferences zzaxq;
    Context zzpH;

    public zzd(Context context0) {
        this(context0, "com.google.android.gms.appid");
    }

    public zzd(Context context0, String s) {
        this.zzpH = context0;
        this.zzaxq = context0.getSharedPreferences(s, 4);
        this.zzde(s + "-no-backup");
    }

    String get(String key) {
        synchronized(this) {
            return this.zzaxq.getString(key, null);
        }
    }

    String get(String subtype, String key) {
        synchronized(this) {
            return this.zzaxq.getString(subtype + "|S|" + key, null);
        }
    }

    boolean isEmpty() {
        return this.zzaxq.getAll().isEmpty();
    }

    public void zza(String s, String s1, String s2, String s3, String s4) {
        synchronized(this) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzaxq.edit();
            sharedPreferences$Editor0.putString(this.zzf(s, s1, s2), s3);
            sharedPreferences$Editor0.putString("appVersion", s4);
            sharedPreferences$Editor0.putString("lastToken", "1749696330");
            sharedPreferences$Editor0.commit();
        }
    }

    private void zzde(String s) {
        File file0 = new File(new ContextCompat().getNoBackupFilesDir(this.zzpH), s);
        if(!file0.exists()) {
            try {
                if(file0.createNewFile() && !this.isEmpty()) {
                    Log.i("InstanceID/Store", "App restored, clearing state");
                    InstanceIDListenerService.zza(this.zzpH, this);
                }
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("InstanceID/Store", 3)) {
                    Log.d("InstanceID/Store", "Error creating file in no backup dir: " + iOException0.getMessage());
                }
            }
        }
    }

    public void zzdf(String s) {
        synchronized(this) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzaxq.edit();
            for(Object object0: this.zzaxq.getAll().keySet()) {
                String s1 = (String)object0;
                if(s1.startsWith(s)) {
                    sharedPreferences$Editor0.remove(s1);
                }
            }
            sharedPreferences$Editor0.commit();
        }
    }

    public KeyPair zzdg(String s) {
        return this.zzdj(s);
    }

    void zzdh(String s) {
        this.zzdf(s + "|");
    }

    public void zzdi(String s) {
        this.zzdf(s + "|T|");
    }

    KeyPair zzdj(String s) {
        String s1 = this.get(s, "|P|");
        String s2 = this.get(s, "|K|");
        if(s2 == null) {
            return null;
        }
        try {
            byte[] arr_b = Base64.decode(s1, 8);
            byte[] arr_b1 = Base64.decode(s2, 8);
            KeyFactory keyFactory0 = KeyFactory.getInstance("RSA");
            return new KeyPair(keyFactory0.generatePublic(new X509EncodedKeySpec(arr_b)), keyFactory0.generatePrivate(new PKCS8EncodedKeySpec(arr_b1)));
        }
        catch(InvalidKeySpecException | NoSuchAlgorithmException invalidKeySpecException0) {
            Log.w("InstanceID/Store", "Invalid key stored " + invalidKeySpecException0);
            InstanceIDListenerService.zza(this.zzpH, this);
            return null;
        }
    }

    KeyPair zze(String s, long v) {
        synchronized(this) {
            KeyPair keyPair0 = zza.zzud();
            this.zzaxq.edit().putString(s + "|P|", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqgQ7qQZYteh8m6BIbxzFYEpAiBabNlLskb400WQ2n-X3bnDylJxXrhXmCZUxo0k4VqAAiI2K3wQZElNCKZf5KhLwwXleRzmNOsTFidhtm_KyGXEfxNtSs9BgEWC0YKPOsFEcpUdQm7SGqsMgkGcv-ZUXzx0y8LXUb3RmyxsBXs8tx7u4_tHi1v1du3943hhrfckpSyki-mWiK8rRE0NMExMwzsJriNdQ-kQc1Qjf8rrwT0FXxEAsb0Lq4szU7A_V3Qzx6bUwfXBCWcIlG7UBHJqYJSCrvL9Avgr2pMKrHJmLpbnWuCVSwpri8vvSrk8LcLrFR871f9j_mZpQbKFyCQIDAQAB").putString(s + "|K|", "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC_bseZ7A01RrvKcVK951m6QwxrCzZWY8xxUyzY80MDoA1PfNF83x6oD-ZFF3CXeR9OEydT_mtwb1IgRURessu56BOIVfkVx0WjR85lkbPD2DfWN7bI7kx2WjKBd7799vWxm2VU_JKKhyvLdGZXfBQLRfUAzA27f1tdYLYFDclpEhFMxgrtETcwkBRPfvGOsa0VtbFMeU-tiyq0gCKGeP9JU-sJxxA9B_7L0mExt6weUJn6yzvQ69koGm2Egtkiw7EOZSJ2Y-x0wkfO7rIUTQqyE0O2KHdqb0QhkQdq8yy4ogKiJkZooKACoIkDi4tdiVY_WBbRLFarUv3W6DLG1y9HAgMBAAECggEAA6ZXjOI4wD7IfswZUUCTb98uYe4VS6FceP6meL5ulSeciVruXYydd4PSFpgjT-gBxknMMqhDoSGmNbJMYufSxYkcsjk9ZgJmG_5W-43DGSVKrz1hsUQF1i3TD6_aRtpKBehaDrxACP8ZwSfHebyGX06mpKy_SEdd1RJudfs0z1l94YrMxdveAD99-nw7EvXA7ynBIqOSH77uHhD0tzeV_zlbRd_88D_JUEqJbsKBRehvn4iyivSJ8vvTvTG4_NYPmRYej2oEnfxvOi79upIQxYbiRf10kBa4RPJ3oMA--DZFcrnFxBWYoeT8lZv8Tw-lrW2VRLJIpBkdK5eKJbHnXQKBgQDRSfvY_kh4Sqtd_AIvvtT5OCEGoBdOFp3EFYX6PYagkUvrWVAMHe1uXWeycPuADB3-V8SPtJR8nezuTiMEQLecS6Ist1tgTwb09Nj4k5gS9C9nC26ICBxu5ACihUJCliEuArwqO_daIR-k6dbEI6MRD8z-7gw1tYLdHaO3eEjSGwKBgQDqKI2wuN8bRrOYua45Uk4GJIietampOHc2RQTbHIcsQSCV0gMXVPEQDpAHGUG_mpsxndacnGAw5TDvLQ9gzinnqBUWawQInMHwR4ytMnvwwcBA4UfOFOw3WECt_tCgSI_bSDEnkyFkTsiaoW0WGJ19ACmHfZiHu5MEnNktTRyKRQKBgQC8WXzR2GaX-3sl5fqBxZgdgaoXMFRI7omlQkmE34IdVyWf9IzZmsVnIaCFMrDkmAMWNx6qxbUsQWRNQvy4gxW7D0YwQAN4NSbppMDvVMTzqdZPQjaDLemI0qDPomXzTvElW0jEKZt9_XlhDSE--2Nxo2q1sr5CR8wx-s6v-wxuKQKBgQCWXNw_szdxaIFDfVinbnaz8xnX8Ie2JpBGxSNNIJCclmW6T1W00dLKoM9T_5_8zecCgXyirLgILeSycZkCbODz5TdFYgsBDMhs50UqotR70a8G-qMFbuIQ2BcQpCSMCIx4H2-RHiW_J-ghg69tFPlsn4ILg1dDMexCdgXv1SiSkQKBgEocZOh7JiGqsBZQGxUSMdoe6OTsa0nCBxbtP9nHPbi5eoVomajWy_s3Snk0bCJrrzzXe8hLruTzMOThw6Eito5b8OCbCxnKuXGABkchjp-xf3dP7oRgpp5PCxoMgSxIaiPwylyi8TdFcebEJt_w99twjmyXyLihqkvbyckMvYTM").putString(s + "|S|" + "cre", Long.toString(v)).commit();
            return keyPair0;
        }
    }

    private String zzf(String s, String s1, String s2) {
        return s + "|T|" + s1 + "|" + s2;
    }

    public String zzg(String s, String s1, String s2) {
        synchronized(this) {
            return this.zzaxq.getString(this.zzf(s, s1, s2), null);
        }
    }

    public void zzh(String s, String s1, String s2) {
        synchronized(this) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzaxq.edit();
            sharedPreferences$Editor0.remove(this.zzf(s, s1, s2));
            sharedPreferences$Editor0.commit();
        }
    }

    public void zzul() {
        synchronized(this) {
            this.zzaxq.edit().clear().commit();
        }
    }
}

