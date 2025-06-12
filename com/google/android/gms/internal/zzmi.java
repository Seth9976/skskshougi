package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;

public interface zzmi extends IInterface {
    public static abstract class zza extends Binder implements zzmi {
        static class com.google.android.gms.internal.zzmi.zza.zza implements zzmi {
            private IBinder zznF;

            com.google.android.gms.internal.zzmi.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzmi
            public void zza(ClaimBleDeviceRequest claimBleDeviceRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if(claimBleDeviceRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        claimBleDeviceRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmi
            public void zza(ListClaimedBleDevicesRequest listClaimedBleDevicesRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if(listClaimedBleDevicesRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        listClaimedBleDevicesRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmi
            public void zza(StartBleScanRequest startBleScanRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if(startBleScanRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        startBleScanRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmi
            public void zza(StopBleScanRequest stopBleScanRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if(stopBleScanRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        stopBleScanRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmi
            public void zza(UnclaimBleDeviceRequest unclaimBleDeviceRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if(unclaimBleDeviceRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        unclaimBleDeviceRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            StartBleScanRequest startBleScanRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if(data.readInt() != 0) {
                        startBleScanRequest0 = (StartBleScanRequest)StartBleScanRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(startBleScanRequest0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if(data.readInt() != 0) {
                        startBleScanRequest0 = (StopBleScanRequest)StopBleScanRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((StopBleScanRequest)startBleScanRequest0));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if(data.readInt() != 0) {
                        startBleScanRequest0 = (ClaimBleDeviceRequest)ClaimBleDeviceRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((ClaimBleDeviceRequest)startBleScanRequest0));
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if(data.readInt() != 0) {
                        startBleScanRequest0 = (UnclaimBleDeviceRequest)UnclaimBleDeviceRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((UnclaimBleDeviceRequest)startBleScanRequest0));
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    if(data.readInt() != 0) {
                        startBleScanRequest0 = (ListClaimedBleDevicesRequest)ListClaimedBleDevicesRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((ListClaimedBleDevicesRequest)startBleScanRequest0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzmi zzbt(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
            return iInterface0 != null && iInterface0 instanceof zzmi ? ((zzmi)iInterface0) : new com.google.android.gms.internal.zzmi.zza.zza(iBinder0);
        }
    }

    void zza(ClaimBleDeviceRequest arg1) throws RemoteException;

    void zza(ListClaimedBleDevicesRequest arg1) throws RemoteException;

    void zza(StartBleScanRequest arg1) throws RemoteException;

    void zza(StopBleScanRequest arg1) throws RemoteException;

    void zza(UnclaimBleDeviceRequest arg1) throws RemoteException;
}

