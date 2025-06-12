package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

class zzz implements zzar {
    private zzcd zzaKO;
    private static final Object zzaKl;
    private static zzz zzaLA;
    private String zzaLB;
    private String zzaLC;
    private zzas zzaLD;

    static {
        zzz.zzaKl = new Object();
    }

    private zzz(Context context0) {
        this(zzat.zzaH(context0), new zzcs());
    }

    zzz(zzas zzas0, zzcd zzcd0) {
        this.zzaLD = zzas0;
        this.zzaKO = zzcd0;
    }

    public static zzar zzaF(Context context0) {
        synchronized(zzz.zzaKl) {
            if(zzz.zzaLA == null) {
                zzz.zzaLA = new zzz(context0);
            }
            return zzz.zzaLA;
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzar
    public boolean zzes(String s) {
        if(!this.zzaKO.zzkb()) {
            zzbg.zzaC("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        if(this.zzaLB != null && this.zzaLC != null) {
            try {
                s = this.zzaLB + "?" + this.zzaLC + "=" + URLEncoder.encode(s, "UTF-8");
                zzbg.zzaB(("Sending wrapped url hit: " + s));
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                zzbg.zzd("Error wrapping URL for testing.", unsupportedEncodingException0);
                return false;
            }
        }
        this.zzaLD.zzew(s);
        return true;
    }
}

