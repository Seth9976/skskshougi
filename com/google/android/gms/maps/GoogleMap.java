package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.zzf;
import com.google.android.gms.maps.model.internal.zzg;
import com.google.android.gms.maps.model.internal.zzi;
import com.google.android.gms.maps.model.internal.zzk;

public final class GoogleMap {
    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        View getInfoContents(Marker arg1);

        View getInfoWindow(Marker arg1);
    }

    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition arg1);
    }

    public interface OnIndoorStateChangeListener {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(IndoorBuilding arg1);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker arg1);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng arg1);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng arg1);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker arg1);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker arg1);

        void onMarkerDragEnd(Marker arg1);

        void onMarkerDragStart(Marker arg1);
    }

    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    @Deprecated
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(Location arg1);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap arg1);
    }

    static final class zza extends com.google.android.gms.maps.internal.zzb.zza {
        private final CancelableCallback zzaBH;

        zza(CancelableCallback googleMap$CancelableCallback0) {
            this.zzaBH = googleMap$CancelableCallback0;
        }

        @Override  // com.google.android.gms.maps.internal.zzb
        public void onCancel() {
            this.zzaBH.onCancel();
        }

        @Override  // com.google.android.gms.maps.internal.zzb
        public void onFinish() {
            this.zzaBH.onFinish();
        }
    }

    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final IGoogleMapDelegate zzaBp;
    private UiSettings zzaBq;

    protected GoogleMap(IGoogleMapDelegate map) {
        this.zzaBp = (IGoogleMapDelegate)zzu.zzu(map);
    }

    public final Circle addCircle(CircleOptions options) {
        try {
            return new Circle(this.zzaBp.addCircle(options));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final GroundOverlay addGroundOverlay(GroundOverlayOptions options) {
        try {
            zzf zzf0 = this.zzaBp.addGroundOverlay(options);
            return zzf0 == null ? null : new GroundOverlay(zzf0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final Marker addMarker(MarkerOptions options) {
        try {
            zzi zzi0 = this.zzaBp.addMarker(options);
            return zzi0 == null ? null : new Marker(zzi0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final Polygon addPolygon(PolygonOptions options) {
        try {
            return new Polygon(this.zzaBp.addPolygon(options));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final Polyline addPolyline(PolylineOptions options) {
        try {
            return new Polyline(this.zzaBp.addPolyline(options));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final TileOverlay addTileOverlay(TileOverlayOptions options) {
        try {
            zzk zzk0 = this.zzaBp.addTileOverlay(options);
            return zzk0 == null ? null : new TileOverlay(zzk0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void animateCamera(CameraUpdate update) {
        try {
            this.zzaBp.animateCamera(update.zzvg());
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void animateCamera(CameraUpdate update, int durationMs, CancelableCallback callback) {
        try {
            zza googleMap$zza0 = callback == null ? null : new zza(callback);
            this.zzaBp.animateCameraWithDurationAndCallback(update.zzvg(), durationMs, googleMap$zza0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void animateCamera(CameraUpdate update, CancelableCallback callback) {
        try {
            zza googleMap$zza0 = callback == null ? null : new zza(callback);
            this.zzaBp.animateCameraWithCallback(update.zzvg(), googleMap$zza0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void clear() {
        try {
            this.zzaBp.clear();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final CameraPosition getCameraPosition() {
        try {
            return this.zzaBp.getCameraPosition();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public IndoorBuilding getFocusedBuilding() {
        try {
            zzg zzg0 = this.zzaBp.getFocusedBuilding();
            return zzg0 == null ? null : new IndoorBuilding(zzg0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final int getMapType() {
        try {
            return this.zzaBp.getMapType();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final float getMaxZoomLevel() {
        try {
            return this.zzaBp.getMaxZoomLevel();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final float getMinZoomLevel() {
        try {
            return this.zzaBp.getMinZoomLevel();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    @Deprecated
    public final Location getMyLocation() {
        try {
            return this.zzaBp.getMyLocation();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final Projection getProjection() {
        try {
            return new Projection(this.zzaBp.getProjection());
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final UiSettings getUiSettings() {
        try {
            if(this.zzaBq == null) {
                this.zzaBq = new UiSettings(this.zzaBp.getUiSettings());
            }
            return this.zzaBq;
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final boolean isBuildingsEnabled() {
        try {
            return this.zzaBp.isBuildingsEnabled();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final boolean isIndoorEnabled() {
        try {
            return this.zzaBp.isIndoorEnabled();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final boolean isMyLocationEnabled() {
        try {
            return this.zzaBp.isMyLocationEnabled();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return this.zzaBp.isTrafficEnabled();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void moveCamera(CameraUpdate update) {
        try {
            this.zzaBp.moveCamera(update.zzvg());
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setBuildingsEnabled(boolean enabled) {
        try {
            this.zzaBp.setBuildingsEnabled(enabled);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setContentDescription(String description) {
        try {
            this.zzaBp.setContentDescription(description);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final boolean setIndoorEnabled(boolean enabled) {
        try {
            return this.zzaBp.setIndoorEnabled(enabled);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setInfoWindowAdapter(InfoWindowAdapter adapter) {
        try {
            if(adapter == null) {
                this.zzaBp.setInfoWindowAdapter(null);
                return;
            }
            com.google.android.gms.maps.GoogleMap.13 googleMap$130 = new com.google.android.gms.maps.internal.zzd.zza() {
                @Override  // com.google.android.gms.maps.internal.zzd
                public zzd zzf(zzi zzi0) {
                    Marker marker0 = new Marker(zzi0);
                    return zze.zzw(adapter.getInfoWindow(marker0));
                }

                @Override  // com.google.android.gms.maps.internal.zzd
                public zzd zzg(zzi zzi0) {
                    Marker marker0 = new Marker(zzi0);
                    return zze.zzw(adapter.getInfoContents(marker0));
                }
            };
            this.zzaBp.setInfoWindowAdapter(googleMap$130);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setLocationSource(LocationSource source) {
        try {
            if(source == null) {
                this.zzaBp.setLocationSource(null);
                return;
            }
            com.google.android.gms.maps.GoogleMap.6 googleMap$60 = new com.google.android.gms.maps.internal.ILocationSourceDelegate.zza() {
                @Override  // com.google.android.gms.maps.internal.ILocationSourceDelegate
                public void activate(com.google.android.gms.maps.internal.zzi listener) {
                    com.google.android.gms.maps.GoogleMap.6.1 googleMap$6$10 = new OnLocationChangedListener() {
                        @Override  // com.google.android.gms.maps.LocationSource$OnLocationChangedListener
                        public void onLocationChanged(Location location) {
                            try {
                                listener.zzd(location);
                            }
                            catch(RemoteException remoteException0) {
                                throw new RuntimeRemoteException(remoteException0);
                            }
                        }
                    };
                    source.activate(googleMap$6$10);
                }

                @Override  // com.google.android.gms.maps.internal.ILocationSourceDelegate
                public void deactivate() {
                    source.deactivate();
                }
            };
            this.zzaBp.setLocationSource(googleMap$60);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setMapType(int type) {
        try {
            this.zzaBp.setMapType(type);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setMyLocationEnabled(boolean enabled) {
        try {
            this.zzaBp.setMyLocationEnabled(enabled);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setOnCameraChangeListener(OnCameraChangeListener listener) {
        try {
            if(listener == null) {
                this.zzaBp.setOnCameraChangeListener(null);
                return;
            }
            com.google.android.gms.maps.GoogleMap.7 googleMap$70 = new com.google.android.gms.maps.internal.zzf.zza() {
                @Override  // com.google.android.gms.maps.internal.zzf
                public void onCameraChange(CameraPosition position) {
                    listener.onCameraChange(position);
                }
            };
            this.zzaBp.setOnCameraChangeListener(googleMap$70);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setOnIndoorStateChangeListener(OnIndoorStateChangeListener listener) {
        try {
            if(listener == null) {
                this.zzaBp.setOnIndoorStateChangeListener(null);
                return;
            }
            com.google.android.gms.maps.GoogleMap.1 googleMap$10 = new com.google.android.gms.maps.internal.zzg.zza() {
                @Override  // com.google.android.gms.maps.internal.zzg
                public void onIndoorBuildingFocused() {
                    listener.onIndoorBuildingFocused();
                }

                @Override  // com.google.android.gms.maps.internal.zzg
                public void zza(zzg zzg0) {
                    IndoorBuilding indoorBuilding0 = new IndoorBuilding(zzg0);
                    listener.onIndoorLevelActivated(indoorBuilding0);
                }
            };
            this.zzaBp.setOnIndoorStateChangeListener(googleMap$10);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setOnInfoWindowClickListener(OnInfoWindowClickListener listener) {
        try {
            if(listener == null) {
                this.zzaBp.setOnInfoWindowClickListener(null);
                return;
            }
            com.google.android.gms.maps.GoogleMap.12 googleMap$120 = new com.google.android.gms.maps.internal.zzh.zza() {
                @Override  // com.google.android.gms.maps.internal.zzh
                public void zze(zzi zzi0) {
                    Marker marker0 = new Marker(zzi0);
                    listener.onInfoWindowClick(marker0);
                }
            };
            this.zzaBp.setOnInfoWindowClickListener(googleMap$120);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setOnMapClickListener(OnMapClickListener listener) {
        try {
            if(listener == null) {
                this.zzaBp.setOnMapClickListener(null);
                return;
            }
            com.google.android.gms.maps.GoogleMap.8 googleMap$80 = new com.google.android.gms.maps.internal.zzj.zza() {
                @Override  // com.google.android.gms.maps.internal.zzj
                public void onMapClick(LatLng point) {
                    listener.onMapClick(point);
                }
            };
            this.zzaBp.setOnMapClickListener(googleMap$80);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setOnMapLoadedCallback(OnMapLoadedCallback callback) {
        try {
            if(callback == null) {
                this.zzaBp.setOnMapLoadedCallback(null);
                return;
            }
            com.google.android.gms.maps.GoogleMap.4 googleMap$40 = new com.google.android.gms.maps.internal.zzk.zza() {
                @Override  // com.google.android.gms.maps.internal.zzk
                public void onMapLoaded() throws RemoteException {
                    callback.onMapLoaded();
                }
            };
            this.zzaBp.setOnMapLoadedCallback(googleMap$40);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setOnMapLongClickListener(OnMapLongClickListener listener) {
        try {
            if(listener == null) {
                this.zzaBp.setOnMapLongClickListener(null);
                return;
            }
            com.google.android.gms.maps.GoogleMap.9 googleMap$90 = new com.google.android.gms.maps.internal.zzl.zza() {
                @Override  // com.google.android.gms.maps.internal.zzl
                public void onMapLongClick(LatLng point) {
                    listener.onMapLongClick(point);
                }
            };
            this.zzaBp.setOnMapLongClickListener(googleMap$90);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener listener) {
        try {
            if(listener == null) {
                this.zzaBp.setOnMarkerClickListener(null);
                return;
            }
            com.google.android.gms.maps.GoogleMap.10 googleMap$100 = new com.google.android.gms.maps.internal.zzn.zza() {
                @Override  // com.google.android.gms.maps.internal.zzn
                public boolean zza(zzi zzi0) {
                    Marker marker0 = new Marker(zzi0);
                    return listener.onMarkerClick(marker0);
                }
            };
            this.zzaBp.setOnMarkerClickListener(googleMap$100);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener listener) {
        try {
            if(listener == null) {
                this.zzaBp.setOnMarkerDragListener(null);
                return;
            }
            com.google.android.gms.maps.GoogleMap.11 googleMap$110 = new com.google.android.gms.maps.internal.zzo.zza() {
                @Override  // com.google.android.gms.maps.internal.zzo
                public void zzb(zzi zzi0) {
                    Marker marker0 = new Marker(zzi0);
                    listener.onMarkerDragStart(marker0);
                }

                @Override  // com.google.android.gms.maps.internal.zzo
                public void zzc(zzi zzi0) {
                    Marker marker0 = new Marker(zzi0);
                    listener.onMarkerDragEnd(marker0);
                }

                @Override  // com.google.android.gms.maps.internal.zzo
                public void zzd(zzi zzi0) {
                    Marker marker0 = new Marker(zzi0);
                    listener.onMarkerDrag(marker0);
                }
            };
            this.zzaBp.setOnMarkerDragListener(googleMap$110);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setOnMyLocationButtonClickListener(OnMyLocationButtonClickListener listener) {
        try {
            if(listener == null) {
                this.zzaBp.setOnMyLocationButtonClickListener(null);
                return;
            }
            com.google.android.gms.maps.GoogleMap.3 googleMap$30 = new com.google.android.gms.maps.internal.zzp.zza() {
                @Override  // com.google.android.gms.maps.internal.zzp
                public boolean onMyLocationButtonClick() throws RemoteException {
                    return listener.onMyLocationButtonClick();
                }
            };
            this.zzaBp.setOnMyLocationButtonClickListener(googleMap$30);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    @Deprecated
    public final void setOnMyLocationChangeListener(OnMyLocationChangeListener listener) {
        try {
            if(listener == null) {
                this.zzaBp.setOnMyLocationChangeListener(null);
                return;
            }
            com.google.android.gms.maps.GoogleMap.2 googleMap$20 = new com.google.android.gms.maps.internal.zzq.zza() {
                @Override  // com.google.android.gms.maps.internal.zzq
                public void zzc(Location location0) {
                    listener.onMyLocationChange(location0);
                }

                @Override  // com.google.android.gms.maps.internal.zzq
                public void zzo(zzd zzd0) {
                    Location location0 = (Location)zze.zzn(zzd0);
                    listener.onMyLocationChange(location0);
                }
            };
            this.zzaBp.setOnMyLocationChangeListener(googleMap$20);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setPadding(int left, int top, int right, int bottom) {
        try {
            this.zzaBp.setPadding(left, top, right, bottom);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setTrafficEnabled(boolean enabled) {
        try {
            this.zzaBp.setTrafficEnabled(enabled);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void snapshot(SnapshotReadyCallback callback) {
        this.snapshot(callback, null);
    }

    public final void snapshot(SnapshotReadyCallback callback, Bitmap bitmap) {
        zze zze0 = (zze)(bitmap == null ? null : zze.zzw(bitmap));
        try {
            com.google.android.gms.maps.GoogleMap.5 googleMap$50 = new com.google.android.gms.maps.internal.zzw.zza() {
                @Override  // com.google.android.gms.maps.internal.zzw
                public void onSnapshotReady(Bitmap snapshot) throws RemoteException {
                    callback.onSnapshotReady(snapshot);
                }

                @Override  // com.google.android.gms.maps.internal.zzw
                public void zzp(zzd zzd0) throws RemoteException {
                    Bitmap bitmap0 = (Bitmap)zze.zzn(zzd0);
                    callback.onSnapshotReady(bitmap0);
                }
            };
            this.zzaBp.snapshot(googleMap$50, zze0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void stopAnimation() {
        try {
            this.zzaBp.stopAnimation();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    IGoogleMapDelegate zzvi() {
        return this.zzaBp;
    }
}

