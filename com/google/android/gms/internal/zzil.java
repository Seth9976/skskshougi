package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzt;
import java.net.URI;
import java.net.URISyntaxException;

@zzgd
public class zzil extends WebViewClient {
    private final String zzHE;
    private boolean zzHF;
    private final zzfq zzHG;
    private final zzid zzoA;

    public zzil(zzfq zzfq0, zzid zzid0, String s) {
        this.zzHE = this.zzaH(s);
        this.zzHF = false;
        this.zzoA = zzid0;
        this.zzHG = zzfq0;
    }

    @Override  // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        zzb.zzay(("JavascriptAdWebViewClient::onLoadResource: " + url));
        if(!this.zzaG(url)) {
            this.zzoA.zzgF().onLoadResource(this.zzoA.getWebView(), url);
        }
    }

    @Override  // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        zzb.zzay(("JavascriptAdWebViewClient::onPageFinished: " + url));
        if(!this.zzHF) {
            this.zzHG.zzfj();
            this.zzHF = true;
        }
    }

    @Override  // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        zzb.zzay(("JavascriptAdWebViewClient::shouldOverrideUrlLoading: " + url));
        if(this.zzaG(url)) {
            zzb.zzay("shouldOverrideUrlLoading: received passback url");
            return true;
        }
        return this.zzoA.zzgF().shouldOverrideUrlLoading(this.zzoA.getWebView(), url);
    }

    protected boolean zzaG(String s) {
        String s1 = this.zzaH(s);
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        else {
            try {
                URI uRI0 = new URI(s1);
                if("passback".equals(uRI0.getScheme())) {
                    zzb.zzay("Passback received");
                    this.zzHG.zzfk();
                    return true;
                }
                if(!TextUtils.isEmpty(this.zzHE)) {
                    URI uRI1 = new URI(this.zzHE);
                    String s2 = uRI1.getHost();
                    String s3 = uRI0.getHost();
                    String s4 = uRI1.getPath();
                    String s5 = uRI0.getPath();
                    if(zzt.equal(s2, s3) && zzt.equal(s4, s5)) {
                        zzb.zzay("Passback received");
                        this.zzHG.zzfk();
                        return true;
                    }
                }
                return false;
            }
            catch(URISyntaxException uRISyntaxException0) {
            }
        }
        zzb.zzaz(uRISyntaxException0.getMessage());
        return false;
    }

    private String zzaH(String s) {
        if(TextUtils.isEmpty(s)) {
            return s;
        }
        else {
            try {
                return s.endsWith("/") ? s.substring(0, s.length() - 1) : s;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            }
        }
        zzb.zzaz(indexOutOfBoundsException0.getMessage());
        return s;
    }
}

