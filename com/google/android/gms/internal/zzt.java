package com.google.android.gms.internal;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

public class zzt implements zzf {
    protected static final boolean DEBUG;
    private static int zzao;
    private static int zzap;
    protected final zzy zzaq;
    protected final zzu zzar;

    static {
        zzt.DEBUG = zzs.DEBUG;
        zzt.zzao = 3000;
        zzt.zzap = 0x1000;
    }

    public zzt(zzy zzy0) {
        this(zzy0, new zzu(zzt.zzap));
    }

    public zzt(zzy zzy0, zzu zzu0) {
        this.zzaq = zzy0;
        this.zzar = zzu0;
    }

    protected static Map zza(Header[] arr_header) {
        Map map0 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for(int v = 0; v < arr_header.length; ++v) {
            map0.put(arr_header[v].getName(), arr_header[v].getValue());
        }
        return map0;
    }

    private void zza(long v, zzk zzk0, byte[] arr_b, StatusLine statusLine0) {
        if(zzt.DEBUG || v > ((long)zzt.zzao)) {
            Object[] arr_object = {zzk0, v, null, null, null};
            Integer integer0 = arr_b == null ? "null" : ((int)arr_b.length);
            arr_object[2] = integer0;
            arr_object[3] = statusLine0.getStatusCode();
            arr_object[4] = zzk0.zzu().zze();
            zzs.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", arr_object);
        }
    }

    private static void zza(String s, zzk zzk0, zzr zzr0) throws zzr {
        zzo zzo0 = zzk0.zzu();
        int v = zzk0.zzt();
        try {
            zzo0.zza(zzr0);
        }
        catch(zzr zzr1) {
            zzk0.zzc(String.format("%s-timeout-giveup [timeout=%s]", s, v));
            throw zzr1;
        }
        zzk0.zzc(String.format("%s-retry [timeout=%s]", s, v));
    }

    private void zza(Map map0, zza zzb$zza0) {
        if(zzb$zza0 != null) {
            if(zzb$zza0.zzb != null) {
                map0.put("If-None-Match", zzb$zza0.zzb);
            }
            if(zzb$zza0.zzd > 0L) {
                map0.put("If-Modified-Since", DateUtils.formatDate(new Date(zzb$zza0.zzd)));
            }
        }
    }

    private byte[] zza(HttpEntity httpEntity0) throws IOException, zzp {
        byte[] arr_b;
        int v = (int)httpEntity0.getContentLength();
        zzaa zzaa0 = new zzaa(this.zzar, v);
        try {
            InputStream inputStream0 = httpEntity0.getContent();
            if(inputStream0 == null) {
                throw new zzp();
            }
            arr_b = this.zzar.zzb(0x400);
            int v2;
            while((v2 = inputStream0.read(arr_b)) != -1) {
                zzaa0.write(arr_b, 0, v2);
            }
            return zzaa0.toByteArray();
        }
        finally {
            try {
                httpEntity0.consumeContent();
            }
            catch(IOException unused_ex) {
                zzs.zza("Error occured when calling consumingContent", new Object[0]);
            }
            this.zzar.zza(arr_b);
            zzaa0.close();
        }
    }

    @Override  // com.google.android.gms.internal.zzf
    public zzi zza(zzk zzk0) throws zzr {
        zzi zzi0;
        byte[] arr_b1;
        int v1;
        StatusLine statusLine0;
        HttpResponse httpResponse1;
        long v = SystemClock.elapsedRealtime();
        while(true) {
            HttpResponse httpResponse0 = null;
            Map map0 = Collections.emptyMap();
            try {
                HashMap hashMap0 = new HashMap();
                this.zza(hashMap0, zzk0.zzi());
                httpResponse1 = this.zzaq.zza(zzk0, hashMap0);
                goto label_10;
            }
            catch(SocketTimeoutException unused_ex) {
                zzt.zza("socket", zzk0, new zzq());
                continue;
            }
            catch(ConnectTimeoutException unused_ex) {
                zzt.zza("connection", zzk0, new zzq());
                continue;
            }
            catch(MalformedURLException malformedURLException0) {
                throw new RuntimeException("Bad URL " + zzk0.getUrl(), malformedURLException0);
            }
            catch(IOException iOException0) {
            }
            byte[] arr_b = null;
            goto label_41;
            try {
            label_10:
                statusLine0 = httpResponse1.getStatusLine();
                v1 = statusLine0.getStatusCode();
                map0 = zzt.zza(httpResponse1.getAllHeaders());
                if(v1 == 304) {
                    zza zzb$zza0 = zzk0.zzi();
                    if(zzb$zza0 == null) {
                        return new zzi(304, null, map0, true, SystemClock.elapsedRealtime() - v);
                    }
                    zzb$zza0.zzg.putAll(map0);
                    return new zzi(304, zzb$zza0.data, zzb$zza0.zzg, true, SystemClock.elapsedRealtime() - v);
                }
                arr_b1 = httpResponse1.getEntity() == null ? new byte[0] : this.zza(httpResponse1.getEntity());
                goto label_28;
            }
            catch(SocketTimeoutException unused_ex) {
                zzt.zza("socket", zzk0, new zzq());
                continue;
            }
            catch(ConnectTimeoutException unused_ex) {
                zzt.zza("connection", zzk0, new zzq());
                continue;
            }
            catch(MalformedURLException malformedURLException0) {
                throw new RuntimeException("Bad URL " + zzk0.getUrl(), malformedURLException0);
            }
            catch(IOException iOException0) {
            }
            arr_b = null;
            httpResponse0 = httpResponse1;
            goto label_41;
            try {
            label_28:
                this.zza(SystemClock.elapsedRealtime() - v, zzk0, arr_b1, statusLine0);
                if(v1 < 200 || v1 > 299) {
                    throw new IOException();
                }
                return new zzi(v1, arr_b1, map0, false, SystemClock.elapsedRealtime() - v);
            }
            catch(SocketTimeoutException unused_ex) {
                zzt.zza("socket", zzk0, new zzq());
                continue;
            }
            catch(ConnectTimeoutException unused_ex) {
                zzt.zza("connection", zzk0, new zzq());
                continue;
            }
            catch(MalformedURLException malformedURLException0) {
                throw new RuntimeException("Bad URL " + zzk0.getUrl(), malformedURLException0);
            }
            catch(IOException iOException0) {
                arr_b = arr_b1;
                httpResponse0 = httpResponse1;
            }
        label_41:
            if(httpResponse0 == null) {
                throw new zzj(iOException0);
            }
            int v2 = httpResponse0.getStatusLine().getStatusCode();
            zzs.zzc("Unexpected response code %d for %s", new Object[]{v2, zzk0.getUrl()});
            if(arr_b == null) {
                throw new zzh(null);
            }
            zzi0 = new zzi(v2, arr_b, map0, false, SystemClock.elapsedRealtime() - v);
            if(v2 != 401 && v2 != 403) {
                break;
            }
            zzt.zza("auth", zzk0, new com.google.android.gms.internal.zza(zzi0));
        }
        throw new zzp(zzi0);
    }
}

