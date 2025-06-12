package com.google.android.gms.plus.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

public interface zzb extends IInterface {
    public static abstract class zza extends Binder implements zzb {
        static class com.google.android.gms.plus.internal.zzb.zza.zza implements zzb {
            private IBinder zznF;

            com.google.android.gms.plus.internal.zzb.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.plus.internal.zzb
            public void zza(int v, Bundle bundle0, Bundle bundle1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(bundle1 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle1.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzb
            public void zza(int v, Bundle bundle0, ParcelFileDescriptor parcelFileDescriptor0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(parcelFileDescriptor0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        parcelFileDescriptor0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzb
            public void zza(int v, Bundle bundle0, SafeParcelResponse safeParcelResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(safeParcelResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        safeParcelResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzb
            public void zza(int v, PersonEntity personEntity0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    parcel0.writeInt(v);
                    if(personEntity0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        personEntity0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzb
            public void zza(DataHolder dataHolder0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzb
            public void zza(DataHolder dataHolder0, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzb
            public void zzaO(Status status0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzb
            public void zzdV(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    parcel0.writeString(s);
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzb
            public void zzdW(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    parcel0.writeString(s);
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzb
            public void zzi(int v, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusCallbacks");
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.plus.internal.IPlusCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            DataHolder dataHolder0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                    this.zza(data.readInt(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                    this.zza(data.readInt(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                    this.zzdV(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zza(dataHolder0, data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                    int v2 = data.readInt();
                    Bundle bundle0 = data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data));
                    if(data.readInt() != 0) {
                        dataHolder0 = SafeParcelResponse.CREATOR.zzal(data);
                    }
                    this.zza(v2, bundle0, ((SafeParcelResponse)dataHolder0));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zza(dataHolder0, data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                    this.zzi(data.readInt(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                    this.zzdW(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                    int v3 = data.readInt();
                    if(data.readInt() != 0) {
                        dataHolder0 = PersonEntity.CREATOR.zzfM(data);
                    }
                    this.zza(v3, ((PersonEntity)dataHolder0));
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                    this.zzaO((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.plus.internal.IPlusCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzb zzdr(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzb ? ((zzb)iInterface0) : new com.google.android.gms.plus.internal.zzb.zza.zza(iBinder0);
        }
    }

    void zza(int arg1, Bundle arg2, Bundle arg3) throws RemoteException;

    void zza(int arg1, Bundle arg2, ParcelFileDescriptor arg3) throws RemoteException;

    void zza(int arg1, Bundle arg2, SafeParcelResponse arg3) throws RemoteException;

    void zza(int arg1, PersonEntity arg2) throws RemoteException;

    void zza(DataHolder arg1, String arg2) throws RemoteException;

    void zza(DataHolder arg1, String arg2, String arg3) throws RemoteException;

    void zzaO(Status arg1) throws RemoteException;

    void zzdV(String arg1) throws RemoteException;

    void zzdW(String arg1) throws RemoteException;

    void zzi(int arg1, Bundle arg2) throws RemoteException;
}

