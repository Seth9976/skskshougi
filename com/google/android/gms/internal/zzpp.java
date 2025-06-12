package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;
import com.google.android.gms.search.SearchAuth;
import com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult;
import com.google.android.gms.search.SearchAuthApi;

public class zzpp implements SearchAuthApi {
    static abstract class zza extends com.google.android.gms.internal.zzpm.zza {
        @Override  // com.google.android.gms.internal.zzpm
        public void zza(Status status0, GoogleNowAuthState googleNowAuthState0) {
            throw new UnsupportedOperationException();
        }
    }

    static class zzb extends com.google.android.gms.common.api.zza.zza {
        private final GoogleApiClient zzRa;
        private final String zzaJI;
        private final boolean zzaJJ;

        protected zzb(GoogleApiClient googleApiClient0, String s) {
            super(SearchAuth.zzNX, googleApiClient0);
            this.zzaJJ = Log.isLoggable("SearchAuth", 3);
            this.zzRa = googleApiClient0;
            this.zzaJI = s;
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return this.zzaS(x0);
        }

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((zzpo)api$Client0));
        }

        protected void zza(zzpo zzpo0) throws RemoteException {
            if(this.zzaJJ) {
                Log.d("SearchAuth", "GetGoogleNowAuthImpl started");
            }
            com.google.android.gms.internal.zzpp.zzb.1 zzpp$zzb$10 = new zza() {
                @Override  // com.google.android.gms.internal.zzpp$zza
                public void zza(Status status0, GoogleNowAuthState googleNowAuthState0) {
                    if(zzb.this.zzaJJ) {
                        Log.d("SearchAuth", "GetGoogleNowAuthImpl success");
                    }
                    zzc zzpp$zzc0 = new zzc(status0, googleNowAuthState0);
                    zzb.this.setResult(zzpp$zzc0);
                }
            };
            ((zzpn)zzpo0.zznM()).zza(zzpp$zzb$10, "org.dyndns.vivi.SkskShogi", this.zzaJI);
        }

        protected GoogleNowAuthResult zzaS(Status status0) {
            if(this.zzaJJ) {
                Log.d("SearchAuth", "GetGoogleNowAuthImpl received failure: " + status0.getStatusMessage());
            }
            return new zzc(status0, null);
        }
    }

    static class zzc implements GoogleNowAuthResult {
        private final Status zzOt;
        private final GoogleNowAuthState zzaJL;

        zzc(Status status0, GoogleNowAuthState googleNowAuthState0) {
            this.zzOt = status0;
            this.zzaJL = googleNowAuthState0;
        }

        @Override  // com.google.android.gms.search.SearchAuthApi$GoogleNowAuthResult
        public GoogleNowAuthState getGoogleNowAuthState() {
            return this.zzaJL;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    @Override  // com.google.android.gms.search.SearchAuthApi
    public PendingResult getGoogleNowAuth(GoogleApiClient client, String webAppClientId) {
        return client.zza(new zzb(client, webAppClientId));
    }
}

