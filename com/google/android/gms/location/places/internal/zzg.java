package com.google.android.gms.location.places.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.PlacePhotoResult;

public interface zzg extends IInterface {
    public static abstract class zza extends Binder implements zzg {
        static class com.google.android.gms.location.places.internal.zzg.zza.zza implements zzg {
            private IBinder zznF;

            com.google.android.gms.location.places.internal.zzg.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.location.places.internal.zzg
            public void zza(PlacePhotoMetadataResult placePhotoMetadataResult0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if(placePhotoMetadataResult0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placePhotoMetadataResult0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzg
            public void zza(PlacePhotoResult placePhotoResult0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if(placePhotoResult0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placePhotoResult0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            PlacePhotoResult placePhotoResult0 = null;
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if(data.readInt() != 0) {
                        placePhotoResult0 = (PlacePhotoResult)PlacePhotoResult.CREATOR.createFromParcel(data);
                    }
                    this.zza(placePhotoResult0);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    if(data.readInt() != 0) {
                        placePhotoResult0 = (PlacePhotoMetadataResult)PlacePhotoMetadataResult.CREATOR.createFromParcel(data);
                    }
                    this.zza(((PlacePhotoMetadataResult)placePhotoResult0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.location.places.internal.IPhotosCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzg zzcb(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzg ? ((zzg)iInterface0) : new com.google.android.gms.location.places.internal.zzg.zza.zza(iBinder0);
        }
    }

    void zza(PlacePhotoMetadataResult arg1) throws RemoteException;

    void zza(PlacePhotoResult arg1) throws RemoteException;
}

