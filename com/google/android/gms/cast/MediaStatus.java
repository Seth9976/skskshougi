package com.google.android.gms.cast;

import android.util.SparseArray;
import com.google.android.gms.cast.internal.zzf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaStatus {
    class zza {
        private int zzSm;
        private List zzSn;
        private SparseArray zzSo;
        final MediaStatus zzSp;

        zza() {
            this.zzSm = 0;
            this.zzSn = new ArrayList();
            this.zzSo = new SparseArray();
        }

        private void clear() {
            this.zzSm = 0;
            this.zzSn.clear();
            this.zzSo.clear();
        }

        public int getItemCount() {
            return this.zzSn.size();
        }

        public int getRepeatMode() {
            return this.zzSm;
        }

        private void zza(MediaQueueItem[] arr_mediaQueueItem) {
            this.zzSn.clear();
            this.zzSo.clear();
            for(int v = 0; v < arr_mediaQueueItem.length; ++v) {
                MediaQueueItem mediaQueueItem0 = arr_mediaQueueItem[v];
                this.zzSn.add(mediaQueueItem0);
                this.zzSo.put(mediaQueueItem0.getItemId(), v);
            }
        }

        public MediaQueueItem zzaD(int v) {
            Integer integer0 = (Integer)this.zzSo.get(v);
            return integer0 == null ? null : ((MediaQueueItem)this.zzSn.get(((int)integer0)));
        }

        public MediaQueueItem zzaE(int v) {
            return v >= 0 && v < this.zzSn.size() ? ((MediaQueueItem)this.zzSn.get(v)) : null;
        }

        private Integer zzaF(int v) {
            return (Integer)this.zzSo.get(v);
        }

        private boolean zzg(JSONObject jSONObject0) throws JSONException {
            int v6;
            boolean z1;
            int v = 2;
            boolean z = true;
            if(jSONObject0.has("repeatMode")) {
                int v1 = this.zzSm;
                switch(jSONObject0.getString("repeatMode")) {
                    case "REPEAT_ALL": {
                        v = 1;
                        break;
                    }
                    case "REPEAT_ALL_AND_SHUFFLE": {
                        v = 3;
                        break;
                    }
                    case "REPEAT_OFF": {
                        v = 0;
                        break;
                    }
                    case "REPEAT_SINGLE": {
                        break;
                    }
                    default: {
                        v = v1;
                    }
                }
                if(this.zzSm == v) {
                    z1 = false;
                }
                else {
                    this.zzSm = v;
                    z1 = true;
                }
            }
            else {
                z1 = false;
            }
            if(jSONObject0.has("items")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("items");
                int v2 = jSONArray0.length();
                SparseArray sparseArray0 = new SparseArray();
                for(int v3 = 0; v3 < v2; ++v3) {
                    sparseArray0.put(v3, jSONArray0.getJSONObject(v3).getInt("itemId"));
                }
                MediaQueueItem[] arr_mediaQueueItem = new MediaQueueItem[v2];
                int v4 = 0;
                boolean z2;
                for(z2 = z1; v4 < v2; z2 = v6) {
                    Integer integer0 = (Integer)sparseArray0.get(v4);
                    JSONObject jSONObject1 = jSONArray0.getJSONObject(v4);
                    MediaQueueItem mediaQueueItem0 = this.zzaD(((int)integer0));
                    if(mediaQueueItem0 == null) {
                        if(((int)integer0) == MediaStatus.this.zzSa) {
                            arr_mediaQueueItem[v4] = new Builder(MediaStatus.this.zzRK).build();
                            arr_mediaQueueItem[v4].zzg(jSONObject1);
                        }
                        else {
                            arr_mediaQueueItem[v4] = new MediaQueueItem(jSONObject1);
                        }
                        v6 = 1;
                    }
                    else {
                        int v5 = z2 | mediaQueueItem0.zzg(jSONObject1);
                        arr_mediaQueueItem[v4] = mediaQueueItem0;
                        v6 = v4 == ((int)this.zzaF(((int)integer0))) ? v5 : 1;
                    }
                    ++v4;
                }
                if(this.zzSn.size() == v2) {
                    z = z2;
                }
                this.zza(arr_mediaQueueItem);
                return z;
            }
            return z1;
        }

        public List zzlt() {
            return Collections.unmodifiableList(this.zzSn);
        }
    }

    public static final long COMMAND_PAUSE = 1L;
    public static final long COMMAND_SEEK = 2L;
    public static final long COMMAND_SET_VOLUME = 4L;
    public static final long COMMAND_SKIP_BACKWARD = 0x20L;
    public static final long COMMAND_SKIP_FORWARD = 16L;
    public static final long COMMAND_TOGGLE_MUTE = 8L;
    public static final int IDLE_REASON_CANCELED = 2;
    public static final int IDLE_REASON_ERROR = 4;
    public static final int IDLE_REASON_FINISHED = 1;
    public static final int IDLE_REASON_INTERRUPTED = 3;
    public static final int IDLE_REASON_NONE = 0;
    public static final int PLAYER_STATE_BUFFERING = 4;
    public static final int PLAYER_STATE_IDLE = 1;
    public static final int PLAYER_STATE_PAUSED = 3;
    public static final int PLAYER_STATE_PLAYING = 2;
    public static final int PLAYER_STATE_UNKNOWN = 0;
    public static final int REPEAT_MODE_REPEAT_ALL = 1;
    public static final int REPEAT_MODE_REPEAT_ALL_AND_SHUFFLE = 3;
    public static final int REPEAT_MODE_REPEAT_OFF = 0;
    public static final int REPEAT_MODE_REPEAT_SINGLE = 2;
    private JSONObject zzRJ;
    private MediaInfo zzRK;
    private long[] zzRY;
    private int zzSa;
    private long zzSb;
    private double zzSc;
    private int zzSd;
    private int zzSe;
    private long zzSf;
    private long zzSg;
    private double zzSh;
    private boolean zzSi;
    private int zzSj;
    private int zzSk;
    private final zza zzSl;

    public MediaStatus(JSONObject json) throws JSONException {
        this.zzSa = 0;
        this.zzSj = 0;
        this.zzSk = 0;
        this.zzSl = new zza(this);
        this.zza(json, 0);
    }

    public long[] getActiveTrackIds() {
        return this.zzRY;
    }

    public int getCurrentItemId() {
        return this.zzSa;
    }

    public JSONObject getCustomData() {
        return this.zzRJ;
    }

    public int getIdleReason() {
        return this.zzSe;
    }

    public int getLoadingItemId() {
        return this.zzSj;
    }

    public MediaInfo getMediaInfo() {
        return this.zzRK;
    }

    public double getPlaybackRate() {
        return this.zzSc;
    }

    public int getPlayerState() {
        return this.zzSd;
    }

    public int getPreloadedItemId() {
        return this.zzSk;
    }

    public MediaQueueItem getQueueItem(int index) {
        return this.zzSl.zzaE(index);
    }

    public MediaQueueItem getQueueItemById(int itemId) {
        return this.zzSl.zzaD(itemId);
    }

    public int getQueueItemCount() {
        return this.zzSl.getItemCount();
    }

    public List getQueueItems() {
        return this.zzSl.zzlt();
    }

    public int getQueueRepeatMode() {
        return this.zzSl.getRepeatMode();
    }

    public long getStreamPosition() {
        return this.zzSf;
    }

    public double getStreamVolume() {
        return this.zzSh;
    }

    public boolean isMediaCommandSupported(long mediaCommand) {
        return (this.zzSg & mediaCommand) != 0L;
    }

    public boolean isMute() {
        return this.zzSi;
    }

    public int zza(JSONObject jSONObject0, int v) throws JSONException {
        long[] arr_v1;
        int v11;
        int v5;
        int v4;
        int v1 = 2;
        int v2 = 1;
        long v3 = jSONObject0.getLong("mediaSessionId");
        if(v3 == this.zzSb) {
            v4 = 0;
        }
        else {
            this.zzSb = v3;
            v4 = 1;
        }
        if(jSONObject0.has("playerState")) {
            String s = jSONObject0.getString("playerState");
            if(s.equals("IDLE")) {
                v5 = 1;
            }
            else if(s.equals("PLAYING")) {
                v5 = 2;
            }
            else if(s.equals("PAUSED")) {
                v5 = 3;
            }
            else {
                v5 = s.equals("BUFFERING") ? 4 : 0;
            }
            if(v5 != this.zzSd) {
                this.zzSd = v5;
                v4 |= 2;
            }
            if(v5 == 1 && jSONObject0.has("idleReason")) {
                String s1 = jSONObject0.getString("idleReason");
                if(!s1.equals("CANCELLED")) {
                    if(s1.equals("INTERRUPTED")) {
                        v1 = 3;
                    }
                    else if(s1.equals("FINISHED")) {
                        v1 = 1;
                    }
                    else {
                        v1 = s1.equals("ERROR") ? 4 : 0;
                    }
                }
                if(v1 != this.zzSe) {
                    this.zzSe = v1;
                    v4 |= 2;
                }
            }
        }
        if(jSONObject0.has("playbackRate")) {
            double f = jSONObject0.getDouble("playbackRate");
            if(this.zzSc != f) {
                this.zzSc = f;
                v4 |= 2;
            }
        }
        if(jSONObject0.has("currentTime") && (v & 2) == 0) {
            long v6 = zzf.zze(jSONObject0.getDouble("currentTime"));
            if(v6 != this.zzSf) {
                this.zzSf = v6;
                v4 |= 2;
            }
        }
        if(jSONObject0.has("supportedMediaCommands")) {
            long v7 = jSONObject0.getLong("supportedMediaCommands");
            if(v7 != this.zzSg) {
                this.zzSg = v7;
                v4 |= 2;
            }
        }
        if(jSONObject0.has("volume") && (v & 1) == 0) {
            JSONObject jSONObject1 = jSONObject0.getJSONObject("volume");
            double f1 = jSONObject1.getDouble("level");
            if(f1 != this.zzSh) {
                this.zzSh = f1;
                v4 |= 2;
            }
            boolean z = jSONObject1.getBoolean("muted");
            if(z != this.zzSi) {
                this.zzSi = z;
                v4 |= 2;
            }
        }
        if(jSONObject0.has("activeTrackIds")) {
            JSONArray jSONArray0 = jSONObject0.getJSONArray("activeTrackIds");
            int v8 = jSONArray0.length();
            long[] arr_v = new long[v8];
            for(int v9 = 0; v9 < v8; ++v9) {
                arr_v[v9] = jSONArray0.getLong(v9);
            }
            if(this.zzRY != null && this.zzRY.length == v8) {
                for(int v10 = 0; true; ++v10) {
                    if(v10 >= v8) {
                        v2 = 0;
                        break;
                    }
                    if(this.zzRY[v10] != arr_v[v10]) {
                        break;
                    }
                }
            }
            if(v2 != 0) {
                this.zzRY = arr_v;
            }
            v11 = v2;
            arr_v1 = arr_v;
        }
        else if(this.zzRY == null) {
            arr_v1 = null;
            v11 = 0;
        }
        else {
            v11 = 1;
            arr_v1 = null;
        }
        if(v11 != 0) {
            this.zzRY = arr_v1;
            v4 |= 2;
        }
        if(jSONObject0.has("customData")) {
            this.zzRJ = jSONObject0.getJSONObject("customData");
            v4 |= 2;
        }
        if(jSONObject0.has("media")) {
            JSONObject jSONObject2 = jSONObject0.getJSONObject("media");
            this.zzRK = new MediaInfo(jSONObject2);
            v4 |= 2;
            if(jSONObject2.has("metadata")) {
                v4 |= 4;
            }
        }
        if(jSONObject0.has("currentItemId")) {
            int v12 = jSONObject0.getInt("currentItemId");
            if(this.zzSa != v12) {
                this.zzSa = v12;
                v4 |= 2;
            }
        }
        int v13 = jSONObject0.optInt("preloadedItemId", 0);
        if(this.zzSk != v13) {
            this.zzSk = v13;
            v4 |= 16;
        }
        int v14 = jSONObject0.optInt("loadingItemId", 0);
        if(this.zzSj != v14) {
            this.zzSj = v14;
            v4 |= 2;
        }
        if(!this.zzh(this.zzSd, this.zzSj)) {
            return this.zzSl.zzg(jSONObject0) ? v4 | 8 : v4;
        }
        this.zzSa = 0;
        this.zzSj = 0;
        this.zzSk = 0;
        if(this.zzSl.getItemCount() > 0) {
            this.zzSl.clear();
            return v4 | 8;
        }
        return v4;
    }

    private boolean zzh(int v, int v1) {
        return v == 1 && v1 == 0;
    }

    public long zzls() {
        return this.zzSb;
    }
}

