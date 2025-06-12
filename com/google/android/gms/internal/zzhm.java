package com.google.android.gms.internal;

import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@zzgd
public class zzhm {
    static class zza extends zzhm {
        zza() {
            super(null);
        }

        @Override  // com.google.android.gms.internal.zzhm
        public boolean zza(DownloadManager.Request downloadManager$Request0) {
            downloadManager$Request0.setShowRunningNotification(true);
            return true;
        }

        @Override  // com.google.android.gms.internal.zzhm
        public int zzgq() {
            return 6;
        }

        @Override  // com.google.android.gms.internal.zzhm
        public int zzgr() {
            return 7;
        }
    }

    static class zzb extends zza {
        @Override  // com.google.android.gms.internal.zzhm$zza
        public boolean zza(DownloadManager.Request downloadManager$Request0) {
            downloadManager$Request0.allowScanningByMediaScanner();
            downloadManager$Request0.setNotificationVisibility(1);
            return true;
        }

        @Override  // com.google.android.gms.internal.zzhm
        public boolean zza(Context context0, WebSettings webSettings0) {
            if(context0.getCacheDir() != null) {
                webSettings0.setAppCachePath(context0.getCacheDir().getAbsolutePath());
                webSettings0.setAppCacheMaxSize(0L);
                webSettings0.setAppCacheEnabled(true);
            }
            webSettings0.setDatabasePath(context0.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
            webSettings0.setDatabaseEnabled(true);
            webSettings0.setDomStorageEnabled(true);
            webSettings0.setDisplayZoomControls(false);
            webSettings0.setBuiltInZoomControls(true);
            webSettings0.setSupportZoom(true);
            return true;
        }

        @Override  // com.google.android.gms.internal.zzhm
        public boolean zza(Window window0) {
            window0.setFlags(0x1000000, 0x1000000);
            return true;
        }

        @Override  // com.google.android.gms.internal.zzhm
        public boolean zza(WebView webView0) {
            webView0.onPause();
            return true;
        }

        @Override  // com.google.android.gms.internal.zzhm
        public zzie zzb(zzid zzid0, boolean z) {
            return new zzij(zzid0, z);
        }

        @Override  // com.google.android.gms.internal.zzhm
        public boolean zzb(WebView webView0) {
            webView0.onResume();
            return true;
        }

        @Override  // com.google.android.gms.internal.zzhm
        public Set zze(Uri uri0) {
            return uri0.getQueryParameterNames();
        }

        @Override  // com.google.android.gms.internal.zzhm
        public WebChromeClient zzf(zzid zzid0) {
            return new zzii(zzid0);
        }

        @Override  // com.google.android.gms.internal.zzhm
        public boolean zzl(View view0) {
            view0.setLayerType(0, null);
            return true;
        }

        @Override  // com.google.android.gms.internal.zzhm
        public boolean zzm(View view0) {
            view0.setLayerType(1, null);
            return true;
        }
    }

    static class zzc extends zzb {
        @Override  // com.google.android.gms.internal.zzhm$zzb
        public WebChromeClient zzf(zzid zzid0) {
            return new zzik(zzid0);
        }
    }

    static class zzd extends zzf {
        @Override  // com.google.android.gms.internal.zzhm
        public String getDefaultUserAgent(Context context) {
            return WebSettings.getDefaultUserAgent(context);
        }

        @Override  // com.google.android.gms.internal.zzhm$zzb
        public boolean zza(Context context0, WebSettings webSettings0) {
            super.zza(context0, webSettings0);
            webSettings0.setMediaPlaybackRequiresUserGesture(false);
            return true;
        }
    }

    static class zze extends zzd {
        @Override  // com.google.android.gms.internal.zzhm
        public int zzgs() {
            return 14;
        }

        @Override  // com.google.android.gms.internal.zzhm
        public boolean zzk(View view0) {
            return super.zzk(view0) || view0.getWindowId() != null;
        }
    }

    static class zzf extends zzc {
        @Override  // com.google.android.gms.internal.zzhm
        public void zza(View view0, Drawable drawable0) {
            view0.setBackground(drawable0);
        }

        @Override  // com.google.android.gms.internal.zzhm
        public void zza(ViewTreeObserver viewTreeObserver0, ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
            viewTreeObserver0.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
        }

        @Override  // com.google.android.gms.internal.zzhm
        public void zzb(Activity activity0, ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
            Window window0 = activity0.getWindow();
            if(window0 != null && window0.getDecorView() != null && window0.getDecorView().getViewTreeObserver() != null) {
                this.zza(window0.getDecorView().getViewTreeObserver(), viewTreeObserver$OnGlobalLayoutListener0);
            }
        }
    }

    static class zzg extends zze {
        @Override  // com.google.android.gms.internal.zzhm
        public ViewGroup.LayoutParams zzgt() {
            return new ViewGroup.LayoutParams(-1, -1);
        }

        @Override  // com.google.android.gms.internal.zzhm$zze
        public boolean zzk(View view0) {
            return view0.isAttachedToWindow();
        }
    }

    private zzhm() {
    }

    zzhm(com.google.android.gms.internal.zzhm.1 zzhm$10) {
    }

    public String getDefaultUserAgent(Context context) {
        return "";
    }

    public static zzhm zzK(int v) {
        if(v >= 19) {
            return new zzg();
        }
        if(v >= 18) {
            return new zze();
        }
        if(v >= 17) {
            return new zzd();
        }
        if(v >= 16) {
            return new zzf();
        }
        if(v >= 14) {
            return new zzc();
        }
        if(v >= 11) {
            return new zzb();
        }
        return v >= 9 ? new zza() : new zzhm();
    }

    public void zza(View view0, Drawable drawable0) {
        view0.setBackgroundDrawable(drawable0);
    }

    public void zza(ViewTreeObserver viewTreeObserver0, ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        viewTreeObserver0.removeGlobalOnLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
    }

    public boolean zza(DownloadManager.Request downloadManager$Request0) {
        return false;
    }

    public boolean zza(Context context0, WebSettings webSettings0) {
        return false;
    }

    public boolean zza(Window window0) {
        return false;
    }

    public boolean zza(WebView webView0) {
        return false;
    }

    public zzie zzb(zzid zzid0, boolean z) {
        return new zzie(zzid0, z);
    }

    public void zzb(Activity activity0, ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        Window window0 = activity0.getWindow();
        if(window0 != null && window0.getDecorView() != null && window0.getDecorView().getViewTreeObserver() != null) {
            this.zza(window0.getDecorView().getViewTreeObserver(), viewTreeObserver$OnGlobalLayoutListener0);
        }
    }

    public boolean zzb(WebView webView0) {
        return false;
    }

    public Set zze(Uri uri0) {
        if(uri0.isOpaque()) {
            return Collections.emptySet();
        }
        String s = uri0.getEncodedQuery();
        if(s == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        int v = 0;
        do {
            int v1 = s.indexOf(38, v);
            if(v1 == -1) {
                v1 = s.length();
            }
            int v2 = s.indexOf(61, v);
            linkedHashSet0.add(Uri.decode(s.substring(v, (v2 <= v1 && v2 != -1 ? s.indexOf(61, v) : v1))));
            v = v1 + 1;
        }
        while(v < s.length());
        return Collections.unmodifiableSet(linkedHashSet0);
    }

    public WebChromeClient zzf(zzid zzid0) {
        return null;
    }

    public int zzgq() {
        return 0;
    }

    public int zzgr() {
        return 1;
    }

    public int zzgs() {
        return 5;
    }

    public ViewGroup.LayoutParams zzgt() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public boolean zzk(View view0) {
        return view0.getWindowToken() != null || view0.getWindowVisibility() != 8;
    }

    public boolean zzl(View view0) {
        return false;
    }

    public boolean zzm(View view0) {
        return false;
    }

    class com.google.android.gms.internal.zzhm.1 {
    }

}

