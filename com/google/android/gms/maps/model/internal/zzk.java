package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzk extends IInterface {
    public static abstract class zza extends Binder implements zzk {
        static class com.google.android.gms.maps.model.internal.zzk.zza.zza implements zzk {
            private IBinder zznF;

            com.google.android.gms.maps.model.internal.zzk.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.model.internal.zzk
            public void clearTileCache() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzk
            public boolean getFadeIn() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.zznF.transact(11, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.model.internal.zzk
            public String getId() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzk
            public float getZIndex() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzk
            public int hashCodeRemote() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzk
            public boolean isVisible() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
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

            @Override  // com.google.android.gms.maps.model.internal.zzk
            public void remove() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzk
            public void setFadeIn(boolean fadeIn) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    if(fadeIn) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzk
            public void setVisible(boolean visible) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    if(visible) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzk
            public void setZIndex(float zIndex) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    parcel0.writeFloat(zIndex);
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzk
            public boolean zza(zzk zzk0) throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    parcel0.writeStrongBinder((zzk0 == null ? null : zzk0.asBinder()));
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
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            boolean z = false;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.remove();
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.clearTileCache();
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    String s = this.getId();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    this.setZIndex(data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    float f = this.getZIndex();
                    reply.writeNoException();
                    reply.writeFloat(f);
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setVisible(z);
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    boolean z1 = this.isVisible();
                    reply.writeNoException();
                    if(z1) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    boolean z2 = this.zza(zza.zzcS(data.readStrongBinder()));
                    reply.writeNoException();
                    if(z2) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    int v2 = this.hashCodeRemote();
                    reply.writeNoException();
                    reply.writeInt(v2);
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setFadeIn(z);
                    reply.writeNoException();
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    boolean z3 = this.getFadeIn();
                    reply.writeNoException();
                    if(z3) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzk zzcS(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            return iInterface0 != null && iInterface0 instanceof zzk ? ((zzk)iInterface0) : new com.google.android.gms.maps.model.internal.zzk.zza.zza(iBinder0);
        }
    }

    void clearTileCache() throws RemoteException;

    boolean getFadeIn() throws RemoteException;

    String getId() throws RemoteException;

    float getZIndex() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void remove() throws RemoteException;

    void setFadeIn(boolean arg1) throws RemoteException;

    void setVisible(boolean arg1) throws RemoteException;

    void setZIndex(float arg1) throws RemoteException;

    boolean zza(zzk arg1) throws RemoteException;
}

