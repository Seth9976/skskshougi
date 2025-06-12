package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.CameraUpdateParcelable;
import com.google.android.gms.maps.model.internal.GroundOverlayOptionsParcelable;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.MarkerOptionsParcelable;
import com.google.android.gms.maps.model.internal.zze;
import com.google.android.gms.maps.model.internal.zzf;
import com.google.android.gms.maps.model.internal.zzg;
import com.google.android.gms.maps.model.internal.zzi;
import com.google.android.gms.maps.model.internal.zzj;
import com.google.android.gms.maps.model.internal.zzk;

public interface IGoogleMapDelegate extends IInterface {
    public static abstract class zza extends Binder implements IGoogleMapDelegate {
        static class com.google.android.gms.maps.internal.IGoogleMapDelegate.zza.zza implements IGoogleMapDelegate {
            private IBinder zznF;

            com.google.android.gms.maps.internal.IGoogleMapDelegate.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zze addCircle(CircleOptions options) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(options == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        options.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(35, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.model.internal.zze.zza.zzcL(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzf addGroundOverlay(GroundOverlayOptions options) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(options == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        options.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.model.internal.zzf.zza.zzcM(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzf addGroundOverlay2(GroundOverlayOptions options, GroundOverlayOptionsParcelable parcelableOptions) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(options == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        options.writeToParcel(parcel0, 0);
                    }
                    if(parcelableOptions == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        parcelableOptions.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(70, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.model.internal.zzf.zza.zzcM(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzi addMarker(MarkerOptions options) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(options == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        options.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.model.internal.zzi.zza.zzcP(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzi addMarker2(MarkerOptions options, MarkerOptionsParcelable parcelableOptions) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(options == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        options.writeToParcel(parcel0, 0);
                    }
                    if(parcelableOptions == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        parcelableOptions.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(68, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.model.internal.zzi.zza.zzcP(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzj addPolygon(PolygonOptions options) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(options == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        options.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.model.internal.zzj.zza.zzcQ(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IPolylineDelegate addPolyline(PolylineOptions options) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(options == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        options.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.model.internal.IPolylineDelegate.zza.zzcR(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzk addTileOverlay(TileOverlayOptions options) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(options == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        options.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.model.internal.zzk.zza.zzcS(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCamera(zzd update) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((update == null ? null : update.asBinder()));
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCamera2(CameraUpdateParcelable update) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(update == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        update.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(65, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCameraWithCallback(zzd update, zzb callback) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((update == null ? null : update.asBinder()));
                    if(callback != null) {
                        iBinder0 = callback.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCameraWithCallback2(CameraUpdateParcelable update, zzb callback) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(update == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        update.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((callback == null ? null : callback.asBinder()));
                    this.zznF.transact(66, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCameraWithDurationAndCallback(zzd update, int durationMs, zzb callback) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((update == null ? null : update.asBinder()));
                    parcel0.writeInt(durationMs);
                    if(callback != null) {
                        iBinder0 = callback.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCameraWithDurationAndCallback2(CameraUpdateParcelable update, int durationMs, zzb callback) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(update == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        update.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(durationMs);
                    parcel0.writeStrongBinder((callback == null ? null : callback.asBinder()));
                    this.zznF.transact(67, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void clear() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public CameraPosition getCameraPosition() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : CameraPosition.CREATOR.zzeL(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public zzg getFocusedBuilding() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(44, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.model.internal.zzg.zza.zzcN(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void getMapAsync(zzm callback) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((callback == null ? null : callback.asBinder()));
                    this.zznF.transact(53, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public int getMapType() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(15, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public float getMaxZoomLevel() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public float getMinZoomLevel() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readFloat();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public Location getMyLocation() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(23, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Location)Location.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IProjectionDelegate getProjection() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(26, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.internal.IProjectionDelegate.zza.zzcE(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IUiSettingsDelegate getUiSettings() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(25, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.internal.IUiSettingsDelegate.zza.zzcJ(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isBuildingsEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(40, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isIndoorEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isMyLocationEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isTrafficEnabled() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void moveCamera(zzd update) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((update == null ? null : update.asBinder()));
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void moveCamera2(CameraUpdateParcelable update) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(update == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        update.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(0x40, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onCreate(Bundle bundle) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(bundle == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(54, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onDestroy() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(57, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onLowMemory() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(58, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onPause() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(56, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onResume() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(55, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onSaveInstanceState(Bundle outState) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(outState == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        outState.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(60, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        outState.readFromParcel(parcel1);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setBuildingsEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(enabled) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(41, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setContentDescription(String description) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeString(description);
                    this.zznF.transact(61, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean setIndoorEnabled(boolean enabled) throws RemoteException {
                boolean z1 = true;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeInt((enabled ? 1 : 0));
                    this.zznF.transact(20, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() == 0) {
                        z1 = false;
                    }
                    return z1;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setInfoWindowAdapter(com.google.android.gms.maps.internal.zzd adapter) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((adapter == null ? null : adapter.asBinder()));
                    this.zznF.transact(33, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setInfoWindowRenderer(com.google.android.gms.maps.internal.zze infoWindowRenderer) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((infoWindowRenderer == null ? null : infoWindowRenderer.asBinder()));
                    this.zznF.transact(69, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setLocationSource(ILocationSourceDelegate source) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((source == null ? null : source.asBinder()));
                    this.zznF.transact(24, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMapType(int type) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeInt(type);
                    this.zznF.transact(16, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMyLocationEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(enabled) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(22, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCameraChangeListener(com.google.android.gms.maps.internal.zzf listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(27, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzg listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(45, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnInfoWindowClickListener(zzh listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(0x20, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMapClickListener(com.google.android.gms.maps.internal.zzj listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(28, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMapLoadedCallback(com.google.android.gms.maps.internal.zzk callback) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((callback == null ? null : callback.asBinder()));
                    this.zznF.transact(42, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMapLongClickListener(zzl listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(29, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMarkerClickListener(zzn listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(30, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMarkerDragListener(zzo listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(0x1F, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMyLocationButtonClickListener(zzp listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(37, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMyLocationChangeListener(zzq listener) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((listener == null ? null : listener.asBinder()));
                    this.zznF.transact(36, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setPadding(int left, int top, int right, int bottom) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeInt(left);
                    parcel0.writeInt(top);
                    parcel0.writeInt(right);
                    parcel0.writeInt(bottom);
                    this.zznF.transact(39, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setTrafficEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void snapshot(zzw callback, zzd bitmap) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    parcel0.writeStrongBinder((callback == null ? null : callback.asBinder()));
                    if(bitmap != null) {
                        iBinder0 = bitmap.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(38, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void stopAnimation() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean useViewLifecycleWhenInFragment() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.zznF.transact(59, parcel0, parcel1, 0);
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
            IBinder iBinder0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    CameraPosition cameraPosition0 = this.getCameraPosition();
                    reply.writeNoException();
                    if(cameraPosition0 != null) {
                        reply.writeInt(1);
                        cameraPosition0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    float f = this.getMaxZoomLevel();
                    reply.writeNoException();
                    reply.writeFloat(f);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    float f1 = this.getMinZoomLevel();
                    reply.writeNoException();
                    reply.writeFloat(f1);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.moveCamera(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.animateCamera(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.animateCameraWithCallback(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), com.google.android.gms.maps.internal.zzb.zza.zzcf(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), data.readInt(), com.google.android.gms.maps.internal.zzb.zza.zzcf(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.stopAnimation();
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    IPolylineDelegate iPolylineDelegate0 = this.addPolyline((data.readInt() == 0 ? null : PolylineOptions.CREATOR.zzeS(data)));
                    reply.writeNoException();
                    if(iPolylineDelegate0 != null) {
                        iBinder0 = iPolylineDelegate0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzj zzj0 = this.addPolygon((data.readInt() == 0 ? null : PolygonOptions.CREATOR.zzeR(data)));
                    reply.writeNoException();
                    if(zzj0 != null) {
                        iBinder0 = zzj0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzi zzi0 = this.addMarker((data.readInt() == 0 ? null : MarkerOptions.CREATOR.zzeQ(data)));
                    reply.writeNoException();
                    if(zzi0 != null) {
                        iBinder0 = zzi0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzf zzf0 = this.addGroundOverlay((data.readInt() == 0 ? null : GroundOverlayOptions.CREATOR.zzeN(data)));
                    reply.writeNoException();
                    if(zzf0 != null) {
                        iBinder0 = zzf0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzk zzk0 = this.addTileOverlay((data.readInt() == 0 ? null : TileOverlayOptions.CREATOR.zzeY(data)));
                    reply.writeNoException();
                    if(zzk0 != null) {
                        iBinder0 = zzk0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.clear();
                    reply.writeNoException();
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    int v2 = this.getMapType();
                    reply.writeNoException();
                    reply.writeInt(v2);
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setMapType(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean z1 = this.isTrafficEnabled();
                    reply.writeNoException();
                    reply.writeInt((z1 ? 1 : 0));
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setTrafficEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean z2 = this.isIndoorEnabled();
                    reply.writeNoException();
                    if(z2) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 20: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean z3 = this.setIndoorEnabled(data.readInt() != 0);
                    reply.writeNoException();
                    if(z3) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 21: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean z4 = this.isMyLocationEnabled();
                    reply.writeNoException();
                    if(z4) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 22: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setMyLocationEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 23: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    Location location0 = this.getMyLocation();
                    reply.writeNoException();
                    if(location0 != null) {
                        reply.writeInt(1);
                        location0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 24: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setLocationSource(com.google.android.gms.maps.internal.ILocationSourceDelegate.zza.zzck(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 25: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    IUiSettingsDelegate iUiSettingsDelegate0 = this.getUiSettings();
                    reply.writeNoException();
                    if(iUiSettingsDelegate0 != null) {
                        iBinder0 = iUiSettingsDelegate0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 26: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    IProjectionDelegate iProjectionDelegate0 = this.getProjection();
                    reply.writeNoException();
                    if(iProjectionDelegate0 != null) {
                        iBinder0 = iProjectionDelegate0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 27: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setOnCameraChangeListener(com.google.android.gms.maps.internal.zzf.zza.zzcn(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 28: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setOnMapClickListener(com.google.android.gms.maps.internal.zzj.zza.zzcr(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 29: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setOnMapLongClickListener(com.google.android.gms.maps.internal.zzl.zza.zzct(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 30: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setOnMarkerClickListener(com.google.android.gms.maps.internal.zzn.zza.zzcv(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x1F: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setOnMarkerDragListener(com.google.android.gms.maps.internal.zzo.zza.zzcw(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x20: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setOnInfoWindowClickListener(com.google.android.gms.maps.internal.zzh.zza.zzcp(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 33: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setInfoWindowAdapter(com.google.android.gms.maps.internal.zzd.zza.zzci(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 35: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zze zze0 = this.addCircle((data.readInt() == 0 ? null : CircleOptions.CREATOR.zzeM(data)));
                    reply.writeNoException();
                    if(zze0 != null) {
                        iBinder0 = zze0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 36: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setOnMyLocationChangeListener(com.google.android.gms.maps.internal.zzq.zza.zzcy(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 37: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setOnMyLocationButtonClickListener(com.google.android.gms.maps.internal.zzp.zza.zzcx(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 38: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.snapshot(com.google.android.gms.maps.internal.zzw.zza.zzcF(data.readStrongBinder()), com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 39: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setPadding(data.readInt(), data.readInt(), data.readInt(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 40: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean z5 = this.isBuildingsEnabled();
                    reply.writeNoException();
                    if(z5) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 41: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.setBuildingsEnabled(z);
                    reply.writeNoException();
                    return true;
                }
                case 42: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setOnMapLoadedCallback(com.google.android.gms.maps.internal.zzk.zza.zzcs(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 44: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzg zzg0 = this.getFocusedBuilding();
                    reply.writeNoException();
                    if(zzg0 != null) {
                        iBinder0 = zzg0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 45: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzg.zza.zzco(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 53: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.getMapAsync(com.google.android.gms.maps.internal.zzm.zza.zzcu(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 54: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.onCreate((data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 55: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.onResume();
                    reply.writeNoException();
                    return true;
                }
                case 56: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.onPause();
                    reply.writeNoException();
                    return true;
                }
                case 57: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.onDestroy();
                    reply.writeNoException();
                    return true;
                }
                case 58: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.onLowMemory();
                    reply.writeNoException();
                    return true;
                }
                case 59: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean z6 = this.useViewLifecycleWhenInFragment();
                    reply.writeNoException();
                    if(z6) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 60: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    Bundle bundle0 = data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data));
                    this.onSaveInstanceState(bundle0);
                    reply.writeNoException();
                    if(bundle0 != null) {
                        reply.writeInt(1);
                        bundle0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 61: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setContentDescription(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x40: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(data.readInt() != 0) {
                        iBinder0 = CameraUpdateParcelable.CREATOR.zzfb(data);
                    }
                    this.moveCamera2(((CameraUpdateParcelable)iBinder0));
                    reply.writeNoException();
                    return true;
                }
                case 65: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(data.readInt() != 0) {
                        iBinder0 = CameraUpdateParcelable.CREATOR.zzfb(data);
                    }
                    this.animateCamera2(((CameraUpdateParcelable)iBinder0));
                    reply.writeNoException();
                    return true;
                }
                case 66: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(data.readInt() != 0) {
                        iBinder0 = CameraUpdateParcelable.CREATOR.zzfb(data);
                    }
                    this.animateCameraWithCallback2(((CameraUpdateParcelable)iBinder0), com.google.android.gms.maps.internal.zzb.zza.zzcf(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 67: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if(data.readInt() != 0) {
                        iBinder0 = CameraUpdateParcelable.CREATOR.zzfb(data);
                    }
                    this.animateCameraWithDurationAndCallback2(((CameraUpdateParcelable)iBinder0), data.readInt(), com.google.android.gms.maps.internal.zzb.zza.zzcf(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 68: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzi zzi1 = this.addMarker2((data.readInt() == 0 ? null : MarkerOptions.CREATOR.zzeQ(data)), (data.readInt() == 0 ? null : MarkerOptionsParcelable.CREATOR.zzfd(data)));
                    reply.writeNoException();
                    if(zzi1 != null) {
                        iBinder0 = zzi1.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 69: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.setInfoWindowRenderer(com.google.android.gms.maps.internal.zze.zza.zzcj(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 70: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    zzf zzf1 = this.addGroundOverlay2((data.readInt() == 0 ? null : GroundOverlayOptions.CREATOR.zzeN(data)), (data.readInt() == 0 ? null : GroundOverlayOptionsParcelable.CREATOR.zzfc(data)));
                    reply.writeNoException();
                    if(zzf1 != null) {
                        iBinder0 = zzf1.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static IGoogleMapDelegate zzch(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            return iInterface0 != null && iInterface0 instanceof IGoogleMapDelegate ? ((IGoogleMapDelegate)iInterface0) : new com.google.android.gms.maps.internal.IGoogleMapDelegate.zza.zza(iBinder0);
        }
    }

    zze addCircle(CircleOptions arg1) throws RemoteException;

    zzf addGroundOverlay(GroundOverlayOptions arg1) throws RemoteException;

    zzf addGroundOverlay2(GroundOverlayOptions arg1, GroundOverlayOptionsParcelable arg2) throws RemoteException;

    zzi addMarker(MarkerOptions arg1) throws RemoteException;

    zzi addMarker2(MarkerOptions arg1, MarkerOptionsParcelable arg2) throws RemoteException;

    zzj addPolygon(PolygonOptions arg1) throws RemoteException;

    IPolylineDelegate addPolyline(PolylineOptions arg1) throws RemoteException;

    zzk addTileOverlay(TileOverlayOptions arg1) throws RemoteException;

    void animateCamera(zzd arg1) throws RemoteException;

    void animateCamera2(CameraUpdateParcelable arg1) throws RemoteException;

    void animateCameraWithCallback(zzd arg1, zzb arg2) throws RemoteException;

    void animateCameraWithCallback2(CameraUpdateParcelable arg1, zzb arg2) throws RemoteException;

    void animateCameraWithDurationAndCallback(zzd arg1, int arg2, zzb arg3) throws RemoteException;

    void animateCameraWithDurationAndCallback2(CameraUpdateParcelable arg1, int arg2, zzb arg3) throws RemoteException;

    void clear() throws RemoteException;

    CameraPosition getCameraPosition() throws RemoteException;

    zzg getFocusedBuilding() throws RemoteException;

    void getMapAsync(zzm arg1) throws RemoteException;

    int getMapType() throws RemoteException;

    float getMaxZoomLevel() throws RemoteException;

    float getMinZoomLevel() throws RemoteException;

    Location getMyLocation() throws RemoteException;

    IProjectionDelegate getProjection() throws RemoteException;

    IUiSettingsDelegate getUiSettings() throws RemoteException;

    boolean isBuildingsEnabled() throws RemoteException;

    boolean isIndoorEnabled() throws RemoteException;

    boolean isMyLocationEnabled() throws RemoteException;

    boolean isTrafficEnabled() throws RemoteException;

    void moveCamera(zzd arg1) throws RemoteException;

    void moveCamera2(CameraUpdateParcelable arg1) throws RemoteException;

    void onCreate(Bundle arg1) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(Bundle arg1) throws RemoteException;

    void setBuildingsEnabled(boolean arg1) throws RemoteException;

    void setContentDescription(String arg1) throws RemoteException;

    boolean setIndoorEnabled(boolean arg1) throws RemoteException;

    void setInfoWindowAdapter(com.google.android.gms.maps.internal.zzd arg1) throws RemoteException;

    void setInfoWindowRenderer(com.google.android.gms.maps.internal.zze arg1) throws RemoteException;

    void setLocationSource(ILocationSourceDelegate arg1) throws RemoteException;

    void setMapType(int arg1) throws RemoteException;

    void setMyLocationEnabled(boolean arg1) throws RemoteException;

    void setOnCameraChangeListener(com.google.android.gms.maps.internal.zzf arg1) throws RemoteException;

    void setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzg arg1) throws RemoteException;

    void setOnInfoWindowClickListener(zzh arg1) throws RemoteException;

    void setOnMapClickListener(com.google.android.gms.maps.internal.zzj arg1) throws RemoteException;

    void setOnMapLoadedCallback(com.google.android.gms.maps.internal.zzk arg1) throws RemoteException;

    void setOnMapLongClickListener(zzl arg1) throws RemoteException;

    void setOnMarkerClickListener(zzn arg1) throws RemoteException;

    void setOnMarkerDragListener(zzo arg1) throws RemoteException;

    void setOnMyLocationButtonClickListener(zzp arg1) throws RemoteException;

    void setOnMyLocationChangeListener(zzq arg1) throws RemoteException;

    void setPadding(int arg1, int arg2, int arg3, int arg4) throws RemoteException;

    void setTrafficEnabled(boolean arg1) throws RemoteException;

    void snapshot(zzw arg1, zzd arg2) throws RemoteException;

    void stopAnimation() throws RemoteException;

    boolean useViewLifecycleWhenInFragment() throws RemoteException;
}

