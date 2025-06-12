package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class MapsInitializer {
    public static int initialize(Context context) {
        zzc zzc0;
        zzu.zzu(context);
        try {
            zzc0 = zzy.zzay(context);
        }
        catch(GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException0) {
            return googlePlayServicesNotAvailableException0.errorCode;
        }
        MapsInitializer.zza(zzc0);
        return 0;
    }

    public static void zza(zzc zzc0) {
        try {
            CameraUpdateFactory.zza(zzc0.zzvC());
            BitmapDescriptorFactory.zza(zzc0.zzvD());
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeRemoteException(remoteException0);
        }
    }
}

