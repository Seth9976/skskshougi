package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.internal.zzae;
import java.util.ArrayList;
import java.util.Map;

public class ExceptionReporter implements Thread.UncaughtExceptionHandler {
    private final Context mContext;
    private final Thread.UncaughtExceptionHandler zzIp;
    private final Tracker zzIq;
    private ExceptionParser zzIr;
    private GoogleAnalytics zzIs;

    public ExceptionReporter(Tracker tracker, Thread.UncaughtExceptionHandler originalHandler, Context context) {
        if(tracker == null) {
            throw new NullPointerException("tracker cannot be null");
        }
        if(context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.zzIp = originalHandler;
        this.zzIq = tracker;
        this.zzIr = new StandardExceptionParser(context, new ArrayList());
        this.mContext = context.getApplicationContext();
        zzae.zzaB(("ExceptionReporter created, original handler is " + (originalHandler == null ? "null" : originalHandler.getClass().getName())));
    }

    public ExceptionParser getExceptionParser() {
        return this.zzIr;
    }

    public void setExceptionParser(ExceptionParser exceptionParser) {
        this.zzIr = exceptionParser;
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        String s = this.zzIr == null ? "UncaughtException" : this.zzIr.getDescription((t == null ? null : t.getName()), e);
        zzae.zzaB(("Reporting uncaught exception: " + s));
        Map map0 = new ExceptionBuilder().setDescription(s).setFatal(true).build();
        this.zzIq.send(map0);
        GoogleAnalytics googleAnalytics0 = this.zzhg();
        googleAnalytics0.dispatchLocalHits();
        googleAnalytics0.zzhk();
        if(this.zzIp != null) {
            zzae.zzaB("Passing exception to the original handler");
            this.zzIp.uncaughtException(t, e);
        }
    }

    GoogleAnalytics zzhg() {
        if(this.zzIs == null) {
            this.zzIs = GoogleAnalytics.getInstance(this.mContext);
        }
        return this.zzIs;
    }

    Thread.UncaughtExceptionHandler zzhh() {
        return this.zzIp;
    }
}

