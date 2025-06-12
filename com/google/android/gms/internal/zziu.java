package com.google.android.gms.internal;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.RegisterSectionInfo.zza;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appindexing.Action;
import java.util.ArrayList;

public class zziu {
    private static DocumentSection zza(String s, zzc zznj$zzc0) {
        RegisterSectionInfo registerSectionInfo0 = new zza(s).zzJ(true).zzbs(s).zzbr("blob").zzkM();
        return new DocumentSection(zzrn.zzf(zznj$zzc0), registerSectionInfo0);
    }

    public static UsageInfo zza(Action action0, long v, String s, int v1) {
        int v2;
        boolean z = false;
        Bundle bundle0 = new Bundle();
        bundle0.putAll(action0.zzkP());
        Bundle bundle1 = bundle0.getBundle("object");
        Uri uri0 = bundle1.containsKey("id") ? Uri.parse(bundle1.getString("id")) : null;
        String s1 = bundle1.getString("name");
        String s2 = bundle1.getString("type");
        Intent intent0 = zziv.zza(s, Uri.parse(bundle1.getString("url")));
        com.google.android.gms.appdatasearch.DocumentContents.zza documentContents$zza0 = UsageInfo.zza(intent0, s1, uri0, s2, null);
        if(bundle0.containsKey(".private:ssbContext")) {
            documentContents$zza0.zza(DocumentSection.zzh(bundle0.getByteArray(".private:ssbContext")));
            bundle0.remove(".private:ssbContext");
        }
        if(bundle0.containsKey(".private:accountName")) {
            documentContents$zza0.zza(new Account(bundle0.getString(".private:accountName"), "com.google"));
            bundle0.remove(".private:accountName");
        }
        if(!bundle0.containsKey(".private:isContextOnly") || !bundle0.getBoolean(".private:isContextOnly")) {
            v2 = 0;
        }
        else {
            v2 = 4;
            bundle0.remove(".private:isContextOnly");
        }
        if(bundle0.containsKey(".private:isDeviceOnly")) {
            z = bundle0.getBoolean(".private:isDeviceOnly", false);
            bundle0.remove(".private:isDeviceOnly");
        }
        documentContents$zza0.zza(zziu.zza(".private:action", zziu.zze(bundle0)));
        return new com.google.android.gms.appdatasearch.UsageInfo.zza().zza(UsageInfo.zza(s, intent0)).zzw(v).zzal(v2).zza(documentContents$zza0.zzkJ()).zzL(z).zzam(v1).zzkN();
    }

    static zzc zze(Bundle bundle0) {
        zzc zznj$zzc0 = new zzc();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: bundle0.keySet()) {
            Object object1 = bundle0.get(((String)object0));
            zzb zznj$zzb0 = new zzb();
            zznj$zzb0.name = (String)object0;
            zznj$zzb0.zzawp = new zzd();
            if(object1 instanceof String) {
                zznj$zzb0.zzawp.zzabE = (String)object1;
            }
            else if(object1 instanceof Bundle) {
                zzd zznj$zzd0 = zznj$zzb0.zzawp;
                zznj$zzd0.zzawu = zziu.zze(((Bundle)object1));
            }
            else {
                Log.e("AppDataSearchClient", "Unsupported value: " + object1);
            }
            arrayList0.add(zznj$zzb0);
        }
        if(bundle0.containsKey("type")) {
            zznj$zzc0.type = bundle0.getString("type");
        }
        zznj$zzc0.zzawq = (zzb[])arrayList0.toArray(new zzb[arrayList0.size()]);
        return zznj$zzc0;
    }
}

