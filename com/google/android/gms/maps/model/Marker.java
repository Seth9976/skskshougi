package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zzi;

public final class Marker {
    private final zzi zzaDr;

    public Marker(zzi delegate) {
        this.zzaDr = (zzi)zzu.zzu(delegate);
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Marker)) {
            return false;
        }
        try {
            return this.zzaDr.zzh(((Marker)other).zzaDr);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getAlpha() {
        try {
            return this.zzaDr.getAlpha();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public String getId() {
        try {
            return this.zzaDr.getId();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public LatLng getPosition() {
        try {
            return this.zzaDr.getPosition();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getRotation() {
        try {
            return this.zzaDr.getRotation();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public String getSnippet() {
        try {
            return this.zzaDr.getSnippet();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public String getTitle() {
        try {
            return this.zzaDr.getTitle();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    @Override
    public int hashCode() {
        try {
            return this.zzaDr.hashCodeRemote();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void hideInfoWindow() {
        try {
            this.zzaDr.hideInfoWindow();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isDraggable() {
        try {
            return this.zzaDr.isDraggable();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isFlat() {
        try {
            return this.zzaDr.isFlat();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isInfoWindowShown() {
        try {
            return this.zzaDr.isInfoWindowShown();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isVisible() {
        try {
            return this.zzaDr.isVisible();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void remove() {
        try {
            this.zzaDr.remove();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setAlpha(float alpha) {
        try {
            this.zzaDr.setAlpha(alpha);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setAnchor(float anchorU, float anchorV) {
        try {
            this.zzaDr.setAnchor(anchorU, anchorV);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setDraggable(boolean draggable) {
        try {
            this.zzaDr.setDraggable(draggable);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setFlat(boolean flat) {
        try {
            this.zzaDr.setFlat(flat);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setIcon(BitmapDescriptor icon) {
        try {
            this.zzaDr.zzv(icon.zzvg());
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setInfoWindowAnchor(float anchorU, float anchorV) {
        try {
            this.zzaDr.setInfoWindowAnchor(anchorU, anchorV);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setPosition(LatLng latlng) {
        try {
            this.zzaDr.setPosition(latlng);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setRotation(float rotation) {
        try {
            this.zzaDr.setRotation(rotation);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setSnippet(String snippet) {
        try {
            this.zzaDr.setSnippet(snippet);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setTitle(String title) {
        try {
            this.zzaDr.setTitle(title);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setVisible(boolean visible) {
        try {
            this.zzaDr.setVisible(visible);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void showInfoWindow() {
        try {
            this.zzaDr.showInfoWindow();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }
}

