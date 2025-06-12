package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.internal.zzlf;

public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel {
    protected static boolean zzd(Integer integer0) {
        return integer0 == null ? false : zzlf.zzbQ(((int)integer0));
    }
}

