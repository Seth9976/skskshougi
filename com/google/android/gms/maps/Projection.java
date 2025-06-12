package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;

public final class Projection {
    private final IProjectionDelegate zzaCi;

    Projection(IProjectionDelegate delegate) {
        this.zzaCi = delegate;
    }

    public LatLng fromScreenLocation(Point point) {
        try {
            zzd zzd0 = zze.zzw(point);
            return this.zzaCi.fromScreenLocation(zzd0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public VisibleRegion getVisibleRegion() {
        try {
            return this.zzaCi.getVisibleRegion();
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public Point toScreenLocation(LatLng location) {
        try {
            return (Point)zze.zzn(this.zzaCi.toScreenLocation(location));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }
}

