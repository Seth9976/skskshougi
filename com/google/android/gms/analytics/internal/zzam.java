package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzny;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public class zzam {
    private static final char[] zzMK;

    static {
        zzam.zzMK = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    // 去混淆评级： 低(20)
    public static String zzH(boolean z) {
        return z ? "1" : "0";
    }

    public static double zza(String s, double f) {
        if(s == null) {
            return f;
        }
        try {
            return Double.parseDouble(s);
        }
        catch(NumberFormatException unused_ex) {
            return f;
        }
    }

    public static zzny zza(zzaf zzaf0, String s) {
        List list0;
        zzu.zzu(zzaf0);
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            list0 = URLEncodedUtils.parse(new URI("?" + s), "UTF-8");
        }
        catch(URISyntaxException uRISyntaxException0) {
            zzaf0.zzd("No valid campaign data found", uRISyntaxException0);
            return null;
        }
        HashMap hashMap0 = new HashMap(list0.size());
        for(Object object0: list0) {
            hashMap0.put(((NameValuePair)object0).getName(), ((NameValuePair)object0).getValue());
        }
        zzny zzny0 = new zzny();
        zzny0.zzdA(((String)hashMap0.get("utm_content")));
        zzny0.zzdy(((String)hashMap0.get("utm_medium")));
        zzny0.setName(((String)hashMap0.get("utm_campaign")));
        zzny0.zzdx(((String)hashMap0.get("utm_source")));
        zzny0.zzdz(((String)hashMap0.get("utm_term")));
        zzny0.zzdB(((String)hashMap0.get("utm_id")));
        zzny0.zzdC(((String)hashMap0.get("anid")));
        zzny0.zzdD(((String)hashMap0.get("gclid")));
        zzny0.zzdE(((String)hashMap0.get("dclid")));
        zzny0.zzdF(((String)hashMap0.get("aclid")));
        return zzny0;
    }

    public static String zza(Locale locale0) {
        if(locale0 != null) {
            String s = locale0.getLanguage();
            if(!TextUtils.isEmpty(s)) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(s.toLowerCase());
                if(!TextUtils.isEmpty(locale0.getCountry())) {
                    stringBuilder0.append("-").append(locale0.getCountry().toLowerCase());
                }
                return stringBuilder0.toString();
            }
        }
        return null;
    }

    public static void zza(Map map0, String s, Map map1) {
        zzam.zzb(map0, s, ((String)map1.get(s)));
    }

    public static boolean zza(double f, String s) {
        return f > 0.0 && f < 100.0 ? ((double)(zzam.zzbm(s) % 10000)) >= 100.0 * f : false;
    }

    public static boolean zza(Context context0, Class class0) {
        try {
            ServiceInfo serviceInfo0 = context0.getPackageManager().getServiceInfo(new ComponentName(context0, class0), 4);
            if(serviceInfo0 != null) {
                return serviceInfo0.enabled;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    public static boolean zza(Context context0, Class class0, boolean z) {
        try {
            ActivityInfo activityInfo0 = context0.getPackageManager().getReceiverInfo(new ComponentName(context0, class0), 2);
            if(activityInfo0 == null || !activityInfo0.enabled) {
                return false;
            }
            return z ? activityInfo0.exported : true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return false;
        }
    }

    public static void zzb(Map map0, String s, String s1) {
        if(s1 != null && !map0.containsKey(s)) {
            map0.put(s, s1);
        }
    }

    public static void zzb(Map map0, String s, boolean z) {
        if(!map0.containsKey(s)) {
            map0.put(s, (z ? "1" : "0"));
        }
    }

    public static Map zzbi(String s) {
        Map map0 = new HashMap();
        String[] arr_s = s.split("&");
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split("=", 3);
            if(arr_s1.length > 1) {
                map0.put(arr_s1[0], (TextUtils.isEmpty(arr_s1[1]) ? null : arr_s1[1]));
                if(arr_s1.length == 3 && !TextUtils.isEmpty(arr_s1[1]) && !map0.containsKey(arr_s1[1])) {
                    map0.put(arr_s1[1], (TextUtils.isEmpty(arr_s1[2]) ? null : arr_s1[2]));
                }
            }
            else if(arr_s1.length == 1 && arr_s1[0].length() != 0) {
                map0.put(arr_s1[0], null);
            }
        }
        return map0;
    }

    public static long zzbj(String s) {
        if(s == null) {
            return 0L;
        }
        try {
            return Long.parseLong(s);
        }
        catch(NumberFormatException unused_ex) {
            return 0L;
        }
    }

    public static String zzbk(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(s.contains("?")) {
            String[] arr_s = s.split("[\\?]");
            if(arr_s.length > 1) {
                s = arr_s[1];
            }
        }
        if(s.contains("%3D")) {
            try {
                s = URLDecoder.decode(s, "UTF-8");
            }
            catch(UnsupportedEncodingException unused_ex) {
                return null;
            }
        }
        else if(!s.contains("=")) {
            return null;
        }
        Map map0 = zzam.zzbi(s);
        String[] arr_s1 = {"dclid", "utm_source", "gclid", "aclid", "utm_campaign", "utm_medium", "utm_term", "utm_content", "utm_id", "anid", "gmob_t"};
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < 11; ++v) {
            if(!TextUtils.isEmpty(((CharSequence)map0.get(arr_s1[v])))) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append("&");
                }
                stringBuilder0.append(arr_s1[v]).append("=").append(((String)map0.get(arr_s1[v])));
            }
        }
        return stringBuilder0.toString();
    }

    public static MessageDigest zzbl(String s) {
        for(int v = 0; v < 2; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance(s);
                if(messageDigest0 != null) {
                    return messageDigest0;
                }
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
        }
        return null;
    }

    public static int zzbm(String s) {
        int v = 1;
        if(!TextUtils.isEmpty(s)) {
            v = 0;
            for(int v1 = s.length() - 1; v1 >= 0; --v1) {
                int v2 = s.charAt(v1);
                v = (v << 6 & 0xFFFFFFF) + v2 + (v2 << 14);
                int v3 = 0xFE00000 & v;
                if(v3 != 0) {
                    v ^= v3 >> 21;
                }
            }
        }
        return v;
    }

    // 去混淆评级： 低(30)
    public static boolean zzbn(String s) {
        return TextUtils.isEmpty(s) ? true : !s.startsWith("http:");
    }

    public static void zzc(Map map0, String s, String s1) {
        if(s1 != null && TextUtils.isEmpty(((CharSequence)map0.get(s)))) {
            map0.put(s, s1);
        }
    }

    public static boolean zze(String s, boolean z) {
        if(s != null) {
            if(s.equalsIgnoreCase("true") || s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("1")) {
                return true;
            }
            return !s.equalsIgnoreCase("false") && !s.equalsIgnoreCase("no") && !s.equalsIgnoreCase("0") ? z : false;
        }
        return z;
    }
}

