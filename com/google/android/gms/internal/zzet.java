package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import org.json.JSONObject;

@zzgd
public class zzet extends zzeu {
    private final Context mContext;
    private final zzid zzoA;
    private final WindowManager zzqF;
    private final zzbq zzyT;
    DisplayMetrics zzyU;
    private float zzyV;
    int zzyW;
    int zzyX;
    private int zzyY;
    int zzyZ;
    int zzza;
    int zzzb;
    int zzzc;

    public zzet(zzid zzid0, Context context0, zzbq zzbq0) {
        super(zzid0);
        this.zzyW = -1;
        this.zzyX = -1;
        this.zzyZ = -1;
        this.zzza = -1;
        this.zzzb = -1;
        this.zzzc = -1;
        this.zzoA = zzid0;
        this.mContext = context0;
        this.zzyT = zzbq0;
        this.zzqF = (WindowManager)context0.getSystemService("window");
    }

    public void zze(int v, int v1) {
        this.zzc(v, v1 - (this.mContext instanceof Activity ? zzo.zzbv().zzj(((Activity)this.mContext))[0] : 0), this.zzzb, this.zzzc);
        this.zzoA.zzgF().zzd(v, v1);
    }

    private void zzeh() {
        this.zzyU = new DisplayMetrics();
        Display display0 = this.zzqF.getDefaultDisplay();
        display0.getMetrics(this.zzyU);
        this.zzyV = this.zzyU.density;
        this.zzyY = display0.getRotation();
    }

    void zzei() {
        this.zzyW = zzk.zzcA().zzb(this.zzyU, this.zzyU.widthPixels);
        this.zzyX = zzk.zzcA().zzb(this.zzyU, this.zzyU.heightPixels);
        Activity activity0 = this.zzoA.zzgB();
        if(activity0 == null || activity0.getWindow() == null) {
            this.zzyZ = this.zzyW;
            this.zzza = this.zzyX;
            return;
        }
        int[] arr_v = zzo.zzbv().zzg(activity0);
        this.zzyZ = zzk.zzcA().zzb(this.zzyU, arr_v[0]);
        this.zzza = zzk.zzcA().zzb(this.zzyU, arr_v[1]);
    }

    void zzej() {
        if(this.zzoA.zzaN().zzsn) {
            this.zzzb = this.zzyW;
            this.zzzc = this.zzyX;
            return;
        }
        this.zzoA.measure(0, 0);
        zza zza0 = zzk.zzcA();
        int v = this.zzoA.getMeasuredWidth();
        this.zzzb = zza0.zzc(this.mContext, v);
        zza zza1 = zzk.zzcA();
        int v1 = this.zzoA.getMeasuredHeight();
        this.zzzc = zza1.zzc(this.mContext, v1);
    }

    public void zzek() {
        this.zzeh();
        this.zzei();
        this.zzej();
        this.zzen();
        this.zzeo();
        this.zzem();
        this.zzel();
    }

    void zzel() {
        if(zzb.zzL(2)) {
            zzb.zzaA("Dispatching Ready Event.");
        }
        this.zzaf(this.zzoA.zzgI().zzGG);
    }

    private void zzem() {
        int[] arr_v = new int[2];
        this.zzoA.getLocationOnScreen(arr_v);
        this.zze(zzk.zzcA().zzc(this.mContext, arr_v[0]), zzk.zzcA().zzc(this.mContext, arr_v[1]));
    }

    void zzen() {
        this.zza(this.zzyW, this.zzyX, this.zzyZ, this.zzza, this.zzyV, this.zzyY);
    }

    void zzeo() {
        JSONObject jSONObject0 = this.zzep().toJson();
        this.zzoA.zzb("onDeviceFeaturesReceived", jSONObject0);
    }

    private zzes zzep() {
        return new com.google.android.gms.internal.zzes.zza().zzp(this.zzyT.zzcQ()).zzo(this.zzyT.zzcR()).zzq(this.zzyT.zzcV()).zzr(this.zzyT.zzcS()).zzs(true).zzeg();
    }
}

