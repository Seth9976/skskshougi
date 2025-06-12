package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;

public interface zzmj extends IInterface {
    public static abstract class zza extends Binder implements zzmj {
        static class com.google.android.gms.internal.zzmj.zza.zza implements zzmj {
            private IBinder zznF;

            com.google.android.gms.internal.zzmj.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzmj
            public void zza(DataTypeCreateRequest dataTypeCreateRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if(dataTypeCreateRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataTypeCreateRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmj
            public void zza(DataTypeReadRequest dataTypeReadRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if(dataTypeReadRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataTypeReadRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmj
            public void zza(DisableFitRequest disableFitRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if(disableFitRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        disableFitRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(22, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            DataTypeCreateRequest dataTypeCreateRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if(data.readInt() != 0) {
                        dataTypeCreateRequest0 = (DataTypeCreateRequest)DataTypeCreateRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(dataTypeCreateRequest0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if(data.readInt() != 0) {
                        dataTypeCreateRequest0 = (DataTypeReadRequest)DataTypeReadRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((DataTypeReadRequest)dataTypeCreateRequest0));
                    return true;
                }
                case 22: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    if(data.readInt() != 0) {
                        dataTypeCreateRequest0 = (DisableFitRequest)DisableFitRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((DisableFitRequest)dataTypeCreateRequest0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzmj zzbu(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
            return iInterface0 != null && iInterface0 instanceof zzmj ? ((zzmj)iInterface0) : new com.google.android.gms.internal.zzmj.zza.zza(iBinder0);
        }
    }

    void zza(DataTypeCreateRequest arg1) throws RemoteException;

    void zza(DataTypeReadRequest arg1) throws RemoteException;

    void zza(DisableFitRequest arg1) throws RemoteException;
}

