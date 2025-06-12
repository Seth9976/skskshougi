package com.google.android.gms.internal;

import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzt;
import org.json.JSONObject;

public final class zzjx implements PlayerInfo {
    private final int zzSd;
    private final String zzTL;
    private final JSONObject zzUb;
    private final boolean zzUc;

    public zzjx(String s, int v, JSONObject jSONObject0, boolean z) {
        this.zzTL = s;
        this.zzSd = v;
        this.zzUb = jSONObject0;
        this.zzUc = z;
    }

    @Override
    public boolean equals(Object otherObj) {
        if(otherObj != null && otherObj instanceof PlayerInfo) {
            boolean z = ((PlayerInfo)otherObj).isControllable();
            if(this.zzUc == z) {
                int v = ((PlayerInfo)otherObj).getPlayerState();
                if(this.zzSd == v) {
                    String s = ((PlayerInfo)otherObj).getPlayerId();
                    if(zzf.zza(this.zzTL, s)) {
                        JSONObject jSONObject0 = ((PlayerInfo)otherObj).getPlayerData();
                        return zzlh.zzd(this.zzUb, jSONObject0);
                    }
                }
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.cast.games.PlayerInfo
    public JSONObject getPlayerData() {
        return this.zzUb;
    }

    @Override  // com.google.android.gms.cast.games.PlayerInfo
    public String getPlayerId() {
        return this.zzTL;
    }

    @Override  // com.google.android.gms.cast.games.PlayerInfo
    public int getPlayerState() {
        return this.zzSd;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzTL, this.zzSd, this.zzUb, Boolean.valueOf(this.zzUc)});
    }

    @Override  // com.google.android.gms.cast.games.PlayerInfo
    public boolean isConnected() {
        return this.zzSd == 3 || this.zzSd == 4 || this.zzSd == 5 || this.zzSd == 6;
    }

    @Override  // com.google.android.gms.cast.games.PlayerInfo
    public boolean isControllable() {
        return this.zzUc;
    }
}

