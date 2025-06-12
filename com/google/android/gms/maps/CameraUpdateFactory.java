package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class CameraUpdateFactory {
    private static ICameraUpdateFactoryDelegate zzaBo;

    public static CameraUpdate newCameraPosition(CameraPosition cameraPosition) {
        try {
            return new CameraUpdate(CameraUpdateFactory.zzvh().newCameraPosition(cameraPosition));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static CameraUpdate newLatLng(LatLng latLng) {
        try {
            return new CameraUpdate(CameraUpdateFactory.zzvh().newLatLng(latLng));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds bounds, int padding) {
        try {
            return new CameraUpdate(CameraUpdateFactory.zzvh().newLatLngBounds(bounds, padding));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds bounds, int width, int height, int padding) {
        try {
            return new CameraUpdate(CameraUpdateFactory.zzvh().newLatLngBoundsWithSize(bounds, width, height, padding));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static CameraUpdate newLatLngZoom(LatLng latLng, float zoom) {
        try {
            return new CameraUpdate(CameraUpdateFactory.zzvh().newLatLngZoom(latLng, zoom));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static CameraUpdate scrollBy(float xPixel, float yPixel) {
        try {
            return new CameraUpdate(CameraUpdateFactory.zzvh().scrollBy(xPixel, yPixel));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static CameraUpdate zoomBy(float amount) {
        try {
            return new CameraUpdate(CameraUpdateFactory.zzvh().zoomBy(amount));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static CameraUpdate zoomBy(float amount, Point focus) {
        try {
            return new CameraUpdate(CameraUpdateFactory.zzvh().zoomByWithFocus(amount, focus.x, focus.y));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static CameraUpdate zoomIn() {
        try {
            return new CameraUpdate(CameraUpdateFactory.zzvh().zoomIn());
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static CameraUpdate zoomOut() {
        try {
            return new CameraUpdate(CameraUpdateFactory.zzvh().zoomOut());
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static CameraUpdate zoomTo(float zoom) {
        try {
            return new CameraUpdate(CameraUpdateFactory.zzvh().zoomTo(zoom));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static void zza(ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate0) {
        CameraUpdateFactory.zzaBo = (ICameraUpdateFactoryDelegate)zzu.zzu(iCameraUpdateFactoryDelegate0);
    }

    private static ICameraUpdateFactoryDelegate zzvh() {
        return (ICameraUpdateFactoryDelegate)zzu.zzb(CameraUpdateFactory.zzaBo, "CameraUpdateFactory is not initialized");
    }
}

