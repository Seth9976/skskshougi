package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;

public final class zzx {
    public static void zza(Bundle bundle0, String s, Parcelable parcelable0) {
        bundle0.setClassLoader(zzx.class.getClassLoader());
        Bundle bundle1 = bundle0.getBundle("map_state");
        if(bundle1 == null) {
            bundle1 = new Bundle();
        }
        bundle1.setClassLoader(zzx.class.getClassLoader());
        bundle1.putParcelable(s, parcelable0);
        bundle0.putBundle("map_state", bundle1);
    }
}

