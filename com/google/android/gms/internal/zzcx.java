package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzcx extends IInterface {
    public static abstract class zza extends Binder implements zzcx {
        static class com.google.android.gms.internal.zzcx.zza.zza implements zzcx {
            private IBinder zznF;

            com.google.android.gms.internal.zzcx.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzcx
            public void zza(zzcs zzcs0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    parcel0.writeStrongBinder((zzcs0 == null ? null : zzcs0.asBinder()));
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
            this.attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    this.zza(com.google.android.gms.internal.zzcs.zza.zzy(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzcx zzC(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
            return iInterface0 != null && iInterface0 instanceof zzcx ? ((zzcx)iInterface0) : new com.google.android.gms.internal.zzcx.zza.zza(iBinder0);
        }
    }

    void zza(zzcs arg1) throws RemoteException;
}

