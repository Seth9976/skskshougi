package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzex.zza;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzhn;
import com.google.android.gms.internal.zzid;
import com.google.android.gms.internal.zzif;

@zzgd
public class zzc extends zza implements zzl {
    @zzgd
    static final class com.google.android.gms.ads.internal.overlay.zzc.zza extends Exception {
        public com.google.android.gms.ads.internal.overlay.zzc.zza(String s) {
            super(s);
        }
    }

    @zzgd
    static final class zzb extends RelativeLayout {
        zzhn zzqn;

        public zzb(Context context0, String s) {
            super(context0);
            this.zzqn = new zzhn(context0, s);
        }

        @Override  // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            this.zzqn.zzd(event);
            return false;
        }
    }

    @zzgd
    public static class com.google.android.gms.ads.internal.overlay.zzc.zzc {
        public final int index;
        public final Context zzpH;
        public final ViewGroup zzzA;
        public final ViewGroup.LayoutParams zzzz;

        public com.google.android.gms.ads.internal.overlay.zzc.zzc(zzid zzid0) throws com.google.android.gms.ads.internal.overlay.zzc.zza {
            this.zzzz = zzid0.getLayoutParams();
            ViewParent viewParent0 = zzid0.getParent();
            this.zzpH = zzid0.zzgC();
            if(viewParent0 == null || !(viewParent0 instanceof ViewGroup)) {
                throw new com.google.android.gms.ads.internal.overlay.zzc.zza("Could not get the parent of the WebView for an overlay.");
            }
            this.zzzA = (ViewGroup)viewParent0;
            WebView webView0 = zzid0.getWebView();
            this.index = this.zzzA.indexOfChild(webView0);
            WebView webView1 = zzid0.getWebView();
            this.zzzA.removeView(webView1);
            zzid0.zzB(true);
        }
    }

    private final Activity mActivity;
    zzid zzoA;
    RelativeLayout zzyG;
    static final int zzzj;
    AdOverlayInfoParcel zzzk;
    zzh zzzl;
    com.google.android.gms.ads.internal.overlay.zzc.zzc zzzm;
    zzj zzzn;
    boolean zzzo;
    FrameLayout zzzp;
    WebChromeClient.CustomViewCallback zzzq;
    boolean zzzr;
    boolean zzzs;
    boolean zzzt;
    int zzzu;
    private boolean zzzv;
    private boolean zzzw;
    private boolean zzzx;

    static {
        zzc.zzzj = 0;
    }

    public zzc(Activity activity0) {
        this.zzzo = false;
        this.zzzr = false;
        this.zzzs = false;
        this.zzzt = false;
        this.zzzu = 0;
        this.zzzw = false;
        this.zzzx = true;
        this.mActivity = activity0;
    }

    public void close() {
        this.zzzu = 2;
        this.mActivity.finish();
    }

    @Override  // com.google.android.gms.internal.zzex
    public void onBackPressed() {
        this.zzzu = 0;
    }

    @Override  // com.google.android.gms.internal.zzex
    public void onCreate(Bundle savedInstanceState) {
        boolean z = savedInstanceState == null ? false : savedInstanceState.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            this.zzzr = z;
            this.zzzk = AdOverlayInfoParcel.zzb(this.mActivity.getIntent());
            if(this.zzzk == null) {
                throw new com.google.android.gms.ads.internal.overlay.zzc.zza("Could not get info for ad overlay.");
            }
            if(this.zzzk.zzpJ.zzGI > 7500000) {
                this.zzzu = 3;
            }
            if(this.mActivity.getIntent() != null) {
                this.zzzx = this.mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            this.zzzs = this.zzzk.zzzN == null ? false : this.zzzk.zzzN.zzoU;
            if(savedInstanceState == null) {
                if(this.zzzk.zzzD != null && this.zzzx) {
                    this.zzzk.zzzD.zzaW();
                }
                if(this.zzzk.zzzK != 1 && this.zzzk.zzzC != null) {
                    this.zzzk.zzzC.onAdClicked();
                }
            }
            this.zzyG = new zzb(this.mActivity, this.zzzk.zzzM);
            switch(this.zzzk.zzzK) {
                case 1: {
                    this.zzu(false);
                    return;
                }
                case 2: {
                    this.zzzm = new com.google.android.gms.ads.internal.overlay.zzc.zzc(this.zzzk.zzzE);
                    this.zzu(false);
                    return;
                }
                case 3: {
                    this.zzu(true);
                    return;
                }
                case 4: {
                    if(this.zzzr) {
                        this.zzzu = 3;
                        this.mActivity.finish();
                        return;
                    }
                    if(!zzo.zzbs().zza(this.mActivity, this.zzzk.zzzB, this.zzzk.zzzJ)) {
                        this.zzzu = 3;
                        this.mActivity.finish();
                        return;
                    }
                    break;
                }
                default: {
                    throw new com.google.android.gms.ads.internal.overlay.zzc.zza("Could not determine ad overlay type.");
                }
            }
        }
        catch(com.google.android.gms.ads.internal.overlay.zzc.zza zzc$zza0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC(zzc$zza0.getMessage());
            this.zzzu = 3;
            this.mActivity.finish();
        }
    }

    @Override  // com.google.android.gms.internal.zzex
    public void onDestroy() {
        if(this.zzzl != null) {
            this.zzzl.destroy();
        }
        if(this.zzoA != null) {
            this.zzyG.removeView(this.zzoA.getWebView());
        }
        this.zzeu();
    }

    @Override  // com.google.android.gms.internal.zzex
    public void onPause() {
        if(this.zzzl != null) {
            this.zzzl.pause();
        }
        this.zzer();
        if(this.zzoA != null && (!this.mActivity.isFinishing() || this.zzzm == null)) {
            zzo.zzbx().zza(this.zzoA.getWebView());
        }
        this.zzeu();
    }

    @Override  // com.google.android.gms.internal.zzex
    public void onRestart() {
    }

    @Override  // com.google.android.gms.internal.zzex
    public void onResume() {
        if(this.zzzk != null && this.zzzk.zzzK == 4) {
            if(this.zzzr) {
                this.zzzu = 3;
                this.mActivity.finish();
            }
            else {
                this.zzzr = true;
            }
        }
        if(this.zzoA != null && !this.zzoA.isDestroyed()) {
            zzo.zzbx().zzb(this.zzoA.getWebView());
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("The webview does not exit. Ignoring action.");
    }

    @Override  // com.google.android.gms.internal.zzex
    public void onSaveInstanceState(Bundle outBundle) {
        outBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzzr);
    }

    @Override  // com.google.android.gms.internal.zzex
    public void onStart() {
    }

    @Override  // com.google.android.gms.internal.zzex
    public void onStop() {
        this.zzeu();
    }

    public void setRequestedOrientation(int requestedOrientation) {
        this.mActivity.setRequestedOrientation(requestedOrientation);
    }

    public void zza(View view0, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        this.zzzp = new FrameLayout(this.mActivity);
        this.zzzp.setBackgroundColor(0xFF000000);
        this.zzzp.addView(view0, -1, -1);
        this.mActivity.setContentView(this.zzzp);
        this.zzaE();
        this.zzzq = webChromeClient$CustomViewCallback0;
        this.zzzo = true;
    }

    public void zza(boolean z, boolean z1) {
        if(this.zzzn != null) {
            this.zzzn.zza(z, z1);
        }
    }

    @Override  // com.google.android.gms.internal.zzex
    public void zzaE() {
        this.zzzv = true;
    }

    public void zzd(int v, int v1, int v2, int v3) {
        if(this.zzzl != null) {
            this.zzzl.zzf(v, v1, v2, v3);
        }
    }

    public void zze(int v, int v1, int v2, int v3) {
        if(this.zzzl == null) {
            this.zzzl = new zzh(this.mActivity, this.zzoA);
            this.zzyG.addView(this.zzzl, 0, new ViewGroup.LayoutParams(-1, -1));
            this.zzzl.zzf(v, v1, v2, v3);
            this.zzoA.zzgF().zzD(false);
        }
    }

    public zzh zzeq() {
        return this.zzzl;
    }

    public void zzer() {
        if(this.zzzk != null && this.zzzo) {
            this.setRequestedOrientation(this.zzzk.orientation);
        }
        if(this.zzzp != null) {
            this.mActivity.setContentView(this.zzyG);
            this.zzaE();
            this.zzzp.removeAllViews();
            this.zzzp = null;
        }
        if(this.zzzq != null) {
            this.zzzq.onCustomViewHidden();
            this.zzzq = null;
        }
        this.zzzo = false;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzl
    public void zzes() {
        this.zzzu = 1;
        this.mActivity.finish();
    }

    public void zzet() {
        this.zzyG.removeView(this.zzzn);
        this.zzt(true);
    }

    protected void zzeu() {
        if(this.mActivity.isFinishing() && !this.zzzw) {
            this.zzzw = true;
            if(this.mActivity.isFinishing()) {
                if(this.zzoA != null) {
                    this.zzv(this.zzzu);
                    this.zzyG.removeView(this.zzoA.getWebView());
                    if(this.zzzm != null) {
                        this.zzoA.setContext(this.zzzm.zzpH);
                        this.zzoA.zzB(false);
                        this.zzzm.zzzA.addView(this.zzoA.getWebView(), this.zzzm.index, this.zzzm.zzzz);
                        this.zzzm = null;
                    }
                }
                if(this.zzzk != null && this.zzzk.zzzD != null) {
                    this.zzzk.zzzD.zzaV();
                }
            }
        }
    }

    public void zzev() {
        if(this.zzzt) {
            this.zzzt = false;
            this.zzew();
        }
    }

    protected void zzew() {
        this.zzoA.zzew();
    }

    public void zzt(boolean z) {
        this.zzzn = new zzj(this.mActivity, (z ? 50 : 0x20), this);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10);
        relativeLayout$LayoutParams0.addRule((z ? 11 : 9));
        this.zzzn.zza(z, this.zzzk.zzzH);
        this.zzyG.addView(this.zzzn, relativeLayout$LayoutParams0);
    }

    protected void zzu(boolean z) throws com.google.android.gms.ads.internal.overlay.zzc.zza {
        if(!this.zzzv) {
            this.mActivity.requestWindowFeature(1);
        }
        Window window0 = this.mActivity.getWindow();
        if(window0 == null) {
            throw new com.google.android.gms.ads.internal.overlay.zzc.zza("Invalid activity, no window available.");
        }
        if(!this.zzzs || this.zzzk.zzzN != null && this.zzzk.zzzN.zzoV) {
            window0.setFlags(0x400, 0x400);
        }
        boolean z1 = this.zzzk.zzzE.zzgF().zzbU();
        this.zzzt = false;
        if(z1) {
            if(this.zzzk.orientation == zzo.zzbx().zzgq()) {
                this.zzzt = this.mActivity.getResources().getConfiguration().orientation == 1;
            }
            else if(this.zzzk.orientation == zzo.zzbx().zzgr()) {
                this.zzzt = this.mActivity.getResources().getConfiguration().orientation == 2;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzay(("Delay onShow to next orientation change: " + this.zzzt));
        this.setRequestedOrientation(this.zzzk.orientation);
        if(zzo.zzbx().zza(window0)) {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Hardware acceleration on the AdActivity window enabled.");
        }
        if(this.zzzs) {
            this.zzyG.setBackgroundColor(zzc.zzzj);
        }
        else {
            this.zzyG.setBackgroundColor(0xFF000000);
        }
        this.mActivity.setContentView(this.zzyG);
        this.zzaE();
        if(z) {
            zzif zzif0 = zzo.zzbw();
            AdSizeParcel adSizeParcel0 = this.zzzk.zzzE.zzaN();
            this.zzoA = zzif0.zza(this.mActivity, adSizeParcel0, true, z1, null, this.zzzk.zzpJ);
            this.zzoA.zzgF().zzb(null, null, this.zzzk.zzzF, this.zzzk.zzzJ, true, this.zzzk.zzzL, null, this.zzzk.zzzE.zzgF().zzgM(), null);
            this.zzoA.zzgF().zza(new com.google.android.gms.internal.zzie.zza() {
                @Override  // com.google.android.gms.internal.zzie$zza
                public void zza(zzid zzid0, boolean z) {
                    zzid0.zzgF().zzgS();
                    zzid0.zzew();
                }
            });
            if(this.zzzk.zzzf == null) {
                if(this.zzzk.zzzI == null) {
                    throw new com.google.android.gms.ads.internal.overlay.zzc.zza("No URL or HTML to display in ad overlay.");
                }
                this.zzoA.loadDataWithBaseURL(this.zzzk.zzzG, this.zzzk.zzzI, "text/html", "UTF-8", null);
            }
            else {
                this.zzoA.loadUrl(this.zzzk.zzzf);
            }
            if(this.zzzk.zzzE != null) {
                this.zzzk.zzzE.zzb(this);
            }
        }
        else {
            this.zzoA = this.zzzk.zzzE;
            this.zzoA.setContext(this.mActivity);
        }
        this.zzoA.zza(this);
        ViewParent viewParent0 = this.zzoA.getParent();
        if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
            ((ViewGroup)viewParent0).removeView(this.zzoA.getWebView());
        }
        if(this.zzzs) {
            this.zzoA.setBackgroundColor(zzc.zzzj);
        }
        this.zzyG.addView(this.zzoA.getWebView(), -1, -1);
        if(!z && !this.zzzt) {
            this.zzew();
        }
        this.zzt(z1);
        if(this.zzoA.zzgG()) {
            this.zza(z1, true);
        }
    }

    protected void zzv(int v) {
        this.zzoA.zzv(v);
    }
}

