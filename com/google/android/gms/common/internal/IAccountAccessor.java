package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IAccountAccessor extends IInterface {
    public static abstract class zza extends Binder implements IAccountAccessor {
        static class com.google.android.gms.common.internal.IAccountAccessor.zza.zza implements IAccountAccessor {
            private IBinder zznF;

            com.google.android.gms.common.internal.IAccountAccessor.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.common.internal.IAccountAccessor
            public Account getAccount() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Account)Account.CREATOR.createFromParcel(parcel1));
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
                case 2: {
                    data.enforceInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    Account account0 = this.getAccount();
                    reply.writeNoException();
                    if(account0 != null) {
                        reply.writeInt(1);
                        account0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.common.internal.IAccountAccessor");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static IAccountAccessor zzaD(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterface0 != null && iInterface0 instanceof IAccountAccessor ? ((IAccountAccessor)iInterface0) : new com.google.android.gms.common.internal.IAccountAccessor.zza.zza(iBinder0);
        }
    }

    Account getAccount() throws RemoteException;
}

