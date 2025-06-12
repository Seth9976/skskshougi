package com.google.android.gms.wearable;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.zzrb.zza;
import com.google.android.gms.internal.zzrb;
import com.google.android.gms.internal.zzrc;
import com.google.android.gms.internal.zzrm;
import com.google.android.gms.internal.zzrn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class DataMap {
    public static final String TAG = "DataMap";
    private final HashMap zzaSU;

    public DataMap() {
        this.zzaSU = new HashMap();
    }

    public static ArrayList arrayListFromBundleArrayList(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            arrayList1.add(DataMap.fromBundle(((Bundle)object0)));
        }
        return arrayList1;
    }

    public void clear() {
        this.zzaSU.clear();
    }

    public boolean containsKey(String key) {
        return this.zzaSU.containsKey(key);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof DataMap ? DataMap.zza(this, ((DataMap)o)) : false;
    }

    public static DataMap fromBundle(Bundle bundle) {
        bundle.setClassLoader(Asset.class.getClassLoader());
        DataMap dataMap0 = new DataMap();
        for(Object object0: bundle.keySet()) {
            DataMap.zza(dataMap0, ((String)object0), bundle.get(((String)object0)));
        }
        return dataMap0;
    }

    public static DataMap fromByteArray(byte[] bytes) {
        try {
            return zzrb.zza(new zza(zzrc.zzw(bytes), new ArrayList()));
        }
        catch(zzrm zzrm0) {
            throw new IllegalArgumentException("Unable to convert data", zzrm0);
        }
    }

    public Object get(String key) {
        return this.zzaSU.get(key);
    }

    public Asset getAsset(String key) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return null;
        }
        try {
            return (Asset)object0;
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "Asset", classCastException0);
            return null;
        }
    }

    public boolean getBoolean(String key) {
        return this.getBoolean(key, false);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return defaultValue;
        }
        try {
            return ((Boolean)object0).booleanValue();
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "Boolean", Boolean.valueOf(defaultValue), classCastException0);
            return defaultValue;
        }
    }

    public byte getByte(String key) {
        return this.getByte(key, 0);
    }

    public byte getByte(String key, byte defaultValue) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return defaultValue;
        }
        try {
            return (byte)(((Byte)object0));
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "Byte", defaultValue, classCastException0);
            return defaultValue;
        }
    }

    public byte[] getByteArray(String key) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return null;
        }
        try {
            return (byte[])object0;
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "byte[]", classCastException0);
            return null;
        }
    }

    public DataMap getDataMap(String key) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return null;
        }
        try {
            return (DataMap)object0;
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "DataMap", classCastException0);
            return null;
        }
    }

    public ArrayList getDataMapArrayList(String key) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return null;
        }
        try {
            return (ArrayList)object0;
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "ArrayList<DataMap>", classCastException0);
            return null;
        }
    }

    public double getDouble(String key) {
        return this.getDouble(key, 0.0);
    }

    public double getDouble(String key, double defaultValue) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return defaultValue;
        }
        try {
            return (double)(((Double)object0));
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "Double", defaultValue, classCastException0);
            return defaultValue;
        }
    }

    public float getFloat(String key) {
        return this.getFloat(key, 0.0f);
    }

    public float getFloat(String key, float defaultValue) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return defaultValue;
        }
        try {
            return (float)(((Float)object0));
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "Float", defaultValue, classCastException0);
            return defaultValue;
        }
    }

    public float[] getFloatArray(String key) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return null;
        }
        try {
            return (float[])object0;
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "float[]", classCastException0);
            return null;
        }
    }

    public int getInt(String key) {
        return this.getInt(key, 0);
    }

    public int getInt(String key, int defaultValue) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return defaultValue;
        }
        try {
            return (int)(((Integer)object0));
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "Integer", classCastException0);
            return defaultValue;
        }
    }

    public ArrayList getIntegerArrayList(String key) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return null;
        }
        try {
            return (ArrayList)object0;
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "ArrayList<Integer>", classCastException0);
            return null;
        }
    }

    public long getLong(String key) {
        return this.getLong(key, 0L);
    }

    public long getLong(String key, long defaultValue) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return defaultValue;
        }
        try {
            return (long)(((Long)object0));
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "long", classCastException0);
            return defaultValue;
        }
    }

    public long[] getLongArray(String key) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return null;
        }
        try {
            return (long[])object0;
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "long[]", classCastException0);
            return null;
        }
    }

    public String getString(String key) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return null;
        }
        try {
            return (String)object0;
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "String", classCastException0);
            return null;
        }
    }

    public String getString(String key, String defaultValue) {
        String s2 = this.getString(key);
        return s2 == null ? defaultValue : s2;
    }

    public String[] getStringArray(String key) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return null;
        }
        try {
            return (String[])object0;
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "String[]", classCastException0);
            return null;
        }
    }

    public ArrayList getStringArrayList(String key) {
        Object object0 = this.zzaSU.get(key);
        if(object0 == null) {
            return null;
        }
        try {
            return (ArrayList)object0;
        }
        catch(ClassCastException classCastException0) {
            this.zza(key, object0, "ArrayList<String>", classCastException0);
            return null;
        }
    }

    @Override
    public int hashCode() {
        return this.zzaSU.hashCode() * 29;
    }

    public boolean isEmpty() {
        return this.zzaSU.isEmpty();
    }

    public Set keySet() {
        return this.zzaSU.keySet();
    }

    public void putAll(DataMap dataMap) {
        for(Object object0: dataMap.keySet()) {
            Object object1 = dataMap.get(((String)object0));
            this.zzaSU.put(((String)object0), object1);
        }
    }

    public void putAsset(String key, Asset value) {
        this.zzaSU.put(key, value);
    }

    public void putBoolean(String key, boolean value) {
        this.zzaSU.put(key, Boolean.valueOf(value));
    }

    public void putByte(String key, byte value) {
        this.zzaSU.put(key, value);
    }

    public void putByteArray(String key, byte[] value) {
        this.zzaSU.put(key, value);
    }

    public void putDataMap(String key, DataMap value) {
        this.zzaSU.put(key, value);
    }

    public void putDataMapArrayList(String key, ArrayList arrayList0) {
        this.zzaSU.put(key, arrayList0);
    }

    public void putDouble(String key, double value) {
        this.zzaSU.put(key, value);
    }

    public void putFloat(String key, float value) {
        this.zzaSU.put(key, value);
    }

    public void putFloatArray(String key, float[] value) {
        this.zzaSU.put(key, value);
    }

    public void putInt(String key, int value) {
        this.zzaSU.put(key, value);
    }

    public void putIntegerArrayList(String key, ArrayList arrayList0) {
        this.zzaSU.put(key, arrayList0);
    }

    public void putLong(String key, long value) {
        this.zzaSU.put(key, value);
    }

    public void putLongArray(String key, long[] value) {
        this.zzaSU.put(key, value);
    }

    public void putString(String key, String value) {
        this.zzaSU.put(key, value);
    }

    public void putStringArray(String key, String[] value) {
        this.zzaSU.put(key, value);
    }

    public void putStringArrayList(String key, ArrayList arrayList0) {
        this.zzaSU.put(key, arrayList0);
    }

    public Object remove(String key) {
        return this.zzaSU.remove(key);
    }

    public int size() {
        return this.zzaSU.size();
    }

    public Bundle toBundle() {
        Bundle bundle0 = new Bundle();
        for(Object object0: this.zzaSU.keySet()) {
            DataMap.zza(bundle0, ((String)object0), this.zzaSU.get(((String)object0)));
        }
        return bundle0;
    }

    public byte[] toByteArray() {
        return zzrn.zzf(zzrb.zza(this).zzaVj);
    }

    @Override
    public String toString() {
        return this.zzaSU.toString();
    }

    private static void zza(Bundle bundle0, String s, Object object0) {
        if(object0 instanceof String) {
            bundle0.putString(s, ((String)object0));
            return;
        }
        if(object0 instanceof Integer) {
            bundle0.putInt(s, ((int)(((Integer)object0))));
            return;
        }
        if(object0 instanceof Long) {
            bundle0.putLong(s, ((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof Double) {
            bundle0.putDouble(s, ((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof Float) {
            bundle0.putFloat(s, ((float)(((Float)object0))));
            return;
        }
        if(object0 instanceof Boolean) {
            bundle0.putBoolean(s, ((Boolean)object0).booleanValue());
            return;
        }
        if(object0 instanceof Byte) {
            bundle0.putByte(s, ((byte)(((Byte)object0))));
            return;
        }
        if(object0 instanceof byte[]) {
            bundle0.putByteArray(s, ((byte[])object0));
            return;
        }
        if(object0 instanceof String[]) {
            bundle0.putStringArray(s, ((String[])object0));
            return;
        }
        if(object0 instanceof long[]) {
            bundle0.putLongArray(s, ((long[])object0));
            return;
        }
        if(object0 instanceof float[]) {
            bundle0.putFloatArray(s, ((float[])object0));
            return;
        }
        if(object0 instanceof Asset) {
            bundle0.putParcelable(s, ((Asset)object0));
            return;
        }
        if(object0 instanceof DataMap) {
            bundle0.putParcelable(s, ((DataMap)object0).toBundle());
            return;
        }
        if(object0 instanceof ArrayList) {
            switch(DataMap.zzd(((ArrayList)object0))) {
                case 0: {
                    bundle0.putStringArrayList(s, ((ArrayList)object0));
                    return;
                }
                case 1: {
                    bundle0.putStringArrayList(s, ((ArrayList)object0));
                    return;
                }
                case 2: {
                    bundle0.putIntegerArrayList(s, ((ArrayList)object0));
                    return;
                }
                case 3: {
                    bundle0.putStringArrayList(s, ((ArrayList)object0));
                    return;
                }
                case 4: {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object1: ((ArrayList)object0)) {
                        arrayList0.add(((DataMap)object1).toBundle());
                    }
                    bundle0.putParcelableArrayList(s, arrayList0);
                }
            }
        }
    }

    private static void zza(DataMap dataMap0, String s, Object object0) {
        if(object0 instanceof String) {
            dataMap0.putString(s, ((String)object0));
            return;
        }
        if(object0 instanceof Integer) {
            dataMap0.putInt(s, ((int)(((Integer)object0))));
            return;
        }
        if(object0 instanceof Long) {
            dataMap0.putLong(s, ((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof Double) {
            dataMap0.putDouble(s, ((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof Float) {
            dataMap0.putFloat(s, ((float)(((Float)object0))));
            return;
        }
        if(object0 instanceof Boolean) {
            dataMap0.putBoolean(s, ((Boolean)object0).booleanValue());
            return;
        }
        if(object0 instanceof Byte) {
            dataMap0.putByte(s, ((byte)(((Byte)object0))));
            return;
        }
        if(object0 instanceof byte[]) {
            dataMap0.putByteArray(s, ((byte[])object0));
            return;
        }
        if(object0 instanceof String[]) {
            dataMap0.putStringArray(s, ((String[])object0));
            return;
        }
        if(object0 instanceof long[]) {
            dataMap0.putLongArray(s, ((long[])object0));
            return;
        }
        if(object0 instanceof float[]) {
            dataMap0.putFloatArray(s, ((float[])object0));
            return;
        }
        if(object0 instanceof Asset) {
            dataMap0.putAsset(s, ((Asset)object0));
            return;
        }
        if(object0 instanceof Bundle) {
            dataMap0.putDataMap(s, DataMap.fromBundle(((Bundle)object0)));
            return;
        }
        if(object0 instanceof ArrayList) {
            switch(DataMap.zzd(((ArrayList)object0))) {
                case 0: {
                    dataMap0.putStringArrayList(s, ((ArrayList)object0));
                    return;
                }
                case 1: {
                    dataMap0.putStringArrayList(s, ((ArrayList)object0));
                    return;
                }
                case 2: {
                    dataMap0.putIntegerArrayList(s, ((ArrayList)object0));
                    return;
                }
                case 3: {
                    dataMap0.putStringArrayList(s, ((ArrayList)object0));
                    return;
                }
                case 5: {
                    dataMap0.putDataMapArrayList(s, DataMap.arrayListFromBundleArrayList(((ArrayList)object0)));
                }
            }
        }
    }

    private void zza(String s, Object object0, String s1, ClassCastException classCastException0) {
        this.zza(s, object0, s1, "<null>", classCastException0);
    }

    private void zza(String s, Object object0, String s1, Object object1, ClassCastException classCastException0) {
        Log.w("DataMap", "Key " + s + " expected " + s1 + " but value was a " + object0.getClass().getName() + ".  The default value " + object1 + " was returned.");
        Log.w("DataMap", "Attempt to cast generated internal exception:", classCastException0);
    }

    private static boolean zza(Asset asset0, Asset asset1) {
        if(asset0 == null || asset1 == null) {
            return asset0 == asset1;
        }
        return TextUtils.isEmpty(asset0.getDigest()) ? Arrays.equals(asset0.getData(), asset1.getData()) : asset0.getDigest().equals(asset1.getDigest());
    }

    private static boolean zza(DataMap dataMap0, DataMap dataMap1) {
        if(dataMap0.size() != dataMap1.size()) {
            return false;
        }
        for(Object object0: dataMap0.keySet()) {
            Object object1 = dataMap0.get(((String)object0));
            Object object2 = dataMap1.get(((String)object0));
            if(object1 instanceof Asset) {
                if(object2 instanceof Asset && DataMap.zza(((Asset)object1), ((Asset)object2))) {
                    continue;
                }
                return false;
            }
            if(object1 instanceof String[]) {
                if(object2 instanceof String[] && Arrays.equals(((String[])object1), ((String[])object2))) {
                    continue;
                }
                return false;
            }
            if(object1 instanceof long[]) {
                if(object2 instanceof long[] && Arrays.equals(((long[])object1), ((long[])object2))) {
                    continue;
                }
                return false;
            }
            if(object1 instanceof float[]) {
                if(object2 instanceof float[] && Arrays.equals(((float[])object1), ((float[])object2))) {
                    continue;
                }
                return false;
            }
            if(object1 instanceof byte[]) {
                if(object2 instanceof byte[] && Arrays.equals(((byte[])object1), ((byte[])object2))) {
                    continue;
                }
                return false;
            }
            if(object1 == null || object2 == null) {
                return object1 == object2;
            }
            if(!object1.equals(object2)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private static int zzd(ArrayList arrayList0) {
        if(arrayList0.isEmpty()) {
            return 0;
        }
        for(Object object0: arrayList0) {
            if(object0 != null) {
                if(object0 instanceof Integer) {
                    return 2;
                }
                if(object0 instanceof String) {
                    return 3;
                }
                if(object0 instanceof DataMap) {
                    return 4;
                }
                if(object0 instanceof Bundle) {
                    return 5;
                }
                if(false) {
                    break;
                }
            }
        }
        return 1;
    }
}

