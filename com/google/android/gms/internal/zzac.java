package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import java.io.File;
import org.apache.http.client.HttpClient;

public class zzac {
    public static zzl zza(Context context0) {
        return zzac.zza(context0, null);
    }

    public static zzl zza(Context context0, zzy zzy0) {
        File file0 = new File(context0.getCacheDir(), "volley");
        String s = "volley/0";
        try {
            s = "org.dyndns.vivi.SkskShogi/" + context0.getPackageManager().getPackageInfo("org.dyndns.vivi.SkskShogi", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        if(zzy0 == null) {
            zzy0 = Build.VERSION.SDK_INT >= 9 ? new zzz() : new zzw(((HttpClient)AndroidHttpClient.newInstance(s)));
        }
        zzt zzt0 = new zzt(zzy0);
        zzl zzl0 = new zzl(new zzv(file0), zzt0);
        zzl0.start();
        return zzl0;
    }
}

