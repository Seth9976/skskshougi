package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbk;
import com.google.android.gms.internal.zzdy;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzhl;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzb extends zzhh implements zza {
    @zzgd
    static final class com.google.android.gms.ads.internal.request.zzb.zza extends Exception {
        private final int zzBv;

        public com.google.android.gms.ads.internal.request.zzb.zza(String s, int v) {
            super(s);
            this.zzBv = v;
        }

        public int getErrorCode() {
            return this.zzBv;
        }
    }

    private final Context mContext;
    private final Object zzBr;
    AdResponseParcel zzBt;
    private final com.google.android.gms.ads.internal.request.zza.zza zzCd;
    private final com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza zzCe;
    zzhh zzCf;
    Object zzqt;
    private final zzan zzvA;
    zzdy zzxn;

    public zzb(Context context0, com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza adRequestInfoParcel$zza0, zzan zzan0, com.google.android.gms.ads.internal.request.zza.zza zza$zza0) {
        this.zzBr = new Object();
        this.zzqt = new Object();
        this.zzCd = zza$zza0;
        this.mContext = context0;
        this.zzCe = adRequestInfoParcel$zza0;
        this.zzvA = zzan0;
    }

    // 检测为 lambda 实现。
    @Override  // com.google.android.gms.internal.zzhh
    public void onStop() {
        synchronized(this.zzBr) {
            if(this.zzCf != null) {
                this.zzCf.cancel();
            }
        }
    }

    zzhh zzb(AdRequestInfoParcel adRequestInfoParcel0) {
        return zzc.zza(this.mContext, adRequestInfoParcel0, this);
    }

    @Override  // com.google.android.gms.ads.internal.request.zzc$zza
    public void zzb(AdResponseParcel adResponseParcel0) {
        synchronized(this.zzqt) {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Received ad response.");
            this.zzBt = adResponseParcel0;
            this.zzqt.notify();
        }
    }

    protected AdSizeParcel zzc(AdRequestInfoParcel adRequestInfoParcel0) throws com.google.android.gms.ads.internal.request.zzb.zza {
        AdSizeParcel[] arr_adSizeParcel;
        if(this.zzBt.zzCN == null) {
            throw new com.google.android.gms.ads.internal.request.zzb.zza("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] arr_s = this.zzBt.zzCN.split("x");
        if(arr_s.length != 2) {
            throw new com.google.android.gms.ads.internal.request.zzb.zza("Invalid ad size format from the ad response: " + this.zzBt.zzCN, 0);
        }
        try {
            int v = Integer.parseInt(arr_s[0]);
            int v1 = Integer.parseInt(arr_s[1]);
            arr_adSizeParcel = adRequestInfoParcel0.zzpN.zzso;
        }
        catch(NumberFormatException unused_ex) {
            throw new com.google.android.gms.ads.internal.request.zzb.zza("Invalid ad size number from the ad response: " + this.zzBt.zzCN, 0);
        }
        for(int v2 = 0; v2 < arr_adSizeParcel.length; ++v2) {
            AdSizeParcel adSizeParcel0 = arr_adSizeParcel[v2];
            float f = this.mContext.getResources().getDisplayMetrics().density;
            if(v == (adSizeParcel0.width == -1 ? ((int)(((float)adSizeParcel0.widthPixels) / f)) : adSizeParcel0.width) && v1 == (adSizeParcel0.height == -2 ? ((int)(((float)adSizeParcel0.heightPixels) / f)) : adSizeParcel0.height)) {
                return new AdSizeParcel(adSizeParcel0, adRequestInfoParcel0.zzpN.zzso);
            }
        }
        throw new com.google.android.gms.ads.internal.request.zzb.zza("The ad size from the ad response was not one of the requested sizes: " + this.zzBt.zzCN, 0);
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void zzdP() {
        JSONObject jSONObject0;
        long v5;
        AdSizeParcel adSizeParcel0;
        synchronized(this.zzqt) {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("AdLoaderBackgroundTask started.");
            String s = this.zzvA.zzab().zzb(this.mContext);
            String s1 = zzl.zzq(this.mContext).getClientId();
            AdRequestInfoParcel adRequestInfoParcel0 = new AdRequestInfoParcel(this.zzCe, s, s1);
            int v1 = -2;
            long v2 = -1L;
            try {
                long v3 = zzo.zzbz().elapsedRealtime();
                zzhh zzhh0 = this.zzb(adRequestInfoParcel0);
                synchronized(this.zzBr) {
                    this.zzCf = zzhh0;
                    if(this.zzCf == null) {
                        throw new com.google.android.gms.ads.internal.request.zzb.zza("Could not start the ad request service.", 0);
                    }
                }
                this.zzi(v3);
                v2 = zzo.zzbz().elapsedRealtime();
                this.zzfu();
                adSizeParcel0 = adRequestInfoParcel0.zzpN.zzso == null ? null : this.zzc(adRequestInfoParcel0);
            }
            catch(com.google.android.gms.ads.internal.request.zzb.zza zzb$zza0) {
                adSizeParcel0 = null;
                goto label_36;
            }
            try {
                this.zzw(this.zzBt.zzCU);
                v5 = v2;
                goto label_48;
            }
            catch(com.google.android.gms.ads.internal.request.zzb.zza zzb$zza0) {
            }
        label_36:
            v1 = zzb$zza0.getErrorCode();
            if(v1 != -1 && v1 != 3) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC(zzb$zza0.getMessage());
            }
            else {
                com.google.android.gms.ads.internal.util.client.zzb.zzaA(zzb$zza0.getMessage());
            }
            this.zzBt = this.zzBt == null ? new AdResponseParcel(v1) : new AdResponseParcel(v1, this.zzBt.zzxJ);
            com.google.android.gms.ads.internal.request.zzb.1 zzb$10 = () -> synchronized(zzb.this.zzBr) {
                if(zzb.this.zzCf != null) {
                    zzb.this.zzCf.cancel();
                }
            };
            zzhl.zzGk.post(zzb$10);
            v5 = v2;
        label_48:
            if(TextUtils.isEmpty(this.zzBt.zzCS)) {
                jSONObject0 = null;
            }
            else {
                try {
                    jSONObject0 = new JSONObject(this.zzBt.zzCS);
                }
                catch(Exception exception0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb("Error parsing the JSON for Active View.", exception0);
                    jSONObject0 = null;
                }
            }
            com.google.android.gms.ads.internal.request.zzb.2 zzb$20 = new Runnable() {
                @Override
                public void run() {
                    synchronized(zzb.this.zzqt) {
                        zzb.this.zzCd.zza(new com.google.android.gms.internal.zzha.zza(adRequestInfoParcel0, this.zzBt, this.zzxn, adSizeParcel0, v1, v5, this.zzBt.zzCO, jSONObject0));
                    }
                }
            };
            zzhl.zzGk.post(zzb$20);
        }

        class com.google.android.gms.ads.internal.request.zzb.1 implements Runnable {
            @Override
            public void run() {
                zzb.this.onStop();
            }
        }

    }

    protected boolean zze(long v) throws com.google.android.gms.ads.internal.request.zzb.zza {
        long v1 = 60000L - (zzo.zzbz().elapsedRealtime() - v);
        if(v1 <= 0L) {
            return false;
        }
        try {
            this.zzqt.wait(v1);
            return true;
        }
        catch(InterruptedException unused_ex) {
            throw new com.google.android.gms.ads.internal.request.zzb.zza("Ad request cancelled.", -1);
        }
    }

    protected void zzfu() throws com.google.android.gms.ads.internal.request.zzb.zza {
        if(this.zzBt.errorCode != -3) {
            if(TextUtils.isEmpty(this.zzBt.zzCI)) {
                throw new com.google.android.gms.ads.internal.request.zzb.zza("No fill from ad server.", 3);
            }
            zzo.zzby().zza(this.mContext, this.zzBt.zzCu);
            if(this.zzBt.zzCK) {
                try {
                    this.zzxn = new zzdy(this.zzBt.zzCI);
                }
                catch(JSONException unused_ex) {
                    throw new com.google.android.gms.ads.internal.request.zzb.zza("Could not parse mediation config: " + this.zzBt.zzCI, 0);
                }
            }
        }
    }

    protected void zzi(long v) throws com.google.android.gms.ads.internal.request.zzb.zza {
        do {
            if(!this.zze(v)) {
                throw new com.google.android.gms.ads.internal.request.zzb.zza("Timed out waiting for ad response.", 2);
            }
        }
        while(this.zzBt == null);
        synchronized(this.zzBr) {
            this.zzCf = null;
        }
        if(this.zzBt.errorCode != -3 && this.zzBt.errorCode != -2) {
            throw new com.google.android.gms.ads.internal.request.zzb.zza("There was a problem getting an ad response. ErrorCode: " + this.zzBt.errorCode, this.zzBt.errorCode);
        }
    }

    protected void zzw(boolean z) {
        zzo.zzby().zzA(z);
        zzbk zzbk0 = zzo.zzby().zzD(this.mContext);
        if(zzbk0 != null && !zzbk0.isAlive()) {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("start fetching content...");
            zzbk0.zzcp();
        }
    }
}

