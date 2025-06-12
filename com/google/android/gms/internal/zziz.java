package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zziz extends IInterface {
    public static abstract class zza extends Binder implements zziz {
        static class com.google.android.gms.internal.zziz.zza.zza implements zziz {
            private IBinder zznF;

            com.google.android.gms.internal.zziz.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zziz
            public void zza(zziy zziy0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteService");
                    parcel0.writeStrongBinder((zziy0 == null ? null : zziy0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zziz
            public void zzb(zziy zziy0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appinvite.internal.IAppInviteService");
                    parcel0.writeStrongBinder((zziy0 == null ? null : zziy0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
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
                case 1: {
                    data.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
                    this.zzb(com.google.android.gms.internal.zziy.zza.zzah(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
                    this.zza(com.google.android.gms.internal.zziy.zza.zzah(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.appinvite.internal.IAppInviteService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zziz zzai(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
            return iInterface0 != null && iInterface0 instanceof zziz ? ((zziz)iInterface0) : new com.google.android.gms.internal.zziz.zza.zza(iBinder0);
        }
    }

    void zza(zziy arg1, String arg2) throws RemoteException;

    void zzb(zziy arg1, String arg2) throws RemoteException;
}

