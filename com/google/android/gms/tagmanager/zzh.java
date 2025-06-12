package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzh extends zzak {
    private static final String ID;
    private final Context mContext;

    static {
        zzh.ID = "_av";
    }

    public zzh(Context context0) {
        super("_av", new String[0]);
        this.mContext = context0;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        try {
            return zzdf.zzI(this.mContext.getPackageManager().getPackageInfo("org.dyndns.vivi.SkskShogi", 0).versionCode);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            zzbg.zzaz(("Package name org.dyndns.vivi.SkskShogi not found. " + packageManager$NameNotFoundException0.getMessage()));
            return zzdf.zzzQ();
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

