package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataLayer {
    static final class zza {
        public final Object zzGK;
        public final String zztw;

        zza(String s, Object object0) {
            this.zztw = s;
            this.zzGK = object0;
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(Object o) {
            return o instanceof zza ? this.zztw.equals(((zza)o).zztw) && this.zzGK.equals(((zza)o).zzGK) : false;
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(new Integer[]{this.zztw.hashCode(), this.zzGK.hashCode()});
        }

        @Override
        public String toString() {
            return "Key: " + this.zztw + " value: " + this.zzGK.toString();
        }
    }

    interface zzb {
        void zzF(Map arg1);
    }

    interface zzc {
        public interface com.google.android.gms.tagmanager.DataLayer.zzc.zza {
            void zzo(List arg1);
        }

        void zza(com.google.android.gms.tagmanager.DataLayer.zzc.zza arg1);

        void zza(List arg1, long arg2);

        void zzep(String arg1);
    }

    public static final String EVENT_KEY = "event";
    public static final Object OBJECT_NOT_PRESENT;
    static final String[] zzaLf;
    private static final Pattern zzaLg;
    private final ConcurrentHashMap zzaLh;
    private final Map zzaLi;
    private final ReentrantLock zzaLj;
    private final LinkedList zzaLk;
    private final zzc zzaLl;
    private final CountDownLatch zzaLm;

    static {
        DataLayer.OBJECT_NOT_PRESENT = new Object();
        DataLayer.zzaLf = new String[]{"gtm", "lifetime"};
        DataLayer.zzaLg = Pattern.compile("(\\d+)\\s*([smhd]?)");
    }

    DataLayer() {
        this(new com.google.android.gms.tagmanager.DataLayer.1());

        class com.google.android.gms.tagmanager.DataLayer.1 implements zzc {
            @Override  // com.google.android.gms.tagmanager.DataLayer$zzc
            public void zza(com.google.android.gms.tagmanager.DataLayer.zzc.zza dataLayer$zzc$zza0) {
                dataLayer$zzc$zza0.zzo(new ArrayList());
            }

            @Override  // com.google.android.gms.tagmanager.DataLayer$zzc
            public void zza(List list0, long v) {
            }

            @Override  // com.google.android.gms.tagmanager.DataLayer$zzc
            public void zzep(String s) {
            }
        }

    }

    DataLayer(zzc persistentStore) {
        this.zzaLl = persistentStore;
        this.zzaLh = new ConcurrentHashMap();
        this.zzaLi = new HashMap();
        this.zzaLj = new ReentrantLock();
        this.zzaLk = new LinkedList();
        this.zzaLm = new CountDownLatch(1);
        this.zzyy();
    }

    public Object get(String key) {
        synchronized(this.zzaLi) {
            String[] arr_s = key.split("\\.");
            Map map1 = this.zzaLi;
            int v1 = 0;
            while(v1 < arr_s.length) {
                String s1 = arr_s[v1];
                if(!(map1 instanceof Map)) {
                    return null;
                }
                Object object0 = map1.get(s1);
                if(object0 == null) {
                    return null;
                }
                ++v1;
                map1 = object0;
            }
            return map1;
        }
    }

    public static List listOf(Object[] objects) {
        List list0 = new ArrayList();
        for(int v = 0; v < objects.length; ++v) {
            list0.add(objects[v]);
        }
        return list0;
    }

    public static Map mapOf(Object[] objects) {
        if(objects.length % 2 != 0) {
            throw new IllegalArgumentException("expected even number of key-value pairs");
        }
        Map map0 = new HashMap();
        for(int v = 0; v < objects.length; v += 2) {
            if(!(objects[v] instanceof String)) {
                throw new IllegalArgumentException("key is not a string: " + objects[v]);
            }
            map0.put(((String)objects[v]), objects[v + 1]);
        }
        return map0;
    }

    public void push(String key, Object value) {
        this.push(this.zzj(key, value));
    }

    public void push(Map map0) {
        try {
            this.zzaLm.await();
        }
        catch(InterruptedException unused_ex) {
            zzbg.zzaC("DataLayer.push: unexpected InterruptedException");
        }
        this.zzH(map0);
    }

    public void pushEvent(String eventName, Map map0) {
        HashMap hashMap0 = new HashMap(map0);
        hashMap0.put("event", eventName);
        this.push(hashMap0);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0;
        synchronized(this.zzaLi) {
            stringBuilder0 = new StringBuilder();
            for(Object object0: this.zzaLi.entrySet()) {
                stringBuilder0.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", ((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue()));
            }
        }
        return stringBuilder0.toString();
    }

    private void zzH(Map map0) {
        this.zzaLj.lock();
        try {
            this.zzaLk.offer(map0);
            if(this.zzaLj.getHoldCount() == 1) {
                this.zzyz();
            }
            this.zzI(map0);
        }
        finally {
            this.zzaLj.unlock();
        }
    }

    private void zzI(Map map0) {
        Long long0 = this.zzJ(map0);
        if(long0 == null) {
            return;
        }
        List list0 = this.zzL(map0);
        list0.remove("gtm.lifetime");
        this.zzaLl.zza(list0, ((long)long0));
    }

    private Long zzJ(Map map0) {
        Object object0 = this.zzK(map0);
        return object0 == null ? null : DataLayer.zzeo(object0.toString());
    }

    private Object zzK(Map map0) {
        String[] arr_s = DataLayer.zzaLf;
        int v = 0;
        Map map1;
        for(map1 = map0; v < arr_s.length; map1 = map1.get(s)) {
            String s = arr_s[v];
            if(!(map1 instanceof Map)) {
                return null;
            }
            ++v;
        }
        return map1;
    }

    private List zzL(Map map0) {
        List list0 = new ArrayList();
        this.zza(map0, "", list0);
        return list0;
    }

    private void zzM(Map map0) {
        synchronized(this.zzaLi) {
            for(Object object0: map0.keySet()) {
                this.zzc(this.zzj(((String)object0), map0.get(((String)object0))), this.zzaLi);
            }
        }
        this.zzN(map0);
    }

    private void zzN(Map map0) {
        for(Object object0: this.zzaLh.keySet()) {
            ((zzb)object0).zzF(map0);
        }
    }

    private void zza(Map map0, String s, Collection collection0) {
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s1 = s + (s.length() == 0 ? "" : ".") + ((String)map$Entry0.getKey());
            if(map$Entry0.getValue() instanceof Map) {
                this.zza(((Map)map$Entry0.getValue()), s1, collection0);
            }
            else if(!s1.equals("gtm.lifetime")) {
                collection0.add(new zza(s1, map$Entry0.getValue()));
            }
        }
    }

    void zza(zzb dataLayer$zzb0) {
        this.zzaLh.put(dataLayer$zzb0, 0);
    }

    void zzb(List list0, List list1) {
        while(list1.size() < list0.size()) {
            list1.add(null);
        }
        for(int v = 0; v < list0.size(); ++v) {
            Object object0 = list0.get(v);
            if(object0 instanceof List) {
                if(!(list1.get(v) instanceof List)) {
                    list1.set(v, new ArrayList());
                }
                this.zzb(((List)object0), ((List)list1.get(v)));
            }
            else if(object0 instanceof Map) {
                if(!(list1.get(v) instanceof Map)) {
                    list1.set(v, new HashMap());
                }
                this.zzc(((Map)object0), ((Map)list1.get(v)));
            }
            else if(object0 != DataLayer.OBJECT_NOT_PRESENT) {
                list1.set(v, object0);
            }
        }
    }

    void zzc(Map map0, Map map1) {
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            Object object1 = map0.get(s);
            if(object1 instanceof List) {
                if(!(map1.get(s) instanceof List)) {
                    map1.put(s, new ArrayList());
                }
                this.zzb(((List)object1), ((List)map1.get(s)));
            }
            else if(object1 instanceof Map) {
                if(!(map1.get(s) instanceof Map)) {
                    map1.put(s, new HashMap());
                }
                this.zzc(((Map)object1), ((Map)map1.get(s)));
            }
            else {
                map1.put(s, object1);
            }
        }
    }

    void zzen(String s) {
        this.push(s, null);
        this.zzaLl.zzep(s);
    }

    static Long zzeo(String s) {
        long v;
        Matcher matcher0 = DataLayer.zzaLg.matcher(s);
        if(!matcher0.matches()) {
            zzbg.zzaA(("unknown _lifetime: " + s));
            return null;
        }
        try {
            v = Long.parseLong(matcher0.group(1));
        }
        catch(NumberFormatException unused_ex) {
            zzbg.zzaC(("illegal number in _lifetime value: " + s));
            v = 0L;
        }
        if(v <= 0L) {
            zzbg.zzaA(("non-positive _lifetime: " + s));
            return null;
        }
        String s1 = matcher0.group(2);
        if(s1.length() == 0) {
            return v;
        }
        switch(s1.charAt(0)) {
            case 100: {
                return (long)(v * 86400000L);
            }
            case 104: {
                return (long)(v * 3600000L);
            }
            case 109: {
                return (long)(v * 60000L);
            }
            case 0x73: {
                return (long)(v * 1000L);
            }
            default: {
                zzbg.zzaC(("unknown units in _lifetime: " + s));
                return null;
            }
        }
    }

    Map zzj(String s, Object object0) {
        Map map0 = new HashMap();
        String[] arr_s = s.toString().split("\\.");
        int v = 0;
        Map map1;
        for(map1 = map0; v < arr_s.length - 1; map1 = hashMap0) {
            HashMap hashMap0 = new HashMap();
            map1.put(arr_s[v], hashMap0);
            ++v;
        }
        map1.put(arr_s[arr_s.length - 1], object0);
        return map0;
    }

    private void zzyy() {
        com.google.android.gms.tagmanager.DataLayer.2 dataLayer$20 = new com.google.android.gms.tagmanager.DataLayer.zzc.zza() {
            @Override  // com.google.android.gms.tagmanager.DataLayer$zzc$zza
            public void zzo(List list0) {
                for(Object object0: list0) {
                    Map map0 = DataLayer.this.zzj(((zza)object0).zztw, ((zza)object0).zzGK);
                    DataLayer.this.zzH(map0);
                }
                DataLayer.this.zzaLm.countDown();
            }
        };
        this.zzaLl.zza(dataLayer$20);
    }

    private void zzyz() {
        Map map0;
        for(int v = 0; (map0 = (Map)this.zzaLk.poll()) != null; ++v) {
            this.zzM(map0);
            if(v + 1 > 500) {
                this.zzaLk.clear();
                throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
            }
        }
    }
}

