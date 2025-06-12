package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class zzrb {
    public static class zza {
        public final zzrc zzaVj;
        public final List zzaVk;

        public zza(zzrc zzrc0, List list0) {
            this.zzaVj = zzrc0;
            this.zzaVk = list0;
        }
    }

    private static int zza(String s, com.google.android.gms.internal.zzrc.zza.zza[] arr_zzrc$zza$zza) {
        int v1 = 14;
        for(int v = 0; v < arr_zzrc$zza$zza.length; ++v) {
            com.google.android.gms.internal.zzrc.zza.zza zzrc$zza$zza0 = arr_zzrc$zza$zza[v];
            if(v1 == 14) {
                switch(zzrc$zza$zza0.type) {
                    case 2: 
                    case 6: 
                    case 9: {
                        v1 = zzrc$zza$zza0.type;
                        break;
                    }
                    case 14: {
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unexpected TypedValue type: " + zzrc$zza$zza0.type + " for key " + s);
                    }
                }
            }
            else if(zzrc$zza$zza0.type != v1) {
                throw new IllegalArgumentException("The ArrayList elements should all be the same type, but ArrayList with key " + s + " contains items of type " + v1 + " and " + zzrc$zza$zza0.type);
            }
        }
        return v1;
    }

    static int zza(List list0, Asset asset0) {
        list0.add(asset0);
        return list0.size() - 1;
    }

    public static zza zza(DataMap dataMap0) {
        zzrc zzrc0 = new zzrc();
        ArrayList arrayList0 = new ArrayList();
        zzrc0.zzaVl = zzrb.zza(dataMap0, arrayList0);
        return new zza(zzrc0, arrayList0);
    }

    private static com.google.android.gms.internal.zzrc.zza.zza zza(List list0, Object object0) {
        int v4;
        com.google.android.gms.internal.zzrc.zza.zza zzrc$zza$zza0 = new com.google.android.gms.internal.zzrc.zza.zza();
        if(object0 == null) {
            zzrc$zza$zza0.type = 14;
            return zzrc$zza$zza0;
        }
        zzrc$zza$zza0.zzaVp = new com.google.android.gms.internal.zzrc.zza.zza.zza();
        if(object0 instanceof String) {
            zzrc$zza$zza0.type = 2;
            zzrc$zza$zza0.zzaVp.zzaVr = (String)object0;
            return zzrc$zza$zza0;
        }
        if(object0 instanceof Integer) {
            zzrc$zza$zza0.type = 6;
            zzrc$zza$zza0.zzaVp.zzaVv = (int)(((Integer)object0));
            return zzrc$zza$zza0;
        }
        if(object0 instanceof Long) {
            zzrc$zza$zza0.type = 5;
            zzrc$zza$zza0.zzaVp.zzaVu = (long)(((Long)object0));
            return zzrc$zza$zza0;
        }
        if(object0 instanceof Double) {
            zzrc$zza$zza0.type = 3;
            zzrc$zza$zza0.zzaVp.zzaVs = (double)(((Double)object0));
            return zzrc$zza$zza0;
        }
        if(object0 instanceof Float) {
            zzrc$zza$zza0.type = 4;
            zzrc$zza$zza0.zzaVp.zzaVt = (float)(((Float)object0));
            return zzrc$zza$zza0;
        }
        if(object0 instanceof Boolean) {
            zzrc$zza$zza0.type = 8;
            zzrc$zza$zza0.zzaVp.zzaVx = ((Boolean)object0).booleanValue();
            return zzrc$zza$zza0;
        }
        if(object0 instanceof Byte) {
            zzrc$zza$zza0.type = 7;
            zzrc$zza$zza0.zzaVp.zzaVw = (byte)(((Byte)object0));
            return zzrc$zza$zza0;
        }
        if(object0 instanceof byte[]) {
            zzrc$zza$zza0.type = 1;
            zzrc$zza$zza0.zzaVp.zzaVq = (byte[])object0;
            return zzrc$zza$zza0;
        }
        if(object0 instanceof String[]) {
            zzrc$zza$zza0.type = 11;
            zzrc$zza$zza0.zzaVp.zzaVA = (String[])object0;
            return zzrc$zza$zza0;
        }
        if(object0 instanceof long[]) {
            zzrc$zza$zza0.type = 12;
            zzrc$zza$zza0.zzaVp.zzaVB = (long[])object0;
            return zzrc$zza$zza0;
        }
        if(object0 instanceof float[]) {
            zzrc$zza$zza0.type = 15;
            zzrc$zza$zza0.zzaVp.zzaVC = (float[])object0;
            return zzrc$zza$zza0;
        }
        if(object0 instanceof Asset) {
            zzrc$zza$zza0.type = 13;
            com.google.android.gms.internal.zzrc.zza.zza.zza zzrc$zza$zza$zza0 = zzrc$zza$zza0.zzaVp;
            zzrc$zza$zza$zza0.zzaVD = (long)zzrb.zza(list0, ((Asset)object0));
            return zzrc$zza$zza0;
        }
        if(object0 instanceof DataMap) {
            zzrc$zza$zza0.type = 9;
            Set set0 = ((DataMap)object0).keySet();
            com.google.android.gms.internal.zzrc.zza[] arr_zzrc$zza = new com.google.android.gms.internal.zzrc.zza[set0.size()];
            int v = 0;
            for(Object object1: set0) {
                arr_zzrc$zza[v] = new com.google.android.gms.internal.zzrc.zza();
                arr_zzrc$zza[v].name = (String)object1;
                com.google.android.gms.internal.zzrc.zza zzrc$zza0 = arr_zzrc$zza[v];
                zzrc$zza0.zzaVn = zzrb.zza(list0, ((DataMap)object0).get(((String)object1)));
                ++v;
            }
            zzrc$zza$zza0.zzaVp.zzaVy = arr_zzrc$zza;
            return zzrc$zza$zza0;
        }
        if(!(object0 instanceof ArrayList)) {
            throw new RuntimeException("newFieldValueFromValue: unexpected value " + object0.getClass().getSimpleName());
        }
        zzrc$zza$zza0.type = 10;
        com.google.android.gms.internal.zzrc.zza.zza[] arr_zzrc$zza$zza = new com.google.android.gms.internal.zzrc.zza.zza[((ArrayList)object0).size()];
        int v1 = ((ArrayList)object0).size();
        int v2 = 0;
        int v3 = 14;
        for(Object object2 = null; v2 < v1; object2 = object3) {
            Object object3 = ((ArrayList)object0).get(v2);
            com.google.android.gms.internal.zzrc.zza.zza zzrc$zza$zza1 = zzrb.zza(list0, object3);
            if(zzrc$zza$zza1.type != 2 && zzrc$zza$zza1.type != 6 && zzrc$zza$zza1.type != 9 && zzrc$zza$zza1.type != 14) {
                throw new IllegalArgumentException("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a " + object3.getClass());
            }
            if(v3 != 14 || zzrc$zza$zza1.type == 14) {
                if(zzrc$zza$zza1.type != v3) {
                    throw new IllegalArgumentException("ArrayList elements must all be of the sameclass, but this one contains a " + object2.getClass() + " and a " + object3.getClass());
                }
                object3 = object2;
                v4 = v3;
            }
            else {
                v4 = zzrc$zza$zza1.type;
            }
            arr_zzrc$zza$zza[v2] = zzrc$zza$zza1;
            ++v2;
            v3 = v4;
        }
        zzrc$zza$zza0.zzaVp.zzaVz = arr_zzrc$zza$zza;
        return zzrc$zza$zza0;
    }

    public static DataMap zza(zza zzrb$zza0) {
        DataMap dataMap0 = new DataMap();
        com.google.android.gms.internal.zzrc.zza[] arr_zzrc$zza = zzrb$zza0.zzaVj.zzaVl;
        for(int v = 0; v < arr_zzrc$zza.length; ++v) {
            com.google.android.gms.internal.zzrc.zza zzrc$zza0 = arr_zzrc$zza[v];
            zzrb.zza(zzrb$zza0.zzaVk, dataMap0, zzrc$zza0.name, zzrc$zza0.zzaVn);
        }
        return dataMap0;
    }

    private static ArrayList zza(List list0, com.google.android.gms.internal.zzrc.zza.zza.zza zzrc$zza$zza$zza0, int v) {
        ArrayList arrayList0 = new ArrayList(zzrc$zza$zza$zza0.zzaVz.length);
        com.google.android.gms.internal.zzrc.zza.zza[] arr_zzrc$zza$zza = zzrc$zza$zza$zza0.zzaVz;
        for(int v1 = 0; v1 < arr_zzrc$zza$zza.length; ++v1) {
            com.google.android.gms.internal.zzrc.zza.zza zzrc$zza$zza0 = arr_zzrc$zza$zza[v1];
            if(zzrc$zza$zza0.type == 14) {
                arrayList0.add(null);
            }
            else {
                switch(v) {
                    case 2: {
                        arrayList0.add(zzrc$zza$zza0.zzaVp.zzaVr);
                        break;
                    }
                    case 6: {
                        arrayList0.add(zzrc$zza$zza0.zzaVp.zzaVv);
                        break;
                    }
                    case 9: {
                        DataMap dataMap0 = new DataMap();
                        com.google.android.gms.internal.zzrc.zza[] arr_zzrc$zza = zzrc$zza$zza0.zzaVp.zzaVy;
                        for(int v2 = 0; v2 < arr_zzrc$zza.length; ++v2) {
                            com.google.android.gms.internal.zzrc.zza zzrc$zza0 = arr_zzrc$zza[v2];
                            zzrb.zza(list0, dataMap0, zzrc$zza0.name, zzrc$zza0.zzaVn);
                        }
                        arrayList0.add(dataMap0);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unexpected typeOfArrayList: " + v);
                    }
                }
            }
        }
        return arrayList0;
    }

    private static void zza(List list0, DataMap dataMap0, String s, com.google.android.gms.internal.zzrc.zza.zza zzrc$zza$zza0) {
        int v = zzrc$zza$zza0.type;
        if(v == 14) {
            dataMap0.putString(s, null);
            return;
        }
        com.google.android.gms.internal.zzrc.zza.zza.zza zzrc$zza$zza$zza0 = zzrc$zza$zza0.zzaVp;
        switch(v) {
            case 1: {
                dataMap0.putByteArray(s, zzrc$zza$zza$zza0.zzaVq);
                return;
            }
            case 2: {
                dataMap0.putString(s, zzrc$zza$zza$zza0.zzaVr);
                return;
            }
            case 3: {
                dataMap0.putDouble(s, zzrc$zza$zza$zza0.zzaVs);
                return;
            }
            case 4: {
                dataMap0.putFloat(s, zzrc$zza$zza$zza0.zzaVt);
                return;
            }
            case 5: {
                dataMap0.putLong(s, zzrc$zza$zza$zza0.zzaVu);
                return;
            }
            case 6: {
                dataMap0.putInt(s, zzrc$zza$zza$zza0.zzaVv);
                return;
            }
            case 7: {
                dataMap0.putByte(s, ((byte)zzrc$zza$zza$zza0.zzaVw));
                return;
            }
            case 8: {
                dataMap0.putBoolean(s, zzrc$zza$zza$zza0.zzaVx);
                return;
            }
            case 9: {
                DataMap dataMap1 = new DataMap();
                com.google.android.gms.internal.zzrc.zza[] arr_zzrc$zza = zzrc$zza$zza$zza0.zzaVy;
                for(int v1 = 0; v1 < arr_zzrc$zza.length; ++v1) {
                    com.google.android.gms.internal.zzrc.zza zzrc$zza0 = arr_zzrc$zza[v1];
                    zzrb.zza(list0, dataMap1, zzrc$zza0.name, zzrc$zza0.zzaVn);
                }
                dataMap0.putDataMap(s, dataMap1);
                return;
            }
            case 10: {
                int v2 = zzrb.zza(s, zzrc$zza$zza$zza0.zzaVz);
                ArrayList arrayList0 = zzrb.zza(list0, zzrc$zza$zza$zza0, v2);
                if(v2 == 14) {
                    dataMap0.putStringArrayList(s, arrayList0);
                    return;
                }
                if(v2 == 9) {
                    dataMap0.putDataMapArrayList(s, arrayList0);
                    return;
                }
                if(v2 == 2) {
                    dataMap0.putStringArrayList(s, arrayList0);
                    return;
                }
                if(v2 != 6) {
                    throw new IllegalStateException("Unexpected typeOfArrayList: " + v2);
                }
                dataMap0.putIntegerArrayList(s, arrayList0);
                return;
            }
            case 11: {
                dataMap0.putStringArray(s, zzrc$zza$zza$zza0.zzaVA);
                return;
            }
            case 12: {
                dataMap0.putLongArray(s, zzrc$zza$zza$zza0.zzaVB);
                return;
            }
            case 13: {
                if(list0 == null) {
                    throw new RuntimeException("populateBundle: unexpected type for: " + s);
                }
                dataMap0.putAsset(s, ((Asset)list0.get(((int)zzrc$zza$zza$zza0.zzaVD))));
                return;
            }
            case 15: {
                dataMap0.putFloatArray(s, zzrc$zza$zza$zza0.zzaVC);
                return;
            }
            default: {
                throw new RuntimeException("populateBundle: unexpected type " + v);
            }
        }
    }

    private static com.google.android.gms.internal.zzrc.zza[] zza(DataMap dataMap0, List list0) {
        Set set0 = dataMap0.keySet();
        com.google.android.gms.internal.zzrc.zza[] arr_zzrc$zza = new com.google.android.gms.internal.zzrc.zza[set0.size()];
        int v = 0;
        for(Object object0: set0) {
            Object object1 = dataMap0.get(((String)object0));
            arr_zzrc$zza[v] = new com.google.android.gms.internal.zzrc.zza();
            arr_zzrc$zza[v].name = (String)object0;
            com.google.android.gms.internal.zzrc.zza zzrc$zza0 = arr_zzrc$zza[v];
            zzrc$zza0.zzaVn = zzrb.zza(list0, object1);
            ++v;
        }
        return arr_zzrc$zza;
    }
}

