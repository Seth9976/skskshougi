package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

public interface zzl extends IInterface {
    public static abstract class zza extends Binder implements zzl {
        static class com.google.android.gms.maps.internal.zzl.zza.zza implements zzl {
            private IBinder zznF;

            com.google.android.gms.maps.internal.zzl.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.zzl
            public void onMapLongClick(LatLng point) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                    if(point == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        point.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.maps.internal.IOnMapLongClickListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                    this.onMapLongClick((data.readInt() == 0 ? null : LatLng.CREATOR.zzeP(data)));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzl zzct(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
            return iInterface0 != null && iInterface0 instanceof zzl ? ((zzl)iInterface0) : new com.google.android.gms.maps.internal.zzl.zza.zza(iBinder0);
        }
    }

    void onMapLongClick(LatLng arg1) throws RemoteException;
}

