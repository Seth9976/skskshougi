package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzh;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

@zzgd
public final class zzdo implements zzdg {
    private final Map zzwA;

    public zzdo() {
        this.zzwA = new WeakHashMap();
    }

    private static int zza(Context context0, Map map0, String s, int v) {
        String s1 = (String)map0.get(s);
        if(s1 != null) {
            try {
                return zzk.zzcA().zzb(context0, Integer.parseInt(s1));
            }
            catch(NumberFormatException unused_ex) {
                zzb.zzaC(("Could not parse " + s + " in a video GMSG: " + s1));
                return v;
            }
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.zzdg
    public void zza(zzid zzid0, Map map0) {
        String s = (String)map0.get("action");
        if(s == null) {
            zzb.zzaC("Action missing from video GMSG.");
            return;
        }
        if(zzb.zzL(3)) {
            JSONObject jSONObject0 = new JSONObject(map0);
            jSONObject0.remove("google.afma.Notify_dt");
            zzb.zzay(("Video GMSG: " + s + " " + jSONObject0.toString()));
        }
        if("background".equals(s)) {
            String s1 = (String)map0.get("color");
            if(TextUtils.isEmpty(s1)) {
                zzb.zzaC("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                int v = Color.parseColor(s1);
                zzc zzc0 = zzid0.zzgD();
                if(zzc0 != null) {
                    zzh zzh0 = zzc0.zzeq();
                    if(zzh0 != null) {
                        zzh0.setBackgroundColor(v);
                        return;
                    }
                }
                this.zzwA.put(zzid0, v);
            }
            catch(IllegalArgumentException unused_ex) {
                zzb.zzaC("Invalid color parameter in video GMSG.");
            }
            return;
        }
        zzc zzc1 = zzid0.zzgD();
        if(zzc1 == null) {
            zzb.zzaC("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean z = "new".equals(s);
        if(z || "position".equals(s)) {
            Context context0 = zzid0.getContext();
            int v1 = zzdo.zza(context0, map0, "x", 0);
            int v2 = zzdo.zza(context0, map0, "y", 0);
            int v3 = zzdo.zza(context0, map0, "w", -1);
            int v4 = zzdo.zza(context0, map0, "h", -1);
            if(z && zzc1.zzeq() == null) {
                zzc1.zze(v1, v2, v3, v4);
                if(this.zzwA.containsKey(zzid0)) {
                    zzc1.zzeq().setBackgroundColor(((int)(((Integer)this.zzwA.get(zzid0)))));
                    return;
                }
                return;
            }
            zzc1.zzd(v1, v2, v3, v4);
            return;
        }
        zzh zzh1 = zzc1.zzeq();
        if(zzh1 == null) {
            zzh.zzd(zzid0);
            return;
        }
        if("click".equals(s)) {
            Context context1 = zzid0.getContext();
            int v5 = zzdo.zza(context1, map0, "x", 0);
            int v6 = zzdo.zza(context1, map0, "y", 0);
            long v7 = SystemClock.uptimeMillis();
            MotionEvent motionEvent0 = MotionEvent.obtain(v7, v7, 0, ((float)v5), ((float)v6), 0);
            zzh1.zzc(motionEvent0);
            motionEvent0.recycle();
            return;
        }
        if("currentTime".equals(s)) {
            String s2 = (String)map0.get("time");
            if(s2 == null) {
                zzb.zzaC("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzh1.seekTo(((int)(Float.parseFloat(s2) * 1000.0f)));
            }
            catch(NumberFormatException unused_ex) {
                zzb.zzaC(("Could not parse time parameter from currentTime video GMSG: " + s2));
            }
            return;
        }
        if("hide".equals(s)) {
            zzh1.setVisibility(4);
            return;
        }
        if("load".equals(s)) {
            zzh1.zzeH();
            return;
        }
        if("muted".equals(s)) {
            if(Boolean.parseBoolean(((String)map0.get("muted")))) {
                zzh1.zzeI();
                return;
            }
            zzh1.zzeJ();
            return;
        }
        if("pause".equals(s)) {
            zzh1.pause();
            return;
        }
        if("play".equals(s)) {
            zzh1.play();
            return;
        }
        if("show".equals(s)) {
            zzh1.setVisibility(0);
            return;
        }
        if("src".equals(s)) {
            zzh1.zzah(((String)map0.get("src")));
            return;
        }
        if("volume".equals(s)) {
            String s3 = (String)map0.get("volume");
            if(s3 == null) {
                zzb.zzaC("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzh1.zza(Float.parseFloat(s3));
            }
            catch(NumberFormatException unused_ex) {
                zzb.zzaC(("Could not parse volume parameter from volume video GMSG: " + s3));
            }
            return;
        }
        if("watermark".equals(s)) {
            zzh1.zzeK();
            return;
        }
        zzb.zzaC(("Unknown video action: " + s));
    }
}

