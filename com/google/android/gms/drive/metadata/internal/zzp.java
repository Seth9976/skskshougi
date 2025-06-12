package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class zzp extends zzj {
    public zzp(String s, int v) {
        super(s, zzp.zzcz(s), Collections.emptyList(), v);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.drive.metadata.zza
    protected boolean zzb(DataHolder dataHolder0, int v, int v1) {
        return dataHolder0.zzbV(this.zzcy("permissionId")) && !dataHolder0.zzi(this.zzcy("permissionId"), v, v1);
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzc(DataHolder dataHolder0, int v, int v1) {
        return this.zzj(dataHolder0, v, v1);
    }

    private String zzcy(String s) {
        return zzp.zzw(this.getName(), s);
    }

    private static Collection zzcz(String s) {
        return Arrays.asList(new String[]{zzp.zzw(s, "permissionId"), zzp.zzw(s, "displayName"), zzp.zzw(s, "picture"), zzp.zzw(s, "isAuthenticatedUser"), zzp.zzw(s, "emailAddress")});
    }

    protected UserMetadata zzj(DataHolder dataHolder0, int v, int v1) {
        String s = dataHolder0.zzd(this.zzcy("permissionId"), v, v1);
        return s == null ? null : new UserMetadata(s, dataHolder0.zzd(this.zzcy("displayName"), v, v1), dataHolder0.zzd(this.zzcy("picture"), v, v1), dataHolder0.zze(this.zzcy("isAuthenticatedUser"), v, v1), dataHolder0.zzd(this.zzcy("emailAddress"), v, v1));
    }

    private static String zzw(String s, String s1) {
        return s + "." + s1;
    }
}

