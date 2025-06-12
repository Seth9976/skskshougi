package com.google.android.gms.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface Account {
    @Deprecated
    void clearDefaultAccount(GoogleApiClient arg1);

    String getAccountName(GoogleApiClient arg1);

    PendingResult revokeAccessAndDisconnect(GoogleApiClient arg1);
}

