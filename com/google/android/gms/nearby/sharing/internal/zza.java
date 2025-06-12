package com.google.android.gms.nearby.sharing.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.AppContentReceivedResult;

public interface zza extends IInterface {
    public static abstract class com.google.android.gms.nearby.sharing.internal.zza.zza extends Binder implements zza {
        static class com.google.android.gms.nearby.sharing.internal.zza.zza.zza implements zza {
            private IBinder zznF;

            com.google.android.gms.nearby.sharing.internal.zza.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.nearby.sharing.internal.zza
            public void zza(AppContentReceivedResult appContentReceivedResult0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
                    if(appContentReceivedResult0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        appContentReceivedResult0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.nearby.sharing.internal.zza
            public String zzdT(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
                    parcel0.writeString(s);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
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
                    data.enforceInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
                    String s = this.zzdT(data.readString());
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
                    this.zza((data.readInt() == 0 ? null : ((AppContentReceivedResult)AppContentReceivedResult.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zza zzdh(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
            return iInterface0 != null && iInterface0 instanceof zza ? ((zza)iInterface0) : new com.google.android.gms.nearby.sharing.internal.zza.zza.zza(iBinder0);
        }
    }

    void zza(AppContentReceivedResult arg1) throws RemoteException;

    String zzdT(String arg1) throws RemoteException;
}

