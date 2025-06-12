package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzke extends IInterface {
    public static abstract class zza extends Binder implements zzke {
        static class com.google.android.gms.internal.zzke.zza.zza implements zzke {
            private IBinder zznF;

            com.google.android.gms.internal.zzke.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzke
            public void zzaR(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
                    parcel0.writeInt(v);
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
                    this.zzaR(data.readInt());
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzke zzaB(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzke ? ((zzke)iInterface0) : new com.google.android.gms.internal.zzke.zza.zza(iBinder0);
        }
    }

    void zzaR(int arg1) throws RemoteException;
}

