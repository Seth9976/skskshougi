package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzp extends IInterface {
    public static abstract class zza extends Binder implements zzp {
        static class com.google.android.gms.maps.internal.zzp.zza.zza implements zzp {
            private IBinder zznF;

            com.google.android.gms.maps.internal.zzp.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.zzp
            public boolean onMyLocationButtonClick() throws RemoteException {
                boolean z = true;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() == 0) {
                        z = false;
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
            this.attachInterface(this, "com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                    boolean z = this.onMyLocationButtonClick();
                    reply.writeNoException();
                    reply.writeInt((z ? 1 : 0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzp zzcx(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            return iInterface0 != null && iInterface0 instanceof zzp ? ((zzp)iInterface0) : new com.google.android.gms.maps.internal.zzp.zza.zza(iBinder0);
        }
    }

    boolean onMyLocationButtonClick() throws RemoteException;
}

