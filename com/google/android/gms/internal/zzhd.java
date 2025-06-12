package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzgd
public class zzhd {
    final String zzFE;
    long zzFQ;
    long zzFR;
    int zzFS;
    int zzFT;
    int zzFU;
    private final Object zzqt;

    public zzhd(String s) {
        this.zzFQ = -1L;
        this.zzFR = -1L;
        this.zzFS = -1;
        this.zzqt = new Object();
        this.zzFT = 0;
        this.zzFU = 0;
        this.zzFE = s;
    }

    public static boolean zzE(Context context0) {
        int v = context0.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if(v == 0) {
            zzb.zzaA("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        ComponentName componentName0 = new ComponentName("org.dyndns.vivi.SkskShogi", "com.google.android.gms.ads.AdActivity");
        try {
            if(v == context0.getPackageManager().getActivityInfo(componentName0, 0).theme) {
                return true;
            }
            zzb.zzaA("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            zzb.zzaC("Fail to fetch AdActivity theme");
            zzb.zzaA("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
        return false;
    }

    public void zzb(AdRequestParcel adRequestParcel0, long v) {
        synchronized(this.zzqt) {
            if(this.zzFR == -1L) {
                this.zzFR = v;
                this.zzFQ = this.zzFR;
            }
            else {
                this.zzFQ = v;
            }
            if(adRequestParcel0.extras != null && adRequestParcel0.extras.getInt("gw", 2) == 1) {
                return;
            }
            ++this.zzFS;
        }
    }

    public Bundle zzd(Context context0, String s) {
        synchronized(this.zzqt) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("session_id", this.zzFE);
            bundle0.putLong("basets", this.zzFR);
            bundle0.putLong("currts", this.zzFQ);
            bundle0.putString("seq_num", s);
            bundle0.putInt("preqs", this.zzFS);
            bundle0.putInt("pclick", this.zzFT);
            bundle0.putInt("pimp", this.zzFU);
            bundle0.putBoolean("support_transparent_background", zzhd.zzE(context0));
            return bundle0;
        }
    }

    public void zzfP() {
        synchronized(this.zzqt) {
            ++this.zzFU;
        }
    }

    public void zzfQ() {
        synchronized(this.zzqt) {
            ++this.zzFT;
        }
    }

    public long zzgg() {
        return this.zzFR;
    }
}

