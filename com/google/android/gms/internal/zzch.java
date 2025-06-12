package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

public interface zzch extends IInterface {
    public static abstract class zza extends Binder implements zzch {
        static class com.google.android.gms.internal.zzch.zza.zza implements zzch {
            private IBinder zznF;

            com.google.android.gms.internal.zzch.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzch
            public String getContent() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzch
            public void recordClick() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzch
            public void recordImpression() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzch
            public void zza(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzch
            public String zzdt() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
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

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
                    String s = this.zzdt();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
                    String s1 = this.getContent();
                    reply.writeNoException();
                    reply.writeString(s1);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
                    this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
                    this.recordClick();
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
                    this.recordImpression();
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzch zzr(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
            return iInterface0 != null && iInterface0 instanceof zzch ? ((zzch)iInterface0) : new com.google.android.gms.internal.zzch.zza.zza(iBinder0);
        }
    }

    String getContent() throws RemoteException;

    void recordClick() throws RemoteException;

    void recordImpression() throws RemoteException;

    void zza(zzd arg1) throws RemoteException;

    String zzdt() throws RemoteException;
}

