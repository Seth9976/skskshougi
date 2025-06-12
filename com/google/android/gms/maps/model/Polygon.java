package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zzj;
import java.util.List;

public final class Polygon {
    private final zzj zzaDz;

    public Polygon(zzj delegate) {
        this.zzaDz = (zzj)zzu.zzu(delegate);
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Polygon)) {
            return false;
        }
        try {
            return this.zzaDz.zza(((Polygon)other).zzaDz);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public int getFillColor() {
        try {
            return this.zzaDz.getFillColor();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public List getHoles() {
        try {
            return this.zzaDz.getHoles();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public String getId() {
        try {
            return this.zzaDz.getId();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public List getPoints() {
        try {
            return this.zzaDz.getPoints();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public int getStrokeColor() {
        try {
            return this.zzaDz.getStrokeColor();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getStrokeWidth() {
        try {
            return this.zzaDz.getStrokeWidth();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getZIndex() {
        try {
            return this.zzaDz.getZIndex();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    @Override
    public int hashCode() {
        try {
            return this.zzaDz.hashCodeRemote();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isGeodesic() {
        try {
            return this.zzaDz.isGeodesic();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isVisible() {
        try {
            return this.zzaDz.isVisible();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void remove() {
        try {
            this.zzaDz.remove();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setFillColor(int color) {
        try {
            this.zzaDz.setFillColor(color);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setGeodesic(boolean geodesic) {
        try {
            this.zzaDz.setGeodesic(geodesic);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setHoles(List list0) {
        try {
            this.zzaDz.setHoles(list0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setPoints(List list0) {
        try {
            this.zzaDz.setPoints(list0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setStrokeColor(int color) {
        try {
            this.zzaDz.setStrokeColor(color);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setStrokeWidth(float width) {
        try {
            this.zzaDz.setStrokeWidth(width);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setVisible(boolean visible) {
        try {
            this.zzaDz.setVisible(visible);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setZIndex(float zIndex) {
        try {
            this.zzaDz.setZIndex(zIndex);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }
}

