package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class zzab {
    private final List zzLZ;
    private final long zzMa;
    private final long zzMb;
    private final int zzMc;
    private final boolean zzMd;
    private final String zzMe;
    private final Map zzyn;

    public zzab(zzc zzc0, Map map0, long v, boolean z) {
        this(zzc0, map0, v, z, 0L, 0, null);
    }

    public zzab(zzc zzc0, Map map0, long v, boolean z, long v1, int v2) {
        this(zzc0, map0, v, z, v1, v2, null);
    }

    public zzab(zzc zzc0, Map map0, long v, boolean z, long v1, int v2, List list0) {
        zzu.zzu(zzc0);
        zzu.zzu(map0);
        this.zzMb = v;
        this.zzMd = z;
        this.zzMa = v1;
        this.zzMc = v2;
        this.zzLZ = list0 == null ? Collections.EMPTY_LIST : list0;
        this.zzMe = zzab.zze(list0);
        HashMap hashMap0 = new HashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(zzab.zzj(map$Entry0.getKey())) {
                String s = zzab.zza(zzc0, map$Entry0.getKey());
                if(s != null) {
                    hashMap0.put(s, zzab.zzb(zzc0, map$Entry0.getValue()));
                }
            }
        }
        for(Object object1: map0.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object1;
            if(!zzab.zzj(map$Entry1.getKey())) {
                String s1 = zzab.zza(zzc0, map$Entry1.getKey());
                if(s1 != null) {
                    hashMap0.put(s1, zzab.zzb(zzc0, map$Entry1.getValue()));
                }
            }
        }
        if(!TextUtils.isEmpty(this.zzMe)) {
            zzam.zzb(hashMap0, "_v", this.zzMe);
            if(this.zzMe.equals("ma4.0.0") || this.zzMe.equals("ma4.0.1")) {
                hashMap0.remove("adid");
            }
        }
        this.zzyn = Collections.unmodifiableMap(hashMap0);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append("ht=").append(this.zzMb);
        if(this.zzMa != 0L) {
            stringBuffer0.append(", dbId=").append(this.zzMa);
        }
        if(((long)this.zzMc) != 0L) {
            stringBuffer0.append(", appUID=").append(this.zzMc);
        }
        ArrayList arrayList0 = new ArrayList(this.zzyn.keySet());
        Collections.sort(arrayList0);
        for(Object object0: arrayList0) {
            stringBuffer0.append(", ");
            stringBuffer0.append(((String)object0));
            stringBuffer0.append("=");
            stringBuffer0.append(((String)this.zzyn.get(((String)object0))));
        }
        return stringBuffer0.toString();
    }

    public static zzab zza(zzc zzc0, zzab zzab0, Map map0) {
        return new zzab(zzc0, map0, zzab0.zzjW(), zzab0.zzjY(), zzab0.zzjV(), zzab0.zzjU(), zzab0.zzjX());
    }

    private static String zza(zzc zzc0, Object object0) {
        if(object0 == null) {
            return null;
        }
        String s = object0.toString();
        if(s.startsWith("&")) {
            s = s.substring(1);
        }
        int v = s.length();
        if(v > 0x100) {
            s = s.substring(0, 0x100);
            zzc0.zzc("Hit param name is too long and will be trimmed", v, s);
        }
        return TextUtils.isEmpty(s) ? null : s;
    }

    private static String zzb(zzc zzc0, Object object0) {
        String s = object0 == null ? "" : object0.toString();
        int v = s.length();
        if(v > 0x2000) {
            s = s.substring(0, 0x2000);
            zzc0.zzc("Hit param value is too long and will be trimmed", v, s);
        }
        return s;
    }

    private static String zze(List list0) {
        if(list0 != null) {
            for(Object object0: list0) {
                Command command0 = (Command)object0;
                if("appendVersion".equals(command0.getId())) {
                    String s = command0.getValue();
                    return TextUtils.isEmpty(s) ? null : s;
                }
                if(false) {
                    break;
                }
            }
        }
        return TextUtils.isEmpty(null) ? null : null;
    }

    private static boolean zzj(Object object0) {
        return object0 == null ? false : object0.toString().startsWith("&");
    }

    public int zzjU() {
        return this.zzMc;
    }

    public long zzjV() {
        return this.zzMa;
    }

    public long zzjW() {
        return this.zzMb;
    }

    public List zzjX() {
        return this.zzLZ;
    }

    public boolean zzjY() {
        return this.zzMd;
    }

    public long zzjZ() {
        return zzam.zzbj(this.zzn("_s", "0"));
    }

    public String zzka() {
        return this.zzn("_m", "");
    }

    private String zzn(String s, String s1) {
        zzu.zzcj(s);
        zzu.zzb(!s.startsWith("&"), "Short param name required");
        String s2 = (String)this.zzyn.get(s);
        return s2 == null ? s1 : s2;
    }

    public Map zzn() {
        return this.zzyn;
    }
}

