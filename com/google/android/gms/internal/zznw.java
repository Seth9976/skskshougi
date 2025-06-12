package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.List;

public class zznw {
    public interface zza {
        void zza(zzod arg1);

        void zza(zzod arg1, Activity arg2);
    }

    private static final zza[] zzaEq;
    private static zznw zzaEr;
    private final Application zzaEs;
    private zzod zzaEt;
    private final List zzaEu;
    private zzog zzaEv;

    static {
        zznw.zzaEq = new zza[0];
    }

    private zznw(Application application0) {
        zzu.zzu(application0);
        this.zzaEs = application0;
        this.zzaEu = new ArrayList();
    }

    public void zza(zza zznw$zza0) {
        zzu.zzu(zznw$zza0);
        synchronized(this.zzaEu) {
            this.zzaEu.remove(zznw$zza0);
            this.zzaEu.add(zznw$zza0);
        }
    }

    public static zznw zzaC(Context context0) {
        zzu.zzu(context0);
        Application application0 = (Application)context0.getApplicationContext();
        zzu.zzu(application0);
        synchronized(zznw.class) {
            if(zznw.zzaEr == null) {
                zznw.zzaEr = new zznw(application0);
            }
            return zznw.zzaEr;
        }
    }

    public void zzaf(boolean z) {
        if(Build.VERSION.SDK_INT < 14) {
            Log.i("com.google.android.gms.measurement.ScreenViewService", "AutoScreeViewTracking is not supported on API 14 or earlier devices");
            return;
        }
        if(this.zzwg() != z) {
            if(z) {
                this.zzaEv = new zzog(this);
                this.zzaEs.registerActivityLifecycleCallbacks(this.zzaEv);
                return;
            }
            this.zzaEs.unregisterActivityLifecycleCallbacks(this.zzaEv);
            this.zzaEv = null;
        }
    }

    public void zzb(zzod zzod0, Activity activity0) {
        zzu.zzu(zzod0);
        zza[] arr_zznw$zza = null;
        if(zzod0.isMutable()) {
            if(activity0 instanceof zznv) {
                ((zznv)activity0).zzb(zzod0);
            }
            if(this.zzaEt != null) {
                zzod0.zzhL(this.zzaEt.zzbn());
                zzod0.zzdJ(this.zzaEt.zzwB());
            }
            zza[] arr_zznw$zza1 = this.zzwh();
            for(int v1 = 0; v1 < arr_zznw$zza1.length; ++v1) {
                arr_zznw$zza1[v1].zza(zzod0, activity0);
            }
            zzod0.zzwF();
            if(!TextUtils.isEmpty(zzod0.zzwB())) {
                arr_zznw$zza = arr_zznw$zza1;
                goto label_18;
            }
        }
        else {
        label_18:
            if(this.zzaEt != null && this.zzaEt.zzbn() == zzod0.zzbn()) {
                this.zzaEt = zzod0;
                return;
            }
            this.zzwf();
            this.zzaEt = zzod0;
            if(arr_zznw$zza == null) {
                arr_zznw$zza = this.zzwh();
            }
            for(int v = 0; v < arr_zznw$zza.length; ++v) {
                arr_zznw$zza[v].zza(zzod0);
            }
        }
    }

    public zzod zzwe() {
        return this.zzaEt;
    }

    public void zzwf() {
        this.zzaEt = null;
    }

    public boolean zzwg() {
        return this.zzaEv != null;
    }

    private zza[] zzwh() {
        synchronized(this.zzaEu) {
            return this.zzaEu.isEmpty() ? zznw.zzaEq : ((zza[])this.zzaEu.toArray(new zza[this.zzaEu.size()]));
        }
    }
}

