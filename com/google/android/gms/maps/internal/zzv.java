package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzv extends IInterface {
    public static abstract class zza extends Binder implements zzv {
        static class com.google.android.gms.maps.internal.zzv.zza.zza implements zzv {
            private IBinder zznF;

            com.google.android.gms.maps.internal.zzv.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.zzv
            public void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    parcel0.writeStrongBinder((iStreetViewPanoramaDelegate0 == null ? null : iStreetViewPanoramaDelegate0.asBinder()));
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    this.zza(com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate.zza.zzcG(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzv zzcD(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            return iInterface0 != null && iInterface0 instanceof zzv ? ((zzv)iInterface0) : new com.google.android.gms.maps.internal.zzv.zza.zza(iBinder0);
        }
    }

    void zza(IStreetViewPanoramaDelegate arg1) throws RemoteException;
}

