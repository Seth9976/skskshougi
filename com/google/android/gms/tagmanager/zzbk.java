package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzbk extends zzak {
    private static final String ID;
    private final Context mContext;

    static {
        zzbk.ID = "_awid";
    }

    public zzbk(Context context0) {
        super("_awid", new String[0]);
        this.mContext = context0;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        String s = this.zzaG(this.mContext);
        return s == null ? zzdf.zzzQ() : zzdf.zzI(s);
    }

    protected String zzaG(Context context0) {
        return Settings.Secure.getString(context0.getContentResolver(), "android_id");
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

