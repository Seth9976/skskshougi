package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public interface ICredentialsCallbacks extends IInterface {
    public static abstract class zza extends Binder implements ICredentialsCallbacks {
        static class com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks.zza.zza implements ICredentialsCallbacks {
            private IBinder zznF;

            com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks
            public void onCredentialResult(Status status, Credential credential) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
                    if(status == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status.writeToParcel(parcel0, 0);
                    }
                    if(credential == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        credential.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks
            public void onStatusResult(Status status) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
                    if(status == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status.writeToParcel(parcel0, 0);
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

        public zza() {
            this.attachInterface(this, "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
                    this.onCredentialResult((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Credential)Credential.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
                    this.onStatusResult((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static ICredentialsCallbacks zzap(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
            return iInterface0 != null && iInterface0 instanceof ICredentialsCallbacks ? ((ICredentialsCallbacks)iInterface0) : new com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks.zza.zza(iBinder0);
        }
    }

    void onCredentialResult(Status arg1, Credential arg2) throws RemoteException;

    void onStatusResult(Status arg1) throws RemoteException;
}

