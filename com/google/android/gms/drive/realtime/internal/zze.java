package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public interface zze extends IInterface {
    public static abstract class zza extends Binder implements zze {
        static class com.google.android.gms.drive.realtime.internal.zze.zza.zza implements zze {
            private IBinder zznF;

            com.google.android.gms.drive.realtime.internal.zze.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.drive.realtime.internal.zze
            public void zza(ParcelableCollaborator[] arr_parcelableCollaborator) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                    parcel0.writeTypedArray(arr_parcelableCollaborator, 0);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.realtime.internal.zze
            public void zzt(Status status0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
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
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                    this.zza(((ParcelableCollaborator[])data.createTypedArray(ParcelableCollaborator.CREATOR)));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                    this.zzt((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zze zzaU(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
            return iInterface0 != null && iInterface0 instanceof zze ? ((zze)iInterface0) : new com.google.android.gms.drive.realtime.internal.zze.zza.zza(iBinder0);
        }
    }

    void zza(ParcelableCollaborator[] arg1) throws RemoteException;

    void zzt(Status arg1) throws RemoteException;
}

