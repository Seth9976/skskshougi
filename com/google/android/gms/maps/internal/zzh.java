package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzi;

public interface zzh extends IInterface {
    public static abstract class zza extends Binder implements zzh {
        static class com.google.android.gms.maps.internal.zzh.zza.zza implements zzh {
            private IBinder zznF;

            com.google.android.gms.maps.internal.zzh.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.zzh
            public void zze(zzi zzi0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    parcel0.writeStrongBinder((zzi0 == null ? null : zzi0.asBinder()));
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    this.zze(com.google.android.gms.maps.model.internal.zzi.zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzh zzcp(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            return iInterface0 != null && iInterface0 instanceof zzh ? ((zzh)iInterface0) : new com.google.android.gms.maps.internal.zzh.zza.zza(iBinder0);
        }
    }

    void zze(zzi arg1) throws RemoteException;
}

