package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzd extends IInterface {
    public static abstract class zza extends Binder implements zzd {
        static class com.google.android.gms.drive.realtime.internal.zzd.zza.zza implements zzd {
            private IBinder zznF;

            com.google.android.gms.drive.realtime.internal.zzd.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.drive.realtime.internal.zzd
            public void zza(ParcelableCollaborator parcelableCollaborator0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    if(parcelableCollaborator0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        parcelableCollaborator0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.realtime.internal.zzd
            public void zzb(ParcelableCollaborator parcelableCollaborator0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    if(parcelableCollaborator0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        parcelableCollaborator0.writeToParcel(parcel0, 0);
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
            ParcelableCollaborator parcelableCollaborator0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    if(data.readInt() != 0) {
                        parcelableCollaborator0 = (ParcelableCollaborator)ParcelableCollaborator.CREATOR.createFromParcel(data);
                    }
                    this.zza(parcelableCollaborator0);
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    if(data.readInt() != 0) {
                        parcelableCollaborator0 = (ParcelableCollaborator)ParcelableCollaborator.CREATOR.createFromParcel(data);
                    }
                    this.zzb(parcelableCollaborator0);
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzd zzaT(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
            return iInterface0 != null && iInterface0 instanceof zzd ? ((zzd)iInterface0) : new com.google.android.gms.drive.realtime.internal.zzd.zza.zza(iBinder0);
        }
    }

    void zza(ParcelableCollaborator arg1) throws RemoteException;

    void zzb(ParcelableCollaborator arg1) throws RemoteException;
}

