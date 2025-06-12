package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;

public class zzbq extends zzd {
    private final zzb zzOs;

    public zzbq(zzb zza$zzb0) {
        this.zzOs = zza$zzb0;
    }

    @Override  // com.google.android.gms.drive.internal.zzd
    public void onSuccess() throws RemoteException {
        this.zzOs.zzm(Status.zzXP);
    }

    @Override  // com.google.android.gms.drive.internal.zzd
    public void zzt(Status status0) throws RemoteException {
        this.zzOs.zzm(status0);
    }
}

