package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface zzf extends IInterface {
    public static abstract class zza extends Binder implements zzf {
        static class com.google.android.gms.maps.model.internal.zzf.zza.zza implements zzf {
            private IBinder zznF;

            com.google.android.gms.maps.model.internal.zzf.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public float getBearing() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public LatLngBounds getBounds() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : LatLngBounds.CREATOR.zzeO(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public float getHeight() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public String getId() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public LatLng getPosition() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : LatLng.CREATOR.zzeP(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public float getTransparency() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zznF.transact(18, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public float getWidth() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public float getZIndex() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public int hashCodeRemote() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zznF.transact(20, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public boolean isVisible() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zznF.transact(16, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public void remove() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public void setBearing(float bearing) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    parcel0.writeFloat(bearing);
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public void setDimensions(float width) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    parcel0.writeFloat(width);
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public void setPosition(LatLng latlng) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    if(latlng == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        latlng.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public void setPositionFromBounds(LatLngBounds bounds) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    if(bounds == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bounds.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public void setTransparency(float transparency) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    parcel0.writeFloat(transparency);
                    this.zznF.transact(17, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public void setVisible(boolean visible) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    if(visible) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(15, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public void setZIndex(float zIndex) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    parcel0.writeFloat(zIndex);
                    this.zznF.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public void zza(float f, float f1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    parcel0.writeFloat(f);
                    parcel0.writeFloat(f1);
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public void zza(BitmapDescriptorParcelable bitmapDescriptorParcelable0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    if(bitmapDescriptorParcelable0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bitmapDescriptorParcelable0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(22, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public boolean zza(zzf zzf0) throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    parcel0.writeStrongBinder((zzf0 == null ? null : zzf0.asBinder()));
                    this.zznF.transact(19, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.model.internal.zzf
            public void zzu(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(21, parcel0, parcel1, 0);
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
            int v2 = 0;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.remove();
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    String s = this.getId();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    if(data.readInt() != 0) {
                        latLng0 = LatLng.CREATOR.zzeP(data);
                    }
                    this.setPosition(latLng0);
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    LatLng latLng1 = this.getPosition();
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
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.setDimensions(data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zza(data.readFloat(), data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    float f = this.getWidth();
                    reply.writeNoException();
                    reply.writeFloat(f);
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    float f1 = this.getHeight();
                    reply.writeNoException();
                    reply.writeFloat(f1);
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    if(data.readInt() != 0) {
                        latLng0 = LatLngBounds.CREATOR.zzeO(data);
                    }
                    this.setPositionFromBounds(((LatLngBounds)latLng0));
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    LatLngBounds latLngBounds0 = this.getBounds();
                    reply.writeNoException();
                    if(latLngBounds0 != null) {
                        reply.writeInt(1);
                        latLngBounds0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.setBearing(data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    float f2 = this.getBearing();
                    reply.writeNoException();
                    reply.writeFloat(f2);
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.setZIndex(data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    float f3 = this.getZIndex();
                    reply.writeNoException();
                    reply.writeFloat(f3);
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.setVisible(data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    boolean z = this.isVisible();
                    reply.writeNoException();
                    if(z) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.setTransparency(data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    float f4 = this.getTransparency();
                    reply.writeNoException();
                    reply.writeFloat(f4);
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    boolean z1 = this.zza(zza.zzcM(data.readStrongBinder()));
                    reply.writeNoException();
                    if(z1) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 20: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    int v3 = this.hashCodeRemote();
                    reply.writeNoException();
                    reply.writeInt(v3);
                    return true;
                }
                case 21: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    this.zzu(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 22: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    if(data.readInt() != 0) {
                        latLng0 = BitmapDescriptorParcelable.CREATOR.zzfa(data);
                    }
                    this.zza(((BitmapDescriptorParcelable)latLng0));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzf zzcM(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            return iInterface0 != null && iInterface0 instanceof zzf ? ((zzf)iInterface0) : new com.google.android.gms.maps.model.internal.zzf.zza.zza(iBinder0);
        }
    }

    float getBearing() throws RemoteException;

    LatLngBounds getBounds() throws RemoteException;

    float getHeight() throws RemoteException;

    String getId() throws RemoteException;

    LatLng getPosition() throws RemoteException;

    float getTransparency() throws RemoteException;

    float getWidth() throws RemoteException;

    float getZIndex() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void remove() throws RemoteException;

    void setBearing(float arg1) throws RemoteException;

    void setDimensions(float arg1) throws RemoteException;

    void setPosition(LatLng arg1) throws RemoteException;

    void setPositionFromBounds(LatLngBounds arg1) throws RemoteException;

    void setTransparency(float arg1) throws RemoteException;

    void setVisible(boolean arg1) throws RemoteException;

    void setZIndex(float arg1) throws RemoteException;

    void zza(float arg1, float arg2) throws RemoteException;

    void zza(BitmapDescriptorParcelable arg1) throws RemoteException;

    boolean zza(zzf arg1) throws RemoteException;

    void zzu(zzd arg1) throws RemoteException;
}

