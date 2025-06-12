package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

class zzap extends zzak {
    private static final String ID;
    private static final String zzaLE;
    private static final String zzaLG;
    private static final String zzaLK;

    static {
        zzap.ID = "_hsh";
        zzap.zzaLE = "arg0";
        zzap.zzaLK = "algorithm";
        zzap.zzaLG = "input_format";
    }

    // 去混淆评级： 低(20)
    public zzap() {
        super("_hsh", new String[]{"arg0"});
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        byte[] arr_b;
        zza zzag$zza0 = (zza)map0.get("arg0");
        if(zzag$zza0 == null || zzag$zza0 == zzdf.zzzQ()) {
            return zzdf.zzzQ();
        }
        String s = zzdf.zzg(zzag$zza0);
        zza zzag$zza1 = (zza)map0.get("algorithm");
        String s1 = zzag$zza1 == null ? "MD5" : zzdf.zzg(zzag$zza1);
        zza zzag$zza2 = (zza)map0.get("input_format");
        String s2 = zzag$zza2 == null ? "text" : zzdf.zzg(zzag$zza2);
        if("text".equals(s2)) {
            arr_b = s.getBytes();
            return zzdf.zzI(zzk.zzi(this.zzd(s1, arr_b)));
        }
        if("base16".equals(s2)) {
            arr_b = zzk.zzee(s);
            try {
                return zzdf.zzI(zzk.zzi(this.zzd(s1, arr_b)));
            }
            catch(NoSuchAlgorithmException unused_ex) {
                zzbg.zzaz(("Hash: unknown algorithm: " + s1));
                return zzdf.zzzQ();
            }
        }
        zzbg.zzaz(("Hash: unknown input format: " + s2));
        return zzdf.zzzQ();
    }

    private byte[] zzd(String s, byte[] arr_b) throws NoSuchAlgorithmException {
        MessageDigest messageDigest0 = MessageDigest.getInstance(s);
        messageDigest0.update(arr_b);
        return messageDigest0.digest();
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

