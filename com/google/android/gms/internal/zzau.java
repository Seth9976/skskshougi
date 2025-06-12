package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public interface zzau extends IInterface {
    public static abstract class zza extends Binder implements zzau {
        static class com.google.android.gms.internal.zzau.zza.zza implements zzau {
            private IBinder zznF;

            com.google.android.gms.internal.zzau.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzau
            public Bundle zza(Account account0, String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
                    if(account0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        account0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzau
            public Bundle zza(String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
                    parcel0.writeString(s);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzau
            public Bundle zza(String s, String s1, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzau
            public AccountChangeEventsResponse zza(AccountChangeEventsRequest accountChangeEventsRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
                    if(accountChangeEventsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        accountChangeEventsRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((AccountChangeEventsResponse)AccountChangeEventsResponse.CREATOR.createFromParcel(parcel1));
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
                    data.enforceInterface("com.google.android.auth.IAuthManagerService");
                    Bundle bundle0 = this.zza(data.readString(), data.readString(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(bundle0 != null) {
                        reply.writeInt(1);
                        bundle0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.auth.IAuthManagerService");
                    Bundle bundle1 = this.zza(data.readString(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(bundle1 != null) {
                        reply.writeInt(1);
                        bundle1.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.auth.IAuthManagerService");
                    AccountChangeEventsResponse accountChangeEventsResponse0 = this.zza((data.readInt() == 0 ? null : ((AccountChangeEventsRequest)AccountChangeEventsRequest.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(accountChangeEventsResponse0 != null) {
                        reply.writeInt(1);
                        accountChangeEventsResponse0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.auth.IAuthManagerService");
                    Bundle bundle2 = this.zza((data.readInt() == 0 ? null : ((Account)Account.CREATOR.createFromParcel(data))), data.readString(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(bundle2 != null) {
                        reply.writeInt(1);
                        bundle2.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.auth.IAuthManagerService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzau zza(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            return iInterface0 != null && iInterface0 instanceof zzau ? ((zzau)iInterface0) : new com.google.android.gms.internal.zzau.zza.zza(iBinder0);
        }
    }

    Bundle zza(Account arg1, String arg2, Bundle arg3) throws RemoteException;

    Bundle zza(String arg1, Bundle arg2) throws RemoteException;

    Bundle zza(String arg1, String arg2, Bundle arg3) throws RemoteException;

    AccountChangeEventsResponse zza(AccountChangeEventsRequest arg1) throws RemoteException;
}

