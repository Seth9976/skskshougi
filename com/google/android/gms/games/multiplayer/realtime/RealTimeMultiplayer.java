package com.google.android.gms.games.multiplayer.realtime;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

public interface RealTimeMultiplayer {
    public interface ReliableMessageSentCallback {
        void onRealTimeMessageSent(int arg1, int arg2, String arg3);
    }

    public static final int REAL_TIME_MESSAGE_FAILED = -1;

    void create(GoogleApiClient arg1, RoomConfig arg2);

    void declineInvitation(GoogleApiClient arg1, String arg2);

    void dismissInvitation(GoogleApiClient arg1, String arg2);

    Intent getSelectOpponentsIntent(GoogleApiClient arg1, int arg2, int arg3);

    Intent getSelectOpponentsIntent(GoogleApiClient arg1, int arg2, int arg3, boolean arg4);

    Intent getWaitingRoomIntent(GoogleApiClient arg1, Room arg2, int arg3);

    void join(GoogleApiClient arg1, RoomConfig arg2);

    void leave(GoogleApiClient arg1, RoomUpdateListener arg2, String arg3);

    int sendReliableMessage(GoogleApiClient arg1, ReliableMessageSentCallback arg2, byte[] arg3, String arg4, String arg5);

    int sendUnreliableMessage(GoogleApiClient arg1, byte[] arg2, String arg3, String arg4);

    int sendUnreliableMessage(GoogleApiClient arg1, byte[] arg2, String arg3, List arg4);

    int sendUnreliableMessageToOthers(GoogleApiClient arg1, byte[] arg2, String arg3);
}

