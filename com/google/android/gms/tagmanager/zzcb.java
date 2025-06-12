package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class zzcb {
    static enum zza {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG;

    }

    private volatile String zzaKy;
    private static zzcb zzaME;
    private volatile zza zzaMF;
    private volatile String zzaMG;
    private volatile String zzaMH;

    zzcb() {
        this.clear();
    }

    void clear() {
        this.zzaMF = zza.zzaMI;
        this.zzaMG = null;
        this.zzaKy = null;
        this.zzaMH = null;
    }

    String getContainerId() {
        return this.zzaKy;
    }

    private String zzeA(String s) {
        return s.split("&")[0].split("=")[1];
    }

    boolean zzl(Uri uri0) {
        String s;
        boolean z = true;
        synchronized(this) {
            try {
                s = URLDecoder.decode(uri0.toString(), "UTF-8");
            }
            catch(UnsupportedEncodingException unused_ex) {
                return false;
            }
        }
        if(s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
            zzbg.zzaB(("Container preview url: " + s));
            this.zzaMF = s.matches(".*?&gtm_debug=x$") ? zza.zzaMK : zza.zzaMJ;
            this.zzaMH = this.zzm(uri0);
            if(this.zzaMF == zza.zzaMJ || this.zzaMF == zza.zzaMK) {
                this.zzaMG = "/r?" + this.zzaMH;
            }
            this.zzaKy = this.zzeA(this.zzaMH);
        }
        else if(!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
            zzbg.zzaC(("Invalid preview uri: " + s));
            z = false;
        }
        else if(this.zzeA(uri0.getQuery()).equals(this.zzaKy)) {
            zzbg.zzaB(("Exit preview mode for container: " + this.zzaKy));
            this.zzaMF = zza.zzaMI;
            this.zzaMG = null;
        }
        else {
            z = false;
        }
        return z;
    }

    private String zzm(Uri uri0) {
        return uri0.getQuery().replace("&gtm_debug=x", "");
    }

    static zzcb zzzf() {
        synchronized(zzcb.class) {
            if(zzcb.zzaME == null) {
                zzcb.zzaME = new zzcb();
            }
            return zzcb.zzaME;
        }
    }

    zza zzzg() {
        return this.zzaMF;
    }

    String zzzh() {
        return this.zzaMG;
    }
}

