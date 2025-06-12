package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public interface zzr extends IInterface {
    public static abstract class zza extends Binder implements zzr {
        static class com.google.android.gms.maps.internal.zzr.zza.zza implements zzr {
            private IBinder zznF;

            com.google.android.gms.maps.internal.zzr.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.zzr
            public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera camera) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                    if(camera == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        camera.writeToParcel(parcel0, 0);
                    }
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
            this.attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                    this.onStreetViewPanoramaCameraChange((data.readInt() == 0 ? null : StreetViewPanoramaCamera.CREATOR.zzeT(data)));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzr zzcz(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
            return iInterface0 != null && iInterface0 instanceof zzr ? ((zzr)iInterface0) : new com.google.android.gms.maps.internal.zzr.zza.zza(iBinder0);
        }
    }

    void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera arg1) throws RemoteException;
}

