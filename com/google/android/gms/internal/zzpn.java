package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzpn extends IInterface {
    public static abstract class zza extends Binder implements zzpn {
        static class com.google.android.gms.internal.zzpn.zza.zza implements zzpn {
            private IBinder zznF;

            com.google.android.gms.internal.zzpn.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzpn
            public void zza(zzpm zzpm0, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthService");
                    parcel0.writeStrongBinder((zzpm0 == null ? null : zzpm0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
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
                    data.enforceInterface("com.google.android.gms.search.internal.ISearchAuthService");
                    this.zza(com.google.android.gms.internal.zzpm.zza.zzdz(data.readStrongBinder()), data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.search.internal.ISearchAuthService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzpn zzdA(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthService");
            return iInterface0 != null && iInterface0 instanceof zzpn ? ((zzpn)iInterface0) : new com.google.android.gms.internal.zzpn.zza.zza(iBinder0);
        }
    }

    void zza(zzpm arg1, String arg2, String arg3) throws RemoteException;
}

