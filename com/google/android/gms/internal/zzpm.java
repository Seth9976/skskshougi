package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;

public interface zzpm extends IInterface {
    public static abstract class zza extends Binder implements zzpm {
        static class com.google.android.gms.internal.zzpm.zza.zza implements zzpm {
            private IBinder zznF;

            com.google.android.gms.internal.zzpm.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzpm
            public void zza(Status status0, GoogleNowAuthState googleNowAuthState0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthCallbacks");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    if(googleNowAuthState0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        googleNowAuthState0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.search.internal.ISearchAuthCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
                    this.zza((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((GoogleNowAuthState)GoogleNowAuthState.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.search.internal.ISearchAuthCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzpm zzdz(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzpm ? ((zzpm)iInterface0) : new com.google.android.gms.internal.zzpm.zza.zza(iBinder0);
        }
    }

    void zza(Status arg1, GoogleNowAuthState arg2) throws RemoteException;
}

