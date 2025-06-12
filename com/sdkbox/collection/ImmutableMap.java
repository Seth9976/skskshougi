package com.sdkbox.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class ImmutableMap extends HashMap {
    public ImmutableMap(Map map0) {
        for(Object object0: map0.entrySet()) {
            super.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @Override
    public Object put(Object object0, Object object1) {
        return null;
    }

    @Override
    public void putAll(Map map0) {
    }

    @Override
    public Object remove(Object key) {
        return null;
    }
}

