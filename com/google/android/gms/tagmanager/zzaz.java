package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import com.google.android.gms.internal.zzqf.zzc;
import com.google.android.gms.internal.zzqf.zzd;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class zzaz {
    private static zza zzB(Object object0) throws JSONException {
        return zzdf.zzI(zzaz.zzC(object0));
    }

    static Object zzC(Object object0) throws JSONException {
        if(object0 instanceof JSONArray) {
            throw new RuntimeException("JSONArrays are not supported");
        }
        if(JSONObject.NULL.equals(object0)) {
            throw new RuntimeException("JSON nulls are not supported");
        }
        if(object0 instanceof JSONObject) {
            HashMap hashMap0 = new HashMap();
            Iterator iterator0 = ((JSONObject)object0).keys();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                hashMap0.put(((String)object1), zzaz.zzC(((JSONObject)object0).get(((String)object1))));
            }
            return hashMap0;
        }
        return object0;
    }

    public static zzc zzey(String s) throws JSONException {
        zza zzag$zza0 = zzaz.zzB(new JSONObject(s));
        zzd zzqf$zzd0 = zzc.zzAp();
        for(int v = 0; v < zzag$zza0.zziT.length; ++v) {
            zzqf$zzd0.zzc(com.google.android.gms.internal.zzqf.zza.zzAm().zzb("instance_name", zzag$zza0.zziT[v]).zzb("function", zzdf.zzeJ("_c")).zzb("value", zzag$zza0.zziU[v]).zzAo());
        }
        return zzqf$zzd0.zzAs();
    }
}

