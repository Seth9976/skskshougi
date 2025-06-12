package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzcx;

public interface zzp extends IInterface {
    public static abstract class zza extends Binder implements zzp {
        static class com.google.android.gms.ads.internal.client.zzp.zza.zza implements zzp {
            private IBinder zznF;

            com.google.android.gms.ads.internal.client.zzp.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.ads.internal.client.zzp
            public void zza(NativeAdOptionsParcel nativeAdOptionsParcel0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    if(nativeAdOptionsParcel0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        nativeAdOptionsParcel0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzp
            public void zza(zzcu zzcu0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    parcel0.writeStrongBinder((zzcu0 == null ? null : zzcu0.asBinder()));
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzp
            public void zza(zzcv zzcv0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    parcel0.writeStrongBinder((zzcv0 == null ? null : zzcv0.asBinder()));
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzp
            public void zza(String s, zzcx zzcx0, zzcw zzcw0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    parcel0.writeString(s);
                    parcel0.writeStrongBinder((zzcx0 == null ? null : zzcx0.asBinder()));
                    if(zzcw0 != null) {
                        iBinder0 = zzcw0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzp
            public void zzb(zzn zzn0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    parcel0.writeStrongBinder((zzn0 == null ? null : zzn0.asBinder()));
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.ads.internal.client.zzp
            public zzo zzbi() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.ads.internal.client.zzo.zza.zzh(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
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
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    zzo zzo0 = this.zzbi();
                    reply.writeNoException();
                    if(zzo0 != null) {
                        iBinder0 = zzo0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    this.zzb(com.google.android.gms.ads.internal.client.zzn.zza.zzg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    this.zza(com.google.android.gms.internal.zzcu.zza.zzz(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    this.zza(com.google.android.gms.internal.zzcv.zza.zzA(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    this.zza(data.readString(), com.google.android.gms.internal.zzcx.zza.zzC(data.readStrongBinder()), com.google.android.gms.internal.zzcw.zza.zzB(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    if(data.readInt() != 0) {
                        iBinder0 = NativeAdOptionsParcel.CREATOR.zzf(data);
                    }
                    this.zza(((NativeAdOptionsParcel)iBinder0));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzp zzi(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterface0 != null && iInterface0 instanceof zzp ? ((zzp)iInterface0) : new com.google.android.gms.ads.internal.client.zzp.zza.zza(iBinder0);
        }
    }

    void zza(NativeAdOptionsParcel arg1) throws RemoteException;

    void zza(zzcu arg1) throws RemoteException;

    void zza(zzcv arg1) throws RemoteException;

    void zza(String arg1, zzcx arg2, zzcw arg3) throws RemoteException;

    void zzb(zzn arg1) throws RemoteException;

    zzo zzbi() throws RemoteException;
}

