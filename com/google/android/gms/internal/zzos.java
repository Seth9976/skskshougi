package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.connection.AppMetadata;

public interface zzos extends IInterface {
    public static abstract class zza extends Binder implements zzos {
        static class com.google.android.gms.internal.zzos.zza.zza implements zzos {
            private IBinder zznF;

            com.google.android.gms.internal.zzos.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zzE(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeLong(v);
                    this.zznF.transact(0x3F6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zzN(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeLong(v);
                    this.zznF.transact(1002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zzO(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeLong(v);
                    this.zznF.transact(1006, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zzP(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeLong(v);
                    this.zznF.transact(0x3F5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public String zzQ(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeLong(v);
                    this.zznF.transact(0x3F7, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zza(zzor zzor0, int v, long v1, long v2) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeStrongBinder((zzor0 == null ? null : zzor0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeLong(v1);
                    parcel0.writeLong(v2);
                    this.zznF.transact(1005, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zza(zzor zzor0, String s, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeStrongBinder((zzor0 == null ? null : zzor0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeLong(v);
                    this.zznF.transact(1009, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zza(zzor zzor0, String s, long v, long v1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeStrongBinder((zzor0 == null ? null : zzor0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeLong(v);
                    parcel0.writeLong(v1);
                    this.zznF.transact(1003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zza(zzor zzor0, String s, AppMetadata appMetadata0, long v, long v1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeStrongBinder((zzor0 == null ? null : zzor0.asBinder()));
                    parcel0.writeString(s);
                    if(appMetadata0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        appMetadata0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeLong(v);
                    parcel0.writeLong(v1);
                    this.zznF.transact(1001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zza(zzor zzor0, String s, String s1, byte[] arr_b, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeStrongBinder((zzor0 == null ? null : zzor0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeLong(v);
                    this.zznF.transact(1007, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zza(zzor zzor0, String s, byte[] arr_b, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeStrongBinder((zzor0 == null ? null : zzor0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeLong(v);
                    this.zznF.transact(0x3F0, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zza(String[] arr_s, byte[] arr_b, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeStringArray(arr_s);
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeLong(v);
                    this.zznF.transact(1010, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zzb(String[] arr_s, byte[] arr_b, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeStringArray(arr_s);
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeLong(v);
                    this.zznF.transact(0x3F3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zzf(String s, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeString(s);
                    parcel0.writeLong(v);
                    this.zznF.transact(1004, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public void zzg(String s, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    parcel0.writeString(s);
                    parcel0.writeLong(v);
                    this.zznF.transact(0x3F4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzos
            public String zzwS() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zznF.transact(0x3F8, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
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
                case 1001: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zza(com.google.android.gms.internal.zzor.zza.zzdb(data.readStrongBinder()), data.readString(), (data.readInt() == 0 ? null : ((AppMetadata)AppMetadata.CREATOR.createFromParcel(data))), data.readLong(), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 1002: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zzN(data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 1003: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zza(com.google.android.gms.internal.zzor.zza.zzdb(data.readStrongBinder()), data.readString(), data.readLong(), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 1004: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zzf(data.readString(), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 1005: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zza(com.google.android.gms.internal.zzor.zza.zzdb(data.readStrongBinder()), data.readInt(), data.readLong(), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 1006: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zzO(data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 1007: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zza(com.google.android.gms.internal.zzor.zza.zzdb(data.readStrongBinder()), data.readString(), data.readString(), data.createByteArray(), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 0x3F0: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zza(com.google.android.gms.internal.zzor.zza.zzdb(data.readStrongBinder()), data.readString(), data.createByteArray(), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 1009: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zza(com.google.android.gms.internal.zzor.zza.zzdb(data.readStrongBinder()), data.readString(), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 1010: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zza(data.createStringArray(), data.createByteArray(), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 0x3F3: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zzb(data.createStringArray(), data.createByteArray(), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 0x3F4: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zzg(data.readString(), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 0x3F5: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zzP(data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 0x3F6: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    this.zzE(data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 0x3F7: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    String s = this.zzQ(data.readLong());
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 0x3F8: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    String s1 = this.zzwS();
                    reply.writeNoException();
                    reply.writeString(s1);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzos zzdc(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            return iInterface0 != null && iInterface0 instanceof zzos ? ((zzos)iInterface0) : new com.google.android.gms.internal.zzos.zza.zza(iBinder0);
        }
    }

    void zzE(long arg1) throws RemoteException;

    void zzN(long arg1) throws RemoteException;

    void zzO(long arg1) throws RemoteException;

    void zzP(long arg1) throws RemoteException;

    String zzQ(long arg1) throws RemoteException;

    void zza(zzor arg1, int arg2, long arg3, long arg4) throws RemoteException;

    void zza(zzor arg1, String arg2, long arg3) throws RemoteException;

    void zza(zzor arg1, String arg2, long arg3, long arg4) throws RemoteException;

    void zza(zzor arg1, String arg2, AppMetadata arg3, long arg4, long arg5) throws RemoteException;

    void zza(zzor arg1, String arg2, String arg3, byte[] arg4, long arg5) throws RemoteException;

    void zza(zzor arg1, String arg2, byte[] arg3, long arg4) throws RemoteException;

    void zza(String[] arg1, byte[] arg2, long arg3) throws RemoteException;

    void zzb(String[] arg1, byte[] arg2, long arg3) throws RemoteException;

    void zzf(String arg1, long arg2) throws RemoteException;

    void zzg(String arg1, long arg2) throws RemoteException;

    String zzwS() throws RemoteException;
}

