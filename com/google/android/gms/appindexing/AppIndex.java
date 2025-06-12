package com.google.android.gms.appindexing;

import com.google.android.gms.appdatasearch.zza;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.zziv;

public final class AppIndex {
    public static final Api API;
    public static final Api APP_INDEX_API;
    public static final AppIndexApi AppIndexApi;

    static {
        AppIndex.API = zza.zzMQ;
        AppIndex.APP_INDEX_API = zza.zzMQ;
        AppIndex.AppIndexApi = new zziv();
    }
}

