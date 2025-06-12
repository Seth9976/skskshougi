package com.google.android.gms.games.multiplayer.turnbased;

public interface OnTurnBasedMatchUpdateReceivedListener {
    void onTurnBasedMatchReceived(TurnBasedMatch arg1);

    void onTurnBasedMatchRemoved(String arg1);
}

