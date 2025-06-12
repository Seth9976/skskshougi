package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzm extends IInterface {
    public static abstract class zza extends Binder implements zzm {
        static class com.google.android.gms.maps.internal.zzm.zza.zza implements zzm {
            private IBinder zznF;

            com.google.android.gms.maps.internal.zzm.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.zzm
            public void zza(IGoogleMapDelegate iGoogleMapDelegate0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    parcel0.writeStrongBinder((iGoogleMapDelegate0 == null ? null : iGoogleMapDelegate0.asBinder()));
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
            this.attachInterface(this, "com.google.android.gms.maps.internal.IOnMapReadyCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    this.zza(com.google.android.gms.maps.internal.IGoogleMapDelegate.zza.zzch(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzm zzcu(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
            return iInterface0 != null && iInterface0 instanceof zzm ? ((zzm)iInterface0) : new com.google.android.gms.maps.internal.zzm.zza.zza(iBinder0);
        }
    }

    void zza(IGoogleMapDelegate arg1) throws RemoteException;
}

