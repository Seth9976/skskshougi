package com.google.android.gms.tagmanager;

import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class zzay extends zzak {
    static enum zza {
        NONE,
        URL,
        BACKSLASH;

    }

    private static final String ID;
    private static final String zzaLE;
    private static final String zzaLW;
    private static final String zzaLX;
    private static final String zzaLY;

    static {
        zzay.ID = "_jn";
        zzay.zzaLE = "arg0";
        zzay.zzaLW = "item_separator";
        zzay.zzaLX = "key_value_separator";
        zzay.zzaLY = "escape";
    }

    // 去混淆评级： 低(20)
    public zzay() {
        super("_jn", new String[]{"arg0"});
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public com.google.android.gms.internal.zzag.zza zzE(Map map0) {
        HashSet hashSet0;
        zza zzay$zza1;
        com.google.android.gms.internal.zzag.zza zzag$zza0 = (com.google.android.gms.internal.zzag.zza)map0.get("arg0");
        if(zzag$zza0 == null) {
            return zzdf.zzzQ();
        }
        com.google.android.gms.internal.zzag.zza zzag$zza1 = (com.google.android.gms.internal.zzag.zza)map0.get("item_separator");
        String s = zzag$zza1 == null ? "" : zzdf.zzg(zzag$zza1);
        com.google.android.gms.internal.zzag.zza zzag$zza2 = (com.google.android.gms.internal.zzag.zza)map0.get("key_value_separator");
        String s1 = zzag$zza2 == null ? "=" : zzdf.zzg(zzag$zza2);
        zza zzay$zza0 = zza.zzaMa;
        com.google.android.gms.internal.zzag.zza zzag$zza3 = (com.google.android.gms.internal.zzag.zza)map0.get("escape");
        if(zzag$zza3 == null) {
            hashSet0 = null;
            zzay$zza1 = zzay$zza0;
        }
        else {
            String s2 = zzdf.zzg(zzag$zza3);
            if("url".equals(s2)) {
                zzay$zza1 = zza.zzaMb;
                hashSet0 = null;
            }
            else {
                if("backslash".equals(s2)) {
                    zzay$zza1 = zza.zzaMc;
                    hashSet0 = new HashSet();
                    this.zza(hashSet0, s);
                    this.zza(hashSet0, s1);
                    hashSet0.remove(Character.valueOf('\\'));
                    goto label_26;
                }
                zzbg.zzaz(("Joiner: unsupported escape type: " + s2));
                return zzdf.zzzQ();
            }
        }
    label_26:
        StringBuilder stringBuilder0 = new StringBuilder();
        switch(zzag$zza0.type) {
            case 2: {
                com.google.android.gms.internal.zzag.zza[] arr_zzag$zza = zzag$zza0.zziS;
                int v = 0;
                for(boolean z = true; v < arr_zzag$zza.length; z = false) {
                    com.google.android.gms.internal.zzag.zza zzag$zza4 = arr_zzag$zza[v];
                    if(!z) {
                        stringBuilder0.append(s);
                    }
                    this.zza(stringBuilder0, zzdf.zzg(zzag$zza4), zzay$zza1, hashSet0);
                    ++v;
                }
                return zzdf.zzI(stringBuilder0.toString());
            }
            case 3: {
                for(int v1 = 0; v1 < zzag$zza0.zziT.length; ++v1) {
                    if(v1 > 0) {
                        stringBuilder0.append(s);
                    }
                    String s3 = zzdf.zzg(zzag$zza0.zziT[v1]);
                    String s4 = zzdf.zzg(zzag$zza0.zziU[v1]);
                    this.zza(stringBuilder0, s3, zzay$zza1, hashSet0);
                    stringBuilder0.append(s1);
                    this.zza(stringBuilder0, s4, zzay$zza1, hashSet0);
                }
                return zzdf.zzI(stringBuilder0.toString());
            }
            default: {
                this.zza(stringBuilder0, zzdf.zzg(zzag$zza0), zzay$zza1, hashSet0);
                return zzdf.zzI(stringBuilder0.toString());
            }
        }
    }

    private String zza(String s, zza zzay$zza0, Set set0) {
        switch(zzay$zza0) {
            case zzaMb: {
                try {
                    return zzdj.zzeQ(s);
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    zzbg.zzb("Joiner: unsupported encoding", unsupportedEncodingException0);
                    return s;
                }
            }
            case zzaMc: {
                Iterator iterator0 = set0.iterator();
                String s1;
                for(s1 = s.replace("\\", "\\\\"); iterator0.hasNext(); s1 = s1.replace(s2, "\\" + s2)) {
                    Object object0 = iterator0.next();
                    String s2 = ((Character)object0).toString();
                }
                return s1;
            }
            default: {
                return s;
            }
        }
    }

    private void zza(StringBuilder stringBuilder0, String s, zza zzay$zza0, Set set0) {
        stringBuilder0.append(this.zza(s, zzay$zza0, set0));
    }

    private void zza(Set set0, String s) {
        for(int v = 0; v < s.length(); ++v) {
            set0.add(Character.valueOf(s.charAt(v)));
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

