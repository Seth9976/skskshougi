package com.google.android.gms.fitness.service;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.zzj;
import java.util.List;

class zzb implements SensorEventDispatcher {
    private final zzj zzamr;

    zzb(zzj zzj0) {
        this.zzamr = (zzj)zzu.zzu(zzj0);
    }

    @Override  // com.google.android.gms.fitness.service.SensorEventDispatcher
    public void publish(DataPoint dataPoint) throws RemoteException {
        dataPoint.zzqx();
        this.zzamr.zzc(dataPoint);
    }

    @Override  // com.google.android.gms.fitness.service.SensorEventDispatcher
    public void publish(List list0) throws RemoteException {
        for(Object object0: list0) {
            this.publish(((DataPoint)object0));
        }
    }
}

