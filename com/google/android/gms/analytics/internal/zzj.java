package com.google.android.gms.analytics.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzu;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

class zzj extends zzd implements Closeable {
    class zza extends SQLiteOpenHelper {
        final zzj zzKl;

        zza(Context context0, String s) {
            super(context0, s, null, 1);
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            if(!zzj.this.zzKk.zzv(3600000L)) {
                throw new SQLiteException("Database open failed");
            }
            try {
                return super.getWritableDatabase();
            }
            catch(SQLiteException unused_ex) {
                zzj.this.zzKk.start();
                zzj.this.zzaX("Opening the database failed, dropping the table and recreating it");
                String s = zzj.this.zziv();
                zzj.this.getContext().getDatabasePath(s).delete();
                try {
                    SQLiteDatabase sQLiteDatabase0 = super.getWritableDatabase();
                    zzj.this.zzKk.clear();
                    return sQLiteDatabase0;
                }
                catch(SQLiteException sQLiteException0) {
                    zzj.this.zze("Failed to open freshly created database", sQLiteException0);
                    throw sQLiteException0;
                }
            }
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase database) {
            zzx.zzbe(database.getPath());
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase database) {
            if(Build.VERSION.SDK_INT < 15) {
                try(Cursor cursor0 = database.rawQuery("PRAGMA journal_mode=memory", null)) {
                    cursor0.moveToFirst();
                }
            }
            if(this.zza(database, "hits2")) {
                this.zza(database);
            }
            else {
                database.execSQL("CREATE TABLE IF NOT EXISTS hits2 ( \'hit_id\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \'hit_time\' INTEGER NOT NULL, \'hit_url\' TEXT NOT NULL, \'hit_string\' TEXT NOT NULL, \'hit_app_id\' INTEGER);");
            }
            if(!this.zza(database, "properties")) {
                database.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
                return;
            }
            this.zzb(database);
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        }

        private void zza(SQLiteDatabase sQLiteDatabase0) {
            boolean z = true;
            Set set0 = this.zzb(sQLiteDatabase0, "hits2");
            for(int v = 0; v < 4; ++v) {
                String s = new String[]{"hit_id", "hit_string", "hit_time", "hit_url"}[v];
                if(!set0.remove(s)) {
                    throw new SQLiteException("Database hits2 is missing required column: " + s);
                }
            }
            if(set0.remove("hit_app_id")) {
                z = false;
            }
            if(!set0.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            }
            if(z) {
                sQLiteDatabase0.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }

        private boolean zza(SQLiteDatabase sQLiteDatabase0, String s) {
            boolean z;
            Cursor cursor0 = null;
            try {
                cursor0 = sQLiteDatabase0.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{s}, null, null, null);
                goto label_6;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_9;
            }
            catch(Throwable throwable0) {
            }
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
            try {
                try {
                label_6:
                    z = cursor0.moveToFirst();
                    goto label_16;
                }
                catch(SQLiteException sQLiteException0) {
                }
            label_9:
                zzj.this.zzc("Error querying for table", s, sQLiteException0);
                if(cursor0 != null) {
                    goto label_11;
                }
                return false;
            }
            catch(Throwable throwable0) {
                goto label_14;
            }
        label_11:
            cursor0.close();
            return false;
        label_14:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        label_16:
            cursor0.close();
            return z;
        }

        private Set zzb(SQLiteDatabase sQLiteDatabase0, String s) {
            try {
                Set set0 = new HashSet();
                try(Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT * FROM " + s + " LIMIT 0", null)) {
                    String[] arr_s = cursor0.getColumnNames();
                    for(int v = 0; true; ++v) {
                        if(v >= arr_s.length) {
                            break;
                        }
                        set0.add(arr_s[v]);
                    }
                    return set0;
                }
            }
            catch(Throwable throwable0) {
                throw throwable0;
            }
        }

        private void zzb(SQLiteDatabase sQLiteDatabase0) {
            Set set0 = this.zzb(sQLiteDatabase0, "properties");
            for(int v = 0; v < 6; ++v) {
                String s = new String[]{"app_uid", "cid", "tid", "params", "adid", "hits_count"}[v];
                if(!set0.remove(s)) {
                    throw new SQLiteException("Database properties is missing required column: " + s);
                }
            }
            if(!set0.isEmpty()) {
                throw new SQLiteException("Database properties table has extra columns");
            }
        }
    }

    private static final String zzKg;
    private static final String zzKh;
    private final zza zzKi;
    private final zzaj zzKj;
    private final zzaj zzKk;

    static {
        zzj.zzKg = "CREATE TABLE IF NOT EXISTS hits2 ( \'hit_id\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \'hit_time\' INTEGER NOT NULL, \'hit_url\' TEXT NOT NULL, \'hit_string\' TEXT NOT NULL, \'hit_app_id\' INTEGER);";
        zzj.zzKh = "SELECT MAX(hit_time) FROM hits2 WHERE 1;";
    }

    zzj(zzf zzf0) {
        super(zzf0);
        this.zzKj = new zzaj(this.zzhP());
        this.zzKk = new zzaj(this.zzhP());
        this.zzKi = new zza(this, zzf0.getContext(), this.zziv());
    }

    public void beginTransaction() {
        this.zzia();
        this.getWritableDatabase().beginTransaction();
    }

    @Override
    public void close() {
        try {
            this.zzKi.close();
        }
        catch(SQLiteException sQLiteException0) {
            this.zze("Sql error closing database", sQLiteException0);
        }
        catch(IllegalStateException illegalStateException0) {
            this.zze("Error closing database", illegalStateException0);
        }
    }

    public void endTransaction() {
        this.zzia();
        this.getWritableDatabase().endTransaction();
    }

    SQLiteDatabase getWritableDatabase() {
        try {
            return this.zzKi.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            this.zzd("Error opening database", sQLiteException0);
            throw sQLiteException0;
        }
    }

    boolean isEmpty() {
        return this.zzil() == 0L;
    }

    public void setTransactionSuccessful() {
        this.zzia();
        this.getWritableDatabase().setTransactionSuccessful();
    }

    private static String zzA(Map map0) {
        zzu.zzu(map0);
        Uri.Builder uri$Builder0 = new Uri.Builder();
        for(Object object0: map0.entrySet()) {
            uri$Builder0.appendQueryParameter(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        String s = uri$Builder0.build().getEncodedQuery();
        return s == null ? "" : s;
    }

    private long zza(String s, String[] arr_s, long v) {
        SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(cursor0.moveToFirst()) {
                    v = cursor0.getLong(0);
                    goto label_12;
                }
                goto label_14;
            }
            catch(SQLiteException sQLiteException0) {
                this.zzd("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_12:
        cursor0.close();
        return v;
    label_14:
        cursor0.close();
        return v;
    }

    public long zza(long v, String s, String s1) {
        zzu.zzcj(s);
        zzu.zzcj(s1);
        this.zzia();
        this.zzhO();
        return this.zza("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{String.valueOf(v), s, s1}, 0L);
    }

    public void zza(long v, String s) {
        zzu.zzcj(s);
        this.zzia();
        this.zzhO();
        int v1 = this.getWritableDatabase().delete("properties", "app_uid=? AND cid<>?", new String[]{String.valueOf(v), s});
        if(v1 > 0) {
            this.zza("Deleted property records", v1);
        }
    }

    Map zzaY(String s) {
        if(TextUtils.isEmpty(s)) {
            return new HashMap(0);
        }
        try {
            if(!s.startsWith("?")) {
                s = "?" + s;
            }
            List list0 = URLEncodedUtils.parse(new URI(s), "UTF-8");
            HashMap hashMap0 = new HashMap(list0.size());
            for(Object object0: list0) {
                hashMap0.put(((NameValuePair)object0).getName(), ((NameValuePair)object0).getValue());
            }
            return hashMap0;
        }
        catch(URISyntaxException uRISyntaxException0) {
            this.zze("Error parsing hit parameters", uRISyntaxException0);
            return new HashMap(0);
        }
    }

    Map zzaZ(String s) {
        if(TextUtils.isEmpty(s)) {
            return new HashMap(0);
        }
        try {
            List list0 = URLEncodedUtils.parse(new URI("?" + s), "UTF-8");
            HashMap hashMap0 = new HashMap(list0.size());
            for(Object object0: list0) {
                hashMap0.put(((NameValuePair)object0).getName(), ((NameValuePair)object0).getValue());
            }
            return hashMap0;
        }
        catch(URISyntaxException uRISyntaxException0) {
            this.zze("Error parsing property parameters", uRISyntaxException0);
            return new HashMap(0);
        }
    }

    private long zzb(String s, String[] arr_s) {
        long v;
        SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(!cursor0.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                v = cursor0.getLong(0);
            }
            catch(SQLiteException sQLiteException0) {
                this.zzd("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return v;
    }

    public void zzb(zzh zzh0) {
        zzu.zzu(zzh0);
        this.zzia();
        this.zzhO();
        SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        String s = zzj.zzA(zzh0.zzn());
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_uid", zzh0.zzii());
        contentValues0.put("cid", zzh0.getClientId());
        contentValues0.put("tid", zzh0.zzij());
        contentValues0.put("adid", ((int)(zzh0.zzik() ? 1 : 0)));
        contentValues0.put("hits_count", zzh0.zzil());
        contentValues0.put("params", s);
        try {
            if(sQLiteDatabase0.insertWithOnConflict("properties", null, contentValues0, 5) == -1L) {
                this.zzaX("Failed to insert/update a property (got -1)");
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zze("Error storing a property", sQLiteException0);
        }
    }

    public void zzc(zzab zzab0) {
        zzu.zzu(zzab0);
        this.zzhO();
        this.zzia();
        String s = zzj.zze(zzab0);
        if(s.length() > 0x2000) {
            this.zzhQ().zza(zzab0, "Hit length exceeds the maximum allowed size");
            return;
        }
        this.zziu();
        SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("hit_string", s);
        contentValues0.put("hit_time", zzab0.zzjW());
        contentValues0.put("hit_app_id", zzab0.zzjU());
        contentValues0.put("hit_url", this.zzd(zzab0));
        try {
            long v = sQLiteDatabase0.insert("hits2", null, contentValues0);
            if(v == -1L) {
                this.zzaX("Failed to insert a hit (got -1)");
                return;
            }
            this.zzb("Hit saved to database. db-id, hit", v, zzab0);
        }
        catch(SQLiteException sQLiteException0) {
            this.zze("Error storing a hit", sQLiteException0);
        }
    }

    // 去混淆评级： 中等(60)
    private String zzd(zzab zzab0) {
        return zzab0.zzjY() ? "https://ssl.google-analytics.com" : "http://www.google-analytics.com";
    }

    public void zzd(List list0) {
        zzu.zzu(list0);
        this.zzhO();
        this.zzia();
        if(list0.isEmpty()) {
            return;
        }
        else {
            StringBuilder stringBuilder0 = new StringBuilder("hit_id");
            stringBuilder0.append(" in (");
            for(int v = 0; v < list0.size(); ++v) {
                Long long0 = (Long)list0.get(v);
                if(long0 == null || ((long)long0) == 0L) {
                    throw new SQLiteException("Invalid hit id");
                }
                if(v > 0) {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append(long0);
            }
            stringBuilder0.append(")");
            String s = stringBuilder0.toString();
            try {
                SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
                this.zza("Deleting dispatched hits. count", list0.size());
                int v1 = sQLiteDatabase0.delete("hits2", s, null);
                if(v1 != list0.size()) {
                    this.zzb("Deleted fewer hits then expected", list0.size(), v1, s);
                    return;
                }
                return;
            }
            catch(SQLiteException sQLiteException0) {
            }
        }
        this.zze("Error deleting hits", sQLiteException0);
        throw sQLiteException0;
    }

    private static String zze(zzab zzab0) {
        zzu.zzu(zzab0);
        Uri.Builder uri$Builder0 = new Uri.Builder();
        for(Object object0: zzab0.zzn().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = (String)map$Entry0.getKey();
            if(!"ht".equals(s) && !"qt".equals(s) && !"AppUID".equals(s)) {
                uri$Builder0.appendQueryParameter(s, ((String)map$Entry0.getValue()));
            }
        }
        String s1 = uri$Builder0.build().getEncodedQuery();
        return s1 == null ? "" : s1;
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
    }

    public long zzil() {
        this.zzhO();
        this.zzia();
        return this.zzb("SELECT COUNT(*) FROM hits2", null);
    }

    public void zziq() {
        this.zzhO();
        this.zzia();
        this.getWritableDatabase().delete("hits2", null, null);
    }

    public void zzir() {
        this.zzhO();
        this.zzia();
        this.getWritableDatabase().delete("properties", null, null);
    }

    public int zzis() {
        this.zzhO();
        this.zzia();
        if(!this.zzKj.zzv(86400000L)) {
            return 0;
        }
        this.zzKj.start();
        this.zzaT("Deleting stale hits (if any)");
        int v = this.getWritableDatabase().delete("hits2", "hit_time < ?", new String[]{Long.toString(this.zzhP().currentTimeMillis() - 2592000000L)});
        this.zza("Deleted stale hits, count", v);
        return v;
    }

    public long zzit() {
        this.zzhO();
        this.zzia();
        return this.zza(zzj.zzKh, null, 0L);
    }

    private void zziu() {
        int v = this.zzhR().zzju();
        long v1 = this.zzil();
        if(v1 > ((long)(v - 1))) {
            List list0 = this.zzo(v1 - ((long)v) + 1L);
            this.zzd("Store full, deleting hits to make room, count", list0.size());
            this.zzd(list0);
        }
    }

    // 去混淆评级： 低(30)
    private String zziv() {
        if(!this.zzhR().zziW()) {
            return "google_analytics_v4.db";
        }
        return this.zzhR().zziX() ? "google_analytics_v4.db" : "google_analytics2_v4.db";
    }

    // 去混淆评级： 低(20)
    static String zziw() [...] // Potential decryptor

    public List zzo(long v) {
        Cursor cursor0;
        this.zzhO();
        this.zzia();
        if(v <= 0L) {
            return Collections.emptyList();
        }
        SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        ArrayList arrayList0 = new ArrayList();
        try {
            cursor0 = null;
            cursor0 = sQLiteDatabase0.query("hits2", new String[]{"hit_id"}, null, null, null, null, "hit_id ASC", Long.toString(v));
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_17;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
        label_12:
            if(!cursor0.moveToFirst()) {
                goto label_26;
            }
            do {
                arrayList0.add(cursor0.getLong(0));
            }
            while(cursor0.moveToNext());
        }
        catch(SQLiteException sQLiteException0) {
            try {
            label_17:
                this.zzd("Error selecting hit ids", sQLiteException0);
                if(cursor0 != null) {
                    goto label_19;
                }
                return arrayList0;
            }
            catch(Throwable throwable0) {
                goto label_22;
            }
        label_19:
            cursor0.close();
            return arrayList0;
        }
        catch(Throwable throwable0) {
        label_22:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return arrayList0;
    label_26:
        cursor0.close();
        return arrayList0;
    }

    public List zzp(long v) {
        List list0;
        boolean z = true;
        Cursor cursor0 = null;
        if(v < 0L) {
            z = false;
        }
        zzu.zzV(z);
        this.zzhO();
        this.zzia();
        SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        try {
            cursor0 = sQLiteDatabase0.query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, "hit_id ASC", Long.toString(v));
            goto label_13;
        }
        catch(SQLiteException sQLiteException0) {
            Cursor cursor1 = null;
            goto label_25;
            try {
            label_13:
                list0 = new ArrayList();
                if(cursor0.moveToFirst()) {
                    do {
                        long v1 = cursor0.getLong(0);
                        long v2 = cursor0.getLong(1);
                        String s = cursor0.getString(2);
                        String s1 = cursor0.getString(3);
                        int v3 = cursor0.getInt(4);
                        list0.add(new zzab(this, this.zzaY(s), v2, zzam.zzbn(s1), v1, v3));
                    }
                    while(cursor0.moveToNext());
                }
                goto label_33;
            }
            catch(SQLiteException sQLiteException0) {
            }
            catch(Throwable throwable0) {
                goto label_31;
            }
            cursor1 = cursor0;
            try {
            label_25:
                this.zze("Error loading hits from the database", sQLiteException0);
                throw sQLiteException0;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor1, throwable0);
                throw throwable0;
            }
        }
        catch(Throwable throwable0) {
        label_31:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_33:
        cursor0.close();
        return list0;
    }

    public void zzq(long v) {
        this.zzhO();
        this.zzia();
        ArrayList arrayList0 = new ArrayList(1);
        arrayList0.add(v);
        this.zza("Deleting hit, id", v);
        this.zzd(arrayList0);
    }

    public List zzr(long v) {
        List list0;
        this.zzia();
        this.zzhO();
        SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        Cursor cursor0 = null;
        try {
            int v1 = this.zzhR().zzjv();
            cursor0 = sQLiteDatabase0.query("properties", new String[]{"cid", "tid", "adid", "hits_count", "params"}, "app_uid=?", new String[]{String.valueOf(v)}, null, null, null, String.valueOf(v1));
            goto label_10;
        }
        catch(SQLiteException sQLiteException0) {
            Cursor cursor1 = null;
            goto label_27;
            try {
            label_10:
                list0 = new ArrayList();
                if(cursor0.moveToFirst()) {
                    while(true) {
                        String s = cursor0.getString(0);
                        String s1 = cursor0.getString(1);
                        boolean z = cursor0.getInt(2) != 0;
                        long v2 = (long)cursor0.getInt(3);
                        Map map0 = this.zzaZ(cursor0.getString(4));
                        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                            list0.add(new zzh(v, s, s1, z, v2, map0));
                        }
                        else {
                            this.zzc("Read property with empty client id or tracker id", s, s1);
                        }
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                    }
                }
                if(list0.size() >= v1) {
                    this.zzaW("Sending hits to too many properties. Campaign report might be incorrect");
                }
                goto label_35;
            }
            catch(SQLiteException sQLiteException0) {
            }
            catch(Throwable throwable0) {
                goto label_33;
            }
            cursor1 = cursor0;
            try {
            label_27:
                this.zze("Error loading hits from the database", sQLiteException0);
                throw sQLiteException0;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor1, throwable0);
                throw throwable0;
            }
        }
        catch(Throwable throwable0) {
        label_33:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_35:
        cursor0.close();
        return list0;
    }
}

