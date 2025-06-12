package com.google.android.gms.ads.internal.util.client;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.zzgd;

@zzgd
public class zza {
    public static final Handler zzGF;

    static {
        zza.zzGF = new Handler(Looper.getMainLooper());
    }

    public String zzO(Context context0) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        String s = contentResolver0 == null ? null : Settings.Secure.getString(contentResolver0, "android_id");
        if(s == null || this.zzgv()) {
            s = "emulator";
        }
        return this.zzax(s);
    }

    public boolean zzP(Context context0) {
        return GooglePlayServicesUtil.isGooglePlayServicesAvailable(context0) == 0;
    }

    public boolean zzQ(Context context0) {
        if(context0.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        return ((int)(((float)displayMetrics0.heightPixels) / displayMetrics0.density)) < 600;
    }

    public boolean zzR(Context context0) {
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
        display0.getRealMetrics(displayMetrics0);
        int v = displayMetrics0.heightPixels;
        int v1 = displayMetrics0.widthPixels;
        display0.getMetrics(displayMetrics0);
        return displayMetrics0.heightPixels == v && displayMetrics0.widthPixels == v1;
    }

    public int zzS(Context context0) {
        int v = context0.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        return v <= 0 ? 0 : context0.getResources().getDimensionPixelSize(v);
    }

    private void zza(ViewGroup viewGroup0, AdSizeParcel adSizeParcel0, String s, int v, int v1) {
        if(viewGroup0.getChildCount() != 0) {
            return;
        }
        Context context0 = viewGroup0.getContext();
        TextView textView0 = new TextView(context0);
        textView0.setGravity(17);
        textView0.setText(s);
        textView0.setTextColor(v);
        textView0.setBackgroundColor(v1);
        FrameLayout frameLayout0 = new FrameLayout(context0);
        frameLayout0.setBackgroundColor(v);
        int v2 = this.zzb(context0, 3);
        frameLayout0.addView(textView0, new FrameLayout.LayoutParams(adSizeParcel0.widthPixels - v2, adSizeParcel0.heightPixels - v2, 17));
        viewGroup0.addView(frameLayout0, adSizeParcel0.widthPixels, adSizeParcel0.heightPixels);
    }

    public int zza(DisplayMetrics displayMetrics0, int v) {
        return (int)TypedValue.applyDimension(1, ((float)v), displayMetrics0);
    }

    public void zza(ViewGroup viewGroup0, AdSizeParcel adSizeParcel0, String s) {
        this.zza(viewGroup0, adSizeParcel0, s, 0xFF000000, -1);
    }

    public void zza(ViewGroup viewGroup0, AdSizeParcel adSizeParcel0, String s, String s1) {
        zzb.zzaC(s1);
        this.zza(viewGroup0, adSizeParcel0, s, 0xFFFF0000, 0xFF000000);
    }

    public String zzax(String s) [...] // Potential decryptor

    public int zzb(Context context0, int v) {
        return this.zza(context0.getResources().getDisplayMetrics(), v);
    }

    public int zzb(DisplayMetrics displayMetrics0, int v) {
        return Math.round(((float)v) / displayMetrics0.density);
    }

    public int zzc(Context context0, int v) {
        Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        display0.getMetrics(displayMetrics0);
        return this.zzb(displayMetrics0, v);
    }

    public boolean zzgv() {
        return Build.DEVICE.startsWith("generic");
    }

    public boolean zzgw() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}

