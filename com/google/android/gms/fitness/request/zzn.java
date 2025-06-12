package com.google.android.gms.fitness.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.data.BleDevice;

public interface zzn extends IInterface {
    public static abstract class zza extends Binder implements zzn {
        static class com.google.android.gms.fitness.request.zzn.zza.zza implements zzn {
            private IBinder zznF;

            com.google.android.gms.fitness.request.zzn.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.fitness.request.zzn
            public void onDeviceFound(BleDevice device) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
                    if(device == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        device.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.fitness.request.zzn
            public void onScanStopped() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.fitness.request.IBleScanCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
                    this.onDeviceFound((data.readInt() == 0 ? null : ((BleDevice)BleDevice.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
                    this.onScanStopped();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.fitness.request.IBleScanCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzn zzbI(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            return iInterface0 != null && iInterface0 instanceof zzn ? ((zzn)iInterface0) : new com.google.android.gms.fitness.request.zzn.zza.zza(iBinder0);
        }
    }

    void onDeviceFound(BleDevice arg1) throws RemoteException;

    void onScanStopped() throws RemoteException;
}

