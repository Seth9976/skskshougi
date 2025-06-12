package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

public interface zzj extends IInterface {
    public static abstract class zza extends Binder implements zzj {
        static class com.google.android.gms.drive.realtime.internal.zzj.zza.zza implements zzj {
            private IBinder zznF;

            com.google.android.gms.drive.realtime.internal.zzj.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.drive.realtime.internal.zzj
            public void zza(ParcelableEventList parcelableEventList0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if(parcelableEventList0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        parcelableEventList0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.realtime.internal.zzj
            public void zzt(Status status0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IEventCallback");
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
            ParcelableEventList parcelableEventList0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if(data.readInt() != 0) {
                        parcelableEventList0 = (ParcelableEventList)ParcelableEventList.CREATOR.createFromParcel(data);
                    }
                    this.zza(parcelableEventList0);
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    if(data.readInt() != 0) {
                        parcelableEventList0 = (Status)Status.CREATOR.createFromParcel(data);
                    }
                    this.zzt(((Status)parcelableEventList0));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.drive.realtime.internal.IEventCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzj zzaZ(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IEventCallback");
            return iInterface0 != null && iInterface0 instanceof zzj ? ((zzj)iInterface0) : new com.google.android.gms.drive.realtime.internal.zzj.zza.zza(iBinder0);
        }
    }

    void zza(ParcelableEventList arg1) throws RemoteException;

    void zzt(Status arg1) throws RemoteException;
}

