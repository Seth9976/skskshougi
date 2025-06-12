package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzef extends IInterface {
    public static abstract class zza extends Binder implements zzef {
        static class com.google.android.gms.internal.zzef.zza.zza implements zzef {
            private IBinder zznF;

            com.google.android.gms.internal.zzef.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzef
            public zzeg zzY(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    parcel0.writeString(s);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.internal.zzeg.zza.zzF(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzef
            public boolean zzZ(String s) throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    parcel0.writeString(s);
                    this.zznF.transact(2, parcel0, parcel1, 0);
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

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    zzeg zzeg0 = this.zzY(data.readString());
                    reply.writeNoException();
                    reply.writeStrongBinder((zzeg0 == null ? null : zzeg0.asBinder()));
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    boolean z = this.zzZ(data.readString());
                    reply.writeNoException();
                    reply.writeInt((z ? 1 : 0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzef zzE(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            return iInterface0 != null && iInterface0 instanceof zzef ? ((zzef)iInterface0) : new com.google.android.gms.internal.zzef.zza.zza(iBinder0);
        }
    }

    zzeg zzY(String arg1) throws RemoteException;

    boolean zzZ(String arg1) throws RemoteException;
}

