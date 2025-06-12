package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzcg extends zzak {
    private static final String ID;
    private final Context mContext;

    static {
        zzcg.ID = "_rs";
    }

    public zzcg(Context context0) {
        super("_rs", new String[0]);
        this.mContext = context0;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics0);
        return zzdf.zzI((displayMetrics0.widthPixels + "x" + displayMetrics0.heightPixels));
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

