package com.google.android.gms.tagmanager;

import android.util.Log;

public class zzy implements zzbh {
    private int zzKR;

    public zzy() {
        this.zzKR = 5;
    }

    @Override  // com.google.android.gms.tagmanager.zzbh
    public void setLogLevel(int logLevel) {
        this.zzKR = logLevel;
    }

    @Override  // com.google.android.gms.tagmanager.zzbh
    public void zzaA(String s) {
        if(this.zzKR <= 4) {
            Log.i("GoogleTagManager", s);
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzbh
    public void zzaB(String s) {
        if(this.zzKR <= 2) {
            Log.v("GoogleTagManager", s);
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzbh
    public void zzaC(String s) {
        if(this.zzKR <= 5) {
            Log.w("GoogleTagManager", s);
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzbh
    public void zzay(String s) {
        if(this.zzKR <= 3) {
            Log.d("GoogleTagManager", s);
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzbh
    public void zzaz(String s) {
        if(this.zzKR <= 6) {
            Log.e("GoogleTagManager", s);
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzbh
    public void zzb(String s, Throwable throwable0) {
        if(this.zzKR <= 6) {
            Log.e("GoogleTagManager", s, throwable0);
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzbh
    public void zzd(String s, Throwable throwable0) {
        if(this.zzKR <= 5) {
            Log.w("GoogleTagManager", s, throwable0);
        }
    }
}

