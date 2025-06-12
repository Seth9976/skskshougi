package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzgd
public class zzij extends zzie {
    public zzij(zzid zzid0, boolean z) {
        super(zzid0, z);
    }

    @Override  // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String url) {
        String s1;
        try {
            if(!"mraid.js".equalsIgnoreCase(new File(url).getName())) {
                return super.shouldInterceptRequest(webView, url);
            }
            if(!(webView instanceof zzid)) {
                zzb.zzaC("Tried to intercept request from a WebView that wasn\'t an AdWebView.");
                return super.shouldInterceptRequest(webView, url);
            }
            ((zzid)webView).zzgF().zzet();
            if(((zzid)webView).zzaN().zzsn) {
                s1 = "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js";
            }
            else {
                s1 = ((zzid)webView).zzgJ() ? "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js" : "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js";
            }
            zzb.zzaB(("shouldInterceptRequest(" + s1 + ")"));
            return this.zzd(((zzid)webView).getContext(), this.zzoA.zzgI().zzGG, s1);
        }
        catch(IOException | ExecutionException | InterruptedException | TimeoutException iOException0) {
            zzb.zzaC(("Could not fetch MRAID JS. " + iOException0.getMessage()));
            return super.shouldInterceptRequest(webView, url);
        }
    }

    protected WebResourceResponse zzd(Context context0, String s, String s1) throws IOException, ExecutionException, InterruptedException, TimeoutException {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("User-Agent", zzo.zzbv().zzf(context0, s));
        hashMap0.put("Cache-Control", "max-stale=3600");
        String s2 = (String)new zzho(context0).zzb(s1, hashMap0).get(60L, TimeUnit.SECONDS);
        return s2 == null ? null : new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(s2.getBytes("UTF-8")));
    }
}

