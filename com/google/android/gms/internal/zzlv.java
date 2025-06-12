package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.telephony.TelephonyManager;
import android.util.Log;

public class zzlv {
    private static int zzakU;

    static {
        zzlv.zzakU = -1;
    }

    public static boolean zzam(Context context0) {
        return zzlv.zzap(context0) == 3;
    }

    private static int zzan(Context context0) {
        return zzlv.zzao(context0) % 1000 / 100 + 5;
    }

    private static int zzao(Context context0) {
        try {
            return context0.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.w("Fitness", "Could not find package info for Google Play Services");
            return -1;
        }
    }

    public static int zzap(Context context0) {
        if(zzlv.zzakU == -1) {
            switch(zzlv.zzan(context0)) {
                case 10: {
                    zzlv.zzakU = 3;
                    return 3;
                }
                case 8: 
                case 13: {
                    zzlv.zzakU = 0;
                    return 0;
                }
                default: {
                    zzlv.zzakU = zzlv.zzaq(context0) ? 1 : 2;
                    break;
                }
            }
        }
        return zzlv.zzakU;
    }

    private static boolean zzaq(Context context0) {
        return ((TelephonyManager)context0.getSystemService("phone")).getPhoneType() != 0;
    }
}

