package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;

public interface zzph extends IInterface {
    public static abstract class zza extends Binder implements zzph {
        static class com.google.android.gms.internal.zzph.zza.zza implements zzph {
            private IBinder zznF;

            com.google.android.gms.internal.zzph.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzph
            public void zza(Status status0, AttestationData attestationData0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    if(attestationData0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        attestationData0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzph
            public void zzdZ(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    parcel0.writeString(s);
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    this.zza((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((AttestationData)AttestationData.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    this.zzdZ(data.readString());
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzph zzdw(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzph ? ((zzph)iInterface0) : new com.google.android.gms.internal.zzph.zza.zza(iBinder0);
        }
    }

    void zza(Status arg1, AttestationData arg2) throws RemoteException;

    void zzdZ(String arg1) throws RemoteException;
}

