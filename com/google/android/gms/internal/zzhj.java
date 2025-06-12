package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.concurrent.Future;

@zzgd
public final class zzhj {
    static abstract class zza extends zzhh {
        private zza() {
        }

        zza(com.google.android.gms.internal.zzhj.1 zzhj$10) {
        }

        @Override  // com.google.android.gms.internal.zzhh
        public void onStop() {
        }
    }

    public interface zzb {
        void zzc(Bundle arg1);
    }

    public static Future zza(Context context0, int v) {
        return new zza(context0, v) {
            final int zzGd;
            final Context zzqV;

            {
                this.zzqV = context0;
                this.zzGd = v;
                super(null);
            }

            @Override  // com.google.android.gms.internal.zzhh
            public void zzdP() {
                SharedPreferences.Editor sharedPreferences$Editor0 = zzhj.zzv(this.zzqV).edit();
                sharedPreferences$Editor0.putInt("webview_cache_version", this.zzGd);
                sharedPreferences$Editor0.commit();
            }
        }.zzgi();
    }

    public static Future zza(Context context0, zzb zzhj$zzb0) {
        return new zza(context0, zzhj$zzb0) {
            final zzb zzGc;
            final Context zzqV;

            {
                this.zzqV = context0;
                this.zzGc = zzhj$zzb0;
                super(null);
            }

            @Override  // com.google.android.gms.internal.zzhh
            public void zzdP() {
                SharedPreferences sharedPreferences0 = zzhj.zzv(this.zzqV);
                Bundle bundle0 = new Bundle();
                bundle0.putBoolean("use_https", sharedPreferences0.getBoolean("use_https", true));
                if(this.zzGc != null) {
                    this.zzGc.zzc(bundle0);
                }
            }
        }.zzgi();
    }

    public static Future zza(Context context0, boolean z) {
        return new zza(context0, z) {
            final boolean zzGb;
            final Context zzqV;

            {
                this.zzqV = context0;
                this.zzGb = z;
                super(null);
            }

            @Override  // com.google.android.gms.internal.zzhh
            public void zzdP() {
                SharedPreferences.Editor sharedPreferences$Editor0 = zzhj.zzv(this.zzqV).edit();
                sharedPreferences$Editor0.putBoolean("use_https", this.zzGb);
                sharedPreferences$Editor0.commit();
            }
        }.zzgi();
    }

    public static Future zzb(Context context0, zzb zzhj$zzb0) {
        return new zza(context0, zzhj$zzb0) {
            final zzb zzGc;
            final Context zzqV;

            {
                this.zzqV = context0;
                this.zzGc = zzhj$zzb0;
                super(null);
            }

            @Override  // com.google.android.gms.internal.zzhh
            public void zzdP() {
                SharedPreferences sharedPreferences0 = zzhj.zzv(this.zzqV);
                Bundle bundle0 = new Bundle();
                bundle0.putInt("webview_cache_version", sharedPreferences0.getInt("webview_cache_version", 0));
                if(this.zzGc != null) {
                    this.zzGc.zzc(bundle0);
                }
            }
        }.zzgi();
    }

    private static SharedPreferences zzv(Context context0) {
        return context0.getSharedPreferences("admob", 0);
    }
}

