package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zzf;

public final class GroundOverlay {
    private final zzf zzaDc;

    public GroundOverlay(zzf delegate) {
        this.zzaDc = (zzf)zzu.zzu(delegate);
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof GroundOverlay)) {
            return false;
        }
        try {
            return this.zzaDc.zza(((GroundOverlay)other).zzaDc);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getBearing() {
        try {
            return this.zzaDc.getBearing();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public LatLngBounds getBounds() {
        try {
            return this.zzaDc.getBounds();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getHeight() {
        try {
            return this.zzaDc.getHeight();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public String getId() {
        try {
            return this.zzaDc.getId();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public LatLng getPosition() {
        try {
            return this.zzaDc.getPosition();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getTransparency() {
        try {
            return this.zzaDc.getTransparency();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getWidth() {
        try {
            return this.zzaDc.getWidth();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getZIndex() {
        try {
            return this.zzaDc.getZIndex();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    @Override
    public int hashCode() {
        try {
            return this.zzaDc.hashCodeRemote();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isVisible() {
        try {
            return this.zzaDc.isVisible();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void remove() {
        try {
            this.zzaDc.remove();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setBearing(float bearing) {
        try {
            this.zzaDc.setBearing(bearing);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setDimensions(float width) {
        try {
            this.zzaDc.setDimensions(width);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setDimensions(float width, float height) {
        try {
            this.zzaDc.zza(width, height);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setImage(BitmapDescriptor image) {
        try {
            this.zzaDc.zzu(image.zzvg());
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setPosition(LatLng latLng) {
        try {
            this.zzaDc.setPosition(latLng);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setPositionFromBounds(LatLngBounds bounds) {
        try {
            this.zzaDc.setPositionFromBounds(bounds);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setTransparency(float transparency) {
        try {
            this.zzaDc.setTransparency(transparency);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setVisible(boolean visible) {
        try {
            this.zzaDc.setVisible(visible);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setZIndex(float zIndex) {
        try {
            this.zzaDc.setZIndex(zIndex);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }
}

