package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzan extends IInterface {
    public static abstract class zza extends Binder implements zzan {
        static class com.google.android.gms.drive.internal.zzan.zza.zza implements zzan {
            private IBinder zznF;

            com.google.android.gms.drive.internal.zzan.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.drive.internal.zzan
            public void zzv(boolean z) throws RemoteException {
                int v = 1;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IEventReleaseCallback");
                    if(!z) {
                        v = 0;
                    }
                    parcel0.writeInt(v);
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
                    data.enforceInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
                    this.zzv(data.readInt() != 0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.drive.internal.IEventReleaseCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzan zzaR(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
            return iInterface0 != null && iInterface0 instanceof zzan ? ((zzan)iInterface0) : new com.google.android.gms.drive.internal.zzan.zza.zza(iBinder0);
        }
    }

    void zzv(boolean arg1) throws RemoteException;
}

