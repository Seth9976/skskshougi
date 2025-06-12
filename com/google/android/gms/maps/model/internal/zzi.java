package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;

public interface zzi extends IInterface {
    public static abstract class zza extends Binder implements zzi {
        static class com.google.android.gms.maps.model.internal.zzi.zza.zza implements zzi {
            private IBinder zznF;

            com.google.android.gms.maps.model.internal.zzi.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public float getAlpha() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.zznF.transact(26, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public String getId() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public LatLng getPosition() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : LatLng.CREATOR.zzeP(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public float getRotation() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.zznF.transact(23, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public String getSnippet() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public String getTitle() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public int hashCodeRemote() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.zznF.transact(17, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void hideInfoWindow() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public boolean isDraggable() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public boolean isFlat() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.zznF.transact(21, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public boolean isInfoWindowShown() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public boolean isVisible() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void remove() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void setAlpha(float alpha) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    parcel0.writeFloat(alpha);
                    this.zznF.transact(25, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void setAnchor(float anchorU, float anchorV) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    parcel0.writeFloat(anchorU);
                    parcel0.writeFloat(anchorV);
                    this.zznF.transact(19, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void setDraggable(boolean draggable) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if(draggable) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void setFlat(boolean flat) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if(flat) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(20, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void setInfoWindowAnchor(float anchorU, float anchorV) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    parcel0.writeFloat(anchorU);
                    parcel0.writeFloat(anchorV);
                    this.zznF.transact(24, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void setPosition(LatLng latlng) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void setRotation(float rotation) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    parcel0.writeFloat(rotation);
                    this.zznF.transact(22, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void setSnippet(String snippet) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    parcel0.writeString(snippet);
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void setTitle(String title) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    parcel0.writeString(title);
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void setVisible(boolean visible) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if(visible) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void showInfoWindow() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void zzb(BitmapDescriptorParcelable bitmapDescriptorParcelable0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if(bitmapDescriptorParcelable0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bitmapDescriptorParcelable0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(28, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public boolean zzh(zzi zzi0) throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    parcel0.writeStrongBinder((zzi0 == null ? null : zzi0.asBinder()));
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

            @Override  // com.google.android.gms.maps.model.internal.zzi
            public void zzv(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(18, parcel0, parcel1, 0);
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
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.remove();
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    String s = this.getId();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if(data.readInt() != 0) {
                        latLng0 = LatLng.CREATOR.zzeP(data);
                    }
                    this.setPosition(latLng0);
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.setTitle(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    String s1 = this.getTitle();
                    reply.writeNoException();
                    reply.writeString(s1);
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.setSnippet(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    String s2 = this.getSnippet();
                    reply.writeNoException();
                    reply.writeString(s2);
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.setDraggable(data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    boolean z = this.isDraggable();
                    reply.writeNoException();
                    if(z) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.showInfoWindow();
                    reply.writeNoException();
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.hideInfoWindow();
                    reply.writeNoException();
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    boolean z1 = this.isInfoWindowShown();
                    reply.writeNoException();
                    if(z1) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if(data.readInt() != 0) {
                        v2 = 1;
                    }
                    this.setVisible(((boolean)v2));
                    reply.writeNoException();
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    boolean z2 = this.isVisible();
                    reply.writeNoException();
                    if(z2) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    boolean z3 = this.zzh(zza.zzcP(data.readStrongBinder()));
                    reply.writeNoException();
                    if(z3) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    int v3 = this.hashCodeRemote();
                    reply.writeNoException();
                    reply.writeInt(v3);
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.zzv(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.setAnchor(data.readFloat(), data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 20: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if(data.readInt() != 0) {
                        v2 = 1;
                    }
                    this.setFlat(((boolean)v2));
                    reply.writeNoException();
                    return true;
                }
                case 21: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    boolean z4 = this.isFlat();
                    reply.writeNoException();
                    if(z4) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 22: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.setRotation(data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 23: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    float f = this.getRotation();
                    reply.writeNoException();
                    reply.writeFloat(f);
                    return true;
                }
                case 24: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.setInfoWindowAnchor(data.readFloat(), data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 25: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    this.setAlpha(data.readFloat());
                    reply.writeNoException();
                    return true;
                }
                case 26: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    float f1 = this.getAlpha();
                    reply.writeNoException();
                    reply.writeFloat(f1);
                    return true;
                }
                case 28: {
                    data.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if(data.readInt() != 0) {
                        latLng0 = BitmapDescriptorParcelable.CREATOR.zzfa(data);
                    }
                    this.zzb(((BitmapDescriptorParcelable)latLng0));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzi zzcP(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            return iInterface0 != null && iInterface0 instanceof zzi ? ((zzi)iInterface0) : new com.google.android.gms.maps.model.internal.zzi.zza.zza(iBinder0);
        }
    }

    float getAlpha() throws RemoteException;

    String getId() throws RemoteException;

    LatLng getPosition() throws RemoteException;

    float getRotation() throws RemoteException;

    String getSnippet() throws RemoteException;

    String getTitle() throws RemoteException;

    int hashCodeRemote() throws RemoteException;

    void hideInfoWindow() throws RemoteException;

    boolean isDraggable() throws RemoteException;

    boolean isFlat() throws RemoteException;

    boolean isInfoWindowShown() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void remove() throws RemoteException;

    void setAlpha(float arg1) throws RemoteException;

    void setAnchor(float arg1, float arg2) throws RemoteException;

    void setDraggable(boolean arg1) throws RemoteException;

    void setFlat(boolean arg1) throws RemoteException;

    void setInfoWindowAnchor(float arg1, float arg2) throws RemoteException;

    void setPosition(LatLng arg1) throws RemoteException;

    void setRotation(float arg1) throws RemoteException;

    void setSnippet(String arg1) throws RemoteException;

    void setTitle(String arg1) throws RemoteException;

    void setVisible(boolean arg1) throws RemoteException;

    void showInfoWindow() throws RemoteException;

    void zzb(BitmapDescriptorParcelable arg1) throws RemoteException;

    boolean zzh(zzi arg1) throws RemoteException;

    void zzv(zzd arg1) throws RemoteException;
}

