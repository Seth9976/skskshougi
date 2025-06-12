package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.panorama.Panorama;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;
import com.google.android.gms.panorama.PanoramaApi;

public class zzov implements PanoramaApi {
    static abstract class zza extends zzc {
        public zza(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return this.zzaN(x0);
        }

        protected PanoramaResult zzaN(Status status0) {
            return new zzox(status0, null);
        }
    }

    static final class zzb extends com.google.android.gms.internal.zzot.zza {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        @Override  // com.google.android.gms.internal.zzot
        public void zza(int v, Bundle bundle0, int v1, Intent intent0) {
            zzox zzox0 = new zzox(new Status(v, null, (bundle0 == null ? null : ((PendingIntent)bundle0.getParcelable("pendingIntent")))), intent0);
            this.zzOs.zzm(zzox0);
        }
    }

    static abstract class zzc extends com.google.android.gms.common.api.zza.zza {
        protected zzc(GoogleApiClient googleApiClient0) {
            super(Panorama.zzNX, googleApiClient0);
        }

        protected abstract void zza(Context arg1, zzou arg2) throws RemoteException;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((zzow)api$Client0));
        }

        protected final void zza(zzow zzow0) throws RemoteException {
            this.zza(zzow0.getContext(), ((zzou)zzow0.zznM()));
        }
    }

    @Override  // com.google.android.gms.panorama.PanoramaApi
    public PendingResult loadPanoramaInfo(GoogleApiClient client, Uri uri) {
        return client.zza(new zza(client) {
            @Override  // com.google.android.gms.internal.zzov$zzc
            protected void zza(Context context0, zzou zzou0) throws RemoteException {
                zzou0.zza(new zzb(this), uri, null, false);
            }
        });
    }

    @Override  // com.google.android.gms.panorama.PanoramaApi
    public PendingResult loadPanoramaInfoAndGrantAccess(GoogleApiClient client, Uri uri) {
        return client.zza(new zza(client) {
            @Override  // com.google.android.gms.internal.zzov$zzc
            protected void zza(Context context0, zzou zzou0) throws RemoteException {
                zzov.zza(context0, zzou0, new zzb(this), uri, null);
            }
        });
    }

    private static void zza(Context context0, Uri uri0) {
        context0.revokeUriPermission(uri0, 1);
    }

    private static void zza(Context context0, zzou zzou0, zzot zzot0, Uri uri0, Bundle bundle0) throws RemoteException {
        context0.grantUriPermission("com.google.android.gms", uri0, 1);
        com.google.android.gms.internal.zzov.3 zzov$30 = new com.google.android.gms.internal.zzot.zza() {
            @Override  // com.google.android.gms.internal.zzot
            public void zza(int v, Bundle bundle0, int v1, Intent intent0) throws RemoteException {
                zzov.zza(context0, uri0);
                zzot0.zza(v, bundle0, v1, intent0);
            }
        };
        try {
            zzou0.zza(zzov$30, uri0, bundle0, true);
        }
        catch(RemoteException remoteException0) {
            zzov.zza(context0, uri0);
            throw remoteException0;
        }
        catch(RuntimeException runtimeException0) {
            zzov.zza(context0, uri0);
            throw runtimeException0;
        }
    }
}

