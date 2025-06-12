package com.google.android.gms.ads.internal.purchase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzgd;
import java.util.LinkedList;
import java.util.List;

@zzgd
public class zzh {
    public class zza extends SQLiteOpenHelper {
        final zzh zzBa;

        public zza(Context context0, String s) {
            super(context0, s, null, 4);
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE IF NOT EXISTS InAppPurchase ( purchase_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, product_id TEXT NOT NULL, developer_payload TEXT NOT NULL, record_time INTEGER)");
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            zzb.zzaA(("Database updated from version " + oldVersion + " to version " + newVersion));
            db.execSQL("DROP TABLE IF EXISTS InAppPurchase");
            this.onCreate(db);
        }
    }

    private static final String zzAX;
    private final zza zzAY;
    private static zzh zzAZ;
    private static final Object zzqt;

    static {
        zzh.zzAX = "CREATE TABLE IF NOT EXISTS InAppPurchase ( purchase_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, product_id TEXT NOT NULL, developer_payload TEXT NOT NULL, record_time INTEGER)";
        zzh.zzqt = new Object();
    }

    zzh(Context context0) {
        this.zzAY = new zza(this, context0, "google_inapp_purchase.db");
    }

    public int getRecordCount() {
        int v1;
        Cursor cursor0 = null;
        synchronized(zzh.zzqt) {
            SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
            if(sQLiteDatabase0 == null) {
                return 0;
            }
            try {
                try {
                    cursor0 = sQLiteDatabase0.rawQuery("select count(*) from InAppPurchase", null);
                    if(!cursor0.moveToFirst()) {
                        goto label_27;
                    }
                    v1 = cursor0.getInt(0);
                    goto label_24;
                }
                catch(SQLiteException sQLiteException0) {
                }
                zzb.zzaC(("Error getting record count" + sQLiteException0.getMessage()));
                if(cursor0 != null) {
                    goto label_17;
                }
                return 0;
            }
            catch(Throwable throwable0) {
                goto label_20;
            }
        label_17:
            cursor0.close();
            return 0;
        label_20:
            if(cursor0 != null) {
                cursor0.close();
            }
            throw throwable0;
        label_24:
            cursor0.close();
            return v1;
        label_27:
            cursor0.close();
            return 0;
        }
    }

    public SQLiteDatabase getWritableDatabase() {
        try {
            return this.zzAY.getWritableDatabase();
        }
        catch(SQLiteException unused_ex) {
            zzb.zzaC("Error opening writable conversion tracking database");
            return null;
        }
    }

    public zzf zza(Cursor cursor0) {
        return cursor0 == null ? null : new zzf(cursor0.getLong(0), cursor0.getString(1), cursor0.getString(2));
    }

    public void zza(zzf zzf0) {
        if(zzf0 == null) {
            return;
        }
        synchronized(zzh.zzqt) {
            SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
            if(sQLiteDatabase0 == null) {
                return;
            }
            sQLiteDatabase0.delete("InAppPurchase", String.format("%s = %d", "purchase_id", zzf0.zzAR), null);
        }
    }

    public void zzb(zzf zzf0) {
        if(zzf0 == null) {
            return;
        }
        synchronized(zzh.zzqt) {
            SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
            if(sQLiteDatabase0 == null) {
                return;
            }
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("product_id", zzf0.zzAT);
            contentValues0.put("developer_payload", zzf0.zzAS);
            contentValues0.put("record_time", SystemClock.elapsedRealtime());
            zzf0.zzAR = sQLiteDatabase0.insert("InAppPurchase", null, contentValues0);
            if(((long)this.getRecordCount()) > 20000L) {
                this.zzfg();
            }
        }
    }

    public List zzf(long v) {
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0;
        LinkedList linkedList0;
        synchronized(zzh.zzqt) {
            linkedList0 = new LinkedList();
            if(v > 0L) {
                sQLiteDatabase0 = this.getWritableDatabase();
                if(sQLiteDatabase0 == null) {
                    return linkedList0;
                }
                goto label_8;
            }
            return linkedList0;
        }
        return linkedList0;
        try {
        label_8:
            cursor0 = null;
            cursor0 = sQLiteDatabase0.query("InAppPurchase", null, null, null, null, null, "record_time ASC", String.valueOf(v));
            if(cursor0.moveToFirst()) {
                do {
                    linkedList0.add(this.zza(cursor0));
                }
                while(cursor0.moveToNext());
                goto label_22;
            }
            else {
                goto label_24;
            }
            return linkedList0;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                zzb.zzaC(("Error extracing purchase info: " + sQLiteException0.getMessage()));
                if(cursor0 != null) {
                    goto label_22;
                }
                return linkedList0;
            }
            catch(Throwable throwable1) {
                goto label_19;
            }
        }
        catch(Throwable throwable1) {
            try {
            label_19:
                if(cursor0 != null) {
                    cursor0.close();
                }
                throw throwable1;
            label_22:
                cursor0.close();
                return linkedList0;
            label_24:
                cursor0.close();
                return linkedList0;
            }
            catch(Throwable throwable0) {
            }
        }
        throw throwable0;
    }

    public void zzfg() {
        Cursor cursor0;
        synchronized(zzh.zzqt) {
            SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
            if(sQLiteDatabase0 == null) {
                return;
            }
            try {
                try {
                    cursor0 = null;
                    cursor0 = sQLiteDatabase0.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
                    if(cursor0 != null && cursor0.moveToFirst()) {
                        this.zza(this.zza(cursor0));
                    }
                    goto label_24;
                }
                catch(SQLiteException sQLiteException0) {
                }
                zzb.zzaC(("Error remove oldest record" + sQLiteException0.getMessage()));
                if(cursor0 != null) {
                    goto label_17;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_20;
            }
        label_17:
            cursor0.close();
            return;
        label_20:
            if(cursor0 != null) {
                cursor0.close();
            }
            throw throwable0;
        label_24:
            if(cursor0 != null) {
                cursor0.close();
            }
        }
    }

    // 去混淆评级： 低(20)
    static String zzfh() [...] // Potential decryptor

    public static zzh zzy(Context context0) {
        synchronized(zzh.zzqt) {
            if(zzh.zzAZ == null) {
                zzh.zzAZ = new zzh(context0);
            }
            return zzh.zzAZ;
        }
    }
}

