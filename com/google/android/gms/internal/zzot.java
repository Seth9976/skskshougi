package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzot extends IInterface {
    public static abstract class zza extends Binder implements zzot {
        static class com.google.android.gms.internal.zzot.zza.zza implements zzot {
            private IBinder zznF;

            com.google.android.gms.internal.zzot.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzot
            public void zza(int v, Bundle bundle0, int v1, Intent intent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(v1);
                    if(intent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        intent0.writeToParcel(parcel0, 0);
                    }
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
            this.attachInterface(this, "com.google.android.gms.panorama.internal.IPanoramaCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
                    this.zza(data.readInt(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), data.readInt(), (data.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzot zzdm(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzot ? ((zzot)iInterface0) : new com.google.android.gms.internal.zzot.zza.zza(iBinder0);
        }
    }

    void zza(int arg1, Bundle arg2, int arg3, Intent arg4) throws RemoteException;
}

