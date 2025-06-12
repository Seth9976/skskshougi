package org.cocos2dx.lib;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Cocos2dxLocalStorage {
    static class DBOpenHelper extends SQLiteOpenHelper {
        DBOpenHelper(Context context) {
            super(context, "jsb.sqlite", null, 1);
        }

        // 去混淆评级： 低(30)
        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE IF NOT EXISTS data(key TEXT PRIMARY KEY,value TEXT);");
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w("Cocos2dxLocalStorage", "Upgrading database from version " + oldVersion + " to " + newVersion + ", which will destroy all old data");
        }
    }

    private static String DATABASE_NAME = null;
    private static final int DATABASE_VERSION = 1;
    private static String TABLE_NAME = null;
    private static final String TAG = "Cocos2dxLocalStorage";
    private static SQLiteDatabase mDatabase;
    private static DBOpenHelper mDatabaseOpenHelper;

    static {
        Cocos2dxLocalStorage.DATABASE_NAME = "jsb.sqlite";
        Cocos2dxLocalStorage.TABLE_NAME = "data";
        Cocos2dxLocalStorage.mDatabaseOpenHelper = null;
        Cocos2dxLocalStorage.mDatabase = null;
    }

    // 去混淆评级： 低(20)
    static String access$000() [...] // Potential decryptor

    // 去混淆评级： 低(20)
    static String access$100() [...] // Potential decryptor

    public static void clear() {
        try {
            Cocos2dxLocalStorage.mDatabase.execSQL("delete from data");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void destory() {
        if(Cocos2dxLocalStorage.mDatabase != null) {
            Cocos2dxLocalStorage.mDatabase.close();
        }
    }

    public static String getItem(String key) {
        String ret = null;
        try {
            Cursor cursor0 = Cocos2dxLocalStorage.mDatabase.rawQuery("select value from data where key=?", new String[]{key});
            while(cursor0.moveToNext()) {
                if(ret != null) {
                    Log.e("Cocos2dxLocalStorage", "The key contains more than one value.");
                    break;
                }
                ret = cursor0.getString(cursor0.getColumnIndex("value"));
            }
            cursor0.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return ret == null ? "" : ret;
    }

    public static boolean init(String dbName, String tableName) {
        if(Cocos2dxActivity.getContext() != null) {
            Cocos2dxLocalStorage.DATABASE_NAME = dbName;
            Cocos2dxLocalStorage.TABLE_NAME = tableName;
            Cocos2dxLocalStorage.mDatabaseOpenHelper = new DBOpenHelper(Cocos2dxActivity.getContext());
            Cocos2dxLocalStorage.mDatabase = Cocos2dxLocalStorage.mDatabaseOpenHelper.getWritableDatabase();
            return true;
        }
        return false;
    }

    public static void removeItem(String key) {
        try {
            Cocos2dxLocalStorage.mDatabase.execSQL("delete from data where key=?", new Object[]{key});
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void setItem(String key, String value) {
        try {
            Cocos2dxLocalStorage.mDatabase.execSQL("replace into data(key,value)values(?,?)", new Object[]{key, value});
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

