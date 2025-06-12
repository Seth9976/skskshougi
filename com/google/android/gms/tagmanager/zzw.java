package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import jeb.synthetic.TWR;

class zzw implements zzc {
    class zza extends SQLiteOpenHelper {
        final zzw zzaLv;

        zza(Context context0, String s) {
            super(context0, s, null, 1);
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            try {
                SQLiteDatabase sQLiteDatabase0 = super.getWritableDatabase();
                return sQLiteDatabase0 == null ? super.getWritableDatabase() : sQLiteDatabase0;
            }
            catch(SQLiteException unused_ex) {
                zzw.this.mContext.getDatabasePath("google_tagmanager.db").delete();
                return super.getWritableDatabase();
            }
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
            if(!this.zza("datalayer", db)) {
                db.execSQL("CREATE TABLE IF NOT EXISTS datalayer ( \'ID\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \'key\' STRING NOT NULL, \'value\' BLOB NOT NULL, \'expires\' INTEGER NOT NULL);");
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
            Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT * FROM datalayer WHERE 0", null);
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
            if(!hashSet0.remove("key") || !hashSet0.remove("value") || !hashSet0.remove("ID") || !hashSet0.remove("expires")) {
                throw new SQLiteException("Database column missing");
            }
            if(!hashSet0.isEmpty()) {
                throw new SQLiteException("Database has extra columns");
            }
        }
    }

    static class zzb {
        final byte[] zzaLy;
        final String zztw;

        zzb(String s, byte[] arr_b) {
            this.zztw = s;
            this.zzaLy = arr_b;
        }

        @Override
        public String toString() {
            return "KeyAndSerialized: key = " + this.zztw + " serialized hash = " + Arrays.hashCode(this.zzaLy);
        }
    }

    private final Context mContext;
    private static final String zzaLp;
    private final Executor zzaLq;
    private zza zzaLr;
    private int zzaLs;
    private zzlb zzpw;

    static {
        zzw.zzaLp = "CREATE TABLE IF NOT EXISTS datalayer ( \'ID\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \'key\' STRING NOT NULL, \'value\' BLOB NOT NULL, \'expires\' INTEGER NOT NULL);";
    }

    public zzw(Context context0) {
        this(context0, zzld.zzoQ(), "google_tagmanager.db", 2000, Executors.newSingleThreadExecutor());
    }

    zzw(Context context0, zzlb zzlb0, String s, int v, Executor executor0) {
        this.mContext = context0;
        this.zzpw = zzlb0;
        this.zzaLs = v;
        this.zzaLq = executor0;
        this.zzaLr = new zza(this, this.mContext, s);
    }

    private byte[] zzA(Object object0) {
        byte[] arr_b;
        ObjectOutputStream objectOutputStream0;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            objectOutputStream0 = null;
            objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
            goto label_7;
        }
        catch(IOException unused_ex) {
            goto label_10;
        }
        catch(Throwable throwable0) {
        }
        Throwable throwable1 = throwable0;
        goto label_16;
        try {
        label_7:
            objectOutputStream0.writeObject(object0);
            arr_b = byteArrayOutputStream0.toByteArray();
            goto label_20;
        }
        catch(IOException unused_ex) {
            try {
            label_10:
                if(objectOutputStream0 != null) {
                    objectOutputStream0.close();
                }
                byteArrayOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
            return null;
        }
        catch(Throwable throwable1) {
        }
        try {
        label_16:
            if(objectOutputStream0 != null) {
                objectOutputStream0.close();
            }
            byteArrayOutputStream0.close();
        }
        catch(IOException unused_ex) {
        }
        throw throwable1;
        try {
        label_20:
            objectOutputStream0.close();
            byteArrayOutputStream0.close();
        }
        catch(IOException unused_ex) {
        }
        return arr_b;
    }

    private void zzS(long v) {
        SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for deleteOlderThan.");
        if(sQLiteDatabase0 == null) {
            return;
        }
        try {
            zzbg.zzaB(("Deleted " + sQLiteDatabase0.delete("datalayer", "expires <= ?", new String[]{Long.toString(v)}) + " expired items"));
        }
        catch(SQLiteException unused_ex) {
            zzbg.zzaC("Error deleting old entries.");
        }
    }

    @Override  // com.google.android.gms.tagmanager.DataLayer$zzc
    public void zza(com.google.android.gms.tagmanager.DataLayer.zzc.zza dataLayer$zzc$zza0) {
        com.google.android.gms.tagmanager.zzw.2 zzw$20 = new Runnable() {
            @Override
            public void run() {
                List list0 = zzw.this.zzyC();
                dataLayer$zzc$zza0.zzo(list0);
            }
        };
        this.zzaLq.execute(zzw$20);
    }

    @Override  // com.google.android.gms.tagmanager.DataLayer$zzc
    public void zza(List list0, long v) {
        com.google.android.gms.tagmanager.zzw.1 zzw$10 = () -> synchronized(zzw.this) {
            try {
                long v3 = zzw.this.zzpw.currentTimeMillis();
                zzw.this.zzS(v3);
                zzw.this.zziS(this.zzaLt.size());
                zzw.this.zzc(this.zzaLt, v3 + this.zzaLu);
            }
            finally {
                zzw.this.zzyF();
            }
        };
        this.zzaLq.execute(zzw$10);

        class com.google.android.gms.tagmanager.zzw.1 implements Runnable {
            com.google.android.gms.tagmanager.zzw.1(List list0, long v) {
            }

            @Override
            public void run() {
                zzw.this.zzb(this.zzaLt, this.zzaLu);
            }
        }

    }

    // 检测为 lambda 实现。
    private void zzb(List list0, long v) {
        synchronized(this) {
            try {
                long v3 = this.zzpw.currentTimeMillis();
                this.zzS(v3);
                this.zziS(list0.size());
                this.zzc(list0, v3 + v);
            }
            finally {
                this.zzyF();
            }
        }
    }

    private void zzc(List list0, long v) {
        SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for writeEntryToDatabase.");
        if(sQLiteDatabase0 != null) {
            for(Object object0: list0) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("expires", v);
                contentValues0.put("key", ((zzb)object0).zztw);
                contentValues0.put("value", ((zzb)object0).zzaLy);
                sQLiteDatabase0.insert("datalayer", null, contentValues0);
            }
        }
    }

    private void zze(String[] arr_s) {
        if(arr_s != null && arr_s.length != 0) {
            SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for deleteEntries.");
            if(sQLiteDatabase0 != null) {
                Object[] arr_object = {"ID", TextUtils.join(",", Collections.nCopies(arr_s.length, "?"))};
                try {
                    sQLiteDatabase0.delete("datalayer", String.format("%s in (%s)", arr_object), arr_s);
                }
                catch(SQLiteException unused_ex) {
                    zzbg.zzaC(("Error deleting entries " + Arrays.toString(arr_s)));
                }
            }
        }
    }

    @Override  // com.google.android.gms.tagmanager.DataLayer$zzc
    public void zzep(String s) {
        com.google.android.gms.tagmanager.zzw.3 zzw$30 = () -> {
            SQLiteDatabase sQLiteDatabase0 = zzw.this.zzer("Error opening database for clearKeysWithPrefix.");
            if(sQLiteDatabase0 == null) {
                return;
            }
            try {
                zzbg.zzaB(("Cleared " + sQLiteDatabase0.delete("datalayer", "key = ? OR key LIKE ?", new String[]{this.zzaLx, this.zzaLx + ".%"}) + " items"));
            }
            catch(SQLiteException sQLiteException0) {
                zzbg.zzaC(("Error deleting entries with key prefix: " + this.zzaLx + " (" + sQLiteException0 + ")."));
            }
            finally {
                zzw.this.zzyF();
            }
        };
        this.zzaLq.execute(zzw$30);

        class com.google.android.gms.tagmanager.zzw.3 implements Runnable {
            com.google.android.gms.tagmanager.zzw.3(String s) {
            }

            @Override
            public void run() {
                zzw.this.zzeq(this.zzaLx);
            }
        }

    }

    // 检测为 lambda 实现。
    private void zzeq(String s) {
        SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for clearKeysWithPrefix.");
        if(sQLiteDatabase0 == null) {
            return;
        }
        try {
            zzbg.zzaB(("Cleared " + sQLiteDatabase0.delete("datalayer", "key = ? OR key LIKE ?", new String[]{s, s + ".%"}) + " items"));
        }
        catch(SQLiteException sQLiteException0) {
            zzbg.zzaC(("Error deleting entries with key prefix: " + s + " (" + sQLiteException0 + ")."));
        }
        finally {
            this.zzyF();
        }
    }

    private SQLiteDatabase zzer(String s) {
        try {
            return this.zzaLr.getWritableDatabase();
        }
        catch(SQLiteException unused_ex) {
            zzbg.zzaC(s);
            return null;
        }
    }

    private void zziS(int v) {
        int v1 = this.zzyE() - this.zzaLs + v;
        if(v1 > 0) {
            List list0 = this.zziT(v1);
            zzbg.zzaA(("DataLayer store full, deleting " + list0.size() + " entries to make room."));
            this.zze(((String[])list0.toArray(new String[0])));
        }
    }

    private List zziT(int v) {
        Cursor cursor0;
        ArrayList arrayList0 = new ArrayList();
        if(v <= 0) {
            zzbg.zzaC("Invalid maxEntries specified. Skipping.");
            return arrayList0;
        }
        SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for peekEntryIds.");
        if(sQLiteDatabase0 == null) {
            return arrayList0;
        }
        try {
            cursor0 = null;
            cursor0 = sQLiteDatabase0.query("datalayer", new String[]{"ID"}, null, null, null, null, "ID ASC", Integer.toString(v));
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
                zzbg.zzaC(("Error in peekEntries fetching entryIds: " + sQLiteException0.getMessage()));
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

    private List zzp(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            Object object1 = this.zzq(((zzb)object0).zzaLy);
            list1.add(new com.google.android.gms.tagmanager.DataLayer.zza(((zzb)object0).zztw, object1));
        }
        return list1;
    }

    private Object zzq(byte[] arr_b) {
        Object object0;
        ObjectInputStream objectInputStream0;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        try {
            objectInputStream0 = null;
            objectInputStream0 = new ObjectInputStream(byteArrayInputStream0);
            object0 = objectInputStream0.readObject();
            goto label_24;
        }
        catch(IOException unused_ex) {
            goto label_9;
        }
        catch(ClassNotFoundException unused_ex) {
            goto label_14;
        }
        catch(Throwable throwable0) {
        }
        Throwable throwable1 = throwable0;
        goto label_20;
        try {
            object0 = objectInputStream0.readObject();
            goto label_24;
        }
        catch(IOException unused_ex) {
            try {
            label_9:
                if(objectInputStream0 != null) {
                    objectInputStream0.close();
                }
                byteArrayInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
            return null;
        }
        catch(ClassNotFoundException unused_ex) {
            try {
            label_14:
                if(objectInputStream0 != null) {
                    objectInputStream0.close();
                }
                byteArrayInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
            return null;
        }
        catch(Throwable throwable1) {
        }
        try {
        label_20:
            if(objectInputStream0 != null) {
                objectInputStream0.close();
            }
            byteArrayInputStream0.close();
        }
        catch(IOException unused_ex) {
        }
        throw throwable1;
        try {
        label_24:
            objectInputStream0.close();
            byteArrayInputStream0.close();
        }
        catch(IOException unused_ex) {
        }
        return object0;
    }

    private List zzq(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            byte[] arr_b = this.zzA(((com.google.android.gms.tagmanager.DataLayer.zza)object0).zzGK);
            list1.add(new zzb(((com.google.android.gms.tagmanager.DataLayer.zza)object0).zztw, arr_b));
        }
        return list1;
    }

    private List zzyC() {
        try {
            this.zzS(this.zzpw.currentTimeMillis());
            return this.zzp(this.zzyD());
        }
        finally {
            this.zzyF();
        }
    }

    private List zzyD() {
        SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for loadSerialized.");
        ArrayList arrayList0 = new ArrayList();
        if(sQLiteDatabase0 == null) {
            return arrayList0;
        }
        try(Cursor cursor0 = sQLiteDatabase0.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null)) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                arrayList0.add(new zzb(cursor0.getString(0), cursor0.getBlob(1)));
            }
        }
        return arrayList0;
    }

    private int zzyE() {
        Cursor cursor0 = null;
        int v = 0;
        SQLiteDatabase sQLiteDatabase0 = this.zzer("Error opening database for getNumStoredEntries.");
        if(sQLiteDatabase0 != null) {
            try {
                try {
                    cursor0 = sQLiteDatabase0.rawQuery("SELECT COUNT(*) from datalayer", null);
                    if(!cursor0.moveToFirst()) {
                        goto label_15;
                    }
                    v = (int)cursor0.getLong(0);
                    goto label_15;
                }
                catch(SQLiteException unused_ex) {
                }
                zzbg.zzaC("Error getting numStoredEntries");
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

    private void zzyF() {
        try {
            this.zzaLr.close();
        }
        catch(SQLiteException unused_ex) {
        }
    }

    // 去混淆评级： 低(20)
    static String zzyG() [...] // Potential decryptor
}

