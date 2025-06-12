package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;

public final class zzc implements CredentialsApi {
    static class zza extends com.google.android.gms.auth.api.credentials.internal.zza {
        private zzb zzPg;

        zza(zzb zza$zzb0) {
            this.zzPg = zza$zzb0;
        }

        @Override  // com.google.android.gms.auth.api.credentials.internal.zza
        public void onStatusResult(Status status) {
            this.zzPg.zzm(status);
        }
    }

    @Override  // com.google.android.gms.auth.api.credentials.CredentialsApi
    public PendingResult delete(GoogleApiClient client, Credential credential) {
        return client.zzb(new zzd(client) {
            @Override  // com.google.android.gms.auth.api.credentials.internal.zzd
            protected void zza(Context context0, ICredentialsService iCredentialsService0) throws RemoteException {
                iCredentialsService0.performCredentialsDeleteOperation(new zza(this), new DeleteRequest(credential));
            }

            protected Status zzb(Status status0) [...] // Inlined contents
        });
    }

    @Override  // com.google.android.gms.auth.api.credentials.CredentialsApi
    public PendingResult disableAutoSignIn(GoogleApiClient client) {
        return client.zzb(new zzd(client) {
            @Override  // com.google.android.gms.auth.api.credentials.internal.zzd
            protected void zza(Context context0, ICredentialsService iCredentialsService0) throws RemoteException {
                iCredentialsService0.performDisableAutoSignInOperation(new zza(this));
            }

            protected Status zzb(Status status0) [...] // Inlined contents
        });
    }

    @Override  // com.google.android.gms.auth.api.credentials.CredentialsApi
    public PendingResult request(GoogleApiClient client, CredentialRequest request) {
        return client.zza(new zzd(client) {
            @Override  // com.google.android.gms.auth.api.credentials.internal.zzd
            protected void zza(Context context0, ICredentialsService iCredentialsService0) throws RemoteException {
                iCredentialsService0.performCredentialsRequestOperation(new com.google.android.gms.auth.api.credentials.internal.zza() {
                    @Override  // com.google.android.gms.auth.api.credentials.internal.zza
                    public void onCredentialResult(Status status, Credential credential) {
                        com.google.android.gms.auth.api.credentials.internal.zzb zzb0 = new com.google.android.gms.auth.api.credentials.internal.zzb(status, credential);
                        com.google.android.gms.auth.api.credentials.internal.zzc.1.this.setResult(zzb0);
                    }
                }, request);
            }

            protected CredentialRequestResult zzk(Status status0) {
                return com.google.android.gms.auth.api.credentials.internal.zzb.zzj(status0);
            }
        });
    }

    @Override  // com.google.android.gms.auth.api.credentials.CredentialsApi
    public PendingResult save(GoogleApiClient client, Credential credential) {
        return client.zzb(new zzd(client) {
            @Override  // com.google.android.gms.auth.api.credentials.internal.zzd
            protected void zza(Context context0, ICredentialsService iCredentialsService0) throws RemoteException {
                iCredentialsService0.performCredentialsSaveOperation(new zza(this), new SaveRequest(credential));
            }

            protected Status zzb(Status status0) [...] // Inlined contents
        });
    }
}

