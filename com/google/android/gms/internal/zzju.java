package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzju {
    private static final zzl zzQW;
    protected final String zzTL;
    protected final long zzTM;
    protected final JSONObject zzTN;
    protected final int zzTR;
    protected final int zzTS;
    protected final String zzTT;
    protected final int zzTU;
    protected final int zzTV;
    protected final List zzTW;
    protected final JSONObject zzTX;
    protected final String zzTY;
    protected final String zzTZ;
    protected final zzjt zzTs;

    static {
        zzju.zzQW = new zzl("GameManagerMessage");
    }

    public zzju(int v, int v1, String s, JSONObject jSONObject0, int v2, int v3, List list0, JSONObject jSONObject1, String s1, String s2, long v4, String s3, zzjt zzjt0) {
        this.zzTR = v;
        this.zzTS = v1;
        this.zzTT = s;
        this.zzTN = jSONObject0;
        this.zzTU = v2;
        this.zzTV = v3;
        this.zzTW = list0;
        this.zzTX = jSONObject1;
        this.zzTY = s1;
        this.zzTL = s2;
        this.zzTM = v4;
        this.zzTZ = s3;
        this.zzTs = zzjt0;
    }

    public final JSONObject getExtraMessageData() {
        return this.zzTN;
    }

    public final JSONObject getGameData() {
        return this.zzTX;
    }

    public final int getGameplayState() {
        return this.zzTU;
    }

    public final int getLobbyState() {
        return this.zzTV;
    }

    public final String getPlayerId() {
        return this.zzTL;
    }

    public final long getRequestId() {
        return this.zzTM;
    }

    public final int getStatusCode() {
        return this.zzTS;
    }

    private static List zza(JSONArray jSONArray0) {
        zzjy zzjy0;
        ArrayList arrayList0 = new ArrayList();
        if(jSONArray0 == null) {
            return arrayList0;
        }
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
            if(jSONObject0 != null) {
                try {
                    zzjy0 = new zzjy(jSONObject0);
                }
                catch(JSONException jSONException0) {
                    zzju.zzQW.zzc(jSONException0, "Exception when attempting to parse PlayerInfoMessageComponent at index %d", new Object[]{v});
                    zzjy0 = null;
                }
                if(zzjy0 != null) {
                    arrayList0.add(zzjy0);
                }
            }
        }
        return arrayList0;
    }

    protected static zzju zzh(JSONObject jSONObject0) {
        int v = jSONObject0.optInt("type", -1);
        try {
            switch(v) {
                case 1: {
                    zzjt zzjt0 = null;
                    JSONObject jSONObject1 = jSONObject0.optJSONObject("gameManagerConfig");
                    if(jSONObject1 != null) {
                        zzjt0 = new zzjt(jSONObject1);
                    }
                    return new zzju(1, jSONObject0.optInt("statusCode"), jSONObject0.optString("errorDescription"), jSONObject0.optJSONObject("extraMessageData"), jSONObject0.optInt("gameplayState"), jSONObject0.optInt("lobbyState"), zzju.zza(jSONObject0.optJSONArray("players")), jSONObject0.optJSONObject("gameData"), jSONObject0.optString("gameStatusText"), jSONObject0.optString("playerId"), jSONObject0.optLong("requestId"), jSONObject0.optString("playerToken"), zzjt0);
                }
                case 2: {
                    return new zzju(2, jSONObject0.optInt("statusCode"), jSONObject0.optString("errorDescription"), jSONObject0.optJSONObject("extraMessageData"), jSONObject0.optInt("gameplayState"), jSONObject0.optInt("lobbyState"), zzju.zza(jSONObject0.optJSONArray("players")), jSONObject0.optJSONObject("gameData"), jSONObject0.optString("gameStatusText"), jSONObject0.optString("playerId"), -1L, null, null);
                }
                default: {
                    zzju.zzQW.zzf("Unrecognized Game Message type %d", new Object[]{v});
                    return null;
                }
            }
        }
        catch(JSONException jSONException0) {
            zzju.zzQW.zzc(jSONException0, "Exception while parsing GameManagerMessage from json", new Object[0]);
            return null;
        }
    }

    public final int zzlC() {
        return this.zzTR;
    }

    public final String zzlD() {
        return this.zzTT;
    }

    public final List zzlE() {
        return this.zzTW;
    }

    public final String zzlF() {
        return this.zzTY;
    }

    public final String zzlG() {
        return this.zzTZ;
    }

    public final zzjt zzlH() {
        return this.zzTs;
    }
}

