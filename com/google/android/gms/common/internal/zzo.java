package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzo extends IInterface {
    public static abstract class zza extends Binder implements zzo {
        static class com.google.android.gms.common.internal.zzo.zza.zza implements zzo {
            private IBinder zznF;

            com.google.android.gms.common.internal.zzo.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.common.internal.zzo
            public void zza(int v, IBinder iBinder0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeStrongBinder(iBinder0);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.common.internal.zzo
            public void zzb(int v, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            Bundle bundle0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                    int v2 = data.readInt();
                    IBinder iBinder0 = data.readStrongBinder();
                    if(data.readInt() != 0) {
                        bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                    }
                    this.zza(v2, iBinder0, bundle0);
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                    int v3 = data.readInt();
                    if(data.readInt() != 0) {
                        bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                    }
                    this.zzb(v3, bundle0);
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzo zzaF(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzo ? ((zzo)iInterface0) : new com.google.android.gms.common.internal.zzo.zza.zza(iBinder0);
        }
    }

    void zza(int arg1, IBinder arg2, Bundle arg3) throws RemoteException;

    void zzb(int arg1, Bundle arg2) throws RemoteException;
}

