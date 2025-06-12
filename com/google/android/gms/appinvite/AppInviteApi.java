package com.google.android.gms.appinvite;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface AppInviteApi {
    PendingResult convertInvitation(GoogleApiClient arg1, String arg2);

    PendingResult updateInvitationOnInstall(GoogleApiClient arg1, String arg2);
}

