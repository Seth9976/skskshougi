package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzn extends Metadata {
    private final MetadataBundle zzaeF;

    public zzn(MetadataBundle metadataBundle0) {
        this.zzaeF = metadataBundle0;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzpl();
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return this.zzaeF != null;
    }

    @Override
    public String toString() {
        return "Metadata [mImpl=" + this.zzaeF + "]";
    }

    @Override  // com.google.android.gms.drive.Metadata
    public Object zza(MetadataField metadataField0) {
        return this.zzaeF.zza(metadataField0);
    }

    public Metadata zzpl() {
        return new zzn(MetadataBundle.zza(this.zzaeF));
    }
}

