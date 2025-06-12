package com.google.android.gms.games.multiplayer.turnbased;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import java.util.List;

public interface TurnBasedMultiplayer {
    public interface CancelMatchResult extends Result {
        String getMatchId();
    }

    public interface InitiateMatchResult extends Result {
        TurnBasedMatch getMatch();
    }

    public interface LeaveMatchResult extends Result {
        TurnBasedMatch getMatch();
    }

    public interface LoadMatchResult extends Result {
        TurnBasedMatch getMatch();
    }

    public interface LoadMatchesResult extends Releasable, Result {
        LoadMatchesResponse getMatches();
    }

    public interface UpdateMatchResult extends Result {
        TurnBasedMatch getMatch();
    }

    PendingResult acceptInvitation(GoogleApiClient arg1, String arg2);

    PendingResult cancelMatch(GoogleApiClient arg1, String arg2);

    PendingResult createMatch(GoogleApiClient arg1, TurnBasedMatchConfig arg2);

    void declineInvitation(GoogleApiClient arg1, String arg2);

    void dismissInvitation(GoogleApiClient arg1, String arg2);

    void dismissMatch(GoogleApiClient arg1, String arg2);

    PendingResult finishMatch(GoogleApiClient arg1, String arg2);

    PendingResult finishMatch(GoogleApiClient arg1, String arg2, byte[] arg3, List arg4);

    PendingResult finishMatch(GoogleApiClient arg1, String arg2, byte[] arg3, ParticipantResult[] arg4);

    Intent getInboxIntent(GoogleApiClient arg1);

    int getMaxMatchDataSize(GoogleApiClient arg1);

    Intent getSelectOpponentsIntent(GoogleApiClient arg1, int arg2, int arg3);

    Intent getSelectOpponentsIntent(GoogleApiClient arg1, int arg2, int arg3, boolean arg4);

    PendingResult leaveMatch(GoogleApiClient arg1, String arg2);

    PendingResult leaveMatchDuringTurn(GoogleApiClient arg1, String arg2, String arg3);

    PendingResult loadMatch(GoogleApiClient arg1, String arg2);

    PendingResult loadMatchesByStatus(GoogleApiClient arg1, int arg2, int[] arg3);

    PendingResult loadMatchesByStatus(GoogleApiClient arg1, int[] arg2);

    void registerMatchUpdateListener(GoogleApiClient arg1, OnTurnBasedMatchUpdateReceivedListener arg2);

    PendingResult rematch(GoogleApiClient arg1, String arg2);

    PendingResult takeTurn(GoogleApiClient arg1, String arg2, byte[] arg3, String arg4);

    PendingResult takeTurn(GoogleApiClient arg1, String arg2, byte[] arg3, String arg4, List arg5);

    PendingResult takeTurn(GoogleApiClient arg1, String arg2, byte[] arg3, String arg4, ParticipantResult[] arg5);

    void unregisterMatchUpdateListener(GoogleApiClient arg1);
}

