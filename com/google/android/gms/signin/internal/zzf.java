package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzq;

public interface zzf extends IInterface {
    public static abstract class zza extends Binder implements zzf {
        static class com.google.android.gms.signin.internal.zzf.zza.zza implements zzf {
            private IBinder zznF;

            com.google.android.gms.signin.internal.zzf.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.signin.internal.zzf
            public void zza(int v, Account account0, zze zze0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    parcel0.writeInt(v);
                    if(account0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        account0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zze0 == null ? null : zze0.asBinder()));
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.signin.internal.zzf
            public void zza(AuthAccountRequest authAccountRequest0, zze zze0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if(authAccountRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        authAccountRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zze0 == null ? null : zze0.asBinder()));
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.signin.internal.zzf
            public void zza(IAccountAccessor iAccountAccessor0, int v, boolean z) throws RemoteException {
                int v1 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    parcel0.writeStrongBinder((iAccountAccessor0 == null ? null : iAccountAccessor0.asBinder()));
                    parcel0.writeInt(v);
                    if(z) {
                        v1 = 1;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.signin.internal.zzf
            public void zza(ResolveAccountRequest resolveAccountRequest0, zzq zzq0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if(resolveAccountRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        resolveAccountRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzq0 == null ? null : zzq0.asBinder()));
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.signin.internal.zzf
            public void zza(CheckServerAuthResult checkServerAuthResult0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if(checkServerAuthResult0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        checkServerAuthResult0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.signin.internal.zzf
            public void zzal(boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.signin.internal.zzf
            public void zziQ(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    parcel0.writeInt(v);
                    this.zznF.transact(7, parcel0, parcel1, 0);
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
            boolean z = false;
            AuthAccountRequest authAccountRequest0 = null;
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if(data.readInt() != 0) {
                        authAccountRequest0 = (AuthAccountRequest)AuthAccountRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(authAccountRequest0, com.google.android.gms.signin.internal.zze.zza.zzdC(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if(data.readInt() != 0) {
                        authAccountRequest0 = (CheckServerAuthResult)CheckServerAuthResult.CREATOR.createFromParcel(data);
                    }
                    this.zza(((CheckServerAuthResult)authAccountRequest0));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    this.zzal(data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    if(data.readInt() != 0) {
                        authAccountRequest0 = (ResolveAccountRequest)ResolveAccountRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((ResolveAccountRequest)authAccountRequest0), com.google.android.gms.common.internal.zzq.zza.zzaH(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    this.zziQ(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    int v2 = data.readInt();
                    if(data.readInt() != 0) {
                        authAccountRequest0 = (Account)Account.CREATOR.createFromParcel(data);
                    }
                    this.zza(v2, ((Account)authAccountRequest0), com.google.android.gms.signin.internal.zze.zza.zzdC(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                    IAccountAccessor iAccountAccessor0 = com.google.android.gms.common.internal.IAccountAccessor.zza.zzaD(data.readStrongBinder());
                    int v3 = data.readInt();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iAccountAccessor0, v3, z);
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.signin.internal.ISignInService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzf zzdD(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            return iInterface0 != null && iInterface0 instanceof zzf ? ((zzf)iInterface0) : new com.google.android.gms.signin.internal.zzf.zza.zza(iBinder0);
        }
    }

    void zza(int arg1, Account arg2, zze arg3) throws RemoteException;

    void zza(AuthAccountRequest arg1, zze arg2) throws RemoteException;

    void zza(IAccountAccessor arg1, int arg2, boolean arg3) throws RemoteException;

    void zza(ResolveAccountRequest arg1, zzq arg2) throws RemoteException;

    void zza(CheckServerAuthResult arg1) throws RemoteException;

    void zzal(boolean arg1) throws RemoteException;

    void zziQ(int arg1) throws RemoteException;
}

