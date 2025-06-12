package com.google.android.gms.games.multiplayer.realtime;

import java.util.List;

public interface RoomStatusUpdateListener {
    void onConnectedToRoom(Room arg1);

    void onDisconnectedFromRoom(Room arg1);

    void onP2PConnected(String arg1);

    void onP2PDisconnected(String arg1);

    void onPeerDeclined(Room arg1, List arg2);

    void onPeerInvitedToRoom(Room arg1, List arg2);

    void onPeerJoined(Room arg1, List arg2);

    void onPeerLeft(Room arg1, List arg2);

    void onPeersConnected(Room arg1, List arg2);

    void onPeersDisconnected(Room arg1, List arg2);

    void onRoomAutoMatching(Room arg1);

    void onRoomConnecting(Room arg1);
}

