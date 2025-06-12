package com.google.android.gms.analytics.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

public interface zzac extends IInterface {
    public static abstract class zza extends Binder implements zzac {
        static class com.google.android.gms.analytics.internal.zzac.zza.zza implements zzac {
            private IBinder zznF;

            com.google.android.gms.analytics.internal.zzac.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.analytics.internal.zzac
            public String getVersion() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.analytics.internal.zzac
            public void zza(Map map0, long v, String s, List list0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    parcel0.writeMap(map0);
                    parcel0.writeLong(v);
                    parcel0.writeString(s);
                    parcel0.writeTypedList(list0);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.analytics.internal.zzac
            public void zzhG() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.zznF.transact(2, parcel0, parcel1, 0);
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
                    data.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.zza(data.readHashMap(this.getClass().getClassLoader()), data.readLong(), data.readString(), data.createTypedArrayList(Command.CREATOR));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.zzhG();
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    String s = this.getVersion();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.analytics.internal.IAnalyticsService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzac zzac(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
            return iInterface0 != null && iInterface0 instanceof zzac ? ((zzac)iInterface0) : new com.google.android.gms.analytics.internal.zzac.zza.zza(iBinder0);
        }
    }

    String getVersion() throws RemoteException;

    void zza(Map arg1, long arg2, String arg3, List arg4) throws RemoteException;

    void zzhG() throws RemoteException;
}

