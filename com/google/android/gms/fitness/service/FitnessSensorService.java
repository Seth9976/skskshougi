package com.google.android.gms.fitness.service;

import android.app.AppOpsManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.internal.service.FitnessDataSourcesRequest;
import com.google.android.gms.fitness.internal.service.FitnessUnregistrationRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.zzmg;
import com.google.android.gms.internal.zzmu;
import java.util.List;

public abstract class FitnessSensorService extends Service {
    static class zza extends com.google.android.gms.fitness.internal.service.zzc.zza {
        private final FitnessSensorService zzamZ;

        private zza(FitnessSensorService fitnessSensorService0) {
            this.zzamZ = fitnessSensorService0;
        }

        zza(FitnessSensorService fitnessSensorService0, com.google.android.gms.fitness.service.FitnessSensorService.1 fitnessSensorService$10) {
            this(fitnessSensorService0);
        }

        @Override  // com.google.android.gms.fitness.internal.service.zzc
        public void zza(FitnessDataSourcesRequest fitnessDataSourcesRequest0, zzmg zzmg0) throws RemoteException {
            this.zzamZ.zzrA();
            List list0 = fitnessDataSourcesRequest0.getDataTypes();
            zzmg0.zza(new DataSourcesResult(this.zzamZ.onFindDataSources(list0), Status.zzXP));
        }

        @Override  // com.google.android.gms.fitness.internal.service.zzc
        public void zza(FitnessUnregistrationRequest fitnessUnregistrationRequest0, zzmu zzmu0) throws RemoteException {
            this.zzamZ.zzrA();
            if(this.zzamZ.onUnregister(fitnessUnregistrationRequest0.getDataSource())) {
                zzmu0.zzm(Status.zzXP);
                return;
            }
            zzmu0.zzm(new Status(13));
        }

        @Override  // com.google.android.gms.fitness.internal.service.zzc
        public void zza(FitnessSensorServiceRequest fitnessSensorServiceRequest0, zzmu zzmu0) throws RemoteException {
            this.zzamZ.zzrA();
            if(this.zzamZ.onRegister(fitnessSensorServiceRequest0)) {
                zzmu0.zzm(Status.zzXP);
                return;
            }
            zzmu0.zzm(new Status(13));
        }
    }

    public static final String SERVICE_INTERFACE = "com.google.android.gms.fitness.service.FitnessSensorService";
    private zza zzamY;

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent) {
        if("com.google.android.gms.fitness.service.FitnessSensorService".equals(intent.getAction())) {
            if(Log.isLoggable("FitnessSensorService", 3)) {
                Log.d("FitnessSensorService", "Intent " + intent + " received by " + this.getClass().getName());
            }
            return this.zzamY.asBinder();
        }
        return null;
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zzamY = new zza(this, null);
    }

    public abstract List onFindDataSources(List arg1);

    public abstract boolean onRegister(FitnessSensorServiceRequest arg1);

    public abstract boolean onUnregister(DataSource arg1);

    protected void zzrA() throws SecurityException {
        int v = Binder.getCallingUid();
        ((AppOpsManager)this.getSystemService("appops")).checkPackage(v, "com.google.android.gms");
    }

    class com.google.android.gms.fitness.service.FitnessSensorService.1 {
    }

}

