package com.loopj.android.http;

class Utils {
    public static void asserts(boolean expression, String failedMessage) {
        if(!expression) {
            throw new AssertionError(failedMessage);
        }
    }

    public static Object notNull(Object object0, String name) {
        if(object0 == null) {
            throw new IllegalArgumentException(name + " should not be null!");
        }
        return object0;
    }
}

