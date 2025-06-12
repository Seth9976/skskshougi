package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzkq extends IInterface {
    public static abstract class zza extends Binder implements zzkq {
        static class com.google.android.gms.internal.zzkq.zza.zza implements zzkq {
            private IBinder zznF;

            com.google.android.gms.internal.zzkq.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzkq
            public void zzbB(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonCallbacks");
                    parcel0.writeInt(v);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.common.internal.service.ICommonCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
                    this.zzbB(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.common.internal.service.ICommonCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzkq zzaL(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzkq ? ((zzkq)iInterface0) : new com.google.android.gms.internal.zzkq.zza.zza(iBinder0);
        }
    }

    void zzbB(int arg1) throws RemoteException;
}

