package com.google.android.gms.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzd extends IInterface {
    public static abstract class zza extends Binder implements zzd {
        static class com.google.android.gms.dynamic.zzd.zza.zza implements zzd {
            private IBinder zznF;

            com.google.android.gms.dynamic.zzd.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if(code != 0x5F4E5446) {
                return super.onTransact(code, data, reply, flags);
            }
            reply.writeString("com.google.android.gms.dynamic.IObjectWrapper");
            return true;
        }

        public static zzd zzbg(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterface0 != null && iInterface0 instanceof zzd ? ((zzd)iInterface0) : new com.google.android.gms.dynamic.zzd.zza.zza(iBinder0);
        }
    }

}

