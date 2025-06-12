package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zza extends IInterface {
    public static abstract class com.google.android.gms.ads.internal.reward.client.zza.zza extends Binder implements zza {
        static class com.google.android.gms.ads.internal.reward.client.zza.zza.zza implements zza {
            private IBinder zznF;

            com.google.android.gms.ads.internal.reward.client.zza.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zza
            public int getAmount() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zza
            public String getType() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public com.google.android.gms.ads.internal.reward.client.zza.zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    String s = this.getType();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    int v2 = this.getAmount();
                    reply.writeNoException();
                    reply.writeInt(v2);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zza zzW(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
            return iInterface0 != null && iInterface0 instanceof zza ? ((zza)iInterface0) : new com.google.android.gms.ads.internal.reward.client.zza.zza.zza(iBinder0);
        }
    }

    int getAmount() throws RemoteException;

    String getType() throws RemoteException;
}

