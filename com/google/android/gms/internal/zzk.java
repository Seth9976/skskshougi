package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Map;

public abstract class zzk implements Comparable {
    public static enum zza {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE;

    }

    private final com.google.android.gms.internal.zzs.zza zzD;
    private final int zzE;
    private final String zzF;
    private final int zzG;
    private final com.google.android.gms.internal.zzm.zza zzH;
    private Integer zzI;
    private zzl zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private long zzN;
    private zzo zzO;
    private com.google.android.gms.internal.zzb.zza zzP;

    public zzk(int v, String s, com.google.android.gms.internal.zzm.zza zzm$zza0) {
        this.zzD = com.google.android.gms.internal.zzs.zza.zzak ? new com.google.android.gms.internal.zzs.zza() : null;
        this.zzK = true;
        this.zzL = false;
        this.zzM = false;
        this.zzN = 0L;
        this.zzP = null;
        this.zzE = v;
        this.zzF = s;
        this.zzH = zzm$zza0;
        this.zza(new zzd());
        this.zzG = zzk.zzb(s);
    }

    @Override
    public int compareTo(Object x0) {
        return this.zzc(((zzk)x0));
    }

    public Map getHeaders() throws com.google.android.gms.internal.zza {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.zzE;
    }

    public String getUrl() {
        return this.zzF;
    }

    public boolean isCanceled() {
        return this.zzL;
    }

    @Override
    public String toString() {
        String s = "0x" + Integer.toHexString(this.zzg());
        StringBuilder stringBuilder0 = new StringBuilder();
        return this.zzL ? stringBuilder0.append("[X] ").append(this.getUrl()).append(" ").append(s).append(" ").append(this.zzs()).append(" ").append(this.zzI).toString() : stringBuilder0.append("[ ] ").append(this.getUrl()).append(" ").append(s).append(" ").append(this.zzs()).append(" ").append(this.zzI).toString();
    }

    private byte[] zza(Map map0, String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            for(Object object0: map0.entrySet()) {
                stringBuilder0.append(URLEncoder.encode(((String)((Map.Entry)object0).getKey()), s));
                stringBuilder0.append('=');
                stringBuilder0.append(URLEncoder.encode(((String)((Map.Entry)object0).getValue()), s));
                stringBuilder0.append('&');
            }
            return stringBuilder0.toString().getBytes(s);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("Encoding not supported: " + s, unsupportedEncodingException0);
        }
    }

    public final zzk zza(int v) {
        this.zzI = v;
        return this;
    }

    public zzk zza(com.google.android.gms.internal.zzb.zza zzb$zza0) {
        this.zzP = zzb$zza0;
        return this;
    }

    public zzk zza(zzl zzl0) {
        this.zzJ = zzl0;
        return this;
    }

    public zzk zza(zzo zzo0) {
        this.zzO = zzo0;
        return this;
    }

    protected abstract zzm zza(zzi arg1);

    protected abstract void zza(Object arg1);

    private static int zzb(String s) {
        if(!TextUtils.isEmpty(s)) {
            Uri uri0 = Uri.parse(s);
            if(uri0 != null) {
                String s1 = uri0.getHost();
                return s1 == null ? 0 : s1.hashCode();
            }
        }
        return 0;
    }

    protected zzr zzb(zzr zzr0) [...] // Inlined contents

    public int zzc(zzk zzk0) {
        zza zzk$zza0 = this.zzs();
        zza zzk$zza1 = zzk0.zzs();
        return zzk$zza0 == zzk$zza1 ? ((int)this.zzI) - ((int)zzk0.zzI) : zzk$zza1.ordinal() - zzk$zza0.ordinal();
    }

    public void zzc(zzr zzr0) {
        if(this.zzH != null) {
            this.zzH.zze(zzr0);
        }
    }

    public void zzc(String s) {
        if(com.google.android.gms.internal.zzs.zza.zzak) {
            this.zzD.zza(s, Thread.currentThread().getId());
            return;
        }
        if(this.zzN == 0L) {
            this.zzN = SystemClock.elapsedRealtime();
        }
    }

    void zzd(String s) {
        if(this.zzJ != null) {
            this.zzJ.zzf(this);
        }
        if(com.google.android.gms.internal.zzs.zza.zzak) {
            long v = Thread.currentThread().getId();
            if(Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        zzk.this.zzD.zza(s, v);
                        zzk.this.zzD.zzd(this.toString());
                    }
                });
                return;
            }
            this.zzD.zza(s, v);
            this.zzD.zzd(this.toString());
            return;
        }
        long v1 = SystemClock.elapsedRealtime() - this.zzN;
        if(v1 >= 3000L) {
            zzs.zzb("%d ms: %s", new Object[]{v1, this.toString()});
        }
    }

    public int zzg() {
        return this.zzG;
    }

    public String zzh() {
        return this.getUrl();
    }

    public com.google.android.gms.internal.zzb.zza zzi() {
        return this.zzP;
    }

    @Deprecated
    protected Map zzj() throws com.google.android.gms.internal.zza {
        return null;
    }

    @Deprecated
    protected String zzk() {
        return "UTF-8";
    }

    @Deprecated
    public String zzl() {
        return this.zzp();
    }

    @Deprecated
    public byte[] zzm() throws com.google.android.gms.internal.zza {
        Map map0 = this.zzj();
        return map0 == null || map0.size() <= 0 ? null : this.zza(map0, this.zzk());
    }

    protected Map zzn() throws com.google.android.gms.internal.zza [...] // Inlined contents

    protected String zzo() [...] // Inlined contents

    // 去混淆评级： 低(20)
    public String zzp() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public byte[] zzq() throws com.google.android.gms.internal.zza {
        return null;
    }

    public final boolean zzr() {
        return this.zzK;
    }

    public zza zzs() {
        return zza.zzU;
    }

    public final int zzt() {
        return this.zzO.zzd();
    }

    public zzo zzu() {
        return this.zzO;
    }

    public void zzv() {
        this.zzM = true;
    }

    public boolean zzw() {
        return this.zzM;
    }
}

