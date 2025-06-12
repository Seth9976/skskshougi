package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class zzhu {
    public interface zza {
        Object zze(Object arg1);
    }

    public static zzhv zza(zzhv zzhv0, zza zzhu$zza0) {
        zzhv zzhv1 = new zzhs();
        zzhv0.zzb(new Runnable() {
            @Override
            public void run() {
                try {
                    Object object0 = zzhv0.get();
                    Object object1 = zzhu$zza0.zze(object0);
                    ((zzhs)zzhv1).zzf(object1);
                }
                catch(CancellationException | InterruptedException | ExecutionException unused_ex) {
                    ((zzhs)zzhv1).cancel(true);
                }
            }
        });
        return zzhv1;
    }
}

