package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzok extends IInterface {
    public static abstract class zza extends Binder implements zzok {
        static class com.google.android.gms.internal.zzok.zza.zza implements zzok {
            private IBinder zznF;

            com.google.android.gms.internal.zzok.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzok
            public void onError(int errorCode) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
                    parcel0.writeInt(errorCode);
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzok
            public void zzo(byte[] arr_b) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
                    parcel0.writeByteArray(arr_b);
                    this.zznF.transact(1, parcel0, parcel1, 0);
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
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
                    this.zzo(data.createByteArray());
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
                    this.onError(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzok zzcW(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IDataListener");
            return iInterface0 != null && iInterface0 instanceof zzok ? ((zzok)iInterface0) : new com.google.android.gms.internal.zzok.zza.zza(iBinder0);
        }
    }

    void onError(int arg1) throws RemoteException;

    void zzo(byte[] arg1) throws RemoteException;
}

