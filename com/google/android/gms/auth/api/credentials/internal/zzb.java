package com.google.android.gms.auth.api.credentials.internal;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

public final class zzb implements CredentialRequestResult {
    private final Status zzOt;
    private final Credential zzPb;

    public zzb(Status status0, Credential credential0) {
        this.zzOt = status0;
        this.zzPb = credential0;
    }

    @Override  // com.google.android.gms.auth.api.credentials.CredentialRequestResult
    public Credential getCredential() {
        return this.zzPb;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    public static zzb zzj(Status status0) {
        return new zzb(status0, null);
    }
}

