package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ICancelToken extends IInterface {
    public static abstract class zza extends Binder implements ICancelToken {
        static class com.google.android.gms.common.internal.ICancelToken.zza.zza implements ICancelToken {
            private IBinder zznF;

            com.google.android.gms.common.internal.ICancelToken.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.common.internal.ICancelToken
            public void cancel() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.common.internal.ICancelToken");
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.common.internal.ICancelToken");
                    this.cancel();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.common.internal.ICancelToken");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static ICancelToken zzaE(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return iInterface0 != null && iInterface0 instanceof ICancelToken ? ((ICancelToken)iInterface0) : new com.google.android.gms.common.internal.ICancelToken.zza.zza(iBinder0);
        }
    }

    void cancel() throws RemoteException;
}

