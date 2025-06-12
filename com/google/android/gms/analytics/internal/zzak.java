package com.google.android.gms.analytics.internal;

public class zzak extends zzq {
    static class zza extends zzc implements com.google.android.gms.analytics.internal.zzq.zza {
        private final zzal zzMD;

        public zza(zzf zzf0) {
            super(zzf0);
            this.zzMD = new zzal();
        }

        @Override  // com.google.android.gms.analytics.internal.zzq$zza
        public void zzc(String s, boolean z) {
            int v = 1;
            if("ga_autoActivityTracking".equals(s)) {
                zzal zzal0 = this.zzMD;
                if(!z) {
                    v = 0;
                }
                zzal0.zzMG = v;
                return;
            }
            if("ga_anonymizeIp".equals(s)) {
                zzal zzal1 = this.zzMD;
                if(!z) {
                    v = 0;
                }
                zzal1.zzMH = v;
                return;
            }
            if("ga_reportUncaughtExceptions".equals(s)) {
                zzal zzal2 = this.zzMD;
                if(!z) {
                    v = 0;
                }
                zzal2.zzMI = v;
                return;
            }
            this.zzd("bool configuration name not recognized", s);
        }

        @Override  // com.google.android.gms.analytics.internal.zzq$zza
        public void zzd(String s, int v) {
            if("ga_sessionTimeout".equals(s)) {
                this.zzMD.zzMF = v;
                return;
            }
            this.zzd("int configuration name not recognized", s);
        }

        @Override  // com.google.android.gms.analytics.internal.zzq$zza
        public zzp zziV() {
            return this.zzkx();
        }

        @Override  // com.google.android.gms.analytics.internal.zzq$zza
        public void zzk(String s, String s1) {
            this.zzMD.zzMJ.put(s, s1);
        }

        public zzal zzkx() {
            return this.zzMD;
        }

        @Override  // com.google.android.gms.analytics.internal.zzq$zza
        public void zzl(String s, String s1) {
            if("ga_trackingId".equals(s)) {
                this.zzMD.zztd = s1;
                return;
            }
            if("ga_sampleFrequency".equals(s)) {
                try {
                    this.zzMD.zzME = Double.parseDouble(s1);
                }
                catch(NumberFormatException numberFormatException0) {
                    this.zzc("Error parsing ga_sampleFrequency value", s1, numberFormatException0);
                }
                return;
            }
            this.zzd("string configuration name not recognized", s);
        }
    }

    public zzak(zzf zzf0) {
        super(zzf0, new zza(zzf0));
    }
}

