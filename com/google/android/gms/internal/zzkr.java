package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzkr extends IInterface {
    public static abstract class zza extends Binder implements zzkr {
        static class com.google.android.gms.internal.zzkr.zza.zza implements zzkr {
            private IBinder zznF;

            com.google.android.gms.internal.zzkr.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzkr
            public void zza(zzkq zzkq0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
                    if(zzkq0 != null) {
                        iBinder0 = zzkq0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.common.internal.service.ICommonService");
                    this.zza(com.google.android.gms.internal.zzkq.zza.zzaL(data.readStrongBinder()));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.common.internal.service.ICommonService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzkr zzaM(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
            return iInterface0 != null && iInterface0 instanceof zzkr ? ((zzkr)iInterface0) : new com.google.android.gms.internal.zzkr.zza.zza(iBinder0);
        }
    }

    void zza(zzkq arg1) throws RemoteException;
}

