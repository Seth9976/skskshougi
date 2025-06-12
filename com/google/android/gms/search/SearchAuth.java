package com.google.android.gms.search;

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
import com.google.android.gms.internal.zzpo;
import com.google.android.gms.internal.zzpp;

public class SearchAuth {
    public static class StatusCodes {
        public static final int AUTH_DISABLED = 10000;
        public static final int AUTH_THROTTLED = 10001;
        public static final int DEVELOPER_ERROR = 10;
        public static final int INTERNAL_ERROR = 8;
        public static final int SUCCESS;

    }

    public static final Api API;
    public static final SearchAuthApi SearchAuthApi;
    public static final ClientKey zzNX;
    private static final zza zzaJH;

    static {
        SearchAuth.zzaJH = new zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzpo zzu(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzpo(context0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
            }
        };
        SearchAuth.zzNX = new ClientKey();
        SearchAuth.API = new Api("SearchAuth.API", SearchAuth.zzaJH, SearchAuth.zzNX, new Scope[0]);
        SearchAuth.SearchAuthApi = new zzpp();
    }
}

