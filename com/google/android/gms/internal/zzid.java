package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

@zzgd
public interface zzid {
    void destroy();

    Context getContext();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] arg1);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getRequestedOrientation();

    WebView getWebView();

    boolean isDestroyed();

    void loadData(String arg1, String arg2, String arg3);

    void loadDataWithBaseURL(String arg1, String arg2, String arg3, String arg4, String arg5);

    void loadUrl(String arg1);

    void measure(int arg1, int arg2);

    void setBackgroundColor(int arg1);

    void setContext(Context arg1);

    void setOnClickListener(View.OnClickListener arg1);

    void setOnTouchListener(View.OnTouchListener arg1);

    void setRequestedOrientation(int arg1);

    void setWebViewClient(WebViewClient arg1);

    void setWillNotDraw(boolean arg1);

    void stopLoading();

    boolean willNotDraw();

    void zzB(boolean arg1);

    void zzC(boolean arg1);

    void zza(Context arg1, AdSizeParcel arg2);

    void zza(AdSizeParcel arg1);

    void zza(zzc arg1);

    void zza(String arg1, String arg2);

    void zza(String arg1, JSONObject arg2);

    void zzaD(String arg1);

    AdSizeParcel zzaN();

    void zzb(zzc arg1);

    void zzb(String arg1, JSONObject arg2);

    void zzc(String arg1, Map arg2);

    void zzew();

    void zzgA();

    Activity zzgB();

    Context zzgC();

    zzc zzgD();

    zzc zzgE();

    zzie zzgF();

    boolean zzgG();

    zzan zzgH();

    VersionInfoParcel zzgI();

    boolean zzgJ();

    void zzgK();

    void zzgL();

    void zzv(int arg1);
}

