package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzgd;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzi {
    public void zza(Context context0, boolean z, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel0) {
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
        intent0.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", z);
        GInAppPurchaseManagerInfoParcel.zza(intent0, gInAppPurchaseManagerInfoParcel0);
        context0.startActivity(intent0);
    }

    public String zzai(String s) {
        if(s == null) {
            return null;
        }
        try {
            return new JSONObject(s).getString("developerPayload");
        }
        catch(JSONException unused_ex) {
            zzb.zzaC("Fail to parse purchase data");
            return null;
        }
    }

    public String zzaj(String s) {
        if(s == null) {
            return null;
        }
        try {
            return new JSONObject(s).getString("purchaseToken");
        }
        catch(JSONException unused_ex) {
            zzb.zzaC("Fail to parse purchase data");
            return null;
        }
    }

    public int zzb(Bundle bundle0) {
        Object object0 = bundle0.get("RESPONSE_CODE");
        if(object0 == null) {
            zzb.zzaC("Bundle with null response code, assuming OK (known issue)");
            return 0;
        }
        if(object0 instanceof Integer) {
            return (int)(((Integer)object0));
        }
        if(object0 instanceof Long) {
            return (int)(((long)(((Long)object0))));
        }
        zzb.zzaC(("Unexpected type for intent response code. " + object0.getClass().getName()));
        return 5;
    }

    public int zzd(Intent intent0) {
        Object object0 = intent0.getExtras().get("RESPONSE_CODE");
        if(object0 == null) {
            zzb.zzaC("Intent with no response code, assuming OK (known issue)");
            return 0;
        }
        if(object0 instanceof Integer) {
            return (int)(((Integer)object0));
        }
        if(object0 instanceof Long) {
            return (int)(((long)(((Long)object0))));
        }
        zzb.zzaC(("Unexpected type for intent response code. " + object0.getClass().getName()));
        return 5;
    }

    public String zze(Intent intent0) {
        return intent0 == null ? null : intent0.getStringExtra("INAPP_PURCHASE_DATA");
    }

    public String zzf(Intent intent0) {
        return intent0 == null ? null : intent0.getStringExtra("INAPP_DATA_SIGNATURE");
    }
}

