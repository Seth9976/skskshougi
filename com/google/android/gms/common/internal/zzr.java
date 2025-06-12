package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

public interface zzr extends IInterface {
    public static abstract class zza extends Binder implements zzr {
        static class com.google.android.gms.common.internal.zzr.zza.zza implements zzr {
            private IBinder zznF;

            com.google.android.gms.common.internal.zzr.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.common.internal.zzr
            public zzd zza(zzd zzd0, int v, int v1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
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
                    data.enforceInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
                    zzd zzd0 = this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), data.readInt(), data.readInt());
                    reply.writeNoException();
                    reply.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.common.internal.ISignInButtonCreator");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzr zzaI(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            return iInterface0 != null && iInterface0 instanceof zzr ? ((zzr)iInterface0) : new com.google.android.gms.common.internal.zzr.zza.zza(iBinder0);
        }
    }

    zzd zza(zzd arg1, int arg2, int arg3) throws RemoteException;
}

