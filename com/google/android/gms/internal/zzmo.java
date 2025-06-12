package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;

public interface zzmo extends IInterface {
    public static abstract class zza extends Binder implements zzmo {
        static class com.google.android.gms.internal.zzmo.zza.zza implements zzmo {
            private IBinder zznF;

            com.google.android.gms.internal.zzmo.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzmo
            public void zza(SessionInsertRequest sessionInsertRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if(sessionInsertRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        sessionInsertRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmo
            public void zza(SessionReadRequest sessionReadRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if(sessionReadRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        sessionReadRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmo
            public void zza(SessionRegistrationRequest sessionRegistrationRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if(sessionRegistrationRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        sessionRegistrationRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmo
            public void zza(SessionStartRequest sessionStartRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if(sessionStartRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        sessionStartRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmo
            public void zza(SessionStopRequest sessionStopRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if(sessionStopRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        sessionStopRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmo
            public void zza(SessionUnregistrationRequest sessionUnregistrationRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if(sessionUnregistrationRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        sessionUnregistrationRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            SessionStartRequest sessionStartRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if(data.readInt() != 0) {
                        sessionStartRequest0 = (SessionStartRequest)SessionStartRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(sessionStartRequest0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if(data.readInt() != 0) {
                        sessionStartRequest0 = (SessionStopRequest)SessionStopRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((SessionStopRequest)sessionStartRequest0));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if(data.readInt() != 0) {
                        sessionStartRequest0 = (SessionInsertRequest)SessionInsertRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((SessionInsertRequest)sessionStartRequest0));
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if(data.readInt() != 0) {
                        sessionStartRequest0 = (SessionReadRequest)SessionReadRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((SessionReadRequest)sessionStartRequest0));
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if(data.readInt() != 0) {
                        sessionStartRequest0 = (SessionRegistrationRequest)SessionRegistrationRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((SessionRegistrationRequest)sessionStartRequest0));
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    if(data.readInt() != 0) {
                        sessionStartRequest0 = (SessionUnregistrationRequest)SessionUnregistrationRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((SessionUnregistrationRequest)sessionStartRequest0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzmo zzbz(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
            return iInterface0 != null && iInterface0 instanceof zzmo ? ((zzmo)iInterface0) : new com.google.android.gms.internal.zzmo.zza.zza(iBinder0);
        }
    }

    void zza(SessionInsertRequest arg1) throws RemoteException;

    void zza(SessionReadRequest arg1) throws RemoteException;

    void zza(SessionRegistrationRequest arg1) throws RemoteException;

    void zza(SessionStartRequest arg1) throws RemoteException;

    void zza(SessionStopRequest arg1) throws RemoteException;

    void zza(SessionUnregistrationRequest arg1) throws RemoteException;
}

