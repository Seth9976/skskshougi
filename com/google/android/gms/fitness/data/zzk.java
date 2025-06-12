package com.google.android.gms.fitness.data;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.request.OnDataPointListener;
import java.util.HashMap;
import java.util.Map;

public class zzk extends zza {
    public static class com.google.android.gms.fitness.data.zzk.zza {
        private static final com.google.android.gms.fitness.data.zzk.zza zzakD;
        private final Map zzakE;

        static {
            com.google.android.gms.fitness.data.zzk.zza.zzakD = new com.google.android.gms.fitness.data.zzk.zza();
        }

        private com.google.android.gms.fitness.data.zzk.zza() {
            this.zzakE = new HashMap();
        }

        public zzk zza(OnDataPointListener onDataPointListener0) {
            synchronized(this.zzakE) {
                zzk zzk0 = (zzk)this.zzakE.get(onDataPointListener0);
                if(zzk0 == null) {
                    zzk0 = new zzk(onDataPointListener0, null);
                    this.zzakE.put(onDataPointListener0, zzk0);
                }
                return zzk0;
            }
        }

        public zzk zzb(OnDataPointListener onDataPointListener0) {
            synchronized(this.zzakE) {
            }
            return (zzk)this.zzakE.get(onDataPointListener0);
        }

        public zzk zzc(OnDataPointListener onDataPointListener0) {
            synchronized(this.zzakE) {
                zzk zzk0 = (zzk)this.zzakE.remove(onDataPointListener0);
                return zzk0 != null ? zzk0 : new zzk(onDataPointListener0, null);
            }
        }

        public static com.google.android.gms.fitness.data.zzk.zza zzqH() {
            return com.google.android.gms.fitness.data.zzk.zza.zzakD;
        }
    }

    private final OnDataPointListener zzakC;

    private zzk(OnDataPointListener onDataPointListener0) {
        this.zzakC = (OnDataPointListener)zzu.zzu(onDataPointListener0);
    }

    zzk(OnDataPointListener onDataPointListener0, com.google.android.gms.fitness.data.zzk.1 zzk$10) {
        this(onDataPointListener0);
    }

    @Override  // com.google.android.gms.fitness.data.zzj
    public void zzc(DataPoint dataPoint0) throws RemoteException {
        this.zzakC.onDataPoint(dataPoint0);
    }

    class com.google.android.gms.fitness.data.zzk.1 {
    }

}

