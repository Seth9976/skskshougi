package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public interface zze extends IInterface {
    public static abstract class zza extends Binder implements zze {
        static class com.google.android.gms.signin.internal.zze.zza.zza implements zze {
            private IBinder zznF;

            com.google.android.gms.signin.internal.zze.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.signin.internal.zze
            public void zza(ConnectionResult connectionResult0, AuthAccountResult authAccountResult0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
                    if(connectionResult0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        connectionResult0.writeToParcel(parcel0, 0);
                    }
                    if(authAccountResult0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        authAccountResult0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.signin.internal.zze
            public void zzaT(Status status0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 3: {
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    this.zza((data.readInt() == 0 ? null : ((ConnectionResult)ConnectionResult.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((AuthAccountResult)AuthAccountResult.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                    this.zzaT((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zze zzdC(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            return iInterface0 != null && iInterface0 instanceof zze ? ((zze)iInterface0) : new com.google.android.gms.signin.internal.zze.zza.zza(iBinder0);
        }
    }

    void zza(ConnectionResult arg1, AuthAccountResult arg2) throws RemoteException;

    void zzaT(Status arg1) throws RemoteException;
}

