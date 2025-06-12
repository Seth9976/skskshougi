package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.dynamic.zzd;

public interface zzeg extends IInterface {
    public static abstract class zza extends Binder implements zzeg {
        static class com.google.android.gms.internal.zzeg.zza.zza implements zzeg {
            private IBinder zznF;

            com.google.android.gms.internal.zzeg.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzeg
            public void destroy() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzeg
            public zzd getView() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzeg
            public boolean isInitialized() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zznF.transact(13, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.internal.zzeg
            public void pause() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzeg
            public void resume() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzeg
            public void showInterstitial() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzeg
            public void showVideo() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzeg
            public void zza(AdRequestParcel adRequestParcel0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    if(adRequestParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adRequestParcel0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzeg
            public void zza(zzd zzd0, AdRequestParcel adRequestParcel0, String s, com.google.android.gms.ads.internal.reward.mediation.client.zza zza0, String s1) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    if(adRequestParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adRequestParcel0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    if(zza0 != null) {
                        iBinder0 = zza0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    parcel0.writeString(s1);
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzeg
            public void zza(zzd zzd0, AdRequestParcel adRequestParcel0, String s, zzeh zzeh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    if(adRequestParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adRequestParcel0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    if(zzeh0 != null) {
                        iBinder0 = zzeh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzeg
            public void zza(zzd zzd0, AdRequestParcel adRequestParcel0, String s, String s1, zzeh zzeh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    if(adRequestParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adRequestParcel0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(zzeh0 != null) {
                        iBinder0 = zzeh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzeg
            public void zza(zzd zzd0, AdSizeParcel adSizeParcel0, AdRequestParcel adRequestParcel0, String s, zzeh zzeh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    if(adSizeParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adSizeParcel0.writeToParcel(parcel0, 0);
                    }
                    if(adRequestParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adRequestParcel0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    if(zzeh0 != null) {
                        iBinder0 = zzeh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzeg
            public void zza(zzd zzd0, AdSizeParcel adSizeParcel0, AdRequestParcel adRequestParcel0, String s, String s1, zzeh zzeh0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    if(adSizeParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adSizeParcel0.writeToParcel(parcel0, 0);
                    }
                    if(adRequestParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        adRequestParcel0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(zzeh0 != null) {
                        iBinder0 = zzeh0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), (data.readInt() == 0 ? null : AdSizeParcel.CREATOR.zzc(data)), (data.readInt() == 0 ? null : AdRequestParcel.CREATOR.zzb(data)), data.readString(), com.google.android.gms.internal.zzeh.zza.zzG(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    zzd zzd0 = this.getView();
                    reply.writeNoException();
                    if(zzd0 != null) {
                        iBinder0 = zzd0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    zzd zzd1 = com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        iBinder0 = AdRequestParcel.CREATOR.zzb(data);
                    }
                    this.zza(zzd1, ((AdRequestParcel)iBinder0), data.readString(), com.google.android.gms.internal.zzeh.zza.zzG(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.showInterstitial();
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.destroy();
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), (data.readInt() == 0 ? null : AdSizeParcel.CREATOR.zzc(data)), (data.readInt() == 0 ? null : AdRequestParcel.CREATOR.zzb(data)), data.readString(), data.readString(), com.google.android.gms.internal.zzeh.zza.zzG(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), (data.readInt() == 0 ? null : AdRequestParcel.CREATOR.zzb(data)), data.readString(), data.readString(), com.google.android.gms.internal.zzeh.zza.zzG(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.pause();
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.resume();
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), (data.readInt() == 0 ? null : AdRequestParcel.CREATOR.zzb(data)), data.readString(), com.google.android.gms.ads.internal.reward.mediation.client.zza.zza.zzab(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    if(data.readInt() != 0) {
                        iBinder0 = AdRequestParcel.CREATOR.zzb(data);
                    }
                    this.zza(((AdRequestParcel)iBinder0), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    this.showVideo();
                    reply.writeNoException();
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    boolean z = this.isInitialized();
                    reply.writeNoException();
                    reply.writeInt((z ? 1 : 0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzeg zzF(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            return iInterface0 != null && iInterface0 instanceof zzeg ? ((zzeg)iInterface0) : new com.google.android.gms.internal.zzeg.zza.zza(iBinder0);
        }
    }

    void destroy() throws RemoteException;

    zzd getView() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    void zza(AdRequestParcel arg1, String arg2) throws RemoteException;

    void zza(zzd arg1, AdRequestParcel arg2, String arg3, com.google.android.gms.ads.internal.reward.mediation.client.zza arg4, String arg5) throws RemoteException;

    void zza(zzd arg1, AdRequestParcel arg2, String arg3, zzeh arg4) throws RemoteException;

    void zza(zzd arg1, AdRequestParcel arg2, String arg3, String arg4, zzeh arg5) throws RemoteException;

    void zza(zzd arg1, AdSizeParcel arg2, AdRequestParcel arg3, String arg4, zzeh arg5) throws RemoteException;

    void zza(zzd arg1, AdSizeParcel arg2, AdRequestParcel arg3, String arg4, String arg5, zzeh arg6) throws RemoteException;
}

