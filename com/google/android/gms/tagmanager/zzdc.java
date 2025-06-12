package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.analytics.Tracker;

class zzdc {
    static class zza implements Logger {
        @Override  // com.google.android.gms.analytics.Logger
        public void error(Exception exception) {
            zzbg.zzb("", exception);
        }

        @Override  // com.google.android.gms.analytics.Logger
        public void error(String message) {
            zzbg.zzaz(message);
        }

        // 去混淆评级： 低(40)
        @Override  // com.google.android.gms.analytics.Logger
        public int getLogLevel() {
            return 3;
        }

        @Override  // com.google.android.gms.analytics.Logger
        public void info(String message) {
            zzbg.zzaA(message);
        }

        @Override  // com.google.android.gms.analytics.Logger
        public void setLogLevel(int logLevel) {
            zzbg.zzaC("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
        }

        @Override  // com.google.android.gms.analytics.Logger
        public void verbose(String message) {
            zzbg.zzaB(message);
        }

        @Override  // com.google.android.gms.analytics.Logger
        public void warn(String message) {
            zzbg.zzaC(message);
        }

        private static int zzja(int v) [...] // Potential decryptor
    }

    private Context mContext;
    private Tracker zzIq;
    private GoogleAnalytics zzIs;

    zzdc(Context context0) {
        this.mContext = context0;
    }

    public Tracker zzeG(String s) {
        this.zzeH(s);
        return this.zzIq;
    }

    private void zzeH(String s) {
        synchronized(this) {
            if(this.zzIs == null) {
                this.zzIs = GoogleAnalytics.getInstance(this.mContext);
                this.zzIs.setLogger(new zza());
                this.zzIq = this.zzIs.newTracker(s);
            }
        }
    }
}

