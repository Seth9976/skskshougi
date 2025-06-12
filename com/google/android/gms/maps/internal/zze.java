package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzi;

public interface zze extends IInterface {
    public static abstract class zza extends Binder implements zze {
        static class com.google.android.gms.maps.internal.zze.zza.zza implements zze {
            private IBinder zznF;

            com.google.android.gms.maps.internal.zze.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.zze
            public Bitmap zza(zzi zzi0, int v, int v1) throws RemoteException {
                Bitmap bitmap0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowRenderer");
                    parcel0.writeStrongBinder((zzi0 == null ? null : zzi0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        bitmap0 = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel1);
                    }
                    return bitmap0;
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
                    data.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowRenderer");
                    Bitmap bitmap0 = this.zza(com.google.android.gms.maps.model.internal.zzi.zza.zzcP(data.readStrongBinder()), data.readInt(), data.readInt());
                    reply.writeNoException();
                    if(bitmap0 != null) {
                        reply.writeInt(1);
                        bitmap0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IInfoWindowRenderer");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zze zzcj(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowRenderer");
            return iInterface0 != null && iInterface0 instanceof zze ? ((zze)iInterface0) : new com.google.android.gms.maps.internal.zze.zza.zza(iBinder0);
        }
    }

    Bitmap zza(zzi arg1, int arg2, int arg3) throws RemoteException;
}

