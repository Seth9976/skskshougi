package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;

@zzgd
public class zzfc extends Handler {
    private final zzfb zzAs;

    public zzfc(Context context0) {
        this(new zzfd(context0));
    }

    public zzfc(zzfb zzfb0) {
        this.zzAs = zzfb0;
    }

    @Override  // android.os.Handler
    public void handleMessage(Message msg) {
        try {
            Bundle bundle0 = msg.getData();
            if(bundle0 != null) {
                JSONObject jSONObject0 = new JSONObject(bundle0.getString("data"));
                if("fetch_html".equals(jSONObject0.getString("message_name"))) {
                    this.zzc(jSONObject0);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void zzc(JSONObject jSONObject0) {
        try {
            String s = jSONObject0.getString("request_id");
            String s1 = jSONObject0.getString("base_url");
            String s2 = jSONObject0.getString("html");
            this.zzAs.zza(s, s1, s2);
        }
        catch(Exception unused_ex) {
        }
    }
}

