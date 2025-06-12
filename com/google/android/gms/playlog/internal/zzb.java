package com.google.android.gms.playlog.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzrr.zzd;
import java.util.ArrayList;

public class zzb {
    public static class zza {
        public final PlayLoggerContext zzaGK;
        public final LogEvent zzaGL;
        public final zzd zzaGM;

        private zza(PlayLoggerContext playLoggerContext0, LogEvent logEvent0) {
            this.zzaGK = (PlayLoggerContext)zzu.zzu(playLoggerContext0);
            this.zzaGL = (LogEvent)zzu.zzu(logEvent0);
            this.zzaGM = null;
        }

        zza(PlayLoggerContext playLoggerContext0, LogEvent logEvent0, com.google.android.gms.playlog.internal.zzb.1 zzb$10) {
            this(playLoggerContext0, logEvent0);
        }
    }

    private final ArrayList zzaGI;
    private int zzaGJ;

    public zzb() {
        this(100);
    }

    public zzb(int v) {
        this.zzaGI = new ArrayList();
        this.zzaGJ = v;
    }

    public void clear() {
        this.zzaGI.clear();
    }

    public int getCapacity() {
        return this.zzaGJ;
    }

    public int getSize() {
        return this.zzaGI.size();
    }

    public boolean isEmpty() {
        return this.zzaGI.isEmpty();
    }

    public void zza(PlayLoggerContext playLoggerContext0, LogEvent logEvent0) {
        zza zzb$zza0 = new zza(playLoggerContext0, logEvent0, null);
        this.zzaGI.add(zzb$zza0);
        this.zzxo();
    }

    public ArrayList zzxn() {
        return this.zzaGI;
    }

    private void zzxo() {
        while(this.getSize() > this.getCapacity()) {
            this.zzaGI.remove(0);
        }
    }

    class com.google.android.gms.playlog.internal.zzb.1 {
    }

}

