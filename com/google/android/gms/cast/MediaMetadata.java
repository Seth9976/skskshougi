package com.google.android.gms.cast;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.internal.zzjz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaMetadata {
    static class zza {
        private final Map zzRP;
        private final Map zzRQ;
        private final Map zzRR;

        public zza() {
            this.zzRP = new HashMap();
            this.zzRQ = new HashMap();
            this.zzRR = new HashMap();
        }

        public zza zzb(String s, String s1, int v) {
            this.zzRP.put(s, s1);
            this.zzRQ.put(s1, s);
            this.zzRR.put(s, v);
            return this;
        }

        public String zzbw(String s) {
            return (String)this.zzRP.get(s);
        }

        public String zzbx(String s) {
            return (String)this.zzRQ.get(s);
        }

        public int zzby(String s) {
            Integer integer0 = (Integer)this.zzRR.get(s);
            return integer0 == null ? 0 : ((int)integer0);
        }
    }

    public static final String KEY_ALBUM_ARTIST = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
    public static final String KEY_ALBUM_TITLE = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
    public static final String KEY_ARTIST = "com.google.android.gms.cast.metadata.ARTIST";
    public static final String KEY_BROADCAST_DATE = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
    public static final String KEY_COMPOSER = "com.google.android.gms.cast.metadata.COMPOSER";
    public static final String KEY_CREATION_DATE = "com.google.android.gms.cast.metadata.CREATION_DATE";
    public static final String KEY_DISC_NUMBER = "com.google.android.gms.cast.metadata.DISC_NUMBER";
    public static final String KEY_EPISODE_NUMBER = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
    public static final String KEY_HEIGHT = "com.google.android.gms.cast.metadata.HEIGHT";
    public static final String KEY_LOCATION_LATITUDE = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
    public static final String KEY_LOCATION_LONGITUDE = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
    public static final String KEY_LOCATION_NAME = "com.google.android.gms.cast.metadata.LOCATION_NAME";
    public static final String KEY_RELEASE_DATE = "com.google.android.gms.cast.metadata.RELEASE_DATE";
    public static final String KEY_SEASON_NUMBER = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
    public static final String KEY_SERIES_TITLE = "com.google.android.gms.cast.metadata.SERIES_TITLE";
    public static final String KEY_STUDIO = "com.google.android.gms.cast.metadata.STUDIO";
    public static final String KEY_SUBTITLE = "com.google.android.gms.cast.metadata.SUBTITLE";
    public static final String KEY_TITLE = "com.google.android.gms.cast.metadata.TITLE";
    public static final String KEY_TRACK_NUMBER = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
    public static final String KEY_WIDTH = "com.google.android.gms.cast.metadata.WIDTH";
    public static final int MEDIA_TYPE_GENERIC = 0;
    public static final int MEDIA_TYPE_MOVIE = 1;
    public static final int MEDIA_TYPE_MUSIC_TRACK = 3;
    public static final int MEDIA_TYPE_PHOTO = 4;
    public static final int MEDIA_TYPE_TV_SHOW = 2;
    public static final int MEDIA_TYPE_USER = 100;
    private static final String[] zzRL;
    private static final zza zzRM;
    private final Bundle zzRN;
    private int zzRO;
    private final List zzvi;

    static {
        MediaMetadata.zzRL = new String[]{null, "String", "int", "double", "ISO-8601 date String"};
        MediaMetadata.zzRM = new zza().zzb("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).zzb("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).zzb("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).zzb("com.google.android.gms.cast.metadata.TITLE", "title", 1).zzb("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).zzb("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).zzb("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).zzb("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).zzb("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).zzb("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).zzb("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).zzb("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).zzb("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).zzb("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).zzb("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).zzb("com.google.android.gms.cast.metadata.WIDTH", "width", 2).zzb("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).zzb("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).zzb("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).zzb("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
    }

    public MediaMetadata() {
        this(0);
    }

    public MediaMetadata(int mediaType) {
        this.zzvi = new ArrayList();
        this.zzRN = new Bundle();
        this.zzRO = mediaType;
    }

    public void addImage(WebImage image) {
        this.zzvi.add(image);
    }

    public void clear() {
        this.zzRN.clear();
        this.zzvi.clear();
    }

    public void clearImages() {
        this.zzvi.clear();
    }

    public boolean containsKey(String key) {
        return this.zzRN.containsKey(key);
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }
        return other instanceof MediaMetadata ? this.zzb(this.zzRN, ((MediaMetadata)other).zzRN) && this.zzvi.equals(((MediaMetadata)other).zzvi) : false;
    }

    public Calendar getDate(String key) {
        this.zzf(key, 4);
        String s1 = this.zzRN.getString(key);
        return s1 == null ? null : zzjz.zzbK(s1);
    }

    public String getDateAsString(String key) {
        this.zzf(key, 4);
        return this.zzRN.getString(key);
    }

    public double getDouble(String key) {
        this.zzf(key, 3);
        return this.zzRN.getDouble(key);
    }

    public List getImages() {
        return this.zzvi;
    }

    public int getInt(String key) {
        this.zzf(key, 2);
        return this.zzRN.getInt(key);
    }

    public int getMediaType() {
        return this.zzRO;
    }

    public String getString(String key) {
        this.zzf(key, 1);
        return this.zzRN.getString(key);
    }

    public boolean hasImages() {
        return this.zzvi != null && !this.zzvi.isEmpty();
    }

    @Override
    public int hashCode() {
        int v = 17;
        for(Object object0: this.zzRN.keySet()) {
            v = this.zzRN.get(((String)object0)).hashCode() + v * 0x1F;
        }
        return v * 0x1F + this.zzvi.hashCode();
    }

    public Set keySet() {
        return this.zzRN.keySet();
    }

    public void putDate(String key, Calendar value) {
        this.zzf(key, 4);
        String s1 = zzjz.zza(value);
        this.zzRN.putString(key, s1);
    }

    public void putDouble(String key, double value) {
        this.zzf(key, 3);
        this.zzRN.putDouble(key, value);
    }

    public void putInt(String key, int value) {
        this.zzf(key, 2);
        this.zzRN.putInt(key, value);
    }

    public void putString(String key, String value) {
        this.zzf(key, 1);
        this.zzRN.putString(key, value);
    }

    public JSONObject toJson() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("metadataType", this.zzRO);
        }
        catch(JSONException unused_ex) {
        }
        zzjz.zza(jSONObject0, this.zzvi);
        switch(this.zzRO) {
            case 0: {
                this.zza(jSONObject0, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
                return jSONObject0;
            }
            case 1: {
                this.zza(jSONObject0, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
                return jSONObject0;
            }
            case 2: {
                this.zza(jSONObject0, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"});
                return jSONObject0;
            }
            case 3: {
                this.zza(jSONObject0, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
                return jSONObject0;
            }
            case 4: {
                this.zza(jSONObject0, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"});
                return jSONObject0;
            }
            default: {
                this.zza(jSONObject0, new String[0]);
                return jSONObject0;
            }
        }
    }

    private void zza(JSONObject jSONObject0, String[] arr_s) {
        try {
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                if(this.zzRN.containsKey(s)) {
                    switch(MediaMetadata.zzRM.zzby(s)) {
                        case 2: {
                            jSONObject0.put(MediaMetadata.zzRM.zzbw(s), this.zzRN.getInt(s));
                            break;
                        }
                        case 3: {
                            jSONObject0.put(MediaMetadata.zzRM.zzbw(s), this.zzRN.getDouble(s));
                            break;
                        }
                        case 1: 
                        case 4: {
                            jSONObject0.put(MediaMetadata.zzRM.zzbw(s), this.zzRN.getString(s));
                        }
                    }
                }
            }
            for(Object object0: this.zzRN.keySet()) {
                String s1 = (String)object0;
                if(!s1.startsWith("com.google.")) {
                    Object object1 = this.zzRN.get(s1);
                    if(object1 instanceof String) {
                        jSONObject0.put(s1, object1);
                    }
                    else if(object1 instanceof Integer) {
                        jSONObject0.put(s1, object1);
                    }
                    else if(object1 instanceof Double) {
                        jSONObject0.put(s1, object1);
                    }
                }
            }
        }
        catch(JSONException unused_ex) {
        }
    }

    private void zzb(JSONObject jSONObject0, String[] arr_s) {
        String s1;
        String s;
        HashSet hashSet0 = new HashSet(Arrays.asList(arr_s));
        try {
            Iterator iterator0 = jSONObject0.keys();
            while(true) {
            label_2:
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                s = (String)object0;
                if(!"metadataType".equals(s)) {
                    s1 = MediaMetadata.zzRM.zzbx(s);
                    if(s1 == null) {
                        Object object1 = jSONObject0.get(s);
                        if(object1 instanceof String) {
                            this.zzRN.putString(s, ((String)object1));
                        }
                        else if(object1 instanceof Integer) {
                            this.zzRN.putInt(s, ((int)(((Integer)object1))));
                        }
                        else {
                            if(!(object1 instanceof Double)) {
                                continue;
                            }
                            this.zzRN.putDouble(s, ((double)(((Double)object1))));
                        }
                    }
                    else if(hashSet0.contains(s1)) {
                        break;
                    }
                }
            }
        }
        catch(JSONException unused_ex) {
            return;
        }
        try {
            Object object2 = jSONObject0.get(s);
            if(object2 == null) {
                goto label_2;
            }
            switch(MediaMetadata.zzRM.zzby(s1)) {
                case 1: {
                    if(!(object2 instanceof String)) {
                        break;
                    }
                    this.zzRN.putString(s1, ((String)object2));
                    break;
                }
                case 2: {
                    if(!(object2 instanceof Integer)) {
                        break;
                    }
                    this.zzRN.putInt(s1, ((int)(((Integer)object2))));
                    break;
                }
                case 3: {
                    if(!(object2 instanceof Double)) {
                        break;
                    }
                    this.zzRN.putDouble(s1, ((double)(((Double)object2))));
                    break;
                }
                case 4: {
                    if(!(object2 instanceof String) || zzjz.zzbK(((String)object2)) == null) {
                        break;
                    }
                    this.zzRN.putString(s1, ((String)object2));
                }
            }
        }
        catch(JSONException unused_ex) {
        }
        goto label_2;
    }

    private boolean zzb(Bundle bundle0, Bundle bundle1) {
        if(bundle0.size() != bundle1.size()) {
            return false;
        }
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            Object object2 = bundle1.get(s);
            if(object1 instanceof Bundle && object2 instanceof Bundle && !this.zzb(((Bundle)object1), ((Bundle)object2))) {
                return false;
            }
            if(object1 == null) {
                if(object2 == null && bundle1.containsKey(s)) {
                    continue;
                }
                return false;
            }
            if(!object1.equals(object2)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private void zzf(String s, int v) throws IllegalArgumentException {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int v1 = MediaMetadata.zzRM.zzby(s);
        if(v1 != v && v1 != 0) {
            throw new IllegalArgumentException("Value for " + s + " must be a " + MediaMetadata.zzRL[v]);
        }
    }

    public void zzf(JSONObject jSONObject0) {
        this.clear();
        this.zzRO = 0;
        try {
            this.zzRO = jSONObject0.getInt("metadataType");
        }
        catch(JSONException unused_ex) {
        }
        zzjz.zza(this.zzvi, jSONObject0);
        switch(this.zzRO) {
            case 0: {
                this.zzb(jSONObject0, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
                return;
            }
            case 1: {
                this.zzb(jSONObject0, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
                return;
            }
            case 2: {
                this.zzb(jSONObject0, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"});
                return;
            }
            case 3: {
                this.zzb(jSONObject0, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
                return;
            }
            case 4: {
                this.zzb(jSONObject0, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"});
                return;
            }
            default: {
                this.zzb(jSONObject0, new String[0]);
            }
        }
    }
}

