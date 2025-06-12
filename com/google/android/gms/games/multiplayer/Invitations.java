package com.google.android.gms.games.multiplayer;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public interface Invitations {
    public interface LoadInvitationsResult extends Releasable, Result {
        InvitationBuffer getInvitations();
    }

    Intent getInvitationInboxIntent(GoogleApiClient arg1);

    PendingResult loadInvitations(GoogleApiClient arg1);

    PendingResult loadInvitations(GoogleApiClient arg1, int arg2);

    void registerInvitationListener(GoogleApiClient arg1, OnInvitationReceivedListener arg2);

    void unregisterInvitationListener(GoogleApiClient arg1);
}

