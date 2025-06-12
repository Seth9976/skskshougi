package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzd;
import java.util.List;

public interface zzg extends IInterface {
    public static abstract class zza extends Binder implements zzg {
        static class com.google.android.gms.location.internal.zzg.zza.zza implements zzg {
            private IBinder zznF;

            com.google.android.gms.location.internal.zzg.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public Status zza(GestureRequest gestureRequest0, PendingIntent pendingIntent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(gestureRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        gestureRequest0.writeToParcel(parcel0, 0);
                    }
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(60, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(long v, boolean z, PendingIntent pendingIntent0) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    parcel0.writeLong(v);
                    if(!z) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(PendingIntent pendingIntent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(PendingIntent pendingIntent0, zzf zzf0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzf0 == null ? null : zzf0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(Location location0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(location0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        location0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(26, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(GeofencingRequest geofencingRequest0, PendingIntent pendingIntent0, zzf zzf0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(geofencingRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        geofencingRequest0.writeToParcel(parcel0, 0);
                    }
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzf0 == null ? null : zzf0.asBinder()));
                    this.zznF.transact(57, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(LocationRequest locationRequest0, PendingIntent pendingIntent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(locationRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        locationRequest0.writeToParcel(parcel0, 0);
                    }
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(LocationRequest locationRequest0, zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(locationRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        locationRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(LocationRequest locationRequest0, zzd zzd0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(locationRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        locationRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(20, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(LocationSettingsRequest locationSettingsRequest0, zzh zzh0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(locationSettingsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        locationSettingsRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzh0 == null ? null : zzh0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(0x3F, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(LocationRequestInternal locationRequestInternal0, PendingIntent pendingIntent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(locationRequestInternal0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        locationRequestInternal0.writeToParcel(parcel0, 0);
                    }
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(53, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(LocationRequestInternal locationRequestInternal0, zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(locationRequestInternal0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        locationRequestInternal0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(52, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(LocationRequestUpdateData locationRequestUpdateData0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(locationRequestUpdateData0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        locationRequestUpdateData0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(59, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(zzf zzf0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    parcel0.writeStrongBinder((zzf0 == null ? null : zzf0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(List list0, PendingIntent pendingIntent0, zzf zzf0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    parcel0.writeTypedList(list0);
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzf0 == null ? null : zzf0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zza(String[] arr_s, zzf zzf0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    parcel0.writeStringArray(arr_s);
                    parcel0.writeStrongBinder((zzf0 == null ? null : zzf0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zzac(boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public Status zzb(PendingIntent pendingIntent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(61, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zzb(Location location0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(location0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        location0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public void zzc(PendingIntent pendingIntent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public ActivityRecognitionResult zzdk(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    parcel0.writeString(s);
                    this.zznF.transact(0x40, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ActivityRecognitionResult.CREATOR.createFromParcel(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public Location zzdl(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    parcel0.writeString(s);
                    this.zznF.transact(21, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Location)Location.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public LocationAvailability zzdm(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    parcel0.writeString(s);
                    this.zznF.transact(34, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : LocationAvailability.CREATOR.createFromParcel(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public Location zzuu() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Location)Location.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzg
            public IBinder zzuv() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zznF.transact(51, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readStrongBinder();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            boolean z = false;
            LocationRequest locationRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zza(data.createTypedArrayList(ParcelableGeofence.CREATOR), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))), com.google.android.gms.location.internal.zzf.zza.zzbV(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zza((data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))), com.google.android.gms.location.internal.zzf.zza.zzbV(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zza(data.createStringArray(), com.google.android.gms.location.internal.zzf.zza.zzbV(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zza(com.google.android.gms.location.internal.zzf.zza.zzbV(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    long v2 = data.readLong();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(v2, z, (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zza((data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    Location location0 = this.zzuu();
                    reply.writeNoException();
                    if(location0 != null) {
                        reply.writeInt(1);
                        location0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(data.readInt() != 0) {
                        locationRequest0 = LocationRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(locationRequest0, com.google.android.gms.location.zzd.zza.zzbT(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zza((data.readInt() == 0 ? null : LocationRequest.CREATOR.createFromParcel(data)), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zza(com.google.android.gms.location.zzd.zza.zzbT(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zzc((data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzac(z);
                    reply.writeNoException();
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zzb((data.readInt() == 0 ? null : ((Location)Location.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 20: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(data.readInt() != 0) {
                        locationRequest0 = LocationRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(locationRequest0, com.google.android.gms.location.zzd.zza.zzbT(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 21: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    Location location1 = this.zzdl(data.readString());
                    reply.writeNoException();
                    if(location1 != null) {
                        reply.writeInt(1);
                        location1.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 26: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zza((data.readInt() == 0 ? null : ((Location)Location.CREATOR.createFromParcel(data))), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 34: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    LocationAvailability locationAvailability0 = this.zzdm(data.readString());
                    reply.writeNoException();
                    if(locationAvailability0 != null) {
                        reply.writeInt(1);
                        locationAvailability0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 51: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    IBinder iBinder0 = this.zzuv();
                    reply.writeNoException();
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 52: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(data.readInt() != 0) {
                        locationRequest0 = LocationRequestInternal.CREATOR.zzek(data);
                    }
                    this.zza(((LocationRequestInternal)locationRequest0), com.google.android.gms.location.zzd.zza.zzbT(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 53: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zza((data.readInt() == 0 ? null : LocationRequestInternal.CREATOR.zzek(data)), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 57: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zza((data.readInt() == 0 ? null : ((GeofencingRequest)GeofencingRequest.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))), com.google.android.gms.location.internal.zzf.zza.zzbV(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 59: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if(data.readInt() != 0) {
                        locationRequest0 = LocationRequestUpdateData.CREATOR.zzel(data);
                    }
                    this.zza(((LocationRequestUpdateData)locationRequest0));
                    reply.writeNoException();
                    return true;
                }
                case 60: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    Status status0 = this.zza((data.readInt() == 0 ? null : GestureRequest.CREATOR.zzed(data)), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(status0 != null) {
                        reply.writeInt(1);
                        status0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 61: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    Status status1 = this.zzb((data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(status1 != null) {
                        reply.writeInt(1);
                        status1.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 0x3F: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.zza((data.readInt() == 0 ? null : ((LocationSettingsRequest)LocationSettingsRequest.CREATOR.createFromParcel(data))), com.google.android.gms.location.internal.zzh.zza.zzbX(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x40: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    ActivityRecognitionResult activityRecognitionResult0 = this.zzdk(data.readString());
                    reply.writeNoException();
                    if(activityRecognitionResult0 != null) {
                        reply.writeInt(1);
                        activityRecognitionResult0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzg zzbW(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            return iInterface0 != null && iInterface0 instanceof zzg ? ((zzg)iInterface0) : new com.google.android.gms.location.internal.zzg.zza.zza(iBinder0);
        }
    }

    Status zza(GestureRequest arg1, PendingIntent arg2) throws RemoteException;

    void zza(long arg1, boolean arg2, PendingIntent arg3) throws RemoteException;

    void zza(PendingIntent arg1) throws RemoteException;

    void zza(PendingIntent arg1, zzf arg2, String arg3) throws RemoteException;

    void zza(Location arg1, int arg2) throws RemoteException;

    void zza(GeofencingRequest arg1, PendingIntent arg2, zzf arg3) throws RemoteException;

    void zza(LocationRequest arg1, PendingIntent arg2) throws RemoteException;

    void zza(LocationRequest arg1, zzd arg2) throws RemoteException;

    void zza(LocationRequest arg1, zzd arg2, String arg3) throws RemoteException;

    void zza(LocationSettingsRequest arg1, zzh arg2, String arg3) throws RemoteException;

    void zza(LocationRequestInternal arg1, PendingIntent arg2) throws RemoteException;

    void zza(LocationRequestInternal arg1, zzd arg2) throws RemoteException;

    void zza(LocationRequestUpdateData arg1) throws RemoteException;

    void zza(zzf arg1, String arg2) throws RemoteException;

    void zza(zzd arg1) throws RemoteException;

    void zza(List arg1, PendingIntent arg2, zzf arg3, String arg4) throws RemoteException;

    void zza(String[] arg1, zzf arg2, String arg3) throws RemoteException;

    void zzac(boolean arg1) throws RemoteException;

    Status zzb(PendingIntent arg1) throws RemoteException;

    void zzb(Location arg1) throws RemoteException;

    void zzc(PendingIntent arg1) throws RemoteException;

    ActivityRecognitionResult zzdk(String arg1) throws RemoteException;

    Location zzdl(String arg1) throws RemoteException;

    LocationAvailability zzdm(String arg1) throws RemoteException;

    Location zzuu() throws RemoteException;

    IBinder zzuv() throws RemoteException;
}

