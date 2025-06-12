package com.google.android.gms.games.multiplayer;

import com.google.android.gms.games.Player;
import java.util.ArrayList;

public final class ParticipantUtils {
    public static String getParticipantId(ArrayList arrayList0, String playerId) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Participant participant0 = (Participant)arrayList0.get(v1);
            Player player0 = participant0.getPlayer();
            if(player0 != null && player0.getPlayerId().equals(playerId)) {
                return participant0.getParticipantId();
            }
        }
        return null;
    }
}

