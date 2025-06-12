package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

public interface zzcm extends IInterface {
    public static abstract class zza extends Binder implements zzcm {
        static class com.google.android.gms.internal.zzcm.zza.zza implements zzcm {
            private IBinder zznF;

            com.google.android.gms.internal.zzcm.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzcm
            public zzd zzS(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                    parcel0.writeString(s);
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcm
            public void zza(String s, zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                    parcel0.writeString(s);
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcm
            public void zzb(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
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
            this.attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                    this.zza(data.readString(), com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                    zzd zzd0 = this.zzS(data.readString());
                    reply.writeNoException();
                    reply.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                    this.zzb(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzcm zzu(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterface0 != null && iInterface0 instanceof zzcm ? ((zzcm)iInterface0) : new com.google.android.gms.internal.zzcm.zza.zza(iBinder0);
        }
    }

    zzd zzS(String arg1) throws RemoteException;

    void zza(String arg1, zzd arg2) throws RemoteException;

    void zzb(zzd arg1) throws RemoteException;
}

