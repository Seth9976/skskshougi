package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import android.view.Display;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzka;
import com.google.android.gms.internal.zzkb;

public final class CastRemoteDisplay {
    public static final class CastRemoteDisplayOptions implements HasOptions {
        public static final class Builder {
            CastDevice zzQH;
            CastRemoteDisplaySessionCallbacks zzQV;

            public Builder(CastDevice castDevice, CastRemoteDisplaySessionCallbacks callbacks) {
                zzu.zzb(castDevice, "CastDevice parameter cannot be null");
                this.zzQH = castDevice;
                this.zzQV = callbacks;
            }

            public CastRemoteDisplayOptions build() {
                return new CastRemoteDisplayOptions(this, null);
            }
        }

        final CastDevice zzQE;
        final CastRemoteDisplaySessionCallbacks zzQU;

        private CastRemoteDisplayOptions(Builder builder) {
            this.zzQE = builder.zzQH;
            this.zzQU = builder.zzQV;
        }

        CastRemoteDisplayOptions(Builder x0, com.google.android.gms.cast.CastRemoteDisplay.1 x1) {
            this(x0);
        }
    }

    public interface CastRemoteDisplaySessionCallbacks {
        void onRemoteDisplayEnded(Status arg1);
    }

    public interface CastRemoteDisplaySessionResult extends Result {
        Display getPresentationDisplay();
    }

    public static final Api API;
    public static final CastRemoteDisplayApi CastRemoteDisplayApi;
    private static final ClientKey zzNX;
    private static final zza zzNY;

    static {
        CastRemoteDisplay.zzNX = new ClientKey();
        CastRemoteDisplay.zzNY = new zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzkb zza(Context context0, Looper looper0, zze zze0, CastRemoteDisplayOptions castRemoteDisplay$CastRemoteDisplayOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzkb(context0, looper0, castRemoteDisplay$CastRemoteDisplayOptions0.zzQE, castRemoteDisplay$CastRemoteDisplayOptions0.zzQU, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
            }
        };
        CastRemoteDisplay.API = new Api("CastRemoteDisplay.API", CastRemoteDisplay.zzNY, CastRemoteDisplay.zzNX, new Scope[0]);
        CastRemoteDisplay.CastRemoteDisplayApi = new zzka(CastRemoteDisplay.zzNX);
    }
}

