package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzes {
    public static final class zza {
        private boolean zzyO;
        private boolean zzyP;
        private boolean zzyQ;
        private boolean zzyR;
        private boolean zzyS;

        public zzes zzeg() {
            return new zzes(this, null);
        }

        public zza zzo(boolean z) {
            this.zzyO = z;
            return this;
        }

        public zza zzp(boolean z) {
            this.zzyP = z;
            return this;
        }

        public zza zzq(boolean z) {
            this.zzyQ = z;
            return this;
        }

        public zza zzr(boolean z) {
            this.zzyR = z;
            return this;
        }

        public zza zzs(boolean z) {
            this.zzyS = z;
            return this;
        }
    }

    private final boolean zzyO;
    private final boolean zzyP;
    private final boolean zzyQ;
    private final boolean zzyR;
    private final boolean zzyS;

    private zzes(zza zzes$zza0) {
        this.zzyO = zzes$zza0.zzyO;
        this.zzyP = zzes$zza0.zzyP;
        this.zzyQ = zzes$zza0.zzyQ;
        this.zzyR = zzes$zza0.zzyR;
        this.zzyS = zzes$zza0.zzyS;
    }

    zzes(zza zzes$zza0, com.google.android.gms.internal.zzes.1 zzes$10) {
        this(zzes$zza0);
    }

    public JSONObject toJson() {
        try {
            return new JSONObject().put("sms", this.zzyO).put("tel", this.zzyP).put("calendar", this.zzyQ).put("storePicture", this.zzyR).put("inlineVideo", this.zzyS);
        }
        catch(JSONException jSONException0) {
            zzb.zzb("Error occured while obtaining the MRAID capabilities.", jSONException0);
            return null;
        }
    }

    class com.google.android.gms.internal.zzes.1 {
    }

}

