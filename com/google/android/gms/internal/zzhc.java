package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.Future;

@zzgd
public class zzhc implements zzb {
    private Context mContext;
    private boolean zzEd;
    private boolean zzEe;
    private final String zzFE;
    private final zzhd zzFF;
    private BigInteger zzFG;
    private final HashSet zzFH;
    private final HashMap zzFI;
    private boolean zzFJ;
    private int zzFK;
    private zzcb zzFL;
    private zzbk zzFM;
    private final LinkedList zzFN;
    private Boolean zzFO;
    private String zzFP;
    private VersionInfoParcel zzoM;
    private zzay zzop;
    private boolean zzpb;
    private final Object zzqt;
    private zzbj zzrw;
    private zzbi zzrx;
    private final zzgc zzry;

    public zzhc(zzhl zzhl0) {
        this.zzqt = new Object();
        this.zzFG = BigInteger.ONE;
        this.zzFH = new HashSet();
        this.zzFI = new HashMap();
        this.zzFJ = false;
        this.zzEd = true;
        this.zzFK = 0;
        this.zzpb = false;
        this.zzFL = null;
        this.zzEe = true;
        this.zzrw = null;
        this.zzFM = null;
        this.zzrx = null;
        this.zzFN = new LinkedList();
        this.zzry = null;
        this.zzFO = null;
        this.zzFE = "15625982108164020416";
        this.zzFF = new zzhd("15625982108164020416");
    }

    public String getSessionId() {
        return this.zzFE;
    }

    public void zzA(boolean z) {
        synchronized(this.zzqt) {
            this.zzEe = z;
        }
    }

    public zzbk zzD(Context context0) {
        if(!((Boolean)zzbz.zzuc.get()).booleanValue() || this.zzfV()) {
            return null;
        }
        synchronized(this.zzqt) {
            if(this.zzrw == null) {
                if(!(context0 instanceof Activity)) {
                    return null;
                }
                this.zzrw = new zzbj(((Application)context0.getApplicationContext()), ((Activity)context0));
            }
            if(this.zzrx == null) {
                this.zzrx = new zzbi();
            }
            if(this.zzFM == null) {
                this.zzFM = new zzbk(this.zzrw, this.zzrx, new zzgc(this.mContext, this.zzoM, null, null));
            }
            this.zzFM.zzcp();
            return this.zzFM;
        }
    }

    public Bundle zza(Context context0, zzhe zzhe0, String s) {
        synchronized(this.zzqt) {
            Bundle bundle0 = new Bundle();
            bundle0.putBundle("app", this.zzFF.zzd(context0, s));
            Bundle bundle1 = new Bundle();
            for(Object object1: this.zzFI.keySet()) {
                bundle1.putBundle(((String)object1), ((zzhf)this.zzFI.get(((String)object1))).toBundle());
            }
            bundle0.putBundle("slots", bundle1);
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: this.zzFH) {
                arrayList0.add(((zzhb)object2).toBundle());
            }
            bundle0.putParcelableArrayList("ads", arrayList0);
            zzhe0.zza(this.zzFH);
            this.zzFH.clear();
            return bundle0;
        }
    }

    public Future zza(Context context0, boolean z) {
        synchronized(this.zzqt) {
            if(z != this.zzEd) {
                this.zzEd = z;
                return zzhj.zza(context0, z);
            }
            return null;
        }
    }

    public void zza(zzhb zzhb0) {
        synchronized(this.zzqt) {
            this.zzFH.add(zzhb0);
        }
    }

    public void zza(String s, zzhf zzhf0) {
        synchronized(this.zzqt) {
            this.zzFI.put(s, zzhf0);
        }
    }

    public void zza(Thread thread0) {
        zzgc.zza(this.mContext, thread0, this.zzoM);
    }

    public void zzb(Context context0, VersionInfoParcel versionInfoParcel0) {
        synchronized(this.zzqt) {
            if(!this.zzpb) {
                this.mContext = context0.getApplicationContext();
                this.zzoM = versionInfoParcel0;
                zzhj.zza(context0, this);
                zzhj.zzb(context0, this);
                this.zza(Thread.currentThread());
                this.zzFP = zzo.zzbv().zzf(context0, versionInfoParcel0.zzGG);
                this.zzop = new zzay(context0.getApplicationContext(), this.zzoM, new zzdt(context0.getApplicationContext(), this.zzoM, ((String)zzbz.zztD.get())));
                this.zzgf();
                this.zzpb = true;
            }
        }
    }

    public void zzb(Boolean boolean0) {
        synchronized(this.zzqt) {
            this.zzFO = boolean0;
        }
    }

    public void zzb(HashSet hashSet0) {
        synchronized(this.zzqt) {
            this.zzFH.addAll(hashSet0);
        }
    }

    public String zzc(int v, String s) {
        Resources resources0;
        if(this.zzoM.zzGJ) {
            resources0 = this.mContext.getResources();
            return resources0 == null ? s : resources0.getString(v);
        }
        resources0 = GooglePlayServicesUtil.getRemoteResource(this.mContext);
        return resources0 == null ? s : resources0.getString(v);
    }

    @Override  // com.google.android.gms.internal.zzhj$zzb
    public void zzc(Bundle bundle0) {
        synchronized(this.zzqt) {
            this.zzEd = bundle0.containsKey("use_https") ? bundle0.getBoolean("use_https") : this.zzEd;
            this.zzFK = bundle0.containsKey("webview_cache_version") ? bundle0.getInt("webview_cache_version") : this.zzFK;
        }
    }

    public void zzc(Throwable throwable0, boolean z) {
        new zzgc(this.mContext, this.zzoM, null, null).zza(throwable0, z);
    }

    public boolean zzfV() {
        synchronized(this.zzqt) {
        }
        return this.zzEe;
    }

    public String zzfW() {
        synchronized(this.zzqt) {
            String s = this.zzFG.toString();
            this.zzFG = this.zzFG.add(BigInteger.ONE);
            return s;
        }
    }

    public zzhd zzfX() {
        synchronized(this.zzqt) {
        }
        return this.zzFF;
    }

    public zzcb zzfY() {
        synchronized(this.zzqt) {
        }
        return this.zzFL;
    }

    public boolean zzfZ() {
        boolean z;
        synchronized(this.zzqt) {
            z = this.zzFJ;
            this.zzFJ = true;
        }
        return z;
    }

    public boolean zzga() {
        synchronized(this.zzqt) {
        }
        return this.zzEd;
    }

    public String zzgb() {
        synchronized(this.zzqt) {
        }
        return this.zzFP;
    }

    public Boolean zzgc() {
        synchronized(this.zzqt) {
        }
        return this.zzFO;
    }

    public zzay zzgd() {
        return this.zzop;
    }

    public boolean zzge() {
        synchronized(this.zzqt) {
            if(this.zzFK < ((int)(((Integer)zzbz.zzup.get())))) {
                this.zzFK = (int)(((Integer)zzbz.zzup.get()));
                zzhj.zza(this.mContext, this.zzFK);
                return true;
            }
            return false;
        }
    }

    void zzgf() {
        zzca zzca0 = new zzca();
        zzca0.zzb(this.mContext, this.zzoM.zzGG);
        try {
            this.zzFL = zzo.zzbA().zza(zzca0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Cannot initialize CSI reporter.", illegalArgumentException0);
        }
    }
}

