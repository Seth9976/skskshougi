package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@zzgd
public class zzie extends WebViewClient {
    public interface zza {
        void zza(zzid arg1, boolean arg2);
    }

    static class zzb implements zzf {
        private zzf zzHc;
        private zzid zzHn;

        public zzb(zzid zzid0, zzf zzf0) {
            this.zzHn = zzid0;
            this.zzHc = zzf0;
        }

        @Override  // com.google.android.gms.ads.internal.overlay.zzf
        public void zzaV() {
            this.zzHc.zzaV();
            this.zzHn.zzgA();
        }

        @Override  // com.google.android.gms.ads.internal.overlay.zzf
        public void zzaW() {
            this.zzHc.zzaW();
            this.zzHn.zzew();
        }
    }

    class zzc implements zzdg {
        final zzie zzHm;

        private zzc() {
        }

        zzc(com.google.android.gms.internal.zzie.1 zzie$10) {
        }

        @Override  // com.google.android.gms.internal.zzdg
        public void zza(zzid zzid0, Map map0) {
            if(map0.keySet().contains("start")) {
                zzie.this.zzgO();
                return;
            }
            if(map0.keySet().contains("stop")) {
                zzie.this.zzgP();
                return;
            }
            if(map0.keySet().contains("cancel")) {
                zzie.this.zzgQ();
            }
        }
    }

    private zza zzBi;
    private final HashMap zzHb;
    private zzf zzHc;
    private boolean zzHd;
    private zzk zzHe;
    private final zzet zzHf;
    private boolean zzHg;
    private boolean zzHh;
    private boolean zzHi;
    private boolean zzHj;
    private int zzHk;
    protected final zzid zzoA;
    private boolean zzqs;
    private final Object zzqt;
    private com.google.android.gms.ads.internal.client.zza zzrU;
    private zzde zzvU;
    private zzdk zzwu;
    private zzd zzww;
    private zzep zzwx;
    private zzdi zzwz;
    private zzev zzyE;

    public zzie(zzid zzid0, boolean z) {
        this(zzid0, z, new zzet(zzid0, zzid0.zzgC(), new zzbq(zzid0.getContext())), null);
    }

    zzie(zzid zzid0, boolean z, zzet zzet0, zzep zzep0) {
        this.zzHb = new HashMap();
        this.zzqt = new Object();
        this.zzHd = false;
        this.zzoA = zzid0;
        this.zzqs = z;
        this.zzHf = zzet0;
        this.zzwx = zzep0;
    }

    @Override  // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String url) {
        com.google.android.gms.ads.internal.util.client.zzb.zzaB(("Loading resource: " + url));
        Uri uri0 = Uri.parse(url);
        if("gmsg".equalsIgnoreCase(uri0.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri0.getHost())) {
            this.zzg(uri0);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String url) {
        synchronized(this.zzqt) {
            if(this.zzHh && "about:blank".equals(url)) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaB("Blank page loaded, 1...");
                this.zzoA.zzgK();
                return;
            }
        }
        this.zzHi = true;
        this.zzgR();
    }

    public final void reset() {
        synchronized(this.zzqt) {
            this.zzHb.clear();
            this.zzrU = null;
            this.zzHc = null;
            this.zzBi = null;
            this.zzvU = null;
            this.zzHd = false;
            this.zzqs = false;
            this.zzwz = null;
            this.zzHe = null;
            if(this.zzwx != null) {
                this.zzwx.zzn(true);
                this.zzwx = null;
            }
            this.zzHg = false;
        }
    }

    @Override  // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
        switch(event.getKeyCode()) {
            case 0x4F: 
            case 85: 
            case 86: 
            case 87: 
            case 88: 
            case 89: 
            case 90: 
            case 91: 
            case 0x7E: 
            case 0x7F: 
            case 0x80: 
            case 0x81: 
            case 130: 
            case 0xDE: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String url) {
        Uri uri1;
        com.google.android.gms.ads.internal.util.client.zzb.zzaB(("AdWebView shouldOverrideUrlLoading: " + url));
        Uri uri0 = Uri.parse(url);
        if("gmsg".equalsIgnoreCase(uri0.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri0.getHost())) {
            this.zzg(uri0);
            return true;
        }
        if(this.zzHd && webView == this.zzoA && zzie.zzf(uri0)) {
            if(!this.zzHg) {
                this.zzHg = true;
                if(this.zzrU != null && ((Boolean)zzbz.zzul.get()).booleanValue()) {
                    this.zzrU.onAdClicked();
                }
            }
            return super.shouldOverrideUrlLoading(webView, url);
        }
        if(!this.zzoA.willNotDraw()) {
            try {
                zzan zzan0 = this.zzoA.zzgH();
                if(zzan0 != null && zzan0.zzb(uri0)) {
                    uri0 = zzan0.zza(uri0, this.zzoA.getContext());
                }
            }
            catch(zzao unused_ex) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC(("Unable to append parameter to URL: " + url));
            }
            uri1 = uri0;
            if(this.zzww == null || this.zzww.zzbd()) {
                this.zza(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", uri1.toString(), null, null, null, null, null));
                return true;
            }
            this.zzww.zzo(url);
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaC(("AdWebView unable to handle URL: " + url));
        return true;
    }

    public void zzD(boolean z) {
        this.zzHd = z;
    }

    public void zza(int v, int v1, boolean z) {
        this.zzHf.zze(v, v1);
        if(this.zzwx != null) {
            this.zzwx.zza(v, v1, z);
        }
    }

    public final void zza(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel0) {
        zzf zzf0 = null;
        boolean z = this.zzoA.zzgJ();
        com.google.android.gms.ads.internal.client.zza zza0 = !z || this.zzoA.zzaN().zzsn ? this.zzrU : null;
        if(!z) {
            zzf0 = this.zzHc;
        }
        this.zza(new AdOverlayInfoParcel(adLauncherIntentInfoParcel0, zza0, zzf0, this.zzHe, this.zzoA.zzgI()));
    }

    public void zza(AdOverlayInfoParcel adOverlayInfoParcel0) {
        boolean z = false;
        boolean z1 = this.zzwx == null ? false : this.zzwx.zzee();
        com.google.android.gms.ads.internal.overlay.zzd zzd0 = zzo.zzbt();
        Context context0 = this.zzoA.getContext();
        if(!z1) {
            z = true;
        }
        zzd0.zza(context0, adOverlayInfoParcel0, z);
    }

    public void zza(zza zzie$zza0) {
        this.zzBi = zzie$zza0;
    }

    public final void zza(String s, zzdg zzdg0) {
        synchronized(this.zzqt) {
            List list0 = (List)this.zzHb.get(s);
            if(list0 == null) {
                list0 = new CopyOnWriteArrayList();
                this.zzHb.put(s, list0);
            }
            list0.add(zzdg0);
        }
    }

    public final void zza(boolean z, int v) {
        com.google.android.gms.ads.internal.client.zza zza0 = !this.zzoA.zzgJ() || this.zzoA.zzaN().zzsn ? this.zzrU : null;
        zzf zzf0 = this.zzHc;
        zzk zzk0 = this.zzHe;
        VersionInfoParcel versionInfoParcel0 = this.zzoA.zzgI();
        this.zza(new AdOverlayInfoParcel(zza0, zzf0, zzk0, this.zzoA, z, v, versionInfoParcel0));
    }

    public final void zza(boolean z, int v, String s) {
        zzf zzf0 = null;
        boolean z1 = this.zzoA.zzgJ();
        com.google.android.gms.ads.internal.client.zza zza0 = !z1 || this.zzoA.zzaN().zzsn ? this.zzrU : null;
        if(!z1) {
            zzf0 = new zzb(this.zzoA, this.zzHc);
        }
        zzde zzde0 = this.zzvU;
        zzk zzk0 = this.zzHe;
        VersionInfoParcel versionInfoParcel0 = this.zzoA.zzgI();
        this.zza(new AdOverlayInfoParcel(zza0, zzf0, zzde0, zzk0, this.zzoA, z, v, s, versionInfoParcel0, this.zzwz));
    }

    public final void zza(boolean z, int v, String s, String s1) {
        boolean z1 = this.zzoA.zzgJ();
        com.google.android.gms.ads.internal.client.zza zza0 = !z1 || this.zzoA.zzaN().zzsn ? this.zzrU : null;
        zzb zzie$zzb0 = z1 ? null : new zzb(this.zzoA, this.zzHc);
        zzde zzde0 = this.zzvU;
        zzk zzk0 = this.zzHe;
        VersionInfoParcel versionInfoParcel0 = this.zzoA.zzgI();
        this.zza(new AdOverlayInfoParcel(zza0, zzie$zzb0, zzde0, zzk0, this.zzoA, z, v, s, s1, versionInfoParcel0, this.zzwz));
    }

    public void zzb(com.google.android.gms.ads.internal.client.zza zza0, zzf zzf0, zzde zzde0, zzk zzk0, boolean z, zzdi zzdi0, zzdk zzdk0, zzd zzd0, zzev zzev0) {
        if(zzd0 == null) {
            zzd0 = new zzd(false);
        }
        this.zzwx = new zzep(this.zzoA, zzev0);
        this.zza("/appEvent", new zzdd(zzde0));
        this.zza("/canOpenURLs", zzdf.zzvW);
        this.zza("/canOpenIntents", zzdf.zzvX);
        this.zza("/click", zzdf.zzvY);
        this.zza("/close", zzdf.zzvZ);
        this.zza("/customClose", zzdf.zzwa);
        this.zza("/delayPageLoaded", new zzc(this, null));
        this.zza("/httpTrack", zzdf.zzwb);
        this.zza("/log", zzdf.zzwc);
        this.zza("/mraid", new zzdm(zzd0, this.zzwx));
        this.zza("/open", new zzdn(zzdi0, zzd0, this.zzwx));
        this.zza("/precache", zzdf.zzwf);
        this.zza("/touch", zzdf.zzwd);
        this.zza("/video", zzdf.zzwe);
        if(zzdk0 != null) {
            this.zza("/setInterstitialProperties", new zzdj(zzdk0));
        }
        this.zzrU = zza0;
        this.zzHc = zzf0;
        this.zzvU = zzde0;
        this.zzwz = zzdi0;
        this.zzHe = zzk0;
        this.zzww = zzd0;
        this.zzyE = zzev0;
        this.zzwu = zzdk0;
        this.zzD(z);
        this.zzHg = false;
    }

    public final void zzb(String s, zzdg zzdg0) {
        synchronized(this.zzqt) {
            List list0 = (List)this.zzHb.get(s);
            if(list0 == null) {
                return;
            }
            list0.remove(zzdg0);
        }
    }

    public boolean zzbU() {
        synchronized(this.zzqt) {
        }
        return this.zzqs;
    }

    public void zzd(int v, int v1) {
        if(this.zzwx != null) {
            this.zzwx.zzd(v, v1);
        }
    }

    public final void zzet() {
        synchronized(this.zzqt) {
            this.zzHd = false;
            this.zzqs = true;
            this.zzoA.zzgL();
            com.google.android.gms.ads.internal.overlay.zzc zzc0 = this.zzoA.zzgD();
            if(zzc0 != null) {
                if(com.google.android.gms.ads.internal.client.zzk.zzcA().zzgw()) {
                    zzc0.zzet();
                }
                else {
                    com.google.android.gms.internal.zzie.1 zzie$10 = new Runnable() {
                        @Override
                        public void run() {
                            zzc0.zzet();
                        }
                    };
                    zzhl.zzGk.post(zzie$10);
                }
            }
        }
    }

    private static boolean zzf(Uri uri0) {
        String s = uri0.getScheme();
        return "http".equalsIgnoreCase(s) || "https".equalsIgnoreCase(s);
    }

    public void zzg(Uri uri0) {
        String s = uri0.getPath();
        List list0 = (List)this.zzHb.get(s);
        if(list0 != null) {
            Map map0 = zzo.zzbv().zzd(uri0);
            if(com.google.android.gms.ads.internal.util.client.zzb.zzL(2)) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaB(("Received GMSG: " + s));
                for(Object object0: map0.keySet()) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaB(("  " + ((String)object0) + ": " + ((String)map0.get(((String)object0)))));
                }
            }
            for(Object object1: list0) {
                ((zzdg)object1).zza(this.zzoA, map0);
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaB(("No GMSG handler found for GMSG: " + uri0));
    }

    public zzd zzgM() {
        return this.zzww;
    }

    public void zzgN() {
        synchronized(this.zzqt) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaB("Loading blank page in WebView, 2...");
            this.zzHh = true;
            this.zzoA.zzaD("about:blank");
        }
    }

    private void zzgO() {
        ++this.zzHk;
        this.zzgR();
    }

    private void zzgP() {
        --this.zzHk;
        this.zzgR();
    }

    private void zzgQ() {
        this.zzHj = true;
        this.zzgR();
    }

    public final void zzgR() {
        if(this.zzBi != null && (this.zzHi && this.zzHk <= 0 || this.zzHj)) {
            this.zzBi.zza(this.zzoA, !this.zzHj);
            this.zzBi = null;
        }
    }

    public void zzgS() {
        if(this.zzbU()) {
            this.zzHf.zzek();
        }
    }
}

