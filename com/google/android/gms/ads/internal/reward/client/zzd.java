package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzd extends IInterface {
    public static abstract class zza extends Binder implements zzd {
        static class com.google.android.gms.ads.internal.reward.client.zzd.zza.zza implements zzd {
            private IBinder zznF;

            com.google.android.gms.ads.internal.reward.client.zzd.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzd
            public void onRewardedVideoAdClosed() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzd
            public void onRewardedVideoAdFailedToLoad(int errorCode) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    parcel0.writeInt(errorCode);
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzd
            public void onRewardedVideoAdLeftApplication() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzd
            public void onRewardedVideoAdLoaded() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzd
            public void onRewardedVideoAdOpened() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzd
            public void onRewardedVideoStarted() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzd
            public void zza(com.google.android.gms.ads.internal.reward.client.zza zza0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    parcel0.writeStrongBinder((zza0 == null ? null : zza0.asBinder()));
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.onRewardedVideoAdLoaded();
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.onRewardedVideoAdOpened();
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.onRewardedVideoStarted();
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.onRewardedVideoAdClosed();
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.zza(com.google.android.gms.ads.internal.reward.client.zza.zza.zzW(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.onRewardedVideoAdLeftApplication();
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    this.onRewardedVideoAdFailedToLoad(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzd zzZ(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
            return iInterface0 != null && iInterface0 instanceof zzd ? ((zzd)iInterface0) : new com.google.android.gms.ads.internal.reward.client.zzd.zza.zza(iBinder0);
        }
    }

    void onRewardedVideoAdClosed() throws RemoteException;

    void onRewardedVideoAdFailedToLoad(int arg1) throws RemoteException;

    void onRewardedVideoAdLeftApplication() throws RemoteException;

    void onRewardedVideoAdLoaded() throws RemoteException;

    void onRewardedVideoAdOpened() throws RemoteException;

    void onRewardedVideoStarted() throws RemoteException;

    void zza(com.google.android.gms.ads.internal.reward.client.zza arg1) throws RemoteException;
}

