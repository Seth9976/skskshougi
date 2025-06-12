package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.SyncInfoResult;

public interface zzmv extends IInterface {
    public static abstract class zza extends Binder implements zzmv {
        static class com.google.android.gms.internal.zzmv.zza.zza implements zzmv {
            private IBinder zznF;

            com.google.android.gms.internal.zzmv.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzmv
            public void zza(SyncInfoResult syncInfoResult0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.ISyncInfoCallback");
                    if(syncInfoResult0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        syncInfoResult0.writeToParcel(parcel0, 0);
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
                    data.enforceInterface("com.google.android.gms.fitness.internal.ISyncInfoCallback");
                    this.zza((data.readInt() == 0 ? null : ((SyncInfoResult)SyncInfoResult.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.fitness.internal.ISyncInfoCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzmv zzbG(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.ISyncInfoCallback");
            return iInterface0 != null && iInterface0 instanceof zzmv ? ((zzmv)iInterface0) : new com.google.android.gms.internal.zzmv.zza.zza(iBinder0);
        }
    }

    void zza(SyncInfoResult arg1) throws RemoteException;
}

