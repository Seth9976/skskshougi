package com.google.android.gms.nearby.sharing.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzd extends IInterface {
    public static abstract class zza extends Binder implements zzd {
        static class com.google.android.gms.nearby.sharing.internal.zzd.zza.zza implements zzd {
            private IBinder zznF;

            com.google.android.gms.nearby.sharing.internal.zzd.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.nearby.sharing.internal.zzd
            public void zza(ProvideContentRequest provideContentRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                    if(provideContentRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        provideContentRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.nearby.sharing.internal.zzd
            public void zza(ReceiveContentRequest receiveContentRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                    if(receiveContentRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        receiveContentRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.nearby.sharing.internal.zzd
            public void zza(StopProvidingContentRequest stopProvidingContentRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                    if(stopProvidingContentRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        stopProvidingContentRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.nearby.sharing.internal.zzd
            public void zza(TrustedDevicesRequest trustedDevicesRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                    if(trustedDevicesRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        trustedDevicesRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.nearby.sharing.internal.zzd
            public void zza(zzc zzc0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                    if(zzc0 != null) {
                        iBinder0 = zzc0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            ProvideContentRequest provideContentRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                    if(data.readInt() != 0) {
                        provideContentRequest0 = (ProvideContentRequest)ProvideContentRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(provideContentRequest0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                    if(data.readInt() != 0) {
                        provideContentRequest0 = (StopProvidingContentRequest)StopProvidingContentRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((StopProvidingContentRequest)provideContentRequest0));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                    if(data.readInt() != 0) {
                        provideContentRequest0 = (TrustedDevicesRequest)TrustedDevicesRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((TrustedDevicesRequest)provideContentRequest0));
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                    if(data.readInt() != 0) {
                        provideContentRequest0 = (ReceiveContentRequest)ReceiveContentRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((ReceiveContentRequest)provideContentRequest0));
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                    this.zza(com.google.android.gms.nearby.sharing.internal.zzc.zza.zzdj(data.readStrongBinder()));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzd zzdk(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            return iInterface0 != null && iInterface0 instanceof zzd ? ((zzd)iInterface0) : new com.google.android.gms.nearby.sharing.internal.zzd.zza.zza(iBinder0);
        }
    }

    void zza(ProvideContentRequest arg1) throws RemoteException;

    void zza(ReceiveContentRequest arg1) throws RemoteException;

    void zza(StopProvidingContentRequest arg1) throws RemoteException;

    void zza(TrustedDevicesRequest arg1) throws RemoteException;

    void zza(zzc arg1) throws RemoteException;
}

