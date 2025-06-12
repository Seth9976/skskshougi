package com.google.android.gms.analytics.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import com.google.android.gms.common.internal.zzu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;

class zzah extends zzd {
    class zza {
        private int zzMt;
        private ByteArrayOutputStream zzMu;
        final zzah zzMv;

        public zza() {
            this.zzMu = new ByteArrayOutputStream();
        }

        public byte[] getPayload() {
            return this.zzMu.toByteArray();
        }

        public boolean zzj(zzab zzab0) {
            zzu.zzu(zzab0);
            if(this.zzMt + 1 > zzah.this.zzhR().zzji()) {
                return false;
            }
            String s = zzah.this.zza(zzab0, false);
            if(s == null) {
                zzah.this.zzhQ().zza(zzab0, "Error formatting hit");
                return true;
            }
            byte[] arr_b = s.getBytes();
            int v = arr_b.length;
            if(v > zzah.this.zzhR().zzja()) {
                zzah.this.zzhQ().zza(zzab0, "Hit size exceeds the maximum size limit");
                return true;
            }
            if(this.zzMu.size() > 0) {
                ++v;
            }
            if(v + this.zzMu.size() > zzah.this.zzhR().zzjc()) {
                return false;
            }
            try {
                if(this.zzMu.size() > 0) {
                    this.zzMu.write(new byte[]{10});
                }
                this.zzMu.write(arr_b);
                ++this.zzMt;
            }
            catch(IOException iOException0) {
                zzah.this.zze("Failed to write payload when batching hits", iOException0);
            }
            return true;
        }

        public int zzkj() {
            return this.zzMt;
        }
    }

    private final String zzFP;
    private final zzaj zzMr;
    private static final byte[] zzMs;

    static {
        zzah.zzMs = new byte[]{10};
    }

    zzah(zzf zzf0) {
        super(zzf0);
        this.zzFP = zzah.zza("GoogleAnalytics", "7.5.71", Build.VERSION.RELEASE, zzam.zza(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzMr = new zzaj(zzf0.zzhP());
    }

    private int zza(URL uRL0, byte[] arr_b) {
        int v;
        HttpURLConnection httpURLConnection0;
        OutputStream outputStream0 = null;
        zzu.zzu(uRL0);
        zzu.zzu(arr_b);
        this.zzb("POST bytes, url", ((int)arr_b.length), uRL0);
        if(this.zzhZ()) {
            this.zza("Post payload\n", new String(arr_b));
        }
        try {
            try {
                httpURLConnection0 = null;
                httpURLConnection0 = this.zzc(uRL0);
                httpURLConnection0.setDoOutput(true);
                httpURLConnection0.setFixedLengthStreamingMode(arr_b.length);
                httpURLConnection0.connect();
                outputStream0 = httpURLConnection0.getOutputStream();
                outputStream0.write(arr_b);
                this.zzb(httpURLConnection0);
                v = httpURLConnection0.getResponseCode();
                if(v == 200) {
                    this.zzhl().zzhL();
                }
                this.zzb("POST status", v);
                goto label_39;
            }
            catch(IOException iOException0) {
            }
            v = 0;
            this.zzd("Network POST connection error", iOException0);
            if(outputStream0 != null) {
                goto label_23;
            }
            goto label_27;
        }
        catch(Throwable throwable0) {
            goto label_31;
        }
        try {
        label_23:
            outputStream0.close();
        }
        catch(IOException iOException1) {
            this.zze("Error closing http post connection output stream", iOException1);
        }
    label_27:
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
            return 0;
        label_31:
            if(outputStream0 != null) {
                try {
                    outputStream0.close();
                }
                catch(IOException iOException2) {
                    this.zze("Error closing http post connection output stream", iOException2);
                }
            }
            if(httpURLConnection0 != null) {
                httpURLConnection0.disconnect();
            }
            throw throwable0;
            try {
            label_39:
                outputStream0.close();
            }
            catch(IOException iOException3) {
                this.zze("Error closing http post connection output stream", iOException3);
            }
            httpURLConnection0.disconnect();
        }
        return v;
    }

    private static String zza(String s, String s1, String s2, String s3, String s4, String s5) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", s, s1, s2, s3, s4, s5);
    }

    private void zza(StringBuilder stringBuilder0, String s, String s1) throws UnsupportedEncodingException {
        if(stringBuilder0.length() != 0) {
            stringBuilder0.append('&');
        }
        stringBuilder0.append(URLEncoder.encode(s, "UTF-8"));
        stringBuilder0.append('=');
        stringBuilder0.append(URLEncoder.encode(s1, "UTF-8"));
    }

    String zza(zzab zzab0, boolean z) {
        zzu.zzu(zzab0);
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            for(Object object0: zzab0.zzn().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = (String)map$Entry0.getKey();
                if(!"ht".equals(s) && !"qt".equals(s) && !"AppUID".equals(s) && !"z".equals(s) && !"_gmsv".equals(s)) {
                    this.zza(stringBuilder0, s, ((String)map$Entry0.getValue()));
                }
            }
            this.zza(stringBuilder0, "ht", String.valueOf(zzab0.zzjW()));
            this.zza(stringBuilder0, "qt", String.valueOf(this.zzhP().currentTimeMillis() - zzab0.zzjW()));
            if(this.zzhR().zziW()) {
                this.zza(stringBuilder0, "_gmsv", "7.5.71");
            }
            if(z) {
                long v = zzab0.zzjZ();
                this.zza(stringBuilder0, "z", (v == 0L ? this.zzi(zzab0) : String.valueOf(v)));
            }
            return stringBuilder0.toString();
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            this.zze("Failed to encode name or value", unsupportedEncodingException0);
            return null;
        }
    }

    List zza(List list0, boolean z) {
        zzu.zzV(!list0.isEmpty());
        this.zza("Uploading batched hits. compression, count", Boolean.valueOf(z), list0.size());
        zza zzah$zza0 = new zza(this);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(!zzah$zza0.zzj(((zzab)object0))) {
                break;
            }
            arrayList0.add(((zzab)object0).zzjV());
        }
        if(zzah$zza0.zzkj() == 0) {
            return arrayList0;
        }
        URL uRL0 = this.zzkh();
        if(uRL0 == null) {
            this.zzaX("Failed to build batching endpoint url");
            return Collections.emptyList();
        }
        int v = z ? this.zzb(uRL0, zzah$zza0.getPayload()) : this.zza(uRL0, zzah$zza0.getPayload());
        if(200 == v) {
            this.zza("Batched upload completed. Hits batched", zzah$zza0.zzkj());
            return arrayList0;
        }
        this.zza("Network error uploading hits. status code", v);
        if(this.zzhR().zzjq().contains(v)) {
            this.zzaW("Server instructed the client to stop batching");
            this.zzMr.start();
        }
        return Collections.emptyList();
    }

    private int zzb(URL uRL0) {
        int v;
        zzu.zzu(uRL0);
        this.zzb("GET request", uRL0);
        HttpURLConnection httpURLConnection0 = null;
        try {
            try {
                httpURLConnection0 = this.zzc(uRL0);
                httpURLConnection0.connect();
                this.zzb(httpURLConnection0);
                v = httpURLConnection0.getResponseCode();
                if(v == 200) {
                    this.zzhl().zzhL();
                }
                this.zzb("GET status", v);
                goto label_21;
            }
            catch(IOException iOException0) {
            }
            v = 0;
            this.zzd("Network GET connection error", iOException0);
            if(httpURLConnection0 != null) {
                goto label_15;
            }
            return v;
        }
        catch(Throwable throwable0) {
            goto label_18;
        }
    label_15:
        httpURLConnection0.disconnect();
        return 0;
    label_18:
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        throw throwable0;
    label_21:
        httpURLConnection0.disconnect();
        return v;
    }

    private int zzb(URL uRL0, byte[] arr_b) {
        int v;
        HttpURLConnection httpURLConnection1;
        HttpURLConnection httpURLConnection0;
        byte[] arr_b1;
        OutputStream outputStream0 = null;
        zzu.zzu(uRL0);
        zzu.zzu(arr_b);
        try {
            arr_b1 = zzah.zzg(arr_b);
            this.zza("POST compressed size, ratio %, url", ((int)arr_b1.length), ((long)(100L * ((long)arr_b1.length) / ((long)arr_b.length))), uRL0);
            if(arr_b1.length > arr_b.length) {
                this.zzc("Compressed payload is larger then uncompressed. compressed, uncompressed", ((int)arr_b1.length), ((int)arr_b.length));
            }
            if(this.zzhZ()) {
                this.zza("Post payload", "\n" + new String(arr_b));
            }
            httpURLConnection0 = this.zzc(uRL0);
        }
        catch(IOException iOException0) {
            httpURLConnection1 = null;
            goto label_40;
        }
        catch(Throwable throwable0) {
            httpURLConnection0 = null;
            goto label_55;
        }
        try {
            httpURLConnection0.setDoOutput(true);
            httpURLConnection0.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection0.setFixedLengthStreamingMode(arr_b1.length);
            httpURLConnection0.connect();
            OutputStream outputStream1 = httpURLConnection0.getOutputStream();
            try {
                outputStream1.write(arr_b1);
                outputStream1.close();
            }
            catch(IOException iOException0) {
                outputStream0 = outputStream1;
                httpURLConnection1 = httpURLConnection0;
                goto label_40;
            }
            catch(Throwable throwable0) {
                outputStream0 = outputStream1;
                goto label_55;
            }
            this.zzb(httpURLConnection0);
            v = httpURLConnection0.getResponseCode();
            if(v == 200) {
                this.zzhl().zzhL();
            }
            this.zzb("POST status", v);
            goto label_63;
        }
        catch(IOException iOException0) {
            httpURLConnection1 = httpURLConnection0;
            try {
            label_40:
                v = 0;
                this.zzd("Network compressed POST connection error", iOException0);
            }
            catch(Throwable throwable0) {
                httpURLConnection0 = httpURLConnection1;
                goto label_55;
            }
            if(outputStream0 != null) {
                try {
                    outputStream0.close();
                }
                catch(IOException iOException1) {
                    this.zze("Error closing http compressed post connection output stream", iOException1);
                }
            }
            if(httpURLConnection1 != null) {
                httpURLConnection1.disconnect();
                return 0;
            }
            return v;
        }
        catch(Throwable throwable0) {
        }
    label_55:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(IOException iOException2) {
                this.zze("Error closing http compressed post connection output stream", iOException2);
            }
        }
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        throw throwable0;
    label_63:
        httpURLConnection0.disconnect();
        return v;
    }

    // 去混淆评级： 低(36)
    private URL zzb(zzab zzab0, String s) {
        String s1 = zzab0.zzjY() ? "https://ssl.google-analytics.com/collect?" + s : "http://www.google-analytics.com/collect?" + s;
        try {
            return new URL(s1);
        }
        catch(MalformedURLException malformedURLException0) {
            this.zze("Error trying to parse the hardcoded host url", malformedURLException0);
            return null;
        }
    }

    private void zzb(HttpURLConnection httpURLConnection0) throws IOException {
        InputStream inputStream0 = null;
        try {
            inputStream0 = httpURLConnection0.getInputStream();
            while(inputStream0.read(new byte[0x400]) > 0) {
            }
        }
        catch(Throwable throwable0) {
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(IOException iOException0) {
                    this.zze("Error closing http connection input stream", iOException0);
                }
            }
            throw throwable0;
        }
        try {
            inputStream0.close();
        }
        catch(IOException iOException1) {
            this.zze("Error closing http connection input stream", iOException1);
        }
    }

    HttpURLConnection zzc(URL uRL0) throws IOException {
        URLConnection uRLConnection0 = uRL0.openConnection();
        if(!(uRLConnection0 instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        ((HttpURLConnection)uRLConnection0).setDefaultUseCaches(false);
        ((HttpURLConnection)uRLConnection0).setConnectTimeout(this.zzhR().zzjz());
        ((HttpURLConnection)uRLConnection0).setReadTimeout(this.zzhR().zzjA());
        ((HttpURLConnection)uRLConnection0).setInstanceFollowRedirects(false);
        ((HttpURLConnection)uRLConnection0).setRequestProperty("User-Agent", this.zzFP);
        ((HttpURLConnection)uRLConnection0).setDoInput(true);
        return (HttpURLConnection)uRLConnection0;
    }

    public List zzf(List list0) {
        boolean z1;
        boolean z = true;
        this.zzhO();
        this.zzia();
        zzu.zzu(list0);
        if(this.zzhR().zzjq().isEmpty()) {
            z = false;
            z1 = false;
        }
        else {
            long v = this.zzhR().zzjj();
            if(!this.zzMr.zzv(v * 1000L)) {
                return this.zzg(list0);
            }
            z1 = this.zzhR().zzjo() != zzm.zzKz;
            if(this.zzhR().zzjp() != zzo.zzKL) {
                return z1 ? this.zza(list0, false) : this.zzg(list0);
            }
        }
        return z1 ? this.zza(list0, z) : this.zzg(list0);
    }

    private boolean zzg(zzab zzab0) {
        zzu.zzu(zzab0);
        String s = this.zza(zzab0, !zzab0.zzjY());
        if(s == null) {
            this.zzhQ().zza(zzab0, "Error formatting hit for upload");
            return true;
        }
        if(s.length() <= this.zzhR().zziZ()) {
            URL uRL0 = this.zzb(zzab0, s);
            if(uRL0 == null) {
                this.zzaX("Failed to build collect GET endpoint url");
                return false;
            }
            return this.zzb(uRL0) == 200;
        }
        String s1 = this.zza(zzab0, false);
        if(s1 == null) {
            this.zzhQ().zza(zzab0, "Error formatting hit for POST upload");
            return true;
        }
        byte[] arr_b = s1.getBytes();
        int v = this.zzhR().zzjb();
        if(arr_b.length > v) {
            this.zzhQ().zza(zzab0, "Hit payload exceeds size limit");
            return true;
        }
        URL uRL1 = this.zzh(zzab0);
        if(uRL1 == null) {
            this.zzaX("Failed to build collect POST endpoint url");
            return false;
        }
        return this.zza(uRL1, arr_b) == 200;
    }

    private static byte[] zzg(byte[] arr_b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
        gZIPOutputStream0.write(arr_b);
        gZIPOutputStream0.close();
        byteArrayOutputStream0.close();
        return byteArrayOutputStream0.toByteArray();
    }

    List zzg(List list0) {
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            if(!this.zzg(((zzab)object0))) {
                break;
            }
            list1.add(((zzab)object0).zzjV());
            if(list1.size() >= this.zzhR().zzjh()) {
                return list1;
            }
            if(false) {
                break;
            }
        }
        return list1;
    }

    // 去混淆评级： 低(28)
    private URL zzh(zzab zzab0) {
        String s = zzab0.zzjY() ? "https://ssl.google-analytics.com/collect" : "http://www.google-analytics.com/collect";
        try {
            return new URL(s);
        }
        catch(MalformedURLException malformedURLException0) {
            this.zze("Error trying to parse the hardcoded host url", malformedURLException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
        this.zza("Network initialized. User agent", this.zzFP);
    }

    private String zzi(zzab zzab0) {
        return String.valueOf(zzab0.zzjV());
    }

    public boolean zzkg() {
        NetworkInfo networkInfo0;
        this.zzhO();
        this.zzia();
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.getContext().getSystemService("connectivity");
        try {
            networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        }
        catch(SecurityException unused_ex) {
            networkInfo0 = null;
        }
        if(networkInfo0 == null || !networkInfo0.isConnected()) {
            this.zzaT("No network connectivity");
            return false;
        }
        return true;
    }

    // 去混淆评级： 低(20)
    private URL zzkh() {
        try {
            return new URL("https://ssl.google-analytics.com/batch");
        }
        catch(MalformedURLException malformedURLException0) {
            this.zze("Error trying to parse the hardcoded host url", malformedURLException0);
            return null;
        }
    }

    static byte[] zzki() [...] // Potential decryptor
}

