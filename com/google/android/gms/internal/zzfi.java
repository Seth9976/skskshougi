package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzfi extends IInterface {
    public static abstract class zza extends Binder implements zzfi {
        static class com.google.android.gms.internal.zzfi.zza.zza implements zzfi {
            private IBinder zznF;

            com.google.android.gms.internal.zzfi.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzfi
            public void finishPurchase() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzfi
            public String getProductId() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzfi
            public Intent getPurchaseData() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzfi
            public int getResultCode() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzfi
            public boolean isVerified() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            int v2 = 0;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    String s = this.getProductId();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    Intent intent0 = this.getPurchaseData();
                    reply.writeNoException();
                    if(intent0 != null) {
                        reply.writeInt(1);
                        intent0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    int v3 = this.getResultCode();
                    reply.writeNoException();
                    reply.writeInt(v3);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    boolean z = this.isVerified();
                    reply.writeNoException();
                    if(z) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    this.finishPurchase();
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzfi zzP(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseResult");
            return iInterface0 != null && iInterface0 instanceof zzfi ? ((zzfi)iInterface0) : new com.google.android.gms.internal.zzfi.zza.zza(iBinder0);
        }
    }

    void finishPurchase() throws RemoteException;

    String getProductId() throws RemoteException;

    Intent getPurchaseData() throws RemoteException;

    int getResultCode() throws RemoteException;

    boolean isVerified() throws RemoteException;
}

