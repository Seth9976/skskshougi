package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Request;
import com.google.android.gms.appdatasearch.UsageInfo;

public interface zziq extends IInterface {
    public static abstract class zza extends Binder implements zziq {
        static class com.google.android.gms.internal.zziq.zza.zza implements zziq {
            private IBinder zznF;

            com.google.android.gms.internal.zziq.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zziq
            public void zza(Request getRecentContextCall$Request0, zzir zzir0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    if(getRecentContextCall$Request0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getRecentContextCall$Request0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzir0 == null ? null : zzir0.asBinder()));
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zziq
            public void zza(zzir zzir0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    parcel0.writeStrongBinder((zzir0 == null ? null : zzir0.asBinder()));
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zziq
            public void zza(zzir zzir0, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    parcel0.writeStrongBinder((zzir0 == null ? null : zzir0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zziq
            public void zza(zzir zzir0, String s, UsageInfo[] arr_usageInfo) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    parcel0.writeStrongBinder((zzir0 == null ? null : zzir0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeTypedArray(arr_usageInfo, 0);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zziq
            public void zza(zzir zzir0, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    parcel0.writeStrongBinder((zzir0 == null ? null : zzir0.asBinder()));
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zziq
            public void zzb(zzir zzir0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    parcel0.writeStrongBinder((zzir0 == null ? null : zzir0.asBinder()));
                    this.zznF.transact(3, parcel0, parcel1, 0);
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
                    data.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    this.zza(com.google.android.gms.internal.zzir.zza.zzae(data.readStrongBinder()), data.readString(), ((UsageInfo[])data.createTypedArray(UsageInfo.CREATOR)));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    this.zza(com.google.android.gms.internal.zzir.zza.zzae(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    this.zzb(com.google.android.gms.internal.zzir.zza.zzae(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    this.zza(com.google.android.gms.internal.zzir.zza.zzae(data.readStrongBinder()), data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    this.zza((data.readInt() == 0 ? null : Request.CREATOR.zzv(data)), com.google.android.gms.internal.zzir.zza.zzae(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    this.zza(com.google.android.gms.internal.zzir.zza.zzae(data.readStrongBinder()), data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zziq zzad(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            return iInterface0 != null && iInterface0 instanceof zziq ? ((zziq)iInterface0) : new com.google.android.gms.internal.zziq.zza.zza(iBinder0);
        }
    }

    void zza(Request arg1, zzir arg2) throws RemoteException;

    void zza(zzir arg1) throws RemoteException;

    void zza(zzir arg1, String arg2, String arg3) throws RemoteException;

    void zza(zzir arg1, String arg2, UsageInfo[] arg3) throws RemoteException;

    void zza(zzir arg1, boolean arg2) throws RemoteException;

    void zzb(zzir arg1) throws RemoteException;
}

