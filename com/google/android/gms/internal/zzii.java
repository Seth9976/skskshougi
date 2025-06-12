package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;

@zzgd
public class zzii extends WebChromeClient {
    private final zzid zzoA;

    public zzii(zzid zzid0) {
        this.zzoA = zzid0;
    }

    @Override  // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if(!(webView instanceof zzid)) {
            zzb.zzaC("Tried to close a WebView that wasn\'t an AdWebView.");
            return;
        }
        zzc zzc0 = ((zzid)webView).zzgD();
        if(zzc0 == null) {
            zzb.zzaC("Tried to close an AdWebView not associated with an overlay.");
            return;
        }
        zzc0.close();
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String s = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if(s.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch(com.google.android.gms.internal.zzii.7.zzHD[consoleMessage.messageLevel().ordinal()]) {
            case 1: {
                zzb.zzaz(s);
                return super.onConsoleMessage(consoleMessage);
            }
            case 2: {
                zzb.zzaC(s);
                return super.onConsoleMessage(consoleMessage);
            }
            case 3: 
            case 4: {
                zzb.zzaA(s);
                return super.onConsoleMessage(consoleMessage);
            }
            case 5: {
                zzb.zzay(s);
                return super.onConsoleMessage(consoleMessage);
            }
            default: {
                zzb.zzaA(s);
                return super.onConsoleMessage(consoleMessage);
            }
        }
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        WebView.WebViewTransport webView$WebViewTransport0 = (WebView.WebViewTransport)resultMsg.obj;
        WebView webView1 = new WebView(view.getContext());
        webView1.setWebViewClient(this.zzoA.zzgF());
        webView$WebViewTransport0.setWebView(webView1);
        resultMsg.sendToTarget();
        return true;
    }

    @Override  // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String url, String databaseIdentifier, long currentQuota, long estimatedSize, long totalUsedQuota, WebStorage.QuotaUpdater quotaUpdater) {
        if(0x500000L - totalUsedQuota <= 0L) {
            quotaUpdater.updateQuota(currentQuota);
            return;
        }
        if(currentQuota != 0L) {
            if(estimatedSize == 0L) {
                estimatedSize = Math.min(Math.min(0x20000L, 0x500000L - totalUsedQuota) + currentQuota, 0x100000L);
            }
            else {
                if(estimatedSize <= Math.min(0x100000L - currentQuota, 0x500000L - totalUsedQuota)) {
                    currentQuota += estimatedSize;
                }
                estimatedSize = currentQuota;
            }
        }
        else if(estimatedSize > 0x500000L - totalUsedQuota || estimatedSize > 0x100000L) {
            estimatedSize = 0L;
        }
        quotaUpdater.updateQuota(estimatedSize);
    }

    @Override  // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
        if(callback != null) {
            callback.invoke(origin, this.zzha(), true);
        }
    }

    @Override  // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        zzc zzc0 = this.zzoA.zzgD();
        if(zzc0 == null) {
            zzb.zzaC("Could not get ad overlay when hiding custom view.");
            return;
        }
        zzc0.zzer();
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String url, String message, JsResult result) {
        return this.zza(this.zzc(webView), url, message, null, result, null, false);
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String url, String message, JsResult result) {
        return this.zza(this.zzc(webView), url, message, null, result, null, false);
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String url, String message, JsResult result) {
        return this.zza(this.zzc(webView), url, message, null, result, null, false);
    }

    @Override  // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String url, String message, String defaultValue, JsPromptResult result) {
        return this.zza(this.zzc(webView), url, message, defaultValue, null, result, true);
    }

    public final void onReachedMaxAppCacheSize(long spaceNeeded, long totalUsedQuota, WebStorage.QuotaUpdater quotaUpdater) {
        if(0x500000L - totalUsedQuota < spaceNeeded + 0x20000L) {
            quotaUpdater.updateQuota(0L);
            return;
        }
        quotaUpdater.updateQuota(spaceNeeded + 0x20000L);
    }

    @Override  // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.zza(view, -1, customViewCallback);
    }

    private static void zza(AlertDialog.Builder alertDialog$Builder0, String s, JsResult jsResult0) {
        alertDialog$Builder0.setMessage(s).setPositiveButton(0x104000A, new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                jsResult0.confirm();
            }
        }).setNegativeButton(0x1040000, new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                jsResult0.cancel();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override  // android.content.DialogInterface$OnCancelListener
            public void onCancel(DialogInterface dialog) {
                jsResult0.cancel();
            }
        }).create().show();
    }

    private static void zza(Context context0, AlertDialog.Builder alertDialog$Builder0, String s, String s1, JsPromptResult jsPromptResult0) {
        LinearLayout linearLayout0 = new LinearLayout(context0);
        linearLayout0.setOrientation(1);
        TextView textView0 = new TextView(context0);
        textView0.setText(s);
        EditText editText0 = new EditText(context0);
        editText0.setText(s1);
        linearLayout0.addView(textView0);
        linearLayout0.addView(editText0);
        alertDialog$Builder0.setView(linearLayout0).setPositiveButton(0x104000A, new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                String s = editText0.getText().toString();
                jsPromptResult0.confirm(s);
            }
        }).setNegativeButton(0x1040000, new DialogInterface.OnClickListener() {
            @Override  // android.content.DialogInterface$OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                jsPromptResult0.cancel();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override  // android.content.DialogInterface$OnCancelListener
            public void onCancel(DialogInterface dialog) {
                jsPromptResult0.cancel();
            }
        }).create().show();
    }

    protected final void zza(View view0, int v, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        zzc zzc0 = this.zzoA.zzgD();
        if(zzc0 == null) {
            zzb.zzaC("Could not get ad overlay when showing custom view.");
            webChromeClient$CustomViewCallback0.onCustomViewHidden();
            return;
        }
        zzc0.zza(view0, webChromeClient$CustomViewCallback0);
        zzc0.setRequestedOrientation(v);
    }

    protected boolean zza(Context context0, String s, String s1, String s2, JsResult jsResult0, JsPromptResult jsPromptResult0, boolean z) {
        try {
            AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(context0);
            alertDialog$Builder0.setTitle(s);
            if(z) {
                zzii.zza(context0, alertDialog$Builder0, s1, s2, jsPromptResult0);
                return true;
            }
            zzii.zza(alertDialog$Builder0, s1, jsResult0);
        }
        catch(WindowManager.BadTokenException windowManager$BadTokenException0) {
            zzb.zzd("Fail to display Dialog.", windowManager$BadTokenException0);
        }
        return true;
    }

    private final Context zzc(WebView webView0) {
        if(!(webView0 instanceof zzid)) {
            return webView0.getContext();
        }
        Context context0 = ((zzid)webView0).zzgB();
        return context0 == null ? ((zzid)webView0).getContext() : context0;
    }

    // 去混淆评级： 低(20)
    private final boolean zzha() {
        return zzo.zzbv().zza(this.zzoA.getContext().getPackageManager(), "org.dyndns.vivi.SkskShogi", "android.permission.ACCESS_FINE_LOCATION") || zzo.zzbv().zza(this.zzoA.getContext().getPackageManager(), "org.dyndns.vivi.SkskShogi", "android.permission.ACCESS_COARSE_LOCATION");
    }

    class com.google.android.gms.internal.zzii.7 {
        static final int[] zzHD;

        static {
            com.google.android.gms.internal.zzii.7.zzHD = new int[ConsoleMessage.MessageLevel.values().length];
            try {
                com.google.android.gms.internal.zzii.7.zzHD[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.android.gms.internal.zzii.7.zzHD[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.android.gms.internal.zzii.7.zzHD[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.android.gms.internal.zzii.7.zzHD[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.android.gms.internal.zzii.7.zzHD[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

