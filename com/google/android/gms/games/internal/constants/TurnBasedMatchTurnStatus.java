package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class TurnBasedMatchTurnStatus {
    public static String zzfG(int v) {
        switch(v) {
            case 0: {
                return "TURN_STATUS_INVITED";
            }
            case 1: {
                return "TURN_STATUS_MY_TURN";
            }
            case 2: {
                return "TURN_STATUS_THEIR_TURN";
            }
            case 3: {
                return "TURN_STATUS_COMPLETE";
            }
            default: {
                GamesLog.zzv("MatchTurnStatus", "Unknown match turn status: " + v);
                return "TURN_STATUS_UNKNOWN";
            }
        }
    }
}

