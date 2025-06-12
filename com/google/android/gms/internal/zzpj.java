package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafetyNetApi.AttestationResult;
import com.google.android.gms.safetynet.SafetyNetApi;

public class zzpj implements SafetyNetApi {
    static class zza implements AttestationResult {
        private final Status zzOt;
        private final AttestationData zzaJB;

        public zza(Status status0, AttestationData attestationData0) {
            this.zzOt = status0;
            this.zzaJB = attestationData0;
        }

        @Override  // com.google.android.gms.safetynet.SafetyNetApi$AttestationResult
        public String getJwsResult() {
            return this.zzaJB == null ? null : this.zzaJB.getJwsResult();
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static abstract class zzb extends zzpg {
        protected zzph zzaJC;

        public zzb(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
            this.zzaJC = new zzpf() {
                @Override  // com.google.android.gms.internal.zzpf
                public void zza(Status status0, AttestationData attestationData0) {
                    zza zzpj$zza0 = new zza(status0, attestationData0);
                    zzb.this.setResult(zzpj$zza0);
                }
            };
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return this.zzaR(x0);
        }

        protected AttestationResult zzaR(Status status0) {
            return new zza(status0, null);
        }
    }

    @Override  // com.google.android.gms.safetynet.SafetyNetApi
    public PendingResult attest(GoogleApiClient googleApiClient, byte[] nonce) {
        return googleApiClient.zza(new zzb(googleApiClient) {
            protected void zza(zzpk zzpk0) throws RemoteException {
                zzpk0.zza(this.zzaJC, nonce);
            }
        });
    }
}

