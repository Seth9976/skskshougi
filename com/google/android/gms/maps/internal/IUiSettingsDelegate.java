package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IUiSettingsDelegate extends IInterface {
    public static abstract class zza extends Binder implements IUiSettingsDelegate {
        static class com.google.android.gms.maps.internal.IUiSettingsDelegate.zza.zza implements IUiSettingsDelegate {
            private IBinder zznF;

            com.google.android.gms.maps.internal.IUiSettingsDelegate.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isCompassEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.zznF.transact(10, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isIndoorLevelPickerEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isMapToolbarEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isMyLocationButtonEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isRotateGesturesEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.zznF.transact(15, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isScrollGesturesEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.zznF.transact(12, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isTiltGesturesEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.zznF.transact(14, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isZoomControlsEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.zznF.transact(9, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public boolean isZoomGesturesEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    this.zznF.transact(13, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setAllGesturesEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(enabled) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setCompassEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(enabled) {
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setIndoorLevelPickerEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(enabled) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(16, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setMapToolbarEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(enabled) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(18, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setMyLocationButtonEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(enabled) {
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setRotateGesturesEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(enabled) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setScrollGesturesEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(enabled) {
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setTiltGesturesEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(enabled) {
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setZoomControlsEnabled(boolean enabled) throws RemoteException {
                int v = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(!enabled) {
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

            @Override  // com.google.android.gms.maps.internal.IUiSettingsDelegate
            public void setZoomGesturesEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(enabled) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(5, parcel0, parcel1, 0);
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
            boolean z = false;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setZoomControlsEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setCompassEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setMyLocationButtonEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setScrollGesturesEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setZoomGesturesEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setTiltGesturesEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setRotateGesturesEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setAllGesturesEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z1 = this.isZoomControlsEnabled();
                    reply.writeNoException();
                    if(z1) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z2 = this.isCompassEnabled();
                    reply.writeNoException();
                    if(z2) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z3 = this.isMyLocationButtonEnabled();
                    reply.writeNoException();
                    if(z3) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z4 = this.isScrollGesturesEnabled();
                    reply.writeNoException();
                    if(z4) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z5 = this.isZoomGesturesEnabled();
                    reply.writeNoException();
                    if(z5) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z6 = this.isTiltGesturesEnabled();
                    reply.writeNoException();
                    if(z6) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z7 = this.isRotateGesturesEnabled();
                    reply.writeNoException();
                    if(z7) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setIndoorLevelPickerEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z8 = this.isIndoorLevelPickerEnabled();
                    reply.writeNoException();
                    if(z8) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setMapToolbarEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    boolean z9 = this.isMapToolbarEnabled();
                    reply.writeNoException();
                    if(z9) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static IUiSettingsDelegate zzcJ(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            return iInterface0 != null && iInterface0 instanceof IUiSettingsDelegate ? ((IUiSettingsDelegate)iInterface0) : new com.google.android.gms.maps.internal.IUiSettingsDelegate.zza.zza(iBinder0);
        }
    }

    boolean isCompassEnabled() throws RemoteException;

    boolean isIndoorLevelPickerEnabled() throws RemoteException;

    boolean isMapToolbarEnabled() throws RemoteException;

    boolean isMyLocationButtonEnabled() throws RemoteException;

    boolean isRotateGesturesEnabled() throws RemoteException;

    boolean isScrollGesturesEnabled() throws RemoteException;

    boolean isTiltGesturesEnabled() throws RemoteException;

    boolean isZoomControlsEnabled() throws RemoteException;

    boolean isZoomGesturesEnabled() throws RemoteException;

    void setAllGesturesEnabled(boolean arg1) throws RemoteException;

    void setCompassEnabled(boolean arg1) throws RemoteException;

    void setIndoorLevelPickerEnabled(boolean arg1) throws RemoteException;

    void setMapToolbarEnabled(boolean arg1) throws RemoteException;

    void setMyLocationButtonEnabled(boolean arg1) throws RemoteException;

    void setRotateGesturesEnabled(boolean arg1) throws RemoteException;

    void setScrollGesturesEnabled(boolean arg1) throws RemoteException;

    void setTiltGesturesEnabled(boolean arg1) throws RemoteException;

    void setZoomControlsEnabled(boolean arg1) throws RemoteException;

    void setZoomGesturesEnabled(boolean arg1) throws RemoteException;
}

