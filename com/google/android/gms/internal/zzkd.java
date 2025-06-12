package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzkd extends IInterface {
    public static abstract class zza extends Binder implements zzkd {
        static class com.google.android.gms.internal.zzkd.zza.zza implements zzkd {
            private IBinder zznF;

            com.google.android.gms.internal.zzkd.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzkd
            public void destroy() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzkd
            public void disconnect() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzkd
            public void zza(zzkc zzkc0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    if(zzkc0 != null) {
                        iBinder0 = zzkc0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(6, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzkd
            public void zza(zzkc zzkc0, int v) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    if(zzkc0 != null) {
                        iBinder0 = zzkc0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    parcel0.writeInt(v);
                    this.zznF.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzkd
            public void zza(zzkc zzkc0, zzke zzke0, String s, String s1) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    parcel0.writeStrongBinder((zzkc0 == null ? null : zzkc0.asBinder()));
                    if(zzke0 != null) {
                        iBinder0 = zzke0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    this.destroy();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    this.disconnect();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    this.zza(com.google.android.gms.internal.zzkc.zza.zzaz(data.readStrongBinder()), com.google.android.gms.internal.zzke.zza.zzaB(data.readStrongBinder()), data.readString(), data.readString());
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    this.zza(com.google.android.gms.internal.zzkc.zza.zzaz(data.readStrongBinder()), data.readInt());
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    this.zza(com.google.android.gms.internal.zzkc.zza.zzaz(data.readStrongBinder()));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzkd zzaA(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
            return iInterface0 != null && iInterface0 instanceof zzkd ? ((zzkd)iInterface0) : new com.google.android.gms.internal.zzkd.zza.zza(iBinder0);
        }
    }

    void destroy() throws RemoteException;

    void disconnect() throws RemoteException;

    void zza(zzkc arg1) throws RemoteException;

    void zza(zzkc arg1, int arg2) throws RemoteException;

    void zza(zzkc arg1, zzke arg2, String arg3, String arg4) throws RemoteException;
}

