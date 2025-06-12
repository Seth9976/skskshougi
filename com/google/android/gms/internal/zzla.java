package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;

public class zzla {
    public static boolean zzi(Context context0, String s) {
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            if((packageManager0.getApplicationInfo(s, 0).flags & 0x200000) != 0) {
                return true;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    public static boolean zziW() {
        return false;
    }
}

