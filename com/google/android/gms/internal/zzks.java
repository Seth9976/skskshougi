package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class zzks extends zzkw implements Map {
    zzkv zzabl;

    @Override
    public Set entrySet() {
        return this.zzog().getEntrySet();
    }

    @Override
    public Set keySet() {
        return this.zzog().getKeySet();
    }

    @Override
    public void putAll(Map map0) {
        this.ensureCapacity(this.mSize + map0.size());
        for(Object object0: map0.entrySet()) {
            this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @Override
    public Collection values() {
        return this.zzog().getValues();
    }

    private zzkv zzog() {
        if(this.zzabl == null) {
            this.zzabl = new zzkv() {
                @Override  // com.google.android.gms.internal.zzkv
                protected void colClear() {
                    zzks.this.clear();
                }

                @Override  // com.google.android.gms.internal.zzkv
                protected Object colGetEntry(int index, int offset) {
                    return zzks.this.mArray[(index << 1) + offset];
                }

                @Override  // com.google.android.gms.internal.zzkv
                protected Map colGetMap() {
                    return zzks.this;
                }

                @Override  // com.google.android.gms.internal.zzkv
                protected int colGetSize() {
                    return zzks.this.mSize;
                }

                @Override  // com.google.android.gms.internal.zzkv
                protected int colIndexOfKey(Object key) {
                    return key == null ? zzks.this.indexOfNull() : zzks.this.indexOf(key, key.hashCode());
                }

                @Override  // com.google.android.gms.internal.zzkv
                protected int colIndexOfValue(Object value) {
                    return zzks.this.indexOfValue(value);
                }

                @Override  // com.google.android.gms.internal.zzkv
                protected void colPut(Object object0, Object object1) {
                    zzks.this.put(object0, object1);
                }

                @Override  // com.google.android.gms.internal.zzkv
                protected void colRemoveAt(int index) {
                    zzks.this.removeAt(index);
                }

                @Override  // com.google.android.gms.internal.zzkv
                protected Object colSetValue(int index, Object object0) {
                    return zzks.this.setValueAt(index, object0);
                }
            };
        }
        return this.zzabl;
    }
}

