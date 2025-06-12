package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

class zzj extends zzdd {
    public interface zza {
        zzar zzyi();
    }

    private static final String ID;
    private static final String URL;
    private final Context mContext;
    private static final String zzaKr;
    private static final String zzaKs;
    static final String zzaKt;
    private static final Set zzaKu;
    private final zza zzaKv;

    // 去混淆评级： 低(20)
    static {
        zzj.ID = "_img";
        zzj.URL = "url";
        zzj.zzaKr = "additional_params";
        zzj.zzaKs = "unrepeatable";
        zzj.zzaKt = "gtm__img_unrepeatable";
        zzj.zzaKu = new HashSet();
    }

    public zzj(Context context0) {
        this(context0, new zza() {
            @Override  // com.google.android.gms.tagmanager.zzj$zza
            public zzar zzyi() {
                return zzz.zzaF(this.zzqV);
            }
        });
    }

    zzj(Context context0, zza zzj$zza0) {
        super("_img", new String[]{"url"});
        this.zzaKv = zzj$zza0;
        this.mContext = context0;
    }

    @Override  // com.google.android.gms.tagmanager.zzdd
    public void zzG(Map map0) {
        String s = map0.get("unrepeatable") == null ? null : zzdf.zzg(((com.google.android.gms.internal.zzag.zza)map0.get(zzj.zzaKs)));
        if(s == null || !this.zzeb(s)) {
            Uri.Builder uri$Builder0 = Uri.parse(zzdf.zzg(((com.google.android.gms.internal.zzag.zza)map0.get("url")))).buildUpon();
            com.google.android.gms.internal.zzag.zza zzag$zza0 = (com.google.android.gms.internal.zzag.zza)map0.get("additional_params");
            if(zzag$zza0 != null) {
                Object object0 = zzdf.zzl(zzag$zza0);
                if(!(object0 instanceof List)) {
                    zzbg.zzaz(("ArbitraryPixel: additional params not a list: not sending partial hit: " + uri$Builder0.build().toString()));
                    return;
                }
                for(Object object1: ((List)object0)) {
                    if(!(object1 instanceof Map)) {
                        zzbg.zzaz(("ArbitraryPixel: additional params contains non-map: not sending partial hit: " + uri$Builder0.build().toString()));
                        return;
                    }
                    for(Object object2: ((Map)object1).entrySet()) {
                        uri$Builder0.appendQueryParameter(((Map.Entry)object2).getKey().toString(), ((Map.Entry)object2).getValue().toString());
                    }
                }
            }
            String s1 = uri$Builder0.build().toString();
            this.zzaKv.zzyi().zzes(s1);
            zzbg.zzaB(("ArbitraryPixel: url = " + s1));
            if(s != null) {
                synchronized(zzj.class) {
                    zzj.zzaKu.add(s);
                    zzcv.zza(this.mContext, "gtm__img_unrepeatable", s, "true");
                }
            }
        }
    }

    private boolean zzeb(String s) {
        boolean z = true;
        synchronized(this) {
            if(!this.zzed(s)) {
                if(this.zzec(s)) {
                    zzj.zzaKu.add(s);
                }
                else {
                    z = false;
                }
            }
            return z;
        }
    }

    // 去混淆评级： 低(20)
    boolean zzec(String s) {
        return this.mContext.getSharedPreferences("gtm__img_unrepeatable", 0).contains(s);
    }

    boolean zzed(String s) {
        return zzj.zzaKu.contains(s);
    }
}

