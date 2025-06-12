package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

public interface zze extends IInterface {
    public static abstract class zza extends Binder implements zze {
        static class com.google.android.gms.maps.model.internal.zze.zza.zza implements zze {
            private IBinder zznF;

            com.google.android.gms.maps.model.internal.zze.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public LatLng getCenter() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : LatLng.CREATOR.zzeP(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public int getFillColor() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public String getId() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public double getRadius() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readDouble();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public int getStrokeColor() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public float getStrokeWidth() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public float getZIndex() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public int hashCodeRemote() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.zznF.transact(18, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public boolean isVisible() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
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

            @Override  // com.google.android.gms.maps.model.internal.zze
            public void remove() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public void setCenter(LatLng center) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    if(center == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        center.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public void setFillColor(int color) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    parcel0.writeInt(color);
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public void setRadius(double radius) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    parcel0.writeDouble(radius);
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public void setStrokeColor(int color) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    parcel0.writeInt(color);
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public void setStrokeWidth(float width) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    parcel0.writeFloat(width);
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public void setVisible(boolean visible) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
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

            @Override  // com.google.android.gms.maps.model.internal.zze
            public void setZIndex(float zIndex) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    parcel0.writeFloat(zIndex);
                    this.zznF.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zze
            public boolean zza(zze zze0) throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    parcel0.writeStrongBinder((zze0 == null ? null : zze0.asBinder()));
                    this.zznF.transact(17, parcel0, parcel1, 0);
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
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            boolean z = false;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.remove();
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    String s = this.getId();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.setCenter((data.readInt() == 0 ? null : LatLng.CREATOR.zzeP(data)));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    LatLng latLng0 = this.getCenter();
                    reply.writeNoException();
                    if(latLng0 != null) {
                        reply.writeInt(1);
                        latLng0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.setRadius(data.readDouble());
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    double f = this.getRadius();
                    reply.writeNoException();
                    reply.writeDouble(f);
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.setStrokeWidth(data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    float f1 = this.getStrokeWidth();
                    reply.writeNoException();
                    reply.writeFloat(f1);
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.setStrokeColor(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    int v2 = this.getStrokeColor();
                    reply.writeNoException();
                    reply.writeInt(v2);
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.setFillColor(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    int v3 = this.getFillColor();
                    reply.writeNoException();
                    reply.writeInt(v3);
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    this.setZIndex(data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    float f2 = this.getZIndex();
                    reply.writeNoException();
                    reply.writeFloat(f2);
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setVisible(z);
                    reply.writeNoException();
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    boolean z1 = this.isVisible();
                    reply.writeNoException();
                    if(z1) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    boolean z2 = this.zza(zza.zzcL(data.readStrongBinder()));
                    reply.writeNoException();
                    if(z2) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    int v4 = this.hashCodeRemote();
                    reply.writeNoException();
                    reply.writeInt(v4);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zze zzcL(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            return iInterface0 != null && iInterface0 instanceof zze ? ((zze)iInterface0) : new com.google.android.gms.maps.model.internal.zze.zza.zza(iBinder0);
        }
    }

    LatLng getCenter() throws RemoteException;

    int getFillColor() throws RemoteException;

    String getId() throws RemoteException;

    double getRadius() throws RemoteException;

    int getStrokeColor() throws RemoteException;

    float getStrokeWidth() throws RemoteException;

    float getZIndex() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void remove() throws RemoteException;

    void setCenter(LatLng arg1) throws RemoteException;

    void setFillColor(int arg1) throws RemoteException;

    void setRadius(double arg1) throws RemoteException;

    void setStrokeColor(int arg1) throws RemoteException;

    void setStrokeWidth(float arg1) throws RemoteException;

    void setVisible(boolean arg1) throws RemoteException;

    void setZIndex(float arg1) throws RemoteException;

    boolean zza(zze arg1) throws RemoteException;
}

