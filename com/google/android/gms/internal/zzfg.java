package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzfg extends IInterface {
    public static abstract class zza extends Binder implements zzfg {
        static class com.google.android.gms.internal.zzfg.zza.zza implements zzfg {
            private IBinder zznF;

            com.google.android.gms.internal.zzfg.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzfg
            public void onActivityResult(int requestCode, int resultCode, Intent data) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    parcel0.writeInt(requestCode);
                    parcel0.writeInt(resultCode);
                    if(data == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        data.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzfg
            public void onCreate() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzfg
            public void onDestroy() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
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
            this.attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    this.onCreate();
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    this.onDestroy();
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    this.onActivityResult(data.readInt(), data.readInt(), (data.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzfg zzN(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
            return iInterface0 != null && iInterface0 instanceof zzfg ? ((zzfg)iInterface0) : new com.google.android.gms.internal.zzfg.zza.zza(iBinder0);
        }
    }

    void onActivityResult(int arg1, int arg2, Intent arg3) throws RemoteException;

    void onCreate() throws RemoteException;

    void onDestroy() throws RemoteException;
}

