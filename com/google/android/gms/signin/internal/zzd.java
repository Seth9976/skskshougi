package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import java.util.List;

public interface zzd extends IInterface {
    public static abstract class zza extends Binder implements zzd {
        public zza() {
            this.attachInterface(this, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
                    this.zza(data.readString(), data.createTypedArrayList(Scope.CREATOR), com.google.android.gms.signin.internal.zzf.zza.zzdD(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
                    this.zza(data.readString(), data.readString(), com.google.android.gms.signin.internal.zzf.zza.zzdD(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }
    }

    void zza(String arg1, String arg2, zzf arg3) throws RemoteException;

    void zza(String arg1, List arg2, zzf arg3) throws RemoteException;
}

