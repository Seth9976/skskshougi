package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

class zzd implements zzb {
    private final Context zzpH;

    public zzd(Context context0) {
        this.zzpH = context0;
    }

    @Override  // com.google.android.gms.tagmanager.DataLayer$zzb
    public void zzF(Map map0) {
        Object object2;
        Object object0 = map0.get("gtm.url");
        if(object0 == null) {
            Object object1 = map0.get("gtm");
            object2 = object1 == null || !(object1 instanceof Map) ? null : ((Map)object1).get("url");
        }
        else {
            object2 = object0;
        }
        if(object2 != null && object2 instanceof String) {
            String s = Uri.parse(((String)object2)).getQueryParameter("referrer");
            if(s != null) {
                zzax.zzk(this.zzpH, s);
            }
        }
    }
}

