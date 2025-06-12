package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzns;

public class zzc {
    private final zzf zzJy;

    protected zzc(zzf zzf0) {
        zzu.zzu(zzf0);
        this.zzJy = zzf0;
    }

    protected Context getContext() {
        return this.zzJy.getContext();
    }

    private void zza(int v, String s, Object object0, Object object1, Object object2) {
        zzaf zzaf0 = this.zzJy == null ? null : this.zzJy.zzid();
        if(zzaf0 != null) {
            zzaf0.zza(v, s, object0, object1, object2);
            return;
        }
        if(Log.isLoggable("GAv4", v)) {
            Log.println(v, "GAv4", zzc.zzc(s, object0, object1, object2));
        }
    }

    public void zza(String s, Object object0) {
        this.zza(2, s, object0, null, null);
    }

    public void zza(String s, Object object0, Object object1) {
        this.zza(2, s, object0, object1, null);
    }

    public void zza(String s, Object object0, Object object1, Object object2) {
        this.zza(3, s, object0, object1, object2);
    }

    public void zzaT(String s) {
        this.zza(2, s, null, null, null);
    }

    public void zzaU(String s) {
        this.zza(3, s, null, null, null);
    }

    public void zzaV(String s) {
        this.zza(4, s, null, null, null);
    }

    public void zzaW(String s) {
        this.zza(5, s, null, null, null);
    }

    public void zzaX(String s) {
        this.zza(6, s, null, null, null);
    }

    public void zzb(String s, Object object0) {
        this.zza(3, s, object0, null, null);
    }

    public void zzb(String s, Object object0, Object object1) {
        this.zza(3, s, object0, object1, null);
    }

    public void zzb(String s, Object object0, Object object1, Object object2) {
        this.zza(5, s, object0, object1, object2);
    }

    protected static String zzc(String s, Object object0, Object object1, Object object2) {
        if(s == null) {
            s = "";
        }
        String s1 = zzc.zzi(object0);
        String s2 = zzc.zzi(object1);
        String s3 = zzc.zzi(object2);
        StringBuilder stringBuilder0 = new StringBuilder();
        String s4 = "";
        if(!TextUtils.isEmpty(s)) {
            stringBuilder0.append(s);
            s4 = ": ";
        }
        if(!TextUtils.isEmpty(s1)) {
            stringBuilder0.append(s4);
            stringBuilder0.append(s1);
            s4 = ", ";
        }
        if(!TextUtils.isEmpty(s2)) {
            stringBuilder0.append(s4);
            stringBuilder0.append(s2);
            s4 = ", ";
        }
        if(!TextUtils.isEmpty(s3)) {
            stringBuilder0.append(s4);
            stringBuilder0.append(s3);
        }
        return stringBuilder0.toString();
    }

    public void zzc(String s, Object object0) {
        this.zza(4, s, object0, null, null);
    }

    public void zzc(String s, Object object0, Object object1) {
        this.zza(5, s, object0, object1, null);
    }

    public void zzd(String s, Object object0) {
        this.zza(5, s, object0, null, null);
    }

    public void zzd(String s, Object object0, Object object1) {
        this.zza(6, s, object0, object1, null);
    }

    public void zze(String s, Object object0) {
        this.zza(6, s, object0, null, null);
    }

    public zzf zzhM() {
        return this.zzJy;
    }

    // 去混淆评级： 低(30)
    protected void zzhN() {
    }

    protected void zzhO() {
        this.zzJy.zzhO();
    }

    protected zzlb zzhP() {
        return this.zzJy.zzhP();
    }

    protected zzaf zzhQ() {
        return this.zzJy.zzhQ();
    }

    protected zzr zzhR() {
        return this.zzJy.zzhR();
    }

    protected zzns zzhS() {
        return this.zzJy.zzhS();
    }

    protected zzv zzhT() {
        return this.zzJy.zzhT();
    }

    protected zzai zzhU() {
        return this.zzJy.zzhU();
    }

    protected zzn zzhV() {
        return this.zzJy.zzih();
    }

    protected zza zzhW() {
        return this.zzJy.zzig();
    }

    protected zzk zzhX() {
        return this.zzJy.zzhX();
    }

    protected com.google.android.gms.analytics.internal.zzu zzhY() {
        return this.zzJy.zzhY();
    }

    // 去混淆评级： 低(20)
    public boolean zzhZ() {
        return Log.isLoggable("GAv4", 2);
    }

    public GoogleAnalytics zzhg() {
        return this.zzJy.zzie();
    }

    protected zzb zzhl() {
        return this.zzJy.zzhl();
    }

    protected zzan zzhm() {
        return this.zzJy.zzhm();
    }

    private static String zzi(Object object0) {
        if(object0 == null) {
            return "";
        }
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof Boolean) {
            return object0 == Boolean.TRUE ? "true" : "false";
        }
        return object0 instanceof Throwable ? ((Throwable)object0).toString() : object0.toString();
    }
}

