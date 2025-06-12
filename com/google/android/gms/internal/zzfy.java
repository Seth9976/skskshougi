package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzg;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zze;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzfy implements Callable {
    public interface zza {
        com.google.android.gms.ads.internal.formats.zzg.zza zza(zzfy arg1, JSONObject arg2) throws JSONException, InterruptedException, ExecutionException;
    }

    class zzb {
        final zzfy zzBO;
        public zzdg zzBX;

    }

    private final Context mContext;
    private static final long zzBF;
    private final zzho zzBG;
    private final zzm zzBH;
    private final zzbc zzBI;
    private boolean zzBJ;
    private List zzBK;
    private final com.google.android.gms.internal.zzha.zza zzBs;
    private int zzBv;
    private final Object zzqt;
    private final zzan zzvA;

    static {
        zzfy.zzBF = TimeUnit.SECONDS.toMillis(60L);
    }

    public zzfy(Context context0, zzm zzm0, zzbc zzbc0, zzho zzho0, zzan zzan0, com.google.android.gms.internal.zzha.zza zzha$zza0) {
        this.zzqt = new Object();
        this.mContext = context0;
        this.zzBH = zzm0;
        this.zzBG = zzho0;
        this.zzBI = zzbc0;
        this.zzBs = zzha$zza0;
        this.zzvA = zzan0;
        this.zzBJ = false;
        this.zzBv = -2;
        this.zzBK = null;
    }

    @Override
    public Object call() throws Exception {
        return this.zzfp();
    }

    public void zzB(int v) {
        synchronized(this.zzqt) {
            this.zzBJ = true;
            this.zzBv = v;
        }
    }

    private com.google.android.gms.ads.internal.formats.zzg.zza zza(zzbb zzbb0, zza zzfy$zza0, JSONObject jSONObject0) throws ExecutionException, InterruptedException, JSONException {
        if(this.zzfr()) {
            return null;
        }
        String[] arr_s = this.zzc(jSONObject0.getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
        this.zzBK = arr_s == null ? null : Arrays.asList(arr_s);
        com.google.android.gms.ads.internal.formats.zzg.zza zzg$zza0 = zzfy$zza0.zza(this, jSONObject0);
        if(zzg$zza0 == null) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaz("Failed to retrieve ad assets.");
            return null;
        }
        zzg$zza0.zza(new zzg(this.mContext, this.zzBH, zzbb0, this.zzvA, jSONObject0, zzg$zza0));
        return zzg$zza0;
    }

    private zzha zza(com.google.android.gms.ads.internal.formats.zzg.zza zzg$zza0) {
        int v;
        synchronized(this.zzqt) {
            v = zzg$zza0 != null || this.zzBv != -2 ? this.zzBv : 0;
        }
        return v == -2 ? new zzha(this.zzBs.zzFr.zzCm, null, this.zzBs.zzFs.zzxF, -2, this.zzBs.zzFs.zzxG, this.zzBK, this.zzBs.zzFs.orientation, this.zzBs.zzFs.zzxJ, this.zzBs.zzFr.zzCp, false, null, null, null, null, null, 0L, this.zzBs.zzpN, this.zzBs.zzFs.zzCJ, this.zzBs.zzFo, this.zzBs.zzFp, this.zzBs.zzFs.zzCP, this.zzBs.zzFl, zzg$zza0, this.zzBs.zzFr.zzCC) : new zzha(this.zzBs.zzFr.zzCm, null, this.zzBs.zzFs.zzxF, v, this.zzBs.zzFs.zzxG, this.zzBK, this.zzBs.zzFs.orientation, this.zzBs.zzFs.zzxJ, this.zzBs.zzFr.zzCp, false, null, null, null, null, null, 0L, this.zzBs.zzpN, this.zzBs.zzFs.zzCJ, this.zzBs.zzFo, this.zzBs.zzFp, this.zzBs.zzFs.zzCP, this.zzBs.zzFl, null, this.zzBs.zzFr.zzCC);
    }

    private zzhv zza(JSONObject jSONObject0, boolean z, boolean z1) throws JSONException {
        String s = z ? jSONObject0.getString("url") : jSONObject0.optString("url");
        if(TextUtils.isEmpty(s)) {
            this.zza(0, z);
            return new zzht(null);
        }
        if(z1) {
            return new zzht(new zzc(null, Uri.parse(s)));
        }
        com.google.android.gms.internal.zzfy.5 zzfy$50 = new com.google.android.gms.internal.zzho.zza() {
            public zzc zzfs() {
                zzfy.this.zza(2, z);
                return null;
            }

            public zzc zzg(InputStream inputStream0) {
                byte[] arr_b;
                try {
                    arr_b = zzlg.zzk(inputStream0);
                }
                catch(IOException unused_ex) {
                    arr_b = null;
                }
                if(arr_b == null) {
                    zzfy.this.zza(2, z);
                    return null;
                }
                Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                if(bitmap0 == null) {
                    zzfy.this.zza(2, z);
                    return null;
                }
                return new zzc(new BitmapDrawable(Resources.getSystem(), bitmap0), Uri.parse(s));
            }
        };
        return this.zzBG.zza(s, zzfy$50);
    }

    private void zza(com.google.android.gms.ads.internal.formats.zzg.zza zzg$zza0, zzbb zzbb0) {
        if(!(zzg$zza0 instanceof zzf)) {
            return;
        }
        zzb zzfy$zzb0 = new zzb(this);
        com.google.android.gms.internal.zzfy.3 zzfy$30 = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                String s = (String)map0.get("asset");
                zzfy.this.zzb(((zzf)zzg$zza0), s);
            }
        };
        zzfy$zzb0.zzBX = zzfy$30;
        zzbb0.zza("/nativeAdCustomClick", zzfy$30);
    }

    public zzhv zza(JSONObject jSONObject0, String s, boolean z, boolean z1) throws JSONException {
        JSONObject jSONObject1 = z ? jSONObject0.getJSONObject(s) : jSONObject0.optJSONObject(s);
        if(jSONObject1 == null) {
            jSONObject1 = new JSONObject();
        }
        return this.zza(jSONObject1, z, z1);
    }

    public List zza(JSONObject jSONObject0, String s, boolean z, boolean z1, boolean z2) throws JSONException {
        JSONArray jSONArray0 = z ? jSONObject0.getJSONArray(s) : jSONObject0.optJSONArray(s);
        ArrayList arrayList0 = new ArrayList();
        if(jSONArray0 == null || jSONArray0.length() == 0) {
            this.zza(0, z);
            return arrayList0;
        }
        int v = z2 ? jSONArray0.length() : 1;
        for(int v1 = 0; v1 < v; ++v1) {
            JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
            if(jSONObject1 == null) {
                jSONObject1 = new JSONObject();
            }
            arrayList0.add(this.zza(jSONObject1, z, z1));
        }
        return arrayList0;
    }

    public Future zza(JSONObject jSONObject0, String s, boolean z) throws JSONException {
        JSONObject jSONObject1 = jSONObject0.getJSONObject(s);
        return this.zza(jSONObject1, jSONObject1.optBoolean("require", true), z);
    }

    public void zza(int v, boolean z) {
        if(z) {
            this.zzB(v);
        }
    }

    private Integer zzb(JSONObject jSONObject0, String s) {
        try {
            JSONObject jSONObject1 = jSONObject0.getJSONObject(s);
            return Color.rgb(jSONObject1.getInt("r"), jSONObject1.getInt("g"), jSONObject1.getInt("b"));
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    private JSONObject zzb(zzbb zzbb0) throws TimeoutException, JSONException {
        if(this.zzfr()) {
            return null;
        }
        zzhs zzhs0 = new zzhs();
        zzb zzfy$zzb0 = new zzb(this);
        com.google.android.gms.internal.zzfy.1 zzfy$10 = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                zzbb0.zzb("/nativeAdPreProcess", zzfy$zzb0.zzBX);
                try {
                    String s = (String)map0.get("success");
                    if(!TextUtils.isEmpty(s)) {
                        JSONObject jSONObject0 = new JSONObject(s).getJSONArray("ads").getJSONObject(0);
                        zzhs0.zzf(jSONObject0);
                        return;
                    }
                }
                catch(JSONException jSONException0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb("Malformed native JSON response.", jSONException0);
                }
                zzfy.this.zzB(0);
                zzu.zza(zzfy.this.zzfr(), "Unable to set the ad state error!");
                zzhs0.zzf(null);
            }
        };
        zzfy$zzb0.zzBX = zzfy$10;
        zzbb0.zza("/nativeAdPreProcess", zzfy$10);
        zzbb0.zza("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(this.zzBs.zzFs.zzCI));
        return (JSONObject)zzhs0.get(zzfy.zzBF, TimeUnit.MILLISECONDS);
    }

    private void zzb(zzcs zzcs0, String s) {
        try {
            String s1 = zzcs0.getCustomTemplateId();
            zzcw zzcw0 = this.zzBH.zzq(s1);
            if(zzcw0 != null) {
                zzcw0.zza(zzcs0, s);
            }
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd(("Failed to call onCustomClick for asset " + s + "."), remoteException0);
        }
    }

    private String[] zzc(JSONObject jSONObject0, String s) throws JSONException {
        JSONArray jSONArray0 = jSONObject0.optJSONArray(s);
        if(jSONArray0 == null) {
            return null;
        }
        String[] arr_s = new String[jSONArray0.length()];
        for(int v = 0; v < jSONArray0.length(); ++v) {
            arr_s[v] = jSONArray0.getString(v);
        }
        return arr_s;
    }

    protected zza zzd(JSONObject jSONObject0) throws JSONException, TimeoutException {
        if(this.zzfr()) {
            return null;
        }
        String s = jSONObject0.getString("template_id");
        boolean z = this.zzBs.zzFr.zzqb == null ? false : this.zzBs.zzFr.zzqb.zzvC;
        boolean z1 = this.zzBs.zzFr.zzqb == null ? false : this.zzBs.zzFr.zzqb.zzvE;
        if("2".equals(s)) {
            return new zzfz(z, z1);
        }
        if("1".equals(s)) {
            return new zzga(z, z1);
        }
        if("3".equals(s)) {
            String s1 = jSONObject0.getString("custom_template_id");
            zzhs zzhs0 = new zzhs();
            com.google.android.gms.internal.zzfy.2 zzfy$20 = new Runnable() {
                @Override
                public void run() {
                    Object object0 = zzfy.this.zzBH.zzbo().get(s1);
                    zzhs0.zzf(object0);
                }
            };
            zzhl.zzGk.post(zzfy$20);
            if(zzhs0.get(zzfy.zzBF, TimeUnit.MILLISECONDS) != null) {
                return new zzgb(z);
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaz(("No handler for custom template: " + jSONObject0.getString("custom_template_id")));
            return null;
        }
        this.zzB(0);
        return null;
    }

    public zzhv zze(JSONObject jSONObject0) throws JSONException {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("attribution");
        if(jSONObject1 == null) {
            return new zzht(null);
        }
        String s = jSONObject1.optString("text");
        int v = jSONObject1.optInt("text_size", -1);
        Integer integer0 = this.zzb(jSONObject1, "text_color");
        Integer integer1 = this.zzb(jSONObject1, "bg_color");
        return zzhu.zza(this.zza(jSONObject1, "image", false, false), new com.google.android.gms.internal.zzhu.zza() {
            public com.google.android.gms.ads.internal.formats.zza zza(zzc zzc0) {
                try {
                    if(zzc0 != null && !TextUtils.isEmpty(s)) {
                        Drawable drawable0 = (Drawable)zze.zzn(zzc0.zzdw());
                        return new com.google.android.gms.ads.internal.formats.zza(s, drawable0, integer1, integer0, (v <= 0 ? null : v));
                    }
                }
                catch(RemoteException remoteException0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb("Could not get attribution icon", remoteException0);
                }
                return null;
            }
        });
    }

    public zzha zzfp() {
        try {
            zzbb zzbb0 = this.zzfq();
            JSONObject jSONObject0 = this.zzb(zzbb0);
            com.google.android.gms.ads.internal.formats.zzg.zza zzg$zza0 = this.zza(zzbb0, this.zzd(jSONObject0), jSONObject0);
            this.zza(zzg$zza0, zzbb0);
            return this.zza(zzg$zza0);
        }
        catch(CancellationException unused_ex) {
        }
        catch(ExecutionException unused_ex) {
        }
        catch(InterruptedException unused_ex) {
        }
        catch(JSONException jSONException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Malformed native JSON response.", jSONException0);
        }
        catch(TimeoutException timeoutException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Timeout when loading native ad.", timeoutException0);
        }
        if(!this.zzBJ) {
            this.zzB(0);
        }
        return this.zza(null);
    }

    private zzbb zzfq() throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        if(this.zzfr()) {
            return null;
        }
        String s = (String)zzbz.zzur.get();
        zzbb zzbb0 = (zzbb)this.zzBI.zza(this.mContext, this.zzBs.zzFr.zzpJ, (this.zzBs.zzFs.zzzG.indexOf("https") == 0 ? "https:" : "http:") + s).get(zzfy.zzBF, TimeUnit.MILLISECONDS);
        zzbb0.zza(this.zzBH, this.zzBH, this.zzBH, this.zzBH, false, null, null, null, null);
        return zzbb0;
    }

    public boolean zzfr() {
        synchronized(this.zzqt) {
        }
        return this.zzBJ;
    }
}

