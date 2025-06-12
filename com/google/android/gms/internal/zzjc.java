package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

public interface zzjc extends IInterface {
    public static abstract class zza extends Binder implements zzjc {
        static class com.google.android.gms.internal.zzjc.zza.zza implements zzjc {
            private IBinder zznF;

            com.google.android.gms.internal.zzjc.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzjc
            public void zza(int v, DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    parcel0.writeInt(v);
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzjc
            public void zza(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzjc
            public void zzao(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    parcel0.writeInt(v);
                    this.zznF.transact(5005, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzjc
            public void zzg(int v, int v1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    this.zznF.transact(5003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzjc
            public void zzkU() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    this.zznF.transact(5004, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.appstate.internal.IAppStateCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            DataHolder dataHolder0 = null;
            switch(code) {
                case 5001: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    int v2 = data.readInt();
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zza(v2, dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5002: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zza(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5003: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    this.zzg(data.readInt(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 5004: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    this.zzkU();
                    reply.writeNoException();
                    return true;
                }
                case 5005: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    this.zzao(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzjc zzak(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzjc ? ((zzjc)iInterface0) : new com.google.android.gms.internal.zzjc.zza.zza(iBinder0);
        }
    }

    void zza(int arg1, DataHolder arg2) throws RemoteException;

    void zza(DataHolder arg1) throws RemoteException;

    void zzao(int arg1) throws RemoteException;

    void zzg(int arg1, int arg2) throws RemoteException;

    void zzkU() throws RemoteException;
}

