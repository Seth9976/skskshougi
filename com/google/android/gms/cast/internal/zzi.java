package com.google.android.gms.cast.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;

public interface zzi extends IInterface {
    public static abstract class zza extends Binder implements zzi {
        static class com.google.android.gms.cast.internal.zzi.zza.zza implements zzi {
            private IBinder zznF;

            com.google.android.gms.cast.internal.zzi.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void disconnect() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void zza(double f, double f1, boolean z) throws RemoteException {
                int v = 1;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    parcel0.writeDouble(f);
                    parcel0.writeDouble(f1);
                    if(!z) {
                        v = 0;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(7, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void zza(String s, LaunchOptions launchOptions0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    parcel0.writeString(s);
                    if(launchOptions0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        launchOptions0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(13, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void zza(String s, String s1, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeLong(v);
                    this.zznF.transact(9, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void zza(String s, byte[] arr_b, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    parcel0.writeString(s);
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeLong(v);
                    this.zznF.transact(10, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void zza(boolean z, double f, boolean z1) throws RemoteException {
                int v = 1;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    parcel0.writeInt((z ? 1 : 0));
                    parcel0.writeDouble(f);
                    if(!z1) {
                        v = 0;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(8, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void zzbG(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    parcel0.writeString(s);
                    this.zznF.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void zzbH(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    parcel0.writeString(s);
                    this.zznF.transact(11, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void zzbI(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    parcel0.writeString(s);
                    this.zznF.transact(12, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void zzf(String s, boolean z) throws RemoteException {
                int v = 1;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    parcel0.writeString(s);
                    if(!z) {
                        v = 0;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void zzlN() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zznF.transact(6, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void zzlY() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.cast.internal.zzi
            public void zzr(String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.cast.internal.ICastDeviceController");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            boolean z = false;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.disconnect();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    String s = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzf(s, z);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zzr(data.readString(), data.readString());
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zzlY();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zzbG(data.readString());
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zzlN();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zza(data.readDouble(), data.readDouble(), data.readInt() != 0);
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    boolean z1 = data.readInt() != 0;
                    double f = data.readDouble();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(z1, f, z);
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zza(data.readString(), data.readString(), data.readLong());
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zza(data.readString(), data.createByteArray(), data.readLong());
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zzbH(data.readString());
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zzbI(data.readString());
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
                    this.zza(data.readString(), (data.readInt() == 0 ? null : ((LaunchOptions)LaunchOptions.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.cast.internal.ICastDeviceController");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzi zzax(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            return iInterface0 != null && iInterface0 instanceof zzi ? ((zzi)iInterface0) : new com.google.android.gms.cast.internal.zzi.zza.zza(iBinder0);
        }
    }

    void disconnect() throws RemoteException;

    void zza(double arg1, double arg2, boolean arg3) throws RemoteException;

    void zza(String arg1, LaunchOptions arg2) throws RemoteException;

    void zza(String arg1, String arg2, long arg3) throws RemoteException;

    void zza(String arg1, byte[] arg2, long arg3) throws RemoteException;

    void zza(boolean arg1, double arg2, boolean arg3) throws RemoteException;

    void zzbG(String arg1) throws RemoteException;

    void zzbH(String arg1) throws RemoteException;

    void zzbI(String arg1) throws RemoteException;

    void zzf(String arg1, boolean arg2) throws RemoteException;

    void zzlN() throws RemoteException;

    void zzlY() throws RemoteException;

    void zzr(String arg1, String arg2) throws RemoteException;
}

