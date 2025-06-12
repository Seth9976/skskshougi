package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzlh;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaInfo {
    public static class Builder {
        private final MediaInfo zzRK;

        public Builder(String contentId) throws IllegalArgumentException {
            if(TextUtils.isEmpty(contentId)) {
                throw new IllegalArgumentException("Content ID cannot be empty");
            }
            this.zzRK = new MediaInfo(contentId);
        }

        public MediaInfo build() throws IllegalArgumentException {
            this.zzRK.zzlq();
            return this.zzRK;
        }

        public Builder setContentType(String contentType) throws IllegalArgumentException {
            this.zzRK.setContentType(contentType);
            return this;
        }

        public Builder setCustomData(JSONObject customData) {
            this.zzRK.setCustomData(customData);
            return this;
        }

        public Builder setMediaTracks(List list0) {
            this.zzRK.zzj(list0);
            return this;
        }

        public Builder setMetadata(MediaMetadata metadata) {
            this.zzRK.zza(metadata);
            return this;
        }

        public Builder setStreamDuration(long duration) throws IllegalArgumentException {
            this.zzRK.zzx(duration);
            return this;
        }

        public Builder setStreamType(int streamType) throws IllegalArgumentException {
            this.zzRK.setStreamType(streamType);
            return this;
        }

        public Builder setTextTrackStyle(TextTrackStyle textTrackStyle) {
            this.zzRK.setTextTrackStyle(textTrackStyle);
            return this;
        }
    }

    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;
    public static final long UNKNOWN_DURATION = -1L;
    private final String zzRC;
    private int zzRD;
    private String zzRE;
    private MediaMetadata zzRF;
    private long zzRG;
    private List zzRH;
    private TextTrackStyle zzRI;
    private JSONObject zzRJ;

    MediaInfo(String contentId) throws IllegalArgumentException {
        if(TextUtils.isEmpty(contentId)) {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        this.zzRC = contentId;
        this.zzRD = -1;
        this.zzRG = -1L;
    }

    MediaInfo(JSONObject json) throws JSONException {
        this.zzRC = json.getString("contentId");
        String s = json.getString("streamType");
        if("NONE".equals(s)) {
            this.zzRD = 0;
        }
        else if("BUFFERED".equals(s)) {
            this.zzRD = 1;
        }
        else if("LIVE".equals(s)) {
            this.zzRD = 2;
        }
        else {
            this.zzRD = -1;
        }
        this.zzRE = json.getString("contentType");
        if(json.has("metadata")) {
            JSONObject jSONObject1 = json.getJSONObject("metadata");
            this.zzRF = new MediaMetadata(jSONObject1.getInt("metadataType"));
            this.zzRF.zzf(jSONObject1);
        }
        this.zzRG = -1L;
        if(json.has("duration") && !json.isNull("duration")) {
            double f = json.optDouble("duration", 0.0);
            if(!Double.isNaN(f) && !Double.isInfinite(f)) {
                this.zzRG = zzf.zze(f);
            }
        }
        if(json.has("tracks")) {
            this.zzRH = new ArrayList();
            JSONArray jSONArray0 = json.getJSONArray("tracks");
            for(int v = 0; v < jSONArray0.length(); ++v) {
                MediaTrack mediaTrack0 = new MediaTrack(jSONArray0.getJSONObject(v));
                this.zzRH.add(mediaTrack0);
            }
        }
        else {
            this.zzRH = null;
        }
        if(json.has("textTrackStyle")) {
            JSONObject jSONObject2 = json.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle0 = new TextTrackStyle();
            textTrackStyle0.zzf(jSONObject2);
            this.zzRI = textTrackStyle0;
        }
        else {
            this.zzRI = null;
        }
        this.zzRJ = json.optJSONObject("customData");
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }
        if(other instanceof MediaInfo) {
            if(this.zzRJ == null) {
                return ((MediaInfo)other).zzRJ == null ? (this.zzRJ == null || ((MediaInfo)other).zzRJ == null || zzlh.zzd(this.zzRJ, ((MediaInfo)other).zzRJ)) && (zzf.zza(this.zzRC, ((MediaInfo)other).zzRC) && this.zzRD == ((MediaInfo)other).zzRD && zzf.zza(this.zzRE, ((MediaInfo)other).zzRE) && zzf.zza(this.zzRF, ((MediaInfo)other).zzRF) && this.zzRG == ((MediaInfo)other).zzRG) : false;
            }
            return ((MediaInfo)other).zzRJ == null ? false : (this.zzRJ == null || ((MediaInfo)other).zzRJ == null || zzlh.zzd(this.zzRJ, ((MediaInfo)other).zzRJ)) && (zzf.zza(this.zzRC, ((MediaInfo)other).zzRC) && this.zzRD == ((MediaInfo)other).zzRD && zzf.zza(this.zzRE, ((MediaInfo)other).zzRE) && zzf.zza(this.zzRF, ((MediaInfo)other).zzRF) && this.zzRG == ((MediaInfo)other).zzRG);
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

    public List getMediaTracks() {
        return this.zzRH;
    }

    public MediaMetadata getMetadata() {
        return this.zzRF;
    }

    public long getStreamDuration() {
        return this.zzRG;
    }

    public int getStreamType() {
        return this.zzRD;
    }

    public TextTrackStyle getTextTrackStyle() {
        return this.zzRI;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzRC, this.zzRD, this.zzRE, this.zzRF, this.zzRG, String.valueOf(this.zzRJ)});
    }

    void setContentType(String contentType) throws IllegalArgumentException {
        if(TextUtils.isEmpty(contentType)) {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        this.zzRE = contentType;
    }

    void setCustomData(JSONObject customData) {
        this.zzRJ = customData;
    }

    void setStreamType(int streamType) throws IllegalArgumentException {
        if(streamType < -1 || streamType > 2) {
            throw new IllegalArgumentException("invalid stream type");
        }
        this.zzRD = streamType;
    }

    public void setTextTrackStyle(TextTrackStyle textTrackStyle) {
        this.zzRI = textTrackStyle;
    }

    public JSONObject toJson() {
        String s;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("contentId", this.zzRC);
            switch(this.zzRD) {
                case 1: {
                    s = "BUFFERED";
                    break;
                }
                case 2: {
                    s = "LIVE";
                    break;
                }
                default: {
                    s = "NONE";
                }
            }
            jSONObject0.put("streamType", s);
            if(this.zzRE != null) {
                jSONObject0.put("contentType", this.zzRE);
            }
            if(this.zzRF != null) {
                jSONObject0.put("metadata", this.zzRF.toJson());
            }
            if(this.zzRG <= -1L) {
                jSONObject0.put("duration", JSONObject.NULL);
            }
            else {
                jSONObject0.put("duration", zzf.zzA(this.zzRG));
            }
            if(this.zzRH != null) {
                JSONArray jSONArray0 = new JSONArray();
                for(Object object0: this.zzRH) {
                    jSONArray0.put(((MediaTrack)object0).toJson());
                }
                jSONObject0.put("tracks", jSONArray0);
            }
            if(this.zzRI != null) {
                jSONObject0.put("textTrackStyle", this.zzRI.toJson());
            }
            if(this.zzRJ != null) {
                jSONObject0.put("customData", this.zzRJ);
                return jSONObject0;
            }
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }

    void zza(MediaMetadata mediaMetadata0) {
        this.zzRF = mediaMetadata0;
    }

    void zzj(List list0) {
        this.zzRH = list0;
    }

    void zzlq() throws IllegalArgumentException {
        if(TextUtils.isEmpty(this.zzRC)) {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        if(TextUtils.isEmpty(this.zzRE)) {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        if(this.zzRD == -1) {
            throw new IllegalArgumentException("a valid stream type must be specified");
        }
    }

    void zzx(long v) throws IllegalArgumentException {
        if(v < 0L && v != -1L) {
            throw new IllegalArgumentException("Invalid stream duration");
        }
        this.zzRG = v;
    }
}

