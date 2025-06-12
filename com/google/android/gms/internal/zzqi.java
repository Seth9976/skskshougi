package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.tagmanager.zzbg;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public class zzqi {
    private String zzaLc;

    public zzqi() {
        this.zzaLc = "https://www.google-analytics.com";
    }

    private String zzeQ(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
        }
        catch(UnsupportedEncodingException unused_ex) {
            zzbg.zzaz(("Cannot encode the string: " + s));
            return "";
        }
    }

    public void zzeU(String s) {
        this.zzaLc = s;
        zzbg.zzaA(("The Ctfe server endpoint was changed to: " + s));
    }

    public String zzt(List list0) {
        return this.zzaLc + "/gtm/android?" + this.zzu(list0);
    }

    String zzu(List list0) {
        zzu.zzV(list0.size() <= 1);
        if(list0.isEmpty()) {
            return "";
        }
        zzpy zzpy0 = (zzpy)list0.get(0);
        String s = zzpy0.zzAd().trim().equals("") ? "-1" : zzpy0.zzAd().trim();
        StringBuilder stringBuilder0 = new StringBuilder();
        if(zzpy0.zzAa() == null) {
            stringBuilder0.append("id");
        }
        else {
            stringBuilder0.append(zzpy0.zzAa());
        }
        stringBuilder0.append("=").append(this.zzeQ(zzpy0.getContainerId())).append("&").append("pv").append("=").append(this.zzeQ(s));
        if(zzpy0.zzAc()) {
            stringBuilder0.append("&gtm_debug=x");
        }
        return stringBuilder0.toString();
    }
}

