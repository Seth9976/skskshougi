package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

class zzax {
    private static String zzaLU;
    static Map zzaLV;

    static {
        zzax.zzaLV = new HashMap();
    }

    static String zzD(String s, String s1) {
        if(s1 == null) {
            return s.length() <= 0 ? null : s;
        }
        return Uri.parse(("http://hostname/?" + s)).getQueryParameter(s1);
    }

    static void zzex(String s) {
        synchronized(zzax.class) {
            zzax.zzaLU = s;
        }
    }

    static String zzf(Context context0, String s, String s1) {
        String s2 = (String)zzax.zzaLV.get(s);
        if(s2 == null) {
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("gtm_click_referrers", 0);
            s2 = sharedPreferences0 == null ? "" : sharedPreferences0.getString(s, "");
            zzax.zzaLV.put(s, s2);
        }
        return zzax.zzD(s2, s1);
    }

    static String zzj(Context context0, String s) {
        if(zzax.zzaLU == null) {
            Class class0 = zzax.class;
            synchronized(class0) {
                if(zzax.zzaLU == null) {
                    SharedPreferences sharedPreferences0 = context0.getSharedPreferences("gtm_install_referrer", 0);
                    zzax.zzaLU = sharedPreferences0 == null ? "" : sharedPreferences0.getString("referrer", "");
                }
            }
        }
        return zzax.zzD(zzax.zzaLU, s);
    }

    static void zzk(Context context0, String s) {
        String s1 = zzax.zzD(s, "conv");
        if(s1 != null && s1.length() > 0) {
            zzax.zzaLV.put(s1, s);
            zzcv.zza(context0, "gtm_click_referrers", s1, s);
        }
    }
}

