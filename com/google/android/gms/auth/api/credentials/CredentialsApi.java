package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface CredentialsApi {
    PendingResult delete(GoogleApiClient arg1, Credential arg2);

    PendingResult disableAutoSignIn(GoogleApiClient arg1);

    PendingResult request(GoogleApiClient arg1, CredentialRequest arg2);

    PendingResult save(GoogleApiClient arg1, Credential arg2);
}

