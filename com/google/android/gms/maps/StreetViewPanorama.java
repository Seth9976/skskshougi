package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzr.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public class StreetViewPanorama {
    public interface OnStreetViewPanoramaCameraChangeListener {
        void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera arg1);
    }

    public interface OnStreetViewPanoramaChangeListener {
        void onStreetViewPanoramaChange(StreetViewPanoramaLocation arg1);
    }

    public interface OnStreetViewPanoramaClickListener {
        void onStreetViewPanoramaClick(StreetViewPanoramaOrientation arg1);
    }

    public interface OnStreetViewPanoramaLongClickListener {
        void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation arg1);
    }

    private final IStreetViewPanoramaDelegate zzaCj;

    protected StreetViewPanorama(IStreetViewPanoramaDelegate sv) {
        this.zzaCj = (IStreetViewPanoramaDelegate)zzu.zzu(sv);
    }

    public void animateTo(StreetViewPanoramaCamera camera, long duration) {
        try {
            this.zzaCj.animateTo(camera, duration);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public StreetViewPanoramaLocation getLocation() {
        try {
            return this.zzaCj.getStreetViewPanoramaLocation();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public StreetViewPanoramaCamera getPanoramaCamera() {
        try {
            return this.zzaCj.getPanoramaCamera();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isPanningGesturesEnabled() {
        try {
            return this.zzaCj.isPanningGesturesEnabled();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isStreetNamesEnabled() {
        try {
            return this.zzaCj.isStreetNamesEnabled();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isUserNavigationEnabled() {
        try {
            return this.zzaCj.isUserNavigationEnabled();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isZoomGesturesEnabled() {
        try {
            return this.zzaCj.isZoomGesturesEnabled();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public Point orientationToPoint(StreetViewPanoramaOrientation orientation) {
        try {
            zzd zzd0 = this.zzaCj.orientationToPoint(orientation);
            return zzd0 == null ? null : ((Point)zze.zzn(zzd0));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public StreetViewPanoramaOrientation pointToOrientation(Point point) {
        try {
            zzd zzd0 = zze.zzw(point);
            return this.zzaCj.pointToOrientation(zzd0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(OnStreetViewPanoramaCameraChangeListener listener) {
        try {
            if(listener == null) {
                this.zzaCj.setOnStreetViewPanoramaCameraChangeListener(null);
                return;
            }
            com.google.android.gms.maps.StreetViewPanorama.2 streetViewPanorama$20 = new zza() {
                @Override  // com.google.android.gms.maps.internal.zzr
                public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera camera) {
                    listener.onStreetViewPanoramaCameraChange(camera);
                }
            };
            this.zzaCj.setOnStreetViewPanoramaCameraChangeListener(streetViewPanorama$20);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setOnStreetViewPanoramaChangeListener(OnStreetViewPanoramaChangeListener listener) {
        try {
            if(listener == null) {
                this.zzaCj.setOnStreetViewPanoramaChangeListener(null);
                return;
            }
            com.google.android.gms.maps.StreetViewPanorama.1 streetViewPanorama$10 = new com.google.android.gms.maps.internal.zzs.zza() {
                @Override  // com.google.android.gms.maps.internal.zzs
                public void onStreetViewPanoramaChange(StreetViewPanoramaLocation location) {
                    listener.onStreetViewPanoramaChange(location);
                }
            };
            this.zzaCj.setOnStreetViewPanoramaChangeListener(streetViewPanorama$10);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setOnStreetViewPanoramaClickListener(OnStreetViewPanoramaClickListener listener) {
        try {
            if(listener == null) {
                this.zzaCj.setOnStreetViewPanoramaClickListener(null);
                return;
            }
            com.google.android.gms.maps.StreetViewPanorama.3 streetViewPanorama$30 = new com.google.android.gms.maps.internal.zzt.zza() {
                @Override  // com.google.android.gms.maps.internal.zzt
                public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation orientation) {
                    listener.onStreetViewPanoramaClick(orientation);
                }
            };
            this.zzaCj.setOnStreetViewPanoramaClickListener(streetViewPanorama$30);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public final void setOnStreetViewPanoramaLongClickListener(OnStreetViewPanoramaLongClickListener listener) {
        try {
            if(listener == null) {
                this.zzaCj.setOnStreetViewPanoramaLongClickListener(null);
                return;
            }
            com.google.android.gms.maps.StreetViewPanorama.4 streetViewPanorama$40 = new com.google.android.gms.maps.internal.zzu.zza() {
                @Override  // com.google.android.gms.maps.internal.zzu
                public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation orientation) {
                    listener.onStreetViewPanoramaLongClick(orientation);
                }
            };
            this.zzaCj.setOnStreetViewPanoramaLongClickListener(streetViewPanorama$40);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setPanningGesturesEnabled(boolean enablePanning) {
        try {
            this.zzaCj.enablePanning(enablePanning);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setPosition(LatLng position) {
        try {
            this.zzaCj.setPosition(position);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setPosition(LatLng position, int radius) {
        try {
            this.zzaCj.setPositionWithRadius(position, radius);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setPosition(String panoId) {
        try {
            this.zzaCj.setPositionWithID(panoId);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setStreetNamesEnabled(boolean enableStreetNames) {
        try {
            this.zzaCj.enableStreetNames(enableStreetNames);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setUserNavigationEnabled(boolean enableUserNavigation) {
        try {
            this.zzaCj.enableUserNavigation(enableUserNavigation);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setZoomGesturesEnabled(boolean enableZoom) {
        try {
            this.zzaCj.enableZoom(enableZoom);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    IStreetViewPanoramaDelegate zzvw() {
        return this.zzaCj;
    }
}

