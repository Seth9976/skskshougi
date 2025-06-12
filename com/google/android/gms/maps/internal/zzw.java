package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

public interface zzw extends IInterface {
    public static abstract class zza extends Binder implements zzw {
        static class com.google.android.gms.maps.internal.zzw.zza.zza implements zzw {
            private IBinder zznF;

            com.google.android.gms.maps.internal.zzw.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.zzw
            public void onSnapshotReady(Bitmap snapshot) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    if(snapshot == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        snapshot.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.zzw
            public void zzp(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
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
            this.attachInterface(this, "com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    this.onSnapshotReady((data.readInt() == 0 ? null : ((Bitmap)Bitmap.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    this.zzp(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzw zzcF(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            return iInterface0 != null && iInterface0 instanceof zzw ? ((zzw)iInterface0) : new com.google.android.gms.maps.internal.zzw.zza.zza(iBinder0);
        }
    }

    void onSnapshotReady(Bitmap arg1) throws RemoteException;

    void zzp(zzd arg1) throws RemoteException;
}

