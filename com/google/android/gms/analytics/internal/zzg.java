package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzns;

public class zzg {
    private final Context zzJR;
    private final Context zzqw;

    public zzg(Context context0) {
        zzu.zzu(context0);
        Context context1 = context0.getApplicationContext();
        zzu.zzb(context1, "Application context can\'t be null");
        this.zzqw = context1;
        this.zzJR = context1;
    }

    public Context getApplicationContext() {
        return this.zzqw;
    }

    protected zzns zzW(Context context0) {
        return zzns.zzaB(context0);
    }

    protected com.google.android.gms.analytics.internal.zzu zza(zzf zzf0) {
        return new com.google.android.gms.analytics.internal.zzu(zzf0);
    }

    protected zzk zzb(zzf zzf0) {
        return new zzk(zzf0);
    }

    protected zza zzc(zzf zzf0) {
        return new zza(zzf0);
    }

    protected zzn zzd(zzf zzf0) {
        return new zzn(zzf0);
    }

    protected zzan zze(zzf zzf0) {
        return new zzan(zzf0);
    }

    protected zzaf zzf(zzf zzf0) {
        return new zzaf(zzf0);
    }

    protected zzr zzg(zzf zzf0) {
        return new zzr(zzf0);
    }

    protected zzlb zzh(zzf zzf0) {
        return zzld.zzoQ();
    }

    protected GoogleAnalytics zzi(zzf zzf0) {
        return new GoogleAnalytics(zzf0);
    }

    public Context zzic() {
        return this.zzJR;
    }

    zzl zzj(zzf zzf0) {
        return new zzl(zzf0, this);
    }

    zzag zzk(zzf zzf0) {
        return new zzag(zzf0);
    }

    protected zzb zzl(zzf zzf0) {
        return new zzb(zzf0, this);
    }

    public zzj zzm(zzf zzf0) {
        return new zzj(zzf0);
    }

    public zzah zzn(zzf zzf0) {
        return new zzah(zzf0);
    }

    public zzi zzo(zzf zzf0) {
        return new zzi(zzf0);
    }

    public zzv zzp(zzf zzf0) {
        return new zzv(zzf0);
    }

    public zzai zzq(zzf zzf0) {
        return new zzai(zzf0);
    }
}

