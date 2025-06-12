package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzjt {
    private final String zzTO;
    private final int zzTP;
    private final String zzTQ;

    public zzjt(String s, int v, String s1) {
        this.zzTO = s;
        this.zzTP = v;
        this.zzTQ = s1;
    }

    public zzjt(JSONObject jSONObject0) throws JSONException {
        this(jSONObject0.optString("applicationName"), jSONObject0.optInt("maxPlayers"), jSONObject0.optString("version"));
    }

    public final int getMaxPlayers() {
        return this.zzTP;
    }

    public final String getVersion() {
        return this.zzTQ;
    }

    public final String zzlB() {
        return this.zzTO;
    }
}

