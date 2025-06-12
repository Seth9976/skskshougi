package com.google.android.gms.cast.games;

import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public interface GameManagerState {
    CharSequence getApplicationName();

    List getConnectedControllablePlayers();

    List getConnectedPlayers();

    List getControllablePlayers();

    JSONObject getGameData();

    CharSequence getGameStatusText();

    int getGameplayState();

    Collection getListOfChangedPlayers(GameManagerState arg1);

    int getLobbyState();

    int getMaxPlayers();

    PlayerInfo getPlayer(String arg1);

    Collection getPlayers();

    List getPlayersInState(int arg1);

    boolean hasGameDataChanged(GameManagerState arg1);

    boolean hasGameStatusTextChanged(GameManagerState arg1);

    boolean hasGameplayStateChanged(GameManagerState arg1);

    boolean hasLobbyStateChanged(GameManagerState arg1);

    boolean hasPlayerChanged(String arg1, GameManagerState arg2);

    boolean hasPlayerDataChanged(String arg1, GameManagerState arg2);

    boolean hasPlayerStateChanged(String arg1, GameManagerState arg2);
}

