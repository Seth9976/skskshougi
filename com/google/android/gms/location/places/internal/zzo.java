package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class zzo {
    class zza implements Runnable {
        final zzo zzaAV;

        private zza() {
        }

        zza(com.google.android.gms.location.places.internal.zzo.1 zzo$10) {
        }

        @Override
        public void run() {
            synchronized(zzo.this.zzqt) {
                Intent intent0 = new Intent("com.google.android.location.places.METHOD_CALL");
                intent0.setPackage("com.google.android.gms");
                intent0.putStringArrayListExtra("PLACE_IDS", zzo.this.zzaAT);
                intent0.putStringArrayListExtra("METHOD_NAMES", zzo.this.zzaAU);
                zzo.this.mContext.sendBroadcast(intent0);
                zzo.this.zzaAT = null;
                zzo.this.zzaAU = null;
            }
        }
    }

    private static final String TAG;
    private final Context mContext;
    private final Handler mHandler;
    private static final long zzaAQ;
    private static zzo zzaAR;
    private final Runnable zzaAS;
    private ArrayList zzaAT;
    private ArrayList zzaAU;
    private final Object zzqt;

    static {
        zzo.TAG = "zzo";
        zzo.zzaAQ = TimeUnit.SECONDS.toMillis(1L);
    }

    private zzo(Context context0) {
        this(((Context)zzu.zzu(context0)), new Handler(Looper.getMainLooper()));
    }

    zzo(Context context0, Handler handler0) {
        this.zzaAS = new zza(this, null);
        this.zzqt = new Object();
        this.zzaAT = null;
        this.zzaAU = null;
        this.mContext = context0;
        this.mHandler = handler0;
    }

    public void zzA(String s, String s1) {
        synchronized(this.zzqt) {
            if(this.zzaAT == null) {
                this.zzaAT = new ArrayList();
                this.zzaAU = new ArrayList();
                this.mHandler.postDelayed(this.zzaAS, zzo.zzaAQ);
            }
            this.zzaAT.add(s);
            this.zzaAU.add(s1);
            if(this.zzaAT.size() >= 10000) {
                if(Log.isLoggable("zzo", 5)) {
                    Log.w("zzo", "Event buffer full, flushing");
                }
                this.zzaAS.run();
                this.mHandler.removeCallbacks(this.zzaAS);
            }
        }
    }

    public static zzo zzax(Context context0) {
        zzo zzo0;
        synchronized(zzo.class) {
            zzu.zzu(context0);
            if(Build.VERSION.SDK_INT < 14) {
                zzo0 = null;
            }
            else {
                if(zzo.zzaAR == null) {
                    zzo.zzaAR = new zzo(context0.getApplicationContext());
                }
                zzo0 = zzo.zzaAR;
            }
            return zzo0;
        }
    }

    class com.google.android.gms.location.places.internal.zzo.1 {
    }

}

