package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.appinvite.AppInvite;
import com.google.android.gms.appinvite.AppInviteApi;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class zziw implements AppInviteApi {
    static abstract class zza extends com.google.android.gms.common.api.zza.zza {
        public zza(GoogleApiClient googleApiClient0) {
            super(AppInvite.zzNX, googleApiClient0);
        }
    }

    final class zzb extends zza {
        private final String zzNZ;
        final zziw zzOa;

        public zzb(GoogleApiClient googleApiClient0, String s) {
            super(googleApiClient0);
            this.zzNZ = s;
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return x0;
        }

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((zzix)api$Client0));
        }

        protected void zza(zzix zzix0) throws RemoteException {
            zzix0.zzb(new com.google.android.gms.internal.zziy.zza() {
                @Override  // com.google.android.gms.internal.zziy
                public void zzc(Status status0) throws RemoteException {
                    zzb.this.setResult(status0);
                }
            }, this.zzNZ);
        }

        protected Status zzb(Status status0) [...] // Inlined contents
    }

    final class zzc extends zza {
        private final String zzNZ;
        final zziw zzOa;

        public zzc(GoogleApiClient googleApiClient0, String s) {
            super(googleApiClient0);
            this.zzNZ = s;
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return x0;
        }

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((zzix)api$Client0));
        }

        protected void zza(zzix zzix0) throws RemoteException {
            zzix0.zza(new com.google.android.gms.internal.zziy.zza() {
                @Override  // com.google.android.gms.internal.zziy
                public void zzc(Status status0) throws RemoteException {
                    zzc.this.setResult(status0);
                }
            }, this.zzNZ);
        }

        protected Status zzb(Status status0) [...] // Inlined contents
    }

    @Override  // com.google.android.gms.appinvite.AppInviteApi
    public PendingResult convertInvitation(GoogleApiClient client, String invitationId) {
        return client.zza(new zzc(this, client, invitationId));
    }

    @Override  // com.google.android.gms.appinvite.AppInviteApi
    public PendingResult updateInvitationOnInstall(GoogleApiClient client, String invitationId) {
        return client.zza(new zzb(this, client, invitationId));
    }
}

