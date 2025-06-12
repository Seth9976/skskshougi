package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

public interface zzey extends IInterface {
    public static abstract class zza extends Binder implements zzey {
        static class com.google.android.gms.internal.zzey.zza.zza implements zzey {
            private IBinder zznF;

            com.google.android.gms.internal.zzey.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzey
            public IBinder zzc(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readStrongBinder();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    IBinder iBinder0 = this.zzc(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzey zzJ(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
            return iInterface0 != null && iInterface0 instanceof zzey ? ((zzey)iInterface0) : new com.google.android.gms.internal.zzey.zza.zza(iBinder0);
        }
    }

    IBinder zzc(zzd arg1) throws RemoteException;
}

