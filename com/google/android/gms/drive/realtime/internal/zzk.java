package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public interface zzk extends IInterface {
    public static abstract class zza extends Binder implements zzk {
        static class com.google.android.gms.drive.realtime.internal.zzk.zza.zza implements zzk {
            private IBinder zznF;

            com.google.android.gms.drive.realtime.internal.zzk.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.drive.realtime.internal.zzk
            public void zza(ParcelableIndexReference parcelableIndexReference0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if(parcelableIndexReference0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        parcelableIndexReference0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.realtime.internal.zzk
            public void zzt(Status status0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
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

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            ParcelableIndexReference parcelableIndexReference0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if(data.readInt() != 0) {
                        parcelableIndexReference0 = (ParcelableIndexReference)ParcelableIndexReference.CREATOR.createFromParcel(data);
                    }
                    this.zza(parcelableIndexReference0);
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if(data.readInt() != 0) {
                        parcelableIndexReference0 = (Status)Status.CREATOR.createFromParcel(data);
                    }
                    this.zzt(((Status)parcelableIndexReference0));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzk zzba(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
            return iInterface0 != null && iInterface0 instanceof zzk ? ((zzk)iInterface0) : new com.google.android.gms.drive.realtime.internal.zzk.zza.zza(iBinder0);
        }
    }

    void zza(ParcelableIndexReference arg1) throws RemoteException;

    void zzt(Status arg1) throws RemoteException;
}

