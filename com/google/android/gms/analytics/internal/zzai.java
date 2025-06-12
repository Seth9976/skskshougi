package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.zzu;
import java.util.UUID;

public class zzai extends zzd {
    public final class zza {
        private final String mName;
        private final long zzMA;
        final zzai zzMB;

        private zza(String s, long v) {
            zzu.zzcj(s);
            zzu.zzV(v > 0L);
            this.mName = s;
            this.zzMA = v;
        }

        zza(String s, long v, com.google.android.gms.analytics.internal.zzai.1 zzai$10) {
            this(s, v);
        }

        public void zzbg(String s) {
            if(this.zzkt() == 0L) {
                this.zzkq();
            }
            if(s == null) {
                s = "";
            }
            synchronized(this) {
                long v1 = zzai.this.zzMw.getLong(this.zzkv(), 0L);
                if(v1 <= 0L) {
                    SharedPreferences.Editor sharedPreferences$Editor0 = zzai.this.zzMw.edit();
                    sharedPreferences$Editor0.putString(this.zzkw(), s);
                    sharedPreferences$Editor0.putLong(this.zzkv(), 1L);
                    sharedPreferences$Editor0.apply();
                    return;
                }
                boolean z = (UUID.randomUUID().getLeastSignificantBits() & 0x7FFFFFFFFFFFFFFFL) < 0x7FFFFFFFFFFFFFFFL / (v1 + 1L);
                SharedPreferences.Editor sharedPreferences$Editor1 = zzai.this.zzMw.edit();
                if(z) {
                    sharedPreferences$Editor1.putString(this.zzkw(), s);
                }
                sharedPreferences$Editor1.putLong(this.zzkv(), v1 + 1L);
                sharedPreferences$Editor1.apply();
            }
        }

        private void zzkq() {
            long v = zzai.this.zzhP().currentTimeMillis();
            SharedPreferences.Editor sharedPreferences$Editor0 = zzai.this.zzMw.edit();
            sharedPreferences$Editor0.remove(this.zzkv());
            sharedPreferences$Editor0.remove(this.zzkw());
            sharedPreferences$Editor0.putLong(this.zzku(), v);
            sharedPreferences$Editor0.commit();
        }

        private long zzkr() {
            long v = this.zzkt();
            return v == 0L ? 0L : Math.abs(v - zzai.this.zzhP().currentTimeMillis());
        }

        public Pair zzks() {
            long v = this.zzkr();
            if(v < this.zzMA) {
                return null;
            }
            if(v > this.zzMA * 2L) {
                this.zzkq();
                return null;
            }
            String s = zzai.this.zzMw.getString(this.zzkw(), null);
            long v1 = zzai.this.zzMw.getLong(this.zzkv(), 0L);
            this.zzkq();
            return s == null || v1 <= 0L ? null : new Pair(s, v1);
        }

        private long zzkt() {
            return zzai.this.zzMw.getLong(this.zzku(), 0L);
        }

        private String zzku() {
            return this.mName + ":start";
        }

        private String zzkv() {
            return this.mName + ":count";
        }

        protected String zzkw() {
            return this.mName + ":value";
        }
    }

    private SharedPreferences zzMw;
    private long zzMx;
    private long zzMy;
    private final zza zzMz;

    protected zzai(zzf zzf0) {
        super(zzf0);
        this.zzMy = -1L;
        this.zzMz = new zza(this, "monitoring", this.zzhR().zzjC(), null);
    }

    public void zzbf(String s) {
        this.zzhO();
        this.zzia();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzMw.edit();
        if(TextUtils.isEmpty(s)) {
            sharedPreferences$Editor0.remove("installation_campaign");
        }
        else {
            sharedPreferences$Editor0.putString("installation_campaign", s);
        }
        if(!sharedPreferences$Editor0.commit()) {
            this.zzaW("Failed to commit campaign data");
        }
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
        this.zzMw = this.getContext().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public long zzkk() {
        this.zzhO();
        this.zzia();
        if(this.zzMx == 0L) {
            long v = this.zzMw.getLong("first_run", 0L);
            if(v != 0L) {
                this.zzMx = v;
                return this.zzMx;
            }
            long v1 = this.zzhP().currentTimeMillis();
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzMw.edit();
            sharedPreferences$Editor0.putLong("first_run", v1);
            if(!sharedPreferences$Editor0.commit()) {
                this.zzaW("Failed to commit first run time");
            }
            this.zzMx = v1;
            return this.zzMx;
        }
        return this.zzMx;
    }

    public zzaj zzkl() {
        return new zzaj(this.zzhP(), this.zzkk());
    }

    public long zzkm() {
        this.zzhO();
        this.zzia();
        if(this.zzMy == -1L) {
            this.zzMy = this.zzMw.getLong("last_dispatch", 0L);
        }
        return this.zzMy;
    }

    public void zzkn() {
        this.zzhO();
        this.zzia();
        long v = this.zzhP().currentTimeMillis();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zzMw.edit();
        sharedPreferences$Editor0.putLong("last_dispatch", v);
        sharedPreferences$Editor0.apply();
        this.zzMy = v;
    }

    public String zzko() {
        this.zzhO();
        this.zzia();
        String s = this.zzMw.getString("installation_campaign", null);
        return TextUtils.isEmpty(s) ? null : s;
    }

    public zza zzkp() {
        return this.zzMz;
    }

    class com.google.android.gms.analytics.internal.zzai.1 {
    }

}

