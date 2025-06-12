package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

public interface zzcn extends IInterface {
    public static abstract class zza extends Binder implements zzcn {
        static class com.google.android.gms.internal.zzcn.zza.zza implements zzcn {
            private IBinder zznF;

            com.google.android.gms.internal.zzcn.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzcn
            public IBinder zza(zzd zzd0, zzd zzd1, zzd zzd2, int v) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    parcel0.writeStrongBinder((zzd1 == null ? null : zzd1.asBinder()));
                    if(zzd2 != null) {
                        iBinder0 = zzd2.asBinder();
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
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    IBinder iBinder0 = this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzcn zzv(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
            return iInterface0 != null && iInterface0 instanceof zzcn ? ((zzcn)iInterface0) : new com.google.android.gms.internal.zzcn.zza.zza(iBinder0);
        }
    }

    IBinder zza(zzd arg1, zzd arg2, zzd arg3, int arg4) throws RemoteException;
}

