package com.google.android.gms.games.multiplayer.realtime;

public interface RoomUpdateListener {
    void onJoinedRoom(int arg1, Room arg2);

    void onLeftRoom(int arg1, String arg2);

    void onRoomConnected(int arg1, Room arg2);

    void onRoomCreated(int arg1, Room arg2);
}

