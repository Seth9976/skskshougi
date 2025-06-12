package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.Device;

public interface zzon extends IInterface {
    public static abstract class zza extends Binder implements zzon {
        static class com.google.android.gms.internal.zzon.zza.zza implements zzon {
            private IBinder zznF;

            com.google.android.gms.internal.zzon.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzon
            public void onError(int errorCode) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    parcel0.writeInt(errorCode);
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzon
            public void onScanStopped() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzon
            public void zza(Device device0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    if(device0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        device0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    this.zza((data.readInt() == 0 ? null : ((Device)Device.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    this.onScanStopped();
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    this.onError(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzon zzcZ(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
            return iInterface0 != null && iInterface0 instanceof zzon ? ((zzon)iInterface0) : new com.google.android.gms.internal.zzon.zza.zza(iBinder0);
        }
    }

    void onError(int arg1) throws RemoteException;

    void onScanStopped() throws RemoteException;

    void zza(Device arg1) throws RemoteException;
}

