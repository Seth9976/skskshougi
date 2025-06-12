package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzjo extends IInterface {
    public static abstract class zza extends Binder implements zzjo {
        static class com.google.android.gms.internal.zzjo.zza.zza implements zzjo {
            private IBinder zznF;

            com.google.android.gms.internal.zzjo.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if(code != 0x5F4E5446) {
                return super.onTransact(code, data, reply, flags);
            }
            reply.writeString("com.google.android.gms.auth.api.signin.internal.ISignInService");
            return true;
        }

        public static zzjo zzau(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
            return iInterface0 != null && iInterface0 instanceof zzjo ? ((zzjo)iInterface0) : new com.google.android.gms.internal.zzjo.zza.zza(iBinder0);
        }
    }

}

