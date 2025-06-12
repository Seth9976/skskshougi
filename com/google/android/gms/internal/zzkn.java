package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;

public final class zzkn implements zzkm {
    static class zza extends zzkk {
        private final zzb zzOs;

        public zza(zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        @Override  // com.google.android.gms.internal.zzkk
        public void zzbB(int v) throws RemoteException {
            Status status0 = new Status(v);
            this.zzOs.zzm(status0);
        }
    }

    @Override  // com.google.android.gms.internal.zzkm
    public PendingResult zzc(GoogleApiClient googleApiClient0) {
        return googleApiClient0.zzb(new com.google.android.gms.internal.zzko.zza(googleApiClient0) {
            protected void zza(zzkp zzkp0) throws RemoteException {
                ((zzkr)zzkp0.zznM()).zza(new zza(this));
            }
        });
    }
}

