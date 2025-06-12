package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlq;
import com.google.android.gms.internal.zzls;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zze {
    private static final Map zzagH;

    static {
        zze.zzagH = new HashMap();
        zze.zzb(zzlo.zzagK);
        zze.zzb(zzlo.zzahp);
        zze.zzb(zzlo.zzahg);
        zze.zzb(zzlo.zzahn);
        zze.zzb(zzlo.zzahq);
        zze.zzb(zzlo.zzagX);
        zze.zzb(zzlo.zzagW);
        zze.zzb(zzlo.zzagY);
        zze.zzb(zzlo.zzagZ);
        zze.zzb(zzlo.zzagU);
        zze.zzb(zzlo.zzahb);
        zze.zzb(zzlo.zzahc);
        zze.zzb(zzlo.zzahd);
        zze.zzb(zzlo.zzahl);
        zze.zzb(zzlo.zzagL);
        zze.zzb(zzlo.zzahi);
        zze.zzb(zzlo.zzagN);
        zze.zzb(zzlo.zzagV);
        zze.zzb(zzlo.zzagO);
        zze.zzb(zzlo.zzagP);
        zze.zzb(zzlo.zzagQ);
        zze.zzb(zzlo.zzagR);
        zze.zzb(zzlo.zzahf);
        zze.zzb(zzlo.zzaha);
        zze.zzb(zzlo.zzahh);
        zze.zzb(zzlo.zzahj);
        zze.zzb(zzlo.zzahk);
        zze.zzb(zzlo.zzahm);
        zze.zzb(zzlo.zzahr);
        zze.zzb(zzlo.zzahs);
        zze.zzb(zzlo.zzagT);
        zze.zzb(zzlo.zzagS);
        zze.zzb(zzlo.zzaho);
        zze.zzb(zzlo.zzahe);
        zze.zzb(zzlo.zzagM);
        zze.zzb(zzlo.zzaht);
        zze.zzb(zzlo.zzahu);
        zze.zzb(zzlo.zzahv);
        zze.zzb(zzlo.zzahw);
        zze.zzb(zzlo.zzahx);
        zze.zzb(zzlq.zzahy);
        zze.zzb(zzlq.zzahA);
        zze.zzb(zzlq.zzahB);
        zze.zzb(zzlq.zzahC);
        zze.zzb(zzlq.zzahz);
        zze.zzb(zzls.zzahE);
        zze.zzb(zzls.zzahF);
    }

    public static void zzb(DataHolder dataHolder0) {
        zzlo.zzahl.zzd(dataHolder0);
    }

    private static void zzb(MetadataField metadataField0) {
        String s = metadataField0.getName();
        if(zze.zzagH.containsKey(s)) {
            throw new IllegalArgumentException("Duplicate field name registered: " + metadataField0.getName());
        }
        String s1 = metadataField0.getName();
        zze.zzagH.put(s1, metadataField0);
    }

    public static MetadataField zzcw(String s) {
        return (MetadataField)zze.zzagH.get(s);
    }

    public static Collection zzpW() {
        return Collections.unmodifiableCollection(zze.zzagH.values());
    }
}

