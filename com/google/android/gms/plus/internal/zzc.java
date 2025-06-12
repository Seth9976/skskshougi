package com.google.android.gms.plus.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

public interface zzc extends IInterface {
    public static abstract class zza extends Binder implements zzc {
        static class com.google.android.gms.plus.internal.zzc.zza.zza implements zzc {
            private IBinder zznF;

            com.google.android.gms.plus.internal.zzc.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.plus.internal.zzc
            public zzd zza(zzd zzd0, int v, int v1, String s, int v2) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeString(s);
                    parcel0.writeInt(v2);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzc
            public zzd zza(zzd zzd0, int v, int v1, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    zzd zzd0 = this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), data.readInt(), data.readInt(), data.readString(), data.readInt());
                    reply.writeNoException();
                    reply.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    zzd zzd1 = this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), data.readInt(), data.readInt(), data.readString(), data.readString());
                    reply.writeNoException();
                    if(zzd1 != null) {
                        iBinder0 = zzd1.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzc zzds(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            return iInterface0 != null && iInterface0 instanceof zzc ? ((zzc)iInterface0) : new com.google.android.gms.plus.internal.zzc.zza.zza(iBinder0);
        }
    }

    zzd zza(zzd arg1, int arg2, int arg3, String arg4, int arg5) throws RemoteException;

    zzd zza(zzd arg1, int arg2, int arg3, String arg4, String arg5) throws RemoteException;
}

