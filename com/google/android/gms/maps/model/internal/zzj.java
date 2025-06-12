package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public interface zzj extends IInterface {
    public static abstract class zza extends Binder implements zzj {
        static class com.google.android.gms.maps.model.internal.zzj.zza.zza implements zzj {
            private IBinder zznF;

            com.google.android.gms.maps.model.internal.zzj.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public int getFillColor() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public List getHoles() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readArrayList(this.getClass().getClassLoader());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public String getId() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public List getPoints() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.createTypedArrayList(LatLng.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public int getStrokeColor() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public float getStrokeWidth() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public float getZIndex() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public int hashCodeRemote() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.zznF.transact(20, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public boolean isGeodesic() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.zznF.transact(18, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public boolean isVisible() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
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

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public void remove() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public void setFillColor(int color) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    parcel0.writeInt(color);
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public void setGeodesic(boolean geodesic) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    if(geodesic) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(17, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public void setHoles(List holes) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    parcel0.writeList(holes);
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public void setPoints(List list0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    parcel0.writeTypedList(list0);
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public void setStrokeColor(int color) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    parcel0.writeInt(color);
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public void setStrokeWidth(float width) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    parcel0.writeFloat(width);
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public void setVisible(boolean visible) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
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

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public void setZIndex(float zIndex) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    parcel0.writeFloat(zIndex);
                    this.zznF.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzj
            public boolean zza(zzj zzj0) throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    parcel0.writeStrongBinder((zzj0 == null ? null : zzj0.asBinder()));
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
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            boolean z = false;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.remove();
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    String s = this.getId();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.setPoints(data.createTypedArrayList(LatLng.CREATOR));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    List list0 = this.getPoints();
                    reply.writeNoException();
                    reply.writeTypedList(list0);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.setHoles(data.readArrayList(this.getClass().getClassLoader()));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    List list1 = this.getHoles();
                    reply.writeNoException();
                    reply.writeList(list1);
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.setStrokeWidth(data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    float f = this.getStrokeWidth();
                    reply.writeNoException();
                    reply.writeFloat(f);
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.setStrokeColor(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    int v2 = this.getStrokeColor();
                    reply.writeNoException();
                    reply.writeInt(v2);
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.setFillColor(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    int v3 = this.getFillColor();
                    reply.writeNoException();
                    reply.writeInt(v3);
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    this.setZIndex(data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    float f1 = this.getZIndex();
                    reply.writeNoException();
                    reply.writeFloat(f1);
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setVisible(z);
                    reply.writeNoException();
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    boolean z1 = this.isVisible();
                    reply.writeNoException();
                    if(z1) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setGeodesic(z);
                    reply.writeNoException();
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    boolean z2 = this.isGeodesic();
                    reply.writeNoException();
                    if(z2) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    boolean z3 = this.zza(zza.zzcQ(data.readStrongBinder()));
                    reply.writeNoException();
                    if(z3) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 20: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    int v4 = this.hashCodeRemote();
                    reply.writeNoException();
                    reply.writeInt(v4);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzj zzcQ(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            return iInterface0 != null && iInterface0 instanceof zzj ? ((zzj)iInterface0) : new com.google.android.gms.maps.model.internal.zzj.zza.zza(iBinder0);
        }
    }

    int getFillColor() throws RemoteException;

    List getHoles() throws RemoteException;

    String getId() throws RemoteException;

    List getPoints() throws RemoteException;

    int getStrokeColor() throws RemoteException;

    float getStrokeWidth() throws RemoteException;

    float getZIndex() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    boolean isGeodesic() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void remove() throws RemoteException;

    void setFillColor(int arg1) throws RemoteException;

    void setGeodesic(boolean arg1) throws RemoteException;

    void setHoles(List arg1) throws RemoteException;

    void setPoints(List arg1) throws RemoteException;

    void setStrokeColor(int arg1) throws RemoteException;

    void setStrokeWidth(float arg1) throws RemoteException;

    void setVisible(boolean arg1) throws RemoteException;

    void setZIndex(float arg1) throws RemoteException;

    boolean zza(zzj arg1) throws RemoteException;
}

