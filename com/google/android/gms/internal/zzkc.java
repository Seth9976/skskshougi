package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;

public interface zzkc extends IInterface {
    public static abstract class zza extends Binder implements zzkc {
        static class com.google.android.gms.internal.zzkc.zza.zza implements zzkc {
            private IBinder zznF;

            com.google.android.gms.internal.zzkc.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzkc
            public void onDisconnected() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzkc
            public void onError(int statusCode) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    parcel0.writeInt(statusCode);
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzkc
            public void zza(int v, int v1, Surface surface0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    if(surface0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        surface0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzkc
            public void zzmg() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    this.zza(data.readInt(), data.readInt(), (data.readInt() == 0 ? null : ((Surface)Surface.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    this.onError(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    this.onDisconnected();
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    this.zzmg();
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzkc zzaz(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzkc ? ((zzkc)iInterface0) : new com.google.android.gms.internal.zzkc.zza.zza(iBinder0);
        }
    }

    void onDisconnected() throws RemoteException;

    void onError(int arg1) throws RemoteException;

    void zza(int arg1, int arg2, Surface arg3) throws RemoteException;

    void zzmg() throws RemoteException;
}

