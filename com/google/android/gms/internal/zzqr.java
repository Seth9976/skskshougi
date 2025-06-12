package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzqr extends IInterface {
    public static abstract class zza extends Binder implements zzqr {
        static class com.google.android.gms.internal.zzqr.zza.zza implements zzqr {
            private IBinder zznF;

            com.google.android.gms.internal.zzqr.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzqr
            public void zza(int v, int v1, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
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
            this.attachInterface(this, "com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
                    this.zza(data.readInt(), data.readInt(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzqr zzdG(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
            return iInterface0 != null && iInterface0 instanceof zzqr ? ((zzqr)iInterface0) : new com.google.android.gms.internal.zzqr.zza.zza(iBinder0);
        }
    }

    void zza(int arg1, int arg2, Bundle arg3) throws RemoteException;
}

