package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzci;
import com.google.android.gms.internal.zzff;
import com.google.android.gms.internal.zzfj;

public interface zzr extends IInterface {
    public static abstract class zza extends Binder implements zzr {
        static class com.google.android.gms.ads.internal.client.zzr.zza.zza implements zzr {
            private IBinder zznF;

            com.google.android.gms.ads.internal.client.zzr.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void destroy() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public String getMediationAdapterClassName() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zznF.transact(18, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public boolean isReady() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zznF.transact(3, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void pause() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void resume() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void showInterstitial() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void stopLoading() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void zza(AdSizeParcel adSizeParcel0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    if(adSizeParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adSizeParcel0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void zza(zzm zzm0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    parcel0.writeStrongBinder((zzm0 == null ? null : zzm0.asBinder()));
                    this.zznF.transact(20, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void zza(zzn zzn0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    parcel0.writeStrongBinder((zzn0 == null ? null : zzn0.asBinder()));
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void zza(zzt zzt0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    parcel0.writeStrongBinder((zzt0 == null ? null : zzt0.asBinder()));
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void zza(zzu zzu0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    parcel0.writeStrongBinder((zzu0 == null ? null : zzu0.asBinder()));
                    this.zznF.transact(21, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void zza(zzci zzci0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    parcel0.writeStrongBinder((zzci0 == null ? null : zzci0.asBinder()));
                    this.zznF.transact(19, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void zza(zzff zzff0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    parcel0.writeStrongBinder((zzff0 == null ? null : zzff0.asBinder()));
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void zza(zzfj zzfj0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    parcel0.writeStrongBinder((zzfj0 == null ? null : zzfj0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(15, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public boolean zza(AdRequestParcel adRequestParcel0) throws RemoteException {
                boolean z = true;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    if(adRequestParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adRequestParcel0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public zzd zzaM() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public AdSizeParcel zzaN() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : AdSizeParcel.CREATOR.zzc(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzr
            public void zzaP() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder0 = null;
            int v2 = 0;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    zzd zzd0 = this.zzaM();
                    reply.writeNoException();
                    if(zzd0 != null) {
                        iBinder0 = zzd0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.destroy();
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    boolean z = this.isReady();
                    reply.writeNoException();
                    reply.writeInt((z ? 1 : 0));
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    if(data.readInt() != 0) {
                        iBinder0 = AdRequestParcel.CREATOR.zzb(data);
                    }
                    boolean z1 = this.zza(((AdRequestParcel)iBinder0));
                    reply.writeNoException();
                    if(z1) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.pause();
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.resume();
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zza(com.google.android.gms.ads.internal.client.zzn.zza.zzg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zza(com.google.android.gms.ads.internal.client.zzt.zza.zzm(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.showInterstitial();
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.stopLoading();
                    reply.writeNoException();
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zzaP();
                    reply.writeNoException();
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    AdSizeParcel adSizeParcel0 = this.zzaN();
                    reply.writeNoException();
                    if(adSizeParcel0 != null) {
                        reply.writeInt(1);
                        adSizeParcel0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    if(data.readInt() != 0) {
                        iBinder0 = AdSizeParcel.CREATOR.zzc(data);
                    }
                    this.zza(((AdSizeParcel)iBinder0));
                    reply.writeNoException();
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zza(com.google.android.gms.internal.zzff.zza.zzM(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zza(com.google.android.gms.internal.zzfj.zza.zzQ(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    String s = this.getMediationAdapterClassName();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zza(com.google.android.gms.internal.zzci.zza.zzs(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 20: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zza(com.google.android.gms.ads.internal.client.zzm.zza.zzf(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 21: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    this.zza(com.google.android.gms.ads.internal.client.zzu.zza.zzn(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.client.IAdManager");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzr zzk(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterface0 != null && iInterface0 instanceof zzr ? ((zzr)iInterface0) : new com.google.android.gms.ads.internal.client.zzr.zza.zza(iBinder0);
        }
    }

    void destroy() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isReady() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void showInterstitial() throws RemoteException;

    void stopLoading() throws RemoteException;

    void zza(AdSizeParcel arg1) throws RemoteException;

    void zza(zzm arg1) throws RemoteException;

    void zza(zzn arg1) throws RemoteException;

    void zza(zzt arg1) throws RemoteException;

    void zza(zzu arg1) throws RemoteException;

    void zza(zzci arg1) throws RemoteException;

    void zza(zzff arg1) throws RemoteException;

    void zza(zzfj arg1, String arg2) throws RemoteException;

    boolean zza(AdRequestParcel arg1) throws RemoteException;

    zzd zzaM() throws RemoteException;

    AdSizeParcel zzaN() throws RemoteException;

    void zzaP() throws RemoteException;
}

