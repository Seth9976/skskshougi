package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzeu {
    private final zzid zzoA;
    private final String zzzd;

    public zzeu(zzid zzid0) {
        this(zzid0, "");
    }

    public zzeu(zzid zzid0, String s) {
        this.zzoA = zzid0;
        this.zzzd = s;
    }

    public void zza(int v, int v1, int v2, int v3, float f, int v4) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("width", v).put("height", v1).put("maxSizeWidth", v2).put("maxSizeHeight", v3).put("density", ((double)f)).put("rotation", v4);
            this.zzoA.zzb("onScreenInfoChanged", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzb.zzb("Error occured while obtaining screen information.", jSONException0);
        }
    }

    public void zzae(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("message", s).put("action", this.zzzd);
            this.zzoA.zzb("onError", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzb.zzb("Error occurred while dispatching error event.", jSONException0);
        }
    }

    public void zzaf(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("js", s);
            this.zzoA.zzb("onReadyEventReceived", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzb.zzb("Error occured while dispatching ready Event.", jSONException0);
        }
    }

    public void zzag(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("state", s);
            this.zzoA.zzb("onStateChanged", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzb.zzb("Error occured while dispatching state change.", jSONException0);
        }
    }

    public void zzb(int v, int v1, int v2, int v3) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("x", v).put("y", v1).put("width", v2).put("height", v3);
            this.zzoA.zzb("onSizeChanged", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzb.zzb("Error occured while dispatching size change.", jSONException0);
        }
    }

    public void zzc(int v, int v1, int v2, int v3) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("x", v).put("y", v1).put("width", v2).put("height", v3);
            this.zzoA.zzb("onDefaultPositionReceived", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzb.zzb("Error occured while dispatching default position.", jSONException0);
        }
    }
}

