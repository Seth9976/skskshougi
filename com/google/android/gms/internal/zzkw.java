package com.google.android.gms.internal;

import java.util.Map;

public class zzkw {
    Object[] mArray;
    static Object[] mBaseCache;
    static int mBaseCacheSize;
    int[] mHashes;
    int mSize;
    static Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;

    public zzkw() {
        this.mHashes = zzkt.EMPTY_INTS;
        this.mArray = zzkt.EMPTY_OBJECTS;
        this.mSize = 0;
    }

    public void clear() {
        if(this.mSize != 0) {
            zzkw.zza(this.mHashes, this.mArray, this.mSize);
            this.mHashes = zzkt.EMPTY_INTS;
            this.mArray = zzkt.EMPTY_OBJECTS;
            this.mSize = 0;
        }
    }

    public boolean containsKey(Object key) {
        return key == null ? this.indexOfNull() >= 0 : this.indexOf(key, key.hashCode()) >= 0;
    }

    public boolean containsValue(Object value) {
        return this.indexOfValue(value) >= 0;
    }

    public void ensureCapacity(int minimumCapacity) {
        if(this.mHashes.length < minimumCapacity) {
            int[] arr_v = this.mHashes;
            Object[] arr_object = this.mArray;
            this.zzbC(minimumCapacity);
            if(this.mSize > 0) {
                System.arraycopy(arr_v, 0, this.mHashes, 0, this.mSize);
                System.arraycopy(arr_object, 0, this.mArray, 0, this.mSize << 1);
            }
            zzkw.zza(arr_v, arr_object, this.mSize);
        }
    }

    @Override
    public boolean equals(Object object) {
        if(this != object) {
            if(object instanceof Map) {
                Map map0 = (Map)object;
                if(this.size() != map0.size()) {
                    return false;
                }
                int v = 0;
                try {
                    while(v < this.mSize) {
                        Object object1 = this.keyAt(v);
                        Object object2 = this.valueAt(v);
                        Object object3 = map0.get(object1);
                        if(object2 != null) {
                            if(object2.equals(object3)) {
                                ++v;
                                continue;
                            }
                        }
                        else if(object3 != null || !map0.containsKey(object1)) {
                            return false;
                        }
                        else {
                            ++v;
                            continue;
                        }
                        return false;
                    }
                    return true;
                }
                catch(NullPointerException unused_ex) {
                    return false;
                }
                catch(ClassCastException unused_ex) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Object get(Object key) {
        int v;
        if(key == null) {
            v = this.indexOfNull();
            return v < 0 ? null : this.mArray[(v << 1) + 1];
        }
        v = this.indexOf(key, key.hashCode());
        return v < 0 ? null : this.mArray[(v << 1) + 1];
    }

    @Override
    public int hashCode() {
        int[] arr_v = this.mHashes;
        Object[] arr_object = this.mArray;
        int v = this.mSize;
        int v2 = 0;
        int v3 = 0;
        for(int v1 = 1; v2 < v; v1 += 2) {
            Object object0 = arr_object[v1];
            v3 += (object0 == null ? 0 : object0.hashCode()) ^ arr_v[v2];
            ++v2;
        }
        return v3;
    }

    int indexOf(Object key, int hash) {
        int v1 = this.mSize;
        if(v1 == 0) {
            return -1;
        }
        int v2 = zzkt.binarySearch(this.mHashes, v1, hash);
        if(v2 >= 0 && !key.equals(this.mArray[v2 << 1])) {
            int v3;
            for(v3 = v2 + 1; v3 < v1 && this.mHashes[v3] == hash; ++v3) {
                if(key.equals(this.mArray[v3 << 1])) {
                    return v3;
                }
            }
            --v2;
            while(v2 >= 0 && this.mHashes[v2] == hash) {
                if(key.equals(this.mArray[v2 << 1])) {
                    return v2;
                }
                --v2;
            }
            return ~v3;
        }
        return v2;
    }

    int indexOfNull() {
        int v = this.mSize;
        if(v == 0) {
            return -1;
        }
        int v1 = zzkt.binarySearch(this.mHashes, v, 0);
        if(v1 >= 0 && this.mArray[v1 << 1] != null) {
            int v2;
            for(v2 = v1 + 1; v2 < v && this.mHashes[v2] == 0; ++v2) {
                if(this.mArray[v2 << 1] == null) {
                    return v2;
                }
            }
            --v1;
            while(v1 >= 0 && this.mHashes[v1] == 0) {
                if(this.mArray[v1 << 1] == null) {
                    return v1;
                }
                --v1;
            }
            return ~v2;
        }
        return v1;
    }

    int indexOfValue(Object value) {
        int v = 1;
        int v1 = this.mSize * 2;
        Object[] arr_object = this.mArray;
        if(value == null) {
            while(v < v1) {
                if(arr_object[v] == null) {
                    return v >> 1;
                }
                v += 2;
            }
            return -1;
        }
        while(v < v1) {
            if(value.equals(arr_object[v])) {
                return v >> 1;
            }
            v += 2;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    public Object keyAt(int index) {
        return this.mArray[index << 1];
    }

    public Object put(Object object0, Object object1) {
        int v2;
        int v1;
        int v = 8;
        if(object0 == null) {
            v1 = this.indexOfNull();
            v2 = 0;
        }
        else {
            v2 = object0.hashCode();
            v1 = this.indexOf(object0, v2);
        }
        if(v1 >= 0) {
            int v3 = (v1 << 1) + 1;
            Object object2 = this.mArray[v3];
            this.mArray[v3] = object1;
            return object2;
        }
        if(this.mSize >= this.mHashes.length) {
            if(this.mSize >= 8) {
                v = this.mSize + (this.mSize >> 1);
            }
            else if(this.mSize < 4) {
                v = 4;
            }
            int[] arr_v = this.mHashes;
            Object[] arr_object = this.mArray;
            this.zzbC(v);
            if(this.mHashes.length > 0) {
                System.arraycopy(arr_v, 0, this.mHashes, 0, arr_v.length);
                System.arraycopy(arr_object, 0, this.mArray, 0, arr_object.length);
            }
            zzkw.zza(arr_v, arr_object, this.mSize);
        }
        if(~v1 < this.mSize) {
            System.arraycopy(this.mHashes, ~v1, this.mHashes, -v1, this.mSize - ~v1);
            System.arraycopy(this.mArray, ~v1 << 1, this.mArray, -v1 << 1, this.mSize - ~v1 << 1);
        }
        this.mHashes[~v1] = v2;
        this.mArray[~v1 << 1] = object0;
        this.mArray[(~v1 << 1) + 1] = object1;
        ++this.mSize;
        return null;
    }

    public Object remove(Object key) {
        int v;
        if(key == null) {
            v = this.indexOfNull();
            return v < 0 ? null : this.removeAt(v);
        }
        v = this.indexOf(key, key.hashCode());
        return v < 0 ? null : this.removeAt(v);
    }

    public Object removeAt(int index) {
        int v1 = 8;
        Object object0 = this.mArray[(index << 1) + 1];
        if(this.mSize <= 1) {
            zzkw.zza(this.mHashes, this.mArray, this.mSize);
            this.mHashes = zzkt.EMPTY_INTS;
            this.mArray = zzkt.EMPTY_OBJECTS;
            this.mSize = 0;
            return object0;
        }
        if(this.mHashes.length > 8 && this.mSize < this.mHashes.length / 3) {
            if(this.mSize > 8) {
                v1 = this.mSize + (this.mSize >> 1);
            }
            int[] arr_v = this.mHashes;
            Object[] arr_object = this.mArray;
            this.zzbC(v1);
            --this.mSize;
            if(index > 0) {
                System.arraycopy(arr_v, 0, this.mHashes, 0, index);
                System.arraycopy(arr_object, 0, this.mArray, 0, index << 1);
            }
            if(index < this.mSize) {
                System.arraycopy(arr_v, index + 1, this.mHashes, index, this.mSize - index);
                System.arraycopy(arr_object, index + 1 << 1, this.mArray, index << 1, this.mSize - index << 1);
                return object0;
            }
            return object0;
        }
        --this.mSize;
        if(index < this.mSize) {
            System.arraycopy(this.mHashes, index + 1, this.mHashes, index, this.mSize - index);
            System.arraycopy(this.mArray, index + 1 << 1, this.mArray, index << 1, this.mSize - index << 1);
        }
        this.mArray[this.mSize << 1] = null;
        this.mArray[(this.mSize << 1) + 1] = null;
        return object0;
    }

    public Object setValueAt(int index, Object object0) {
        int v1 = (index << 1) + 1;
        Object object1 = this.mArray[v1];
        this.mArray[v1] = object0;
        return object1;
    }

    public int size() {
        return this.mSize;
    }

    @Override
    public String toString() {
        if(this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.mSize * 28);
        stringBuilder0.append('{');
        for(int v = 0; v < this.mSize; ++v) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            Object object0 = this.keyAt(v);
            if(object0 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
            stringBuilder0.append('=');
            Object object1 = this.valueAt(v);
            if(object1 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object1);
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    public Object valueAt(int index) {
        return this.mArray[(index << 1) + 1];
    }

    private static void zza(int[] arr_v, Object[] arr_object, int v) {
        switch(arr_v.length) {
            case 4: {
                Class class0 = zzks.class;
                synchronized(class0) {
                    if(zzkw.mBaseCacheSize < 10) {
                        arr_object[0] = zzkw.mBaseCache;
                        arr_object[1] = arr_v;
                        for(int v2 = (v << 1) - 1; v2 >= 2; --v2) {
                            arr_object[v2] = null;
                        }
                        zzkw.mBaseCache = arr_object;
                        ++zzkw.mBaseCacheSize;
                    }
                }
                return;
            }
            case 8: {
                Class class1 = zzks.class;
                synchronized(class1) {
                    if(zzkw.mTwiceBaseCacheSize < 10) {
                        arr_object[0] = zzkw.mTwiceBaseCache;
                        arr_object[1] = arr_v;
                        for(int v4 = (v << 1) - 1; v4 >= 2; --v4) {
                            arr_object[v4] = null;
                        }
                        zzkw.mTwiceBaseCache = arr_object;
                        ++zzkw.mTwiceBaseCacheSize;
                    }
                }
            }
        }
    }

    private void zzbC(int v) {
        switch(v) {
            case 4: {
                Class class0 = zzks.class;
                synchronized(class0) {
                    if(zzkw.mBaseCache != null) {
                        Object[] arr_object = zzkw.mBaseCache;
                        this.mArray = arr_object;
                        zzkw.mBaseCache = (Object[])arr_object[0];
                        this.mHashes = (int[])arr_object[1];
                        arr_object[1] = null;
                        arr_object[0] = null;
                        --zzkw.mBaseCacheSize;
                        return;
                    }
                }
                break;
            }
            case 8: {
                Class class1 = zzks.class;
                synchronized(class1) {
                    if(zzkw.mTwiceBaseCache != null) {
                        Object[] arr_object1 = zzkw.mTwiceBaseCache;
                        this.mArray = arr_object1;
                        zzkw.mTwiceBaseCache = (Object[])arr_object1[0];
                        this.mHashes = (int[])arr_object1[1];
                        arr_object1[1] = null;
                        arr_object1[0] = null;
                        --zzkw.mTwiceBaseCacheSize;
                        return;
                    }
                }
            }
        }
        this.mHashes = new int[v];
        this.mArray = new Object[v << 1];
    }
}

