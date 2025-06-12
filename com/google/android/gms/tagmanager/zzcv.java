package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

class zzcv {
    static void zza(Context context0, String s, String s1, String s2) {
        SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences(s, 0).edit();
        sharedPreferences$Editor0.putString(s1, s2);
        zzcv.zza(sharedPreferences$Editor0);
    }

    static void zza(SharedPreferences.Editor sharedPreferences$Editor0) {
        if(Build.VERSION.SDK_INT >= 9) {
            sharedPreferences$Editor0.apply();
            return;
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                sharedPreferences$Editor0.commit();
            }
        }).start();
    }
}

