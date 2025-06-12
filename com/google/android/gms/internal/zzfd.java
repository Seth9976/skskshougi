package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzgd
public class zzfd implements zzfb {
    private final Context mContext;
    final Set zzAt;

    public zzfd(Context context0) {
        this.zzAt = Collections.synchronizedSet(new HashSet());
        this.mContext = context0;
    }

    @Override  // com.google.android.gms.internal.zzfb
    public void zza(String s, String s1, String s2) {
        zzb.zzay("Fetching assets for the given html");
        com.google.android.gms.internal.zzfd.1 zzfd$10 = new Runnable() {
            @Override
            public void run() {
                WebView webView0 = zzfd.this.zzeZ();
                webView0.setWebViewClient(new WebViewClient(webView0) {
                    final com.google.android.gms.internal.zzfd.1 zzAx;
                    final WebView zzrG;

                    @Override  // android.webkit.WebViewClient
                    public void onPageFinished(WebView view, String url) {
                    }

                    @Override  // android.webkit.WebViewClient
                    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                    }
                });
                zzfd.this.zzAt.add(webView0);
                webView0.loadDataWithBaseURL(s1, s2, "text/html", "UTF-8", null);
                zzb.zzay("Fetching assets finished.");
            }
        };
        zzhl.zzGk.post(zzfd$10);
    }

    public WebView zzeZ() {
        WebView webView0 = new WebView(this.mContext);
        webView0.getSettings().setJavaScriptEnabled(true);
        return webView0;
    }
}

