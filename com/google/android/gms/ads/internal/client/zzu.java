package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzu extends IInterface {
    public static abstract class zza extends Binder implements zzu {
        static class com.google.android.gms.ads.internal.client.zzu.zza.zza implements zzu {
            private IBinder zznF;

            com.google.android.gms.ads.internal.client.zzu.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.ads.internal.client.zzu
            public long getValue() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readLong();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    long v2 = this.getValue();
                    reply.writeNoException();
                    reply.writeLong(v2);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzu zzn(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
            return iInterface0 != null && iInterface0 instanceof zzu ? ((zzu)iInterface0) : new com.google.android.gms.ads.internal.client.zzu.zza.zza(iBinder0);
        }
    }

    long getValue() throws RemoteException;
}

