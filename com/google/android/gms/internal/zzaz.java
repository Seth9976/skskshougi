package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzaz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private boolean zzpj;
    private final WeakReference zzqA;
    private final zzax zzqB;
    private final zzdt zzqC;
    private final zzd zzqD;
    private boolean zzqE;
    private final WindowManager zzqF;
    private final PowerManager zzqG;
    private final KeyguardManager zzqH;
    private zzba zzqI;
    private boolean zzqJ;
    private boolean zzqK;
    private boolean zzqL;
    private boolean zzqM;
    private BroadcastReceiver zzqN;
    private final HashSet zzqO;
    private final zzdg zzqP;
    private final zzdg zzqQ;
    private final zzdg zzqR;
    private zzhq zzqm;
    private final Object zzqt;
    private final Context zzqw;
    private final WeakReference zzqy;
    private WeakReference zzqz;

    public zzaz(AdSizeParcel adSizeParcel0, zzha zzha0, VersionInfoParcel versionInfoParcel0, View view0, zzdt zzdt0) {
        this.zzqt = new Object();
        this.zzpj = false;
        this.zzqK = false;
        this.zzqO = new HashSet();
        this.zzqP = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                if(!zzaz.this.zzb(map0)) {
                    return;
                }
                WebView webView0 = zzid0.getWebView();
                zzaz.this.zza(webView0, map0);
            }
        };
        this.zzqQ = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                if(!zzaz.this.zzb(map0)) {
                    return;
                }
                zzb.zzay(("Received request to untrack: " + zzaz.this.zzqB.zzbT()));
                zzaz.this.destroy();
            }
        };
        this.zzqR = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                if(zzaz.this.zzb(map0) && map0.containsKey("isVisible")) {
                    boolean z = "1".equals(map0.get("isVisible")) || "true".equals(map0.get("isVisible"));
                    zzaz.this.zzg(z);
                }
            }
        };
        this.zzqC = zzdt0;
        this.zzqy = new WeakReference(zzha0);
        this.zzqA = new WeakReference(view0);
        this.zzqz = new WeakReference(null);
        this.zzqL = true;
        this.zzqm = new zzhq(200L);
        boolean z = zzha0.zzbU();
        this.zzqB = new zzax("e325ff76-8f57-49af-b54c-2d312865b09b", versionInfoParcel0, adSizeParcel0.zzsm, zzha0.zzFl, z);
        this.zzqD = this.zzqC.zzdU();
        this.zzqF = (WindowManager)view0.getContext().getSystemService("window");
        this.zzqG = (PowerManager)view0.getContext().getApplicationContext().getSystemService("power");
        this.zzqH = (KeyguardManager)view0.getContext().getSystemService("keyguard");
        this.zzqw = view0.getContext().getApplicationContext();
        try {
            com.google.android.gms.internal.zzaz.1 zzaz$10 = new zzc() {
                public void zzb(zzbe zzbe0) {
                    zzaz.this.zza(this.zzd(view0));
                }
            };
            com.google.android.gms.internal.zzaz.2 zzaz$20 = new zza() {
                @Override  // com.google.android.gms.internal.zzhx$zza
                public void run() {
                }
            };
            this.zzqD.zza(zzaz$10, zzaz$20);
        }
        catch(JSONException unused_ex) {
        }
        catch(RuntimeException runtimeException0) {
            zzb.zzb("Failure while processing active view data.", runtimeException0);
        }
        com.google.android.gms.internal.zzaz.3 zzaz$30 = new zzc() {
            public void zzb(zzbe zzbe0) {
                zzaz.this.zzqE = true;
                zzaz.this.zza(zzbe0);
                zzaz.this.zzbV();
                zzaz.this.zzh(false);
            }
        };
        com.google.android.gms.internal.zzaz.4 zzaz$40 = () -> synchronized(zzaz.this.zzqt) {
            zzaz.this.zzcb();
            zzaz.this.zzbW();
            zzaz.this.zzqL = false;
            zzaz.this.zzbY();
            zzaz.this.zzqD.release();
        };
        this.zzqD.zza(zzaz$30, zzaz$40);
        zzb.zzay(("Tracking ad unit: " + this.zzqB.zzbT()));

        class com.google.android.gms.internal.zzaz.4 implements zza {
            @Override  // com.google.android.gms.internal.zzhx$zza
            public void run() {
                zzaz.this.destroy();
            }
        }

    }

    // 检测为 lambda 实现。
    protected void destroy() {
        synchronized(this.zzqt) {
            this.zzcb();
            this.zzbW();
            this.zzqL = false;
            this.zzbY();
            this.zzqD.release();
        }
    }

    boolean isScreenOn() {
        return this.zzqG.isScreenOn();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.zzh(false);
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public void onScrollChanged() {
        this.zzh(true);
    }

    public void pause() {
        synchronized(this.zzqt) {
            this.zzpj = true;
            this.zzh(false);
        }
    }

    public void resume() {
        synchronized(this.zzqt) {
            this.zzpj = false;
            this.zzh(false);
        }
    }

    public void stop() {
        synchronized(this.zzqt) {
            this.zzqK = true;
            this.zzh(false);
        }
    }

    protected int zza(int v, DisplayMetrics displayMetrics0) {
        return (int)(((float)v) / displayMetrics0.density);
    }

    protected void zza(View view0, Map map0) {
        this.zzh(false);
    }

    public void zza(zzaw zzaw0) {
        this.zzqO.add(zzaw0);
    }

    public void zza(zzba zzba0) {
        synchronized(this.zzqt) {
            this.zzqI = zzba0;
        }
    }

    protected void zza(zzbe zzbe0) {
        zzbe0.zza("/updateActiveView", this.zzqP);
        zzbe0.zza("/untrackActiveViewUnit", this.zzqQ);
        zzbe0.zza("/visibilityChanged", this.zzqR);
    }

    protected void zza(JSONObject jSONObject0) {
        try {
            JSONArray jSONArray0 = new JSONArray();
            JSONObject jSONObject1 = new JSONObject();
            jSONArray0.put(jSONObject0);
            jSONObject1.put("units", jSONArray0);
            com.google.android.gms.internal.zzaz.9 zzaz$90 = new zzc() {
                public void zzb(zzbe zzbe0) {
                    zzbe0.zza("AFMA_updateActiveView", jSONObject1);
                }
            };
            com.google.android.gms.internal.zzhx.zzb zzhx$zzb0 = new com.google.android.gms.internal.zzhx.zzb();
            this.zzqD.zza(zzaz$90, zzhx$zzb0);
        }
        catch(Throwable throwable0) {
            zzb.zzb("Skipping active view message.", throwable0);
        }
    }

    protected boolean zzb(Map map0) {
        if(map0 == null) {
            return false;
        }
        String s = (String)map0.get("hashCode");
        return !TextUtils.isEmpty(s) && s.equals(this.zzqB.zzbT());
    }

    protected void zzbV() {
        synchronized(this.zzqt) {
            if(this.zzqN != null) {
                return;
            }
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.SCREEN_ON");
            intentFilter0.addAction("android.intent.action.SCREEN_OFF");
            this.zzqN = new BroadcastReceiver() {
                @Override  // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    zzaz.this.zzh(false);
                }
            };
            this.zzqw.registerReceiver(this.zzqN, intentFilter0);
        }
    }

    protected void zzbW() {
        synchronized(this.zzqt) {
            if(this.zzqN != null) {
                this.zzqw.unregisterReceiver(this.zzqN);
                this.zzqN = null;
            }
        }
    }

    public void zzbX() {
        synchronized(this.zzqt) {
            if(this.zzqL) {
                try {
                    this.zzqM = true;
                    this.zza(this.zzcd());
                }
                catch(JSONException jSONException0) {
                    zzb.zzb("JSON failure while processing active view data.", jSONException0);
                }
                catch(RuntimeException runtimeException0) {
                    zzb.zzb("Failure while processing active view data.", runtimeException0);
                }
                zzb.zzay(("Untracking ad unit: " + this.zzqB.zzbT()));
            }
        }
    }

    protected void zzbY() {
        if(this.zzqI != null) {
            this.zzqI.zza(this);
        }
    }

    public boolean zzbZ() {
        synchronized(this.zzqt) {
        }
        return this.zzqL;
    }

    protected void zzca() {
        View view0 = (View)this.zzqA.get();
        if(view0 != null) {
            ViewTreeObserver viewTreeObserver0 = (ViewTreeObserver)this.zzqz.get();
            ViewTreeObserver viewTreeObserver1 = view0.getViewTreeObserver();
            if(viewTreeObserver1 != viewTreeObserver0) {
                this.zzcb();
                if(!this.zzqJ || viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
                    this.zzqJ = true;
                    viewTreeObserver1.addOnScrollChangedListener(this);
                    viewTreeObserver1.addOnGlobalLayoutListener(this);
                }
                this.zzqz = new WeakReference(viewTreeObserver1);
            }
        }
    }

    protected void zzcb() {
        ViewTreeObserver viewTreeObserver0 = (ViewTreeObserver)this.zzqz.get();
        if(viewTreeObserver0 == null || !viewTreeObserver0.isAlive()) {
            return;
        }
        viewTreeObserver0.removeOnScrollChangedListener(this);
        viewTreeObserver0.removeGlobalOnLayoutListener(this);
    }

    protected JSONObject zzcc() throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("afmaVersion", this.zzqB.zzbR()).put("activeViewJSON", this.zzqB.zzbS()).put("timestamp", zzo.zzbz().elapsedRealtime()).put("adFormat", this.zzqB.zzbQ()).put("hashCode", this.zzqB.zzbT()).put("isMraid", this.zzqB.zzbU());
        return jSONObject0;
    }

    protected JSONObject zzcd() throws JSONException {
        JSONObject jSONObject0 = this.zzcc();
        jSONObject0.put("doneReasonCode", "u");
        return jSONObject0;
    }

    protected JSONObject zzd(View view0) throws JSONException {
        boolean z = zzo.zzbx().zzk(view0);
        int[] arr_v = new int[2];
        try {
            view0.getLocationOnScreen(arr_v);
            view0.getLocationInWindow(new int[2]);
        }
        catch(Exception exception0) {
            zzb.zzb("Failure getting view location.", exception0);
        }
        DisplayMetrics displayMetrics0 = view0.getContext().getResources().getDisplayMetrics();
        Rect rect0 = new Rect();
        rect0.left = arr_v[0];
        rect0.top = arr_v[1];
        rect0.right = rect0.left + view0.getWidth();
        rect0.bottom = rect0.top + view0.getHeight();
        Rect rect1 = new Rect();
        rect1.right = this.zzqF.getDefaultDisplay().getWidth();
        rect1.bottom = this.zzqF.getDefaultDisplay().getHeight();
        Rect rect2 = new Rect();
        boolean z1 = view0.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean z2 = view0.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view0.getHitRect(rect4);
        JSONObject jSONObject0 = this.zzcc();
        jSONObject0.put("windowVisibility", view0.getWindowVisibility()).put("isStopped", this.zzqK).put("isPaused", this.zzpj).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", this.zza(rect1.top, displayMetrics0)).put("bottom", this.zza(rect1.bottom, displayMetrics0)).put("left", this.zza(rect1.left, displayMetrics0)).put("right", this.zza(rect1.right, displayMetrics0))).put("adBox", new JSONObject().put("top", this.zza(rect0.top, displayMetrics0)).put("bottom", this.zza(rect0.bottom, displayMetrics0)).put("left", this.zza(rect0.left, displayMetrics0)).put("right", this.zza(rect0.right, displayMetrics0))).put("globalVisibleBox", new JSONObject().put("top", this.zza(rect2.top, displayMetrics0)).put("bottom", this.zza(rect2.bottom, displayMetrics0)).put("left", this.zza(rect2.left, displayMetrics0)).put("right", this.zza(rect2.right, displayMetrics0))).put("globalVisibleBoxVisible", z1).put("localVisibleBox", new JSONObject().put("top", this.zza(rect3.top, displayMetrics0)).put("bottom", this.zza(rect3.bottom, displayMetrics0)).put("left", this.zza(rect3.left, displayMetrics0)).put("right", this.zza(rect3.right, displayMetrics0))).put("localVisibleBoxVisible", z2).put("hitBox", new JSONObject().put("top", this.zza(rect4.top, displayMetrics0)).put("bottom", this.zza(rect4.bottom, displayMetrics0)).put("left", this.zza(rect4.left, displayMetrics0)).put("right", this.zza(rect4.right, displayMetrics0))).put("screenDensity", ((double)displayMetrics0.density)).put("isVisible", this.zze(view0));
        return jSONObject0;
    }

    // 去混淆评级： 低(40)
    protected boolean zze(View view0) {
        return view0.getVisibility() == 0 && view0.isShown() && this.isScreenOn() && (!this.zzqH.inKeyguardRestrictedInputMode() || zzo.zzbv().zzgl());
    }

    protected void zzg(boolean z) {
        for(Object object0: this.zzqO) {
            ((zzaw)object0).zza(this, z);
        }
    }

    protected void zzh(boolean z) {
        synchronized(this.zzqt) {
            if(!this.zzqE || !this.zzqL) {
                return;
            }
            if(z && !this.zzqm.tryAcquire()) {
                return;
            }
            zzha zzha0 = (zzha)this.zzqy.get();
            View view0 = (View)this.zzqA.get();
            if(view0 == null || zzha0 == null) {
                this.zzbX();
                return;
            }
            try {
                this.zza(this.zzd(view0));
            }
            catch(JSONException | RuntimeException jSONException0) {
                zzb.zza("Active view update failed.", jSONException0);
            }
            this.zzca();
            this.zzbY();
        }
    }
}

