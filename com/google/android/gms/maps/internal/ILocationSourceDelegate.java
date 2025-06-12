package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ILocationSourceDelegate extends IInterface {
    public static abstract class zza extends Binder implements ILocationSourceDelegate {
        static class com.google.android.gms.maps.internal.ILocationSourceDelegate.zza.zza implements ILocationSourceDelegate {
            private IBinder zznF;

            com.google.android.gms.maps.internal.ILocationSourceDelegate.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // com.google.android.gms.maps.internal.ILocationSourceDelegate
            public void activate(zzi listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(1, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.internal.ILocationSourceDelegate
            public void deactivate() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
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
            this.attachInterface(this, "com.google.android.gms.maps.internal.ILocationSourceDelegate");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    this.activate(com.google.android.gms.maps.internal.zzi.zza.zzcq(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    this.deactivate();
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static ILocationSourceDelegate zzck(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            return iInterface0 != null && iInterface0 instanceof ILocationSourceDelegate ? ((ILocationSourceDelegate)iInterface0) : new com.google.android.gms.maps.internal.ILocationSourceDelegate.zza.zza(iBinder0);
        }
    }

    void activate(zzi arg1) throws RemoteException;

    void deactivate() throws RemoteException;
}

