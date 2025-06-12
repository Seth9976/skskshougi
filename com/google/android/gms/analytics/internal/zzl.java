package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
import com.google.android.gms.analytics.zza;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzio;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zzno;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznx;
import com.google.android.gms.internal.zzny;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

class zzl extends zzd {
    private boolean mStarted;
    private final zzj zzKn;
    private final zzah zzKo;
    private final zzag zzKp;
    private final zzi zzKq;
    private long zzKr;
    private final zzt zzKs;
    private final zzt zzKt;
    private final zzaj zzKu;
    private long zzKv;
    private boolean zzKw;

    protected zzl(zzf zzf0, zzg zzg0) {
        super(zzf0);
        zzu.zzu(zzg0);
        this.zzKr = 0x8000000000000000L;
        this.zzKp = zzg0.zzk(zzf0);
        this.zzKn = zzg0.zzm(zzf0);
        this.zzKo = zzg0.zzn(zzf0);
        this.zzKq = zzg0.zzo(zzf0);
        this.zzKu = new zzaj(this.zzhP());
        this.zzKs = new zzt(zzf0) {
            @Override  // com.google.android.gms.analytics.internal.zzt
            public void run() {
                zzl.this.zziA();
            }
        };
        this.zzKt = new zzt(zzf0) {
            @Override  // com.google.android.gms.analytics.internal.zzt
            public void run() {
                zzl.this.zziB();
            }
        };
    }

    protected void onServiceConnected() {
        this.zzhO();
        if(!this.zzhR().zziW()) {
            this.zziD();
        }
    }

    void start() {
        this.zzia();
        zzu.zza(!this.mStarted, "Analytics backend already started");
        this.mStarted = true;
        if(!this.zzhR().zziW()) {
            this.zziy();
        }
        this.zzhS().zze(() -> {
            zzl.this.zzia();
            zzl.this.zzhU().zzkk();
            if(!zzl.this.zzba("android.permission.ACCESS_NETWORK_STATE")) {
                zzl.this.zzaX("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
                zzl.this.zziO();
            }
            if(!zzl.this.zzba("android.permission.INTERNET")) {
                zzl.this.zzaX("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
                zzl.this.zziO();
            }
            if(AnalyticsService.zzU(zzl.this.getContext())) {
                zzl.this.zzaT("AnalyticsService registered in the app manifest and enabled");
            }
            else if(zzl.this.zzhR().zziW()) {
                zzl.this.zzaX("Device AnalyticsService not registered! Hits will not be delivered reliably.");
            }
            else {
                zzl.this.zzaW("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
            }
            if(!zzl.this.zzKw && !zzl.this.zzhR().zziW() && !zzl.this.zzKn.isEmpty()) {
                zzl.this.zziC();
            }
            zzl.this.zziG();
        });

        class com.google.android.gms.analytics.internal.zzl.3 implements Runnable {
            @Override
            public void run() {
                zzl.this.zziz();
            }
        }

    }

    public void zzG(boolean z) {
        this.zziG();
    }

    private void zza(zzh zzh0, zzny zzny0) {
        zzu.zzu(zzh0);
        zzu.zzu(zzny0);
        zza zza0 = new zza(this.zzhM());
        zza0.zzaI(zzh0.zzij());
        zza0.enableAdvertisingIdCollection(zzh0.zzik());
        zzno zzno0 = zza0.zzhc();
        zzip zzip0 = (zzip)zzno0.zze(zzip.class);
        zzip0.zzaN("data");
        zzip0.zzF(true);
        zzno0.zzb(zzny0);
        zzio zzio0 = (zzio)zzno0.zze(zzio.class);
        zznx zznx0 = (zznx)zzno0.zze(zznx.class);
        for(Object object0: zzh0.zzn().entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            String s1 = (String)((Map.Entry)object0).getValue();
            if("an".equals(s)) {
                zznx0.setAppName(s1);
            }
            else if("av".equals(s)) {
                zznx0.setAppVersion(s1);
            }
            else if("aid".equals(s)) {
                zznx0.setAppId(s1);
            }
            else if("aiid".equals(s)) {
                zznx0.setAppInstallerId(s1);
            }
            else if("uid".equals(s)) {
                zzip0.setUserId(s1);
            }
            else {
                zzio0.set(s, s1);
            }
        }
        this.zzb("Sending installation campaign to", zzh0.zzij(), zzny0);
        zzno0.zzL(this.zzhU().zzkk());
        zzno0.zzvT();
    }

    public long zza(zzh zzh0, boolean z) {
        long v;
        zzu.zzu(zzh0);
        this.zzia();
        this.zzhO();
        try {
            try {
                this.zzKn.beginTransaction();
                this.zzKn.zza(zzh0.zzii(), zzh0.getClientId());
                v = this.zzKn.zza(zzh0.zzii(), zzh0.getClientId(), zzh0.zzij());
                if(z) {
                    zzh0.zzn(v + 1L);
                }
                else {
                    zzh0.zzn(v);
                }
                this.zzKn.zzb(zzh0);
                this.zzKn.setTransactionSuccessful();
                goto label_26;
            }
            catch(SQLiteException sQLiteException0) {
            }
            this.zze("Failed to update Analytics property", sQLiteException0);
        }
        catch(Throwable throwable0) {
            goto label_21;
        }
        try {
            this.zzKn.endTransaction();
        }
        catch(SQLiteException sQLiteException1) {
            this.zze("Failed to end transaction", sQLiteException1);
        }
        return -1L;
        try {
        label_21:
            this.zzKn.endTransaction();
        }
        catch(SQLiteException sQLiteException2) {
            this.zze("Failed to end transaction", sQLiteException2);
        }
        throw throwable0;
        try {
        label_26:
            this.zzKn.endTransaction();
        }
        catch(SQLiteException sQLiteException3) {
            this.zze("Failed to end transaction", sQLiteException3);
        }
        return v;
    }

    public void zza(zzab zzab0) {
        zzu.zzu(zzab0);
        zzns.zzhO();
        this.zzia();
        if(this.zzKw) {
            this.zzaU("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        }
        else {
            this.zza("Delivering hit", zzab0);
        }
        zzab zzab1 = this.zzf(zzab0);
        this.zziC();
        if(this.zzKq.zzb(zzab1)) {
            this.zzaU("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        if(this.zzhR().zziW()) {
            this.zzhQ().zza(zzab1, "Service unavailable on package side");
            return;
        }
        try {
            this.zzKn.zzc(zzab1);
            this.zziG();
        }
        catch(SQLiteException sQLiteException0) {
            this.zze("Delivery failed to save hit to a database", sQLiteException0);
            this.zzhQ().zza(zzab1, "deliver: failed to insert hit to database");
        }
    }

    // 检测为 lambda 实现。
    public void zza(zzw zzw0, long v) {
        zzns.zzhO();
        this.zzia();
        long v1 = -1L;
        long v2 = this.zzhU().zzkm();
        if(v2 != 0L) {
            v1 = Math.abs(this.zzhP().currentTimeMillis() - v2);
        }
        this.zzb("Dispatching local hits. Elapsed time since last dispatch (ms)", v1);
        if(!this.zzhR().zziW()) {
            this.zziC();
        }
        try {
            if(this.zziE()) {
                this.zzhS().zze(new Runnable() {
                    @Override
                    public void run() {
                        zzl.this.zza(zzw0, v);
                    }
                });
                return;
            }
            this.zzhU().zzkn();
            this.zziG();
            if(zzw0 != null) {
                zzw0.zzc(null);
            }
            if(this.zzKv != v) {
                this.zzKp.zzkf();
                return;
            }
            while(true) {
                return;
            }
        }
        catch(Throwable throwable0) {
            this.zze("Local dispatch failed", throwable0);
            this.zzhU().zzkn();
            this.zziG();
            if(zzw0 == null) {
                return;
            }
            zzw0.zzc(throwable0);
        }
    }

    public void zzb(zzw zzw0) {
        this.zza(zzw0, this.zzKv);
    }

    private boolean zzba(String s) {
        return this.getContext().checkCallingOrSelfPermission(s) == 0;
    }

    public void zzbb(String s) {
        zzu.zzcj(s);
        this.zzhO();
        this.zzhN();
        zzny zzny0 = zzam.zza(this.zzhQ(), s);
        if(zzny0 == null) {
            this.zzd("Parsing failed. Ignoring invalid campaign data", s);
            return;
        }
        String s1 = this.zzhU().zzko();
        if(s.equals(s1)) {
            this.zzaW("Ignoring duplicate install campaign");
            return;
        }
        if(!TextUtils.isEmpty(s1)) {
            this.zzd("Ignoring multiple install campaigns. original, new", s1, s);
            return;
        }
        this.zzhU().zzbf(s);
        if(this.zzhU().zzkl().zzv(this.zzhR().zzjB())) {
            this.zzd("Campaign received too late, ignoring", zzny0);
            return;
        }
        this.zzb("Received installation campaign", zzny0);
        for(Object object0: this.zzKn.zzr(0L)) {
            this.zza(((zzh)object0), zzny0);
        }
    }

    protected void zzc(zzh zzh0) {
        this.zzhO();
        this.zzb("Sending first hit to property", zzh0.zzij());
        if(!this.zzhU().zzkl().zzv(this.zzhR().zzjB())) {
            String s = this.zzhU().zzko();
            if(!TextUtils.isEmpty(s)) {
                zzny zzny0 = zzam.zza(this.zzhQ(), s);
                this.zzb("Found relevant installation campaign", zzny0);
                this.zza(zzh0, zzny0);
            }
        }
    }

    zzab zzf(zzab zzab0) {
        if(TextUtils.isEmpty(zzab0.zzka())) {
            Pair pair0 = this.zzhU().zzkp().zzks();
            if(pair0 != null) {
                String s = ((Long)pair0.second) + ":" + ((String)pair0.first);
                HashMap hashMap0 = new HashMap(zzab0.zzn());
                hashMap0.put("_m", s);
                return zzab.zza(this, zzab0, hashMap0);
            }
        }
        return zzab0;
    }

    public void zzhG() {
        zzns.zzhO();
        this.zzia();
        if(!this.zzhR().zziW()) {
            this.zzaT("Delete all hits from local store");
            try {
                this.zzKn.zziq();
                this.zzKn.zzir();
                this.zziG();
            }
            catch(SQLiteException sQLiteException0) {
                this.zzd("Failed to delete hits from store", sQLiteException0);
            }
        }
        this.zziC();
        if(this.zzKq.zzim()) {
            this.zzaT("Device service unavailable. Can\'t clear hits stored on the device service.");
        }
    }

    public void zzhJ() {
        zzns.zzhO();
        this.zzia();
        this.zzaT("Service disconnected");
    }

    void zzhL() {
        this.zzhO();
        this.zzKv = this.zzhP().currentTimeMillis();
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
        this.zzKn.zza();
        this.zzKo.zza();
        this.zzKq.zza();
    }

    private void zziA() {
        this.zzb((/* 缺少LAMBDA参数 */) -> {
            boolean z;
            zzl.this.zzhM().zzhO();
            zzl.this.zzia();
            if(!zzl.this.zziH()) {
                zzl.this.zzKp.unregister();
                zzl.this.zziK();
                return;
            }
            if(zzl.this.zzKn.isEmpty()) {
                zzl.this.zzKp.unregister();
                zzl.this.zziK();
                return;
            }
            if(((Boolean)zzy.zzLI.get()).booleanValue()) {
                z = true;
            }
            else {
                zzl.this.zzKp.zzkd();
                z = zzl.this.zzKp.isConnected();
            }
            if(z) {
                zzl.this.zziJ();
                return;
            }
            zzl.this.zziK();
            zzl.this.zziI();
        });

        class com.google.android.gms.analytics.internal.zzl.4 implements zzw {
            @Override  // com.google.android.gms.analytics.internal.zzw
            public void zzc(Throwable throwable0) {
                zzl.this.zziG();
            }
        }

    }

    private void zziB() {
        try {
            this.zzKn.zzis();
            this.zziG();
        }
        catch(SQLiteException sQLiteException0) {
            this.zzd("Failed to delete stale hits", sQLiteException0);
        }
        long v = this.zzhR().zzjy();
        this.zzKt.zzt(v);
    }

    protected void zziC() {
        if(!this.zzKw && (this.zzhR().zziY() && !this.zzKq.isConnected())) {
            long v = this.zzhR().zzjt();
            if(this.zzKu.zzv(v)) {
                this.zzKu.start();
                this.zzaT("Connecting to service");
                if(this.zzKq.connect()) {
                    this.zzaT("Connected to service");
                    this.zzKu.clear();
                    this.onServiceConnected();
                }
            }
        }
    }

    public void zziD() {
        List list0;
        zzns.zzhO();
        this.zzia();
        this.zzhN();
        if(!this.zzhR().zziY()) {
            this.zzaW("Service client disabled. Can\'t dispatch local hits to device AnalyticsService");
        }
        if(!this.zzKq.isConnected()) {
            this.zzaT("Service not connected");
            return;
        }
        if(!this.zzKn.isEmpty()) {
            this.zzaT("Dispatching local hits to device AnalyticsService");
            try {
                do {
                    long v = (long)this.zzhR().zzjh();
                    list0 = this.zzKn.zzp(v);
                    if(list0.isEmpty()) {
                        this.zziG();
                        return;
                    }
                label_15:
                }
                while(list0.isEmpty());
            }
            catch(SQLiteException sQLiteException0) {
                this.zze("Failed to read hits from store", sQLiteException0);
                this.zziK();
                return;
            }
            zzab zzab0 = (zzab)list0.get(0);
            if(!this.zzKq.zzb(zzab0)) {
                this.zziG();
                return;
            }
            list0.remove(zzab0);
            try {
                this.zzKn.zzq(zzab0.zzjV());
                goto label_15;
            }
            catch(SQLiteException sQLiteException1) {
                this.zze("Failed to remove hit that was send for delivery", sQLiteException1);
                this.zziK();
            }
        }
    }

    protected boolean zziE() {
        long v2;
        Iterator iterator0;
        List list0;
        boolean z = true;
        zzns.zzhO();
        this.zzia();
        this.zzaT("Dispatching a batch of local hits");
        boolean z1 = !this.zzKq.isConnected() && !this.zzhR().zziW();
        if(this.zzKo.zzkg()) {
            z = false;
        }
        if(z1 && z) {
            this.zzaT("No network or service available. Will retry later");
            return false;
        }
        long v = (long)Math.max(this.zzhR().zzjh(), this.zzhR().zzji());
        ArrayList arrayList0 = new ArrayList();
        long v1 = 0L;
        while(true) {
            try {
                this.zzKn.beginTransaction();
                arrayList0.clear();
                try {
                    list0 = this.zzKn.zzp(v);
                    if(list0.isEmpty()) {
                        this.zzaT("Store is empty, nothing to dispatch");
                        this.zziK();
                        goto label_19;
                    }
                    goto label_26;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_29;
                }
            }
            catch(Throwable throwable0) {
                goto label_110;
            }
            try {
            label_19:
                this.zzKn.setTransactionSuccessful();
                this.zzKn.endTransaction();
            }
            catch(SQLiteException sQLiteException1) {
                this.zze("Failed to commit local dispatch transaction", sQLiteException1);
                this.zziK();
            }
            return false;
            try {
                try {
                label_26:
                    this.zza("Hits loaded from store. count", list0.size());
                    goto label_38;
                }
                catch(SQLiteException sQLiteException0) {
                }
            label_29:
                this.zzd("Failed to read hits from persisted store", sQLiteException0);
                this.zziK();
            }
            catch(Throwable throwable0) {
                goto label_110;
            }
            try {
                this.zzKn.setTransactionSuccessful();
                this.zzKn.endTransaction();
            }
            catch(SQLiteException sQLiteException2) {
                this.zze("Failed to commit local dispatch transaction", sQLiteException2);
                this.zziK();
            }
            return false;
            try {
            label_38:
                iterator0 = list0.iterator();
            label_39:
                if(iterator0.hasNext()) {
                    break;
                }
                if(this.zzKq.isConnected() && !this.zzhR().zziW()) {
                    this.zzaT("Service connected, sending hits to the service");
                    while(true) {
                        if(list0.isEmpty()) {
                            break;
                        }
                        zzab zzab0 = (zzab)list0.get(0);
                        if(!this.zzKq.zzb(zzab0)) {
                            v2 = v1;
                            goto label_65;
                        }
                        v1 = Math.max(v1, zzab0.zzjV());
                        list0.remove(zzab0);
                        this.zzb("Hit sent do device AnalyticsService for delivery", zzab0);
                        try {
                            this.zzKn.zzq(zzab0.zzjV());
                            arrayList0.add(zzab0.zzjV());
                            continue;
                        }
                        catch(SQLiteException sQLiteException3) {
                        }
                        this.zze("Failed to remove hit that was send for delivery", sQLiteException3);
                        this.zziK();
                        goto label_56;
                    }
                }
                goto label_64;
            }
            catch(Throwable throwable0) {
                goto label_110;
            }
            try {
            label_56:
                this.zzKn.setTransactionSuccessful();
                this.zzKn.endTransaction();
            }
            catch(SQLiteException sQLiteException4) {
                this.zze("Failed to commit local dispatch transaction", sQLiteException4);
                this.zziK();
            }
            return false;
            try {
            label_64:
                v2 = v1;
            label_65:
                if(this.zzKo.zzkg()) {
                    List list1 = this.zzKo.zzf(list0);
                    long v3 = v2;
                    for(Object object0: list1) {
                        v3 = Math.max(v3, ((long)(((Long)object0))));
                    }
                    list0.removeAll(list1);
                    try {
                        this.zzKn.zzd(list1);
                        arrayList0.addAll(list1);
                        v2 = v3;
                        goto label_88;
                    }
                    catch(SQLiteException sQLiteException5) {
                    }
                    this.zze("Failed to remove successfully uploaded hits", sQLiteException5);
                    this.zziK();
                    goto label_81;
                }
                goto label_88;
            }
            catch(Throwable throwable0) {
                goto label_110;
            }
            try {
            label_81:
                this.zzKn.setTransactionSuccessful();
                this.zzKn.endTransaction();
            }
            catch(SQLiteException sQLiteException6) {
                this.zze("Failed to commit local dispatch transaction", sQLiteException6);
                this.zziK();
            }
            return false;
            try {
            label_88:
                if(arrayList0.isEmpty()) {
                    goto label_89;
                }
                goto label_96;
            }
            catch(Throwable throwable0) {
                goto label_110;
            }
            try {
            label_89:
                this.zzKn.setTransactionSuccessful();
                this.zzKn.endTransaction();
            }
            catch(SQLiteException sQLiteException7) {
                this.zze("Failed to commit local dispatch transaction", sQLiteException7);
                this.zziK();
            }
            return false;
            try {
            label_96:
                this.zzKn.setTransactionSuccessful();
                this.zzKn.endTransaction();
                v1 = v2;
            }
            catch(SQLiteException sQLiteException8) {
                this.zze("Failed to commit local dispatch transaction", sQLiteException8);
                this.zziK();
                return false;
            }
        }
        try {
            Object object1 = iterator0.next();
            if(((zzab)object1).zzjV() != v1) {
                goto label_39;
            }
            this.zzd("Database contains successfully uploaded hit", v1, list0.size());
            this.zziK();
        }
        catch(Throwable throwable0) {
            try {
            label_110:
                this.zzKn.setTransactionSuccessful();
                this.zzKn.endTransaction();
            }
            catch(SQLiteException sQLiteException9) {
                this.zze("Failed to commit local dispatch transaction", sQLiteException9);
                this.zziK();
                return false;
            }
            throw throwable0;
        }
        try {
            this.zzKn.setTransactionSuccessful();
            this.zzKn.endTransaction();
        }
        catch(SQLiteException sQLiteException10) {
            this.zze("Failed to commit local dispatch transaction", sQLiteException10);
            this.zziK();
        }
        return false;
    }

    public void zziF() {
        zzns.zzhO();
        this.zzia();
        this.zzaU("Sync dispatching local hits");
        long v = this.zzKv;
        if(!this.zzhR().zziW()) {
            this.zziC();
        }
        try {
            while(true) {
                if(!this.zziE()) {
                    this.zzhU().zzkn();
                    this.zziG();
                    if(this.zzKv != v) {
                        this.zzKp.zzkf();
                    }
                    return;
                }
            }
        }
        catch(Throwable throwable0) {
            this.zze("Sync local dispatch failed", throwable0);
            this.zziG();
        }
    }

    // 检测为 lambda 实现。
    public void zziG() {
        boolean z;
        this.zzhM().zzhO();
        this.zzia();
        if(!this.zziH()) {
            this.zzKp.unregister();
            this.zziK();
            return;
        }
        if(this.zzKn.isEmpty()) {
            this.zzKp.unregister();
            this.zziK();
            return;
        }
        if(((Boolean)zzy.zzLI.get()).booleanValue()) {
            z = true;
        }
        else {
            this.zzKp.zzkd();
            z = this.zzKp.isConnected();
        }
        if(z) {
            this.zziJ();
            return;
        }
        this.zziK();
        this.zziI();
    }

    // 去混淆评级： 低(40)
    private boolean zziH() {
        return this.zzKw ? false : (!this.zzhR().zziW() || this.zzhR().zziX()) && this.zziN() > 0L;
    }

    private void zziI() {
        zzv zzv0 = this.zzhT();
        if(zzv0.zzjG() && !zzv0.zzbp()) {
            long v = this.zzit();
            if(v != 0L && Math.abs(this.zzhP().currentTimeMillis() - v) <= this.zzhR().zzjg()) {
                this.zza("Dispatch alarm scheduled (ms)", this.zzhR().zzjf());
                zzv0.zzjH();
            }
        }
    }

    private void zziJ() {
        long v2;
        this.zziI();
        long v = this.zziN();
        long v1 = this.zzhU().zzkm();
        if(v1 == 0L) {
            v2 = Math.min(this.zzhR().zzjd(), v);
        }
        else {
            v2 = v - Math.abs(this.zzhP().currentTimeMillis() - v1);
            if(v2 <= 0L) {
                v2 = Math.min(this.zzhR().zzjd(), v);
            }
        }
        this.zza("Dispatch scheduled (ms)", v2);
        if(this.zzKs.zzbp()) {
            long v3 = Math.max(1L, v2 + this.zzKs.zzjD());
            this.zzKs.zzu(v3);
            return;
        }
        this.zzKs.zzt(v2);
    }

    private void zziK() {
        this.zziL();
        this.zziM();
    }

    private void zziL() {
        if(this.zzKs.zzbp()) {
            this.zzaT("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzKs.cancel();
    }

    private void zziM() {
        zzv zzv0 = this.zzhT();
        if(zzv0.zzbp()) {
            zzv0.cancel();
        }
    }

    public long zziN() {
        if(this.zzKr != 0x8000000000000000L) {
            return this.zzKr;
        }
        long v = this.zzhR().zzje();
        return this.zzhm().zzjQ() ? ((long)this.zzhm().zzkH()) * 1000L : v;
    }

    public void zziO() {
        this.zzia();
        this.zzhO();
        this.zzKw = true;
        this.zzKq.disconnect();
        this.zziG();
    }

    public long zzit() {
        zzns.zzhO();
        this.zzia();
        try {
            return this.zzKn.zzit();
        }
        catch(SQLiteException sQLiteException0) {
            this.zze("Failed to get min/max hit times from local store", sQLiteException0);
            return 0L;
        }
    }

    private void zziy() {
        Context context0 = this.zzhM().getContext();
        if(!AnalyticsReceiver.zzT(context0)) {
            this.zzaW("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        }
        else if(!AnalyticsService.zzU(context0)) {
            this.zzaX("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if(!CampaignTrackingReceiver.zzT(context0)) {
            this.zzaW("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
            return;
        }
        if(!CampaignTrackingService.zzU(context0)) {
            this.zzaW("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
    }

    // 检测为 lambda 实现。
    protected void zziz() {
        this.zzia();
        this.zzhU().zzkk();
        if(!this.zzba("android.permission.ACCESS_NETWORK_STATE")) {
            this.zzaX("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            this.zziO();
        }
        if(!this.zzba("android.permission.INTERNET")) {
            this.zzaX("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            this.zziO();
        }
        if(AnalyticsService.zzU(this.getContext())) {
            this.zzaT("AnalyticsService registered in the app manifest and enabled");
        }
        else if(this.zzhR().zziW()) {
            this.zzaX("Device AnalyticsService not registered! Hits will not be delivered reliably.");
        }
        else {
            this.zzaW("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if(!this.zzKw && !this.zzhR().zziW() && !this.zzKn.isEmpty()) {
            this.zziC();
        }
        this.zziG();
    }

    public void zzs(long v) {
        zzns.zzhO();
        this.zzia();
        if(v < 0L) {
            v = 0L;
        }
        this.zzKr = v;
        this.zziG();
    }
}

