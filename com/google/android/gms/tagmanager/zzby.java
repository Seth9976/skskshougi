package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import jeb.synthetic.TWR;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

class zzby implements zzau {
    class zza implements com.google.android.gms.tagmanager.zzcx.zza {
        final zzby zzaMy;

        @Override  // com.google.android.gms.tagmanager.zzcx$zza
        public void zza(zzaq zzaq0) {
            long v = zzaq0.zzyO();
            zzby.this.zzq(v);
        }

        @Override  // com.google.android.gms.tagmanager.zzcx$zza
        public void zzb(zzaq zzaq0) {
            zzby.this.zzq(zzaq0.zzyO());
            zzbg.zzaB(("Permanent failure dispatching hitId: " + zzaq0.zzyO()));
        }

        @Override  // com.google.android.gms.tagmanager.zzcx$zza
        public void zzc(zzaq zzaq0) {
            long v = zzaq0.zzyP();
            if(v == 0L) {
                long v1 = zzby.this.zzpw.currentTimeMillis();
                zzby.this.zzd(zzaq0.zzyO(), v1);
                return;
            }
            if(v + 14400000L < zzby.this.zzpw.currentTimeMillis()) {
                zzby.this.zzq(zzaq0.zzyO());
                zzbg.zzaB(("Giving up on failed hitId: " + zzaq0.zzyO()));
            }
        }
    }

    class zzb extends SQLiteOpenHelper {
        private long zzaMA;
        final zzby zzaMy;
        private boolean zzaMz;

        zzb(Context context0, String s) {
            super(context0, s, null, 1);
            this.zzaMA = 0L;
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            if(this.zzaMz && this.zzaMA + 3600000L > zzby.this.zzpw.currentTimeMillis()) {
                throw new SQLiteException("Database creation failed");
            }
            SQLiteDatabase sQLiteDatabase0 = null;
            this.zzaMz = true;
            this.zzaMA = zzby.this.zzpw.currentTimeMillis();
            try {
                sQLiteDatabase0 = super.getWritableDatabase();
            }
            catch(SQLiteException unused_ex) {
                zzby.this.mContext.getDatabasePath(zzby.this.zzaMv).delete();
            }
            if(sQLiteDatabase0 == null) {
                sQLiteDatabase0 = super.getWritableDatabase();
            }
            this.zzaMz = false;
            return sQLiteDatabase0;
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase db) {
            zzal.zzbe(db.getPath());
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db) {
            if(Build.VERSION.SDK_INT < 15) {
                try(Cursor cursor0 = db.rawQuery("PRAGMA journal_mode=memory", null)) {
                    cursor0.moveToFirst();
                }
            }
            if(!this.zza("gtm_hits", db)) {
                db.execSQL("CREATE TABLE IF NOT EXISTS gtm_hits ( \'hit_id\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \'hit_time\' INTEGER NOT NULL, \'hit_url\' TEXT NOT NULL,\'hit_first_send_time\' INTEGER NOT NULL);");
                return;
            }
            this.zzc(db);
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }

        private boolean zza(String s, SQLiteDatabase sQLiteDatabase0) {
            Cursor cursor2;
            boolean z;
            Cursor cursor1;
            Cursor cursor0;
            try {
                cursor0 = sQLiteDatabase0.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{s}, null, null, null);
            }
            catch(SQLiteException unused_ex) {
                cursor1 = null;
                goto label_10;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(null, throwable0);
                throw throwable0;
            }
            try {
                z = cursor0.moveToFirst();
                goto label_24;
            }
            catch(SQLiteException unused_ex) {
                cursor1 = cursor0;
                try {
                label_10:
                    zzbg.zzaC(("Error querying for table " + s));
                }
                catch(Throwable throwable1) {
                    cursor2 = cursor1;
                    throwable0 = throwable1;
                    goto label_21;
                }
                if(cursor1 != null) {
                    cursor1.close();
                }
                return false;
            }
            catch(Throwable throwable0) {
                cursor2 = cursor0;
            }
        label_21:
            if(cursor2 != null) {
                cursor2.close();
            }
            throw throwable0;
        label_24:
            cursor0.close();
            return z;
        }

        private void zzc(SQLiteDatabase sQLiteDatabase0) {
            Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT * FROM gtm_hits WHERE 0", null);
            HashSet hashSet0 = new HashSet();
            try {
                String[] arr_s = cursor0.getColumnNames();
                for(int v = 0; v < arr_s.length; ++v) {
                    hashSet0.add(arr_s[v]);
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
            cursor0.close();
            if(!hashSet0.remove("hit_id") || !hashSet0.remove("hit_url") || !hashSet0.remove("hit_time") || !hashSet0.remove("hit_first_send_time")) {
                throw new SQLiteException("Database column missing");
            }
            if(!hashSet0.isEmpty()) {
                throw new SQLiteException("Database has extra columns");
            }
        }
    }

    private final Context mContext;
    private static final String zzKg;
    private final zzb zzaMs;
    private volatile zzac zzaMt;
    private final zzav zzaMu;
    private final String zzaMv;
    private long zzaMw;
    private final int zzaMx;
    private zzlb zzpw;

    static {
        zzby.zzKg = "CREATE TABLE IF NOT EXISTS gtm_hits ( \'hit_id\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \'hit_time\' INTEGER NOT NULL, \'hit_url\' TEXT NOT NULL,\'hit_first_send_time\' INTEGER NOT NULL);";
    }

    zzby(zzav zzav0, Context context0) {
        this(zzav0, context0, "gtm_urls.db", 2000);
    }

    zzby(zzav zzav0, Context context0, String s, int v) {
        this.mContext = context0.getApplicationContext();
        this.zzaMv = s;
        this.zzaMu = zzav0;
        this.zzpw = zzld.zzoQ();
        this.zzaMs = new zzb(this, this.mContext, this.zzaMv);
        DefaultHttpClient defaultHttpClient0 = new DefaultHttpClient();
        zza zzby$zza0 = new zza(this);
        this.zzaMt = new zzcx(((HttpClient)defaultHttpClient0), this.mContext, zzby$zza0);
        this.zzaMw = 0L;
        this.zzaMx = v;
    }

    @Override  // com.google.android.gms.tagmanager.zzau
    public void dispatch() {
        zzbg.zzaB("GTM Dispatch running...");
        if(this.zzaMt.zzyH()) {
            List list0 = this.zziZ(40);
            if(list0.isEmpty()) {
                zzbg.zzaB("...nothing to dispatch");
                this.zzaMu.zzan(true);
                return;
            }
            this.zzaMt.zzr(list0);
            if(this.zzzd() > 0) {
                zzcu.zzzz().dispatch();
            }
        }
    }

    private void zzd(long v, long v1) {
        SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for getNumStoredHits.");
        if(sQLiteDatabase0 == null) {
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("hit_first_send_time", v1);
        try {
            sQLiteDatabase0.update("gtm_hits", contentValues0, "hit_id=?", new String[]{String.valueOf(v)});
        }
        catch(SQLiteException unused_ex) {
            zzbg.zzaC(("Error setting HIT_FIRST_DISPATCH_TIME for hitId: " + v));
            this.zzq(v);
        }
    }

    private SQLiteDatabase zzer(String s) {
        try {
            return this.zzaMs.getWritableDatabase();
        }
        catch(SQLiteException unused_ex) {
            zzbg.zzaC(s);
            return null;
        }
    }

    void zzf(String[] arr_s) {
        boolean z = true;
        if(arr_s != null && arr_s.length != 0) {
            SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for deleteHits.");
            if(sQLiteDatabase0 != null) {
                Object[] arr_object = {TextUtils.join(",", Collections.nCopies(arr_s.length, "?"))};
                try {
                    sQLiteDatabase0.delete("gtm_hits", String.format("HIT_ID in (%s)", arr_object), arr_s);
                    zzav zzav0 = this.zzaMu;
                    if(this.zzzc() != 0) {
                        z = false;
                    }
                    zzav0.zzan(z);
                }
                catch(SQLiteException unused_ex) {
                    zzbg.zzaC("Error deleting hits");
                }
            }
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzau
    public void zzg(long v, String s) {
        this.zzis();
        this.zzzb();
        this.zzh(v, s);
    }

    private void zzh(long v, String s) {
        SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for putHit");
        if(sQLiteDatabase0 == null) {
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("hit_time", v);
        contentValues0.put("hit_url", s);
        contentValues0.put("hit_first_send_time", 0);
        try {
            sQLiteDatabase0.insert("gtm_hits", null, contentValues0);
            this.zzaMu.zzan(false);
        }
        catch(SQLiteException unused_ex) {
            zzbg.zzaC("Error storing hit");
        }
    }

    List zziY(int v) {
        Cursor cursor0;
        ArrayList arrayList0 = new ArrayList();
        if(v <= 0) {
            zzbg.zzaC("Invalid maxHits specified. Skipping");
            return arrayList0;
        }
        SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for peekHitIds.");
        if(sQLiteDatabase0 == null) {
            return arrayList0;
        }
        try {
            cursor0 = null;
            cursor0 = sQLiteDatabase0.query("gtm_hits", new String[]{"hit_id"}, null, null, null, null, "hit_id ASC", Integer.toString(v));
            if(!cursor0.moveToFirst()) {
                goto label_23;
            }
            do {
                arrayList0.add(String.valueOf(cursor0.getLong(0)));
            }
            while(cursor0.moveToNext());
        }
        catch(SQLiteException sQLiteException0) {
            try {
                zzbg.zzaC(("Error in peekHits fetching hitIds: " + sQLiteException0.getMessage()));
                if(cursor0 != null) {
                    goto label_16;
                }
                return arrayList0;
            }
            catch(Throwable throwable0) {
                goto label_19;
            }
        label_16:
            cursor0.close();
            return arrayList0;
        }
        catch(Throwable throwable0) {
        label_19:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return arrayList0;
    label_23:
        cursor0.close();
        return arrayList0;
    }

    public List zziZ(int v) {
        ArrayList arrayList2;
        Cursor cursor3;
        Cursor cursor2;
        ArrayList arrayList1;
        List list0;
        Cursor cursor1;
        SQLiteException sQLiteException1;
        Cursor cursor0;
        ArrayList arrayList0 = new ArrayList();
        SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for peekHits");
        if(sQLiteDatabase0 == null) {
            return arrayList0;
        }
        try {
            cursor0 = sQLiteDatabase0.query("gtm_hits", new String[]{"hit_id", "hit_time", "hit_first_send_time"}, null, null, null, null, "hit_id ASC", Integer.toString(v));
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException1 = sQLiteException0;
            cursor1 = null;
            list0 = arrayList0;
            goto label_29;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        }
        try {
            arrayList1 = new ArrayList();
            goto label_21;
        }
        catch(SQLiteException sQLiteException2) {
            sQLiteException1 = sQLiteException2;
            cursor1 = cursor0;
            list0 = arrayList0;
            goto label_29;
            try {
            label_21:
                if(cursor0.moveToFirst()) {
                    do {
                        arrayList1.add(new zzaq(cursor0.getLong(0), cursor0.getLong(1), cursor0.getLong(2)));
                    }
                    while(cursor0.moveToNext());
                }
                goto label_43;
            }
            catch(SQLiteException sQLiteException3) {
            }
            catch(Throwable throwable0) {
                goto label_39;
            }
            sQLiteException1 = sQLiteException3;
            cursor1 = cursor0;
            list0 = arrayList1;
            try {
            label_29:
                zzbg.zzaC(("Error in peekHits fetching hitIds: " + sQLiteException1.getMessage()));
            }
            catch(Throwable throwable0) {
                cursor2 = cursor1;
                goto label_40;
            }
            if(cursor1 != null) {
                cursor1.close();
                return list0;
            }
            return list0;
        }
        catch(Throwable throwable0) {
        label_39:
            cursor2 = cursor0;
        }
    label_40:
        if(cursor2 != null) {
            cursor2.close();
        }
        throw throwable0;
    label_43:
        cursor0.close();
        try {
            cursor3 = sQLiteDatabase0.query("gtm_hits", new String[]{"hit_id", "hit_url"}, null, null, null, null, "hit_id ASC", Integer.toString(v));
            goto label_48;
        }
        catch(SQLiteException sQLiteException4) {
            goto label_59;
            try {
            label_48:
                if(cursor3.moveToFirst()) {
                    for(int v1 = 0; true; ++v1) {
                        if(((SQLiteCursor)cursor3).getWindow().getNumRows() > 0) {
                            ((zzaq)arrayList1.get(v1)).zzev(cursor3.getString(1));
                        }
                        else {
                            zzbg.zzaC(String.format("HitString for hitId %d too large.  Hit will be deleted.", ((zzaq)arrayList1.get(v1)).zzyO()));
                        }
                        if(!cursor3.moveToNext()) {
                            break;
                        }
                    }
                }
                goto label_79;
            }
            catch(SQLiteException sQLiteException4) {
            }
            catch(Throwable throwable1) {
                goto label_77;
            }
            cursor0 = cursor3;
            try {
            label_59:
                zzbg.zzaC(("Error in peekHits fetching hit url: " + sQLiteException4.getMessage()));
                arrayList2 = new ArrayList();
                boolean z = false;
                for(Object object0: arrayList1) {
                    if(TextUtils.isEmpty(((zzaq)object0).zzyQ())) {
                        if(z) {
                            break;
                        }
                        z = true;
                    }
                    arrayList2.add(((zzaq)object0));
                }
            }
            catch(Throwable throwable1) {
                goto label_71;
            }
        }
        catch(Throwable throwable1) {
        label_71:
            TWR.safeClose$NT(cursor0, throwable1);
            throw throwable1;
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        return arrayList2;
    label_77:
        TWR.safeClose$NT(cursor3, throwable1);
        throw throwable1;
    label_79:
        cursor3.close();
        return arrayList1;
    }

    int zzis() {
        boolean z = true;
        long v = this.zzpw.currentTimeMillis();
        if(v > this.zzaMw + 86400000L) {
            this.zzaMw = v;
            SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for deleteStaleHits.");
            if(sQLiteDatabase0 != null) {
                int v1 = sQLiteDatabase0.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.zzpw.currentTimeMillis() - 2592000000L)});
                zzav zzav0 = this.zzaMu;
                if(this.zzzc() != 0) {
                    z = false;
                }
                zzav0.zzan(z);
                return v1;
            }
        }
        return 0;
    }

    private void zzq(long v) {
        this.zzf(new String[]{String.valueOf(v)});
    }

    private void zzzb() {
        int v = this.zzzc() - this.zzaMx + 1;
        if(v > 0) {
            List list0 = this.zziY(v);
            zzbg.zzaB(("Store full, deleting " + list0.size() + " hits to make room."));
            this.zzf(((String[])list0.toArray(new String[0])));
        }
    }

    int zzzc() {
        Cursor cursor0 = null;
        int v = 0;
        SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for getNumStoredHits.");
        if(sQLiteDatabase0 != null) {
            try {
                try {
                    cursor0 = sQLiteDatabase0.rawQuery("SELECT COUNT(*) from gtm_hits", null);
                    if(!cursor0.moveToFirst()) {
                        goto label_15;
                    }
                    v = (int)cursor0.getLong(0);
                    goto label_15;
                }
                catch(SQLiteException unused_ex) {
                }
                zzbg.zzaC("Error getting numStoredHits");
                if(cursor0 != null) {
                    goto label_10;
                }
                return 0;
            }
            catch(Throwable throwable0) {
                goto label_13;
            }
        label_10:
            cursor0.close();
            return 0;
        label_13:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        label_15:
            cursor0.close();
            return v;
        }
        return 0;
    }

    int zzzd() {
        Cursor cursor2;
        int v;
        Cursor cursor1;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for getNumStoredHits.");
        if(sQLiteDatabase0 == null) {
            return 0;
        }
        try {
            cursor0 = sQLiteDatabase0.query("gtm_hits", new String[]{"hit_id", "hit_first_send_time"}, "hit_first_send_time=0", null, null, null, null);
        }
        catch(SQLiteException unused_ex) {
            cursor1 = null;
            goto label_13;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        }
        try {
            v = cursor0.getCount();
            goto label_28;
        }
        catch(SQLiteException unused_ex) {
            cursor1 = cursor0;
            try {
            label_13:
                zzbg.zzaC("Error getting num untried hits");
            }
            catch(Throwable throwable1) {
                cursor2 = cursor1;
                throwable0 = throwable1;
                goto label_25;
            }
            if(cursor1 != null) {
                cursor1.close();
                return 0;
            }
            return 0;
        }
        catch(Throwable throwable0) {
            cursor2 = cursor0;
        }
    label_25:
        if(cursor2 != null) {
            cursor2.close();
        }
        throw throwable0;
    label_28:
        cursor0.close();
        return v;
    }

    // 去混淆评级： 低(20)
    static String zzze() [...] // Potential decryptor
}

