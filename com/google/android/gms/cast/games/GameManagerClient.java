package com.google.android.gms.cast.games;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.internal.zzjs;
import org.json.JSONObject;

public final class GameManagerClient {
    public interface GameManagerInstanceResult extends Result {
        GameManagerClient getGameManagerClient();
    }

    public interface GameManagerResult extends Result {
        JSONObject getExtraMessageData();

        String getPlayerId();

        long getRequestId();
    }

    public interface Listener {
        void onGameMessageReceived(String arg1, JSONObject arg2);

        void onStateChanged(GameManagerState arg1, GameManagerState arg2);
    }

    public static final int GAMEPLAY_STATE_LOADING = 1;
    public static final int GAMEPLAY_STATE_PAUSED = 3;
    public static final int GAMEPLAY_STATE_RUNNING = 2;
    public static final int GAMEPLAY_STATE_SHOWING_INFO_SCREEN = 4;
    public static final int GAMEPLAY_STATE_UNKNOWN = 0;
    public static final int LOBBY_STATE_CLOSED = 2;
    public static final int LOBBY_STATE_OPEN = 1;
    public static final int LOBBY_STATE_UNKNOWN = 0;
    public static final int PLAYER_STATE_AVAILABLE = 3;
    public static final int PLAYER_STATE_DROPPED = 1;
    public static final int PLAYER_STATE_IDLE = 5;
    public static final int PLAYER_STATE_PLAYING = 6;
    public static final int PLAYER_STATE_QUIT = 2;
    public static final int PLAYER_STATE_READY = 4;
    public static final int PLAYER_STATE_UNKNOWN = 0;
    public static final int STATUS_INCORRECT_VERSION = 2150;
    public static final int STATUS_TOO_MANY_PLAYERS = 0x867;
    private final zzjs zzTm;

    public GameManagerClient(zzjs channel) {
        this.zzTm = channel;
    }

    public void dispose() {
        this.zzTm.dispose();
    }

    public GameManagerState getCurrentState() throws IllegalStateException {
        synchronized(this) {
            return this.zzTm.getCurrentState();
        }
    }

    public static PendingResult getInstanceFor(GoogleApiClient googleApiClient, String castSessionId) throws IllegalArgumentException {
        return GameManagerClient.zza(new zzjs(googleApiClient, castSessionId, Cast.CastApi));
    }

    public String getLastUsedPlayerId() throws IllegalStateException {
        return this.zzTm.getLastUsedPlayerId();
    }

    public boolean isDisposed() {
        return this.zzTm.isDisposed();
    }

    public void sendGameMessage(String playerId, JSONObject extraMessageData) throws IllegalStateException {
        this.zzTm.sendGameMessage(playerId, extraMessageData);
    }

    public void sendGameMessage(JSONObject extraMessageData) throws IllegalStateException {
        this.sendGameMessage(this.getLastUsedPlayerId(), extraMessageData);
    }

    public PendingResult sendGameRequest(String playerId, JSONObject extraMessageData) throws IllegalStateException {
        return this.zzTm.sendGameRequest(playerId, extraMessageData);
    }

    public PendingResult sendGameRequest(JSONObject extraMessageData) throws IllegalStateException {
        return this.sendGameRequest(this.getLastUsedPlayerId(), extraMessageData);
    }

    public PendingResult sendPlayerAvailableRequest(String playerId, JSONObject extraMessageData) throws IllegalStateException {
        return this.zza(playerId, 3, extraMessageData);
    }

    public PendingResult sendPlayerAvailableRequest(JSONObject extraMessageData) throws IllegalStateException {
        return this.zza(this.getLastUsedPlayerId(), 3, extraMessageData);
    }

    public PendingResult sendPlayerIdleRequest(String playerId, JSONObject extraMessageData) throws IllegalStateException {
        return this.zza(playerId, 5, extraMessageData);
    }

    public PendingResult sendPlayerIdleRequest(JSONObject extraMessageData) throws IllegalStateException {
        return this.zza(this.getLastUsedPlayerId(), 5, extraMessageData);
    }

    public PendingResult sendPlayerPlayingRequest(String playerId, JSONObject extraMessageData) throws IllegalStateException {
        return this.zza(playerId, 6, extraMessageData);
    }

    public PendingResult sendPlayerPlayingRequest(JSONObject extraMessageData) throws IllegalStateException {
        return this.zza(this.getLastUsedPlayerId(), 6, extraMessageData);
    }

    public PendingResult sendPlayerQuitRequest(String playerId, JSONObject extraMessageData) throws IllegalStateException {
        return this.zza(playerId, 2, extraMessageData);
    }

    public PendingResult sendPlayerQuitRequest(JSONObject extraMessageData) throws IllegalStateException {
        return this.zza(this.getLastUsedPlayerId(), 2, extraMessageData);
    }

    public PendingResult sendPlayerReadyRequest(String playerId, JSONObject extraMessageData) throws IllegalStateException {
        return this.zza(playerId, 4, extraMessageData);
    }

    public PendingResult sendPlayerReadyRequest(JSONObject extraMessageData) throws IllegalStateException {
        return this.zza(this.getLastUsedPlayerId(), 4, extraMessageData);
    }

    public void setListener(Listener listener) {
        this.zzTm.setListener(listener);
    }

    public void setSessionLabel(String sessionLabel) {
        this.zzTm.setSessionLabel(sessionLabel);
    }

    static PendingResult zza(zzjs zzjs0) throws IllegalArgumentException {
        return zzjs0.zza(new GameManagerClient(zzjs0));
    }

    private PendingResult zza(String s, int v, JSONObject jSONObject0) throws IllegalStateException {
        return this.zzTm.zza(s, v, jSONObject0);
    }
}

