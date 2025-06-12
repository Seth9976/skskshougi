package com.google.android.gms.location.copresence.internal;

import android.content.Context;
import com.google.android.gms.location.internal.zzn;

public class zzb {
    private final Context mContext;
    private final String zzOe;
    private final String zzOx;
    private final zzn zzayq;
    private final CopresenceApiOptions zzayr;
    private zzc zzays;

    private zzb(Context context0, String s, String s1, zzn zzn0, CopresenceApiOptions copresenceApiOptions0) {
        this.mContext = context0;
        this.zzOx = s;
        this.zzayq = zzn0;
        this.zzays = null;
        this.zzOe = s1;
        this.zzayr = copresenceApiOptions0;
    }

    public static zzb zza(Context context0, String s, String s1, zzn zzn0, CopresenceApiOptions copresenceApiOptions0) {
        return new zzb(context0, s, s1, zzn0, copresenceApiOptions0);
    }
}

