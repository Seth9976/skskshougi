package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

abstract class zzkv {
    final class zza implements Iterator {
        boolean mCanRemove;
        int mIndex;
        final int mOffset;
        int mSize;
        final zzkv zzabx;

        zza(int v) {
            this.mCanRemove = false;
            this.mOffset = v;
            this.mSize = zzkv0.colGetSize();
        }

        @Override
        public boolean hasNext() {
            return this.mIndex < this.mSize;
        }

        @Override
        public Object next() {
            Object object0 = zzkv.this.colGetEntry(this.mIndex, this.mOffset);
            ++this.mIndex;
            this.mCanRemove = true;
            return object0;
        }

        @Override
        public void remove() {
            if(!this.mCanRemove) {
                throw new IllegalStateException();
            }
            --this.mIndex;
            --this.mSize;
            this.mCanRemove = false;
            zzkv.this.colRemoveAt(this.mIndex);
        }
    }

    final class zzb implements Set {
        final zzkv zzabx;

        @Override
        public boolean add(Object x0) {
            return this.add(((Map.Entry)x0));
        }

        public boolean add(Map.Entry map$Entry0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection collection0) {
            int v = zzkv.this.colGetSize();
            for(Object object0: collection0) {
                Object object1 = ((Map.Entry)object0).getKey();
                Object object2 = ((Map.Entry)object0).getValue();
                zzkv.this.colPut(object1, object2);
            }
            return v != zzkv.this.colGetSize();
        }

        @Override
        public void clear() {
            zzkv.this.colClear();
        }

        @Override
        public boolean contains(Object o) {
            if(!(o instanceof Map.Entry)) {
                return false;
            }
            Object object1 = ((Map.Entry)o).getKey();
            int v = zzkv.this.colIndexOfKey(object1);
            return v < 0 ? false : zzkt.equal(zzkv.this.colGetEntry(v, 1), ((Map.Entry)o).getValue());
        }

        @Override
        public boolean containsAll(Collection collection0) {
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override
        public boolean equals(Object object) {
            return zzkv.equalsSetHelper(this, object);
        }

        @Override
        public int hashCode() {
            int v = zzkv.this.colGetSize() - 1;
            int v1;
            for(v1 = 0; v >= 0; v1 += (object1 == null ? 0 : object1.hashCode()) ^ (object0 == null ? 0 : object0.hashCode())) {
                Object object0 = zzkv.this.colGetEntry(v, 0);
                Object object1 = zzkv.this.colGetEntry(v, 1);
                --v;
            }
            return v1;
        }

        @Override
        public boolean isEmpty() {
            return zzkv.this.colGetSize() == 0;
        }

        @Override
        public Iterator iterator() {
            return new zzd(zzkv.this);
        }

        @Override
        public boolean remove(Object object) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean removeAll(Collection collection0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean retainAll(Collection collection0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int size() {
            return zzkv.this.colGetSize();
        }

        @Override
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            throw new UnsupportedOperationException();
        }
    }

    final class zzc implements Set {
        final zzkv zzabx;

        @Override
        public boolean add(Object object0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection collection0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            zzkv.this.colClear();
        }

        @Override
        public boolean contains(Object object) {
            return zzkv.this.colIndexOfKey(object) >= 0;
        }

        @Override
        public boolean containsAll(Collection collection0) {
            return zzkv.containsAllHelper(zzkv.this.colGetMap(), collection0);
        }

        @Override
        public boolean equals(Object object) {
            return zzkv.equalsSetHelper(this, object);
        }

        @Override
        public int hashCode() {
            int v = zzkv.this.colGetSize() - 1;
            int v1 = 0;
            while(v >= 0) {
                Object object0 = zzkv.this.colGetEntry(v, 0);
                v1 += (object0 == null ? 0 : object0.hashCode());
                --v;
            }
            return v1;
        }

        @Override
        public boolean isEmpty() {
            return zzkv.this.colGetSize() == 0;
        }

        @Override
        public Iterator iterator() {
            return new zza(zzkv.this, 0);
        }

        @Override
        public boolean remove(Object object) {
            int v = zzkv.this.colIndexOfKey(object);
            if(v >= 0) {
                zzkv.this.colRemoveAt(v);
                return true;
            }
            return false;
        }

        @Override
        public boolean removeAll(Collection collection0) {
            return zzkv.removeAllHelper(zzkv.this.colGetMap(), collection0);
        }

        @Override
        public boolean retainAll(Collection collection0) {
            return zzkv.retainAllHelper(zzkv.this.colGetMap(), collection0);
        }

        @Override
        public int size() {
            return zzkv.this.colGetSize();
        }

        @Override
        public Object[] toArray() {
            return zzkv.this.toArrayHelper(0);
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            return zzkv.this.toArrayHelper(arr_object, 0);
        }
    }

    final class zzd implements Iterator, Map.Entry {
        int mEnd;
        boolean mEntryValid;
        int mIndex;
        final zzkv zzabx;

        zzd() {
            this.mEntryValid = false;
            this.mEnd = zzkv0.colGetSize() - 1;
            this.mIndex = -1;
        }

        @Override
        public final boolean equals(Object o) {
            if(!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return o instanceof Map.Entry ? zzkt.equal(((Map.Entry)o).getKey(), zzkv.this.colGetEntry(this.mIndex, 0)) && zzkt.equal(((Map.Entry)o).getValue(), zzkv.this.colGetEntry(this.mIndex, 1)) : false;
        }

        @Override
        public Object getKey() {
            if(!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return zzkv.this.colGetEntry(this.mIndex, 0);
        }

        @Override
        public Object getValue() {
            if(!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return zzkv.this.colGetEntry(this.mIndex, 1);
        }

        @Override
        public boolean hasNext() {
            return this.mIndex < this.mEnd;
        }

        @Override
        public final int hashCode() {
            if(!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object object0 = zzkv.this.colGetEntry(this.mIndex, 0);
            Object object1 = zzkv.this.colGetEntry(this.mIndex, 1);
            if(object0 == null) {
                return object1 == null ? 0 : object1.hashCode();
            }
            int v = object0.hashCode();
            return object1 == null ? v : object1.hashCode() ^ v;
        }

        @Override
        public Object next() {
            return this.next();
        }

        public Map.Entry next() {
            ++this.mIndex;
            this.mEntryValid = true;
            return this;
        }

        @Override
        public void remove() {
            if(!this.mEntryValid) {
                throw new IllegalStateException();
            }
            zzkv.this.colRemoveAt(this.mIndex);
            --this.mIndex;
            --this.mEnd;
            this.mEntryValid = false;
        }

        @Override
        public Object setValue(Object object0) {
            if(!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return zzkv.this.colSetValue(this.mIndex, object0);
        }

        @Override
        public final String toString() {
            return this.getKey() + "=" + this.getValue();
        }
    }

    final class zze implements Collection {
        final zzkv zzabx;

        @Override
        public boolean add(Object object0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection collection0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            zzkv.this.colClear();
        }

        @Override
        public boolean contains(Object object) {
            return zzkv.this.colIndexOfValue(object) >= 0;
        }

        @Override
        public boolean containsAll(Collection collection0) {
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override
        public boolean isEmpty() {
            return zzkv.this.colGetSize() == 0;
        }

        @Override
        public Iterator iterator() {
            return new zza(zzkv.this, 1);
        }

        @Override
        public boolean remove(Object object) {
            int v = zzkv.this.colIndexOfValue(object);
            if(v >= 0) {
                zzkv.this.colRemoveAt(v);
                return true;
            }
            return false;
        }

        @Override
        public boolean removeAll(Collection collection0) {
            int v1 = zzkv.this.colGetSize();
            boolean z = false;
            for(int v = 0; v < v1; ++v) {
                if(collection0.contains(zzkv.this.colGetEntry(v, 1))) {
                    zzkv.this.colRemoveAt(v);
                    --v;
                    --v1;
                    z = true;
                }
            }
            return z;
        }

        @Override
        public boolean retainAll(Collection collection0) {
            int v1 = zzkv.this.colGetSize();
            boolean z = false;
            for(int v = 0; v < v1; ++v) {
                if(!collection0.contains(zzkv.this.colGetEntry(v, 1))) {
                    zzkv.this.colRemoveAt(v);
                    --v;
                    --v1;
                    z = true;
                }
            }
            return z;
        }

        @Override
        public int size() {
            return zzkv.this.colGetSize();
        }

        @Override
        public Object[] toArray() {
            return zzkv.this.toArrayHelper(1);
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            return zzkv.this.toArrayHelper(arr_object, 1);
        }
    }

    zzb zzabu;
    zzc zzabv;
    zze zzabw;

    protected abstract void colClear();

    protected abstract Object colGetEntry(int arg1, int arg2);

    protected abstract Map colGetMap();

    protected abstract int colGetSize();

    protected abstract int colIndexOfKey(Object arg1);

    protected abstract int colIndexOfValue(Object arg1);

    protected abstract void colPut(Object arg1, Object arg2);

    protected abstract void colRemoveAt(int arg1);

    protected abstract Object colSetValue(int arg1, Object arg2);

    public static boolean containsAllHelper(Map map0, Collection collection0) {
        for(Object object0: collection0) {
            if(!map0.containsKey(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static boolean equalsSetHelper(Set set0, Object object) {
        if(set0 == object) {
            return true;
        }
        if(object instanceof Set) {
            Set set1 = (Set)object;
            try {
                if(set0.size() == set1.size() && set0.containsAll(set1)) {
                    return true;
                }
            }
            catch(NullPointerException unused_ex) {
            }
            catch(ClassCastException unused_ex) {
            }
            return false;
        }
        return false;
    }

    public Set getEntrySet() {
        if(this.zzabu == null) {
            this.zzabu = new zzb(this);
        }
        return this.zzabu;
    }

    public Set getKeySet() {
        if(this.zzabv == null) {
            this.zzabv = new zzc(this);
        }
        return this.zzabv;
    }

    public Collection getValues() {
        if(this.zzabw == null) {
            this.zzabw = new zze(this);
        }
        return this.zzabw;
    }

    public static boolean removeAllHelper(Map map0, Collection collection0) {
        int v = map0.size();
        for(Object object0: collection0) {
            map0.remove(object0);
        }
        return v != map0.size();
    }

    public static boolean retainAllHelper(Map map0, Collection collection0) {
        int v = map0.size();
        Iterator iterator0 = map0.keySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!collection0.contains(object0)) {
                iterator0.remove();
            }
        }
        return v != map0.size();
    }

    public Object[] toArrayHelper(int offset) {
        int v1 = this.colGetSize();
        Object[] arr_object = new Object[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v2] = this.colGetEntry(v2, offset);
        }
        return arr_object;
    }

    public Object[] toArrayHelper(Object[] arr_object, int offset) {
        int v1 = this.colGetSize();
        if(arr_object.length < v1) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v1);
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v2] = this.colGetEntry(v2, offset);
        }
        if(arr_object.length > v1) {
            arr_object[v1] = null;
        }
        return arr_object;
    }
}

