package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzef;

public interface zzs extends IInterface {
    public static abstract class zza extends Binder implements zzs {
        static class com.google.android.gms.ads.internal.client.zzs.zza.zza implements zzs {
            private IBinder zznF;

            com.google.android.gms.ads.internal.client.zzs.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.ads.internal.client.zzs
            public IBinder zza(zzd zzd0, AdSizeParcel adSizeParcel0, String s, zzef zzef0, int v) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    if(adSizeParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adSizeParcel0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    if(zzef0 != null) {
                        iBinder0 = zzef0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    parcel0.writeInt(v);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readStrongBinder();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzs
            public IBinder zza(zzd zzd0, AdSizeParcel adSizeParcel0, String s, zzef zzef0, int v, int v1) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    if(adSizeParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adSizeParcel0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    if(zzef0 != null) {
                        iBinder0 = zzef0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    this.zznF.transact(2, parcel0, parcel1, 0);
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
            AdSizeParcel adSizeParcel0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    zzd zzd0 = com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        adSizeParcel0 = AdSizeParcel.CREATOR.zzc(data);
                    }
                    IBinder iBinder0 = this.zza(zzd0, adSizeParcel0, data.readString(), com.google.android.gms.internal.zzef.zza.zzE(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    zzd zzd1 = com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        adSizeParcel0 = AdSizeParcel.CREATOR.zzc(data);
                    }
                    IBinder iBinder1 = this.zza(zzd1, adSizeParcel0, data.readString(), com.google.android.gms.internal.zzef.zza.zzE(data.readStrongBinder()), data.readInt(), data.readInt());
                    reply.writeNoException();
                    reply.writeStrongBinder(iBinder1);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzs zzl(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return iInterface0 != null && iInterface0 instanceof zzs ? ((zzs)iInterface0) : new com.google.android.gms.ads.internal.client.zzs.zza.zza(iBinder0);
        }
    }

    IBinder zza(zzd arg1, AdSizeParcel arg2, String arg3, zzef arg4, int arg5) throws RemoteException;

    IBinder zza(zzd arg1, AdSizeParcel arg2, String arg3, zzef arg4, int arg5, int arg6) throws RemoteException;
}

