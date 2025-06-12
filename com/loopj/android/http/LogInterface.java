package com.loopj.android.http;

public interface LogInterface {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    public static final int WTF = 8;

    void d(String arg1, String arg2);

    void d(String arg1, String arg2, Throwable arg3);

    void e(String arg1, String arg2);

    void e(String arg1, String arg2, Throwable arg3);

    int getLoggingLevel();

    void i(String arg1, String arg2);

    void i(String arg1, String arg2, Throwable arg3);

    boolean isLoggingEnabled();

    void setLoggingEnabled(boolean arg1);

    void setLoggingLevel(int arg1);

    boolean shouldLog(int arg1);

    void v(String arg1, String arg2);

    void v(String arg1, String arg2, Throwable arg3);

    void w(String arg1, String arg2);

    void w(String arg1, String arg2, Throwable arg3);

    void wtf(String arg1, String arg2);

    void wtf(String arg1, String arg2, Throwable arg3);
}

