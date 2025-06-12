package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import java.util.List;

public interface zzcq extends IInterface {
    public static abstract class zza extends Binder implements zzcq {
        static class com.google.android.gms.internal.zzcq.zza.zza implements zzcq {
            private IBinder zznF;

            com.google.android.gms.internal.zzcq.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzcq
            public String getBody() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcq
            public List getImages() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readArrayList(this.getClass().getClassLoader());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcq
            public zzd zzdD() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcq
            public zzck zzdG() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.internal.zzck.zza.zzt(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcq
            public String zzdH() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcq
            public String zzdx() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcq
            public String zzdz() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    this.zznF.transact(7, parcel0, parcel1, 0);
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
            this.attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder0 = null;
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    zzd zzd0 = this.zzdD();
                    reply.writeNoException();
                    if(zzd0 != null) {
                        iBinder0 = zzd0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    String s = this.zzdx();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    List list0 = this.getImages();
                    reply.writeNoException();
                    reply.writeList(list0);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    String s1 = this.getBody();
                    reply.writeNoException();
                    reply.writeString(s1);
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    zzck zzck0 = this.zzdG();
                    reply.writeNoException();
                    if(zzck0 != null) {
                        iBinder0 = zzck0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    String s2 = this.zzdz();
                    reply.writeNoException();
                    reply.writeString(s2);
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    String s3 = this.zzdH();
                    reply.writeNoException();
                    reply.writeString(s3);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzcq zzx(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            return iInterface0 != null && iInterface0 instanceof zzcq ? ((zzcq)iInterface0) : new com.google.android.gms.internal.zzcq.zza.zza(iBinder0);
        }
    }

    String getBody() throws RemoteException;

    List getImages() throws RemoteException;

    zzd zzdD() throws RemoteException;

    zzck zzdG() throws RemoteException;

    String zzdH() throws RemoteException;

    String zzdx() throws RemoteException;

    String zzdz() throws RemoteException;
}

