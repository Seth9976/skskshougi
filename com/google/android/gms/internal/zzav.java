package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzav extends IInterface {
    public static abstract class zza extends Binder implements zzav {
        static class com.google.android.gms.internal.zzav.zza.zza implements zzav {
            private IBinder zznF;

            com.google.android.gms.internal.zzav.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzav
            public String getId() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzav
            public void zzb(String s, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcel0.writeString(s);
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzav
            public boolean zzc(boolean z) throws RemoteException {
                boolean z1 = true;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcel0.writeInt((z ? 1 : 0));
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() == 0) {
                        z1 = false;
                    }
                    return z1;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzav
            public String zzn(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcel0.writeString(s);
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            boolean z = false;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    String s = this.getId();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z1 = this.zzc(data.readInt() != 0);
                    reply.writeNoException();
                    if(z1) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    String s1 = this.zzn(data.readString());
                    reply.writeNoException();
                    reply.writeString(s1);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    String s2 = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzb(s2, z);
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzav zzb(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return iInterface0 != null && iInterface0 instanceof zzav ? ((zzav)iInterface0) : new com.google.android.gms.internal.zzav.zza.zza(iBinder0);
        }
    }

    String getId() throws RemoteException;

    void zzb(String arg1, boolean arg2) throws RemoteException;

    boolean zzc(boolean arg1) throws RemoteException;

    String zzn(String arg1) throws RemoteException;
}

