package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzcu extends IInterface {
    public static abstract class zza extends Binder implements zzcu {
        static class com.google.android.gms.internal.zzcu.zza.zza implements zzcu {
            private IBinder zznF;

            com.google.android.gms.internal.zzcu.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzcu
            public void zza(zzco zzco0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    parcel0.writeStrongBinder((zzco0 == null ? null : zzco0.asBinder()));
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
            this.attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    this.zza(com.google.android.gms.internal.zzco.zza.zzw(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzcu zzz(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
            return iInterface0 != null && iInterface0 instanceof zzcu ? ((zzcu)iInterface0) : new com.google.android.gms.internal.zzcu.zza.zza(iBinder0);
        }
    }

    void zza(zzco arg1) throws RemoteException;
}

