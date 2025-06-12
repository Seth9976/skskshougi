package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;
import java.io.File;

class zzal {
    public static int version() {
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        }
        catch(NumberFormatException unused_ex) {
            zzbg.zzaz(("Invalid version number: " + Build.VERSION.SDK));
            return 0;
        }
    }

    static boolean zzbe(String s) {
        if(zzal.version() < 9) {
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

