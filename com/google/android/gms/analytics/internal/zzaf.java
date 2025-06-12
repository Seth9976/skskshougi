package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.Map.Entry;
import java.util.Map;

public class zzaf extends zzd {
    private static String zzMl;
    private static String zzMm;
    private static zzaf zzMn;

    static {
        zzaf.zzMl = "3";
        zzaf.zzMm = "01VDIWEA?";
    }

    public zzaf(zzf zzf0) {
        super(zzf0);
    }

    public void zza(int v, String s, Object object0, Object object1, Object object2) {
        if(Log.isLoggable("GAv4", v)) {
            Log.println(v, "GAv4", zzaf.zzc(s, object0, object1, object2));
        }
        if(v >= 5) {
            this.zzb(v, s, object0, object1, object2);
        }
    }

    public void zza(zzab zzab0, String s) {
        if(s == null) {
            s = "no reason provided";
        }
        this.zzd("Discarding hit. " + s, (zzab0 == null ? "no hit data" : zzab0.toString()));
    }

    public void zzb(int v, String s, Object object0, Object object1, Object object2) {
        int v3;
        int v1 = 0;
        synchronized(this) {
            zzu.zzu(s);
            if(v >= 0) {
                v1 = v;
            }
            if(!this.zzhR().zziX()) {
                v3 = this.zzhR().zziW() ? 0x70 : 99;
            }
            else if(this.zzhR().zziW()) {
                v3 = 80;
            }
            else {
                v3 = 67;
            }
            String s1 = "3" + "01VDIWEA?".charAt((v1 < 9 ? v1 : 8)) + ((char)v3) + "7.5.71" + ":" + zzaf.zzc(s, this.zzk(object0), this.zzk(object1), this.zzk(object2));
            if(s1.length() > 0x400) {
                s1 = s1.substring(0, 0x400);
            }
            zzai zzai0 = this.zzhM().zzif();
            if(zzai0 != null) {
                zzai0.zzkp().zzbg(s1);
            }
        }
    }

    public void zzg(Map map0, String s) {
        String s1;
        if(s == null) {
            s = "no reason provided";
        }
        if(map0 == null) {
            s1 = "no hit data";
        }
        else {
            StringBuilder stringBuilder0 = new StringBuilder();
            for(Object object0: map0.entrySet()) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(',');
                }
                stringBuilder0.append(((String)((Map.Entry)object0).getKey()));
                stringBuilder0.append('=');
                stringBuilder0.append(((String)((Map.Entry)object0).getValue()));
            }
            s1 = stringBuilder0.toString();
        }
        this.zzd("Discarding hit. " + s, s1);
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
        synchronized(zzaf.class) {
            zzaf.zzMn = this;
        }
    }

    protected String zzk(Object object0) {
        if(object0 == null) {
            return null;
        }
        Long long0 = object0 instanceof Integer ? new Long(((long)(((int)(((Integer)object0)))))) : object0;
        if(long0 instanceof Long) {
            if(Math.abs(((long)long0)) < 100L) {
                return String.valueOf(long0);
            }
            String s = String.valueOf(long0).charAt(0) == 45 ? "-" : "";
            String s1 = String.valueOf(Math.abs(((long)long0)));
            return s + Math.round(Math.pow(10.0, s1.length() - 1)) + "..." + s + Math.round(Math.pow(10.0, s1.length()) - 1.0);
        }
        if(long0 instanceof Boolean) {
            return String.valueOf(long0);
        }
        return long0 instanceof Throwable ? long0.getClass().getCanonicalName() : "-";
    }

    public static zzaf zzkc() {
        return zzaf.zzMn;
    }
}

