package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzig extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzid {
    @zzgd
    public static class zza extends MutableContextWrapper {
        private Activity zzHy;
        private Context zzHz;
        private Context zzqw;

        public zza(Context context0) {
            super(context0);
            this.setBaseContext(context0);
        }

        @Override  // android.content.ContextWrapper
        public Object getSystemService(String service) {
            return this.zzHz.getSystemService(service);
        }

        @Override  // android.content.MutableContextWrapper
        public void setBaseContext(Context base) {
            this.zzqw = base.getApplicationContext();
            this.zzHy = base instanceof Activity ? ((Activity)base) : null;
            this.zzHz = base;
            super.setBaseContext(this.zzqw);
        }

        @Override  // android.content.ContextWrapper
        public void startActivity(Intent intent) {
            intent.setFlags(0x10000000);
            this.zzqw.startActivity(intent);
        }

        public Activity zzgB() {
            return this.zzHy;
        }

        public Context zzgC() {
            return this.zzHz;
        }
    }

    private final zzie zzBd;
    private Boolean zzFO;
    private final zza zzHo;
    private zzc zzHp;
    private boolean zzHq;
    private boolean zzHr;
    private boolean zzHs;
    private boolean zzHt;
    private boolean zzHu;
    private int zzHv;
    private zzc zzHw;
    boolean zzHx;
    private final VersionInfoParcel zzoM;
    private final WindowManager zzqF;
    private final Object zzqt;
    private final zzan zzvA;
    private AdSizeParcel zzxT;
    private int zzyW;
    private int zzyX;
    private int zzyZ;
    private int zzza;

    protected zzig(zza zzig$zza0, AdSizeParcel adSizeParcel0, boolean z, boolean z1, zzan zzan0, VersionInfoParcel versionInfoParcel0) {
        super(zzig$zza0);
        this.zzqt = new Object();
        this.zzyX = -1;
        this.zzyW = -1;
        this.zzyZ = -1;
        this.zzza = -1;
        this.zzHo = zzig$zza0;
        this.zzxT = adSizeParcel0;
        this.zzHs = z;
        this.zzHu = false;
        this.zzHv = -1;
        this.zzvA = zzan0;
        this.zzoM = versionInfoParcel0;
        this.zzqF = (WindowManager)this.getContext().getSystemService("window");
        this.setBackgroundColor(0);
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setSavePassword(false);
        webSettings0.setSupportMultipleWindows(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(true);
        if(Build.VERSION.SDK_INT >= 21) {
            webSettings0.setMixedContentMode(0);
        }
        zzo.zzbv().zza(zzig$zza0, versionInfoParcel0.zzGG, webSettings0);
        zzo.zzbx().zza(this.getContext(), webSettings0);
        this.setDownloadListener(this);
        this.zzBd = zzo.zzbx().zzb(this, z1);
        this.setWebViewClient(this.zzBd);
        this.setWebChromeClient(zzo.zzbx().zzf(this));
        this.zzgX();
        this.addJavascriptInterface(new zzih(this), "googleAdsJsInterface");
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.zzid
    public void destroy() {
        synchronized(this.zzqt) {
            this.zzgV();
            if(this.zzHp != null) {
                this.zzHp.close();
                this.zzHp.onDestroy();
                this.zzHp = null;
            }
            this.zzBd.reset();
            if(this.zzHr) {
                return;
            }
            zzo.zzbH().zza(this);
            this.zzHr = true;
            zzb.zzaB("Initiating WebView self destruct sequence in 3...");
            this.zzBd.zzgN();
        }
    }

    @Override  // android.webkit.WebView
    public void evaluateJavascript(String script, ValueCallback valueCallback0) {
        synchronized(this.zzqt) {
            if(this.isDestroyed()) {
                zzb.zzaC("The webview is destroyed. Ignoring action.");
                if(valueCallback0 != null) {
                    valueCallback0.onReceiveValue(null);
                }
                return;
            }
            super.evaluateJavascript(script, valueCallback0);
        }
    }

    @Override  // com.google.android.gms.internal.zzid
    public int getRequestedOrientation() {
        synchronized(this.zzqt) {
        }
        return this.zzHv;
    }

    @Override  // com.google.android.gms.internal.zzid
    public WebView getWebView() {
        return this;
    }

    @Override  // com.google.android.gms.internal.zzid
    public boolean isDestroyed() {
        synchronized(this.zzqt) {
        }
        return this.zzHr;
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.zzid
    public void loadData(String data, String mimeType, String encoding) {
        synchronized(this.zzqt) {
            if(this.isDestroyed()) {
                zzb.zzaC("The webview is destroyed. Ignoring action.");
            }
            else {
                super.loadData(data, mimeType, encoding);
            }
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.zzid
    public void loadDataWithBaseURL(String baseUrl, String data, String mimeType, String encoding, String historyUrl) {
        synchronized(this.zzqt) {
            if(this.isDestroyed()) {
                zzb.zzaC("The webview is destroyed. Ignoring action.");
            }
            else {
                super.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl);
            }
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.zzid
    public void loadUrl(String uri) {
        synchronized(this.zzqt) {
            if(this.isDestroyed()) {
                zzb.zzaC("The webview is destroyed. Ignoring action.");
            }
            else {
                super.loadUrl(uri);
            }
        }
    }

    @Override  // android.webkit.WebView
    protected void onAttachedToWindow() {
        synchronized(this.zzqt) {
            super.onAttachedToWindow();
            if(!this.isDestroyed()) {
                this.zzHx = true;
                if(this.zzBd.zzbU()) {
                    this.zzgW();
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        synchronized(this.zzqt) {
            if(!this.isDestroyed()) {
                this.zzgV();
                this.zzHx = false;
            }
            super.onDetachedFromWindow();
        }
    }

    @Override  // android.webkit.DownloadListener
    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimeType, long size) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setDataAndType(Uri.parse(url), mimeType);
            this.getContext().startActivity(intent0);
        }
        catch(ActivityNotFoundException unused_ex) {
            zzb.zzay(("Couldn\'t find an Activity to view url/mimetype: " + url + " / " + mimeType));
        }
    }

    @Override  // android.webkit.WebView
    protected void onDraw(Canvas canvas) {
        if(!this.isDestroyed() && (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || this.isAttachedToWindow())) {
            super.onDraw(canvas);
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public void onGlobalLayout() {
        boolean z = this.zzgT();
        zzc zzc0 = this.zzgD();
        if(zzc0 != null && z) {
            zzc0.zzev();
        }
    }

    @Override  // android.webkit.WebView
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int v2 = 0x7FFFFFFF;
        synchronized(this.zzqt) {
            if(this.isDestroyed()) {
                this.setMeasuredDimension(0, 0);
                return;
            }
            if(this.isInEditMode() || this.zzHs) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                return;
            }
            if(this.zzxT.zzsn) {
                DisplayMetrics displayMetrics0 = new DisplayMetrics();
                this.zzqF.getDefaultDisplay().getMetrics(displayMetrics0);
                this.setMeasuredDimension(displayMetrics0.widthPixels, displayMetrics0.heightPixels);
                return;
            }
            int v4 = View.MeasureSpec.getMode(widthMeasureSpec);
            int v5 = View.MeasureSpec.getSize(widthMeasureSpec);
            int v6 = View.MeasureSpec.getMode(heightMeasureSpec);
            int v7 = View.MeasureSpec.getSize(heightMeasureSpec);
            if(v6 == 0x80000000 || v6 == 0x40000000) {
                v2 = v7;
            }
            if(this.zzxT.widthPixels <= (v4 != 0x80000000 && v4 != 0x40000000 ? 0x7FFFFFFF : v5) && this.zzxT.heightPixels <= v2) {
                if(this.getVisibility() != 8) {
                    this.setVisibility(0);
                }
                this.setMeasuredDimension(this.zzxT.widthPixels, this.zzxT.heightPixels);
            }
            else {
                float f = this.zzHo.getResources().getDisplayMetrics().density;
                zzb.zzaC(("Not enough space to show ad. Needs " + ((int)(((float)this.zzxT.widthPixels) / f)) + "x" + ((int)(((float)this.zzxT.heightPixels) / f)) + " dp, but only has " + ((int)(((float)v5) / f)) + "x" + ((int)(((float)v7) / f)) + " dp."));
                if(this.getVisibility() != 8) {
                    this.setVisibility(4);
                }
                this.setMeasuredDimension(0, 0);
            }
        }
    }

    @Override  // android.webkit.WebView
    public void onPause() {
        if(this.isDestroyed()) {
            return;
        }
        try {
            super.onPause();
        }
        catch(Exception exception0) {
            zzb.zzb("Could not pause webview.", exception0);
        }
    }

    @Override  // android.webkit.WebView
    public void onResume() {
        if(this.isDestroyed()) {
            return;
        }
        try {
            super.onResume();
        }
        catch(Exception exception0) {
            zzb.zzb("Could not resume webview.", exception0);
        }
    }

    @Override  // android.webkit.WebView
    public boolean onTouchEvent(MotionEvent event) {
        if(this.zzvA != null) {
            this.zzvA.zza(event);
        }
        return this.isDestroyed() ? false : super.onTouchEvent(event);
    }

    @Override  // com.google.android.gms.internal.zzid
    public void setContext(Context context) {
        this.zzHo.setBaseContext(context);
    }

    @Override  // com.google.android.gms.internal.zzid
    public void setRequestedOrientation(int requestedOrientation) {
        synchronized(this.zzqt) {
            this.zzHv = requestedOrientation;
            if(this.zzHp != null) {
                this.zzHp.setRequestedOrientation(this.zzHv);
            }
        }
    }

    @Override  // android.webkit.WebView, com.google.android.gms.internal.zzid
    public void stopLoading() {
        if(this.isDestroyed()) {
            return;
        }
        try {
            super.stopLoading();
        }
        catch(Exception exception0) {
            zzb.zzb("Could not stop loading webview.", exception0);
        }
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zzB(boolean z) {
        synchronized(this.zzqt) {
            this.zzHs = z;
            this.zzgX();
        }
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zzC(boolean z) {
        synchronized(this.zzqt) {
            if(this.zzHp == null) {
                this.zzHq = z;
            }
            else {
                this.zzHp.zza(this.zzBd.zzbU(), z);
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zza(Context context0, AdSizeParcel adSizeParcel0) {
        synchronized(this.zzqt) {
            this.zzgV();
            this.setContext(context0);
            this.zzHp = null;
            this.zzxT = adSizeParcel0;
            this.zzHs = false;
            this.zzHq = false;
            this.zzHv = -1;
            zzo.zzbx().zzb(this);
            this.loadUrl("about:blank");
            this.zzBd.reset();
            this.setOnTouchListener(null);
            this.setOnClickListener(null);
        }
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zza(AdSizeParcel adSizeParcel0) {
        synchronized(this.zzqt) {
            this.zzxT = adSizeParcel0;
            this.requestLayout();
        }
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zza(zzc zzc0) {
        synchronized(this.zzqt) {
            this.zzHp = zzc0;
        }
    }

    protected void zza(String s, ValueCallback valueCallback0) {
        synchronized(this.zzqt) {
            if(this.isDestroyed()) {
                zzb.zzaC("The webview is destroyed. Ignoring action.");
                if(valueCallback0 != null) {
                    valueCallback0.onReceiveValue(null);
                }
            }
            else {
                this.evaluateJavascript(s, valueCallback0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zza(String s, String s1) {
        this.zzaF(s + "(" + s1 + ");");
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zza(String s, JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        this.zza(s, jSONObject0.toString());
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zzaD(String s) {
        synchronized(this.zzqt) {
            super.loadUrl(s);
        }
    }

    protected void zzaE(String s) {
        synchronized(this.zzqt) {
            if(this.isDestroyed()) {
                zzb.zzaC("The webview is destroyed. Ignoring action.");
            }
            else {
                this.loadUrl(s);
            }
        }
    }

    protected void zzaF(String s) {
        if(this.zzgc() == null) {
            this.zzgU();
        }
        if(this.zzgc().booleanValue()) {
            this.zza(s, null);
            return;
        }
        this.zzaE("javascript:" + s);
    }

    @Override  // com.google.android.gms.internal.zzid
    public AdSizeParcel zzaN() {
        synchronized(this.zzqt) {
        }
        return this.zzxT;
    }

    static zzig zzb(Context context0, AdSizeParcel adSizeParcel0, boolean z, boolean z1, zzan zzan0, VersionInfoParcel versionInfoParcel0) {
        return new zzig(new zza(context0), adSizeParcel0, z, z1, zzan0, versionInfoParcel0);
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zzb(zzc zzc0) {
        synchronized(this.zzqt) {
            this.zzHw = zzc0;
        }
    }

    void zzb(Boolean boolean0) {
        this.zzFO = boolean0;
        zzo.zzby().zzb(boolean0);
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zzb(String s, JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("AFMA_ReceiveMessage(\'");
        stringBuilder0.append(s);
        stringBuilder0.append("\'");
        stringBuilder0.append(",");
        stringBuilder0.append(jSONObject0.toString());
        stringBuilder0.append(");");
        zzb.zzaB(("Dispatching AFMA event: " + stringBuilder0.toString()));
        this.zzaF(stringBuilder0.toString());
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zzc(String s, Map map0) {
        JSONObject jSONObject0;
        try {
            jSONObject0 = zzo.zzbv().zzy(map0);
        }
        catch(JSONException unused_ex) {
            zzb.zzaC("Could not convert parameters to JSON.");
            return;
        }
        this.zzb(s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zzew() {
        HashMap hashMap0 = new HashMap(1);
        hashMap0.put("version", this.zzoM.zzGG);
        this.zzc("onshow", hashMap0);
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zzgA() {
        HashMap hashMap0 = new HashMap(1);
        hashMap0.put("version", this.zzoM.zzGG);
        this.zzc("onhide", hashMap0);
    }

    @Override  // com.google.android.gms.internal.zzid
    public Activity zzgB() {
        return this.zzHo.zzgB();
    }

    @Override  // com.google.android.gms.internal.zzid
    public Context zzgC() {
        return this.zzHo.zzgC();
    }

    @Override  // com.google.android.gms.internal.zzid
    public zzc zzgD() {
        synchronized(this.zzqt) {
        }
        return this.zzHp;
    }

    @Override  // com.google.android.gms.internal.zzid
    public zzc zzgE() {
        synchronized(this.zzqt) {
        }
        return this.zzHw;
    }

    @Override  // com.google.android.gms.internal.zzid
    public zzie zzgF() {
        return this.zzBd;
    }

    @Override  // com.google.android.gms.internal.zzid
    public boolean zzgG() {
        return this.zzHq;
    }

    @Override  // com.google.android.gms.internal.zzid
    public zzan zzgH() {
        return this.zzvA;
    }

    @Override  // com.google.android.gms.internal.zzid
    public VersionInfoParcel zzgI() {
        return this.zzoM;
    }

    @Override  // com.google.android.gms.internal.zzid
    public boolean zzgJ() {
        synchronized(this.zzqt) {
        }
        return this.zzHs;
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zzgK() {
        synchronized(this.zzqt) {
            zzb.zzaB("Destroying WebView!");
            super.destroy();
        }
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zzgL() {
        synchronized(this.zzqt) {
            this.zzgW();
        }
    }

    public boolean zzgT() {
        int v3;
        int v2;
        if(this.zzgF().zzbU()) {
            DisplayMetrics displayMetrics0 = zzo.zzbv().zza(this.zzqF);
            int v = zzk.zzcA().zzb(displayMetrics0, displayMetrics0.widthPixels);
            int v1 = zzk.zzcA().zzb(displayMetrics0, displayMetrics0.heightPixels);
            Activity activity0 = this.zzgB();
            if(activity0 != null && activity0.getWindow() != null) {
                int[] arr_v = zzo.zzbv().zzg(activity0);
                v3 = zzk.zzcA().zzb(displayMetrics0, arr_v[0]);
                v2 = zzk.zzcA().zzb(displayMetrics0, arr_v[1]);
            }
            else {
                v2 = v1;
                v3 = v;
            }
            if(this.zzyW != v || this.zzyX != v1 || this.zzyZ != v3 || this.zzza != v2) {
                boolean z = this.zzyW != v || this.zzyX != v1;
                this.zzyW = v;
                this.zzyX = v1;
                this.zzyZ = v3;
                this.zzza = v2;
                new zzeu(this).zza(v, v1, v3, v2, displayMetrics0.density, this.zzqF.getDefaultDisplay().getRotation());
                return z;
            }
        }
        return false;
    }

    private void zzgU() {
        synchronized(this.zzqt) {
            this.zzFO = zzo.zzby().zzgc();
            if(this.zzFO == null) {
                try {
                    this.evaluateJavascript("(function(){})()", null);
                    this.zzb(Boolean.TRUE);
                }
                catch(IllegalStateException unused_ex) {
                    this.zzb(Boolean.FALSE);
                }
            }
        }
    }

    private void zzgV() {
        Activity activity0 = this.zzgB();
        if(this.zzHu && activity0 != null) {
            zzo.zzbx().zzb(activity0, this);
            this.zzHu = false;
        }
    }

    void zzgW() {
        Activity activity0 = this.zzgB();
        if(!this.zzHu && activity0 != null && this.zzHx) {
            zzo.zzbv().zza(activity0, this);
            this.zzHu = true;
        }
    }

    private void zzgX() {
        synchronized(this.zzqt) {
            if(!this.zzHs && !this.zzxT.zzsn) {
                if(Build.VERSION.SDK_INT < 18) {
                    zzb.zzay("Disabling hardware acceleration on an AdView.");
                    this.zzgY();
                }
                else {
                    zzb.zzay("Enabling hardware acceleration on an AdView.");
                    this.zzgZ();
                }
            }
            else if(Build.VERSION.SDK_INT < 14) {
                zzb.zzay("Disabling hardware acceleration on an overlay.");
                this.zzgY();
            }
            else {
                zzb.zzay("Enabling hardware acceleration on an overlay.");
                this.zzgZ();
            }
        }
    }

    private void zzgY() {
        synchronized(this.zzqt) {
            if(!this.zzHt) {
                zzo.zzbx().zzm(this);
            }
            this.zzHt = true;
        }
    }

    private void zzgZ() {
        synchronized(this.zzqt) {
            if(this.zzHt) {
                zzo.zzbx().zzl(this);
            }
            this.zzHt = false;
        }
    }

    Boolean zzgc() {
        synchronized(this.zzqt) {
        }
        return this.zzFO;
    }

    @Override  // com.google.android.gms.internal.zzid
    public void zzv(int v) {
        HashMap hashMap0 = new HashMap(2);
        hashMap0.put("closetype", String.valueOf(v));
        hashMap0.put("version", this.zzoM.zzGG);
        this.zzc("onhide", hashMap0);
    }
}

