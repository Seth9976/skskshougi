package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzd extends IInterface {
    public static abstract class zza extends Binder implements zzd {
        static class com.google.android.gms.maps.model.internal.zzd.zza.zza implements zzd {
            private IBinder zznF;

            com.google.android.gms.maps.model.internal.zzd.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.model.internal.zzd
            public com.google.android.gms.dynamic.zzd zzb(Bitmap bitmap0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    if(bitmap0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bitmap0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzd
            public com.google.android.gms.dynamic.zzd zzdu(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
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

            @Override  // com.google.android.gms.maps.model.internal.zzd
            public com.google.android.gms.dynamic.zzd zzdv(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    parcel0.writeString(s);
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzd
            public com.google.android.gms.dynamic.zzd zzdw(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    parcel0.writeString(s);
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzd
            public com.google.android.gms.dynamic.zzd zzh(float f) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    parcel0.writeFloat(f);
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzd
            public com.google.android.gms.dynamic.zzd zzhD(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    parcel0.writeInt(v);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzd
            public com.google.android.gms.dynamic.zzd zzvN() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    com.google.android.gms.dynamic.zzd zzd0 = this.zzhD(data.readInt());
                    reply.writeNoException();
                    reply.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    com.google.android.gms.dynamic.zzd zzd1 = this.zzdu(data.readString());
                    reply.writeNoException();
                    if(zzd1 != null) {
                        iBinder0 = zzd1.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    com.google.android.gms.dynamic.zzd zzd2 = this.zzdv(data.readString());
                    reply.writeNoException();
                    if(zzd2 != null) {
                        iBinder0 = zzd2.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    com.google.android.gms.dynamic.zzd zzd3 = this.zzvN();
                    reply.writeNoException();
                    if(zzd3 != null) {
                        iBinder0 = zzd3.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    com.google.android.gms.dynamic.zzd zzd4 = this.zzh(data.readFloat());
                    reply.writeNoException();
                    if(zzd4 != null) {
                        iBinder0 = zzd4.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    com.google.android.gms.dynamic.zzd zzd5 = this.zzb((data.readInt() == 0 ? null : ((Bitmap)Bitmap.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(zzd5 != null) {
                        iBinder0 = zzd5.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    com.google.android.gms.dynamic.zzd zzd6 = this.zzdw(data.readString());
                    reply.writeNoException();
                    if(zzd6 != null) {
                        iBinder0 = zzd6.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzd zzcK(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            return iInterface0 != null && iInterface0 instanceof zzd ? ((zzd)iInterface0) : new com.google.android.gms.maps.model.internal.zzd.zza.zza(iBinder0);
        }
    }

    com.google.android.gms.dynamic.zzd zzb(Bitmap arg1) throws RemoteException;

    com.google.android.gms.dynamic.zzd zzdu(String arg1) throws RemoteException;

    com.google.android.gms.dynamic.zzd zzdv(String arg1) throws RemoteException;

    com.google.android.gms.dynamic.zzd zzdw(String arg1) throws RemoteException;

    com.google.android.gms.dynamic.zzd zzh(float arg1) throws RemoteException;

    com.google.android.gms.dynamic.zzd zzhD(int arg1) throws RemoteException;

    com.google.android.gms.dynamic.zzd zzvN() throws RemoteException;
}

