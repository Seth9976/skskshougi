package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzgd;

@zzgd
public class zza {
    public boolean zza(Context context0, AdLauncherIntentInfoParcel adLauncherIntentInfoParcel0, zzk zzk0) {
        int v;
        if(adLauncherIntentInfoParcel0 == null) {
            zzb.zzaC("No intent data for launcher overlay.");
            return false;
        }
        Intent intent0 = new Intent();
        if(TextUtils.isEmpty(adLauncherIntentInfoParcel0.zzzf)) {
            zzb.zzaC("Open GMSG did not contain a URL.");
            return false;
        }
        if(TextUtils.isEmpty(adLauncherIntentInfoParcel0.mimeType)) {
            intent0.setData(Uri.parse(adLauncherIntentInfoParcel0.zzzf));
        }
        else {
            intent0.setDataAndType(Uri.parse(adLauncherIntentInfoParcel0.zzzf), adLauncherIntentInfoParcel0.mimeType);
        }
        intent0.setAction("android.intent.action.VIEW");
        if(!TextUtils.isEmpty(adLauncherIntentInfoParcel0.packageName)) {
            intent0.setPackage(adLauncherIntentInfoParcel0.packageName);
        }
        if(!TextUtils.isEmpty(adLauncherIntentInfoParcel0.zzzg)) {
            String[] arr_s = adLauncherIntentInfoParcel0.zzzg.split("/", 2);
            if(arr_s.length < 2) {
                zzb.zzaC(("Could not parse component name from open GMSG: " + adLauncherIntentInfoParcel0.zzzg));
                return false;
            }
            intent0.setClassName(arr_s[0], arr_s[1]);
        }
        String s = adLauncherIntentInfoParcel0.zzzh;
        if(!TextUtils.isEmpty(s)) {
            try {
                v = Integer.parseInt(s);
            }
            catch(NumberFormatException unused_ex) {
                zzb.zzaC("Could not parse intent flags.");
                v = 0;
            }
            intent0.addFlags(v);
        }
        try {
            zzb.zzaB(("Launching an intent: " + intent0.toURI()));
            context0.startActivity(intent0);
            if(zzk0 != null) {
                zzk0.zzaO();
            }
            return true;
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            zzb.zzaC(activityNotFoundException0.getMessage());
            return false;
        }
    }
}

