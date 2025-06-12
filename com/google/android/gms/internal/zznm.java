package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.identity.intents.UserAddressRequest;

public interface zznm extends IInterface {
    public static abstract class zza extends Binder implements zznm {
        static class com.google.android.gms.internal.zznm.zza.zza implements zznm {
            private IBinder zznF;

            com.google.android.gms.internal.zznm.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zznm
            public void zza(zznl zznl0, UserAddressRequest userAddressRequest0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.identity.intents.internal.IAddressService");
                    parcel0.writeStrongBinder((zznl0 == null ? null : zznl0.asBinder()));
                    if(userAddressRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        userAddressRequest0.writeToParcel(parcel0, 0);
                    }
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

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.identity.intents.internal.IAddressService");
                    this.zza(com.google.android.gms.internal.zznl.zza.zzbP(data.readStrongBinder()), (data.readInt() == 0 ? null : ((UserAddressRequest)UserAddressRequest.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.identity.intents.internal.IAddressService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zznm zzbQ(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
            return iInterface0 != null && iInterface0 instanceof zznm ? ((zznm)iInterface0) : new com.google.android.gms.internal.zznm.zza.zza(iBinder0);
        }
    }

    void zza(zznl arg1, UserAddressRequest arg2, Bundle arg3) throws RemoteException;
}

