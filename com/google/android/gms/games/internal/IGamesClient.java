package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IGamesClient extends IInterface {
    public static abstract class Stub extends Binder implements IGamesClient {
        static class Proxy implements IGamesClient {
            private IBinder zznF;

            Proxy(IBinder remote) {
                this.zznF = remote;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.games.internal.IGamesClient
            public PopupLocationInfoParcelable zzsq() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesClient");
                    this.zznF.transact(1001, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : PopupLocationInfoParcelable.CREATOR.zzdD(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public Stub() {
            this.attachInterface(this, "com.google.android.gms.games.internal.IGamesClient");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesClient");
                    PopupLocationInfoParcelable popupLocationInfoParcelable0 = this.zzsq();
                    reply.writeNoException();
                    if(popupLocationInfoParcelable0 != null) {
                        reply.writeInt(1);
                        popupLocationInfoParcelable0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.games.internal.IGamesClient");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static IGamesClient zzbL(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.games.internal.IGamesClient");
            return iInterface0 != null && iInterface0 instanceof IGamesClient ? ((IGamesClient)iInterface0) : new Proxy(iBinder0);
        }
    }

    PopupLocationInfoParcelable zzsq() throws RemoteException;
}

