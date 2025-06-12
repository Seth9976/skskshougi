package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzlh;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack {
    public static class Builder {
        private final MediaTrack zzSs;

        public Builder(long trackId, int trackType) throws IllegalArgumentException {
            this.zzSs = new MediaTrack(trackId, trackType);
        }

        public MediaTrack build() {
            return this.zzSs;
        }

        public Builder setContentId(String contentId) {
            this.zzSs.setContentId(contentId);
            return this;
        }

        public Builder setContentType(String contentType) {
            this.zzSs.setContentType(contentType);
            return this;
        }

        public Builder setCustomData(JSONObject customData) {
            this.zzSs.setCustomData(customData);
            return this;
        }

        public Builder setLanguage(String language) {
            this.zzSs.setLanguage(language);
            return this;
        }

        public Builder setLanguage(Locale locale) {
            String s = zzf.zzb(locale);
            this.zzSs.setLanguage(s);
            return this;
        }

        public Builder setName(String trackName) {
            this.zzSs.setName(trackName);
            return this;
        }

        public Builder setSubtype(int subtype) throws IllegalArgumentException {
            this.zzSs.zzaG(subtype);
            return this;
        }
    }

    public static final int SUBTYPE_CAPTIONS = 2;
    public static final int SUBTYPE_CHAPTERS = 4;
    public static final int SUBTYPE_DESCRIPTIONS = 3;
    public static final int SUBTYPE_METADATA = 5;
    public static final int SUBTYPE_NONE = 0;
    public static final int SUBTYPE_SUBTITLES = 1;
    public static final int SUBTYPE_UNKNOWN = -1;
    public static final int TYPE_AUDIO = 2;
    public static final int TYPE_TEXT = 1;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_VIDEO = 3;
    private String mName;
    private long zzOw;
    private String zzRA;
    private String zzRC;
    private String zzRE;
    private JSONObject zzRJ;
    private int zzSq;
    private int zzSr;

    MediaTrack(long id, int type) throws IllegalArgumentException {
        this.clear();
        this.zzOw = id;
        if(type <= 0 || type > 3) {
            throw new IllegalArgumentException("invalid type " + type);
        }
        this.zzSq = type;
    }

    MediaTrack(JSONObject json) throws JSONException {
        this.zzf(json);
    }

    private void clear() {
        this.zzOw = 0L;
        this.zzSq = 0;
        this.zzRC = null;
        this.mName = null;
        this.zzRA = null;
        this.zzSr = -1;
        this.zzRJ = null;
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }
        if(other instanceof MediaTrack) {
            if(this.zzRJ == null) {
                return ((MediaTrack)other).zzRJ == null ? (this.zzRJ == null || ((MediaTrack)other).zzRJ == null || zzlh.zzd(this.zzRJ, ((MediaTrack)other).zzRJ)) && (this.zzOw == ((MediaTrack)other).zzOw && this.zzSq == ((MediaTrack)other).zzSq && zzf.zza(this.zzRC, ((MediaTrack)other).zzRC) && zzf.zza(this.zzRE, ((MediaTrack)other).zzRE) && zzf.zza(this.mName, ((MediaTrack)other).mName) && zzf.zza(this.zzRA, ((MediaTrack)other).zzRA) && this.zzSr == ((MediaTrack)other).zzSr) : false;
            }
            return ((MediaTrack)other).zzRJ == null ? false : (this.zzRJ == null || ((MediaTrack)other).zzRJ == null || zzlh.zzd(this.zzRJ, ((MediaTrack)other).zzRJ)) && (this.zzOw == ((MediaTrack)other).zzOw && this.zzSq == ((MediaTrack)other).zzSq && zzf.zza(this.zzRC, ((MediaTrack)other).zzRC) && zzf.zza(this.zzRE, ((MediaTrack)other).zzRE) && zzf.zza(this.mName, ((MediaTrack)other).mName) && zzf.zza(this.zzRA, ((MediaTrack)other).zzRA) && this.zzSr == ((MediaTrack)other).zzSr);
        }
        return false;
    }

    public String getContentId() {
        return this.zzRC;
    }

    public String getContentType() {
        return this.zzRE;
    }

    public JSONObject getCustomData() {
        return this.zzRJ;
    }

    public long getId() {
        return this.zzOw;
    }

    public String getLanguage() {
        return this.zzRA;
    }

    public String getName() {
        return this.mName;
    }

    public int getSubtype() {
        return this.zzSr;
    }

    public int getType() {
        return this.zzSq;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzOw, this.zzSq, this.zzRC, this.zzRE, this.mName, this.zzRA, this.zzSr, this.zzRJ});
    }

    public void setContentId(String contentId) {
        this.zzRC = contentId;
    }

    public void setContentType(String contentType) {
        this.zzRE = contentType;
    }

    void setCustomData(JSONObject customData) {
        this.zzRJ = customData;
    }

    void setLanguage(String language) {
        this.zzRA = language;
    }

    void setName(String name) {
        this.mName = name;
    }

    public JSONObject toJson() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("trackId", this.zzOw);
            switch(this.zzSq) {
                case 1: {
                    jSONObject0.put("type", "TEXT");
                    break;
                }
                case 2: {
                    jSONObject0.put("type", "AUDIO");
                    break;
                }
                case 3: {
                    jSONObject0.put("type", "VIDEO");
                }
            }
            if(this.zzRC != null) {
                jSONObject0.put("trackContentId", this.zzRC);
            }
            if(this.zzRE != null) {
                jSONObject0.put("trackContentType", this.zzRE);
            }
            if(this.mName != null) {
                jSONObject0.put("name", this.mName);
            }
            if(!TextUtils.isEmpty(this.zzRA)) {
                jSONObject0.put("language", this.zzRA);
            }
            switch(this.zzSr) {
                case 1: {
                    jSONObject0.put("subtype", "SUBTITLES");
                    break;
                }
                case 2: {
                    jSONObject0.put("subtype", "CAPTIONS");
                    break;
                }
                case 3: {
                    jSONObject0.put("subtype", "DESCRIPTIONS");
                    break;
                }
                case 4: {
                    jSONObject0.put("subtype", "CHAPTERS");
                    break;
                }
                case 5: {
                    jSONObject0.put("subtype", "METADATA");
                }
            }
            if(this.zzRJ != null) {
                jSONObject0.put("customData", this.zzRJ);
            }
            return jSONObject0;
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }

    void zzaG(int v) throws IllegalArgumentException {
        if(v <= -1 || v > 5) {
            throw new IllegalArgumentException("invalid subtype " + v);
        }
        if(v != 0 && this.zzSq != 1) {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        }
        this.zzSr = v;
    }

    private void zzf(JSONObject jSONObject0) throws JSONException {
        this.clear();
        this.zzOw = jSONObject0.getLong("trackId");
        String s = jSONObject0.getString("type");
        if("TEXT".equals(s)) {
            this.zzSq = 1;
        }
        else if("AUDIO".equals(s)) {
            this.zzSq = 2;
        }
        else if("VIDEO".equals(s)) {
            this.zzSq = 3;
        }
        else {
            throw new JSONException("invalid type: " + s);
        }
        this.zzRC = jSONObject0.optString("trackContentId", null);
        this.zzRE = jSONObject0.optString("trackContentType", null);
        this.mName = jSONObject0.optString("name", null);
        this.zzRA = jSONObject0.optString("language", null);
        if(jSONObject0.has("subtype")) {
            String s1 = jSONObject0.getString("subtype");
            if("SUBTITLES".equals(s1)) {
                this.zzSr = 1;
            }
            else if("CAPTIONS".equals(s1)) {
                this.zzSr = 2;
            }
            else if("DESCRIPTIONS".equals(s1)) {
                this.zzSr = 3;
            }
            else if("CHAPTERS".equals(s1)) {
                this.zzSr = 4;
            }
            else {
                if(!"METADATA".equals(s1)) {
                    throw new JSONException("invalid subtype: " + s1);
                }
                this.zzSr = 5;
            }
        }
        else {
            this.zzSr = 0;
        }
        this.zzRJ = jSONObject0.optJSONObject("customData");
    }
}

