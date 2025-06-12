package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.zzj;
import java.util.Arrays;

public class zzlr extends zzj {
    public static final zzlr zzahD;

    static {
        zzlr.zzahD = new zzlr();
    }

    private zzlr() {
        super("driveId", Arrays.asList(new String[]{"sqlId", "resourceId", "mimeType"}), Arrays.asList(new String[]{"dbInstanceId"}), 4100000);
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzc(DataHolder dataHolder0, int v, int v1) {
        return this.zzm(dataHolder0, v, v1);
    }

    // 去混淆评级： 低(20)
    protected DriveId zzm(DataHolder dataHolder0, int v, int v1) {
        long v2 = dataHolder0.zznb().getLong("dbInstanceId");
        return "application/vnd.google-apps.folder".equals(dataHolder0.zzd("mimeType", v, v1)) ? new DriveId(dataHolder0.zzd("resourceId", v, v1), dataHolder0.zzb("sqlId", v, v1), v2, 1) : new DriveId(dataHolder0.zzd("resourceId", v, v1), dataHolder0.zzb("sqlId", v, v1), v2, 0);
    }
}

