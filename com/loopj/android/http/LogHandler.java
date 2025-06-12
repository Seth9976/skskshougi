package com.loopj.android.http;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.util.Log;

public class LogHandler implements LogInterface {
    boolean mLoggingEnabled;
    int mLoggingLevel;

    public LogHandler() {
        this.mLoggingEnabled = true;
        this.mLoggingLevel = 2;
    }

    @TargetApi(8)
    private void checkedWtf(String tag, String msg, Throwable t) {
        Log.wtf(tag, msg, t);
    }

    @Override  // com.loopj.android.http.LogInterface
    public void d(String tag, String msg) {
        this.log(2, tag, msg);
    }

    @Override  // com.loopj.android.http.LogInterface
    public void d(String tag, String msg, Throwable t) {
        this.logWithThrowable(3, tag, msg, t);
    }

    @Override  // com.loopj.android.http.LogInterface
    public void e(String tag, String msg) {
        this.log(6, tag, msg);
    }

    @Override  // com.loopj.android.http.LogInterface
    public void e(String tag, String msg, Throwable t) {
        this.logWithThrowable(6, tag, msg, t);
    }

    @Override  // com.loopj.android.http.LogInterface
    public int getLoggingLevel() {
        return this.mLoggingLevel;
    }

    @Override  // com.loopj.android.http.LogInterface
    public void i(String tag, String msg) {
        this.log(4, tag, msg);
    }

    @Override  // com.loopj.android.http.LogInterface
    public void i(String tag, String msg, Throwable t) {
        this.logWithThrowable(4, tag, msg, t);
    }

    @Override  // com.loopj.android.http.LogInterface
    public boolean isLoggingEnabled() {
        return this.mLoggingEnabled;
    }

    public void log(int logLevel, String tag, String msg) {
        this.logWithThrowable(logLevel, tag, msg, null);
    }

    public void logWithThrowable(int logLevel, String tag, String msg, Throwable t) {
        if(this.isLoggingEnabled() && this.shouldLog(logLevel)) {
            switch(logLevel) {
                case 2: {
                    Log.v(tag, msg, t);
                    return;
                }
                case 3: {
                    Log.d(tag, msg, t);
                    return;
                }
                case 4: {
                    Log.i(tag, msg, t);
                    return;
                }
                case 5: {
                    Log.w(tag, msg, t);
                    return;
                }
                case 6: {
                    Log.e(tag, msg, t);
                    return;
                }
                case 8: {
                    if(((int)Integer.valueOf(Build.VERSION.SDK)) > 8) {
                        this.checkedWtf(tag, msg, t);
                        return;
                    }
                    Log.e(tag, msg, t);
                }
            }
        }
    }

    @Override  // com.loopj.android.http.LogInterface
    public void setLoggingEnabled(boolean loggingEnabled) {
        this.mLoggingEnabled = loggingEnabled;
    }

    @Override  // com.loopj.android.http.LogInterface
    public void setLoggingLevel(int loggingLevel) {
        this.mLoggingLevel = loggingLevel;
    }

    @Override  // com.loopj.android.http.LogInterface
    public boolean shouldLog(int logLevel) {
        return logLevel >= this.mLoggingLevel;
    }

    @Override  // com.loopj.android.http.LogInterface
    public void v(String tag, String msg) {
        this.log(2, tag, msg);
    }

    @Override  // com.loopj.android.http.LogInterface
    public void v(String tag, String msg, Throwable t) {
        this.logWithThrowable(2, tag, msg, t);
    }

    @Override  // com.loopj.android.http.LogInterface
    public void w(String tag, String msg) {
        this.log(5, tag, msg);
    }

    @Override  // com.loopj.android.http.LogInterface
    public void w(String tag, String msg, Throwable t) {
        this.logWithThrowable(5, tag, msg, t);
    }

    @Override  // com.loopj.android.http.LogInterface
    public void wtf(String tag, String msg) {
        this.log(8, tag, msg);
    }

    @Override  // com.loopj.android.http.LogInterface
    public void wtf(String tag, String msg, Throwable t) {
        this.logWithThrowable(8, tag, msg, t);
    }
}

