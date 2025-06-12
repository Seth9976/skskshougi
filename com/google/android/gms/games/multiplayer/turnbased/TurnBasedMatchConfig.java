package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;

public abstract class TurnBasedMatchConfig {
    public static final class Builder {
        int zzauH;
        int zzaui;
        ArrayList zzaux;
        Bundle zzauy;

        private Builder() {
            this.zzaui = -1;
            this.zzaux = new ArrayList();
            this.zzauy = null;
            this.zzauH = 2;
        }

        Builder(com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.1 x0) {
        }

        public Builder addInvitedPlayer(String playerId) {
            zzu.zzu(playerId);
            this.zzaux.add(playerId);
            return this;
        }

        public Builder addInvitedPlayers(ArrayList arrayList0) {
            zzu.zzu(arrayList0);
            this.zzaux.addAll(arrayList0);
            return this;
        }

        public TurnBasedMatchConfig build() {
            return new TurnBasedMatchConfigImpl(this);
        }

        public Builder setAutoMatchCriteria(Bundle autoMatchCriteria) {
            this.zzauy = autoMatchCriteria;
            return this;
        }

        public Builder setVariant(int variant) {
            zzu.zzb(variant == -1 || variant > 0, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
            this.zzaui = variant;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder(null);
    }

    public static Bundle createAutoMatchCriteria(int minAutoMatchPlayers, int maxAutoMatchPlayers, long exclusiveBitMask) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("min_automatch_players", minAutoMatchPlayers);
        bundle0.putInt("max_automatch_players", maxAutoMatchPlayers);
        bundle0.putLong("exclusive_bit_mask", exclusiveBitMask);
        return bundle0;
    }

    public abstract Bundle getAutoMatchCriteria();

    public abstract String[] getInvitedPlayerIds();

    public abstract int getVariant();

    public abstract int zztL();

    class com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.1 {
    }

}

