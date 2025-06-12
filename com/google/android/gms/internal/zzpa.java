package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zze;

public final class zzpa implements Account {
    static abstract class zza extends com.google.android.gms.plus.Plus.zza {
        private zza(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        zza(GoogleApiClient googleApiClient0, com.google.android.gms.internal.zzpa.1 zzpa$10) {
            this(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return x0;
        }

        public Status zzb(Status status0) [...] // Inlined contents
    }

    @Override  // com.google.android.gms.plus.Account
    public void clearDefaultAccount(GoogleApiClient googleApiClient) {
        zze zze0 = Plus.zzf(googleApiClient, false);
        if(zze0 != null) {
            zze0.zzxr();
        }
    }

    @Override  // com.google.android.gms.plus.Account
    public String getAccountName(GoogleApiClient googleApiClient) {
        return Plus.zzf(googleApiClient, true).getAccountName();
    }

    @Override  // com.google.android.gms.plus.Account
    public PendingResult revokeAccessAndDisconnect(GoogleApiClient googleApiClient) {
        return googleApiClient.zzb(new zza(googleApiClient) {
            final zzpa zzaHB;

            {
                zzpa.this = zzpa0;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zze)api$Client0));
            }

            protected void zza(zze zze0) {
                zze0.zzk(this);
            }
        });
    }
}

