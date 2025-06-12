package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;

@Deprecated
public class zzoy implements zza {
    private final zzoz zzaGB;
    private boolean zzaGC;

    public zzoy(Context context0, int v) {
        this(context0, v, null);
    }

    public zzoy(Context context0, int v, String s) {
        this(context0, v, s, null, true);
    }

    public zzoy(Context context0, int v, String s, String s1, boolean z) {
        this.zzaGB = new zzoz(context0, v, s, s1, this, z, (context0 == context0.getApplicationContext() ? "OneTimePlayLogger" : context0.getClass().getName()));
        this.zzaGC = true;
    }

    public void send() {
        this.zzxk();
        this.zzaGB.start();
        this.zzaGC = false;
    }

    public void zza(String s, byte[] arr_b, String[] arr_s) {
        this.zzxk();
        this.zzaGB.zzb(s, arr_b, arr_s);
    }

    @Override  // com.google.android.gms.internal.zzoz$zza
    public void zzf(PendingIntent pendingIntent0) {
        Log.w("OneTimePlayLogger", "logger connection failed: " + pendingIntent0);
    }

    private void zzxk() {
        if(!this.zzaGC) {
            throw new IllegalStateException("Cannot reuse one-time logger after sending.");
        }
    }

    @Override  // com.google.android.gms.internal.zzoz$zza
    public void zzxl() {
        this.zzaGB.stop();
    }

    @Override  // com.google.android.gms.internal.zzoz$zza
    public void zzxm() {
        Log.w("OneTimePlayLogger", "logger connection failed");
    }
}

