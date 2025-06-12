package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public interface zzf extends IInterface {
    public static abstract class zza extends Binder implements zzf {
        static class com.google.android.gms.drive.realtime.internal.zzf.zza.zza implements zzf {
            private IBinder zznF;

            com.google.android.gms.drive.realtime.internal.zzf.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.drive.realtime.internal.zzf
            public void zze(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.realtime.internal.zzf
            public void zzt(Status status0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            DataHolder dataHolder0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zze(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    if(data.readInt() != 0) {
                        dataHolder0 = (Status)Status.CREATOR.createFromParcel(data);
                    }
                    this.zzt(((Status)dataHolder0));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzf zzaV(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
            return iInterface0 != null && iInterface0 instanceof zzf ? ((zzf)iInterface0) : new com.google.android.gms.drive.realtime.internal.zzf.zza.zza(iBinder0);
        }
    }

    void zze(DataHolder arg1) throws RemoteException;

    void zzt(Status arg1) throws RemoteException;
}

