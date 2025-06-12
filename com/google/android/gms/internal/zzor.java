package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.connection.AppMetadata;

public interface zzor extends IInterface {
    public static abstract class zza extends Binder implements zzor {
        static class com.google.android.gms.internal.zzor.zza.zza implements zzor {
            private IBinder zznF;

            com.google.android.gms.internal.zzor.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzor
            public void onConnectionRequest(String remoteEndpointId, String remoteDeviceId, String remoteEndpointName, byte[] payload) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeString(remoteEndpointId);
                    parcel0.writeString(remoteDeviceId);
                    parcel0.writeString(remoteEndpointName);
                    parcel0.writeByteArray(payload);
                    this.zznF.transact(1001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void onDisconnected(String remoteEndpointId) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeString(remoteEndpointId);
                    this.zznF.transact(0x3F0, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void onEndpointFound(String endpointId, String deviceId, String serviceId, String name) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeString(endpointId);
                    parcel0.writeString(deviceId);
                    parcel0.writeString(serviceId);
                    parcel0.writeString(name);
                    this.zznF.transact(1002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void onEndpointLost(String endpointId) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeString(endpointId);
                    this.zznF.transact(1003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void onMessageReceived(String remoteEndpointId, byte[] payload, boolean isReliable) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeString(remoteEndpointId);
                    parcel0.writeByteArray(payload);
                    if(isReliable) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(1007, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void zza(String s, int v, byte[] arr_b) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeByteArray(arr_b);
                    this.zznF.transact(1006, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void zza(String s, String s1, String s2, String s3, AppMetadata appMetadata0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeString(s2);
                    parcel0.writeString(s3);
                    if(appMetadata0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        appMetadata0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1004, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void zzdP(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeString(s);
                    this.zznF.transact(1005, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void zzhX(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeInt(v);
                    this.zznF.transact(1010, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void zzhY(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeInt(v);
                    this.zznF.transact(0x3F3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void zzhZ(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeInt(v);
                    this.zznF.transact(0x3F4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void zzia(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeInt(v);
                    this.zznF.transact(0x3F5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void zzib(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeInt(v);
                    this.zznF.transact(0x3F6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzor
            public void zzj(int v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeString(s);
                    this.zznF.transact(1009, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1001: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.onConnectionRequest(data.readString(), data.readString(), data.readString(), data.createByteArray());
                    reply.writeNoException();
                    return true;
                }
                case 1002: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.onEndpointFound(data.readString(), data.readString(), data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 1003: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.onEndpointLost(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 1004: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.zza(data.readString(), data.readString(), data.readString(), data.readString(), (data.readInt() == 0 ? null : ((AppMetadata)AppMetadata.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 1005: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.zzdP(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 1006: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.zza(data.readString(), data.readInt(), data.createByteArray());
                    reply.writeNoException();
                    return true;
                }
                case 1007: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.onMessageReceived(data.readString(), data.createByteArray(), data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 0x3F0: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.onDisconnected(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 1009: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.zzj(data.readInt(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 1010: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.zzhX(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x3F3: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.zzhY(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x3F4: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.zzhZ(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x3F5: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.zzia(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x3F6: {
                    data.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    this.zzib(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzor zzdb(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzor ? ((zzor)iInterface0) : new com.google.android.gms.internal.zzor.zza.zza(iBinder0);
        }
    }

    void onConnectionRequest(String arg1, String arg2, String arg3, byte[] arg4) throws RemoteException;

    void onDisconnected(String arg1) throws RemoteException;

    void onEndpointFound(String arg1, String arg2, String arg3, String arg4) throws RemoteException;

    void onEndpointLost(String arg1) throws RemoteException;

    void onMessageReceived(String arg1, byte[] arg2, boolean arg3) throws RemoteException;

    void zza(String arg1, int arg2, byte[] arg3) throws RemoteException;

    void zza(String arg1, String arg2, String arg3, String arg4, AppMetadata arg5) throws RemoteException;

    void zzdP(String arg1) throws RemoteException;

    void zzhX(int arg1) throws RemoteException;

    void zzhY(int arg1) throws RemoteException;

    void zzhZ(int arg1) throws RemoteException;

    void zzia(int arg1) throws RemoteException;

    void zzib(int arg1) throws RemoteException;

    void zzj(int arg1, String arg2) throws RemoteException;
}

