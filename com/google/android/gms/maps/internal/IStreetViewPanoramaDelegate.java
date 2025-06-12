package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public interface IStreetViewPanoramaDelegate extends IInterface {
    public static abstract class zza extends Binder implements IStreetViewPanoramaDelegate {
        static class com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate.zza.zza implements IStreetViewPanoramaDelegate {
            private IBinder zznF;

            com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void animateTo(StreetViewPanoramaCamera camera, long duration) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(camera == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        camera.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeLong(duration);
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void enablePanning(boolean enablePanning) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(enablePanning) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void enableStreetNames(boolean enableStreetNames) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(enableStreetNames) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void enableUserNavigation(boolean enableUserNavigation) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(enableUserNavigation) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void enableZoom(boolean enableZoom) throws RemoteException {
                int v = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(!enableZoom) {
                        v = 0;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaCamera getPanoramaCamera() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : StreetViewPanoramaCamera.CREATOR.zzeT(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : StreetViewPanoramaLocation.CREATOR.zzeV(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isPanningGesturesEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isStreetNamesEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isUserNavigationEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public boolean isZoomGesturesEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public zzd orientationToPoint(StreetViewPanoramaOrientation orientation) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(orientation == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        orientation.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(19, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public StreetViewPanoramaOrientation pointToOrientation(zzd point) throws RemoteException {
                StreetViewPanoramaOrientation streetViewPanoramaOrientation0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    parcel0.writeStrongBinder((point == null ? null : point.asBinder()));
                    this.zznF.transact(18, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        streetViewPanoramaOrientation0 = StreetViewPanoramaOrientation.CREATOR.zzeW(parcel1);
                    }
                    return streetViewPanoramaOrientation0;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaCameraChangeListener(zzr listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(16, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaChangeListener(zzs listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(15, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaClickListener(zzt listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(17, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setOnStreetViewPanoramaLongClickListener(zzu listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(20, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPosition(LatLng position) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(position == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        position.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithID(String panoId) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    parcel0.writeString(panoId);
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
            public void setPositionWithRadius(LatLng position, int radius) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(position == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        position.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(radius);
                    this.zznF.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            LatLng latLng0 = null;
            boolean z = false;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.enableZoom(z);
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.enablePanning(z);
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.enableUserNavigation(z);
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.enableStreetNames(z);
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    boolean z1 = this.isZoomGesturesEnabled();
                    reply.writeNoException();
                    if(z1) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    boolean z2 = this.isPanningGesturesEnabled();
                    reply.writeNoException();
                    if(z2) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    boolean z3 = this.isUserNavigationEnabled();
                    reply.writeNoException();
                    if(z3) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    boolean z4 = this.isStreetNamesEnabled();
                    reply.writeNoException();
                    if(z4) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.animateTo((data.readInt() == 0 ? null : StreetViewPanoramaCamera.CREATOR.zzeT(data)), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    StreetViewPanoramaCamera streetViewPanoramaCamera0 = this.getPanoramaCamera();
                    reply.writeNoException();
                    if(streetViewPanoramaCamera0 != null) {
                        reply.writeInt(1);
                        streetViewPanoramaCamera0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.setPositionWithID(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(data.readInt() != 0) {
                        latLng0 = LatLng.CREATOR.zzeP(data);
                    }
                    this.setPosition(latLng0);
                    reply.writeNoException();
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    if(data.readInt() != 0) {
                        latLng0 = LatLng.CREATOR.zzeP(data);
                    }
                    this.setPositionWithRadius(latLng0, data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    StreetViewPanoramaLocation streetViewPanoramaLocation0 = this.getStreetViewPanoramaLocation();
                    reply.writeNoException();
                    if(streetViewPanoramaLocation0 != null) {
                        reply.writeInt(1);
                        streetViewPanoramaLocation0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.setOnStreetViewPanoramaChangeListener(com.google.android.gms.maps.internal.zzs.zza.zzcA(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.setOnStreetViewPanoramaCameraChangeListener(com.google.android.gms.maps.internal.zzr.zza.zzcz(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.setOnStreetViewPanoramaClickListener(com.google.android.gms.maps.internal.zzt.zza.zzcB(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    StreetViewPanoramaOrientation streetViewPanoramaOrientation0 = this.pointToOrientation(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    if(streetViewPanoramaOrientation0 != null) {
                        reply.writeInt(1);
                        streetViewPanoramaOrientation0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    zzd zzd0 = this.orientationToPoint((data.readInt() == 0 ? null : StreetViewPanoramaOrientation.CREATOR.zzeW(data)));
                    reply.writeNoException();
                    if(zzd0 != null) {
                        latLng0 = zzd0.asBinder();
                    }
                    reply.writeStrongBinder(((IBinder)latLng0));
                    return true;
                }
                case 20: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    this.setOnStreetViewPanoramaLongClickListener(com.google.android.gms.maps.internal.zzu.zza.zzcC(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static IStreetViewPanoramaDelegate zzcG(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            return iInterface0 != null && iInterface0 instanceof IStreetViewPanoramaDelegate ? ((IStreetViewPanoramaDelegate)iInterface0) : new com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate.zza.zza(iBinder0);
        }
    }

    void animateTo(StreetViewPanoramaCamera arg1, long arg2) throws RemoteException;

    void enablePanning(boolean arg1) throws RemoteException;

    void enableStreetNames(boolean arg1) throws RemoteException;

    void enableUserNavigation(boolean arg1) throws RemoteException;

    void enableZoom(boolean arg1) throws RemoteException;

    StreetViewPanoramaCamera getPanoramaCamera() throws RemoteException;

    StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws RemoteException;

    boolean isPanningGesturesEnabled() throws RemoteException;

    boolean isStreetNamesEnabled() throws RemoteException;

    boolean isUserNavigationEnabled() throws RemoteException;

    boolean isZoomGesturesEnabled() throws RemoteException;

    zzd orientationToPoint(StreetViewPanoramaOrientation arg1) throws RemoteException;

    StreetViewPanoramaOrientation pointToOrientation(zzd arg1) throws RemoteException;

    void setOnStreetViewPanoramaCameraChangeListener(zzr arg1) throws RemoteException;

    void setOnStreetViewPanoramaChangeListener(zzs arg1) throws RemoteException;

    void setOnStreetViewPanoramaClickListener(zzt arg1) throws RemoteException;

    void setOnStreetViewPanoramaLongClickListener(zzu arg1) throws RemoteException;

    void setPosition(LatLng arg1) throws RemoteException;

    void setPositionWithID(String arg1) throws RemoteException;

    void setPositionWithRadius(LatLng arg1, int arg2) throws RemoteException;
}

