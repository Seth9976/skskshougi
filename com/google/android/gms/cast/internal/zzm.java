package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzm extends zzc {
    private static final String NAMESPACE;
    private final List zzTo;
    private long zzUY;
    private MediaStatus zzUZ;
    private final zzp zzVa;
    private final zzp zzVb;
    private final zzp zzVc;
    private final zzp zzVd;
    private final zzp zzVe;
    private final zzp zzVf;
    private final zzp zzVg;
    private final zzp zzVh;
    private final zzp zzVi;
    private final zzp zzVj;
    private final zzp zzVk;
    private final zzp zzVl;
    private final zzp zzVm;
    private final zzp zzVn;

    static {
        zzm.NAMESPACE = "urn:x-cast:com.google.cast.media";
    }

    public zzm(String s) {
        super("urn:x-cast:com.google.cast.media", "MediaControlChannel", s, 1000L);
        this.zzVa = new zzp(86400000L);
        this.zzVb = new zzp(86400000L);
        this.zzVc = new zzp(86400000L);
        this.zzVd = new zzp(86400000L);
        this.zzVe = new zzp(86400000L);
        this.zzVf = new zzp(86400000L);
        this.zzVg = new zzp(86400000L);
        this.zzVh = new zzp(86400000L);
        this.zzVi = new zzp(86400000L);
        this.zzVj = new zzp(86400000L);
        this.zzVk = new zzp(86400000L);
        this.zzVl = new zzp(86400000L);
        this.zzVm = new zzp(86400000L);
        this.zzVn = new zzp(86400000L);
        this.zzTo = new ArrayList();
        this.zzTo.add(this.zzVa);
        this.zzTo.add(this.zzVb);
        this.zzTo.add(this.zzVc);
        this.zzTo.add(this.zzVd);
        this.zzTo.add(this.zzVe);
        this.zzTo.add(this.zzVf);
        this.zzTo.add(this.zzVg);
        this.zzTo.add(this.zzVh);
        this.zzTo.add(this.zzVi);
        this.zzTo.add(this.zzVj);
        this.zzTo.add(this.zzVk);
        this.zzTo.add(this.zzVl);
        this.zzTo.add(this.zzVm);
        this.zzTo.add(this.zzVn);
        this.zzmc();
    }

    public long getApproximateStreamPosition() {
        MediaInfo mediaInfo0 = this.getMediaInfo();
        if(mediaInfo0 != null && this.zzUY != 0L) {
            double f = this.zzUZ.getPlaybackRate();
            long v = this.zzUZ.getStreamPosition();
            if(f == 0.0 || this.zzUZ.getPlayerState() != 2) {
                return v;
            }
            long v1 = SystemClock.elapsedRealtime() - this.zzUY;
            long v2 = v1 >= 0L ? v1 : 0L;
            if(v2 == 0L) {
                return v;
            }
            long v3 = mediaInfo0.getStreamDuration();
            long v4 = v + ((long)(((double)v2) * f));
            if(v3 > 0L && v4 > v3) {
                return v3;
            }
            return v4 >= 0L ? v4 : 0L;
        }
        return 0L;
    }

    public MediaInfo getMediaInfo() {
        return this.zzUZ == null ? null : this.zzUZ.getMediaInfo();
    }

    public MediaStatus getMediaStatus() {
        return this.zzUZ;
    }

    public long getStreamDuration() {
        MediaInfo mediaInfo0 = this.getMediaInfo();
        return mediaInfo0 == null ? 0L : mediaInfo0.getStreamDuration();
    }

    protected void onMetadataUpdated() {
    }

    protected void onPreloadStatusUpdated() {
    }

    protected void onQueueStatusUpdated() {
    }

    protected void onStatusUpdated() {
    }

    private void zza(long v, JSONObject jSONObject0) throws JSONException {
        int v2;
        boolean z = true;
        boolean z1 = this.zzVa.zzB(v);
        boolean z2 = this.zzVe.zzme() && !this.zzVe.zzB(v);
        if((!this.zzVf.zzme() || this.zzVf.zzB(v)) && (!this.zzVg.zzme() || this.zzVg.zzB(v))) {
            z = false;
        }
        int v1 = z2 ? 2 : 0;
        if(z) {
            v1 |= 1;
        }
        if(!z1 && this.zzUZ != null) {
            v2 = this.zzUZ.zza(jSONObject0, v1);
        }
        else {
            this.zzUZ = new MediaStatus(jSONObject0);
            this.zzUY = SystemClock.elapsedRealtime();
            v2 = 0x1F;
        }
        if((v2 & 1) != 0) {
            this.zzUY = SystemClock.elapsedRealtime();
            this.onStatusUpdated();
        }
        if((v2 & 2) != 0) {
            this.zzUY = SystemClock.elapsedRealtime();
            this.onStatusUpdated();
        }
        if((v2 & 4) != 0) {
            this.onMetadataUpdated();
        }
        if((v2 & 8) != 0) {
            this.onQueueStatusUpdated();
        }
        if((v2 & 16) != 0) {
            this.onPreloadStatusUpdated();
        }
        for(Object object0: this.zzTo) {
            ((zzp)object0).zzc(v, 0);
        }
    }

    public long zza(zzo zzo0) throws IOException {
        JSONObject jSONObject0 = new JSONObject();
        long v = this.zzlK();
        this.zzVh.zza(v, zzo0);
        this.zzQ(true);
        try {
            jSONObject0.put("requestId", v);
            jSONObject0.put("type", "GET_STATUS");
            if(this.zzUZ != null) {
                jSONObject0.put("mediaSessionId", this.zzUZ.zzls());
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject0.toString(), v, null);
        return v;
    }

    public long zza(zzo zzo0, double f, JSONObject jSONObject0) throws IOException, IllegalStateException, IllegalArgumentException {
        if(Double.isInfinite(f) || Double.isNaN(f)) {
            throw new IllegalArgumentException("Volume cannot be " + f);
        }
        JSONObject jSONObject1 = new JSONObject();
        long v = this.zzlK();
        this.zzVf.zza(v, zzo0);
        this.zzQ(true);
        try {
            jSONObject1.put("requestId", v);
            jSONObject1.put("type", "SET_VOLUME");
            jSONObject1.put("mediaSessionId", this.zzls());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("level", f);
            jSONObject1.put("volume", jSONObject2);
            if(jSONObject0 != null) {
                jSONObject1.put("customData", jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject1.toString(), v, null);
        return v;
    }

    public long zza(zzo zzo0, int v, MediaQueueItem[] arr_mediaQueueItem, int v1, Integer integer0, JSONObject jSONObject0) throws IOException, IllegalStateException {
        JSONObject jSONObject1 = new JSONObject();
        long v2 = this.zzlK();
        this.zzVl.zza(v2, zzo0);
        this.zzQ(true);
        try {
            jSONObject1.put("requestId", v2);
            jSONObject1.put("type", "QUEUE_UPDATE");
            jSONObject1.put("mediaSessionId", this.zzls());
            if(v != 0) {
                jSONObject1.put("currentItemId", v);
            }
            if(v1 != 0) {
                jSONObject1.put("jump", v1);
            }
            if(arr_mediaQueueItem != null && arr_mediaQueueItem.length > 0) {
                JSONArray jSONArray0 = new JSONArray();
                for(int v3 = 0; v3 < arr_mediaQueueItem.length; ++v3) {
                    jSONArray0.put(v3, arr_mediaQueueItem[v3].toJson());
                }
                jSONObject1.put("items", jSONArray0);
            }
            if(integer0 != null) {
                switch(((int)integer0)) {
                    case 0: {
                        jSONObject1.put("repeatMode", "REPEAT_OFF");
                        break;
                    }
                    case 1: {
                        jSONObject1.put("repeatMode", "REPEAT_ALL");
                        break;
                    }
                    case 2: {
                        jSONObject1.put("repeatMode", "REPEAT_SINGLE");
                        break;
                    }
                    case 3: {
                        jSONObject1.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
                    }
                }
            }
            if(jSONObject0 != null) {
                jSONObject1.put("customData", jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject1.toString(), v2, null);
        return v2;
    }

    public long zza(zzo zzo0, long v, int v1, JSONObject jSONObject0) throws IOException, IllegalStateException {
        JSONObject jSONObject1 = new JSONObject();
        long v2 = this.zzlK();
        this.zzVe.zza(v2, zzo0);
        this.zzQ(true);
        try {
            jSONObject1.put("requestId", v2);
            jSONObject1.put("type", "SEEK");
            jSONObject1.put("mediaSessionId", this.zzls());
            jSONObject1.put("currentTime", zzf.zzA(v));
            if(v1 == 1) {
                jSONObject1.put("resumeState", "PLAYBACK_START");
            }
            else if(v1 == 2) {
                jSONObject1.put("resumeState", "PLAYBACK_PAUSE");
            }
            if(jSONObject0 != null) {
                jSONObject1.put("customData", jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject1.toString(), v2, null);
        return v2;
    }

    public long zza(zzo zzo0, MediaInfo mediaInfo0, boolean z, long v, long[] arr_v, JSONObject jSONObject0) throws IOException {
        JSONObject jSONObject1 = new JSONObject();
        long v1 = this.zzlK();
        this.zzVa.zza(v1, zzo0);
        this.zzQ(true);
        try {
            jSONObject1.put("requestId", v1);
            jSONObject1.put("type", "LOAD");
            jSONObject1.put("media", mediaInfo0.toJson());
            jSONObject1.put("autoplay", z);
            jSONObject1.put("currentTime", zzf.zzA(v));
            if(arr_v != null) {
                JSONArray jSONArray0 = new JSONArray();
                for(int v2 = 0; v2 < arr_v.length; ++v2) {
                    jSONArray0.put(v2, arr_v[v2]);
                }
                jSONObject1.put("activeTrackIds", jSONArray0);
            }
            if(jSONObject0 != null) {
                jSONObject1.put("customData", jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject1.toString(), v1, null);
        return v1;
    }

    public long zza(zzo zzo0, TextTrackStyle textTrackStyle0) throws IOException {
        JSONObject jSONObject0 = new JSONObject();
        long v = this.zzlK();
        this.zzVj.zza(v, zzo0);
        this.zzQ(true);
        try {
            jSONObject0.put("requestId", v);
            jSONObject0.put("type", "EDIT_TRACKS_INFO");
            if(textTrackStyle0 != null) {
                jSONObject0.put("textTrackStyle", textTrackStyle0.toJson());
            }
            jSONObject0.put("mediaSessionId", this.zzls());
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject0.toString(), v, null);
        return v;
    }

    public long zza(zzo zzo0, JSONObject jSONObject0) throws IOException {
        JSONObject jSONObject1 = new JSONObject();
        long v = this.zzlK();
        this.zzVb.zza(v, zzo0);
        this.zzQ(true);
        try {
            jSONObject1.put("requestId", v);
            jSONObject1.put("type", "PAUSE");
            jSONObject1.put("mediaSessionId", this.zzls());
            if(jSONObject0 != null) {
                jSONObject1.put("customData", jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject1.toString(), v, null);
        return v;
    }

    public long zza(zzo zzo0, boolean z, JSONObject jSONObject0) throws IOException, IllegalStateException {
        JSONObject jSONObject1 = new JSONObject();
        long v = this.zzlK();
        this.zzVg.zza(v, zzo0);
        this.zzQ(true);
        try {
            jSONObject1.put("requestId", v);
            jSONObject1.put("type", "SET_VOLUME");
            jSONObject1.put("mediaSessionId", this.zzls());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("muted", z);
            jSONObject1.put("volume", jSONObject2);
            if(jSONObject0 != null) {
                jSONObject1.put("customData", jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject1.toString(), v, null);
        return v;
    }

    public long zza(zzo zzo0, int[] arr_v, int v, JSONObject jSONObject0) throws IOException, IllegalStateException, IllegalArgumentException {
        if(arr_v == null || arr_v.length == 0) {
            throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
        }
        JSONObject jSONObject1 = new JSONObject();
        long v1 = this.zzlK();
        this.zzVn.zza(v1, zzo0);
        this.zzQ(true);
        try {
            jSONObject1.put("requestId", v1);
            jSONObject1.put("type", "QUEUE_REORDER");
            jSONObject1.put("mediaSessionId", this.zzls());
            JSONArray jSONArray0 = new JSONArray();
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                jSONArray0.put(v2, arr_v[v2]);
            }
            jSONObject1.put("itemIds", jSONArray0);
            if(v != 0) {
                jSONObject1.put("insertBefore", v);
            }
            if(jSONObject0 != null) {
                jSONObject1.put("customData", jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject1.toString(), v1, null);
        return v1;
    }

    public long zza(zzo zzo0, int[] arr_v, JSONObject jSONObject0) throws IOException, IllegalStateException, IllegalArgumentException {
        if(arr_v == null || arr_v.length == 0) {
            throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
        }
        JSONObject jSONObject1 = new JSONObject();
        long v = this.zzlK();
        this.zzVm.zza(v, zzo0);
        this.zzQ(true);
        try {
            jSONObject1.put("requestId", v);
            jSONObject1.put("type", "QUEUE_REMOVE");
            jSONObject1.put("mediaSessionId", this.zzls());
            JSONArray jSONArray0 = new JSONArray();
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                jSONArray0.put(v1, arr_v[v1]);
            }
            jSONObject1.put("itemIds", jSONArray0);
            if(jSONObject0 != null) {
                jSONObject1.put("customData", jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject1.toString(), v, null);
        return v;
    }

    public long zza(zzo zzo0, long[] arr_v) throws IOException {
        JSONObject jSONObject0 = new JSONObject();
        long v = this.zzlK();
        this.zzVi.zza(v, zzo0);
        this.zzQ(true);
        try {
            jSONObject0.put("requestId", v);
            jSONObject0.put("type", "EDIT_TRACKS_INFO");
            jSONObject0.put("mediaSessionId", this.zzls());
            JSONArray jSONArray0 = new JSONArray();
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                jSONArray0.put(v1, arr_v[v1]);
            }
            jSONObject0.put("activeTrackIds", jSONArray0);
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject0.toString(), v, null);
        return v;
    }

    public long zza(zzo zzo0, MediaQueueItem[] arr_mediaQueueItem, int v, int v1, JSONObject jSONObject0) throws IOException, IllegalArgumentException {
        if(arr_mediaQueueItem == null || arr_mediaQueueItem.length == 0) {
            throw new IllegalArgumentException("items must not be null or empty.");
        }
        if(v < 0 || v >= arr_mediaQueueItem.length) {
            throw new IllegalArgumentException("Invalid startIndex: " + v);
        }
        JSONObject jSONObject1 = new JSONObject();
        long v2 = this.zzlK();
        this.zzVa.zza(v2, zzo0);
        this.zzQ(true);
        try {
            jSONObject1.put("requestId", v2);
            jSONObject1.put("type", "QUEUE_LOAD");
            JSONArray jSONArray0 = new JSONArray();
            for(int v3 = 0; v3 < arr_mediaQueueItem.length; ++v3) {
                jSONArray0.put(v3, arr_mediaQueueItem[v3].toJson());
            }
            jSONObject1.put("items", jSONArray0);
            switch(v1) {
                case 0: {
                    jSONObject1.put("repeatMode", "REPEAT_OFF");
                    break;
                }
                case 1: {
                    jSONObject1.put("repeatMode", "REPEAT_ALL");
                    break;
                }
                case 2: {
                    jSONObject1.put("repeatMode", "REPEAT_SINGLE");
                    break;
                }
                case 3: {
                    jSONObject1.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Invalid repeat mode: " + v1);
                }
            }
            jSONObject1.put("startIndex", v);
            if(jSONObject0 != null) {
                jSONObject1.put("customData", jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject1.toString(), v2, null);
        return v2;
    }

    public long zza(zzo zzo0, MediaQueueItem[] arr_mediaQueueItem, int v, JSONObject jSONObject0) throws IOException, IllegalStateException, IllegalStateException {
        if(arr_mediaQueueItem == null || arr_mediaQueueItem.length == 0) {
            throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
        }
        JSONObject jSONObject1 = new JSONObject();
        long v1 = this.zzlK();
        this.zzVk.zza(v1, zzo0);
        this.zzQ(true);
        try {
            jSONObject1.put("requestId", v1);
            jSONObject1.put("type", "QUEUE_INSERT");
            jSONObject1.put("mediaSessionId", this.zzls());
            JSONArray jSONArray0 = new JSONArray();
            for(int v2 = 0; v2 < arr_mediaQueueItem.length; ++v2) {
                jSONArray0.put(v2, arr_mediaQueueItem[v2].toJson());
            }
            jSONObject1.put("items", jSONArray0);
            if(v != 0) {
                jSONObject1.put("insertBefore", v);
            }
            if(jSONObject0 != null) {
                jSONObject1.put("customData", jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject1.toString(), v1, null);
        return v1;
    }

    public long zzb(zzo zzo0, JSONObject jSONObject0) throws IOException {
        JSONObject jSONObject1 = new JSONObject();
        long v = this.zzlK();
        this.zzVd.zza(v, zzo0);
        this.zzQ(true);
        try {
            jSONObject1.put("requestId", v);
            jSONObject1.put("type", "STOP");
            jSONObject1.put("mediaSessionId", this.zzls());
            if(jSONObject0 != null) {
                jSONObject1.put("customData", jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject1.toString(), v, null);
        return v;
    }

    @Override  // com.google.android.gms.cast.internal.zzd
    public void zzb(long v, int v1) {
        for(Object object0: this.zzTo) {
            ((zzp)object0).zzc(v, v1);
        }
    }

    @Override  // com.google.android.gms.cast.internal.zzd
    public final void zzbB(String s) {
        this.zzUi.zzb("message received: %s", new Object[]{s});
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            String s1 = jSONObject0.getString("type");
            long v = jSONObject0.optLong("requestId", -1L);
            if(s1.equals("MEDIA_STATUS")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("status");
                if(jSONArray0.length() > 0) {
                    this.zza(v, jSONArray0.getJSONObject(0));
                    return;
                }
                this.zzUZ = null;
                this.onStatusUpdated();
                this.onMetadataUpdated();
                this.onQueueStatusUpdated();
                this.onPreloadStatusUpdated();
                this.zzVh.zzc(v, 0);
                return;
            }
            if(!s1.equals("INVALID_PLAYER_STATE")) {
                if(s1.equals("LOAD_FAILED")) {
                    JSONObject jSONObject1 = jSONObject0.optJSONObject("customData");
                    this.zzVa.zzc(v, 2100, jSONObject1);
                    return;
                }
                if(s1.equals("LOAD_CANCELLED")) {
                    JSONObject jSONObject2 = jSONObject0.optJSONObject("customData");
                    this.zzVa.zzc(v, 2101, jSONObject2);
                    return;
                }
                if(s1.equals("INVALID_REQUEST")) {
                    this.zzUi.zzf("received unexpected error: Invalid Request.", new Object[0]);
                    JSONObject jSONObject3 = jSONObject0.optJSONObject("customData");
                    for(Object object0: this.zzTo) {
                        ((zzp)object0).zzc(v, 2100, jSONObject3);
                    }
                }
                return;
            }
            this.zzUi.zzf("received unexpected error: Invalid Player State.", new Object[0]);
            JSONObject jSONObject4 = jSONObject0.optJSONObject("customData");
            for(Object object1: this.zzTo) {
                ((zzp)object1).zzc(v, 2100, jSONObject4);
            }
        }
        catch(JSONException jSONException0) {
            this.zzUi.zzf("Message is malformed (%s); ignoring: %s", new Object[]{jSONException0.getMessage(), s});
        }
    }

    public long zzc(zzo zzo0, JSONObject jSONObject0) throws IOException, IllegalStateException {
        JSONObject jSONObject1 = new JSONObject();
        long v = this.zzlK();
        this.zzVc.zza(v, zzo0);
        this.zzQ(true);
        try {
            jSONObject1.put("requestId", v);
            jSONObject1.put("type", "PLAY");
            jSONObject1.put("mediaSessionId", this.zzls());
            if(jSONObject0 != null) {
                jSONObject1.put("customData", jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
        }
        this.zza(jSONObject1.toString(), v, null);
        return v;
    }

    @Override  // com.google.android.gms.cast.internal.zzc
    public void zzlJ() {
        super.zzlJ();
        this.zzmc();
    }

    public long zzls() throws IllegalStateException {
        if(this.zzUZ == null) {
            throw new IllegalStateException("No current media session");
        }
        return this.zzUZ.zzls();
    }

    private void zzmc() {
        this.zzUY = 0L;
        this.zzUZ = null;
        for(Object object0: this.zzTo) {
            ((zzp)object0).clear();
        }
    }

    @Override  // com.google.android.gms.cast.internal.zzc
    protected boolean zzz(long v) {
        for(Object object0: this.zzTo) {
            ((zzp)object0).zzd(v, 2102);
        }
        boolean z = false;
        synchronized(zzp.zzVr) {
            for(Object object2: this.zzTo) {
                if(((zzp)object2).zzme()) {
                    z = true;
                    break;
                }
            }
            return z;
        }
    }
}

