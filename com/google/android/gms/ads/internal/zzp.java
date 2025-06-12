package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzci;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzff;
import com.google.android.gms.internal.zzfj;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzhf;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzhn;
import com.google.android.gms.internal.zzhq;
import com.google.android.gms.internal.zzid;
import com.google.android.gms.internal.zzie;
import com.google.android.gms.internal.zzkw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@zzgd
public final class zzp implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public static final class zza extends ViewSwitcher {
        private final zzhn zzqn;

        public zza(Context context0) {
            super(context0);
            this.zzqn = new zzhn(context0);
        }

        @Override  // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            this.zzqn.zzd(event);
            return false;
        }

        @Override  // android.widget.ViewAnimator
        public void removeAllViews() {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < this.getChildCount(); ++v) {
                View view0 = this.getChildAt(v);
                if(view0 != null && view0 instanceof zzid) {
                    arrayList0.add(((zzid)view0));
                }
            }
            super.removeAllViews();
            for(Object object0: arrayList0) {
                ((zzid)object0).destroy();
            }
        }

        public zzhn zzbP() {
            return this.zzqn;
        }
    }

    boolean zzoU;
    final String zzpF;
    public String zzpG;
    public final Context zzpH;
    final zzan zzpI;
    public final VersionInfoParcel zzpJ;
    zza zzpK;
    public zzhh zzpL;
    public zzhh zzpM;
    public AdSizeParcel zzpN;
    public zzha zzpO;
    public com.google.android.gms.internal.zzha.zza zzpP;
    public zzhb zzpQ;
    zzm zzpR;
    zzn zzpS;
    zzt zzpT;
    zzu zzpU;
    zzff zzpV;
    zzfj zzpW;
    zzcu zzpX;
    zzcv zzpY;
    zzkw zzpZ;
    zzkw zzqa;
    NativeAdOptionsParcel zzqb;
    zzci zzqc;
    List zzqd;
    zzk zzqe;
    public zzhf zzqf;
    View zzqg;
    public int zzqh;
    boolean zzqi;
    private HashSet zzqj;
    private int zzqk;
    private int zzql;
    private zzhq zzqm;

    public zzp(Context context0, AdSizeParcel adSizeParcel0, String s, VersionInfoParcel versionInfoParcel0) {
        this(context0, adSizeParcel0, s, versionInfoParcel0, null);
    }

    zzp(Context context0, AdSizeParcel adSizeParcel0, String s, VersionInfoParcel versionInfoParcel0, zzan zzan0) {
        this.zzqf = null;
        this.zzqg = null;
        this.zzqh = 0;
        this.zzqi = false;
        this.zzoU = false;
        this.zzqj = null;
        this.zzqk = -1;
        this.zzql = -1;
        zzbz.zzw(context0);
        this.zzpF = "929f91ae-d48d-4527-be24-c912c6885e3c";
        if(!adSizeParcel0.zzsn && !adSizeParcel0.zzsp) {
            this.zzpK = new zza(context0);
            this.zzpK.setMinimumWidth(adSizeParcel0.widthPixels);
            this.zzpK.setMinimumHeight(adSizeParcel0.heightPixels);
            this.zzpK.setVisibility(4);
        }
        else {
            this.zzpK = null;
        }
        if(context0 != null && context0 instanceof Activity && this.zzpK != null) {
            zzo.zzbv().zza(((Activity)context0), this);
            zzo.zzbv().zza(((Activity)context0), this);
        }
        this.zzpN = adSizeParcel0;
        this.zzpG = s;
        this.zzpH = context0;
        this.zzpJ = versionInfoParcel0;
        if(zzan0 == null) {
            zzan0 = new zzan(new zzg(this));
        }
        this.zzpI = zzan0;
        this.zzqm = new zzhq(200L);
        this.zzqa = new zzkw();
    }

    public void destroy() {
        this.zzpS = null;
        this.zzpT = null;
        this.zzpW = null;
        this.zzpV = null;
        this.zzqc = null;
        this.zzpU = null;
        if(this.zzpH != null && this.zzpH instanceof Activity && this.zzpK != null) {
            zzo.zzbx().zzb(((Activity)this.zzpH), this);
            zzo.zzbv().zzb(((Activity)this.zzpH), this);
        }
        this.zzf(false);
        if(this.zzpK != null) {
            this.zzpK.removeAllViews();
        }
        this.zzbJ();
        this.zzbL();
        this.zzpO = null;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.zze(false);
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public void onScrollChanged() {
        this.zze(true);
    }

    public void zza(HashSet hashSet0) {
        this.zzqj = hashSet0;
    }

    public HashSet zzbI() {
        return this.zzqj;
    }

    public void zzbJ() {
        if(this.zzpO != null && this.zzpO.zzzE != null) {
            this.zzpO.zzzE.destroy();
        }
    }

    public void zzbK() {
        if(this.zzpO != null && this.zzpO.zzzE != null) {
            this.zzpO.zzzE.stopLoading();
        }
    }

    public void zzbL() {
        if(this.zzpO != null && this.zzpO.zzya != null) {
            try {
                this.zzpO.zzya.destroy();
            }
            catch(RemoteException unused_ex) {
                zzb.zzaC("Could not destroy mediation adapter.");
            }
        }
    }

    public boolean zzbM() {
        return this.zzqh == 0;
    }

    public boolean zzbN() {
        return this.zzqh == 1;
    }

    public void zzbO() {
        this.zzpQ.zzl(this.zzpO.zzFo);
        this.zzpQ.zzm(this.zzpO.zzFp);
        this.zzpQ.zzy(this.zzpN.zzsn);
        this.zzpQ.zzz(this.zzpO.zzCK);
    }

    private void zze(boolean z) {
        boolean z1 = true;
        if(this.zzpK != null && this.zzpO != null && this.zzpO.zzzE != null && (this.zzpO.zzzE.zzgF().zzbU() && (!z || this.zzqm.tryAcquire()))) {
            int[] arr_v = new int[2];
            this.zzpK.getLocationOnScreen(arr_v);
            int v = com.google.android.gms.ads.internal.client.zzk.zzcA().zzc(this.zzpH, arr_v[0]);
            int v1 = com.google.android.gms.ads.internal.client.zzk.zzcA().zzc(this.zzpH, arr_v[1]);
            if(v != this.zzqk || v1 != this.zzql) {
                this.zzqk = v;
                this.zzql = v1;
                zzie zzie0 = this.zzpO.zzzE.zzgF();
                int v2 = this.zzqk;
                int v3 = this.zzql;
                if(z) {
                    z1 = false;
                }
                zzie0.zza(v2, v3, z1);
            }
        }
    }

    public void zzf(boolean z) {
        if(this.zzqh == 0) {
            this.zzbK();
        }
        if(this.zzpL != null) {
            this.zzpL.cancel();
        }
        if(this.zzpM != null) {
            this.zzpM.cancel();
        }
        if(z) {
            this.zzpO = null;
        }
    }
}

