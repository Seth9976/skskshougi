package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzji extends IInterface {
    public static abstract class zza extends Binder implements zzji {
        static class com.google.android.gms.internal.zzji.zza.zza implements zzji {
            private IBinder zznF;

            com.google.android.gms.internal.zzji.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzji
            public void zza(Account account0, int v, zzjh zzjh0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
                    if(account0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        account0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(v);
                    parcel0.writeStrongBinder((zzjh0 == null ? null : zzjh0.asBinder()));
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
                    data.enforceInterface("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
                    this.zza((data.readInt() == 0 ? null : ((Account)Account.CREATOR.createFromParcel(data))), data.readInt(), com.google.android.gms.internal.zzjh.zza.zzan(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzji zzao(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
            return iInterface0 != null && iInterface0 instanceof zzji ? ((zzji)iInterface0) : new com.google.android.gms.internal.zzji.zza.zza(iBinder0);
        }
    }

    void zza(Account arg1, int arg2, zzjh arg3) throws RemoteException;
}

