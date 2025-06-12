package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.zzi;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import java.util.List;

public final class RealTimeMultiplayerImpl implements RealTimeMultiplayer {
    @Override  // com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer
    public void create(GoogleApiClient apiClient, RoomConfig config) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 == null) {
            return;
        }
        gamesClientImpl0.zza(apiClient.zzo(config.getRoomUpdateListener()), RealTimeMultiplayerImpl.zza(apiClient, config.getRoomStatusUpdateListener()), RealTimeMultiplayerImpl.zza(apiClient, config.getMessageReceivedListener()), config);
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer
    public void declineInvitation(GoogleApiClient apiClient, String invitationId) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzr(invitationId, 0);
        }
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer
    public void dismissInvitation(GoogleApiClient apiClient, String invitationId) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzq(invitationId, 0);
        }
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer
    public Intent getSelectOpponentsIntent(GoogleApiClient apiClient, int minPlayers, int maxPlayers) {
        return Games.zzd(apiClient).zzc(minPlayers, maxPlayers, true);
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer
    public Intent getSelectOpponentsIntent(GoogleApiClient apiClient, int minPlayers, int maxPlayers, boolean allowAutomatch) {
        return Games.zzd(apiClient).zzc(minPlayers, maxPlayers, allowAutomatch);
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer
    public Intent getWaitingRoomIntent(GoogleApiClient apiClient, Room room, int minParticipantsToStart) {
        return Games.zzd(apiClient).zza(room, minParticipantsToStart);
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer
    public void join(GoogleApiClient apiClient, RoomConfig config) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 == null) {
            return;
        }
        gamesClientImpl0.zzb(apiClient.zzo(config.getRoomUpdateListener()), RealTimeMultiplayerImpl.zza(apiClient, config.getRoomStatusUpdateListener()), RealTimeMultiplayerImpl.zza(apiClient, config.getMessageReceivedListener()), config);
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer
    public void leave(GoogleApiClient apiClient, RoomUpdateListener listener, String roomId) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zza(apiClient.zzo(listener), roomId);
        }
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer
    public int sendReliableMessage(GoogleApiClient apiClient, ReliableMessageSentCallback callback, byte[] messageData, String roomId, String recipientParticipantId) {
        zzi zzi0 = RealTimeMultiplayerImpl.zza(apiClient, callback);
        return Games.zzd(apiClient).zza(zzi0, messageData, roomId, recipientParticipantId);
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer
    public int sendUnreliableMessage(GoogleApiClient apiClient, byte[] messageData, String roomId, String recipientParticipantId) {
        return Games.zzd(apiClient).zza(messageData, roomId, new String[]{recipientParticipantId});
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer
    public int sendUnreliableMessage(GoogleApiClient apiClient, byte[] messageData, String roomId, List list0) {
        String[] arr_s = (String[])list0.toArray(new String[list0.size()]);
        return Games.zzd(apiClient).zza(messageData, roomId, arr_s);
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer
    public int sendUnreliableMessageToOthers(GoogleApiClient apiClient, byte[] messageData, String roomId) {
        return Games.zzd(apiClient).zzd(messageData, roomId);
    }

    private static zzi zza(GoogleApiClient googleApiClient0, Object object0) {
        return object0 == null ? null : googleApiClient0.zzo(object0);
    }
}

