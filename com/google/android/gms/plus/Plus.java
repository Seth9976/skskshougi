package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzln;
import com.google.android.gms.internal.zzpa;
import com.google.android.gms.internal.zzpb;
import com.google.android.gms.internal.zzpc;
import com.google.android.gms.internal.zzpd;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.internal.zze;
import java.util.HashSet;
import java.util.Set;

public final class Plus {
    public static final class PlusOptions implements Optional {
        public static final class Builder {
            String zzaHb;
            final Set zzaHc;

            public Builder() {
                this.zzaHc = new HashSet();
            }

            public Builder addActivityTypes(String[] activityTypes) {
                zzu.zzb(activityTypes, "activityTypes may not be null.");
                for(int v = 0; v < activityTypes.length; ++v) {
                    this.zzaHc.add(activityTypes[v]);
                }
                return this;
            }

            public PlusOptions build() {
                return new PlusOptions(this, null);
            }

            public Builder setServerClientId(String clientId) {
                this.zzaHb = clientId;
                return this;
            }
        }

        final String zzaHb;
        final Set zzaHc;

        private PlusOptions() {
            this.zzaHb = null;
            this.zzaHc = new HashSet();
        }

        PlusOptions(com.google.android.gms.plus.Plus.1 x0) {
        }

        private PlusOptions(Builder builder) {
            this.zzaHb = builder.zzaHb;
            this.zzaHc = builder.zzaHc;
        }

        PlusOptions(Builder x0, com.google.android.gms.plus.Plus.1 x1) {
            this(x0);
        }

        public static Builder builder() {
            return new Builder();
        }
    }

    public static abstract class zza extends com.google.android.gms.common.api.zza.zza {
        public zza(GoogleApiClient googleApiClient0) {
            super(Plus.zzNX, googleApiClient0);
        }
    }

    public static final Api API;
    public static final Account AccountApi;
    public static final Moments MomentsApi;
    public static final People PeopleApi;
    public static final Scope SCOPE_PLUS_LOGIN;
    public static final Scope SCOPE_PLUS_PROFILE;
    public static final ClientKey zzNX;
    static final com.google.android.gms.common.api.Api.zza zzNY;
    public static final zzb zzaGZ;
    public static final com.google.android.gms.plus.zza zzaHa;

    static {
        Plus.zzNX = new ClientKey();
        Plus.zzNY = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 2;
            }

            public zze zza(Context context0, Looper looper0, com.google.android.gms.common.internal.zze zze0, PlusOptions plus$PlusOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                if(plus$PlusOptions0 == null) {
                    plus$PlusOptions0 = new PlusOptions(null);
                }
                String s = zze0.zzns();
                String[] arr_s = zzln.zzc(zze0.zznw());
                String[] arr_s1 = (String[])plus$PlusOptions0.zzaHc.toArray(new String[0]);
                PlusCommonExtras plusCommonExtras0 = new PlusCommonExtras();
                return new zze(context0, looper0, zze0, new PlusSession(s, arr_s, arr_s1, new String[0], "org.dyndns.vivi.SkskShogi", "org.dyndns.vivi.SkskShogi", null, plusCommonExtras0), googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
            }
        };
        Plus.API = new Api("Plus.API", Plus.zzNY, Plus.zzNX, new Scope[0]);
        Plus.SCOPE_PLUS_LOGIN = new Scope("https://www.googleapis.com/auth/plus.login");
        Plus.SCOPE_PLUS_PROFILE = new Scope("https://www.googleapis.com/auth/plus.me");
        Plus.MomentsApi = new zzpd();
        Plus.PeopleApi = new zzpe();
        Plus.AccountApi = new zzpa();
        Plus.zzaGZ = new zzpc();
        Plus.zzaHa = new zzpb();
    }

    public static zze zzf(GoogleApiClient googleApiClient0, boolean z) {
        zzu.zzb(googleApiClient0 != null, "GoogleApiClient parameter is required.");
        zzu.zza(googleApiClient0.isConnected(), "GoogleApiClient must be connected.");
        zzu.zza(googleApiClient0.zza(Plus.API), "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean z1 = googleApiClient0.hasConnectedApi(Plus.API);
        if(z && !z1) {
            throw new IllegalStateException("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
        }
        return z1 ? ((zze)googleApiClient0.zza(Plus.zzNX)) : null;
    }
}

