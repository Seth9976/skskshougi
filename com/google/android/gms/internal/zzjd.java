package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzjd extends IInterface {
    public static abstract class zza extends Binder implements zzjd {
        static class com.google.android.gms.internal.zzjd.zza.zza implements zzjd {
            private IBinder zznF;

            com.google.android.gms.internal.zzjd.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzjd
            public void zza(zzjc zzjc0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    parcel0.writeStrongBinder((zzjc0 == null ? null : zzjc0.asBinder()));
                    this.zznF.transact(5005, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzjd
            public void zza(zzjc zzjc0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    parcel0.writeStrongBinder((zzjc0 == null ? null : zzjc0.asBinder()));
                    parcel0.writeInt(v);
                    this.zznF.transact(5004, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzjd
            public void zza(zzjc zzjc0, int v, String s, byte[] arr_b) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    parcel0.writeStrongBinder((zzjc0 == null ? null : zzjc0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeString(s);
                    parcel0.writeByteArray(arr_b);
                    this.zznF.transact(5006, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzjd
            public void zza(zzjc zzjc0, int v, byte[] arr_b) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    parcel0.writeStrongBinder((zzjc0 == null ? null : zzjc0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeByteArray(arr_b);
                    this.zznF.transact(5003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzjd
            public void zzb(zzjc zzjc0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    parcel0.writeStrongBinder((zzjc0 == null ? null : zzjc0.asBinder()));
                    this.zznF.transact(5008, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzjd
            public void zzb(zzjc zzjc0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    parcel0.writeStrongBinder((zzjc0 == null ? null : zzjc0.asBinder()));
                    parcel0.writeInt(v);
                    this.zznF.transact(5007, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzjd
            public void zzc(zzjc zzjc0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    parcel0.writeStrongBinder((zzjc0 == null ? null : zzjc0.asBinder()));
                    this.zznF.transact(5009, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzjd
            public int zzkV() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    this.zznF.transact(5001, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzjd
            public int zzkW() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
                    this.zznF.transact(5002, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 5001: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    int v2 = this.zzkV();
                    reply.writeNoException();
                    reply.writeInt(v2);
                    return true;
                }
                case 5002: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    int v3 = this.zzkW();
                    reply.writeNoException();
                    reply.writeInt(v3);
                    return true;
                }
                case 5003: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    this.zza(com.google.android.gms.internal.zzjc.zza.zzak(data.readStrongBinder()), data.readInt(), data.createByteArray());
                    reply.writeNoException();
                    return true;
                }
                case 5004: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    this.zza(com.google.android.gms.internal.zzjc.zza.zzak(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 5005: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    this.zza(com.google.android.gms.internal.zzjc.zza.zzak(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5006: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    this.zza(com.google.android.gms.internal.zzjc.zza.zzak(data.readStrongBinder()), data.readInt(), data.readString(), data.createByteArray());
                    reply.writeNoException();
                    return true;
                }
                case 5007: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    this.zzb(com.google.android.gms.internal.zzjc.zza.zzak(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 5008: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    this.zzb(com.google.android.gms.internal.zzjc.zza.zzak(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5009: {
                    data.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                    this.zzc(com.google.android.gms.internal.zzjc.zza.zzak(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.appstate.internal.IAppStateService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzjd zzal(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
            return iInterface0 != null && iInterface0 instanceof zzjd ? ((zzjd)iInterface0) : new com.google.android.gms.internal.zzjd.zza.zza(iBinder0);
        }
    }

    void zza(zzjc arg1) throws RemoteException;

    void zza(zzjc arg1, int arg2) throws RemoteException;

    void zza(zzjc arg1, int arg2, String arg3, byte[] arg4) throws RemoteException;

    void zza(zzjc arg1, int arg2, byte[] arg3) throws RemoteException;

    void zzb(zzjc arg1) throws RemoteException;

    void zzb(zzjc arg1, int arg2) throws RemoteException;

    void zzc(zzjc arg1) throws RemoteException;

    int zzkV() throws RemoteException;

    int zzkW() throws RemoteException;
}

