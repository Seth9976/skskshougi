package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DeleteAllUserDataRequest;

public interface zzml extends IInterface {
    public static abstract class zza extends Binder implements zzml {
        static class com.google.android.gms.internal.zzml.zza.zza implements zzml {
            private IBinder zznF;

            com.google.android.gms.internal.zzml.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzml
            public void zza(DeleteAllUserDataRequest deleteAllUserDataRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
                    if(deleteAllUserDataRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        deleteAllUserDataRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
                    this.zza((data.readInt() == 0 ? null : ((DeleteAllUserDataRequest)DeleteAllUserDataRequest.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzml zzbw(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
            return iInterface0 != null && iInterface0 instanceof zzml ? ((zzml)iInterface0) : new com.google.android.gms.internal.zzml.zza.zza(iBinder0);
        }
    }

    void zza(DeleteAllUserDataRequest arg1) throws RemoteException;
}

