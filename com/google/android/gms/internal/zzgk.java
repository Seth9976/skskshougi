package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.zzo;
import java.util.Locale;

@zzgd
public final class zzgk {
    public static final class zza {
        private int zzCw;
        private int zzCx;
        private float zzCy;
        private int zzEA;
        private int zzEB;
        private int zzEC;
        private double zzED;
        private boolean zzEE;
        private boolean zzEF;
        private int zzEG;
        private int zzEn;
        private boolean zzEo;
        private boolean zzEp;
        private String zzEq;
        private String zzEr;
        private boolean zzEs;
        private boolean zzEt;
        private boolean zzEu;
        private String zzEv;
        private String zzEw;
        private int zzEx;
        private int zzEy;
        private int zzEz;

        public zza(Context context0) {
            boolean z = true;
            super();
            PackageManager packageManager0 = context0.getPackageManager();
            this.zzA(context0);
            this.zza(context0, packageManager0);
            this.zzB(context0);
            DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
            Locale locale0 = Locale.getDefault();
            this.zzEo = zza.zza(packageManager0, "geo:0,0?q=donuts") != null;
            if(zza.zza(packageManager0, "http://www.google.com") == null) {
                z = false;
            }
            this.zzEp = z;
            this.zzEr = locale0.getCountry();
            this.zzEs = zzk.zzcA().zzgv();
            this.zzEv = locale0.getLanguage();
            this.zzEw = zza.zza(packageManager0);
            this.zzCy = displayMetrics0.density;
            this.zzCw = displayMetrics0.widthPixels;
            this.zzCx = displayMetrics0.heightPixels;
        }

        public zza(Context context0, zzgk zzgk0) {
            PackageManager packageManager0 = context0.getPackageManager();
            this.zzA(context0);
            this.zza(context0, packageManager0);
            this.zzB(context0);
            this.zzEo = zzgk0.zzEo;
            this.zzEp = zzgk0.zzEp;
            this.zzEr = zzgk0.zzEr;
            this.zzEs = zzgk0.zzEs;
            this.zzEv = zzgk0.zzEv;
            this.zzEw = zzgk0.zzEw;
            this.zzCy = zzgk0.zzCy;
            this.zzCw = zzgk0.zzCw;
            this.zzCx = zzgk0.zzCx;
        }

        private void zzA(Context context0) {
            AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
            this.zzEn = audioManager0.getMode();
            this.zzEt = audioManager0.isMusicActive();
            this.zzEu = audioManager0.isSpeakerphoneOn();
            this.zzEx = audioManager0.getStreamVolume(3);
            this.zzEB = audioManager0.getRingerMode();
            this.zzEC = audioManager0.getStreamVolume(2);
        }

        private void zzB(Context context0) {
            boolean z = false;
            Intent intent0 = context0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if(intent0 != null) {
                int v = intent0.getIntExtra("status", -1);
                this.zzED = (double)(((float)intent0.getIntExtra("level", -1)) / ((float)intent0.getIntExtra("scale", -1)));
                if(v == 2 || v == 5) {
                    z = true;
                }
                this.zzEE = z;
                return;
            }
            this.zzED = -1.0;
            this.zzEE = false;
        }

        private static int zza(Context context0, ConnectivityManager connectivityManager0, PackageManager packageManager0) {
            if(zzo.zzbv().zza(packageManager0, "org.dyndns.vivi.SkskShogi", "android.permission.ACCESS_NETWORK_STATE")) {
                NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                return networkInfo0 == null ? -1 : networkInfo0.getType();
            }
            return -2;
        }

        private static ResolveInfo zza(PackageManager packageManager0, String s) {
            return packageManager0.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0x10000);
        }

        private static String zza(PackageManager packageManager0) {
            ResolveInfo resolveInfo0 = zza.zza(packageManager0, "market://details?id=com.google.android.gms.ads");
            if(resolveInfo0 == null) {
                return null;
            }
            else {
                ActivityInfo activityInfo0 = resolveInfo0.activityInfo;
                if(activityInfo0 != null) {
                    try {
                        PackageInfo packageInfo0 = packageManager0.getPackageInfo(activityInfo0.packageName, 0);
                        return packageInfo0 == null ? null : packageInfo0.versionCode + "." + activityInfo0.packageName;
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                }
            }
            return null;
        }

        private void zza(Context context0, PackageManager packageManager0) {
            TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
            ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
            this.zzEq = telephonyManager0.getNetworkOperator();
            this.zzEy = zza.zza(context0, connectivityManager0, packageManager0);
            this.zzEz = telephonyManager0.getNetworkType();
            this.zzEA = telephonyManager0.getPhoneType();
            if(Build.VERSION.SDK_INT >= 16) {
                this.zzEF = connectivityManager0.isActiveNetworkMetered();
                if(connectivityManager0.getActiveNetworkInfo() != null) {
                    this.zzEG = connectivityManager0.getActiveNetworkInfo().getDetailedState().ordinal();
                    return;
                }
                this.zzEG = -1;
                return;
            }
            this.zzEF = false;
            this.zzEG = -1;
        }

        public zzgk zzfJ() {
            return new zzgk(this.zzEn, this.zzEo, this.zzEp, this.zzEq, this.zzEr, this.zzEs, this.zzEt, this.zzEu, this.zzEv, this.zzEw, this.zzEx, this.zzEy, this.zzEz, this.zzEA, this.zzEB, this.zzEC, this.zzCy, this.zzCw, this.zzCx, this.zzED, this.zzEE, this.zzEF, this.zzEG);
        }
    }

    public final int zzCw;
    public final int zzCx;
    public final float zzCy;
    public final int zzEA;
    public final int zzEB;
    public final int zzEC;
    public final double zzED;
    public final boolean zzEE;
    public final boolean zzEF;
    public final int zzEG;
    public final int zzEn;
    public final boolean zzEo;
    public final boolean zzEp;
    public final String zzEq;
    public final String zzEr;
    public final boolean zzEs;
    public final boolean zzEt;
    public final boolean zzEu;
    public final String zzEv;
    public final String zzEw;
    public final int zzEx;
    public final int zzEy;
    public final int zzEz;

    zzgk(int v, boolean z, boolean z1, String s, String s1, boolean z2, boolean z3, boolean z4, String s2, String s3, int v1, int v2, int v3, int v4, int v5, int v6, float f, int v7, int v8, double f1, boolean z5, boolean z6, int v9) {
        this.zzEn = v;
        this.zzEo = z;
        this.zzEp = z1;
        this.zzEq = s;
        this.zzEr = s1;
        this.zzEs = z2;
        this.zzEt = z3;
        this.zzEu = z4;
        this.zzEv = s2;
        this.zzEw = s3;
        this.zzEx = v1;
        this.zzEy = v2;
        this.zzEz = v3;
        this.zzEA = v4;
        this.zzEB = v5;
        this.zzEC = v6;
        this.zzCy = f;
        this.zzCw = v7;
        this.zzCx = v8;
        this.zzED = f1;
        this.zzEE = z5;
        this.zzEF = z6;
        this.zzEG = v9;
    }
}

