package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzi extends IInterface {
    public static abstract class zza extends Binder implements zzi {
        static class com.google.android.gms.ads.internal.request.zzi.zza.zza implements zzi {
            private IBinder zznF;

            com.google.android.gms.ads.internal.request.zzi.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.ads.internal.request.zzi
            public void zza(AdRequestInfoParcel adRequestInfoParcel0, zzj zzj0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if(adRequestInfoParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adRequestInfoParcel0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzj0 == null ? null : zzj0.asBinder()));
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.request.zzi
            public AdResponseParcel zze(AdRequestInfoParcel adRequestInfoParcel0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if(adRequestInfoParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adRequestInfoParcel0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : AdResponseParcel.CREATOR.zzk(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            AdRequestInfoParcel adRequestInfoParcel0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if(data.readInt() != 0) {
                        adRequestInfoParcel0 = AdRequestInfoParcel.CREATOR.zzj(data);
                    }
                    AdResponseParcel adResponseParcel0 = this.zze(adRequestInfoParcel0);
                    reply.writeNoException();
                    if(adResponseParcel0 != null) {
                        reply.writeInt(1);
                        adResponseParcel0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if(data.readInt() != 0) {
                        adRequestInfoParcel0 = AdRequestInfoParcel.CREATOR.zzj(data);
                    }
                    this.zza(adRequestInfoParcel0, com.google.android.gms.ads.internal.request.zzj.zza.zzV(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzi zzU(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            return iInterface0 != null && iInterface0 instanceof zzi ? ((zzi)iInterface0) : new com.google.android.gms.ads.internal.request.zzi.zza.zza(iBinder0);
        }
    }

    void zza(AdRequestInfoParcel arg1, zzj arg2) throws RemoteException;

    AdResponseParcel zze(AdRequestInfoParcel arg1) throws RemoteException;
}

