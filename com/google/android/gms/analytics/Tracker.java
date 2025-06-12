package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzad;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zznx;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Random;

public class Tracker extends zzd {
    class zza extends zzd implements com.google.android.gms.analytics.GoogleAnalytics.zza {
        final Tracker zzIU;
        private boolean zzIV;
        private int zzIW;
        private long zzIX;
        private boolean zzIY;
        private long zzIZ;

        protected zza(zzf zzf0) {
            super(zzf0);
            this.zzIX = -1L;
        }

        public void enableAutoActivityTracking(boolean enabled) {
            this.zzIV = enabled;
            this.zzhr();
        }

        public void setSessionTimeout(long sessionTimeout) {
            this.zzIX = sessionTimeout;
            this.zzhr();
        }

        @Override  // com.google.android.gms.analytics.internal.zzd
        protected void zzhn() {
        }

        public boolean zzhq() {
            boolean z;
            synchronized(this) {
                z = this.zzIY;
                this.zzIY = false;
            }
            return z;
        }

        private void zzhr() {
            if(this.zzIX >= 0L || this.zzIV) {
                this.zzhg().zza(Tracker.this.zzIK);
                return;
            }
            this.zzhg().zzb(Tracker.this.zzIK);
        }

        boolean zzhs() {
            return this.zzhP().elapsedRealtime() >= this.zzIZ + Math.max(1000L, this.zzIX);
        }

        @Override  // com.google.android.gms.analytics.GoogleAnalytics$zza
        public void zzn(Activity activity0) {
            if(this.zzIW == 0 && this.zzhs()) {
                this.zzIY = true;
            }
            ++this.zzIW;
            if(this.zzIV) {
                Intent intent0 = activity0.getIntent();
                if(intent0 != null) {
                    Uri uri0 = intent0.getData();
                    Tracker.this.setCampaignParamsOnNextHit(uri0);
                }
                HashMap hashMap0 = new HashMap();
                hashMap0.put("&t", "screenview");
                String s = Tracker.this.zzIM == null ? activity0.getClass().getCanonicalName() : Tracker.this.zzIM.zzq(activity0);
                Tracker.this.set("&cd", s);
                if(TextUtils.isEmpty(((CharSequence)hashMap0.get("&dr")))) {
                    String s1 = Tracker.zzp(activity0);
                    if(!TextUtils.isEmpty(s1)) {
                        hashMap0.put("&dr", s1);
                    }
                }
                Tracker.this.send(hashMap0);
            }
        }

        @Override  // com.google.android.gms.analytics.GoogleAnalytics$zza
        public void zzo(Activity activity0) {
            this.zzIW = Math.max(0, this.zzIW);
            if(this.zzIW == 0) {
                this.zzIZ = this.zzhP().elapsedRealtime();
            }
        }
    }

    private boolean zzIH;
    private final Map zzII;
    private final zzad zzIJ;
    private final zza zzIK;
    private ExceptionReporter zzIL;
    private zzal zzIM;
    private final Map zzyn;

    Tracker(zzf analytics, String trackingId, zzad rateLimiter) {
        super(analytics);
        this.zzyn = new HashMap();
        this.zzII = new HashMap();
        if(trackingId != null) {
            this.zzyn.put("&tid", trackingId);
        }
        this.zzyn.put("useSecure", "1");
        String s1 = Integer.toString(new Random().nextInt(0x7FFFFFFF) + 1);
        this.zzyn.put("&a", s1);
        this.zzIJ = rateLimiter == null ? new zzad("tracking") : rateLimiter;
        this.zzIK = new zza(this, analytics);
    }

    public void enableAdvertisingIdCollection(boolean enabled) {
        this.zzIH = enabled;
    }

    public void enableAutoActivityTracking(boolean enabled) {
        this.zzIK.enableAutoActivityTracking(enabled);
    }

    public void enableExceptionReporting(boolean enable) {
        synchronized(this) {
            if(this.zzho() == enable) {
                return;
            }
            if(enable) {
                Context context0 = this.getContext();
                this.zzIL = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), context0);
                Thread.setDefaultUncaughtExceptionHandler(this.zzIL);
                this.zzaT("Uncaught exceptions will be reported to Google Analytics");
            }
            else {
                Thread.setDefaultUncaughtExceptionHandler(this.zzIL.zzhh());
                this.zzaT("Uncaught exceptions will not be reported to Google Analytics");
            }
        }
    }

    public String get(String key) {
        this.zzia();
        if(TextUtils.isEmpty(key)) {
            return null;
        }
        if(this.zzyn.containsKey(key)) {
            return (String)this.zzyn.get(key);
        }
        if(key.equals("&ul")) {
            return zzam.zza(Locale.getDefault());
        }
        if(key.equals("&cid")) {
            return this.zzhV().zziP();
        }
        if(key.equals("&sr")) {
            return this.zzhY().zzjF();
        }
        if(key.equals("&aid")) {
            return this.zzhX().zzix().zzsK();
        }
        if(key.equals("&an")) {
            return this.zzhX().zzix().zzjL();
        }
        if(key.equals("&av")) {
            return this.zzhX().zzix().zzjN();
        }
        return key.equals("&aiid") ? this.zzhX().zzix().zzwi() : null;
    }

    public void send(Map map0) {
        long v = this.zzhP().currentTimeMillis();
        if(this.zzhg().getAppOptOut()) {
            this.zzaU("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean z = this.zzhg().isDryRunEnabled();
        HashMap hashMap0 = new HashMap();
        Tracker.zza(this.zzyn, hashMap0);
        Tracker.zza(map0, hashMap0);
        boolean z1 = zzam.zze(((String)this.zzyn.get("useSecure")), true);
        Tracker.zzb(this.zzII, hashMap0);
        this.zzII.clear();
        String s = (String)hashMap0.get("t");
        if(TextUtils.isEmpty(s)) {
            this.zzhQ().zzg(hashMap0, "Missing hit type parameter");
            return;
        }
        String s1 = (String)hashMap0.get("tid");
        if(TextUtils.isEmpty(s1)) {
            this.zzhQ().zzg(hashMap0, "Missing tracking id parameter");
            return;
        }
        boolean z2 = this.zzhp();
        synchronized(this) {
            if("screenview".equalsIgnoreCase(s) || "pageview".equalsIgnoreCase(s) || "appview".equalsIgnoreCase(s) || TextUtils.isEmpty(s)) {
                int v2 = Integer.parseInt(((String)this.zzyn.get("&a"))) + 1;
                if(v2 >= 0x7FFFFFFF) {
                    v2 = 1;
                }
                this.zzyn.put("&a", Integer.toString(v2));
            }
        }
        this.zzhS().zze(new Runnable() {
            @Override
            public void run() {
                boolean z = true;
                if(Tracker.this.zzIK.zzhq()) {
                    hashMap0.put("sc", "start");
                }
                String s = Tracker.this.zzhg().getClientId();
                zzam.zzc(hashMap0, "cid", s);
                String s1 = (String)hashMap0.get("sf");
                if(s1 != null) {
                    double f = zzam.zza(s1, 100.0);
                    if(zzam.zza(f, ((String)hashMap0.get("cid")))) {
                        Tracker.this.zzb("Sampling enabled. Hit sampled out. sample rate", f);
                        return;
                    }
                }
                com.google.android.gms.analytics.internal.zza zza0 = Tracker.this.zzhW();
                if(z2) {
                    boolean z1 = zza0.zzhy();
                    zzam.zzb(hashMap0, "ate", z1);
                    String s2 = zza0.zzhC();
                    zzam.zzb(hashMap0, "adid", s2);
                }
                else {
                    hashMap0.remove("ate");
                    hashMap0.remove("adid");
                }
                zznx zznx0 = Tracker.this.zzhX().zzix();
                zzam.zzb(hashMap0, "an", zznx0.zzjL());
                zzam.zzb(hashMap0, "av", zznx0.zzjN());
                zzam.zzb(hashMap0, "aid", zznx0.zzsK());
                zzam.zzb(hashMap0, "aiid", zznx0.zzwi());
                hashMap0.put("v", "1");
                hashMap0.put("_v", "ma7.5.71");
                String s3 = Tracker.this.zzhY().zzjE().getLanguage();
                zzam.zzb(hashMap0, "ul", s3);
                String s4 = Tracker.this.zzhY().zzjF();
                zzam.zzb(hashMap0, "sr", s4);
                if(!s.equals("transaction") && !s.equals("item") && !Tracker.this.zzIJ.zzkb()) {
                    Tracker.this.zzhQ().zzg(hashMap0, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
                long v = zzam.zzbj(((String)hashMap0.get("ht")));
                if(v == 0L) {
                    v = v;
                }
                if(z) {
                    zzab zzab0 = new zzab(Tracker.this, hashMap0, v, z1);
                    Tracker.this.zzhQ().zzc("Dry run enabled. Would have sent hit", zzab0);
                    return;
                }
                String s5 = (String)hashMap0.get("cid");
                HashMap hashMap0 = new HashMap();
                zzam.zza(hashMap0, "uid", hashMap0);
                zzam.zza(hashMap0, "an", hashMap0);
                zzam.zza(hashMap0, "aid", hashMap0);
                zzam.zza(hashMap0, "av", hashMap0);
                zzam.zza(hashMap0, "aiid", hashMap0);
                String s6 = s1;
                if(TextUtils.isEmpty(((CharSequence)hashMap0.get("adid")))) {
                    z = false;
                }
                zzh zzh0 = new zzh(0L, s5, s6, z, 0L, hashMap0);
                String s7 = String.valueOf(Tracker.this.zzhl().zza(zzh0));
                hashMap0.put("_s", s7);
                zzab zzab1 = new zzab(Tracker.this, hashMap0, v, z1);
                Tracker.this.zzhl().zza(zzab1);
            }
        });
    }

    public void set(String key, String value) {
        zzu.zzb(key, "Key should be non-null");
        if(TextUtils.isEmpty(key)) {
            return;
        }
        this.zzyn.put(key, value);
    }

    public void setAnonymizeIp(boolean anonymize) {
        this.set("&aip", zzam.zzH(anonymize));
    }

    public void setAppId(String appId) {
        this.set("&aid", appId);
    }

    public void setAppInstallerId(String appInstallerId) {
        this.set("&aiid", appInstallerId);
    }

    public void setAppName(String appName) {
        this.set("&an", appName);
    }

    public void setAppVersion(String appVersion) {
        this.set("&av", appVersion);
    }

    public void setCampaignParamsOnNextHit(Uri uri) {
        if(uri != null && !uri.isOpaque()) {
            String s = uri.getQueryParameter("referrer");
            if(!TextUtils.isEmpty(s)) {
                Uri uri1 = Uri.parse(("http://hostname/?" + s));
                String s1 = uri1.getQueryParameter("utm_id");
                if(s1 != null) {
                    this.zzII.put("&ci", s1);
                }
                String s2 = uri1.getQueryParameter("anid");
                if(s2 != null) {
                    this.zzII.put("&anid", s2);
                }
                String s3 = uri1.getQueryParameter("utm_campaign");
                if(s3 != null) {
                    this.zzII.put("&cn", s3);
                }
                String s4 = uri1.getQueryParameter("utm_content");
                if(s4 != null) {
                    this.zzII.put("&cc", s4);
                }
                String s5 = uri1.getQueryParameter("utm_medium");
                if(s5 != null) {
                    this.zzII.put("&cm", s5);
                }
                String s6 = uri1.getQueryParameter("utm_source");
                if(s6 != null) {
                    this.zzII.put("&cs", s6);
                }
                String s7 = uri1.getQueryParameter("utm_term");
                if(s7 != null) {
                    this.zzII.put("&ck", s7);
                }
                String s8 = uri1.getQueryParameter("dclid");
                if(s8 != null) {
                    this.zzII.put("&dclid", s8);
                }
                String s9 = uri1.getQueryParameter("gclid");
                if(s9 != null) {
                    this.zzII.put("&gclid", s9);
                }
                String s10 = uri1.getQueryParameter("aclid");
                if(s10 != null) {
                    this.zzII.put("&aclid", s10);
                }
            }
        }
    }

    public void setClientId(String clientId) {
        this.set("&cid", clientId);
    }

    public void setEncoding(String encoding) {
        this.set("&de", encoding);
    }

    public void setHostname(String hostname) {
        this.set("&dh", hostname);
    }

    public void setLanguage(String language) {
        this.set("&ul", language);
    }

    public void setLocation(String location) {
        this.set("&dl", location);
    }

    public void setPage(String page) {
        this.set("&dp", page);
    }

    public void setReferrer(String referrer) {
        this.set("&dr", referrer);
    }

    public void setSampleRate(double sampleRate) {
        this.set("&sf", Double.toString(sampleRate));
    }

    public void setScreenColors(String screenColors) {
        this.set("&sd", screenColors);
    }

    public void setScreenName(String screenName) {
        this.set("&cd", screenName);
    }

    public void setScreenResolution(int width, int height) {
        if(width < 0 && height < 0) {
            this.zzaW("Invalid width or height. The values should be non-negative.");
            return;
        }
        this.set("&sr", width + "x" + height);
    }

    public void setSessionTimeout(long sessionTimeout) {
        this.zzIK.setSessionTimeout(1000L * sessionTimeout);
    }

    public void setTitle(String title) {
        this.set("&dt", title);
    }

    public void setUseSecure(boolean useSecure) {
        this.set("useSecure", zzam.zzH(useSecure));
    }

    public void setViewportSize(String viewportSize) {
        this.set("&vp", viewportSize);
    }

    private static void zza(Map map0, Map map1) {
        zzu.zzu(map1);
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = Tracker.zzb(map$Entry0);
                if(s != null) {
                    map1.put(s, map$Entry0.getValue());
                }
            }
        }
    }

    private static boolean zza(Map.Entry map$Entry0) {
        String s = (String)map$Entry0.getKey();
        String s1 = (String)map$Entry0.getValue();
        return s.startsWith("&") && s.length() >= 2;
    }

    void zza(zzal zzal0) {
        this.zzaT("Loading Tracker config values");
        this.zzIM = zzal0;
        if(this.zzIM.zzky()) {
            String s = this.zzIM.getTrackingId();
            this.set("&tid", s);
            this.zza("trackingId loaded", s);
        }
        if(this.zzIM.zzkz()) {
            String s1 = Double.toString(this.zzIM.zzkA());
            this.set("&sf", s1);
            this.zza("Sample frequency loaded", s1);
        }
        if(this.zzIM.zzkB()) {
            int v = this.zzIM.getSessionTimeout();
            this.setSessionTimeout(((long)v));
            this.zza("Session timeout loaded", v);
        }
        if(this.zzIM.zzkC()) {
            boolean z = this.zzIM.zzkD();
            this.enableAutoActivityTracking(z);
            this.zza("Auto activity tracking loaded", Boolean.valueOf(z));
        }
        if(this.zzIM.zzkE()) {
            boolean z1 = this.zzIM.zzkF();
            if(z1) {
                this.set("&aip", "1");
            }
            this.zza("Anonymize ip loaded", Boolean.valueOf(z1));
        }
        this.enableExceptionReporting(this.zzIM.zzkG());
    }

    private static String zzb(Map.Entry map$Entry0) {
        return Tracker.zza(map$Entry0) ? ((String)map$Entry0.getKey()).substring(1) : null;
    }

    private static void zzb(Map map0, Map map1) {
        zzu.zzu(map1);
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = Tracker.zzb(map$Entry0);
                if(s != null && !map1.containsKey(s)) {
                    map1.put(s, map$Entry0.getValue());
                }
            }
        }
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
        this.zzIK.zza();
        String s = this.zzhm().zzjL();
        if(s != null) {
            this.set("&an", s);
        }
        String s1 = this.zzhm().zzjN();
        if(s1 != null) {
            this.set("&av", s1);
        }
    }

    private boolean zzho() {
        return this.zzIL != null;
    }

    boolean zzhp() {
        return this.zzIH;
    }

    static String zzp(Activity activity0) {
        zzu.zzu(activity0);
        Intent intent0 = activity0.getIntent();
        if(intent0 == null) {
            return null;
        }
        String s = intent0.getStringExtra("android.intent.extra.REFERRER_NAME");
        return TextUtils.isEmpty(s) ? null : s;
    }
}

