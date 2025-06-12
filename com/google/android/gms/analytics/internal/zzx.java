package com.google.android.gms.analytics.internal;

import android.os.Build.VERSION;
import java.io.File;

public class zzx {
    public static int version() {
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        }
        catch(NumberFormatException unused_ex) {
            zzae.zzf("Invalid version number", Build.VERSION.SDK);
            return 0;
        }
    }

    public static boolean zzbe(String s) {
        if(zzx.version() < 9) {
            return false;
        }
        File file0 = new File(s);
        file0.setReadable(false, false);
        file0.setWritable(false, false);
        file0.setReadable(true, true);
        file0.setWritable(true, true);
        return true;
    }
}

