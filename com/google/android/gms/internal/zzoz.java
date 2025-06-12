package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.playlog.internal.LogEvent;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import com.google.android.gms.playlog.internal.zzd;
import com.google.android.gms.playlog.internal.zzf;

@Deprecated
public class zzoz {
    public interface zza {
        void zzf(PendingIntent arg1);

        void zzxl();

        void zzxm();
    }

    private final zzf zzaGD;
    private PlayLoggerContext zzaGE;

    public zzoz(Context context0, int v, String s, String s1, zza zzoz$zza0, boolean z, String s2) {
        int v1 = 0;
        try {
            v1 = context0.getPackageManager().getPackageInfo("org.dyndns.vivi.SkskShogi", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.wtf("PlayLogger", "This can\'t happen.");
        }
        this.zzaGE = new PlayLoggerContext("org.dyndns.vivi.SkskShogi", v1, v, s, s1, z);
        this.zzaGD = new zzf(context0, context0.getMainLooper(), new zzd(zzoz$zza0), new zze(null, null, null, 49, null, "org.dyndns.vivi.SkskShogi", s2, null));
    }

    public void start() {
        this.zzaGD.start();
    }

    public void stop() {
        this.zzaGD.stop();
    }

    public void zza(long v, String s, byte[] arr_b, String[] arr_s) {
        PlayLoggerContext playLoggerContext0 = this.zzaGE;
        LogEvent logEvent0 = new LogEvent(v, s, arr_b, arr_s);
        this.zzaGD.zzb(playLoggerContext0, logEvent0);
    }

    public void zzb(String s, byte[] arr_b, String[] arr_s) {
        this.zza(System.currentTimeMillis(), s, arr_b, arr_s);
    }
}

