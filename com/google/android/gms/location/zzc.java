package com.google.android.gms.location;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzc extends IInterface {
    public static abstract class zza extends Binder implements zzc {
        static class com.google.android.gms.location.zzc.zza.zza implements zzc {
            private IBinder zznF;

            com.google.android.gms.location.zzc.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.location.zzc
            public void onLocationAvailability(LocationAvailability state) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
                    if(state == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        state.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.location.zzc
            public void onLocationResult(LocationResult result) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
                    if(result == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        result.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.location.ILocationCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            LocationResult locationResult0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.location.ILocationCallback");
                    if(data.readInt() != 0) {
                        locationResult0 = (LocationResult)LocationResult.CREATOR.createFromParcel(data);
                    }
                    this.onLocationResult(locationResult0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.location.ILocationCallback");
                    if(data.readInt() != 0) {
                        locationResult0 = LocationAvailability.CREATOR.createFromParcel(data);
                    }
                    this.onLocationAvailability(((LocationAvailability)locationResult0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.location.ILocationCallback");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzc zzbS(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            return iInterface0 != null && iInterface0 instanceof zzc ? ((zzc)iInterface0) : new com.google.android.gms.location.zzc.zza.zza(iBinder0);
        }
    }

    void onLocationAvailability(LocationAvailability arg1) throws RemoteException;

    void onLocationResult(LocationResult arg1) throws RemoteException;
}

