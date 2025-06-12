package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzlh;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaQueueItem {
    public static class Builder {
        private final MediaQueueItem zzRZ;

        public Builder(MediaInfo media) throws IllegalArgumentException {
            this.zzRZ = new MediaQueueItem(media, null);
        }

        public Builder(MediaQueueItem item) throws IllegalArgumentException {
            this.zzRZ = new MediaQueueItem(item, null);
        }

        public Builder(JSONObject json) throws JSONException {
            this.zzRZ = new MediaQueueItem(json);
        }

        public MediaQueueItem build() {
            this.zzRZ.zzlq();
            return this.zzRZ;
        }

        public Builder clearItemId() {
            this.zzRZ.zzaC(0);
            return this;
        }

        public Builder setActiveTrackIds(long[] activeTrackIds) {
            this.zzRZ.zza(activeTrackIds);
            return this;
        }

        public Builder setAutoplay(boolean autoplay) {
            this.zzRZ.zzP(autoplay);
            return this;
        }

        public Builder setCustomData(JSONObject customData) {
            this.zzRZ.setCustomData(customData);
            return this;
        }

        public Builder setPreloadTime(double preloadTime) throws IllegalArgumentException {
            this.zzRZ.zzc(preloadTime);
            return this;
        }

        public Builder setStartTime(double startTime) throws IllegalArgumentException {
            this.zzRZ.zzb(startTime);
            return this;
        }
    }

    public static final double DEFAULT_PLAYBACK_DURATION = Infinity;
    public static final int INVALID_ITEM_ID;
    private JSONObject zzRJ;
    private MediaInfo zzRS;
    private int zzRT;
    private boolean zzRU;
    private double zzRV;
    private double zzRW;
    private double zzRX;
    private long[] zzRY;

    private MediaQueueItem(MediaInfo media) throws IllegalArgumentException {
        this.zzRT = 0;
        this.zzRU = true;
        this.zzRW = Infinity;
        if(media == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.zzRS = media;
    }

    MediaQueueItem(MediaInfo x0, com.google.android.gms.cast.MediaQueueItem.1 x1) throws IllegalArgumentException {
        this(x0);
    }

    private MediaQueueItem(MediaQueueItem item) throws IllegalArgumentException {
        this.zzRT = 0;
        this.zzRU = true;
        this.zzRW = Infinity;
        this.zzRS = item.getMedia();
        if(this.zzRS == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.zzRT = item.getItemId();
        this.zzRU = item.getAutoplay();
        this.zzRV = item.getStartTime();
        this.zzRW = item.zzlr();
        this.zzRX = item.getPreloadTime();
        this.zzRY = item.getActiveTrackIds();
        this.zzRJ = item.getCustomData();
    }

    MediaQueueItem(MediaQueueItem x0, com.google.android.gms.cast.MediaQueueItem.1 x1) throws IllegalArgumentException {
        this(x0);
    }

    MediaQueueItem(JSONObject json) throws JSONException {
        this.zzRT = 0;
        this.zzRU = true;
        this.zzRW = Infinity;
        this.zzg(json);
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }
        if(other instanceof MediaQueueItem) {
            if(this.zzRJ == null) {
                return ((MediaQueueItem)other).zzRJ == null ? (this.zzRJ == null || ((MediaQueueItem)other).zzRJ == null || zzlh.zzd(this.zzRJ, ((MediaQueueItem)other).zzRJ)) && (zzf.zza(this.zzRS, ((MediaQueueItem)other).zzRS) && this.zzRT == ((MediaQueueItem)other).zzRT && this.zzRU == ((MediaQueueItem)other).zzRU && this.zzRV == ((MediaQueueItem)other).zzRV && this.zzRW == ((MediaQueueItem)other).zzRW && this.zzRX == ((MediaQueueItem)other).zzRX && zzf.zza(this.zzRY, ((MediaQueueItem)other).zzRY)) : false;
            }
            return ((MediaQueueItem)other).zzRJ == null ? false : (this.zzRJ == null || ((MediaQueueItem)other).zzRJ == null || zzlh.zzd(this.zzRJ, ((MediaQueueItem)other).zzRJ)) && (zzf.zza(this.zzRS, ((MediaQueueItem)other).zzRS) && this.zzRT == ((MediaQueueItem)other).zzRT && this.zzRU == ((MediaQueueItem)other).zzRU && this.zzRV == ((MediaQueueItem)other).zzRV && this.zzRW == ((MediaQueueItem)other).zzRW && this.zzRX == ((MediaQueueItem)other).zzRX && zzf.zza(this.zzRY, ((MediaQueueItem)other).zzRY));
        }
        return false;
    }

    public long[] getActiveTrackIds() {
        return this.zzRY;
    }

    public boolean getAutoplay() {
        return this.zzRU;
    }

    public JSONObject getCustomData() {
        return this.zzRJ;
    }

    public int getItemId() {
        return this.zzRT;
    }

    public MediaInfo getMedia() {
        return this.zzRS;
    }

    public double getPreloadTime() {
        return this.zzRX;
    }

    public double getStartTime() {
        return this.zzRV;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzRS, this.zzRT, Boolean.valueOf(this.zzRU), this.zzRV, this.zzRW, this.zzRX, this.zzRY, String.valueOf(this.zzRJ)});
    }

    void setCustomData(JSONObject customData) {
        this.zzRJ = customData;
    }

    public JSONObject toJson() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("media", this.zzRS.toJson());
            if(this.zzRT != 0) {
                jSONObject0.put("itemId", this.zzRT);
            }
            jSONObject0.put("autoplay", this.zzRU);
            jSONObject0.put("startTime", this.zzRV);
            if(this.zzRW != Infinity) {
                jSONObject0.put("playbackDuration", this.zzRW);
            }
            jSONObject0.put("preloadTime", this.zzRX);
            if(this.zzRY != null && this.zzRY.length > 0) {
                JSONArray jSONArray0 = new JSONArray();
                long[] arr_v = this.zzRY;
                for(int v = 0; v < arr_v.length; ++v) {
                    jSONArray0.put(arr_v[v]);
                }
                jSONObject0.put("activeTrackIds", jSONArray0);
            }
            if(this.zzRJ != null) {
                jSONObject0.put("customData", this.zzRJ);
            }
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }

    void zzP(boolean z) {
        this.zzRU = z;
    }

    void zza(long[] arr_v) {
        this.zzRY = arr_v;
    }

    void zzaC(int v) {
        this.zzRT = v;
    }

    void zzb(double f) throws IllegalArgumentException {
        if(Double.isNaN(f) || f < 0.0) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        this.zzRV = f;
    }

    void zzc(double f) throws IllegalArgumentException {
        if(Double.isNaN(f) || f < 0.0) {
            throw new IllegalArgumentException("preloadTime cannot be negative or NaN.");
        }
        this.zzRX = f;
    }

    public boolean zzg(JSONObject jSONObject0) throws JSONException {
        boolean z2;
        long[] arr_v1;
        boolean z;
        if(jSONObject0.has("media")) {
            this.zzRS = new MediaInfo(jSONObject0.getJSONObject("media"));
            z = true;
        }
        else {
            z = false;
        }
        if(jSONObject0.has("itemId")) {
            int v = jSONObject0.getInt("itemId");
            if(this.zzRT != v) {
                this.zzRT = v;
                z = true;
            }
        }
        if(jSONObject0.has("autoplay")) {
            boolean z1 = jSONObject0.getBoolean("autoplay");
            if(this.zzRU != z1) {
                this.zzRU = z1;
                z = true;
            }
        }
        if(jSONObject0.has("startTime")) {
            double f = jSONObject0.getDouble("startTime");
            if(Math.abs(f - this.zzRV) > 1.000000E-07) {
                this.zzRV = f;
                z = true;
            }
        }
        if(jSONObject0.has("playbackDuration")) {
            double f1 = jSONObject0.getDouble("playbackDuration");
            if(Math.abs(f1 - this.zzRW) > 1.000000E-07) {
                this.zzRW = f1;
                z = true;
            }
        }
        if(jSONObject0.has("preloadTime")) {
            double f2 = jSONObject0.getDouble("preloadTime");
            if(Math.abs(f2 - this.zzRX) > 1.000000E-07) {
                this.zzRX = f2;
                z = true;
            }
        }
        if(jSONObject0.has("activeTrackIds")) {
            JSONArray jSONArray0 = jSONObject0.getJSONArray("activeTrackIds");
            int v1 = jSONArray0.length();
            long[] arr_v = new long[v1];
            for(int v2 = 0; v2 < v1; ++v2) {
                arr_v[v2] = jSONArray0.getLong(v2);
            }
            if(this.zzRY == null) {
                arr_v1 = arr_v;
                z2 = true;
            }
            else if(this.zzRY.length == v1) {
                z2 = false;
                int v3 = 0;
                while(v3 < v1) {
                    if(this.zzRY[v3] != arr_v[v3]) {
                        arr_v1 = arr_v;
                        z2 = true;
                        goto label_60;
                    }
                    ++v3;
                }
                arr_v1 = arr_v;
            }
            else {
                arr_v1 = arr_v;
                z2 = true;
            }
        }
        else {
            z2 = false;
            arr_v1 = null;
        }
    label_60:
        if(z2) {
            this.zzRY = arr_v1;
            z = true;
        }
        if(jSONObject0.has("customData")) {
            this.zzRJ = jSONObject0.getJSONObject("customData");
            return true;
        }
        return z;
    }

    void zzlq() throws IllegalArgumentException {
        if(this.zzRS == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if(Double.isNaN(this.zzRV) || this.zzRV < 0.0) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if(Double.isNaN(this.zzRW)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if(Double.isNaN(this.zzRX) || this.zzRX < 0.0) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public double zzlr() {
        return this.zzRW;
    }

    class com.google.android.gms.cast.MediaQueueItem.1 {
    }

}

