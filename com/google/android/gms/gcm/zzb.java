package com.google.android.gms.gcm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzb extends IInterface {
    public static abstract class zza extends Binder implements zzb {
        static class com.google.android.gms.gcm.zzb.zza.zza implements zzb {
            private IBinder zznF;

            com.google.android.gms.gcm.zzb.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.gcm.zzb
            public void zzgg(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
                    parcel0.writeInt(v);
                    this.zznF.transact(2, parcel0, parcel1, 0);
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
                case 2: {
                    data.enforceInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                    this.zzgg(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.gcm.INetworkTaskCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzb zzbN(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
            return iInterface0 != null && iInterface0 instanceof zzb ? ((zzb)iInterface0) : new com.google.android.gms.gcm.zzb.zza.zza(iBinder0);
        }
    }

    void zzgg(int arg1) throws RemoteException;
}

