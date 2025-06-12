package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzfj extends IInterface {
    public static abstract class zza extends Binder implements zzfj {
        static class com.google.android.gms.internal.zzfj.zza.zza implements zzfj {
            private IBinder zznF;

            com.google.android.gms.internal.zzfj.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzfj
            public boolean isValidPurchase(String productId) throws RemoteException {
                boolean z = true;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    parcel0.writeString(productId);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() == 0) {
                        z = false;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzfj
            public void zza(zzfi zzfi0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    parcel0.writeStrongBinder((zzfi0 == null ? null : zzfi0.asBinder()));
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
            this.attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    boolean z = this.isValidPurchase(data.readString());
                    reply.writeNoException();
                    reply.writeInt((z ? 1 : 0));
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    this.zza(com.google.android.gms.internal.zzfi.zza.zzP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzfj zzQ(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
            return iInterface0 != null && iInterface0 instanceof zzfj ? ((zzfj)iInterface0) : new com.google.android.gms.internal.zzfj.zza.zza(iBinder0);
        }
    }

    boolean isValidPurchase(String arg1) throws RemoteException;

    void zza(zzfi arg1) throws RemoteException;
}

