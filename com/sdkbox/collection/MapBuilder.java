package com.sdkbox.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapBuilder {
    private static final Map __emptyMap;
    private final ArrayList pairs;

    static {
        MapBuilder.__emptyMap = new HashMap();
    }

    public MapBuilder() {
        this.pairs = new ArrayList();
    }

    public ImmutableMap build() {
        HashMap m = new HashMap();
        for(Object object0: this.pairs) {
            m.put(((Pair)object0).key, ((Pair)object0).value);
        }
        return new ImmutableMap(m);
    }

    public Map buildMutable() {
        Map m = new HashMap();
        for(Object object0: this.pairs) {
            ((HashMap)m).put(((Pair)object0).key, ((Pair)object0).value);
        }
        return m;
    }

    public static Map emptyMap() {
        return MapBuilder.__emptyMap;
    }

    public static MapBuilder of() {
        return new MapBuilder();
    }

    public static Map of(Object object0, Object object1) {
        return new MapBuilder().pair(object0, object1).buildMutable();
    }

    public static MapBuilder ofPair(Object object0, Object object1) {
        return new MapBuilder().pair(object0, object1);
    }

    public MapBuilder pair(Object object0, Object object1) {
        Pair pair0 = new Pair(object0, object1);
        this.pairs.add(pair0);
        return this;
    }
}

