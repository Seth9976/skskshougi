package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import java.util.List;

public final class Polyline {
    private final IPolylineDelegate zzaDD;

    public Polyline(IPolylineDelegate delegate) {
        this.zzaDD = (IPolylineDelegate)zzu.zzu(delegate);
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Polyline)) {
            return false;
        }
        try {
            return this.zzaDD.equalsRemote(((Polyline)other).zzaDD);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public int getColor() {
        try {
            return this.zzaDD.getColor();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public String getId() {
        try {
            return this.zzaDD.getId();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public List getPoints() {
        try {
            return this.zzaDD.getPoints();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getWidth() {
        try {
            return this.zzaDD.getWidth();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public float getZIndex() {
        try {
            return this.zzaDD.getZIndex();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    @Override
    public int hashCode() {
        try {
            return this.zzaDD.hashCodeRemote();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isGeodesic() {
        try {
            return this.zzaDD.isGeodesic();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public boolean isVisible() {
        try {
            return this.zzaDD.isVisible();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void remove() {
        try {
            this.zzaDD.remove();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setColor(int color) {
        try {
            this.zzaDD.setColor(color);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setGeodesic(boolean geodesic) {
        try {
            this.zzaDD.setGeodesic(geodesic);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setPoints(List list0) {
        try {
            this.zzaDD.setPoints(list0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setVisible(boolean visible) {
        try {
            this.zzaDD.setVisible(visible);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setWidth(float width) {
        try {
            this.zzaDD.setWidth(width);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public void setZIndex(float zIndex) {
        try {
            this.zzaDD.setZIndex(zIndex);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }
}

