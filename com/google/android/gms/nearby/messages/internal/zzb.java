package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public interface zzb extends IInterface {
    public static abstract class zza extends Binder implements zzb {
        static class com.google.android.gms.nearby.messages.internal.zzb.zza.zza implements zzb {
            private IBinder zznF;

            com.google.android.gms.nearby.messages.internal.zzb.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.nearby.messages.internal.zzb
            public void zzaL(Status status0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
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
                case 1: {
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
                    this.zzaL((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzb zzde(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            return iInterface0 != null && iInterface0 instanceof zzb ? ((zzb)iInterface0) : new com.google.android.gms.nearby.messages.internal.zzb.zza.zza(iBinder0);
        }
    }

    void zzaL(Status arg1) throws RemoteException;
}

