package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public interface ICredentialsService extends IInterface {
    public static abstract class zza extends Binder implements ICredentialsService {
        static class com.google.android.gms.auth.api.credentials.internal.ICredentialsService.zza.zza implements ICredentialsService {
            private IBinder zznF;

            com.google.android.gms.auth.api.credentials.internal.ICredentialsService.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.auth.api.credentials.internal.ICredentialsService
            public void performCredentialsDeleteOperation(ICredentialsCallbacks callbacks, DeleteRequest request) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    parcel0.writeStrongBinder((callbacks == null ? null : callbacks.asBinder()));
                    if(request == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        request.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.auth.api.credentials.internal.ICredentialsService
            public void performCredentialsRequestOperation(ICredentialsCallbacks callbacks, CredentialRequest request) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    parcel0.writeStrongBinder((callbacks == null ? null : callbacks.asBinder()));
                    if(request == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        request.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.auth.api.credentials.internal.ICredentialsService
            public void performCredentialsSaveOperation(ICredentialsCallbacks callbacks, SaveRequest request) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    parcel0.writeStrongBinder((callbacks == null ? null : callbacks.asBinder()));
                    if(request == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        request.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.auth.api.credentials.internal.ICredentialsService
            public void performDisableAutoSignInOperation(ICredentialsCallbacks callbacks) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    parcel0.writeStrongBinder((callbacks == null ? null : callbacks.asBinder()));
                    this.zznF.transact(4, parcel0, parcel1, 0);
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
            CredentialRequest credentialRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    ICredentialsCallbacks iCredentialsCallbacks0 = com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks.zza.zzap(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        credentialRequest0 = (CredentialRequest)CredentialRequest.CREATOR.createFromParcel(data);
                    }
                    this.performCredentialsRequestOperation(iCredentialsCallbacks0, credentialRequest0);
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    ICredentialsCallbacks iCredentialsCallbacks1 = com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks.zza.zzap(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        credentialRequest0 = (SaveRequest)SaveRequest.CREATOR.createFromParcel(data);
                    }
                    this.performCredentialsSaveOperation(iCredentialsCallbacks1, ((SaveRequest)credentialRequest0));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    ICredentialsCallbacks iCredentialsCallbacks2 = com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks.zza.zzap(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        credentialRequest0 = (DeleteRequest)DeleteRequest.CREATOR.createFromParcel(data);
                    }
                    this.performCredentialsDeleteOperation(iCredentialsCallbacks2, ((DeleteRequest)credentialRequest0));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    this.performDisableAutoSignInOperation(com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks.zza.zzap(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static ICredentialsService zzaq(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            return iInterface0 != null && iInterface0 instanceof ICredentialsService ? ((ICredentialsService)iInterface0) : new com.google.android.gms.auth.api.credentials.internal.ICredentialsService.zza.zza(iBinder0);
        }
    }

    void performCredentialsDeleteOperation(ICredentialsCallbacks arg1, DeleteRequest arg2) throws RemoteException;

    void performCredentialsRequestOperation(ICredentialsCallbacks arg1, CredentialRequest arg2) throws RemoteException;

    void performCredentialsSaveOperation(ICredentialsCallbacks arg1, SaveRequest arg2) throws RemoteException;

    void performDisableAutoSignInOperation(ICredentialsCallbacks arg1) throws RemoteException;
}

