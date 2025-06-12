package com.google.android.gms.internal;

import java.io.IOException;
import java.net.URI;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class zzw implements zzy {
    public static final class zza extends HttpEntityEnclosingRequestBase {
        public zza() {
        }

        public zza(String s) {
            this.setURI(URI.create(s));
        }

        public String getMethod() {
            return "PATCH";
        }
    }

    protected final HttpClient zzaE;

    public zzw(HttpClient httpClient0) {
        this.zzaE = httpClient0;
    }

    private static void zza(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase0, zzk zzk0) throws com.google.android.gms.internal.zza {
        byte[] arr_b = zzk0.zzq();
        if(arr_b != null) {
            httpEntityEnclosingRequestBase0.setEntity(((HttpEntity)new ByteArrayEntity(arr_b)));
        }
    }

    private static void zza(HttpUriRequest httpUriRequest0, Map map0) {
        for(Object object0: map0.keySet()) {
            httpUriRequest0.setHeader(((String)object0), ((String)map0.get(((String)object0))));
        }
    }

    @Override  // com.google.android.gms.internal.zzy
    public HttpResponse zza(zzk zzk0, Map map0) throws IOException, com.google.android.gms.internal.zza {
        HttpUriRequest httpUriRequest0 = zzw.zzb(zzk0, map0);
        zzw.zza(httpUriRequest0, map0);
        zzw.zza(httpUriRequest0, zzk0.getHeaders());
        HttpParams httpParams0 = httpUriRequest0.getParams();
        int v = zzk0.zzt();
        HttpConnectionParams.setConnectionTimeout(httpParams0, 5000);
        HttpConnectionParams.setSoTimeout(httpParams0, v);
        return this.zzaE.execute(httpUriRequest0);
    }

    protected void zza(HttpUriRequest httpUriRequest0) throws IOException {
    }

    static HttpUriRequest zzb(zzk zzk0, Map map0) throws com.google.android.gms.internal.zza {
        HttpUriRequest httpUriRequest0;
        switch(zzk0.getMethod()) {
            case -1: {
                byte[] arr_b = zzk0.zzm();
                if(arr_b != null) {
                    httpUriRequest0 = new HttpPost(zzk0.getUrl());
                    ((HttpPost)httpUriRequest0).addHeader("Content-Type", zzk0.zzl());
                    ((HttpPost)httpUriRequest0).setEntity(((HttpEntity)new ByteArrayEntity(arr_b)));
                    return httpUriRequest0;
                }
                return new HttpGet(zzk0.getUrl());
            }
            case 0: {
                return new HttpGet(zzk0.getUrl());
            }
            case 1: {
                httpUriRequest0 = new HttpPost(zzk0.getUrl());
                ((HttpPost)httpUriRequest0).addHeader("Content-Type", zzk0.zzp());
                zzw.zza(((HttpEntityEnclosingRequestBase)httpUriRequest0), zzk0);
                return httpUriRequest0;
            }
            case 2: {
                httpUriRequest0 = new HttpPut(zzk0.getUrl());
                ((HttpPut)httpUriRequest0).addHeader("Content-Type", zzk0.zzp());
                zzw.zza(((HttpEntityEnclosingRequestBase)httpUriRequest0), zzk0);
                return httpUriRequest0;
            }
            case 3: {
                return new HttpDelete(zzk0.getUrl());
            }
            case 4: {
                return new HttpHead(zzk0.getUrl());
            }
            case 5: {
                return new HttpOptions(zzk0.getUrl());
            }
            case 6: {
                return new HttpTrace(zzk0.getUrl());
            }
            case 7: {
                httpUriRequest0 = new zza(zzk0.getUrl());
                ((zza)httpUriRequest0).addHeader("Content-Type", zzk0.zzp());
                zzw.zza(((HttpEntityEnclosingRequestBase)httpUriRequest0), zzk0);
                return httpUriRequest0;
            }
            default: {
                throw new IllegalStateException("Unknown request method.");
            }
        }
    }
}

