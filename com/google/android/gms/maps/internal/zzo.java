package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzi;

public interface zzo extends IInterface {
    public static abstract class zza extends Binder implements zzo {
        static class com.google.android.gms.maps.internal.zzo.zza.zza implements zzo {
            private IBinder zznF;

            com.google.android.gms.maps.internal.zzo.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.zzo
            public void zzb(zzi zzi0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    parcel0.writeStrongBinder((zzi0 == null ? null : zzi0.asBinder()));
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.zzo
            public void zzc(zzi zzi0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    parcel0.writeStrongBinder((zzi0 == null ? null : zzi0.asBinder()));
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.zzo
            public void zzd(zzi zzi0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    parcel0.writeStrongBinder((zzi0 == null ? null : zzi0.asBinder()));
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.maps.internal.IOnMarkerDragListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    this.zzb(com.google.android.gms.maps.model.internal.zzi.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    this.zzd(com.google.android.gms.maps.model.internal.zzi.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    this.zzc(com.google.android.gms.maps.model.internal.zzi.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzo zzcw(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            return iInterface0 != null && iInterface0 instanceof zzo ? ((zzo)iInterface0) : new com.google.android.gms.maps.internal.zzo.zza.zza(iBinder0);
        }
    }

    void zzb(zzi arg1) throws RemoteException;

    void zzc(zzi arg1) throws RemoteException;

    void zzd(zzi arg1) throws RemoteException;
}

