package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.ActivityManager;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzhl {
    final class zza extends BroadcastReceiver {
        final zzhl zzGn;

        private zza() {
        }

        zza(com.google.android.gms.internal.zzhl.1 zzhl$10) {
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                zzhl.this.zzGl = true;
                return;
            }
            if("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                zzhl.this.zzGl = false;
            }
        }
    }

    private String zzFP;
    public static final Handler zzGk;
    private boolean zzGl;
    private boolean zzGm;
    private final Object zzqt;

    static {
        zzhl.zzGk = new zzhi(Looper.getMainLooper());
    }

    public zzhl() {
        this.zzqt = new Object();
        this.zzGl = true;
        this.zzGm = false;
    }

    public static void runOnUiThread(Runnable runnable) {
        if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
            return;
        }
        zzhl.zzGk.post(runnable);
    }

    public boolean zzG(Context context0) {
        boolean z;
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.ads.AdActivity");
        ResolveInfo resolveInfo0 = context0.getPackageManager().resolveActivity(intent0, 0x10000);
        if(resolveInfo0 == null || resolveInfo0.activityInfo == null) {
            zzb.zzaC("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        if((resolveInfo0.activityInfo.configChanges & 16) == 0) {
            zzb.zzaC("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"keyboard\".");
            z = false;
        }
        else {
            z = true;
        }
        if((resolveInfo0.activityInfo.configChanges & 0x20) == 0) {
            zzb.zzaC("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"keyboardHidden\".");
            z = false;
        }
        if((resolveInfo0.activityInfo.configChanges & 0x80) == 0) {
            zzb.zzaC("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"orientation\".");
            z = false;
        }
        if((resolveInfo0.activityInfo.configChanges & 0x100) == 0) {
            zzb.zzaC("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"screenLayout\".");
            z = false;
        }
        if((resolveInfo0.activityInfo.configChanges & 0x200) == 0) {
            zzb.zzaC("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"uiMode\".");
            z = false;
        }
        if((resolveInfo0.activityInfo.configChanges & 0x400) == 0) {
            zzb.zzaC("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"screenSize\".");
            z = false;
        }
        if((resolveInfo0.activityInfo.configChanges & 0x800) == 0) {
            zzb.zzaC("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"smallestScreenSize\".");
            return false;
        }
        return z;
    }

    public boolean zzH(Context context0) {
        if(this.zzGm) {
            return false;
        }
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.USER_PRESENT");
        intentFilter0.addAction("android.intent.action.SCREEN_OFF");
        context0.getApplicationContext().registerReceiver(new zza(this, null), intentFilter0);
        this.zzGm = true;
        return true;
    }

    protected String zzI(Context context0) {
        return new WebView(context0).getSettings().getUserAgentString();
    }

    public AlertDialog.Builder zzJ(Context context0) {
        return new AlertDialog.Builder(context0);
    }

    public zzbq zzK(Context context0) {
        return new zzbq(context0);
    }

    public String zzL(Context context0) {
        try {
            ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
            if(activityManager0 == null) {
                return null;
            }
            List list0 = activityManager0.getRunningTasks(1);
            if(list0 != null && !list0.isEmpty()) {
                ActivityManager.RunningTaskInfo activityManager$RunningTaskInfo0 = (ActivityManager.RunningTaskInfo)list0.get(0);
                return activityManager$RunningTaskInfo0 == null || activityManager$RunningTaskInfo0.topActivity == null ? null : activityManager$RunningTaskInfo0.topActivity.getClassName();
            }
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    public boolean zzM(Context context0) {
        try {
            ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
            KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
            if(activityManager0 == null || keyguardManager0 == null) {
                return false;
            }
            List list0 = activityManager0.getRunningAppProcesses();
            if(list0 == null) {
                return false;
            }
            for(Object object0: list0) {
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                if(Process.myPid() != activityManager$RunningAppProcessInfo0.pid) {
                    continue;
                }
                if(activityManager$RunningAppProcessInfo0.importance != 100 || keyguardManager0.inKeyguardRestrictedInputMode() || !this.zzr(context0)) {
                    break;
                }
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    private JSONArray zza(Collection collection0) throws JSONException {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: collection0) {
            this.zza(jSONArray0, object0);
        }
        return jSONArray0;
    }

    private void zza(JSONArray jSONArray0, Object object0) throws JSONException {
        if(object0 instanceof Bundle) {
            jSONArray0.put(this.zzd(((Bundle)object0)));
            return;
        }
        if(object0 instanceof Map) {
            jSONArray0.put(this.zzy(((Map)object0)));
            return;
        }
        if(object0 instanceof Collection) {
            jSONArray0.put(this.zza(((Collection)object0)));
            return;
        }
        if(object0 instanceof Object[]) {
            jSONArray0.put(this.zza(((Object[])object0)));
            return;
        }
        jSONArray0.put(object0);
    }

    private void zza(JSONObject jSONObject0, String s, Object object0) throws JSONException {
        if(object0 instanceof Bundle) {
            jSONObject0.put(s, this.zzd(((Bundle)object0)));
            return;
        }
        if(object0 instanceof Map) {
            jSONObject0.put(s, this.zzy(((Map)object0)));
            return;
        }
        if(object0 instanceof Collection) {
            if(s == null) {
                s = "null";
            }
            jSONObject0.put(s, this.zza(((Collection)object0)));
            return;
        }
        if(object0 instanceof Object[]) {
            jSONObject0.put(s, this.zza(Arrays.asList(((Object[])object0))));
            return;
        }
        jSONObject0.put(s, object0);
    }

    public DisplayMetrics zza(WindowManager windowManager0) {
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        windowManager0.getDefaultDisplay().getMetrics(displayMetrics0);
        return displayMetrics0;
    }

    public PopupWindow zza(View view0, int v, int v1, boolean z) {
        return new PopupWindow(view0, v, v1, z);
    }

    public String zza(Context context0, View view0, AdSizeParcel adSizeParcel0) {
        if(!((Boolean)zzbz.zzuo.get()).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("width", adSizeParcel0.width);
            jSONObject1.put("height", adSizeParcel0.height);
            jSONObject0.put("size", jSONObject1);
            jSONObject0.put("activity", this.zzL(context0));
            if(!adSizeParcel0.zzsn) {
                JSONArray jSONArray0 = new JSONArray();
                while(view0 != null) {
                    int v = -1;
                    ViewParent viewParent0 = view0.getParent();
                    if(viewParent0 != null) {
                        if(viewParent0 instanceof ViewGroup) {
                            v = ((ViewGroup)viewParent0).indexOfChild(view0);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", viewParent0.getClass().getName());
                        jSONObject2.put("index_of_child", v);
                        jSONArray0.put(jSONObject2);
                    }
                    view0 = viewParent0 == null || !(viewParent0 instanceof View) ? null : ((View)viewParent0);
                }
                if(jSONArray0.length() > 0) {
                    jSONObject0.put("parents", jSONArray0);
                }
            }
            return jSONObject0.toString();
        }
        catch(JSONException jSONException0) {
            zzb.zzd("Fail to get view hierarchy json", jSONException0);
            return null;
        }
    }

    public String zza(Context context0, zzan zzan0, String s) {
        if(zzan0 == null) {
            return s;
        }
        try {
            Uri uri0 = Uri.parse(s);
            if(zzan0.zzc(uri0)) {
                uri0 = zzan0.zza(uri0, context0);
            }
            return uri0.toString();
        }
        catch(Exception unused_ex) {
            return s;
        }
    }

    public String zza(zzid zzid0, String s) {
        return this.zza(zzid0.getContext(), zzid0.zzgH(), s);
    }

    public String zza(InputStreamReader inputStreamReader0) throws IOException {
        StringBuilder stringBuilder0 = new StringBuilder(0x2000);
        char[] arr_c = new char[0x800];
        int v;
        while((v = inputStreamReader0.read(arr_c)) != -1) {
            stringBuilder0.append(arr_c, 0, v);
        }
        return stringBuilder0.toString();
    }

    JSONArray zza(Object[] arr_object) throws JSONException {
        JSONArray jSONArray0 = new JSONArray();
        for(int v = 0; v < arr_object.length; ++v) {
            this.zza(jSONArray0, arr_object[v]);
        }
        return jSONArray0;
    }

    public void zza(Activity activity0, ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        Window window0 = activity0.getWindow();
        if(window0 != null && window0.getDecorView() != null && window0.getDecorView().getViewTreeObserver() != null) {
            window0.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
        }
    }

    public void zza(Activity activity0, ViewTreeObserver.OnScrollChangedListener viewTreeObserver$OnScrollChangedListener0) {
        Window window0 = activity0.getWindow();
        if(window0 != null && window0.getDecorView() != null && window0.getDecorView().getViewTreeObserver() != null) {
            window0.getDecorView().getViewTreeObserver().addOnScrollChangedListener(viewTreeObserver$OnScrollChangedListener0);
        }
    }

    public void zza(Context context0, String s, WebSettings webSettings0) {
        webSettings0.setUserAgentString(this.zzf(context0, s));
    }

    public void zza(Context context0, String s, String s1, Bundle bundle0, boolean z) {
        if(!((Boolean)zzbz.zzux.get()).booleanValue()) {
            return;
        }
        if(z) {
            boolean z1 = context0.getApplicationContext() != null;
            bundle0.putString("os", Build.VERSION.RELEASE);
            bundle0.putString("api", "33");
            bundle0.putString("device", zzo.zzbv().zzgo());
            bundle0.putString("js", s);
            bundle0.putString("appid", "org.dyndns.vivi.SkskShogi");
            bundle0.putString("eids", TextUtils.join(",", zzbz.zzdb()));
        }
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", s1);
        for(Object object0: bundle0.keySet()) {
            uri$Builder0.appendQueryParameter(((String)object0), bundle0.getString(((String)object0)));
        }
        zzo.zzbv().zzc(context0, s, uri$Builder0.toString());
    }

    public void zza(Context context0, String s, List list0) {
        for(Object object0: list0) {
            new zzhp(context0, s, ((String)object0)).zzgi();
        }
    }

    public void zza(Context context0, String s, List list0, String s1) {
        for(Object object0: list0) {
            new zzhp(context0, s, ((String)object0), s1).zzgi();
        }
    }

    public void zza(Context context0, String s, boolean z, HttpURLConnection httpURLConnection0) {
        this.zza(context0, s, z, httpURLConnection0, false);
    }

    public void zza(Context context0, String s, boolean z, HttpURLConnection httpURLConnection0, String s1) {
        httpURLConnection0.setConnectTimeout(60000);
        httpURLConnection0.setInstanceFollowRedirects(z);
        httpURLConnection0.setReadTimeout(60000);
        httpURLConnection0.setRequestProperty("User-Agent", s1);
        httpURLConnection0.setUseCaches(false);
    }

    public void zza(Context context0, String s, boolean z, HttpURLConnection httpURLConnection0, boolean z1) {
        httpURLConnection0.setConnectTimeout(60000);
        httpURLConnection0.setInstanceFollowRedirects(z);
        httpURLConnection0.setReadTimeout(60000);
        httpURLConnection0.setRequestProperty("User-Agent", this.zzf(context0, s));
        httpURLConnection0.setUseCaches(z1);
    }

    public boolean zza(PackageManager packageManager0, String s, String s1) {
        return packageManager0.checkPermission(s1, s) == 0;
    }

    public boolean zza(ClassLoader classLoader0, Class class0, String s) {
        try {
            return class0.isAssignableFrom(Class.forName(s, false, classLoader0));
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public String zzat(String s) {
        return Uri.parse(s).buildUpon().query(null).build().toString();
    }

    public int zzau(String s) {
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException numberFormatException0) {
            zzb.zzaC(("Could not parse value:" + numberFormatException0));
            return 0;
        }
    }

    // 去混淆评级： 低(20)
    public boolean zzav(String s) {
        return TextUtils.isEmpty(s) ? false : s.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public void zzb(Activity activity0, ViewTreeObserver.OnScrollChangedListener viewTreeObserver$OnScrollChangedListener0) {
        Window window0 = activity0.getWindow();
        if(window0 != null && window0.getDecorView() != null && window0.getDecorView().getViewTreeObserver() != null) {
            window0.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(viewTreeObserver$OnScrollChangedListener0);
        }
    }

    public void zzc(Context context0, String s, String s1) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s1);
        this.zza(context0, s, arrayList0);
    }

    private JSONObject zzd(Bundle bundle0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        for(Object object0: bundle0.keySet()) {
            this.zza(jSONObject0, ((String)object0), bundle0.get(((String)object0)));
        }
        return jSONObject0;
    }

    public Map zzd(Uri uri0) {
        if(uri0 == null) {
            return null;
        }
        HashMap hashMap0 = new HashMap();
        for(Object object0: zzo.zzbx().zze(uri0)) {
            hashMap0.put(((String)object0), uri0.getQueryParameter(((String)object0)));
        }
        return hashMap0;
    }

    public String zzf(Context context0, String s) {
        synchronized(this.zzqt) {
            if(this.zzFP != null) {
                return this.zzFP;
            }
            try {
                this.zzFP = zzo.zzbx().getDefaultUserAgent(context0);
            }
            catch(Exception unused_ex) {
            }
            if(TextUtils.isEmpty(this.zzFP)) {
                if(zzk.zzcA().zzgw()) {
                    try {
                        this.zzFP = this.zzI(context0);
                    }
                    catch(Exception unused_ex) {
                        this.zzFP = this.zzgm();
                    }
                }
                else {
                    this.zzFP = null;
                    com.google.android.gms.internal.zzhl.1 zzhl$10 = new Runnable() {
                        @Override
                        public void run() {
                            synchronized(zzhl.this.zzqt) {
                                String s = zzhl.this.zzI(context0);
                                zzhl.this.zzFP = s;
                                zzhl.this.zzqt.notifyAll();
                            }
                        }
                    };
                    zzhl.zzGk.post(zzhl$10);
                    while(this.zzFP == null) {
                        try {
                            this.zzqt.wait();
                        }
                        catch(InterruptedException unused_ex) {
                            this.zzFP = this.zzgm();
                            zzb.zzaC(("Interrupted, use default user agent: " + this.zzFP));
                        }
                    }
                }
            }
            this.zzFP = this.zzFP + " (Mobile; " + s + ")";
            return this.zzFP;
        }
    }

    public int[] zzg(Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.findViewById(0x1020002);
            return view0 == null ? this.zzgp() : new int[]{view0.getWidth(), view0.getHeight()};
        }
        return this.zzgp();
    }

    public boolean zzgl() {
        return this.zzGl;
    }

    String zzgm() {
        StringBuffer stringBuffer0 = new StringBuffer(0x100);
        stringBuffer0.append("Mozilla/5.0 (Linux; U; Android");
        if(Build.VERSION.RELEASE != null) {
            stringBuffer0.append(" ").append(Build.VERSION.RELEASE);
        }
        stringBuffer0.append("; ").append(Locale.getDefault());
        if(Build.DEVICE != null) {
            stringBuffer0.append("; ").append(Build.DEVICE);
            if(Build.DISPLAY != null) {
                stringBuffer0.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringBuffer0.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer0.toString();
    }

    public String zzgn() [...] // Potential decryptor

    // 去混淆评级： 低(20)
    public String zzgo() {
        return Build.MODEL.startsWith(Build.MANUFACTURER) ? Build.MODEL : Build.MANUFACTURER + " " + Build.MODEL;
    }

    protected int[] zzgp() {
        return new int[]{0, 0};
    }

    public int[] zzh(Activity activity0) {
        int[] arr_v = this.zzg(activity0);
        return new int[]{zzk.zzcA().zzc(activity0, arr_v[0]), zzk.zzcA().zzc(activity0, arr_v[1])};
    }

    public int[] zzi(Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.findViewById(0x1020002);
            return view0 == null ? this.zzgp() : new int[]{view0.getTop(), view0.getBottom()};
        }
        return this.zzgp();
    }

    public Bitmap zzj(View view0) {
        view0.setDrawingCacheEnabled(true);
        Bitmap bitmap0 = Bitmap.createBitmap(view0.getDrawingCache());
        view0.setDrawingCacheEnabled(false);
        return bitmap0;
    }

    public int[] zzj(Activity activity0) {
        int[] arr_v = this.zzi(activity0);
        return new int[]{zzk.zzcA().zzc(activity0, arr_v[0]), zzk.zzcA().zzc(activity0, arr_v[1])};
    }

    public int zzk(Activity activity0) {
        if(activity0 == null) {
            zzb.zzaC("Fail to get AdActivity type since it is null");
            return 0;
        }
        AdOverlayInfoParcel adOverlayInfoParcel0 = AdOverlayInfoParcel.zzb(activity0.getIntent());
        if(adOverlayInfoParcel0 == null) {
            zzb.zzaC("Fail to get AdOverlayInfo");
            return 0;
        }
        switch(adOverlayInfoParcel0.zzzK) {
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 3;
            }
            default: {
                return 0;
            }
        }
    }

    private boolean zzr(Context context0) {
        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
        return powerManager0 == null ? false : powerManager0.isScreenOn();
    }

    public JSONObject zzy(Map map0) throws JSONException {
        try {
            JSONObject jSONObject0 = new JSONObject();
            for(Object object0: map0.keySet()) {
                this.zza(jSONObject0, ((String)object0), map0.get(((String)object0)));
            }
            return jSONObject0;
        }
        catch(ClassCastException classCastException0) {
            throw new JSONException("Could not convert map to JSON: " + classCastException0.getMessage());
        }
    }
}

