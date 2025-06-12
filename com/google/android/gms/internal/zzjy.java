package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzf;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzjy {
    private final int zzSd;
    private final String zzTL;
    private final JSONObject zzUb;

    public zzjy(String s, int v, JSONObject jSONObject0) {
        this.zzTL = s;
        this.zzSd = v;
        this.zzUb = jSONObject0;
    }

    public zzjy(JSONObject jSONObject0) throws JSONException {
        this(jSONObject0.optString("playerId"), jSONObject0.optInt("playerState"), jSONObject0.optJSONObject("playerData"));
    }

    @Override
    public boolean equals(Object otherObj) {
        if(otherObj != null && otherObj instanceof zzjy) {
            int v = ((zzjy)otherObj).getPlayerState();
            if(this.zzSd == v) {
                String s = ((zzjy)otherObj).getPlayerId();
                if(zzf.zza(this.zzTL, s)) {
                    JSONObject jSONObject0 = ((zzjy)otherObj).getPlayerData();
                    return zzlh.zzd(this.zzUb, jSONObject0);
                }
            }
        }
        return false;
    }

    public JSONObject getPlayerData() {
        return this.zzUb;
    }

    public String getPlayerId() {
        return this.zzTL;
    }

    public int getPlayerState() {
        return this.zzSd;
    }
}

