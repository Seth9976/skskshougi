package com.google.android.gms.drive;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.zzn;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.zze;
import com.google.android.gms.internal.zzlo;

public final class MetadataBuffer extends AbstractDataBuffer {
    static class zza extends Metadata {
        private final DataHolder zzWu;
        private final int zzYt;
        private final int zzadr;

        public zza(DataHolder dataHolder0, int v) {
            this.zzWu = dataHolder0;
            this.zzadr = v;
            this.zzYt = dataHolder0.zzbh(v);
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public Object freeze() {
            return this.zzpl();
        }

        @Override  // com.google.android.gms.common.data.Freezable
        public boolean isDataValid() {
            return !this.zzWu.isClosed();
        }

        @Override  // com.google.android.gms.drive.Metadata
        public Object zza(MetadataField metadataField0) {
            return metadataField0.zza(this.zzWu, this.zzadr, this.zzYt);
        }

        public Metadata zzpl() {
            MetadataBundle metadataBundle0 = MetadataBundle.zzpX();
            for(Object object0: zze.zzpW()) {
                MetadataField metadataField0 = (MetadataField)object0;
                if(metadataField0 != zzlo.zzaho) {
                    metadataField0.zza(this.zzWu, metadataBundle0, this.zzadr, this.zzYt);
                }
            }
            return new zzn(metadataBundle0);
        }
    }

    private zza zzadq;

    public MetadataBuffer(DataHolder dataHolder) {
        super(dataHolder);
        dataHolder.zznb().setClassLoader(MetadataBuffer.class.getClassLoader());
    }

    public Metadata get(int row) {
        zza metadataBuffer$zza0 = this.zzadq;
        if(metadataBuffer$zza0 == null || metadataBuffer$zza0.zzadr != row) {
            metadataBuffer$zza0 = new zza(this.zzWu, row);
            this.zzadq = metadataBuffer$zza0;
        }
        return metadataBuffer$zza0;
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.get(x0);
    }

    @Deprecated
    public String getNextPageToken() {
        return null;
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public void release() {
        if(this.zzWu != null) {
            zze.zzb(this.zzWu);
        }
        super.release();
    }
}

