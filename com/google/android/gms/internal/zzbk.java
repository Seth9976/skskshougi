package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.List;
import jeb.synthetic.FIN;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzbk extends Thread {
    @zzgd
    class zza {
        final zzbk zzrD;
        final int zzrI;
        final int zzrJ;

        zza(int v, int v1) {
            this.zzrI = v;
            this.zzrJ = v1;
        }
    }

    private boolean mStarted;
    private boolean zzam;
    private final Object zzqt;
    private final int zzrA;
    private final int zzrB;
    private final int zzrj;
    private final int zzrl;
    private boolean zzrv;
    private final zzbj zzrw;
    private final zzbi zzrx;
    private final zzgc zzry;
    private final int zzrz;

    public zzbk(zzbj zzbj0, zzbi zzbi0, zzgc zzgc0) {
        this.mStarted = false;
        this.zzrv = false;
        this.zzam = false;
        this.zzrw = zzbj0;
        this.zzrx = zzbi0;
        this.zzry = zzgc0;
        this.zzqt = new Object();
        this.zzrj = (int)(((Integer)zzbz.zzud.get()));
        this.zzrA = (int)(((Integer)zzbz.zzue.get()));
        this.zzrl = (int)(((Integer)zzbz.zzuf.get()));
        this.zzrB = (int)(((Integer)zzbz.zzug.get()));
        this.zzrz = (int)(((Integer)zzbz.zzuh.get()));
        this.setName("ContentFetchTask");
    }

    @Override
    public void run() {
        int v;
        while(!this.zzam) {
            try {
                if(this.zzcq()) {
                    Activity activity0 = this.zzrw.getActivity();
                    if(activity0 == null) {
                        zzb.zzay("ContentFetchThread: no activity");
                        continue;
                    }
                    else {
                        this.zza(activity0);
                        goto label_10;
                    }
                    goto label_8;
                }
                else {
                label_8:
                    zzb.zzay("ContentFetchTask: sleeping");
                    this.zzcs();
                }
            label_10:
                Thread.sleep(this.zzrz * 1000);
            }
            catch(Throwable throwable0) {
                zzb.zzb("Error in ContentFetchTask", throwable0);
                this.zzry.zza(throwable0, true);
            }
            Object object0 = this.zzqt;
            __monitor_enter(object0);
        alab1:
            while(true) {
                v = FIN.finallyOpen$NT();
                while(true) {
                    if(!this.zzrv) {
                        break alab1;
                    }
                    try {
                        zzb.zzay("ContentFetchTask: waiting");
                        this.zzqt.wait();
                    }
                    catch(InterruptedException unused_ex) {
                        break;
                    }
                }
            }
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
        }
    }

    public void wakeup() {
        synchronized(this.zzqt) {
            this.zzrv = false;
            this.zzqt.notifyAll();
            zzb.zzay("ContentFetchThread: wakeup");
        }
    }

    zza zza(View view0, zzbh zzbh0) {
        if(view0 == null) {
            return new zza(this, 0, 0);
        }
        if(view0 instanceof TextView && !(view0 instanceof EditText)) {
            CharSequence charSequence0 = ((TextView)view0).getText();
            if(!TextUtils.isEmpty(charSequence0)) {
                zzbh0.zzv(charSequence0.toString());
                return new zza(this, 1, 0);
            }
            return new zza(this, 0, 0);
        }
        if(view0 instanceof WebView && !(view0 instanceof zzid)) {
            zzbh0.zzcl();
            return this.zza(((WebView)view0), zzbh0) ? new zza(this, 0, 1) : new zza(this, 0, 0);
        }
        if(view0 instanceof ViewGroup) {
            int v1 = 0;
            int v2 = 0;
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                zza zzbk$zza0 = this.zza(((ViewGroup)view0).getChildAt(v), zzbh0);
                v2 += zzbk$zza0.zzrI;
                v1 += zzbk$zza0.zzrJ;
            }
            return new zza(this, v2, v1);
        }
        return new zza(this, 0, 0);
    }

    void zza(Activity activity0) {
        View view0 = null;
        if(activity0 != null) {
            if(activity0.getWindow() != null && activity0.getWindow().getDecorView() != null) {
                view0 = activity0.getWindow().getDecorView().findViewById(0x1020002);
            }
            if(view0 != null) {
                this.zzf(view0);
            }
        }
    }

    void zza(zzbh zzbh0, WebView webView0, String s) {
        zzbh0.zzck();
        try {
            if(!TextUtils.isEmpty(s)) {
                String s1 = new JSONObject(s).optString("text");
                if(TextUtils.isEmpty(webView0.getTitle())) {
                    zzbh0.zzu(s1);
                }
                else {
                    zzbh0.zzu(webView0.getTitle() + "\n" + s1);
                }
            }
            if(zzbh0.zzch()) {
                this.zzrx.zzb(zzbh0);
            }
        }
        catch(JSONException unused_ex) {
            zzb.zzay("Json string may be malformed.");
        }
        catch(Throwable throwable0) {
            zzb.zza("Failed to get webview content.", throwable0);
            this.zzry.zza(throwable0, true);
        }
    }

    boolean zza(ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0) {
        return activityManager$RunningAppProcessInfo0.importance == 100;
    }

    boolean zza(WebView webView0, zzbh zzbh0) {
        zzbh0.zzcl();
        webView0.post(new Runnable() {
            ValueCallback zzrE;

            {
                zzbh zzbh0 = zzbh0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                WebView webView0 = webView0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.zzrE = new ValueCallback() {
                    public void zzx(String s) {
                        zzbk.this.zza(com.google.android.gms.internal.zzbk.2.this.zzrF, com.google.android.gms.internal.zzbk.2.this.zzrG, s);
                    }
                };
            }

            @Override
            public void run() {
                if(webView0.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView0.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zzrE);
                    }
                    catch(Throwable unused_ex) {
                        this.zzrE.onReceiveValue("");
                    }
                }
            }
        });
        return true;
    }

    public void zzcp() {
        synchronized(this.zzqt) {
            if(this.mStarted) {
                zzb.zzay("Content hash thread already started, quiting...");
                return;
            }
            this.mStarted = true;
        }
        this.start();
    }

    boolean zzcq() {
        try {
            Context context0 = this.zzrw.getContext();
            if(context0 == null) {
                return false;
            }
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
                if(!this.zza(activityManager$RunningAppProcessInfo0) || keyguardManager0.inKeyguardRestrictedInputMode() || !this.zzr(context0)) {
                    break;
                }
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public zzbh zzcr() {
        return this.zzrx.zzco();
    }

    public void zzcs() {
        synchronized(this.zzqt) {
            this.zzrv = true;
            zzb.zzay(("ContentFetchThread: paused, mPause = " + true));
        }
    }

    public boolean zzct() {
        return this.zzrv;
    }

    boolean zzf(View view0) {
        if(view0 == null) {
            return false;
        }
        view0.post(() -> try {
            zzbh zzbh0 = new zzbh(zzbk.this.zzrj, zzbk.this.zzrA, zzbk.this.zzrl, zzbk.this.zzrB);
            zza zzbk$zza0 = zzbk.this.zza(this.zzrC, zzbh0);
            zzbh0.zzcm();
            if((zzbk$zza0.zzrI != 0 || zzbk$zza0.zzrJ != 0) && ((zzbk$zza0.zzrJ != 0 || zzbh0.zzcn() != 0) && (zzbk$zza0.zzrJ != 0 || !zzbk.this.zzrx.zza(zzbh0)))) {
                zzbk.this.zzrx.zzc(zzbh0);
            }
        }
        catch(Exception exception0) {
            zzb.zzb("Exception in fetchContentOnUIThread", exception0);
            zzbk.this.zzry.zza(exception0, true);
        });
        return true;

        class com.google.android.gms.internal.zzbk.1 implements Runnable {
            com.google.android.gms.internal.zzbk.1(View view0) {
            }

            @Override
            public void run() {
                zzbk.this.zzg(this.zzrC);
            }
        }

    }

    // 检测为 lambda 实现。
    void zzg(View view0) {
        try {
            zzbh zzbh0 = new zzbh(this.zzrj, this.zzrA, this.zzrl, this.zzrB);
            zza zzbk$zza0 = this.zza(view0, zzbh0);
            zzbh0.zzcm();
            if((zzbk$zza0.zzrI != 0 || zzbk$zza0.zzrJ != 0) && ((zzbk$zza0.zzrJ != 0 || zzbh0.zzcn() != 0) && (zzbk$zza0.zzrJ != 0 || !this.zzrx.zza(zzbh0)))) {
                this.zzrx.zzc(zzbh0);
            }
        }
        catch(Exception exception0) {
            zzb.zzb("Exception in fetchContentOnUIThread", exception0);
            this.zzry.zza(exception0, true);
        }
    }

    boolean zzr(Context context0) {
        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
        return powerManager0 == null ? false : powerManager0.isScreenOn();
    }
}

