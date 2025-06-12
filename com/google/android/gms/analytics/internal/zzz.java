package com.google.android.gms.analytics.internal;

public class zzz extends zzq {
    static class zza implements com.google.android.gms.analytics.internal.zzq.zza {
        private final zzf zzJy;
        private final zzaa zzLT;

        public zza(zzf zzf0) {
            this.zzJy = zzf0;
            this.zzLT = new zzaa();
        }

        @Override  // com.google.android.gms.analytics.internal.zzq$zza
        public void zzc(String s, boolean z) {
            if("ga_dryRun".equals(s)) {
                this.zzLT.zzLY = z ? 1 : 0;
                return;
            }
            this.zzJy.zzhQ().zzd("Bool xml configuration name not recognized", s);
        }

        @Override  // com.google.android.gms.analytics.internal.zzq$zza
        public void zzd(String s, int v) {
            if("ga_dispatchPeriod".equals(s)) {
                this.zzLT.zzLX = v;
                return;
            }
            this.zzJy.zzhQ().zzd("Int xml configuration name not recognized", s);
        }

        @Override  // com.google.android.gms.analytics.internal.zzq$zza
        public zzp zziV() {
            return this.zzjJ();
        }

        public zzaa zzjJ() {
            return this.zzLT;
        }

        @Override  // com.google.android.gms.analytics.internal.zzq$zza
        public void zzk(String s, String s1) {
        }

        @Override  // com.google.android.gms.analytics.internal.zzq$zza
        public void zzl(String s, String s1) {
            if("ga_appName".equals(s)) {
                this.zzLT.zzLU = s1;
                return;
            }
            if("ga_appVersion".equals(s)) {
                this.zzLT.zzLV = s1;
                return;
            }
            if("ga_logLevel".equals(s)) {
                this.zzLT.zzLW = s1;
                return;
            }
            this.zzJy.zzhQ().zzd("String xml configuration name not recognized", s);
        }
    }

    public zzz(zzf zzf0) {
        super(zzf0, new zza(zzf0));
    }
}

