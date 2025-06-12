package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.analytics.internal.zzae;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class StandardExceptionParser implements ExceptionParser {
    private final TreeSet zzIG;

    public StandardExceptionParser(Context context, Collection collection0) {
        this.zzIG = new TreeSet();
        this.setIncludedPackages(context, collection0);
    }

    protected StackTraceElement getBestStackTraceElement(Throwable t) {
        StackTraceElement[] arr_stackTraceElement = t.getStackTrace();
        if(arr_stackTraceElement == null || arr_stackTraceElement.length == 0) {
            return null;
        }
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
            String s = stackTraceElement0.getClassName();
            for(Object object0: this.zzIG) {
                if(s.startsWith(((String)object0))) {
                    return stackTraceElement0;
                }
                if(false) {
                    break;
                }
            }
        }
        return arr_stackTraceElement[0];
    }

    protected Throwable getCause(Throwable throwable0) {
        while(throwable0.getCause() != null) {
            throwable0 = throwable0.getCause();
        }
        return throwable0;
    }

    @Override  // com.google.android.gms.analytics.ExceptionParser
    public String getDescription(String threadName, Throwable t) {
        return this.getDescription(this.getCause(t), this.getBestStackTraceElement(this.getCause(t)), threadName);
    }

    protected String getDescription(Throwable cause, StackTraceElement element, String threadName) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(cause.getClass().getSimpleName());
        if(element != null) {
            String[] arr_s = element.getClassName().split("\\.");
            stringBuilder0.append(String.format(" (@%s:%s:%s)", (arr_s == null || arr_s.length <= 0 ? "unknown" : arr_s[arr_s.length - 1]), element.getMethodName(), element.getLineNumber()));
        }
        if(threadName != null) {
            stringBuilder0.append(String.format(" {%s}", threadName));
        }
        return stringBuilder0.toString();
    }

    public void setIncludedPackages(Context context, Collection collection0) {
        this.zzIG.clear();
        HashSet hashSet0 = new HashSet();
        if(collection0 != null) {
            hashSet0.addAll(collection0);
        }
        if(context != null) {
            try {
                this.zzIG.add("org.dyndns.vivi.SkskShogi");
                ActivityInfo[] arr_activityInfo = context.getApplicationContext().getPackageManager().getPackageInfo("org.dyndns.vivi.SkskShogi", 1).activities;
                if(arr_activityInfo != null) {
                label_9:
                    for(int v = 0; v < arr_activityInfo.length; ++v) {
                        hashSet0.add(arr_activityInfo[v].packageName);
                    }
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                zzae.zzaA("No package found");
                if(true) {
                    goto label_15;
                }
                goto label_9;
            }
        }
    label_15:
        for(Object object0: hashSet0) {
            String s = (String)object0;
            boolean z = true;
            for(Object object1: this.zzIG) {
                String s1 = (String)object1;
                if(!s.startsWith(s1)) {
                    if(s1.startsWith(s)) {
                        this.zzIG.remove(s1);
                    }
                    break;
                }
                z = false;
            }
            if(z) {
                this.zzIG.add(s);
            }
        }
    }
}

