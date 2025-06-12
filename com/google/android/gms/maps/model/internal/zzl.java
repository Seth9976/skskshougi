package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

public interface zzl extends IInterface {
    public static abstract class zza extends Binder implements zzl {
        static class com.google.android.gms.maps.model.internal.zzl.zza.zza implements zzl {
            private IBinder zznF;

            com.google.android.gms.maps.model.internal.zzl.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.model.internal.zzl
            public Tile getTile(int x, int y, int zoom) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    parcel0.writeInt(x);
                    parcel0.writeInt(y);
                    parcel0.writeInt(zoom);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : Tile.CREATOR.zzeX(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    Tile tile0 = this.getTile(data.readInt(), data.readInt(), data.readInt());
                    reply.writeNoException();
                    if(tile0 != null) {
                        reply.writeInt(1);
                        tile0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzl zzcT(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            return iInterface0 != null && iInterface0 instanceof zzl ? ((zzl)iInterface0) : new com.google.android.gms.maps.model.internal.zzl.zza.zza(iBinder0);
        }
    }

    Tile getTile(int arg1, int arg2, int arg3) throws RemoteException;
}

