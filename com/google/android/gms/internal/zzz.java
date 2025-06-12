package com.google.android.gms.internal;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public class zzz implements zzy {
    public interface zza {
        String zzh(String arg1);
    }

    private final zza zzaF;
    private final SSLSocketFactory zzaG;

    public zzz() {
        this(null);
    }

    public zzz(zza zzz$zza0) {
        this(zzz$zza0, null);
    }

    public zzz(zza zzz$zza0, SSLSocketFactory sSLSocketFactory0) {
        this.zzaF = zzz$zza0;
        this.zzaG = sSLSocketFactory0;
    }

    private HttpURLConnection zza(URL uRL0, zzk zzk0) throws IOException {
        HttpURLConnection httpURLConnection0 = this.zza(uRL0);
        int v = zzk0.zzt();
        httpURLConnection0.setConnectTimeout(v);
        httpURLConnection0.setReadTimeout(v);
        httpURLConnection0.setUseCaches(false);
        httpURLConnection0.setDoInput(true);
        if("https".equals(uRL0.getProtocol()) && this.zzaG != null) {
            ((HttpsURLConnection)httpURLConnection0).setSSLSocketFactory(this.zzaG);
        }
        return httpURLConnection0;
    }

    private static HttpEntity zza(HttpURLConnection httpURLConnection0) {
        InputStream inputStream0;
        HttpEntity httpEntity0 = new BasicHttpEntity();
        try {
            inputStream0 = httpURLConnection0.getInputStream();
        }
        catch(IOException unused_ex) {
            inputStream0 = httpURLConnection0.getErrorStream();
        }
        ((BasicHttpEntity)httpEntity0).setContent(inputStream0);
        ((BasicHttpEntity)httpEntity0).setContentLength(((long)httpURLConnection0.getContentLength()));
        ((BasicHttpEntity)httpEntity0).setContentEncoding(httpURLConnection0.getContentEncoding());
        ((BasicHttpEntity)httpEntity0).setContentType(httpURLConnection0.getContentType());
        return httpEntity0;
    }

    static void zza(HttpURLConnection httpURLConnection0, zzk zzk0) throws IOException, com.google.android.gms.internal.zza {
        switch(zzk0.getMethod()) {
            case -1: {
                byte[] arr_b = zzk0.zzm();
                if(arr_b != null) {
                    httpURLConnection0.setDoOutput(true);
                    httpURLConnection0.setRequestMethod("POST");
                    httpURLConnection0.addRequestProperty("Content-Type", zzk0.zzl());
                    DataOutputStream dataOutputStream0 = new DataOutputStream(httpURLConnection0.getOutputStream());
                    dataOutputStream0.write(arr_b);
                    dataOutputStream0.close();
                }
                return;
            }
            case 0: {
                httpURLConnection0.setRequestMethod("GET");
                return;
            }
            case 1: {
                httpURLConnection0.setRequestMethod("POST");
                zzz.zzb(httpURLConnection0, zzk0);
                return;
            }
            case 2: {
                httpURLConnection0.setRequestMethod("PUT");
                zzz.zzb(httpURLConnection0, zzk0);
                return;
            }
            case 3: {
                httpURLConnection0.setRequestMethod("DELETE");
                return;
            }
            case 4: {
                httpURLConnection0.setRequestMethod("HEAD");
                return;
            }
            case 5: {
                httpURLConnection0.setRequestMethod("OPTIONS");
                return;
            }
            case 6: {
                httpURLConnection0.setRequestMethod("TRACE");
                return;
            }
            case 7: {
                httpURLConnection0.setRequestMethod("PATCH");
                zzz.zzb(httpURLConnection0, zzk0);
                return;
            }
            default: {
                throw new IllegalStateException("Unknown method type.");
            }
        }
    }

    protected HttpURLConnection zza(URL uRL0) throws IOException {
        return (HttpURLConnection)uRL0.openConnection();
    }

    @Override  // com.google.android.gms.internal.zzy
    public HttpResponse zza(zzk zzk0, Map map0) throws IOException, com.google.android.gms.internal.zza {
        String s1;
        String s = zzk0.getUrl();
        HashMap hashMap0 = new HashMap();
        hashMap0.putAll(zzk0.getHeaders());
        hashMap0.putAll(map0);
        if(this.zzaF == null) {
            s1 = s;
        }
        else {
            s1 = this.zzaF.zzh(s);
            if(s1 == null) {
                throw new IOException("URL blocked by rewriter: " + s);
            }
        }
        HttpURLConnection httpURLConnection0 = this.zza(new URL(s1), zzk0);
        for(Object object0: hashMap0.keySet()) {
            httpURLConnection0.addRequestProperty(((String)object0), ((String)hashMap0.get(((String)object0))));
        }
        zzz.zza(httpURLConnection0, zzk0);
        ProtocolVersion protocolVersion0 = new ProtocolVersion("HTTP", 1, 1);
        if(httpURLConnection0.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        HttpResponse httpResponse0 = new BasicHttpResponse(((StatusLine)new BasicStatusLine(protocolVersion0, httpURLConnection0.getResponseCode(), httpURLConnection0.getResponseMessage())));
        ((BasicHttpResponse)httpResponse0).setEntity(zzz.zza(httpURLConnection0));
        for(Object object1: httpURLConnection0.getHeaderFields().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            if(map$Entry0.getKey() != null) {
                ((BasicHttpResponse)httpResponse0).addHeader(((Header)new BasicHeader(((String)map$Entry0.getKey()), ((String)((List)map$Entry0.getValue()).get(0)))));
            }
        }
        return httpResponse0;
    }

    private static void zzb(HttpURLConnection httpURLConnection0, zzk zzk0) throws IOException, com.google.android.gms.internal.zza {
        byte[] arr_b = zzk0.zzq();
        if(arr_b != null) {
            httpURLConnection0.setDoOutput(true);
            httpURLConnection0.addRequestProperty("Content-Type", zzk0.zzp());
            DataOutputStream dataOutputStream0 = new DataOutputStream(httpURLConnection0.getOutputStream());
            dataOutputStream0.write(arr_b);
            dataOutputStream0.close();
        }
    }
}

