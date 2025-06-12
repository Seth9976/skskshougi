package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface ICameraUpdateFactoryDelegate extends IInterface {
    public static abstract class zza extends Binder implements ICameraUpdateFactoryDelegate {
        static class com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.zza.zza implements ICameraUpdateFactoryDelegate {
            private IBinder zznF;

            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public zzd newCameraPosition(CameraPosition cameraPosition) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if(cameraPosition == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        cameraPosition.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public zzd newLatLng(LatLng latLng) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if(latLng == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        latLng.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public zzd newLatLngBounds(LatLngBounds bounds, int padding) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if(bounds == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bounds.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(padding);
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public zzd newLatLngBoundsWithSize(LatLngBounds bounds, int width, int height, int padding) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if(bounds == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bounds.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(width);
                    parcel0.writeInt(height);
                    parcel0.writeInt(padding);
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public zzd newLatLngZoom(LatLng latLng, float zoom) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    if(latLng == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        latLng.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeFloat(zoom);
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public zzd scrollBy(float xPixel, float yPixel) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    parcel0.writeFloat(xPixel);
                    parcel0.writeFloat(yPixel);
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public zzd zoomBy(float amount) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    parcel0.writeFloat(amount);
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public zzd zoomByWithFocus(float amount, int screenFocusX, int screenFocusY) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    parcel0.writeFloat(amount);
                    parcel0.writeInt(screenFocusX);
                    parcel0.writeInt(screenFocusY);
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public zzd zoomIn() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public zzd zoomOut() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            public zzd zoomTo(float zoom) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    parcel0.writeFloat(zoom);
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    zzd zzd0 = this.zoomIn();
                    reply.writeNoException();
                    if(zzd0 != null) {
                        iBinder0 = zzd0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    zzd zzd1 = this.zoomOut();
                    reply.writeNoException();
                    if(zzd1 != null) {
                        iBinder0 = zzd1.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    zzd zzd2 = this.scrollBy(data.readFloat(), data.readFloat());
                    reply.writeNoException();
                    if(zzd2 != null) {
                        iBinder0 = zzd2.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    zzd zzd3 = this.zoomTo(data.readFloat());
                    reply.writeNoException();
                    if(zzd3 != null) {
                        iBinder0 = zzd3.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    zzd zzd4 = this.zoomBy(data.readFloat());
                    reply.writeNoException();
                    if(zzd4 != null) {
                        iBinder0 = zzd4.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    zzd zzd5 = this.zoomByWithFocus(data.readFloat(), data.readInt(), data.readInt());
                    reply.writeNoException();
                    if(zzd5 != null) {
                        iBinder0 = zzd5.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    zzd zzd6 = this.newCameraPosition((data.readInt() == 0 ? null : CameraPosition.CREATOR.zzeL(data)));
                    reply.writeNoException();
                    if(zzd6 != null) {
                        iBinder0 = zzd6.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    zzd zzd7 = this.newLatLng((data.readInt() == 0 ? null : LatLng.CREATOR.zzeP(data)));
                    reply.writeNoException();
                    if(zzd7 != null) {
                        iBinder0 = zzd7.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    zzd zzd8 = this.newLatLngZoom((data.readInt() == 0 ? null : LatLng.CREATOR.zzeP(data)), data.readFloat());
                    reply.writeNoException();
                    if(zzd8 != null) {
                        iBinder0 = zzd8.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    zzd zzd9 = this.newLatLngBounds((data.readInt() == 0 ? null : LatLngBounds.CREATOR.zzeO(data)), data.readInt());
                    reply.writeNoException();
                    if(zzd9 != null) {
                        iBinder0 = zzd9.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    zzd zzd10 = this.newLatLngBoundsWithSize((data.readInt() == 0 ? null : LatLngBounds.CREATOR.zzeO(data)), data.readInt(), data.readInt(), data.readInt());
                    reply.writeNoException();
                    if(zzd10 != null) {
                        iBinder0 = zzd10.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static ICameraUpdateFactoryDelegate zzce(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            return iInterface0 != null && iInterface0 instanceof ICameraUpdateFactoryDelegate ? ((ICameraUpdateFactoryDelegate)iInterface0) : new com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.zza.zza(iBinder0);
        }
    }

    zzd newCameraPosition(CameraPosition arg1) throws RemoteException;

    zzd newLatLng(LatLng arg1) throws RemoteException;

    zzd newLatLngBounds(LatLngBounds arg1, int arg2) throws RemoteException;

    zzd newLatLngBoundsWithSize(LatLngBounds arg1, int arg2, int arg3, int arg4) throws RemoteException;

    zzd newLatLngZoom(LatLng arg1, float arg2) throws RemoteException;

    zzd scrollBy(float arg1, float arg2) throws RemoteException;

    zzd zoomBy(float arg1) throws RemoteException;

    zzd zoomByWithFocus(float arg1, int arg2, int arg3) throws RemoteException;

    zzd zoomIn() throws RemoteException;

    zzd zoomOut() throws RemoteException;

    zzd zoomTo(float arg1) throws RemoteException;
}

