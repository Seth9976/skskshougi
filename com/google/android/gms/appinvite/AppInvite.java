package com.google.android.gms.appinvite;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzix;

public final class AppInvite {
    public static final Api API;
    public static final AppInviteApi AppInviteApi;
    public static final ClientKey zzNX;
    private static final zza zzNY;

    static {
        AppInvite.zzNX = new ClientKey();
        AppInvite.zzNY = new zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzix zzb(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzix(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
            }
        };
        AppInvite.API = new Api("AppInvite.API", AppInvite.zzNY, AppInvite.zzNX, new Scope[0]);
        AppInvite.AppInviteApi = new zziw();
    }
}

