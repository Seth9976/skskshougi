package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzv extends IInterface {
    public static abstract class zza extends Binder implements zzv {
        static class com.google.android.gms.ads.internal.client.zzv.zza.zza implements zzv {
            private IBinder zznF;

            com.google.android.gms.ads.internal.client.zzv.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.ads.internal.client.zzv
            public void zza(String s, MobileAdsSettingsParcel mobileAdsSettingsParcel0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                    parcel0.writeString(s);
                    if(mobileAdsSettingsParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        mobileAdsSettingsParcel0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                    this.zza(data.readString(), (data.readInt() == 0 ? null : MobileAdsSettingsParcel.CREATOR.zzd(data)));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzv zzo(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterface0 != null && iInterface0 instanceof zzv ? ((zzv)iInterface0) : new com.google.android.gms.ads.internal.client.zzv.zza.zza(iBinder0);
        }
    }

    void zza(String arg1, MobileAdsSettingsParcel arg2) throws RemoteException;
}

