package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zzd;

public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;
    private static zzd zzaCP;

    public static BitmapDescriptor defaultMarker() {
        try {
            return new BitmapDescriptor(BitmapDescriptorFactory.zzvH().zzvN());
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static BitmapDescriptor defaultMarker(float hue) {
        try {
            return new BitmapDescriptor(BitmapDescriptorFactory.zzvH().zzh(hue));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static BitmapDescriptor fromAsset(String assetName) {
        try {
            return new BitmapDescriptor(BitmapDescriptorFactory.zzvH().zzdu(assetName));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static BitmapDescriptor fromBitmap(Bitmap image) {
        try {
            return new BitmapDescriptor(BitmapDescriptorFactory.zzvH().zzb(image));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static BitmapDescriptor fromFile(String fileName) {
        try {
            return new BitmapDescriptor(BitmapDescriptorFactory.zzvH().zzdv(fileName));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static BitmapDescriptor fromPath(String absolutePath) {
        try {
            return new BitmapDescriptor(BitmapDescriptorFactory.zzvH().zzdw(absolutePath));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static BitmapDescriptor fromResource(int resourceId) {
        try {
            return new BitmapDescriptor(BitmapDescriptorFactory.zzvH().zzhD(resourceId));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }

    public static void zza(zzd zzd0) {
        if(BitmapDescriptorFactory.zzaCP != null) {
            return;
        }
        BitmapDescriptorFactory.zzaCP = (zzd)zzu.zzu(zzd0);
    }

    private static zzd zzvH() {
        return (zzd)zzu.zzb(BitmapDescriptorFactory.zzaCP, "IBitmapDescriptorFactory is not initialized");
    }
}

