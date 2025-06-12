package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

public class zzan {
    private String zznv;
    private String zznw;
    private String zznx;
    private String[] zzny;
    private zzaj zznz;

    public zzan(zzaj zzaj0) {
        this.zznv = "googleads.g.doubleclick.net";
        this.zznw = "/pagead/ads";
        this.zznx = "ad.doubleclick.net";
        this.zzny = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
        this.zznz = zzaj0;
    }

    private Uri zza(Uri uri0, Context context0, String s, boolean z) throws zzao {
        try {
            boolean z1 = this.zza(uri0);
            if(z1) {
                if(uri0.toString().contains("dc_ms=")) {
                    throw new zzao("Parameter already exists: dc_ms");
                }
            }
            else if(uri0.getQueryParameter("ms") != null) {
                throw new zzao("Query parameter already exists: ms");
            }
            String s1 = z ? this.zznz.zza(context0, s) : this.zznz.zzb(context0);
            return z1 ? this.zzb(uri0, "dc_ms", s1) : this.zza(uri0, "ms", s1);
        }
        catch(UnsupportedOperationException unused_ex) {
            throw new zzao("Provided Uri is not in a valid state");
        }
    }

    private Uri zza(Uri uri0, String s, String s1) throws UnsupportedOperationException {
        String s2 = uri0.toString();
        int v = s2.indexOf("&adurl");
        if(v == -1) {
            v = s2.indexOf("?adurl");
        }
        return v == -1 ? uri0.buildUpon().appendQueryParameter(s, s1).build() : Uri.parse((s2.substring(0, v + 1) + s + "=" + s1 + "&" + s2.substring(v + 1)));
    }

    public Uri zza(Uri uri0, Context context0) throws zzao {
        try {
            return this.zza(uri0, context0, uri0.getQueryParameter("ai"), true);
        }
        catch(UnsupportedOperationException unused_ex) {
            throw new zzao("Provided Uri is not in a valid state");
        }
    }

    public void zza(MotionEvent motionEvent0) {
        this.zznz.zza(motionEvent0);
    }

    public boolean zza(Uri uri0) {
        if(uri0 == null) {
            throw new NullPointerException();
        }
        try {
            return uri0.getHost().equals(this.zznx);
        }
        catch(NullPointerException unused_ex) {
            return false;
        }
    }

    public zzaj zzab() {
        return this.zznz;
    }

    private Uri zzb(Uri uri0, String s, String s1) {
        String s2 = uri0.toString();
        int v = s2.indexOf(";adurl");
        if(v != -1) {
            return Uri.parse((s2.substring(0, v + 1) + s + "=" + s1 + ";" + s2.substring(v + 1)));
        }
        String s3 = uri0.getEncodedPath();
        int v1 = s2.indexOf(s3);
        return Uri.parse((s2.substring(0, s3.length() + v1) + ";" + s + "=" + s1 + ";" + s2.substring(s3.length() + v1)));
    }

    public boolean zzb(Uri uri0) {
        if(uri0 == null) {
            throw new NullPointerException();
        }
        try {
            String s = uri0.getHost();
            String[] arr_s = this.zzny;
            for(int v = 0; true; ++v) {
                if(v >= arr_s.length) {
                    return false;
                }
                if(s.endsWith(arr_s[v])) {
                    break;
                }
            }
            return true;
        }
        catch(NullPointerException unused_ex) {
            return false;
        }
    }

    // 去混淆评级： 低(20)
    public boolean zzc(Uri uri0) {
        return this.zzb(uri0) && uri0.getPath().endsWith("/aclk");
    }
}

