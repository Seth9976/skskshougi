package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzo;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzdh implements zzdg {
    @zzgd
    static class zza {
        private final String mValue;
        private final String zztw;

        public zza(String s, String s1) {
            this.zztw = s;
            this.mValue = s1;
        }

        public String getKey() {
            return this.zztw;
        }

        public String getValue() {
            return this.mValue;
        }
    }

    @zzgd
    static class zzb {
        private final String zzwl;
        private final URL zzwm;
        private final ArrayList zzwn;
        private final String zzwo;

        public zzb(String s, URL uRL0, ArrayList arrayList0, String s1) {
            this.zzwl = s;
            this.zzwm = uRL0;
            this.zzwn = arrayList0 == null ? new ArrayList() : arrayList0;
            this.zzwo = s1;
        }

        public String zzdJ() {
            return this.zzwl;
        }

        public URL zzdK() {
            return this.zzwm;
        }

        public ArrayList zzdL() {
            return this.zzwn;
        }

        public String zzdM() {
            return this.zzwo;
        }
    }

    @zzgd
    class zzc {
        final zzdh zzwi;
        private final zzd zzwp;
        private final boolean zzwq;
        private final String zzwr;

        public zzc(boolean z, zzd zzdh$zzd0, String s) {
            this.zzwq = z;
            this.zzwp = zzdh$zzd0;
            this.zzwr = s;
        }

        public String getReason() {
            return this.zzwr;
        }

        public boolean isSuccess() {
            return this.zzwq;
        }

        public zzd zzdN() {
            return this.zzwp;
        }
    }

    @zzgd
    static class zzd {
        private final String zzvj;
        private final String zzwl;
        private final int zzws;
        private final List zzwt;

        public zzd(String s, int v, List list0, String s1) {
            this.zzwl = s;
            this.zzws = v;
            this.zzwt = list0 == null ? new ArrayList() : list0;
            this.zzvj = s1;
        }

        public String getBody() {
            return this.zzvj;
        }

        public int getResponseCode() {
            return this.zzws;
        }

        public String zzdJ() {
            return this.zzwl;
        }

        public Iterable zzdO() {
            return this.zzwt;
        }
    }

    private final Context mContext;
    private final VersionInfoParcel zzoM;

    public zzdh(Context context0, VersionInfoParcel versionInfoParcel0) {
        this.mContext = context0;
        this.zzoM = versionInfoParcel0;
    }

    public JSONObject zzT(String s) {
        JSONObject jSONObject0;
        try {
            jSONObject0 = new JSONObject(s);
        }
        catch(JSONException unused_ex) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaz("The request is not a valid JSON.");
            try {
                return new JSONObject().put("success", false);
            }
            catch(JSONException unused_ex) {
                return new JSONObject();
            }
        }
        JSONObject jSONObject1 = new JSONObject();
        String s1 = "";
        try {
            s1 = jSONObject0.optString("http_request_id");
            zzc zzdh$zzc0 = this.zza(this.zzb(jSONObject0));
            if(zzdh$zzc0.isSuccess()) {
                jSONObject1.put("response", this.zza(zzdh$zzc0.zzdN()));
                jSONObject1.put("success", true);
                return jSONObject1;
            }
            jSONObject1.put("response", new JSONObject().put("http_request_id", s1));
            jSONObject1.put("success", false);
            jSONObject1.put("reason", zzdh$zzc0.getReason());
        }
        catch(Exception exception0) {
            try {
                jSONObject1.put("response", new JSONObject().put("http_request_id", s1));
                jSONObject1.put("success", false);
                jSONObject1.put("reason", exception0.toString());
            }
            catch(JSONException unused_ex) {
            }
        }
        return jSONObject1;
    }

    protected zzc zza(zzb zzdh$zzb0) {
        try {
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)zzdh$zzb0.zzdK().openConnection();
            zzo.zzbv().zza(this.mContext, this.zzoM.zzGG, false, httpURLConnection0);
            for(Object object0: zzdh$zzb0.zzdL()) {
                httpURLConnection0.addRequestProperty(((zza)object0).getKey(), ((zza)object0).getValue());
            }
            if(!TextUtils.isEmpty(zzdh$zzb0.zzdM())) {
                httpURLConnection0.setDoOutput(true);
                byte[] arr_b = zzdh$zzb0.zzdM().getBytes();
                httpURLConnection0.setFixedLengthStreamingMode(arr_b.length);
                BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(httpURLConnection0.getOutputStream());
                bufferedOutputStream0.write(arr_b);
                bufferedOutputStream0.close();
            }
            ArrayList arrayList0 = new ArrayList();
            if(httpURLConnection0.getHeaderFields() == null) {
                return new zzc(this, true, new zzd(zzdh$zzb0.zzdJ(), httpURLConnection0.getResponseCode(), arrayList0, zzo.zzbv().zza(new InputStreamReader(httpURLConnection0.getInputStream()))), null);
            }
            Iterator iterator1 = httpURLConnection0.getHeaderFields().entrySet().iterator();
            while(true) {
            label_17:
                if(!iterator1.hasNext()) {
                    return new zzc(this, true, new zzd(zzdh$zzb0.zzdJ(), httpURLConnection0.getResponseCode(), arrayList0, zzo.zzbv().zza(new InputStreamReader(httpURLConnection0.getInputStream()))), null);
                }
                Object object1 = iterator1.next();
                Map.Entry map$Entry0 = (Map.Entry)object1;
                for(Object object2: ((List)map$Entry0.getValue())) {
                    arrayList0.add(new zza(((String)map$Entry0.getKey()), ((String)object2)));
                }
            }
        }
        catch(Exception exception0) {
            return new zzc(this, false, null, exception0.toString());
        }
        goto label_17;
    }

    protected JSONObject zza(zzd zzdh$zzd0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("http_request_id", zzdh$zzd0.zzdJ());
            if(zzdh$zzd0.getBody() != null) {
                jSONObject0.put("body", zzdh$zzd0.getBody());
            }
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: zzdh$zzd0.zzdO()) {
                jSONArray0.put(new JSONObject().put("key", ((zza)object0).getKey()).put("value", ((zza)object0).getValue()));
            }
            jSONObject0.put("headers", jSONArray0);
            jSONObject0.put("response_code", zzdh$zzd0.getResponseCode());
        }
        catch(JSONException jSONException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error constructing JSON for http response.", jSONException0);
        }
        return jSONObject0;
    }

    @Override  // com.google.android.gms.internal.zzdg
    public void zza(zzid zzid0, Map map0) {
        zzhk.zza(new Runnable() {
            @Override
            public void run() {
                com.google.android.gms.ads.internal.util.client.zzb.zzay("Received Http request.");
                String s = (String)map0.get("http_request");
                JSONObject jSONObject0 = zzdh.this.zzT(s);
                if(jSONObject0 == null) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaz("Response should not be null.");
                    return;
                }
                com.google.android.gms.internal.zzdh.1.1 zzdh$1$10 = new Runnable() {
                    @Override
                    public void run() {
                        com.google.android.gms.internal.zzdh.1.this.zzwh.zzb("fetchHttpRequestCompleted", jSONObject0);
                        com.google.android.gms.ads.internal.util.client.zzb.zzay("Dispatched http response.");
                    }
                };
                zzhl.zzGk.post(zzdh$1$10);
            }
        });
    }

    protected zzb zzb(JSONObject jSONObject0) {
        URL uRL0;
        String s = jSONObject0.optString("http_request_id");
        String s1 = jSONObject0.optString("url");
        String s2 = jSONObject0.optString("post_body", null);
        try {
            uRL0 = new URL(s1);
        }
        catch(MalformedURLException malformedURLException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error constructing http request.", malformedURLException0);
            uRL0 = null;
        }
        ArrayList arrayList0 = new ArrayList();
        JSONArray jSONArray0 = jSONObject0.optJSONArray("headers");
        if(jSONArray0 == null) {
            jSONArray0 = new JSONArray();
        }
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject1 = jSONArray0.optJSONObject(v);
            if(jSONObject1 != null) {
                arrayList0.add(new zza(jSONObject1.optString("key"), jSONObject1.optString("value")));
            }
        }
        return new zzb(s, uRL0, arrayList0, s2);
    }
}

