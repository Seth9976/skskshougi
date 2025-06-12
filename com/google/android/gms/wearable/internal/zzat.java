package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;

public interface zzat extends IInterface {
    public static abstract class zza extends Binder implements zzat {
        static class com.google.android.gms.wearable.internal.zzat.zza.zza implements zzat {
            private IBinder zznF;

            com.google.android.gms.wearable.internal.zzat.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(22, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeInt(v);
                    this.zznF.transact(43, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, Uri uri0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, Uri uri0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(40, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, Asset asset0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(asset0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        asset0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, ConnectionConfiguration connectionConfiguration0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(connectionConfiguration0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        connectionConfiguration0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(20, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, PutDataRequest putDataRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(putDataRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        putDataRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, AddListenerRequest addListenerRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(addListenerRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        addListenerRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(16, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, AncsNotificationParcelable ancsNotificationParcelable0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(ancsNotificationParcelable0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        ancsNotificationParcelable0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(27, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, RemoveListenerRequest removeListenerRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(removeListenerRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        removeListenerRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(17, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, zzaq zzaq0, String s) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(zzaq0 != null) {
                        iBinder0 = zzaq0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    parcel0.writeString(s);
                    this.zznF.transact(34, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(21, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, String s, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    this.zznF.transact(42, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, String s, ParcelFileDescriptor parcelFileDescriptor0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeString(s);
                    if(parcelFileDescriptor0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        parcelFileDescriptor0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(38, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, String s, ParcelFileDescriptor parcelFileDescriptor0, long v, long v1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeString(s);
                    if(parcelFileDescriptor0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        parcelFileDescriptor0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeLong(v);
                    parcel0.writeLong(v1);
                    this.zznF.transact(39, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(0x1F, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, String s, String s1, byte[] arr_b) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeByteArray(arr_b);
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zza(zzar zzar0, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(0x30, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzb(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzb(zzar zzar0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeInt(v);
                    this.zznF.transact(28, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzb(zzar zzar0, Uri uri0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzb(zzar zzar0, Uri uri0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(41, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzb(zzar zzar0, ConnectionConfiguration connectionConfiguration0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(connectionConfiguration0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        connectionConfiguration0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzb(zzar zzar0, zzaq zzaq0, String s) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(zzaq0 != null) {
                        iBinder0 = zzaq0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    parcel0.writeString(s);
                    this.zznF.transact(35, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzb(zzar zzar0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(23, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzb(zzar zzar0, String s, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    this.zznF.transact(33, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzb(zzar zzar0, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(50, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzc(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzc(zzar zzar0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeInt(v);
                    this.zznF.transact(29, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzc(zzar zzar0, Uri uri0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzc(zzar zzar0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(24, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzd(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(15, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzd(zzar zzar0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(46, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zze(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(18, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zze(zzar zzar0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(0x2F, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzf(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(19, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzf(zzar zzar0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(0x20, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzg(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(25, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzh(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(26, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzi(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(30, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzj(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(37, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzk(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(49, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzl(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(51, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzm(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzn(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzat
            public void zzo(zzar zzar0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    parcel0.writeStrongBinder((zzar0 == null ? null : zzar0.asBinder()));
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
            boolean z = false;
            ConnectionConfiguration connectionConfiguration0 = null;
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar0 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(data);
                    }
                    this.zzb(zzar0, connectionConfiguration0);
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzm(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzn(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzo(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar1 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(zzar1, ((PutDataRequest)connectionConfiguration0));
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar2 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (Uri)Uri.CREATOR.createFromParcel(data);
                    }
                    this.zza(zzar2, ((Uri)connectionConfiguration0));
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzb(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar3 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (Uri)Uri.CREATOR.createFromParcel(data);
                    }
                    this.zzb(zzar3, ((Uri)connectionConfiguration0));
                    reply.writeNoException();
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar4 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (Uri)Uri.CREATOR.createFromParcel(data);
                    }
                    this.zzc(zzar4, ((Uri)connectionConfiguration0));
                    reply.writeNoException();
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readString(), data.readString(), data.createByteArray());
                    reply.writeNoException();
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar5 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (Asset)Asset.CREATOR.createFromParcel(data);
                    }
                    this.zza(zzar5, ((Asset)connectionConfiguration0));
                    reply.writeNoException();
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzc(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzd(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar6 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (AddListenerRequest)AddListenerRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(zzar6, ((AddListenerRequest)connectionConfiguration0));
                    reply.writeNoException();
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar7 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (RemoveListenerRequest)RemoveListenerRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(zzar7, ((RemoveListenerRequest)connectionConfiguration0));
                    reply.writeNoException();
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zze(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzf(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 20: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar8 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(data);
                    }
                    this.zza(zzar8, connectionConfiguration0);
                    reply.writeNoException();
                    return true;
                }
                case 21: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 22: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 23: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzb(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 24: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzc(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 25: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzg(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 26: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzh(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 27: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar9 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(data);
                    }
                    this.zza(zzar9, ((AncsNotificationParcelable)connectionConfiguration0));
                    reply.writeNoException();
                    return true;
                }
                case 28: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzb(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 29: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzc(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 30: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzi(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x1F: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x20: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzf(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 33: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzb(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readString(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 34: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), com.google.android.gms.wearable.internal.zzaq.zza.zzdN(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 35: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzb(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), com.google.android.gms.wearable.internal.zzaq.zza.zzdN(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 37: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzj(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 38: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar10 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    String s = data.readString();
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(data);
                    }
                    this.zza(zzar10, s, ((ParcelFileDescriptor)connectionConfiguration0));
                    reply.writeNoException();
                    return true;
                }
                case 39: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readString(), (data.readInt() == 0 ? null : ((ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(data))), data.readLong(), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 40: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar11 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (Uri)Uri.CREATOR.createFromParcel(data);
                    }
                    this.zza(zzar11, ((Uri)connectionConfiguration0), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 41: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar12 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        connectionConfiguration0 = (Uri)Uri.CREATOR.createFromParcel(data);
                    }
                    this.zzb(zzar12, ((Uri)connectionConfiguration0), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 42: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readString(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 43: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 46: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzd(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x2F: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zze(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x30: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zza(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()), data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 49: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzk(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 50: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzar zzar13 = com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzb(zzar13, z);
                    reply.writeNoException();
                    return true;
                }
                case 51: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
                    this.zzl(com.google.android.gms.wearable.internal.zzar.zza.zzdO(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.wearable.internal.IWearableService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzat zzdQ(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            return iInterface0 != null && iInterface0 instanceof zzat ? ((zzat)iInterface0) : new com.google.android.gms.wearable.internal.zzat.zza.zza(iBinder0);
        }
    }

    void zza(zzar arg1) throws RemoteException;

    void zza(zzar arg1, int arg2) throws RemoteException;

    void zza(zzar arg1, Uri arg2) throws RemoteException;

    void zza(zzar arg1, Uri arg2, int arg3) throws RemoteException;

    void zza(zzar arg1, Asset arg2) throws RemoteException;

    void zza(zzar arg1, ConnectionConfiguration arg2) throws RemoteException;

    void zza(zzar arg1, PutDataRequest arg2) throws RemoteException;

    void zza(zzar arg1, AddListenerRequest arg2) throws RemoteException;

    void zza(zzar arg1, AncsNotificationParcelable arg2) throws RemoteException;

    void zza(zzar arg1, RemoveListenerRequest arg2) throws RemoteException;

    void zza(zzar arg1, zzaq arg2, String arg3) throws RemoteException;

    void zza(zzar arg1, String arg2) throws RemoteException;

    void zza(zzar arg1, String arg2, int arg3) throws RemoteException;

    void zza(zzar arg1, String arg2, ParcelFileDescriptor arg3) throws RemoteException;

    void zza(zzar arg1, String arg2, ParcelFileDescriptor arg3, long arg4, long arg5) throws RemoteException;

    void zza(zzar arg1, String arg2, String arg3) throws RemoteException;

    void zza(zzar arg1, String arg2, String arg3, byte[] arg4) throws RemoteException;

    void zza(zzar arg1, boolean arg2) throws RemoteException;

    void zzb(zzar arg1) throws RemoteException;

    void zzb(zzar arg1, int arg2) throws RemoteException;

    void zzb(zzar arg1, Uri arg2) throws RemoteException;

    void zzb(zzar arg1, Uri arg2, int arg3) throws RemoteException;

    void zzb(zzar arg1, ConnectionConfiguration arg2) throws RemoteException;

    void zzb(zzar arg1, zzaq arg2, String arg3) throws RemoteException;

    void zzb(zzar arg1, String arg2) throws RemoteException;

    void zzb(zzar arg1, String arg2, int arg3) throws RemoteException;

    void zzb(zzar arg1, boolean arg2) throws RemoteException;

    void zzc(zzar arg1) throws RemoteException;

    void zzc(zzar arg1, int arg2) throws RemoteException;

    void zzc(zzar arg1, Uri arg2) throws RemoteException;

    void zzc(zzar arg1, String arg2) throws RemoteException;

    void zzd(zzar arg1) throws RemoteException;

    void zzd(zzar arg1, String arg2) throws RemoteException;

    void zze(zzar arg1) throws RemoteException;

    void zze(zzar arg1, String arg2) throws RemoteException;

    void zzf(zzar arg1) throws RemoteException;

    void zzf(zzar arg1, String arg2) throws RemoteException;

    void zzg(zzar arg1) throws RemoteException;

    void zzh(zzar arg1) throws RemoteException;

    void zzi(zzar arg1) throws RemoteException;

    void zzj(zzar arg1) throws RemoteException;

    void zzk(zzar arg1) throws RemoteException;

    void zzl(zzar arg1) throws RemoteException;

    void zzm(zzar arg1) throws RemoteException;

    void zzn(zzar arg1) throws RemoteException;

    void zzo(zzar arg1) throws RemoteException;
}

