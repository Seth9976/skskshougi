package com.google.android.gms.tagmanager;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class zzdb extends zzak {
    final class zza implements Runnable {
        private final long zzMC;
        private final String zzaOl;
        private final String zzaOm;
        private final long zzaOn;
        private long zzaOo;
        final zzdb zzaOp;
        private final long zzaxU;

        zza(String s, String s1, long v, long v1) {
            this.zzaOl = s;
            this.zzaOm = s1;
            this.zzaxU = v;
            this.zzaOn = v1;
            this.zzMC = System.currentTimeMillis();
        }

        @Override
        public void run() {
            if(this.zzaOn > 0L && this.zzaOo >= this.zzaOn) {
                if(!"0".equals(this.zzaOm)) {
                    zzdb.this.zzaOk.remove(this.zzaOm);
                }
                return;
            }
            ++this.zzaOo;
            if(this.zzcq()) {
                zzdb.this.zzaKz.push(DataLayer.mapOf(new Object[]{"event", this.zzaOl, "gtm.timerInterval", String.valueOf(this.zzaxU), "gtm.timerLimit", String.valueOf(this.zzaOn), "gtm.timerStartTime", String.valueOf(this.zzMC), "gtm.timerCurrentTime", "1749696417985", "gtm.timerElapsedTime", String.valueOf(System.currentTimeMillis() - this.zzMC), "gtm.timerEventNumber", String.valueOf(this.zzaOo), "gtm.triggers", this.zzaOm}));
            }
            zzdb.this.mHandler.postDelayed(this, this.zzaxU);
        }

        protected boolean zzcq() {
            if(zzdb.this.zzaOi) {
                return zzdb.this.zzaOh;
            }
            ActivityManager activityManager0 = (ActivityManager)zzdb.this.mContext.getSystemService("activity");
            KeyguardManager keyguardManager0 = (KeyguardManager)zzdb.this.mContext.getSystemService("keyguard");
            PowerManager powerManager0 = (PowerManager)zzdb.this.mContext.getSystemService("power");
            for(Object object0: activityManager0.getRunningAppProcesses()) {
                if(Process.myPid() == ((ActivityManager.RunningAppProcessInfo)object0).pid && ((ActivityManager.RunningAppProcessInfo)object0).importance == 100 && !keyguardManager0.inKeyguardRestrictedInputMode() && powerManager0.isScreenOn()) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    private static final String ID;
    private static final String NAME;
    private final Context mContext;
    private Handler mHandler;
    private DataLayer zzaKz;
    private static final String zzaOe;
    private static final String zzaOf;
    private static final String zzaOg;
    private boolean zzaOh;
    private boolean zzaOi;
    private final HandlerThread zzaOj;
    private final Set zzaOk;

    static {
        zzdb.ID = "_tl";
        zzdb.NAME = "name";
        zzdb.zzaOe = "interval";
        zzdb.zzaOf = "limit";
        zzdb.zzaOg = "unique_trigger_id";
    }

    public zzdb(Context context0, DataLayer dataLayer0) {
        super("_tl", new String[]{"interval", "name"});
        this.zzaOk = new HashSet();
        this.mContext = context0;
        this.zzaKz = dataLayer0;
        this.zzaOj = new HandlerThread("Google GTM SDK Timer", 10);
        this.zzaOj.start();
        this.mHandler = new Handler(this.zzaOj.getLooper());
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public com.google.android.gms.internal.zzag.zza zzE(Map map0) {
        long v1;
        long v;
        String s = zzdf.zzg(((com.google.android.gms.internal.zzag.zza)map0.get("name")));
        String s1 = zzdf.zzg(((com.google.android.gms.internal.zzag.zza)map0.get("unique_trigger_id")));
        String s2 = zzdf.zzg(((com.google.android.gms.internal.zzag.zza)map0.get("interval")));
        String s3 = zzdf.zzg(((com.google.android.gms.internal.zzag.zza)map0.get("limit")));
        try {
            v = Long.parseLong(s2);
        }
        catch(NumberFormatException unused_ex) {
            v = 0L;
        }
        try {
            v1 = Long.parseLong(s3);
        }
        catch(NumberFormatException unused_ex) {
            v1 = 0L;
        }
        if(v > 0L && !TextUtils.isEmpty(s)) {
            if(s1 == null || s1.isEmpty()) {
                s1 = "0";
            }
            if(!this.zzaOk.contains(s1)) {
                if(!"0".equals(s1)) {
                    this.zzaOk.add(s1);
                }
                this.mHandler.postDelayed(new zza(this, s, s1, v, v1), v);
            }
        }
        return zzdf.zzzQ();
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return false;
    }
}

