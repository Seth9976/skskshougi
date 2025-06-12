package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzpi extends IInterface {
    public static abstract class zza extends Binder implements zzpi {
        static class com.google.android.gms.internal.zzpi.zza.zza implements zzpi {
            private IBinder zznF;

            com.google.android.gms.internal.zzpi.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzpi
            public void zza(zzph zzph0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    parcel0.writeStrongBinder((zzph0 == null ? null : zzph0.asBinder()));
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzpi
            public void zza(zzph zzph0, byte[] arr_b) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    parcel0.writeStrongBinder((zzph0 == null ? null : zzph0.asBinder()));
                    parcel0.writeByteArray(arr_b);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
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
                    data.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    this.zza(com.google.android.gms.internal.zzph.zza.zzdw(data.readStrongBinder()), data.createByteArray());
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    this.zza(com.google.android.gms.internal.zzph.zza.zzdw(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.safetynet.internal.ISafetyNetService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzpi zzdx(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
            return iInterface0 != null && iInterface0 instanceof zzpi ? ((zzpi)iInterface0) : new com.google.android.gms.internal.zzpi.zza.zza(iBinder0);
        }
    }

    void zza(zzph arg1) throws RemoteException;

    void zza(zzph arg1, byte[] arg2) throws RemoteException;
}

