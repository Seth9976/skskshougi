package com.google.android.gms.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@zzgd
public class zzep extends zzeu {
    private int zznM;
    private int zznN;
    private final zzid zzoA;
    private final Object zzqt;
    private AdSizeParcel zzxT;
    private int zzyA;
    private final Activity zzyB;
    private ImageView zzyC;
    private LinearLayout zzyD;
    private zzev zzyE;
    private PopupWindow zzyF;
    private RelativeLayout zzyG;
    private ViewGroup zzyH;
    static final Set zzyu;
    private String zzyv;
    private boolean zzyw;
    private int zzyx;
    private int zzyy;
    private int zzyz;

    static {
        zzep.zzyu = new HashSet(Arrays.asList(new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"}));
    }

    public zzep(zzid zzid0, zzev zzev0) {
        super(zzid0, "resize");
        this.zzyv = "top-right";
        this.zzyw = true;
        this.zzyx = 0;
        this.zzyy = 0;
        this.zznN = -1;
        this.zzyz = 0;
        this.zzyA = 0;
        this.zznM = -1;
        this.zzqt = new Object();
        this.zzoA = zzid0;
        this.zzyB = zzid0.zzgB();
        this.zzyE = zzev0;
    }

    public void zza(int v, int v1, boolean z) {
        synchronized(this.zzqt) {
            this.zzyx = v;
            this.zzyy = v1;
            if(this.zzyF != null && z) {
                int[] arr_v = this.zzed();
                if(arr_v == null) {
                    this.zzn(true);
                }
                else {
                    this.zzyF.update(zzk.zzcA().zzb(this.zzyB, arr_v[0]), zzk.zzcA().zzb(this.zzyB, arr_v[1]), this.zzyF.getWidth(), this.zzyF.getHeight());
                    this.zzc(arr_v[0], arr_v[1]);
                }
            }
        }
    }

    void zzb(int v, int v1) {
        if(this.zzyE != null) {
            this.zzyE.zza(v, v1, this.zznM, this.zznN);
        }
    }

    void zzc(int v, int v1) {
        this.zzb(v, v1 - zzo.zzbv().zzj(this.zzyB)[0], this.zznM, this.zznN);
    }

    public void zzd(int v, int v1) {
        this.zzyx = v;
        this.zzyy = v1;
    }

    boolean zzec() {
        return this.zznM > -1 && this.zznN > -1;
    }

    private int[] zzed() {
        if(!this.zzef()) {
            return null;
        }
        if(this.zzyw) {
            return new int[]{this.zzyx + this.zzyz, this.zzyy + this.zzyA};
        }
        int[] arr_v = zzo.zzbv().zzh(this.zzyB);
        int[] arr_v1 = zzo.zzbv().zzj(this.zzyB);
        int v = arr_v[0];
        int v1 = this.zzyx + this.zzyz;
        int v2 = this.zzyy + this.zzyA;
        if(v1 < 0) {
            v1 = 0;
        }
        else if(this.zznM + v1 > v) {
            v1 = v - this.zznM;
        }
        if(v2 < arr_v1[0]) {
            return new int[]{v1, arr_v1[0]};
        }
        return this.zznN + v2 <= arr_v1[1] ? new int[]{v1, v2} : new int[]{v1, arr_v1[1] - this.zznN};
    }

    public boolean zzee() {
        synchronized(this.zzqt) {
        }
        return this.zzyF != null;
    }

    boolean zzef() {
        int v3;
        int v2;
        int[] arr_v = zzo.zzbv().zzh(this.zzyB);
        int[] arr_v1 = zzo.zzbv().zzj(this.zzyB);
        int v = arr_v[0];
        int v1 = arr_v[1];
        if(this.zznM < 50 || this.zznM > v) {
            zzb.zzaC("Width is too small or too large.");
            return false;
        }
        if(this.zznN < 50 || this.zznN > v1) {
            zzb.zzaC("Height is too small or too large.");
            return false;
        }
        if(this.zznN == v1 && this.zznM == v) {
            zzb.zzaC("Cannot resize to a full-screen ad.");
            return false;
        }
        if(this.zzyw) {
            switch(this.zzyv) {
                case "bottom-center": {
                    v2 = this.zzyx + this.zzyz + this.zznM / 2 - 25;
                    v3 = this.zzyy + this.zzyA + this.zznN - 50;
                    return v2 >= 0 && v2 + 50 <= v && v3 >= arr_v1[0] && v3 + 50 <= arr_v1[1];
                }
                case "bottom-left": {
                    v2 = this.zzyz + this.zzyx;
                    v3 = this.zzyy + this.zzyA + this.zznN - 50;
                    return v2 >= 0 && v2 + 50 <= v && v3 >= arr_v1[0] && v3 + 50 <= arr_v1[1];
                }
                case "bottom-right": {
                    v2 = this.zzyx + this.zzyz + this.zznM - 50;
                    v3 = this.zzyy + this.zzyA + this.zznN - 50;
                    return v2 >= 0 && v2 + 50 <= v && v3 >= arr_v1[0] && v3 + 50 <= arr_v1[1];
                }
                case "center": {
                    v2 = this.zzyx + this.zzyz + this.zznM / 2 - 25;
                    v3 = this.zzyy + this.zzyA + this.zznN / 2 - 25;
                    return v2 >= 0 && v2 + 50 <= v && v3 >= arr_v1[0] && v3 + 50 <= arr_v1[1];
                }
                case "top-center": {
                    v2 = this.zzyx + this.zzyz + this.zznM / 2 - 25;
                    v3 = this.zzyy + this.zzyA;
                    return v2 >= 0 && v2 + 50 <= v && v3 >= arr_v1[0] && v3 + 50 <= arr_v1[1];
                }
                case "top-left": {
                    v2 = this.zzyz + this.zzyx;
                    v3 = this.zzyy + this.zzyA;
                    return v2 >= 0 && v2 + 50 <= v && v3 >= arr_v1[0] && v3 + 50 <= arr_v1[1];
                }
                default: {
                    v2 = this.zzyx + this.zzyz + this.zznM - 50;
                    v3 = this.zzyy + this.zzyA;
                    return v2 >= 0 && v2 + 50 <= v && v3 >= arr_v1[0] && v3 + 50 <= arr_v1[1];
                }
            }
        }
        return true;
    }

    private void zzg(Map map0) {
        if(!TextUtils.isEmpty(((CharSequence)map0.get("width")))) {
            this.zznM = zzo.zzbv().zzau(((String)map0.get("width")));
        }
        if(!TextUtils.isEmpty(((CharSequence)map0.get("height")))) {
            this.zznN = zzo.zzbv().zzau(((String)map0.get("height")));
        }
        if(!TextUtils.isEmpty(((CharSequence)map0.get("offsetX")))) {
            this.zzyz = zzo.zzbv().zzau(((String)map0.get("offsetX")));
        }
        if(!TextUtils.isEmpty(((CharSequence)map0.get("offsetY")))) {
            this.zzyA = zzo.zzbv().zzau(((String)map0.get("offsetY")));
        }
        if(!TextUtils.isEmpty(((CharSequence)map0.get("allowOffscreen")))) {
            this.zzyw = Boolean.parseBoolean(((String)map0.get("allowOffscreen")));
        }
        String s = (String)map0.get("customClosePosition");
        if(!TextUtils.isEmpty(s)) {
            this.zzyv = s;
        }
    }

    public void zzh(Map map0) {
        synchronized(this.zzqt) {
            if(this.zzyB == null) {
                this.zzae("Not an activity context. Cannot resize.");
                return;
            }
            if(this.zzoA.zzaN() == null) {
                this.zzae("Webview is not yet available, size is not set.");
                return;
            }
            if(this.zzoA.zzaN().zzsn) {
                this.zzae("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if(this.zzoA.zzgJ()) {
                this.zzae("Cannot resize an expanded banner.");
                return;
            }
            this.zzg(map0);
            if(!this.zzec()) {
                this.zzae("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window0 = this.zzyB.getWindow();
            if(window0 == null || window0.getDecorView() == null) {
                this.zzae("Activity context is not ready, cannot get window or decor view.");
                return;
            }
            int[] arr_v = this.zzed();
            if(arr_v == null) {
                this.zzae("Resize location out of screen or close button is not visible.");
                return;
            }
            int v1 = zzk.zzcA().zzb(this.zzyB, this.zznM);
            int v2 = zzk.zzcA().zzb(this.zzyB, this.zznN);
            ViewParent viewParent0 = this.zzoA.getWebView().getParent();
            if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(this.zzoA.getWebView());
                if(this.zzyF == null) {
                    this.zzyH = (ViewGroup)viewParent0;
                    Bitmap bitmap0 = zzo.zzbv().zzj(this.zzoA.getWebView());
                    this.zzyC = new ImageView(this.zzyB);
                    this.zzyC.setImageBitmap(bitmap0);
                    this.zzxT = this.zzoA.zzaN();
                    this.zzyH.addView(this.zzyC);
                }
                else {
                    this.zzyF.dismiss();
                }
                this.zzyG = new RelativeLayout(this.zzyB);
                this.zzyG.setBackgroundColor(0);
                this.zzyG.setLayoutParams(new ViewGroup.LayoutParams(v1, v2));
                this.zzyF = zzo.zzbv().zza(this.zzyG, v1, v2, false);
                this.zzyF.setOutsideTouchable(true);
                this.zzyF.setTouchable(true);
                this.zzyF.setClippingEnabled(!this.zzyw);
                this.zzyG.addView(this.zzoA.getWebView(), -1, -1);
                this.zzyD = new LinearLayout(this.zzyB);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(zzk.zzcA().zzb(this.zzyB, 50), zzk.zzcA().zzb(this.zzyB, 50));
                switch(this.zzyv) {
                    case "bottom-center": {
                        relativeLayout$LayoutParams0.addRule(12);
                        relativeLayout$LayoutParams0.addRule(14);
                        break;
                    }
                    case "bottom-left": {
                        relativeLayout$LayoutParams0.addRule(12);
                        relativeLayout$LayoutParams0.addRule(9);
                        break;
                    }
                    case "bottom-right": {
                        relativeLayout$LayoutParams0.addRule(12);
                        relativeLayout$LayoutParams0.addRule(11);
                        break;
                    }
                    case "center": {
                        relativeLayout$LayoutParams0.addRule(13);
                        break;
                    }
                    case "top-center": {
                        relativeLayout$LayoutParams0.addRule(10);
                        relativeLayout$LayoutParams0.addRule(14);
                        break;
                    }
                    case "top-left": {
                        relativeLayout$LayoutParams0.addRule(10);
                        relativeLayout$LayoutParams0.addRule(9);
                        break;
                    }
                    default: {
                        relativeLayout$LayoutParams0.addRule(10);
                        relativeLayout$LayoutParams0.addRule(11);
                    }
                }
                this.zzyD.setOnClickListener((/* 缺少LAMBDA参数 */) -> synchronized(zzep.this.zzqt) {
                    if(zzep.this.zzyF != null) {
                        zzep.this.zzyF.dismiss();
                        zzep.this.zzyG.removeView(zzep.this.zzoA.getWebView());
                        if(zzep.this.zzyH != null) {
                            zzep.this.zzyH.removeView(zzep.this.zzyC);
                            zzep.this.zzyH.addView(zzep.this.zzoA.getWebView());
                            zzep.this.zzoA.zza(zzep.this.zzxT);
                        }
                        if(true) {
                            zzep.this.zzag("default");
                            if(zzep.this.zzyE != null) {
                                zzep.this.zzyE.zzbc();
                            }
                        }
                        zzep.this.zzyF = null;
                        zzep.this.zzyG = null;
                        zzep.this.zzyH = null;
                        zzep.this.zzyD = null;
                    }
                });
                this.zzyD.setContentDescription("Close button");
                this.zzyG.addView(this.zzyD, relativeLayout$LayoutParams0);
                try {
                    this.zzyF.showAtLocation(window0.getDecorView(), 0, zzk.zzcA().zzb(this.zzyB, arr_v[0]), zzk.zzcA().zzb(this.zzyB, arr_v[1]));
                }
                catch(RuntimeException runtimeException0) {
                    this.zzae("Cannot show popup window: " + runtimeException0.getMessage());
                    this.zzyG.removeView(this.zzoA.getWebView());
                    if(this.zzyH != null) {
                        this.zzyH.removeView(this.zzyC);
                        this.zzyH.addView(this.zzoA.getWebView());
                        this.zzoA.zza(this.zzxT);
                    }
                    return;
                }
                this.zzb(arr_v[0], arr_v[1]);
                AdSize adSize0 = new AdSize(this.zznM, this.zznN);
                AdSizeParcel adSizeParcel0 = new AdSizeParcel(this.zzyB, adSize0);
                this.zzoA.zza(adSizeParcel0);
                this.zzc(arr_v[0], arr_v[1]);
                this.zzag("resized");
                return;
            }
            this.zzae("Webview is detached, probably in the middle of a resize or expand.");
        }

        class com.google.android.gms.internal.zzep.1 implements View.OnClickListener {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view) {
                zzep.this.zzn(true);
            }
        }

    }

    // 检测为 lambda 实现。
    public void zzn(boolean z) {
        synchronized(this.zzqt) {
            if(this.zzyF != null) {
                this.zzyF.dismiss();
                this.zzyG.removeView(this.zzoA.getWebView());
                if(this.zzyH != null) {
                    this.zzyH.removeView(this.zzyC);
                    this.zzyH.addView(this.zzoA.getWebView());
                    this.zzoA.zza(this.zzxT);
                }
                if(z) {
                    this.zzag("default");
                    if(this.zzyE != null) {
                        this.zzyE.zzbc();
                    }
                }
                this.zzyF = null;
                this.zzyG = null;
                this.zzyH = null;
                this.zzyD = null;
            }
        }
    }
}

