package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzfe.zza;
import com.google.android.gms.internal.zzgd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

@zzgd
public class zzd extends zza {
    private Context mContext;
    private String zzAK;
    private ArrayList zzAL;
    private String zzqr;

    public zzd(String s, ArrayList arrayList0, Context context0, String s1) {
        this.zzAK = s;
        this.zzAL = arrayList0;
        this.zzqr = s1;
        this.mContext = context0;
    }

    @Override  // com.google.android.gms.internal.zzfe
    public String getProductId() {
        return this.zzAK;
    }

    @Override  // com.google.android.gms.internal.zzfe
    public void recordPlayBillingResolution(int billingResponseCode) {
        if(billingResponseCode == 0) {
            this.zzff();
        }
        HashMap hashMap0 = new HashMap();
        hashMap0.put("google_play_status", String.valueOf(billingResponseCode));
        hashMap0.put("sku", this.zzAK);
        hashMap0.put("status", String.valueOf(this.zzy(billingResponseCode)));
        LinkedList linkedList0 = new LinkedList();
        for(Object object0: this.zzAL) {
            linkedList0.add(this.zza(((String)object0), hashMap0));
        }
        zzo.zzbv().zza(this.mContext, this.zzqr, linkedList0);
    }

    @Override  // com.google.android.gms.internal.zzfe
    public void recordResolution(int resolution) {
        if(resolution == 1) {
            this.zzff();
        }
        HashMap hashMap0 = new HashMap();
        hashMap0.put("status", String.valueOf(resolution));
        hashMap0.put("sku", this.zzAK);
        LinkedList linkedList0 = new LinkedList();
        for(Object object0: this.zzAL) {
            linkedList0.add(this.zza(((String)object0), hashMap0));
        }
        zzo.zzbv().zza(this.mContext, this.zzqr, linkedList0);
    }

    protected String zza(String s, HashMap hashMap0) {
        String s1;
        try {
            s1 = this.mContext.getPackageManager().getPackageInfo("org.dyndns.vivi.SkskShogi", 0).versionName;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            zzb.zzd("Error to retrieve app version", packageManager$NameNotFoundException0);
            s1 = "";
        }
        long v = zzo.zzby().zzfX().zzgg();
        long v1 = SystemClock.elapsedRealtime();
        for(Object object0: hashMap0.keySet()) {
            Object[] arr_object = {hashMap0.get(((String)object0))};
            s = s.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", ((String)object0)), String.format("$1%s$2", arr_object));
        }
        return s.replaceAll("(?<!@)((?:@@)*)@sessionid(?<!@)((?:@@)*)@", String.format("$1%s$2", zzo.zzby().getSessionId())).replaceAll("(?<!@)((?:@@)*)@appid(?<!@)((?:@@)*)@", "$1org.dyndns.vivi.SkskShogi$2").replaceAll("(?<!@)((?:@@)*)@osversion(?<!@)((?:@@)*)@", "$133$2").replaceAll("(?<!@)((?:@@)*)@sdkversion(?<!@)((?:@@)*)@", String.format("$1%s$2", this.zzqr)).replaceAll("(?<!@)((?:@@)*)@appversion(?<!@)((?:@@)*)@", String.format("$1%s$2", s1)).replaceAll("(?<!@)((?:@@)*)@timestamp(?<!@)((?:@@)*)@", String.format("$1%s$2", String.valueOf(v1 - v))).replaceAll("(?<!@)((?:@@)*)@[^@]+(?<!@)((?:@@)*)@", "$1$2").replaceAll("@@", "@");
    }

    void zzff() {
        try {
            this.mContext.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", Context.class, String.class, String.class, Boolean.TYPE).invoke(null, this.mContext, this.zzAK, "", Boolean.TRUE);
        }
        catch(ClassNotFoundException unused_ex) {
            zzb.zzaC("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        }
        catch(NoSuchMethodException unused_ex) {
            zzb.zzaC("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        }
        catch(Exception exception0) {
            zzb.zzd("Fail to report a conversion.", exception0);
        }
    }

    protected int zzy(int v) {
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                return 2;
            }
            case 4: {
                return 3;
            }
            default: {
                return 0;
            }
        }
    }
}

