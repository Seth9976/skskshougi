package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public interface zzjl extends IInterface {
    public static abstract class zza extends Binder implements zzjl {
        static class com.google.android.gms.internal.zzjl.zza.zza implements zzjl {
            private IBinder zznF;

            com.google.android.gms.internal.zzjl.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzjl
            public void zza(zzjk zzjk0, ProxyRequest proxyRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
                    parcel0.writeStrongBinder((zzjk0 == null ? null : zzjk0.asBinder()));
                    if(proxyRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        proxyRequest0.writeToParcel(parcel0, 0);
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

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
                    this.zza(com.google.android.gms.internal.zzjk.zza.zzas(data.readStrongBinder()), (data.readInt() == 0 ? null : ((ProxyRequest)ProxyRequest.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.auth.api.internal.IAuthService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzjl zzat(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
            return iInterface0 != null && iInterface0 instanceof zzjl ? ((zzjl)iInterface0) : new com.google.android.gms.internal.zzjl.zza.zza(iBinder0);
        }
    }

    void zza(zzjk arg1, ProxyRequest arg2) throws RemoteException;
}

