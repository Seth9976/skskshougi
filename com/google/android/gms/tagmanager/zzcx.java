package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

class zzcx implements zzac {
    public interface zza {
        void zza(zzaq arg1);

        void zzb(zzaq arg1);

        void zzc(zzaq arg1);
    }

    private final Context zzaNE;
    private final String zzaNV;
    private final HttpClient zzaNW;
    private zza zzaNX;

    zzcx(HttpClient httpClient0, Context context0, zza zzcx$zza0) {
        this.zzaNE = context0.getApplicationContext();
        this.zzaNV = this.zza("GoogleTagManager", "4.00", Build.VERSION.RELEASE, zzcx.zzc(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzaNW = httpClient0;
        this.zzaNX = zzcx$zza0;
    }

    private void zza(HttpEntityEnclosingRequest httpEntityEnclosingRequest0) {
        StringBuffer stringBuffer0 = new StringBuffer();
        Header[] arr_header = httpEntityEnclosingRequest0.getAllHeaders();
        for(int v = 0; v < arr_header.length; ++v) {
            stringBuffer0.append(arr_header[v].toString()).append("\n");
        }
        stringBuffer0.append(httpEntityEnclosingRequest0.getRequestLine().toString()).append("\n");
        if(httpEntityEnclosingRequest0.getEntity() != null) {
            try {
                InputStream inputStream0 = httpEntityEnclosingRequest0.getEntity().getContent();
                if(inputStream0 != null) {
                    int v1 = inputStream0.available();
                    if(v1 > 0) {
                        byte[] arr_b = new byte[v1];
                        inputStream0.read(arr_b);
                        stringBuffer0.append("POST:\n");
                        stringBuffer0.append(new String(arr_b)).append("\n");
                    }
                }
            }
            catch(IOException unused_ex) {
                zzbg.zzaB("Error Writing hit to log...");
            }
        }
        zzbg.zzaB(stringBuffer0.toString());
    }

    String zza(String s, String s1, String s2, String s3, String s4, String s5) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", s, s1, s2, s3, s4, s5);
    }

    static String zzc(Locale locale0) {
        if(locale0 != null && (locale0.getLanguage() != null && locale0.getLanguage().length() != 0)) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(locale0.getLanguage().toLowerCase());
            if(locale0.getCountry() != null && locale0.getCountry().length() != 0) {
                stringBuilder0.append("-").append(locale0.getCountry().toLowerCase());
            }
            return stringBuilder0.toString();
        }
        return null;
    }

    private HttpEntityEnclosingRequest zzd(URL uRL0) {
        URISyntaxException uRISyntaxException1;
        HttpEntityEnclosingRequest httpEntityEnclosingRequest0;
        try {
            httpEntityEnclosingRequest0 = new BasicHttpEntityEnclosingRequest("GET", uRL0.toURI().toString());
        }
        catch(URISyntaxException uRISyntaxException0) {
            httpEntityEnclosingRequest0 = null;
            uRISyntaxException1 = uRISyntaxException0;
            zzbg.zzaC(("Exception sending hit: " + uRISyntaxException1.getClass().getSimpleName()));
            zzbg.zzaC(uRISyntaxException1.getMessage());
            return httpEntityEnclosingRequest0;
        }
        try {
            httpEntityEnclosingRequest0.addHeader("User-Agent", this.zzaNV);
            return httpEntityEnclosingRequest0;
        }
        catch(URISyntaxException uRISyntaxException1) {
        }
        zzbg.zzaC(("Exception sending hit: " + uRISyntaxException1.getClass().getSimpleName()));
        zzbg.zzaC(uRISyntaxException1.getMessage());
        return httpEntityEnclosingRequest0;
    }

    URL zzd(zzaq zzaq0) {
        String s = zzaq0.zzyQ();
        try {
            return new URL(s);
        }
        catch(MalformedURLException unused_ex) {
            zzbg.zzaz("Error trying to parse the GTM url.");
            return null;
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzac
    public void zzr(List list0) {
        int v3;
        int v = Math.min(list0.size(), 40);
        int v2 = 0;
        for(int v1 = 1; v2 < v; v1 = v3) {
            zzaq zzaq0 = (zzaq)list0.get(v2);
            URL uRL0 = this.zzd(zzaq0);
            if(uRL0 == null) {
                zzbg.zzaC("No destination: discarding hit.");
                this.zzaNX.zzb(zzaq0);
                v3 = v1;
            }
            else {
                HttpEntityEnclosingRequest httpEntityEnclosingRequest0 = this.zzd(uRL0);
                if(httpEntityEnclosingRequest0 == null) {
                    this.zzaNX.zzb(zzaq0);
                    v3 = v1;
                }
                else {
                    HttpHost httpHost0 = new HttpHost(uRL0.getHost(), uRL0.getPort(), uRL0.getProtocol());
                    httpEntityEnclosingRequest0.addHeader("Host", httpHost0.toHostString());
                    this.zza(httpEntityEnclosingRequest0);
                    try {
                        if(v1 != 0) {
                            zzbl.zzaJ(this.zzaNE);
                            v1 = 0;
                        }
                        HttpResponse httpResponse0 = this.zzaNW.execute(httpHost0, ((HttpRequest)httpEntityEnclosingRequest0));
                        int v4 = httpResponse0.getStatusLine().getStatusCode();
                        HttpEntity httpEntity0 = httpResponse0.getEntity();
                        if(httpEntity0 != null) {
                            httpEntity0.consumeContent();
                        }
                        if(v4 == 200) {
                            this.zzaNX.zza(zzaq0);
                        }
                        else {
                            zzbg.zzaC(("Bad response: " + httpResponse0.getStatusLine().getStatusCode()));
                            this.zzaNX.zzc(zzaq0);
                        }
                        v3 = 0;
                    }
                    catch(ClientProtocolException unused_ex) {
                        zzbg.zzaC("ClientProtocolException sending hit; discarding hit...");
                        this.zzaNX.zzb(zzaq0);
                        v3 = v1;
                    }
                    catch(IOException iOException0) {
                        zzbg.zzaC(("Exception sending hit: " + iOException0.getClass().getSimpleName()));
                        zzbg.zzaC(iOException0.getMessage());
                        this.zzaNX.zzc(zzaq0);
                        v3 = v1;
                    }
                }
            }
            ++v2;
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzac
    public boolean zzyH() {
        NetworkInfo networkInfo0 = ((ConnectivityManager)this.zzaNE.getSystemService("connectivity")).getActiveNetworkInfo();
        if(networkInfo0 == null || !networkInfo0.isConnected()) {
            zzbg.zzaB("...no network connectivity");
            return false;
        }
        return true;
    }
}

