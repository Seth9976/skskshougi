package com.google.android.gms.analytics;

@Deprecated
public interface Logger {
    @Deprecated
    public static class LogLevel {
        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

    }

    @Deprecated
    void error(Exception arg1);

    @Deprecated
    void error(String arg1);

    @Deprecated
    int getLogLevel();

    @Deprecated
    void info(String arg1);

    @Deprecated
    void setLogLevel(int arg1);

    @Deprecated
    void verbose(String arg1);

    @Deprecated
    void warn(String arg1);
}

