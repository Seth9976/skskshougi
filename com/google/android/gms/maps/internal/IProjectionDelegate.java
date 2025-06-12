package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public interface IProjectionDelegate extends IInterface {
    public static abstract class zza extends Binder implements IProjectionDelegate {
        static class com.google.android.gms.maps.internal.IProjectionDelegate.zza.zza implements IProjectionDelegate {
            private IBinder zznF;

            com.google.android.gms.maps.internal.IProjectionDelegate.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.IProjectionDelegate
            public LatLng fromScreenLocation(zzd point) throws RemoteException {
                LatLng latLng0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    parcel0.writeStrongBinder((point == null ? null : point.asBinder()));
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        latLng0 = LatLng.CREATOR.zzeP(parcel1);
                    }
                    return latLng0;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IProjectionDelegate
            public LatLng fromScreenLocation2(Point point) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if(point == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        point.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : LatLng.CREATOR.zzeP(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IProjectionDelegate
            public VisibleRegion getVisibleRegion() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : VisibleRegion.CREATOR.zzeZ(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IProjectionDelegate
            public zzd toScreenLocation(LatLng location) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if(location == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        location.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IProjectionDelegate
            public Point toScreenLocation2(LatLng location) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if(location == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        location.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : Point.CREATOR.zzeK(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            Point point0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    LatLng latLng0 = this.fromScreenLocation(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    if(latLng0 != null) {
                        reply.writeInt(1);
                        latLng0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    zzd zzd0 = this.toScreenLocation((data.readInt() == 0 ? null : LatLng.CREATOR.zzeP(data)));
                    reply.writeNoException();
                    if(zzd0 != null) {
                        point0 = zzd0.asBinder();
                    }
                    reply.writeStrongBinder(((IBinder)point0));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    VisibleRegion visibleRegion0 = this.getVisibleRegion();
                    reply.writeNoException();
                    if(visibleRegion0 != null) {
                        reply.writeInt(1);
                        visibleRegion0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if(data.readInt() != 0) {
                        point0 = Point.CREATOR.zzeK(data);
                    }
                    LatLng latLng1 = this.fromScreenLocation2(point0);
                    reply.writeNoException();
                    if(latLng1 != null) {
                        reply.writeInt(1);
                        latLng1.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                    if(data.readInt() != 0) {
                        point0 = LatLng.CREATOR.zzeP(data);
                    }
                    Point point1 = this.toScreenLocation2(((LatLng)point0));
                    reply.writeNoException();
                    if(point1 != null) {
                        reply.writeInt(1);
                        point1.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static IProjectionDelegate zzcE(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            return iInterface0 != null && iInterface0 instanceof IProjectionDelegate ? ((IProjectionDelegate)iInterface0) : new com.google.android.gms.maps.internal.IProjectionDelegate.zza.zza(iBinder0);
        }
    }

    LatLng fromScreenLocation(zzd arg1) throws RemoteException;

    LatLng fromScreenLocation2(Point arg1) throws RemoteException;

    VisibleRegion getVisibleRegion() throws RemoteException;

    zzd toScreenLocation(LatLng arg1) throws RemoteException;

    Point toScreenLocation2(LatLng arg1) throws RemoteException;
}

