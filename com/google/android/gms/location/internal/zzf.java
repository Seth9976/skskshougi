package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzf extends IInterface {
    public static abstract class zza extends Binder implements zzf {
        static class com.google.android.gms.location.internal.zzf.zza.zza implements zzf {
            private IBinder zznF;

            com.google.android.gms.location.internal.zzf.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.location.internal.zzf
            public void zza(int v, PendingIntent pendingIntent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    parcel0.writeInt(v);
                    if(pendingIntent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        pendingIntent0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzf
            public void zza(int v, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.internal.zzf
            public void zzb(int v, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeStringArray(arr_s);
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
            this.attachInterface(this, "com.google.android.gms.location.internal.IGeofencerCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    this.zza(data.readInt(), data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    this.zzb(data.readInt(), data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    this.zza(data.readInt(), (data.readInt() == 0 ? null : ((PendingIntent)PendingIntent.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzf zzbV(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzf ? ((zzf)iInterface0) : new com.google.android.gms.location.internal.zzf.zza.zza(iBinder0);
        }
    }

    void zza(int arg1, PendingIntent arg2) throws RemoteException;

    void zza(int arg1, String[] arg2) throws RemoteException;

    void zzb(int arg1, String[] arg2) throws RemoteException;
}

