package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.zza.zza;

abstract class zzd extends zza {
    zzd(GoogleApiClient googleApiClient0) {
        super(Auth.CLIENT_KEY_CREDENTIALS_API, googleApiClient0);
    }

    protected abstract void zza(Context arg1, ICredentialsService arg2) throws DeadObjectException, RemoteException;

    protected final void zza(CredentialsClientImpl credentialsClientImpl0) throws DeadObjectException, RemoteException {
        this.zza(credentialsClientImpl0.getContext(), ((ICredentialsService)credentialsClientImpl0.zznM()));
    }

    @Override  // com.google.android.gms.common.api.zza$zza
    protected void zza(Client api$Client0) throws RemoteException {
        this.zza(((CredentialsClientImpl)api$Client0));
    }
}

