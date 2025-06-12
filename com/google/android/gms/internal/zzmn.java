package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;

public interface zzmn extends IInterface {
    public static abstract class zza extends Binder implements zzmn {
        static class com.google.android.gms.internal.zzmn.zza.zza implements zzmn {
            private IBinder zznF;

            com.google.android.gms.internal.zzmn.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzmn
            public void zza(DataSourcesRequest dataSourcesRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    if(dataSourcesRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataSourcesRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmn
            public void zza(SensorRegistrationRequest sensorRegistrationRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    if(sensorRegistrationRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        sensorRegistrationRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmn
            public void zza(SensorUnregistrationRequest sensorUnregistrationRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    if(sensorUnregistrationRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        sensorUnregistrationRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            DataSourcesRequest dataSourcesRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    if(data.readInt() != 0) {
                        dataSourcesRequest0 = (DataSourcesRequest)DataSourcesRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(dataSourcesRequest0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    if(data.readInt() != 0) {
                        dataSourcesRequest0 = (SensorRegistrationRequest)SensorRegistrationRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((SensorRegistrationRequest)dataSourcesRequest0));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    if(data.readInt() != 0) {
                        dataSourcesRequest0 = (SensorUnregistrationRequest)SensorUnregistrationRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((SensorUnregistrationRequest)dataSourcesRequest0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzmn zzby(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
            return iInterface0 != null && iInterface0 instanceof zzmn ? ((zzmn)iInterface0) : new com.google.android.gms.internal.zzmn.zza.zza(iBinder0);
        }
    }

    void zza(DataSourcesRequest arg1) throws RemoteException;

    void zza(SensorRegistrationRequest arg1) throws RemoteException;

    void zza(SensorUnregistrationRequest arg1) throws RemoteException;
}

