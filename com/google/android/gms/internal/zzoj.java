package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.Device;

public interface zzoj extends IInterface {
    public static abstract class zza extends Binder implements zzoj {
        static class com.google.android.gms.internal.zzoj.zza.zza implements zzoj {
            private IBinder zznF;

            com.google.android.gms.internal.zzoj.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzoj
            public void onDisconnected() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzoj
            public void onError(int errorCode) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    parcel0.writeInt(errorCode);
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzoj
            public void zza(Device device0, byte[] arr_b) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    if(device0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        device0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeByteArray(arr_b);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzoj
            public void zzdO(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    parcel0.writeString(s);
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzoj
            public void zzwL() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    this.zznF.transact(5, parcel0, parcel1, 0);
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
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    this.zza((data.readInt() == 0 ? null : ((Device)Device.CREATOR.createFromParcel(data))), data.createByteArray());
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    this.onDisconnected();
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    this.onError(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    this.zzdO(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    this.zzwL();
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzoj zzcV(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            return iInterface0 != null && iInterface0 instanceof zzoj ? ((zzoj)iInterface0) : new com.google.android.gms.internal.zzoj.zza.zza(iBinder0);
        }
    }

    void onDisconnected() throws RemoteException;

    void onError(int arg1) throws RemoteException;

    void zza(Device arg1, byte[] arg2) throws RemoteException;

    void zzdO(String arg1) throws RemoteException;

    void zzwL() throws RemoteException;
}

