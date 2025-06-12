package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzef;

public interface zzq extends IInterface {
    public static abstract class zza extends Binder implements zzq {
        static class com.google.android.gms.ads.internal.client.zzq.zza.zza implements zzq {
            private IBinder zznF;

            com.google.android.gms.ads.internal.client.zzq.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.ads.internal.client.zzq
            public IBinder zza(zzd zzd0, String s, zzef zzef0, int v) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
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
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    IBinder iBinder0 = this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), data.readString(), com.google.android.gms.internal.zzef.zza.zzE(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzq zzj(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
            return iInterface0 != null && iInterface0 instanceof zzq ? ((zzq)iInterface0) : new com.google.android.gms.ads.internal.client.zzq.zza.zza(iBinder0);
        }
    }

    IBinder zza(zzd arg1, String arg2, zzef arg3, int arg4) throws RemoteException;
}

