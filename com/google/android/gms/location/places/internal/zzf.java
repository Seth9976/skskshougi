package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.personalized.PlaceAlias;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;

public interface zzf extends IInterface {
    public static abstract class zza extends Binder implements zzf {
        static class com.google.android.gms.location.places.internal.zzf.zza.zza implements zzf {
            private IBinder zznF;

            com.google.android.gms.location.places.internal.zzf.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(AddPlaceRequest addPlaceRequest0, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if(addPlaceRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        addPlaceRequest0.writeToParcel(parcel0, 0);
                    }
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(zzh0 != null) {
                        iBinder0 = zzh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(14, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(NearbyAlertRequest nearbyAlertRequest0, PlacesParams placesParams0, PendingIntent pendingIntent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.zznF.transact(11, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(PlaceReport placeReport0, PlacesParams placesParams0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.zznF.transact(15, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(PlaceRequest placeRequest0, PlacesParams placesParams0, PendingIntent pendingIntent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.zznF.transact(9, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(UserDataType userDataType0, LatLngBounds latLngBounds0, List list0, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if(userDataType0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        userDataType0.writeToParcel(parcel0, 0);
                    }
                    if(latLngBounds0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        latLngBounds0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStringList(list0);
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(zzh0 != null) {
                        iBinder0 = zzh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(8, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(PlacesParams placesParams0, PendingIntent pendingIntent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.zznF.transact(10, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(PlaceAlias placeAlias0, String s, String s1, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if(placeAlias0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placeAlias0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(zzh0 != null) {
                        iBinder0 = zzh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(16, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(LatLng latLng0, PlaceFilter placeFilter0, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if(latLng0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        latLng0.writeToParcel(parcel0, 0);
                    }
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
                    if(zzh0 != null) {
                        iBinder0 = zzh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(LatLngBounds latLngBounds0, int v, String s, PlaceFilter placeFilter0, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if(latLngBounds0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        latLngBounds0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(v);
                    parcel0.writeString(s);
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
                    if(zzh0 != null) {
                        iBinder0 = zzh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(String s, int v, int v1, int v2, PlacesParams placesParams0, zzg zzg0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeInt(v2);
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(zzg0 != null) {
                        iBinder0 = zzg0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(20, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(String s, int v, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(zzh0 != null) {
                        iBinder0 = zzh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(18, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(String s, PlacesParams placesParams0, zzg zzg0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    parcel0.writeString(s);
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(zzg0 != null) {
                        iBinder0 = zzg0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(19, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(String s, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    parcel0.writeString(s);
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(zzh0 != null) {
                        iBinder0 = zzh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(String s, LatLngBounds latLngBounds0, AutocompleteFilter autocompleteFilter0, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    parcel0.writeString(s);
                    if(latLngBounds0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        latLngBounds0.writeToParcel(parcel0, 0);
                    }
                    if(autocompleteFilter0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        autocompleteFilter0.writeToParcel(parcel0, 0);
                    }
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(zzh0 != null) {
                        iBinder0 = zzh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(13, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zza(List list0, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    parcel0.writeStringList(list0);
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(zzh0 != null) {
                        iBinder0 = zzh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(7, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zzb(PlaceFilter placeFilter0, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    if(zzh0 != null) {
                        iBinder0 = zzh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zzb(PlacesParams placesParams0, PendingIntent pendingIntent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.zznF.transact(12, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zzb(String s, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    parcel0.writeString(s);
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(zzh0 != null) {
                        iBinder0 = zzh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(6, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzf
            public void zzb(List list0, PlacesParams placesParams0, zzh zzh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    parcel0.writeStringList(list0);
                    if(placesParams0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        placesParams0.writeToParcel(parcel0, 0);
                    }
                    if(zzh0 != null) {
                        iBinder0 = zzh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(17, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            PlacesParams placesParams0 = null;
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    LatLngBounds latLngBounds0 = data.readInt() == 0 ? null : LatLngBounds.CREATOR.zzeO(data);
                    int v2 = data.readInt();
                    String s = data.readString();
                    PlaceFilter placeFilter0 = data.readInt() == 0 ? null : PlaceFilter.CREATOR.zzer(data);
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zza(latLngBounds0, v2, s, placeFilter0, placesParams0, com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    String s1 = data.readString();
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zza(s1, placesParams0, com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    LatLng latLng0 = data.readInt() == 0 ? null : LatLng.CREATOR.zzeP(data);
                    PlaceFilter placeFilter1 = data.readInt() == 0 ? null : PlaceFilter.CREATOR.zzer(data);
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zza(latLng0, placeFilter1, placesParams0, com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    PlaceFilter placeFilter2 = data.readInt() == 0 ? null : PlaceFilter.CREATOR.zzer(data);
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zzb(placeFilter2, placesParams0, com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    String s2 = data.readString();
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zzb(s2, placesParams0, com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    ArrayList arrayList0 = data.createStringArrayList();
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zza(arrayList0, placesParams0, com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    this.zza((data.readInt() == 0 ? null : UserDataType.CREATOR.zzew(data)), (data.readInt() == 0 ? null : LatLngBounds.CREATOR.zzeO(data)), data.createStringArrayList(), (data.readInt() == 0 ? null : PlacesParams.CREATOR.zzeB(data)), com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    this.zza((data.readInt() == 0 ? null : ((PlaceRequest)PlaceRequest.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : PlacesParams.CREATOR.zzeB(data)), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    this.zza((data.readInt() == 0 ? null : PlacesParams.CREATOR.zzeB(data)), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    this.zza((data.readInt() == 0 ? null : NearbyAlertRequest.CREATOR.zzeq(data)), (data.readInt() == 0 ? null : PlacesParams.CREATOR.zzeB(data)), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    this.zzb((data.readInt() == 0 ? null : PlacesParams.CREATOR.zzeB(data)), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    this.zza(data.readString(), (data.readInt() == 0 ? null : LatLngBounds.CREATOR.zzeO(data)), (data.readInt() == 0 ? null : AutocompleteFilter.CREATOR.zzeo(data)), (data.readInt() == 0 ? null : PlacesParams.CREATOR.zzeB(data)), com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    AddPlaceRequest addPlaceRequest0 = data.readInt() == 0 ? null : ((AddPlaceRequest)AddPlaceRequest.CREATOR.createFromParcel(data));
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zza(addPlaceRequest0, placesParams0, com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    PlaceReport placeReport0 = data.readInt() == 0 ? null : ((PlaceReport)PlaceReport.CREATOR.createFromParcel(data));
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zza(placeReport0, placesParams0);
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    this.zza((data.readInt() == 0 ? null : PlaceAlias.CREATOR.zzeF(data)), data.readString(), data.readString(), (data.readInt() == 0 ? null : PlacesParams.CREATOR.zzeB(data)), com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    ArrayList arrayList1 = data.createStringArrayList();
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zzb(arrayList1, placesParams0, com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    String s3 = data.readString();
                    int v3 = data.readInt();
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zza(s3, v3, placesParams0, com.google.android.gms.location.places.internal.zzh.zza.zzcc(data.readStrongBinder()));
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    String s4 = data.readString();
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zza(s4, placesParams0, com.google.android.gms.location.places.internal.zzg.zza.zzcb(data.readStrongBinder()));
                    return true;
                }
                case 20: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    String s5 = data.readString();
                    int v4 = data.readInt();
                    int v5 = data.readInt();
                    int v6 = data.readInt();
                    if(data.readInt() != 0) {
                        placesParams0 = PlacesParams.CREATOR.zzeB(data);
                    }
                    this.zza(s5, v4, v5, v6, placesParams0, com.google.android.gms.location.places.internal.zzg.zza.zzcb(data.readStrongBinder()));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzf zzca(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
            return iInterface0 != null && iInterface0 instanceof zzf ? ((zzf)iInterface0) : new com.google.android.gms.location.places.internal.zzf.zza.zza(iBinder0);
        }
    }

    void zza(AddPlaceRequest arg1, PlacesParams arg2, zzh arg3) throws RemoteException;

    void zza(NearbyAlertRequest arg1, PlacesParams arg2, PendingIntent arg3) throws RemoteException;

    void zza(PlaceReport arg1, PlacesParams arg2) throws RemoteException;

    void zza(PlaceRequest arg1, PlacesParams arg2, PendingIntent arg3) throws RemoteException;

    void zza(UserDataType arg1, LatLngBounds arg2, List arg3, PlacesParams arg4, zzh arg5) throws RemoteException;

    void zza(PlacesParams arg1, PendingIntent arg2) throws RemoteException;

    void zza(PlaceAlias arg1, String arg2, String arg3, PlacesParams arg4, zzh arg5) throws RemoteException;

    void zza(LatLng arg1, PlaceFilter arg2, PlacesParams arg3, zzh arg4) throws RemoteException;

    void zza(LatLngBounds arg1, int arg2, String arg3, PlaceFilter arg4, PlacesParams arg5, zzh arg6) throws RemoteException;

    void zza(String arg1, int arg2, int arg3, int arg4, PlacesParams arg5, zzg arg6) throws RemoteException;

    void zza(String arg1, int arg2, PlacesParams arg3, zzh arg4) throws RemoteException;

    void zza(String arg1, PlacesParams arg2, zzg arg3) throws RemoteException;

    void zza(String arg1, PlacesParams arg2, zzh arg3) throws RemoteException;

    void zza(String arg1, LatLngBounds arg2, AutocompleteFilter arg3, PlacesParams arg4, zzh arg5) throws RemoteException;

    void zza(List arg1, PlacesParams arg2, zzh arg3) throws RemoteException;

    void zzb(PlaceFilter arg1, PlacesParams arg2, zzh arg3) throws RemoteException;

    void zzb(PlacesParams arg1, PendingIntent arg2) throws RemoteException;

    void zzb(String arg1, PlacesParams arg2, zzh arg3) throws RemoteException;

    void zzb(List arg1, PlacesParams arg2, zzh arg3) throws RemoteException;
}

