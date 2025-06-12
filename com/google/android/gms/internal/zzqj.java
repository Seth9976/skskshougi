package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbg;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

class zzqj implements zzql {
    private HttpClient zzaE;

    @Override  // com.google.android.gms.internal.zzql
    public void close() {
        this.zza(this.zzaE);
    }

    HttpClient zzAF() {
        BasicHttpParams basicHttpParams0 = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((HttpParams)basicHttpParams0), 20000);
        HttpConnectionParams.setSoTimeout(((HttpParams)basicHttpParams0), 20000);
        return new DefaultHttpClient(((HttpParams)basicHttpParams0));
    }

    private InputStream zza(HttpClient httpClient0, HttpResponse httpResponse0) throws IOException {
        int v = httpResponse0.getStatusLine().getStatusCode();
        if(v == 200) {
            zzbg.zzaB("Success response");
            return httpResponse0.getEntity().getContent();
        }
        if(v != 404) {
            throw new IOException("Bad response: " + v);
        }
        throw new FileNotFoundException("Bad response: " + 404);
    }

    private void zza(HttpClient httpClient0) {
        if(httpClient0 != null && httpClient0.getConnectionManager() != null) {
            httpClient0.getConnectionManager().shutdown();
        }
    }

    @Override  // com.google.android.gms.internal.zzql
    public InputStream zzfd(String s) throws IOException {
        this.zzaE = this.zzAF();
        HttpResponse httpResponse0 = this.zzaE.execute(((HttpUriRequest)new HttpGet(s)));
        return this.zza(this.zzaE, httpResponse0);
    }
}

