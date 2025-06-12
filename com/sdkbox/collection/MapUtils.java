package com.sdkbox.collection;

import java.util.Map;

public class MapUtils {
    public static boolean getAsBoolean(Map map0, Object object0) {
        Object object1 = map0.get(object0);
        if(object0 == null) {
            return false;
        }
        return object1.getClass().isAssignableFrom(Boolean.class) ? ((Boolean)object1).booleanValue() : object1.getClass().isAssignableFrom(String.class) && (((String)object1).equals("1") || ((String)object1).equalsIgnoreCase("true"));
    }
}

