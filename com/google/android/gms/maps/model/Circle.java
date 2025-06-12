package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zze;

public final class Circle {
    private final zze zzaCU;

    public Circle(zze delegate) {
        this.zzaCU = (zze)zzu.zzu(delegate);
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Circle)) {
            return false;
        }
        try {
            return this.zzaCU.zza(((Circle)other).zzaCU);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public LatLng getCenter() {
        try {
            return this.zzaCU.getCenter();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public int getFillColor() {
        try {
            return this.zzaCU.getFillColor();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public String getId() {
        try {
            return this.zzaCU.getId();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public double getRadius() {
        try {
            return this.zzaCU.getRadius();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public int getStrokeColor() {
        try {
            return this.zzaCU.getStrokeColor();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getStrokeWidth() {
        try {
            return this.zzaCU.getStrokeWidth();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getZIndex() {
        try {
            return this.zzaCU.getZIndex();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    @Override
    public int hashCode() {
        try {
            return this.zzaCU.hashCodeRemote();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isVisible() {
        try {
            return this.zzaCU.isVisible();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void remove() {
        try {
            this.zzaCU.remove();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setCenter(LatLng center) {
        try {
            this.zzaCU.setCenter(center);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setFillColor(int color) {
        try {
            this.zzaCU.setFillColor(color);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setRadius(double radius) {
        try {
            this.zzaCU.setRadius(radius);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setStrokeColor(int color) {
        try {
            this.zzaCU.setStrokeColor(color);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setStrokeWidth(float width) {
        try {
            this.zzaCU.setStrokeWidth(width);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setVisible(boolean visible) {
        try {
            this.zzaCU.setVisible(visible);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setZIndex(float zIndex) {
        try {
            this.zzaCU.setZIndex(zIndex);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }
}

