package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzg extends zzak {
    private static final String ID;
    private final Context mContext;

    static {
        zzg.ID = "_an";
    }

    public zzg(Context context0) {
        super("_an", new String[0]);
        this.mContext = context0;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        try {
            PackageManager packageManager0 = this.mContext.getPackageManager();
            return zzdf.zzI(packageManager0.getApplicationLabel(packageManager0.getApplicationInfo("org.dyndns.vivi.SkskShogi", 0)).toString());
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            zzbg.zzb("App name is not found.", packageManager$NameNotFoundException0);
            return zzdf.zzzQ();
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

