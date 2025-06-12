package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzo;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class zzce {
    private final Object zzqt;
    final String zzuO;
    private static int zzuP;
    private final LinkedList zzuQ;
    private zzcd zzuR;

    public zzce(String s) {
        this.zzqt = new Object();
        this.zzuO = s;
        zzce.zzuP = (int)(((Integer)zzbz.zztZ.get()));
        synchronized(this.zzqt) {
            this.zzuQ = new LinkedList();
        }
    }

    private static Map zza(String s, StringBuilder stringBuilder0) {
        Map map0 = null;
        if(stringBuilder0.length() > 0) {
            map0 = new LinkedHashMap();
            if(s != null) {
                map0.put("action", s);
            }
            stringBuilder0.setLength(stringBuilder0.length() - 1);
            map0.put("it", stringBuilder0.toString());
        }
        return map0;
    }

    public static Map zza(zzce[] arr_zzce) throws IllegalArgumentException {
        String s = null;
        StringBuilder stringBuilder0 = new StringBuilder(zzce.zzuP * 200);
        for(int v = 0; v < arr_zzce.length; ++v) {
            Map map0 = arr_zzce[v].zzdq();
            if(map0 != null) {
                if(v == 0) {
                    s = (String)map0.get("action");
                }
                else if(!map0.containsKey("action") && s != null || map0.containsKey("action") && !((String)map0.get("action")).equals(s)) {
                    throw new IllegalArgumentException("Can not merge report items for the tickers with different action names.");
                }
                stringBuilder0.append(((String)map0.get("it"))).append(",");
            }
        }
        return zzce.zza(s, stringBuilder0);
    }

    private boolean zza(zzcd zzcd0, long v, String[] arr_s) {
        synchronized(this.zzqt) {
            for(int v2 = 0; v2 < arr_s.length; ++v2) {
                zzcd zzcd1 = new zzcd(v, arr_s[v2], zzcd0);
                this.zzuQ.add(zzcd1);
            }
            return true;
        }
    }

    public boolean zza(zzcd zzcd0, String[] arr_s) {
        return zzo.zzbA().zzdc() && zzcd0 != null ? this.zza(zzcd0, zzo.zzbz().elapsedRealtime(), arr_s) : false;
    }

    private zzcd zzb(long v) {
        return new zzcd(v, null, null);
    }

    public zzcd zzdo() {
        return zzo.zzbA().zzdc() ? this.zzb(zzo.zzbz().elapsedRealtime()) : null;
    }

    public void zzdp() {
        this.zzuR = this.zzdo();
    }

    Map zzdq() {
        StringBuilder stringBuilder0 = new StringBuilder();
        synchronized(this.zzqt) {
            for(Object object1: this.zzuQ) {
                Long long0 = ((zzcd)object1).getTime();
                String s = ((zzcd)object1).zzdm();
                zzcd zzcd0 = ((zzcd)object1).zzdn();
                if(zzcd0 != null && ((long)long0) > 0L) {
                    stringBuilder0.append(s).append('.').append(((long)long0) - zzcd0.getTime()).append(',');
                }
            }
            this.zzuQ.clear();
        }
        return zzce.zza(this.zzuO, stringBuilder0);
    }

    public String zzdr() {
        return this.zzuO;
    }

    public zzcd zzds() {
        return this.zzuR;
    }
}

