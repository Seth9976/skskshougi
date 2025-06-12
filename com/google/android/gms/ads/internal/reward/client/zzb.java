package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzb extends IInterface {
    public static abstract class zza extends Binder implements zzb {
        static class com.google.android.gms.ads.internal.reward.client.zzb.zza.zza implements zzb {
            private IBinder zznF;

            com.google.android.gms.ads.internal.reward.client.zzb.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzb
            public void destroy() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzb
            public boolean isLoaded() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    this.zznF.transact(5, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.ads.internal.reward.client.zzb
            public void pause() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzb
            public void resume() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzb
            public void setUserId(String userId) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    parcel0.writeString(userId);
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzb
            public void show() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzb
            public void zza(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    if(rewardedVideoAdRequestParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        rewardedVideoAdRequestParcel0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.reward.client.zzb
            public void zza(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    this.zza((data.readInt() == 0 ? null : RewardedVideoAdRequestParcel.CREATOR.zzn(data)));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    this.show();
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    this.zza(com.google.android.gms.ads.internal.reward.client.zzd.zza.zzZ(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    this.setUserId(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    boolean z = this.isLoaded();
                    reply.writeNoException();
                    reply.writeInt((z ? 1 : 0));
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    this.pause();
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    this.resume();
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    this.destroy();
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzb zzX(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return iInterface0 != null && iInterface0 instanceof zzb ? ((zzb)iInterface0) : new com.google.android.gms.ads.internal.reward.client.zzb.zza.zza(iBinder0);
        }
    }

    void destroy() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setUserId(String arg1) throws RemoteException;

    void show() throws RemoteException;

    void zza(RewardedVideoAdRequestParcel arg1) throws RemoteException;

    void zza(zzd arg1) throws RemoteException;
}

