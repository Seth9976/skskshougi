package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzh extends IInterface {
    public static abstract class zza extends Binder implements zzh {
        static class com.google.android.gms.drive.realtime.internal.zzh.zza.zza implements zzh {
            private IBinder zznF;

            com.google.android.gms.drive.realtime.internal.zzh.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.drive.realtime.internal.zzh
            public void zzc(boolean z, boolean z1) throws RemoteException {
                int v = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v = 0;
                    }
                    parcel0.writeInt(v);
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
            boolean z = false;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                    boolean z1 = data.readInt() != 0;
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzc(z1, z);
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzh zzaX(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
            return iInterface0 != null && iInterface0 instanceof zzh ? ((zzh)iInterface0) : new com.google.android.gms.drive.realtime.internal.zzh.zza.zza(iBinder0);
        }
    }

    void zzc(boolean arg1, boolean arg2) throws RemoteException;
}

