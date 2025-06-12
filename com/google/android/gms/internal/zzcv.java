package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzcv extends IInterface {
    public static abstract class zza extends Binder implements zzcv {
        static class com.google.android.gms.internal.zzcv.zza.zza implements zzcv {
            private IBinder zznF;

            com.google.android.gms.internal.zzcv.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzcv
            public void zza(zzcq zzcq0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    parcel0.writeStrongBinder((zzcq0 == null ? null : zzcq0.asBinder()));
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    this.zza(com.google.android.gms.internal.zzcq.zza.zzx(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzcv zzA(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
            return iInterface0 != null && iInterface0 instanceof zzcv ? ((zzcv)iInterface0) : new com.google.android.gms.internal.zzcv.zza.zza(iBinder0);
        }
    }

    void zza(zzcq arg1) throws RemoteException;
}

