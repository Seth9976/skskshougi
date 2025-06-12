package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.zzi.zza;
import com.google.android.gms.ads.internal.request.zzj;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzo;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public final class zzgf extends zza {
    private final Context mContext;
    private static zzgf zzDv;
    private final zzge zzDw;
    private final zzbr zzDx;
    private static final Object zzoW;
    private final zzdt zzqC;

    static {
        zzgf.zzoW = new Object();
    }

    zzgf(Context context0, zzbr zzbr0, zzge zzge0) {
        this.mContext = context0;
        this.zzDw = zzge0;
        this.zzDx = zzbr0;
        this.zzqC = new zzdt((context0.getApplicationContext() == null ? context0 : context0.getApplicationContext()), new VersionInfoParcel(7571000, 7571000, true), zzbr0.zzcW(), new zzb() {
            public void zza(zzbb zzbb0) {
                zzbb0.zza("/log", zzdf.zzwc);
            }
        }, new zzc());
    }

    private static AdResponseParcel zza(Context context0, zzdt zzdt0, zzbr zzbr0, zzge zzge0, AdRequestInfoParcel adRequestInfoParcel0) {
        AdResponseParcel adResponseParcel0;
        zzgj zzgj0;
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Starting ad request from service.");
        zzbz.zzw(context0);
        zzce zzce0 = new zzce("load_ad");
        zzcd zzcd0 = zzce0.zzdo();
        zzge0.zzDs.init();
        zzgk zzgk0 = zzo.zzbB().zzC(context0);
        if(zzgk0.zzEy == -1) {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Device is offline.");
            return new AdResponseParcel(2);
        }
        String s = adRequestInfoParcel0.versionCode < 7 ? "9b11b3ba-4d2d-4122-a0be-2eb8e451f8a9" : adRequestInfoParcel0.zzCE;
        zzgh zzgh0 = new zzgh(s, adRequestInfoParcel0.applicationInfo.packageName);
        if(adRequestInfoParcel0.zzCm.extras != null) {
            String s1 = adRequestInfoParcel0.zzCm.extras.getString("_ad");
            if(s1 != null) {
                return zzgg.zza(context0, adRequestInfoParcel0, s1);
            }
        }
        Location location0 = zzge0.zzDs.zzc(0xFAL);
        String s2 = zzge0.zzDt.zzc(context0, adRequestInfoParcel0.zzCn.packageName);
        List list0 = zzge0.zzDr.zza(adRequestInfoParcel0);
        JSONObject jSONObject0 = zzgg.zza(adRequestInfoParcel0, zzgk0, location0, zzbr0, s2, zzge0.zzDu.zzar(adRequestInfoParcel0.zzCo), list0);
        if(adRequestInfoParcel0.versionCode < 7) {
            try {
                jSONObject0.put("request_id", s);
            }
            catch(JSONException unused_ex) {
            }
        }
        if(jSONObject0 == null) {
            return new AdResponseParcel(0);
        }
        String s3 = jSONObject0.toString();
        zzce0.zza(zzcd0, new String[]{"arc"});
        zzcd zzcd1 = zzce0.zzdo();
        if(((Boolean)zzbz.zztE.get()).booleanValue()) {
            com.google.android.gms.internal.zzgf.1 zzgf$10 = new Runnable() {
                @Override
                public void run() {
                    zzd zzdt$zzd0 = zzdt0.zzdU();
                    zzgh0.zzb(zzdt$zzd0);
                    zzce0.zza(zzcd1, new String[]{"rwc"});
                    zzdt$zzd0.zza(new com.google.android.gms.internal.zzhx.zzc() {
                        public void zzb(zzbe zzbe0) {
                            com.google.android.gms.internal.zzgf.1.this.zzDA.zza(this.zzDA.zzdo(), new String[]{"jsf"});
                            com.google.android.gms.internal.zzgf.1.this.zzDA.zzdp();
                            zzbe0.zza("/invalidRequest", com.google.android.gms.internal.zzgf.1.this.zzDz.zzDO);
                            zzbe0.zza("/loadAdURL", com.google.android.gms.internal.zzgf.1.this.zzDz.zzDP);
                            try {
                                zzbe0.zza("AFMA_buildAdURL", com.google.android.gms.internal.zzgf.1.this.zzDC);
                            }
                            catch(Exception exception0) {
                                com.google.android.gms.ads.internal.util.client.zzb.zzb("Error requesting an ad url", exception0);
                            }
                        }
                    }, new com.google.android.gms.internal.zzhx.zza() {
                        @Override  // com.google.android.gms.internal.zzhx$zza
                        public void run() {
                        }
                    });
                }
            };
            zzhl.zzGk.post(zzgf$10);
        }
        else {
            com.google.android.gms.internal.zzgf.2 zzgf$20 = new Runnable() {
                @Override
                public void run() {
                    zzif zzif0 = zzo.zzbw();
                    AdSizeParcel adSizeParcel0 = new AdSizeParcel();
                    zzid zzid0 = zzif0.zza(context0, adSizeParcel0, false, false, null, adRequestInfoParcel0.zzpJ);
                    if(zzo.zzby().zzge()) {
                        zzid0.getWebView().clearCache(true);
                    }
                    zzid0.setWillNotDraw(true);
                    zzgh0.zze(zzid0);
                    zzce0.zza(zzcd1, new String[]{"rwc"});
                    zzcd zzcd0 = zzce0.zzdo();
                    com.google.android.gms.internal.zzie.zza zzie$zza0 = zzgf.zza(s3, zzce0, zzcd0);
                    zzie zzie0 = zzid0.zzgF();
                    zzie0.zza("/invalidRequest", zzgh0.zzDO);
                    zzie0.zza("/loadAdURL", zzgh0.zzDP);
                    zzie0.zza("/log", zzdf.zzwc);
                    zzie0.zza(zzie$zza0);
                    com.google.android.gms.ads.internal.util.client.zzb.zzay("Loading the JS library.");
                    zzid0.loadUrl(zzbr0.zzcW());
                }
            };
            zzhl.zzGk.post(zzgf$20);
        }
        try {
            zzgj0 = (zzgj)zzgh0.zzfE().get(10L, TimeUnit.SECONDS);
        }
        catch(Exception unused_ex) {
            return new AdResponseParcel(0);
        }
        finally {
            com.google.android.gms.internal.zzgf.3 zzgf$30 = new Runnable() {
                @Override
                public void run() {
                    zzgh0.zzfF();
                    if(zzgh0.zzfD() != null) {
                        zzgh0.zzfD().release();
                    }
                }
            };
            zzhl.zzGk.post(zzgf$30);
        }
        if(zzgj0 == null) {
            return new AdResponseParcel(0);
        }
        if(zzgj0.getErrorCode() != -2) {
            return new AdResponseParcel(zzgj0.getErrorCode());
        }
        if(zzce0.zzds() != null) {
            zzce0.zza(zzce0.zzds(), new String[]{"rur"});
        }
        String s4 = zzgj0.zzfI() ? zzge0.zzDq.zzaq(adRequestInfoParcel0.zzCn.packageName) : null;
        zzcd zzcd2 = zzce0.zzdo();
        adResponseParcel0 = zzgf.zza(adRequestInfoParcel0, context0, adRequestInfoParcel0.zzpJ.zzGG, zzgj0.getUrl(), s4, s2, zzgj0);
        if(adResponseParcel0.zzCW == 1) {
            zzge0.zzDt.clearToken(context0, adRequestInfoParcel0.zzCn.packageName);
        }
        zzce0.zza(zzcd2, new String[]{"ufe"});
        zzce0.zza(zzcd0, new String[]{"tts"});
        if(zzhg.zzfY() != null) {
            zzhg.zzfY().zza(zzce0);
        }
        return adResponseParcel0;
    }

    public static AdResponseParcel zza(AdRequestInfoParcel adRequestInfoParcel0, Context context0, String s, String s1, String s2, String s3, zzgj zzgj0) {
        int v3;
        int v2;
        try {
            zzgi zzgi0 = new zzgi(adRequestInfoParcel0);
            com.google.android.gms.ads.internal.util.client.zzb.zzay(("AdRequestServiceImpl: Sending request: " + s1));
            URL uRL0 = new URL(s1);
            long v = SystemClock.elapsedRealtime();
            URL uRL1 = uRL0;
            int v1 = 0;
            while(true) {
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL1.openConnection();
                v2 = FIN.finallyOpen$NT();
                zzo.zzbv().zza(context0, s, false, httpURLConnection0);
                if(!TextUtils.isEmpty(s2)) {
                    httpURLConnection0.addRequestProperty("x-afma-drt-cookie", s2);
                }
                if(!TextUtils.isEmpty(s3)) {
                    httpURLConnection0.addRequestProperty("Authorization", "Bearer " + s3);
                }
                if(zzgj0 != null && !TextUtils.isEmpty(zzgj0.zzfH())) {
                    httpURLConnection0.setDoOutput(true);
                    byte[] arr_b = zzgj0.zzfH().getBytes();
                    httpURLConnection0.setFixedLengthStreamingMode(arr_b.length);
                    BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(httpURLConnection0.getOutputStream());
                    bufferedOutputStream0.write(arr_b);
                    bufferedOutputStream0.close();
                }
                v3 = httpURLConnection0.getResponseCode();
                Map map0 = httpURLConnection0.getHeaderFields();
                if(v3 >= 200 && v3 < 300) {
                    String s4 = uRL1.toString();
                    String s5 = zzo.zzbv().zza(new InputStreamReader(httpURLConnection0.getInputStream()));
                    zzgf.zza(s4, map0, s5, v3);
                    zzgi0.zza(s4, map0, s5);
                    AdResponseParcel adResponseParcel0 = zzgi0.zzj(v);
                    FIN.finallyCodeBegin$NT(v2);
                    httpURLConnection0.disconnect();
                    FIN.finallyCodeEnd$NT(v2);
                    return adResponseParcel0;
                }
                zzgf.zza(uRL1.toString(), map0, null, v3);
                if(v3 < 300 || v3 >= 400) {
                    break;
                }
                String s6 = httpURLConnection0.getHeaderField("Location");
                if(TextUtils.isEmpty(s6)) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaC("No location header to follow redirect.");
                    AdResponseParcel adResponseParcel1 = new AdResponseParcel(0);
                    FIN.finallyExec$NT(v2);
                    return adResponseParcel1;
                }
                uRL1 = new URL(s6);
                ++v1;
                if(v1 > 5) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaC("Too many redirects.");
                    AdResponseParcel adResponseParcel2 = new AdResponseParcel(0);
                    FIN.finallyExec$NT(v2);
                    return adResponseParcel2;
                }
                zzgi0.zzi(map0);
                FIN.finallyExec$NT(v2);
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaC(("Received error HTTP response code: " + v3));
            AdResponseParcel adResponseParcel3 = new AdResponseParcel(0);
            FIN.finallyExec$NT(v2);
            return adResponseParcel3;
        }
        catch(IOException iOException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC(("Error while connecting to ad server: " + iOException0.getMessage()));
            return new AdResponseParcel(2);
        }
    }

    public static zzgf zza(Context context0, zzbr zzbr0, zzge zzge0) {
        synchronized(zzgf.zzoW) {
            if(zzgf.zzDv == null) {
                if(context0.getApplicationContext() != null) {
                    context0 = context0.getApplicationContext();
                }
                zzgf.zzDv = new zzgf(context0, zzbr0, zzge0);
            }
            return zzgf.zzDv;
        }
    }

    private static com.google.android.gms.internal.zzie.zza zza(String s, zzce zzce0, zzcd zzcd0) {
        return new com.google.android.gms.internal.zzie.zza() {
            @Override  // com.google.android.gms.internal.zzie$zza
            public void zza(zzid zzid0, boolean z) {
                zzce0.zza(zzcd0, new String[]{"jsf"});
                zzce0.zzdp();
                zzid0.zza("AFMA_buildAdURL", s);
            }
        };
    }

    private static void zza(String s, Map map0, String s1, int v) {
        if(com.google.android.gms.ads.internal.util.client.zzb.zzL(2)) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaB(("Http Response: {\n  URL:\n    " + s + "\n  Headers:"));
            if(map0 != null) {
                for(Object object0: map0.keySet()) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaB(("    " + ((String)object0) + ":"));
                    for(Object object1: ((List)map0.get(((String)object0)))) {
                        com.google.android.gms.ads.internal.util.client.zzb.zzaB(("      " + ((String)object1)));
                    }
                }
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaB("  Body:");
            if(s1 == null) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaB("    null");
            }
            else {
                for(int v1 = 0; v1 < Math.min(s1.length(), 100000); v1 += 1000) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaB(s1.substring(v1, Math.min(s1.length(), v1 + 1000)));
                }
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaB(("  Response Code:\n    " + v + "\n}"));
        }
    }

    @Override  // com.google.android.gms.ads.internal.request.zzi
    public void zza(AdRequestInfoParcel adRequestInfoParcel0, zzj zzj0) {
        zzo.zzby().zzb(this.mContext, adRequestInfoParcel0.zzpJ);
        new zzhh() {
            @Override  // com.google.android.gms.internal.zzhh
            public void onStop() {
                try {
                    AdResponseParcel adResponseParcel0 = new AdResponseParcel(-1);
                    zzj0.zzb(adResponseParcel0);
                }
                catch(RemoteException remoteException0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to forward ad response.", remoteException0);
                }
            }

            @Override  // com.google.android.gms.internal.zzhh
            public void zzdP() {
                AdResponseParcel adResponseParcel0;
                try {
                    adResponseParcel0 = zzgf.this.zze(adRequestInfoParcel0);
                }
                catch(Exception exception0) {
                    zzo.zzby().zzc(exception0, true);
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response due to an Exception.", exception0);
                    adResponseParcel0 = null;
                }
                if(adResponseParcel0 == null) {
                    adResponseParcel0 = new AdResponseParcel(0);
                }
                try {
                    zzj0.zzb(adResponseParcel0);
                }
                catch(RemoteException remoteException0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Fail to forward ad response.", remoteException0);
                }
            }
        }.zzgi();
    }

    @Override  // com.google.android.gms.ads.internal.request.zzi
    public AdResponseParcel zze(AdRequestInfoParcel adRequestInfoParcel0) {
        zzhg.zze(this.mContext, adRequestInfoParcel0.zzpJ.zzGG);
        return zzgf.zza(this.mContext, this.zzqC, this.zzDx, this.zzDw, adRequestInfoParcel0);
    }
}

