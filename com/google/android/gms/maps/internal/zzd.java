package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzi;

public interface zzd extends IInterface {
    public static abstract class zza extends Binder implements zzd {
        static class com.google.android.gms.maps.internal.zzd.zza.zza implements zzd {
            private IBinder zznF;

            com.google.android.gms.maps.internal.zzd.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.zzd
            public com.google.android.gms.dynamic.zzd zzf(zzi zzi0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    parcel0.writeStrongBinder((zzi0 == null ? null : zzi0.asBinder()));
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.zzd
            public com.google.android.gms.dynamic.zzd zzg(zzi zzi0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    parcel0.writeStrongBinder((zzi0 == null ? null : zzi0.asBinder()));
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    com.google.android.gms.dynamic.zzd zzd0 = this.zzf(com.google.android.gms.maps.model.internal.zzi.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    if(zzd0 != null) {
                        iBinder0 = zzd0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    com.google.android.gms.dynamic.zzd zzd1 = this.zzg(com.google.android.gms.maps.model.internal.zzi.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    if(zzd1 != null) {
                        iBinder0 = zzd1.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzd zzci(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return iInterface0 != null && iInterface0 instanceof zzd ? ((zzd)iInterface0) : new com.google.android.gms.maps.internal.zzd.zza.zza(iBinder0);
        }
    }

    com.google.android.gms.dynamic.zzd zzf(zzi arg1) throws RemoteException;

    com.google.android.gms.dynamic.zzd zzg(zzi arg1) throws RemoteException;
}

