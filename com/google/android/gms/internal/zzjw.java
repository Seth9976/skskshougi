package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerState;
import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class zzjw implements GameManagerState {
    private final String zzTO;
    private final int zzTP;
    private final int zzTU;
    private final int zzTV;
    private final JSONObject zzTX;
    private final String zzTY;
    private final Map zzUa;

    public zzjw(int v, int v1, String s, JSONObject jSONObject0, Collection collection0, String s1, int v2) {
        this.zzTV = v;
        this.zzTU = v1;
        this.zzTY = s;
        this.zzTX = jSONObject0;
        this.zzTO = s1;
        this.zzTP = v2;
        this.zzUa = new HashMap(collection0.size());
        for(Object object0: collection0) {
            String s2 = ((PlayerInfo)object0).getPlayerId();
            this.zzUa.put(s2, ((PlayerInfo)object0));
        }
    }

    @Override
    public boolean equals(Object otherObj) {
        int v1;
        if(otherObj != null && otherObj instanceof GameManagerState && this.getPlayers().size() == ((GameManagerState)otherObj).getPlayers().size()) {
            for(Object object1: this.getPlayers()) {
                PlayerInfo playerInfo0 = (PlayerInfo)object1;
                int v = 0;
                for(Object object2: ((GameManagerState)otherObj).getPlayers()) {
                    PlayerInfo playerInfo1 = (PlayerInfo)object2;
                    if(zzf.zza(playerInfo0.getPlayerId(), playerInfo1.getPlayerId())) {
                        if(!zzf.zza(playerInfo0, playerInfo1)) {
                            return false;
                        }
                        v1 = 1;
                    }
                    else {
                        v1 = v;
                    }
                    v = v1;
                }
                if(v != 0) {
                    continue;
                }
                return false;
            }
            int v2 = ((GameManagerState)otherObj).getLobbyState();
            if(this.zzTV == v2) {
                int v3 = ((GameManagerState)otherObj).getGameplayState();
                if(this.zzTU == v3) {
                    int v4 = ((GameManagerState)otherObj).getMaxPlayers();
                    if(this.zzTP == v4) {
                        CharSequence charSequence0 = ((GameManagerState)otherObj).getApplicationName();
                        if(zzf.zza(this.zzTO, charSequence0)) {
                            CharSequence charSequence1 = ((GameManagerState)otherObj).getGameStatusText();
                            if(zzf.zza(this.zzTY, charSequence1)) {
                                JSONObject jSONObject0 = ((GameManagerState)otherObj).getGameData();
                                return zzlh.zzd(this.zzTX, jSONObject0);
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public CharSequence getApplicationName() {
        return this.zzTO;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public List getConnectedControllablePlayers() {
        List list0 = new ArrayList();
        for(Object object0: this.getPlayers()) {
            PlayerInfo playerInfo0 = (PlayerInfo)object0;
            if(playerInfo0.isConnected() && playerInfo0.isControllable()) {
                ((ArrayList)list0).add(playerInfo0);
            }
        }
        return list0;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public List getConnectedPlayers() {
        List list0 = new ArrayList();
        for(Object object0: this.getPlayers()) {
            PlayerInfo playerInfo0 = (PlayerInfo)object0;
            if(playerInfo0.isConnected()) {
                ((ArrayList)list0).add(playerInfo0);
            }
        }
        return list0;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public List getControllablePlayers() {
        List list0 = new ArrayList();
        for(Object object0: this.getPlayers()) {
            PlayerInfo playerInfo0 = (PlayerInfo)object0;
            if(playerInfo0.isControllable()) {
                ((ArrayList)list0).add(playerInfo0);
            }
        }
        return list0;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public JSONObject getGameData() {
        return this.zzTX;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public CharSequence getGameStatusText() {
        return this.zzTY;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public int getGameplayState() {
        return this.zzTU;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public Collection getListOfChangedPlayers(GameManagerState other) {
        Collection collection0 = new HashSet();
        for(Object object0: this.getPlayers()) {
            PlayerInfo playerInfo0 = (PlayerInfo)object0;
            PlayerInfo playerInfo1 = other.getPlayer(playerInfo0.getPlayerId());
            if(playerInfo1 == null || !playerInfo0.equals(playerInfo1)) {
                ((HashSet)collection0).add(playerInfo0.getPlayerId());
            }
        }
        for(Object object1: other.getPlayers()) {
            PlayerInfo playerInfo2 = (PlayerInfo)object1;
            if(this.getPlayer(playerInfo2.getPlayerId()) == null) {
                ((HashSet)collection0).add(playerInfo2.getPlayerId());
            }
        }
        return collection0;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public int getLobbyState() {
        return this.zzTV;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public int getMaxPlayers() {
        return this.zzTP;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public PlayerInfo getPlayer(String playerId) {
        return playerId == null ? null : ((PlayerInfo)this.zzUa.get(playerId));
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public Collection getPlayers() {
        return Collections.unmodifiableCollection(this.zzUa.values());
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public List getPlayersInState(int playerState) {
        List list0 = new ArrayList();
        for(Object object0: this.getPlayers()) {
            PlayerInfo playerInfo0 = (PlayerInfo)object0;
            if(playerInfo0.getPlayerState() == playerState) {
                ((ArrayList)list0).add(playerInfo0);
            }
        }
        return list0;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public boolean hasGameDataChanged(GameManagerState other) {
        JSONObject jSONObject0 = other.getGameData();
        return !zzlh.zzd(this.zzTX, jSONObject0);
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public boolean hasGameStatusTextChanged(GameManagerState other) {
        CharSequence charSequence0 = other.getGameStatusText();
        return !zzf.zza(this.zzTY, charSequence0);
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public boolean hasGameplayStateChanged(GameManagerState other) {
        int v = other.getGameplayState();
        return this.zzTU != v;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public boolean hasLobbyStateChanged(GameManagerState other) {
        int v = other.getLobbyState();
        return this.zzTV != v;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public boolean hasPlayerChanged(String playerId, GameManagerState other) {
        return !zzf.zza(this.getPlayer(playerId), other.getPlayer(playerId));
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public boolean hasPlayerDataChanged(String playerId, GameManagerState other) {
        PlayerInfo playerInfo0 = this.getPlayer(playerId);
        PlayerInfo playerInfo1 = other.getPlayer(playerId);
        return playerInfo0 != null || playerInfo1 != null ? playerInfo0 == null || playerInfo1 == null || !zzlh.zzd(playerInfo0.getPlayerData(), playerInfo1.getPlayerData()) : false;
    }

    @Override  // com.google.android.gms.cast.games.GameManagerState
    public boolean hasPlayerStateChanged(String playerId, GameManagerState other) {
        PlayerInfo playerInfo0 = this.getPlayer(playerId);
        PlayerInfo playerInfo1 = other.getPlayer(playerId);
        return playerInfo0 != null || playerInfo1 != null ? playerInfo0 == null || playerInfo1 == null || playerInfo0.getPlayerState() != playerInfo1.getPlayerState() : false;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzTV, this.zzTU, this.zzUa, this.zzTY, this.zzTX, this.zzTO, this.zzTP});
    }
}

