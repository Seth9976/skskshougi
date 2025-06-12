package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.zzj;
import java.util.Arrays;

public class zzlp extends zzj {
    public zzlp(int v) {
        super("customProperties", Arrays.asList(new String[]{"customProperties", "sqlId"}), Arrays.asList(new String[]{"customPropertiesExtra"}), v);
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzc(DataHolder dataHolder0, int v, int v1) {
        return this.zzl(dataHolder0, v, v1);
    }

    protected AppVisibleCustomProperties zzl(DataHolder dataHolder0, int v, int v1) {
        return (AppVisibleCustomProperties)dataHolder0.zznb().getSparseParcelableArray("customPropertiesExtra").get(v, AppVisibleCustomProperties.zzagD);
    }
}

