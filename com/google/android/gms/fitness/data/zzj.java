package com.google.android.gms.fitness.data;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzj extends IInterface {
    public static abstract class zza extends Binder implements zzj {
        static class com.google.android.gms.fitness.data.zzj.zza.zza implements zzj {
            private IBinder zznF;

            com.google.android.gms.fitness.data.zzj.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.fitness.data.zzj
            public void zzc(DataPoint dataPoint0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.data.IDataSourceListener");
                    if(dataPoint0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataPoint0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.fitness.data.IDataSourceListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.fitness.data.IDataSourceListener");
                    this.zzc((data.readInt() == 0 ? null : ((DataPoint)DataPoint.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.fitness.data.IDataSourceListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzj zzbh(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
            return iInterface0 != null && iInterface0 instanceof zzj ? ((zzj)iInterface0) : new com.google.android.gms.fitness.data.zzj.zza.zza(iBinder0);
        }
    }

    void zzc(DataPoint arg1) throws RemoteException;
}

