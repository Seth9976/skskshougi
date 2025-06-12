package com.google.android.gms.internal;

import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public class zzx {
    public static String zza(Map map0) {
        return zzx.zzb(map0, "ISO-8859-1");
    }

    public static zza zzb(zzi zzi0) {
        long v10;
        long v9;
        boolean z1;
        boolean z;
        long v = System.currentTimeMillis();
        Map map0 = zzi0.zzA;
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        String s = (String)map0.get("Date");
        if(s != null) {
            v1 = zzx.zzg(s);
        }
        String s1 = (String)map0.get("Cache-Control");
        if(s1 == null) {
            z = false;
            z1 = false;
        }
        else {
            String[] arr_s = s1.split(",");
            z = false;
            long v5 = 0L;
            long v6 = 0L;
            for(int v4 = 0; v4 < arr_s.length; ++v4) {
                String s2 = arr_s[v4].trim();
                if(s2.equals("no-cache") || s2.equals("no-store")) {
                    return null;
                }
                if(s2.startsWith("max-age=")) {
                    try {
                        v6 = Long.parseLong(s2.substring(8));
                    }
                    catch(Exception unused_ex) {
                    }
                }
                else if(s2.startsWith("stale-while-revalidate=")) {
                    try {
                        v5 = Long.parseLong(s2.substring(23));
                    }
                    catch(Exception unused_ex) {
                    }
                }
                else if(s2.equals("must-revalidate") || s2.equals("proxy-revalidate")) {
                    z = true;
                }
            }
            v2 = v6;
            v3 = v5;
            z1 = true;
        }
        String s3 = (String)map0.get("Expires");
        long v7 = s3 == null ? 0L : zzx.zzg(s3);
        String s4 = (String)map0.get("Last-Modified");
        long v8 = s4 == null ? 0L : zzx.zzg(s4);
        String s5 = (String)map0.get("ETag");
        if(z1) {
            v9 = v + 1000L * v2;
            v10 = z ? v9 : 1000L * v3 + v9;
        }
        else if(v1 <= 0L || v7 < v1) {
            v10 = 0L;
            v9 = 0L;
        }
        else {
            v10 = v7 - v1 + v;
            v9 = v10;
        }
        zza zzb$zza0 = new zza();
        zzb$zza0.data = zzi0.data;
        zzb$zza0.zzb = s5;
        zzb$zza0.zzf = v9;
        zzb$zza0.zze = v10;
        zzb$zza0.zzc = v1;
        zzb$zza0.zzd = v8;
        zzb$zza0.zzg = map0;
        return zzb$zza0;
    }

    public static String zzb(Map map0, String s) {
        String s1 = (String)map0.get("Content-Type");
        if(s1 != null) {
            String[] arr_s = s1.split(";");
            for(int v = 1; v < arr_s.length; ++v) {
                String[] arr_s1 = arr_s[v].trim().split("=");
                if(arr_s1.length == 2 && arr_s1[0].equals("charset")) {
                    return arr_s1[1];
                }
            }
        }
        return s;
    }

    public static long zzg(String s) {
        try {
            return DateUtils.parseDate(s).getTime();
        }
        catch(DateParseException unused_ex) {
            return 0L;
        }
    }
}

