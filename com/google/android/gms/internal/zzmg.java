package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.DataSourcesResult;

public interface zzmg extends IInterface {
    public static abstract class zza extends Binder implements zzmg {
        static class com.google.android.gms.internal.zzmg.zza.zza implements zzmg {
            private IBinder zznF;

            com.google.android.gms.internal.zzmg.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzmg
            public void zza(DataSourcesResult dataSourcesResult0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IDataSourcesCallback");
                    if(dataSourcesResult0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataSourcesResult0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.fitness.internal.IDataSourcesCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
                    this.zza((data.readInt() == 0 ? null : ((DataSourcesResult)DataSourcesResult.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.fitness.internal.IDataSourcesCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzmg zzbr(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourcesCallback");
            return iInterface0 != null && iInterface0 instanceof zzmg ? ((zzmg)iInterface0) : new com.google.android.gms.internal.zzmg.zza.zza(iBinder0);
        }
    }

    void zza(DataSourcesResult arg1) throws RemoteException;
}

