package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzbb;
import com.google.android.gms.internal.zzbe;
import com.google.android.gms.internal.zzbr;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzdh;
import com.google.android.gms.internal.zzdl;
import com.google.android.gms.internal.zzdt.zzb;
import com.google.android.gms.internal.zzdt.zzd;
import com.google.android.gms.internal.zzdt;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgg;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzl extends zzhh {
    public static class zza implements zzb {
        public void zza(zzbb zzbb0) {
            zzl.zzd(zzbb0);
        }

        @Override  // com.google.android.gms.internal.zzdt$zzb
        public void zzc(Object object0) {
            this.zza(((zzbb)object0));
        }
    }

    public static class com.google.android.gms.ads.internal.request.zzl.zzb implements zzb {
        public void zza(zzbb zzbb0) {
            zzl.zzc(zzbb0);
        }

        @Override  // com.google.android.gms.internal.zzdt$zzb
        public void zzc(Object object0) {
            this.zza(((zzbb)object0));
        }
    }

    public static class zzc implements zzdg {
        @Override  // com.google.android.gms.internal.zzdg
        public void zza(zzid zzid0, Map map0) {
            String s = (String)map0.get("request_id");
            com.google.android.gms.ads.internal.util.client.zzb.zzaC(("Invalid request: " + ((String)map0.get("errors"))));
            zzl.zzDj.zzV(s);
        }
    }

    private final Context mContext;
    private final Object zzBr;
    private final com.google.android.gms.ads.internal.request.zza.zza zzCd;
    private final com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza zzCe;
    static final long zzDf;
    private static boolean zzDg;
    private static zzdt zzDh;
    private static zzdh zzDi;
    private static zzdl zzDj;
    private static zzdg zzDk;
    private zzd zzDl;
    private static final Object zzoW;

    static {
        zzl.zzDf = TimeUnit.SECONDS.toMillis(10L);
        zzl.zzoW = new Object();
        zzl.zzDg = false;
        zzl.zzDh = null;
        zzl.zzDi = null;
        zzl.zzDj = null;
        zzl.zzDk = null;
    }

    public zzl(Context context0, com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza adRequestInfoParcel$zza0, com.google.android.gms.ads.internal.request.zza.zza zza$zza0) {
        this.zzBr = new Object();
        this.zzCd = zza$zza0;
        this.mContext = context0;
        this.zzCe = adRequestInfoParcel$zza0;
        synchronized(zzl.zzoW) {
            if(!zzl.zzDg) {
                zzl.zzDj = new zzdl();
                zzl.zzDi = new zzdh(context0.getApplicationContext(), adRequestInfoParcel$zza0.zzpJ);
                zzl.zzDk = new zzc();
                Context context1 = this.mContext.getApplicationContext();
                String s = (String)zzbz.zztD.get();
                com.google.android.gms.ads.internal.request.zzl.zzb zzl$zzb0 = new com.google.android.gms.ads.internal.request.zzl.zzb();
                zza zzl$zza0 = new zza();
                zzl.zzDh = new zzdt(context1, this.zzCe.zzpJ, s, zzl$zzb0, zzl$zza0);
                zzl.zzDg = true;
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void onStop() {
        synchronized(this.zzBr) {
            com.google.android.gms.ads.internal.request.zzl.3 zzl$30 = new Runnable() {
                @Override
                public void run() {
                    if(zzl.this.zzDl != null) {
                        zzl.this.zzDl.release();
                        zzl.this.zzDl = null;
                    }
                }
            };
            com.google.android.gms.ads.internal.util.client.zza.zzGF.post(zzl$30);
        }
    }

    private JSONObject zza(AdRequestInfoParcel adRequestInfoParcel0, String s) {
        Info advertisingIdClient$Info0;
        Bundle bundle0 = adRequestInfoParcel0.zzCm.extras.getBundle("sdk_less_server_data");
        String s1 = adRequestInfoParcel0.zzCm.extras.getString("sdk_less_network_id");
        if(bundle0 != null) {
            JSONObject jSONObject0 = zzgg.zza(adRequestInfoParcel0, zzo.zzbB().zzC(this.mContext), null, new zzbr(((String)zzbz.zztD.get())), null, null, new ArrayList());
            if(jSONObject0 != null) {
                try {
                    advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(this.mContext);
                }
                catch(IOException | IllegalStateException | GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException iOException0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot get advertising id info", iOException0);
                    advertisingIdClient$Info0 = null;
                }
                HashMap hashMap0 = new HashMap();
                hashMap0.put("request_id", s);
                hashMap0.put("network_id", s1);
                hashMap0.put("request_param", jSONObject0);
                hashMap0.put("data", bundle0);
                if(advertisingIdClient$Info0 != null) {
                    hashMap0.put("adid", advertisingIdClient$Info0.getId());
                    hashMap0.put("lat", ((int)(advertisingIdClient$Info0.isLimitAdTrackingEnabled() ? 1 : 0)));
                }
                try {
                    return zzo.zzbv().zzy(hashMap0);
                }
                catch(JSONException unused_ex) {
                    return null;
                }
            }
        }
        return null;
    }

    protected static void zzc(zzbb zzbb0) {
        zzbb0.zza("/loadAd", zzl.zzDj);
        zzbb0.zza("/fetchHttpRequest", zzl.zzDi);
        zzbb0.zza("/invalidRequest", zzl.zzDk);
    }

    protected static void zzd(zzbb zzbb0) {
        zzbb0.zzb("/loadAd", zzl.zzDj);
        zzbb0.zzb("/fetchHttpRequest", zzl.zzDi);
        zzbb0.zzb("/invalidRequest", zzl.zzDk);
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void zzdP() {
        com.google.android.gms.ads.internal.util.client.zzb.zzay("SdkLessAdLoaderBackgroundTask started.");
        AdRequestInfoParcel adRequestInfoParcel0 = new AdRequestInfoParcel(this.zzCe, null, null);
        AdResponseParcel adResponseParcel0 = this.zzf(adRequestInfoParcel0);
        long v = zzo.zzbz().elapsedRealtime();
        com.google.android.gms.ads.internal.request.zzl.1 zzl$10 = new Runnable() {
            @Override
            public void run() {
                zzl.this.zzCd.zza(new com.google.android.gms.internal.zzha.zza(adRequestInfoParcel0, adResponseParcel0, null, null, adResponseParcel0.errorCode, v, adResponseParcel0.zzCO, null));
                if(zzl.this.zzDl != null) {
                    zzl.this.zzDl.release();
                    zzl.this.zzDl = null;
                }
            }
        };
        com.google.android.gms.ads.internal.util.client.zza.zzGF.post(zzl$10);
    }

    private AdResponseParcel zzf(AdRequestInfoParcel adRequestInfoParcel0) {
        JSONObject jSONObject1;
        JSONObject jSONObject0 = this.zza(adRequestInfoParcel0, "e8425678-4dc6-4a08-9a60-9eb427084af6");
        if(jSONObject0 == null) {
            return new AdResponseParcel(0);
        }
        long v = zzo.zzbz().elapsedRealtime();
        Future future0 = zzl.zzDj.zzU("e8425678-4dc6-4a08-9a60-9eb427084af6");
        com.google.android.gms.ads.internal.request.zzl.2 zzl$20 = new Runnable() {
            @Override
            public void run() {
                zzd zzdt$zzd0 = zzl.zzDh.zzdU();
                zzl.this.zzDl = zzdt$zzd0;
                zzl.this.zzDl.zza(new com.google.android.gms.internal.zzhx.zzc() {
                    public void zzb(zzbe zzbe0) {
                        try {
                            zzbe0.zza("AFMA_getAdapterLessMediationAd", com.google.android.gms.ads.internal.request.zzl.2.this.zzDn);
                        }
                        catch(Exception exception0) {
                            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error requesting an ad url", exception0);
                            zzl.zzDj.zzV(com.google.android.gms.ads.internal.request.zzl.2.this.zzDo);
                        }
                    }
                }, new com.google.android.gms.internal.zzhx.zza() {
                    @Override  // com.google.android.gms.internal.zzhx$zza
                    public void run() {
                        zzl.zzDj.zzV(com.google.android.gms.ads.internal.request.zzl.2.this.zzDo);
                    }
                });
            }
        };
        com.google.android.gms.ads.internal.util.client.zza.zzGF.post(zzl$20);
        long v1 = zzo.zzbz().elapsedRealtime();
        try {
            jSONObject1 = (JSONObject)future0.get(zzl.zzDf - (v1 - v), TimeUnit.MILLISECONDS);
        }
        catch(CancellationException unused_ex) {
            return new AdResponseParcel(-1);
        }
        catch(InterruptedException unused_ex) {
            return new AdResponseParcel(-1);
        }
        catch(TimeoutException unused_ex) {
            return new AdResponseParcel(2);
        }
        catch(ExecutionException unused_ex) {
            return new AdResponseParcel(0);
        }
        if(jSONObject1 == null) {
            return new AdResponseParcel(-1);
        }
        AdResponseParcel adResponseParcel0 = zzgg.zza(this.mContext, adRequestInfoParcel0, jSONObject1.toString());
        return adResponseParcel0.errorCode == -3 || !TextUtils.isEmpty(adResponseParcel0.zzCI) ? adResponseParcel0 : new AdResponseParcel(3);
    }
}

