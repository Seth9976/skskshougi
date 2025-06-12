package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzou extends IInterface {
    public static abstract class zza extends Binder implements zzou {
        static class com.google.android.gms.internal.zzou.zza.zza implements zzou {
            private IBinder zznF;

            com.google.android.gms.internal.zzou.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzou
            public void zza(zzot zzot0, Uri uri0, Bundle bundle0, boolean z) throws RemoteException {
                IBinder iBinder0 = null;
                int v = 1;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
                    if(zzot0 != null) {
                        iBinder0 = zzot0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(!z) {
                        v = 0;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaService");
                    this.zza(com.google.android.gms.internal.zzot.zza.zzdm(data.readStrongBinder()), (data.readInt() == 0 ? null : ((Uri)Uri.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), data.readInt() != 0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.panorama.internal.IPanoramaService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzou zzdn(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaService");
            return iInterface0 != null && iInterface0 instanceof zzou ? ((zzou)iInterface0) : new com.google.android.gms.internal.zzou.zza.zza(iBinder0);
        }
    }

    void zza(zzot arg1, Uri arg2, Bundle arg3, boolean arg4) throws RemoteException;
}

