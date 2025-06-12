package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public interface zzg extends IInterface {
    public static abstract class zza extends Binder implements zzg {
        static class com.google.android.gms.maps.model.internal.zzg.zza.zza implements zzg {
            private IBinder zznF;

            com.google.android.gms.maps.model.internal.zzg.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.model.internal.zzg
            public int getActiveLevelIndex() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzg
            public int getDefaultLevelIndex() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzg
            public List getLevels() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.createBinderArrayList();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzg
            public int hashCodeRemote() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzg
            public boolean isUnderground() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
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

            @Override  // com.google.android.gms.maps.model.internal.zzg
            public boolean zzb(zzg zzg0) throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    parcel0.writeStrongBinder((zzg0 == null ? null : zzg0.asBinder()));
                    this.zznF.transact(5, parcel0, parcel1, 0);
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
            int v2 = 0;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    int v3 = this.getActiveLevelIndex();
                    reply.writeNoException();
                    reply.writeInt(v3);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    int v4 = this.getDefaultLevelIndex();
                    reply.writeNoException();
                    reply.writeInt(v4);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    List list0 = this.getLevels();
                    reply.writeNoException();
                    reply.writeBinderList(list0);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    boolean z = this.isUnderground();
                    reply.writeNoException();
                    if(z) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    boolean z1 = this.zzb(zza.zzcN(data.readStrongBinder()));
                    reply.writeNoException();
                    if(z1) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    int v5 = this.hashCodeRemote();
                    reply.writeNoException();
                    reply.writeInt(v5);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzg zzcN(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            return iInterface0 != null && iInterface0 instanceof zzg ? ((zzg)iInterface0) : new com.google.android.gms.maps.model.internal.zzg.zza.zza(iBinder0);
        }
    }

    int getActiveLevelIndex() throws RemoteException;

    int getDefaultLevelIndex() throws RemoteException;

    List getLevels() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    boolean isUnderground() throws RemoteException;

    boolean zzb(zzg arg1) throws RemoteException;
}

