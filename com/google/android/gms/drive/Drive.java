package com.google.android.gms.drive;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.drive.internal.zzaa;
import com.google.android.gms.drive.internal.zzq;
import com.google.android.gms.drive.internal.zzs;
import com.google.android.gms.drive.internal.zzv;
import com.google.android.gms.drive.internal.zzy;

public final class Drive {
    public static abstract class zza implements com.google.android.gms.common.api.Api.zza {
        @Override  // com.google.android.gms.common.api.Api$zza
        public int getPriority() {
            return 0x7FFFFFFF;
        }

        protected abstract Bundle zza(ApiOptions arg1);

        @Override  // com.google.android.gms.common.api.Api$zza
        public Client zza(Context context0, Looper looper0, zze zze0, Object object0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            return this.zza(context0, looper0, zze0, ((ApiOptions)object0), googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        }

        public zzs zza(Context context0, Looper looper0, zze zze0, ApiOptions api$ApiOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            return new zzs(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, this.zza(api$ApiOptions0));
        }
    }

    public static class zzb implements Optional {
        private final Bundle zzNW;

        private zzb() {
            this(new Bundle());
        }

        private zzb(Bundle bundle0) {
            this.zzNW = bundle0;
        }

        public Bundle zzpd() {
            return this.zzNW;
        }
    }

    public static final Api API;
    public static final DriveApi DriveApi;
    public static final DrivePreferencesApi DrivePreferencesApi;
    public static final Scope SCOPE_APPFOLDER;
    public static final Scope SCOPE_FILE;
    public static final ClientKey zzNX;
    public static final Scope zzacY;
    public static final Scope zzacZ;
    public static final Api zzada;
    public static final zzc zzadb;
    public static final zzf zzadc;

    static {
        Drive.zzNX = new ClientKey();
        Drive.SCOPE_FILE = new Scope("https://www.googleapis.com/auth/drive.file");
        Drive.SCOPE_APPFOLDER = new Scope("https://www.googleapis.com/auth/drive.appdata");
        Drive.zzacY = new Scope("https://www.googleapis.com/auth/drive");
        Drive.zzacZ = new Scope("https://www.googleapis.com/auth/drive.apps");
        Drive.API = new Api("Drive.API", new zza() {
            protected Bundle zza(NoOptions api$ApiOptions$NoOptions0) {
                return new Bundle();
            }
        }, Drive.zzNX, new Scope[0]);
        Drive.zzada = new Api("Drive.INTERNAL_API", new zza() {
            protected Bundle zza(zzb drive$zzb0) {
                return drive$zzb0 == null ? new Bundle() : drive$zzb0.zzpd();
            }
        }, Drive.zzNX, new Scope[0]);
        Drive.DriveApi = new zzq();
        Drive.zzadb = new zzv();
        Drive.zzadc = new zzaa();
        Drive.DrivePreferencesApi = new zzy();
    }
}

