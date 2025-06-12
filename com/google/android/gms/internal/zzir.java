package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.common.api.Status;

public interface zzir extends IInterface {
    public static abstract class zza extends Binder implements zzir {
        static class com.google.android.gms.internal.zzir.zza.zza implements zzir {
            private IBinder zznF;

            com.google.android.gms.internal.zzir.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzir
            public void zza(Response getRecentContextCall$Response0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    if(getRecentContextCall$Response0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getRecentContextCall$Response0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzir
            public void zza(Status status0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzir
            public void zza(Status status0, ParcelFileDescriptor parcelFileDescriptor0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    if(parcelFileDescriptor0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        parcelFileDescriptor0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzir
            public void zza(Status status0, boolean z) throws RemoteException {
                int v = 1;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    if(!z) {
                        v = 0;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            Response getRecentContextCall$Response0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    this.zza((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    this.zza((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    this.zza((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))), data.readInt() != 0);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    if(data.readInt() != 0) {
                        getRecentContextCall$Response0 = Response.CREATOR.zzw(data);
                    }
                    this.zza(getRecentContextCall$Response0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzir zzae(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzir ? ((zzir)iInterface0) : new com.google.android.gms.internal.zzir.zza.zza(iBinder0);
        }
    }

    void zza(Response arg1) throws RemoteException;

    void zza(Status arg1) throws RemoteException;

    void zza(Status arg1, ParcelFileDescriptor arg2) throws RemoteException;

    void zza(Status arg1, boolean arg2) throws RemoteException;
}

