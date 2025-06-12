package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzq extends IInterface {
    public static abstract class zza extends Binder implements zzq {
        static class com.google.android.gms.common.internal.zzq.zza.zza implements zzq {
            private IBinder zznF;

            com.google.android.gms.common.internal.zzq.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.common.internal.zzq
            public void zzb(ResolveAccountResponse resolveAccountResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    if(resolveAccountResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        resolveAccountResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    this.zzb((data.readInt() == 0 ? null : ((ResolveAccountResponse)ResolveAccountResponse.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzq zzaH(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzq ? ((zzq)iInterface0) : new com.google.android.gms.common.internal.zzq.zza.zza(iBinder0);
        }
    }

    void zzb(ResolveAccountResponse arg1) throws RemoteException;
}

