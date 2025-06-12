package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;

public class zze {
    private final long zzacG;
    private final int zzacH;
    private final SimpleArrayMap zzacI;

    public zze() {
        this.zzacG = 60000L;
        this.zzacH = 10;
        this.zzacI = new SimpleArrayMap(10);
    }

    public zze(int v, long v1) {
        this.zzacG = v1;
        this.zzacH = v;
        this.zzacI = new SimpleArrayMap();
    }

    private void zzc(long v, long v1) {
        for(int v2 = this.zzacI.size() - 1; v2 >= 0; --v2) {
            if(v1 - ((long)(((Long)this.zzacI.valueAt(v2)))) > v) {
                this.zzacI.removeAt(v2);
            }
        }
    }

    public Long zzcp(String s) {
        long v = SystemClock.elapsedRealtime();
        long v1 = this.zzacG;
        synchronized(this) {
            while(this.zzacI.size() >= this.zzacH) {
                this.zzc(v1, v);
                v1 /= 2L;
                Log.w("ConnectionTracker", "The max capacity " + this.zzacH + " is not enough. Current durationThreshold is: " + v1);
            }
            return (Long)this.zzacI.put(s, v);
        }
    }

    public boolean zzcq(String s) {
        synchronized(this) {
            return this.zzacI.remove(s) != null;
        }
    }
}

