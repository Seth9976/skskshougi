package com.google.android.gms.internal;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Binder;
import java.util.List;

public class zzll {
    private static String zza(StackTraceElement[] arr_stackTraceElement, int v) {
        if(v + 4 >= arr_stackTraceElement.length) {
            return "<bottom of call stack>";
        }
        StackTraceElement stackTraceElement0 = arr_stackTraceElement[v + 4];
        return stackTraceElement0.getClassName() + "." + stackTraceElement0.getMethodName() + ":" + stackTraceElement0.getLineNumber();
    }

    public static String zzaj(Context context0) {
        return zzll.zzj(context0, Binder.getCallingPid());
    }

    public static String zzj(Context context0, int v) {
        List list0 = ((ActivityManager)context0.getSystemService("activity")).getRunningAppProcesses();
        if(list0 != null) {
            for(Object object0: list0) {
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                if(activityManager$RunningAppProcessInfo0.pid == v) {
                    return activityManager$RunningAppProcessInfo0.processName;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public static String zzl(int v, int v1) [...] // Potential decryptor
}

