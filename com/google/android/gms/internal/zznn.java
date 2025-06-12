package com.google.android.gms.internal;

import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class zznn implements zznu {
    private static final Uri zzaDR;
    private final LogPrinter zzaDS;

    static {
        Uri.Builder uri$Builder0 = new Uri.Builder();
        uri$Builder0.scheme("uri");
        uri$Builder0.authority("local");
        zznn.zzaDR = uri$Builder0.build();
    }

    public zznn() {
        this.zzaDS = new LogPrinter(4, "GA/LogCatTransport");
    }

    @Override  // com.google.android.gms.internal.zznu
    public void zzb(zzno zzno0) {
        ArrayList arrayList0 = new ArrayList(zzno0.zzvQ());
        Collections.sort(arrayList0, new Comparator() {
            public int zza(zznq zznq0, zznq zznq1) {
                return zznq0.getClass().getCanonicalName().compareTo(zznq1.getClass().getCanonicalName());
            }
        });
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: arrayList0) {
            String s = ((zznq)object0).toString();
            if(!TextUtils.isEmpty(s)) {
                if(stringBuilder0.length() != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(s);
            }
        }
        this.zzaDS.println(stringBuilder0.toString());
    }

    @Override  // com.google.android.gms.internal.zznu
    public Uri zzhe() {
        return zznn.zzaDR;
    }
}

