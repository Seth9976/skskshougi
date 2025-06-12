package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.internal.CredentialsClientImpl;
import com.google.android.gms.auth.api.credentials.internal.zzc;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.internal.zzje;
import com.google.android.gms.internal.zzjf;
import com.google.android.gms.internal.zzjg;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjm;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;

public final class Auth {
    public static final class zza implements Optional {
        private final Bundle zzOR;

        public Bundle zzkY() {
            return new Bundle(this.zzOR);
        }
    }

    public static final ClientKey CLIENT_KEY_CREDENTIALS_API;
    public static final Api CREDENTIALS_API;
    public static final CredentialsApi CredentialsApi;
    public static final ClientKey zzOE;
    public static final ClientKey zzOF;
    public static final ClientKey zzOG;
    private static final com.google.android.gms.common.api.Api.zza zzOH;
    private static final com.google.android.gms.common.api.Api.zza zzOI;
    private static final com.google.android.gms.common.api.Api.zza zzOJ;
    private static final com.google.android.gms.common.api.Api.zza zzOK;
    public static final Api zzOL;
    public static final Api zzOM;
    public static final Api zzON;
    public static final com.google.android.gms.auth.api.proxy.zza zzOO;
    public static final zzje zzOP;
    public static final zzjn zzOQ;

    static {
        Auth.zzOE = new ClientKey();
        Auth.CLIENT_KEY_CREDENTIALS_API = new ClientKey();
        Auth.zzOF = new ClientKey();
        Auth.zzOG = new ClientKey();
        Auth.zzOH = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzjj zza(Context context0, Looper looper0, zze zze0, zza auth$zza0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzjj(context0, looper0, zze0, auth$zza0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
            }
        };
        Auth.zzOI = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public CredentialsClientImpl zzd(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new CredentialsClientImpl(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
            }
        };
        Auth.zzOJ = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzjg zze(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzjg(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
            }
        };
        Auth.zzOK = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzjq zzf(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzjq(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
            }
        };
        Auth.zzOL = new Api("Auth.PROXY_API", Auth.zzOH, Auth.zzOE, new Scope[0]);
        Auth.CREDENTIALS_API = new Api("Auth.CREDENTIALS_API", Auth.zzOI, Auth.CLIENT_KEY_CREDENTIALS_API, new Scope[0]);
        Auth.zzOM = new Api("Auth.SIGN_IN_API", Auth.zzOK, Auth.zzOG, new Scope[0]);
        Auth.zzON = new Api("Auth.ACCOUNT_STATUS_API", Auth.zzOJ, Auth.zzOF, new Scope[0]);
        Auth.zzOO = new zzjm();
        Auth.CredentialsApi = new zzc();
        Auth.zzOP = new zzjf();
        Auth.zzOQ = new zzjp();
    }
}

