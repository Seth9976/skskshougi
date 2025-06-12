package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzt;

public final class zzkj extends zzku {
    public static final class zza {
        public final int zzZL;
        public final int zzZM;

        public zza(int v, int v1) {
            this.zzZL = v;
            this.zzZM = v1;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object obj) {
            return obj instanceof zza ? this == obj || ((zza)obj).zzZL == this.zzZL && ((zza)obj).zzZM == this.zzZM : false;
        }

        @Override
        public int hashCode() {
            return zzt.hashCode(new Object[]{this.zzZL, this.zzZM});
        }
    }

    public zzkj() {
        super(10);
    }
}

