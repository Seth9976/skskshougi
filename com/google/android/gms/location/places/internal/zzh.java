package com.google.android.gms.location.places.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public interface zzh extends IInterface {
    public static abstract class zza extends Binder implements zzh {
        static class com.google.android.gms.location.places.internal.zzh.zza.zza implements zzh {
            private IBinder zznF;

            com.google.android.gms.location.places.internal.zzh.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.location.places.internal.zzh
            public void zzY(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzh
            public void zzZ(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzh
            public void zzaF(Status status0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzh
            public void zzaa(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.places.internal.zzh
            public void zzab(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.location.places.internal.IPlacesCallbacks");
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
                    data.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzY(dataHolder0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzZ(dataHolder0);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzaa(dataHolder0);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = (Status)Status.CREATOR.createFromParcel(data);
                    }
                    this.zzaF(((Status)dataHolder0));
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzab(dataHolder0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.location.places.internal.IPlacesCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzh zzcc(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzh ? ((zzh)iInterface0) : new com.google.android.gms.location.places.internal.zzh.zza.zza(iBinder0);
        }
    }

    void zzY(DataHolder arg1) throws RemoteException;

    void zzZ(DataHolder arg1) throws RemoteException;

    void zzaF(Status arg1) throws RemoteException;

    void zzaa(DataHolder arg1) throws RemoteException;

    void zzab(DataHolder arg1) throws RemoteException;
}

