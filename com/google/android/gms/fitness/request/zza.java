package com.google.android.gms.fitness.request;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.HashMap;
import java.util.Map;

public class zza extends com.google.android.gms.fitness.request.zzn.zza {
    public static class com.google.android.gms.fitness.request.zza.zza {
        private static final com.google.android.gms.fitness.request.zza.zza zzalJ;
        private final Map zzalK;

        static {
            com.google.android.gms.fitness.request.zza.zza.zzalJ = new com.google.android.gms.fitness.request.zza.zza();
        }

        private com.google.android.gms.fitness.request.zza.zza() {
            this.zzalK = new HashMap();
        }

        public zza zza(BleScanCallback bleScanCallback0) {
            synchronized(this.zzalK) {
                zza zza0 = (zza)this.zzalK.get(bleScanCallback0);
                if(zza0 == null) {
                    zza0 = new zza(bleScanCallback0, null);
                    this.zzalK.put(bleScanCallback0, zza0);
                }
                return zza0;
            }
        }

        public zza zzb(BleScanCallback bleScanCallback0) {
            synchronized(this.zzalK) {
                zza zza0 = (zza)this.zzalK.get(bleScanCallback0);
                return zza0 != null ? zza0 : new zza(bleScanCallback0, null);
            }
        }

        public static com.google.android.gms.fitness.request.zza.zza zzqS() {
            return com.google.android.gms.fitness.request.zza.zza.zzalJ;
        }
    }

    private final BleScanCallback zzalI;

    private zza(BleScanCallback bleScanCallback0) {
        this.zzalI = (BleScanCallback)zzu.zzu(bleScanCallback0);
    }

    zza(BleScanCallback bleScanCallback0, com.google.android.gms.fitness.request.zza.1 zza$10) {
        this(bleScanCallback0);
    }

    @Override  // com.google.android.gms.fitness.request.zzn
    public void onDeviceFound(BleDevice device) throws RemoteException {
        this.zzalI.onDeviceFound(device);
    }

    @Override  // com.google.android.gms.fitness.request.zzn
    public void onScanStopped() throws RemoteException {
        this.zzalI.onScanStopped();
    }

    class com.google.android.gms.fitness.request.zza.1 {
    }

}

