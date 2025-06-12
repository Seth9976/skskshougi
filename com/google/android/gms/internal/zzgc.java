package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

@zzgd
public class zzgc implements Thread.UncaughtExceptionHandler {
    private Context mContext;
    private Thread.UncaughtExceptionHandler zzCa;
    private Thread.UncaughtExceptionHandler zzCb;
    private VersionInfoParcel zzCc;

    public zzgc(Context context0, VersionInfoParcel versionInfoParcel0, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler1) {
        this.zzCa = thread$UncaughtExceptionHandler0;
        this.zzCb = thread$UncaughtExceptionHandler1;
        this.mContext = context0;
        this.zzCc = versionInfoParcel0;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable exception) {
        if(this.zza(exception)) {
            if(Looper.getMainLooper().getThread() != thread) {
                this.zza(exception, true);
                return;
            }
            this.zza(exception, false);
        }
        if(this.zzCa != null) {
            this.zzCa.uncaughtException(thread, exception);
            return;
        }
        if(this.zzCb != null) {
            this.zzCb.uncaughtException(thread, exception);
        }
    }

    public static zzgc zza(Context context0, Thread thread0, VersionInfoParcel versionInfoParcel0) {
        if(context0 == null || thread0 == null || versionInfoParcel0 == null) {
            return null;
        }
        if(!zzgc.zzz(context0)) {
            return null;
        }
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = thread0.getUncaughtExceptionHandler();
        zzgc zzgc0 = new zzgc(context0, versionInfoParcel0, thread$UncaughtExceptionHandler0, Thread.getDefaultUncaughtExceptionHandler());
        if(thread$UncaughtExceptionHandler0 == null || !(thread$UncaughtExceptionHandler0 instanceof zzgc)) {
            try {
                thread0.setUncaughtExceptionHandler(zzgc0);
                return zzgc0;
            }
            catch(SecurityException securityException0) {
                zzb.zzc("Fail to set UncaughtExceptionHandler.", securityException0);
                return null;
            }
        }
        return (zzgc)thread$UncaughtExceptionHandler0;
    }

    public void zza(Throwable throwable0, boolean z) {
        if(zzgc.zzz(this.mContext)) {
            Throwable throwable1 = this.zzb(throwable0);
            if(throwable1 != null) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(this.zzb(throwable1, z));
                zzo.zzbv().zza(this.mContext, this.zzCc.zzGG, arrayList0, zzo.zzby().zzgb());
            }
        }
    }

    protected boolean zza(Throwable throwable0) {
        if(throwable0 == null) {
            return false;
        }
        boolean z = false;
        boolean z1 = false;
        while(throwable0 != null) {
            StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                if(this.zzal(stackTraceElement0.getClassName())) {
                    z1 = true;
                }
                if(this.getClass().getName().equals(stackTraceElement0.getClassName())) {
                    z = true;
                }
            }
            throwable0 = throwable0.getCause();
        }
        return z1 && !z;
    }

    protected boolean zzal(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        if(s.startsWith("com.google.android.gms.ads")) {
            return true;
        }
        if(s.startsWith("com.google.ads")) {
            return true;
        }
        try {
            return Class.forName(s).isAnnotationPresent(zzgd.class);
        }
        catch(Exception exception0) {
            zzb.zza(("Fail to check class type for class " + s), exception0);
            return false;
        }
    }

    // 去混淆评级： 低(40)
    protected boolean zzam(String s) {
        return TextUtils.isEmpty(s) ? false : s.startsWith("android.") || s.startsWith("java.");
    }

    private Throwable zzb(Throwable throwable0) {
        Throwable throwable3;
        if(((Boolean)zzbz.zztH.get()).booleanValue()) {
            return throwable0;
        }
        LinkedList linkedList0 = new LinkedList();
        while(throwable0 != null) {
            linkedList0.push(throwable0);
            throwable0 = throwable0.getCause();
        }
        Throwable throwable1;
        for(throwable1 = null; !linkedList0.isEmpty(); throwable1 = throwable3) {
            Throwable throwable2 = (Throwable)linkedList0.pop();
            StackTraceElement[] arr_stackTraceElement = throwable2.getStackTrace();
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(new StackTraceElement(throwable2.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                if(this.zzal(stackTraceElement0.getClassName())) {
                    arrayList0.add(stackTraceElement0);
                    z = true;
                }
                else if(this.zzam(stackTraceElement0.getClassName())) {
                    arrayList0.add(stackTraceElement0);
                }
                else {
                    arrayList0.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                }
            }
            if(z) {
                throwable3 = throwable1 == null ? new Throwable(throwable2.getMessage()) : new Throwable(throwable2.getMessage(), throwable1);
                throwable3.setStackTrace(((StackTraceElement[])arrayList0.toArray(new StackTraceElement[0])));
            }
            else {
                throwable3 = throwable1;
            }
        }
        return throwable1;
    }

    String zzb(Throwable throwable0, boolean z) {
        StringWriter stringWriter0 = new StringWriter();
        throwable0.printStackTrace(new PrintWriter(stringWriter0));
        return new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", "33").appendQueryParameter("device", zzo.zzbv().zzgo()).appendQueryParameter("js", this.zzCc.zzGG).appendQueryParameter("appid", "org.dyndns.vivi.SkskShogi").appendQueryParameter("stacktrace", stringWriter0.toString()).appendQueryParameter("eids", TextUtils.join(",", zzbz.zzdb())).appendQueryParameter("trapped", String.valueOf(z)).toString();
    }

    private static boolean zzz(Context context0) {
        return ((Boolean)zzbz.zztG.get()).booleanValue();
    }
}

