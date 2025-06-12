package com.google.android.gms.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

class zzqk implements zzql {
    private HttpURLConnection zzaPT;

    @Override  // com.google.android.gms.internal.zzql
    public void close() {
        this.zzd(this.zzaPT);
    }

    private InputStream zzc(HttpURLConnection httpURLConnection0) throws IOException {
        int v = httpURLConnection0.getResponseCode();
        if(v == 200) {
            return httpURLConnection0.getInputStream();
        }
        if(v != 404) {
            throw new IOException("Bad response: " + v);
        }
        throw new FileNotFoundException("Bad response: " + 404);
    }

    private void zzd(HttpURLConnection httpURLConnection0) {
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
    }

    @Override  // com.google.android.gms.internal.zzql
    public InputStream zzfd(String s) throws IOException {
        this.zzaPT = this.zzfe(s);
        return this.zzc(this.zzaPT);
    }

    HttpURLConnection zzfe(String s) throws IOException {
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)new URL(s).openConnection();
        httpURLConnection0.setReadTimeout(20000);
        httpURLConnection0.setConnectTimeout(20000);
        return httpURLConnection0;
    }
}

