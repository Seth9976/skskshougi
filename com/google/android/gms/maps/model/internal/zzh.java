package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzh extends IInterface {
    public static abstract class zza extends Binder implements zzh {
        static class com.google.android.gms.maps.model.internal.zzh.zza.zza implements zzh {
            private IBinder zznF;

            com.google.android.gms.maps.model.internal.zzh.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // com.google.android.gms.maps.model.internal.zzh
            public void activate() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.model.internal.zzh
            public String getName() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzh
            public String getShortName() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzh
            public int hashCodeRemote() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzh
            public boolean zza(zzh zzh0) throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    parcel0.writeStrongBinder((zzh0 == null ? null : zzh0.asBinder()));
                    this.zznF.transact(4, parcel0, parcel1, 0);
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
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    String s = this.getName();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    String s1 = this.getShortName();
                    reply.writeNoException();
                    reply.writeString(s1);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    this.activate();
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    boolean z = this.zza(zza.zzcO(data.readStrongBinder()));
                    reply.writeNoException();
                    reply.writeInt((z ? 1 : 0));
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    int v2 = this.hashCodeRemote();
                    reply.writeNoException();
                    reply.writeInt(v2);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzh zzcO(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            return iInterface0 != null && iInterface0 instanceof zzh ? ((zzh)iInterface0) : new com.google.android.gms.maps.model.internal.zzh.zza.zza(iBinder0);
        }
    }

    void activate() throws RemoteException;

    String getName() throws RemoteException;

    String getShortName() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    boolean zza(zzh arg1) throws RemoteException;
}

