package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class RoomConfig {
    public static final class Builder {
        int zzaui;
        final RoomUpdateListener zzaut;
        RoomStatusUpdateListener zzauu;
        RealTimeMessageReceivedListener zzauv;
        String zzauw;
        ArrayList zzaux;
        Bundle zzauy;

        private Builder(RoomUpdateListener updateListener) {
            this.zzauw = null;
            this.zzaui = -1;
            this.zzaux = new ArrayList();
            this.zzaut = (RoomUpdateListener)zzu.zzb(updateListener, "Must provide a RoomUpdateListener");
        }

        Builder(RoomUpdateListener x0, com.google.android.gms.games.multiplayer.realtime.RoomConfig.1 x1) {
            this(x0);
        }

        public Builder addPlayersToInvite(ArrayList arrayList0) {
            zzu.zzu(arrayList0);
            this.zzaux.addAll(arrayList0);
            return this;
        }

        public Builder addPlayersToInvite(String[] playerIds) {
            zzu.zzu(playerIds);
            this.zzaux.addAll(Arrays.asList(playerIds));
            return this;
        }

        public RoomConfig build() {
            return new RoomConfigImpl(this);
        }

        public Builder setAutoMatchCriteria(Bundle autoMatchCriteria) {
            this.zzauy = autoMatchCriteria;
            return this;
        }

        public Builder setInvitationIdToAccept(String invitationId) {
            zzu.zzu(invitationId);
            this.zzauw = invitationId;
            return this;
        }

        public Builder setMessageReceivedListener(RealTimeMessageReceivedListener listener) {
            this.zzauv = listener;
            return this;
        }

        public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener listener) {
            this.zzauu = listener;
            return this;
        }

        public Builder setVariant(int variant) {
            zzu.zzb(variant == -1 || variant > 0, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
            this.zzaui = variant;
            return this;
        }
    }

    public static Builder builder(RoomUpdateListener listener) {
        return new Builder(listener, null);
    }

    public static Bundle createAutoMatchCriteria(int minAutoMatchPlayers, int maxAutoMatchPlayers, long exclusiveBitMask) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("min_automatch_players", minAutoMatchPlayers);
        bundle0.putInt("max_automatch_players", maxAutoMatchPlayers);
        bundle0.putLong("exclusive_bit_mask", exclusiveBitMask);
        return bundle0;
    }

    public abstract Bundle getAutoMatchCriteria();

    public abstract String getInvitationId();

    public abstract String[] getInvitedPlayerIds();

    public abstract RealTimeMessageReceivedListener getMessageReceivedListener();

    public abstract RoomStatusUpdateListener getRoomStatusUpdateListener();

    public abstract RoomUpdateListener getRoomUpdateListener();

    public abstract int getVariant();

    class com.google.android.gms.games.multiplayer.realtime.RoomConfig.1 {
    }

}

