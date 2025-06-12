package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzaq extends IInterface {
    public static abstract class zza extends Binder implements zzaq {
        static class com.google.android.gms.wearable.internal.zzaq.zza.zza implements zzaq {
            private IBinder zznF;

            com.google.android.gms.wearable.internal.zzaq.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.wearable.internal.zzaq
            public void zzw(int v, int v1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
                    this.zzw(data.readInt(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzaq zzdN(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzaq ? ((zzaq)iInterface0) : new com.google.android.gms.wearable.internal.zzaq.zza.zza(iBinder0);
        }
    }

    void zzw(int arg1, int arg2) throws RemoteException;
}

