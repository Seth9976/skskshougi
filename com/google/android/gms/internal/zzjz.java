package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzjz {
    private static final zzl zzQW;
    private static final String[] zzVs;
    private static final String zzVt;

    static {
        zzjz.zzQW = new zzl("MetadataUtils");
        zzjz.zzVs = new String[]{"Z", "+hh", "+hhmm", "+hh:mm"};
        zzjz.zzVt = "yyyyMMdd\'T\'HHmmssZ";
    }

    public static String zza(Calendar calendar0) {
        String s = "yyyyMMdd\'T\'HHmmssZ";
        if(calendar0 == null) {
            zzjz.zzQW.zzb("Calendar object cannot be null", new Object[0]);
            return null;
        }
        if(calendar0.get(11) == 0 && calendar0.get(12) == 0 && calendar0.get(13) == 0) {
            s = "yyyyMMdd";
        }
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s);
        simpleDateFormat0.setTimeZone(calendar0.getTimeZone());
        String s1 = simpleDateFormat0.format(calendar0.getTime());
        return s1.endsWith("+0000") ? s1.replace("+0000", "Z") : s1;
    }

    public static void zza(List list0, JSONObject jSONObject0) {
        try {
            list0.clear();
            JSONArray jSONArray0 = jSONObject0.getJSONArray("images");
            int v = jSONArray0.length();
            for(int v1 = 0; v1 < v; ++v1) {
                JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                try {
                    list0.add(new WebImage(jSONObject1));
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
        }
        catch(JSONException unused_ex) {
        }
    }

    public static void zza(JSONObject jSONObject0, List list0) {
        if(list0 != null && !list0.isEmpty()) {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: list0) {
                jSONArray0.put(((WebImage)object0).toJson());
            }
            try {
                jSONObject0.put("images", jSONArray0);
            }
            catch(JSONException unused_ex) {
            }
        }
    }

    public static Calendar zzbK(String s) {
        Date date0;
        if(TextUtils.isEmpty(s)) {
            zzjz.zzQW.zzb("Input string is empty or null", new Object[0]);
            return null;
        }
        String s1 = zzjz.zzbL(s);
        if(TextUtils.isEmpty(s1)) {
            zzjz.zzQW.zzb("Invalid date format", new Object[0]);
            return null;
        }
        String s2 = zzjz.zzbM(s);
        String s3 = "yyyyMMdd";
        if(!TextUtils.isEmpty(s2)) {
            s1 = s1 + "T" + s2;
            s3 = s2.length() == 6 ? "yyyyMMdd\'T\'HHmmss" : "yyyyMMdd\'T\'HHmmssZ";
        }
        Calendar calendar0 = GregorianCalendar.getInstance();
        try {
            date0 = new SimpleDateFormat(s3).parse(s1);
        }
        catch(ParseException parseException0) {
            zzjz.zzQW.zzb("Error parsing string: %s", new Object[]{parseException0.getMessage()});
            return null;
        }
        calendar0.setTime(date0);
        return calendar0;
    }

    private static String zzbL(String s) {
        if(TextUtils.isEmpty(s)) {
            zzjz.zzQW.zzb("Input string is empty or null", new Object[0]);
            return null;
        }
        try {
            return s.substring(0, 8);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            zzjz.zzQW.zze("Error extracting the date: %s", new Object[]{indexOutOfBoundsException0.getMessage()});
            return null;
        }
    }

    private static String zzbM(String s) {
        if(TextUtils.isEmpty(s)) {
            zzjz.zzQW.zzb("string is empty or null", new Object[0]);
            return null;
        }
        if(s.indexOf(84) != 8) {
            zzjz.zzQW.zzb("T delimeter is not found", new Object[0]);
            return null;
        }
        String s1 = s.substring(9);
        if(s1.length() == 6) {
            return s1;
        }
        switch(s1.charAt(6)) {
            case 43: 
            case 45: {
                return zzjz.zzbN(s1) ? s1.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2") : null;
            }
            case 90: {
                return s1.length() == 7 ? s1.substring(0, s1.length() - 1) + "+0000" : null;
            }
            default: {
                return null;
            }
        }
    }

    private static boolean zzbN(String s) {
        switch(s.length()) {
            case 9: 
            case 11: 
            case 12: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

