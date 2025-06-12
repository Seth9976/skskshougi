package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

public interface zzom extends IInterface {
    public static abstract class zza extends Binder implements zzom {
        static class com.google.android.gms.internal.zzom.zza.zza implements zzom {
            private IBinder zznF;

            com.google.android.gms.internal.zzom.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzom
            public String getToken() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzom
            public void zza(ConnectRequest connectRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(connectRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        connectRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzom
            public void zza(ContinueConnectRequest continueConnectRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(continueConnectRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        continueConnectRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzom
            public void zza(DisableTargetRequest disableTargetRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(disableTargetRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        disableTargetRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzom
            public void zza(DisconnectRequest disconnectRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(disconnectRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        disconnectRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzom
            public void zza(EnableTargetRequest enableTargetRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(enableTargetRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        enableTargetRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzom
            public void zza(SendDataRequest sendDataRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(sendDataRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        sendDataRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(7, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzom
            public void zza(StartScanRequest startScanRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(startScanRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        startScanRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzom
            public void zza(StopScanRequest stopScanRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(stopScanRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        stopScanRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            StartScanRequest startScanRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(data.readInt() != 0) {
                        startScanRequest0 = StartScanRequest.CREATOR.zzfl(data);
                    }
                    this.zza(startScanRequest0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(data.readInt() != 0) {
                        startScanRequest0 = StopScanRequest.CREATOR.zzfm(data);
                    }
                    this.zza(((StopScanRequest)startScanRequest0));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(data.readInt() != 0) {
                        startScanRequest0 = EnableTargetRequest.CREATOR.zzfj(data);
                    }
                    this.zza(((EnableTargetRequest)startScanRequest0));
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(data.readInt() != 0) {
                        startScanRequest0 = DisableTargetRequest.CREATOR.zzfh(data);
                    }
                    this.zza(((DisableTargetRequest)startScanRequest0));
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(data.readInt() != 0) {
                        startScanRequest0 = ConnectRequest.CREATOR.zzff(data);
                    }
                    this.zza(((ConnectRequest)startScanRequest0));
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(data.readInt() != 0) {
                        startScanRequest0 = DisconnectRequest.CREATOR.zzfi(data);
                    }
                    this.zza(((DisconnectRequest)startScanRequest0));
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(data.readInt() != 0) {
                        startScanRequest0 = SendDataRequest.CREATOR.zzfk(data);
                    }
                    this.zza(((SendDataRequest)startScanRequest0));
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    if(data.readInt() != 0) {
                        startScanRequest0 = ContinueConnectRequest.CREATOR.zzfg(data);
                    }
                    this.zza(((ContinueConnectRequest)startScanRequest0));
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    String s = this.getToken();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzom zzcY(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
            return iInterface0 != null && iInterface0 instanceof zzom ? ((zzom)iInterface0) : new com.google.android.gms.internal.zzom.zza.zza(iBinder0);
        }
    }

    String getToken() throws RemoteException;

    void zza(ConnectRequest arg1) throws RemoteException;

    void zza(ContinueConnectRequest arg1) throws RemoteException;

    void zza(DisableTargetRequest arg1) throws RemoteException;

    void zza(DisconnectRequest arg1) throws RemoteException;

    void zza(EnableTargetRequest arg1) throws RemoteException;

    void zza(SendDataRequest arg1) throws RemoteException;

    void zza(StartScanRequest arg1) throws RemoteException;

    void zza(StopScanRequest arg1) throws RemoteException;
}

