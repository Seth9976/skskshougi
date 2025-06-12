package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;

public interface zze extends IInterface {
    public static abstract class zza extends Binder implements zze {
        static class com.google.android.gms.location.places.internal.zze.zza.zza implements zze {
            private IBinder zznF;

            com.google.android.gms.location.places.internal.zze.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.location.places.internal.zze
            public void zza(NearbyAlertRequest nearbyAlertRequest0, PlacesParams placesParams0, PendingIntent pendingIntent0, zzh zzh0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if(nearbyAlertRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        nearbyAlertRequest0.writeToParcel(parcel0, 0);
                    }
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzh0 == null ? null : zzh0.asBinder()));
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zze
            public void zza(PlaceFilter placeFilter0, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if(placeFilter0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placeFilter0.writeToParcel(parcel0, 0);
                    }
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzh0 == null ? null : zzh0.asBinder()));
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zze
            public void zza(PlaceReport placeReport0, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if(placeReport0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placeReport0.writeToParcel(parcel0, 0);
                    }
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzh0 == null ? null : zzh0.asBinder()));
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zze
            public void zza(PlaceRequest placeRequest0, PlacesParams placesParams0, PendingIntent pendingIntent0, zzh zzh0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if(placeRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placeRequest0.writeToParcel(parcel0, 0);
                    }
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzh0 == null ? null : zzh0.asBinder()));
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zze
            public void zza(PlacesParams placesParams0, PendingIntent pendingIntent0, zzh zzh0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzh0 == null ? null : zzh0.asBinder()));
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zze
            public void zzb(PlacesParams placesParams0, PendingIntent pendingIntent0, zzh zzh0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzh0 == null ? null : zzh0.asBinder()));
                    this.zznF.transact(5, parcel0, parcel1, 0);
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
            PlacesParams placesParams0 = null;
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    this.zza((data.readInt() == 0 ? null : ((PlaceRequest)PlaceRequest.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : PlacesParams.CREATOR.zzeB(data)), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))), com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    this.zza((data.readInt() == 0 ? null : PlacesParams.CREATOR.zzeB(data)), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))), com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    this.zza((data.readInt() == 0 ? null : NearbyAlertRequest.CREATOR.zzeq(data)), (data.readInt() == 0 ? null : PlacesParams.CREATOR.zzeB(data)), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))), com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    this.zzb((data.readInt() == 0 ? null : PlacesParams.CREATOR.zzeB(data)), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))), com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    PlaceFilter placeFilter0 = data.readInt() == 0 ? null : PlaceFilter.CREATOR.zzer(data);
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zza(placeFilter0, placesParams0, com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    PlaceReport placeReport0 = data.readInt() == 0 ? null : ((PlaceReport)PlaceReport.CREATOR.createFromParcel(data));
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zza(placeReport0, placesParams0, com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zze zzbZ(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
            return iInterface0 != null && iInterface0 instanceof zze ? ((zze)iInterface0) : new com.google.android.gms.location.places.internal.zze.zza.zza(iBinder0);
        }
    }

    void zza(NearbyAlertRequest arg1, PlacesParams arg2, PendingIntent arg3, zzh arg4) throws RemoteException;

    void zza(PlaceFilter arg1, PlacesParams arg2, zzh arg3) throws RemoteException;

    void zza(PlaceReport arg1, PlacesParams arg2, zzh arg3) throws RemoteException;

    void zza(PlaceRequest arg1, PlacesParams arg2, PendingIntent arg3, zzh arg4) throws RemoteException;

    void zza(PlacesParams arg1, PendingIntent arg2, zzh arg3) throws RemoteException;

    void zzb(PlacesParams arg1, PendingIntent arg2, zzh arg3) throws RemoteException;
}

