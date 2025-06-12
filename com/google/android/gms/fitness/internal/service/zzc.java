package com.google.android.gms.fitness.internal.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;
import com.google.android.gms.internal.zzmg;
import com.google.android.gms.internal.zzmu;

public interface zzc extends IInterface {
    public static abstract class zza extends Binder implements zzc {
        public zza() {
            this.attachInterface(this, "com.google.android.gms.fitness.internal.service.IFitnessSensorService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            FitnessDataSourcesRequest fitnessDataSourcesRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    if(data.readInt() != 0) {
                        fitnessDataSourcesRequest0 = (FitnessDataSourcesRequest)FitnessDataSourcesRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(fitnessDataSourcesRequest0, com.google.android.gms.internal.zzmg.zza.zzbr(data.readStrongBinder()));
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    if(data.readInt() != 0) {
                        fitnessDataSourcesRequest0 = (FitnessSensorServiceRequest)FitnessSensorServiceRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((FitnessSensorServiceRequest)fitnessDataSourcesRequest0), com.google.android.gms.internal.zzmu.zza.zzbF(data.readStrongBinder()));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    if(data.readInt() != 0) {
                        fitnessDataSourcesRequest0 = (FitnessUnregistrationRequest)FitnessUnregistrationRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((FitnessUnregistrationRequest)fitnessDataSourcesRequest0), com.google.android.gms.internal.zzmu.zza.zzbF(data.readStrongBinder()));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }
    }

    void zza(FitnessDataSourcesRequest arg1, zzmg arg2) throws RemoteException;

    void zza(FitnessUnregistrationRequest arg1, zzmu arg2) throws RemoteException;

    void zza(FitnessSensorServiceRequest arg1, zzmu arg2) throws RemoteException;
}

