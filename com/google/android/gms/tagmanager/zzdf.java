package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class zzdf {
    private static Map zzaOA;
    private static zza zzaOB;
    private static final Object zzaOt;
    private static Long zzaOu;
    private static Double zzaOv;
    private static zzde zzaOw;
    private static String zzaOx;
    private static Boolean zzaOy;
    private static List zzaOz;

    static {
        zzdf.zzaOt = null;
        zzdf.zzaOu = new Long(0L);
        zzdf.zzaOv = new Double(0.0);
        zzdf.zzaOw = zzde.zzT(0L);
        zzdf.zzaOx = "";
        zzdf.zzaOy = new Boolean(false);
        zzdf.zzaOz = new ArrayList(0);
        zzdf.zzaOA = new HashMap();
        zzdf.zzaOB = zzdf.zzI("");
    }

    private static double getDouble(Object o) {
        if(o instanceof Number) {
            return ((Number)o).doubleValue();
        }
        zzbg.zzaz("getDouble received non-Number");
        return 0.0;
    }

    // 去混淆评级： 低(30)
    public static String zzD(Object object0) {
        return object0 == null ? "" : object0.toString();
    }

    public static zzde zzE(Object object0) {
        if(object0 instanceof zzde) {
            return (zzde)object0;
        }
        if(zzdf.zzK(object0)) {
            return zzde.zzT(zzdf.zzL(object0));
        }
        return zzdf.zzJ(object0) ? zzde.zza(zzdf.getDouble(object0)) : zzdf.zzeK(zzdf.zzD(object0));
    }

    // 去混淆评级： 低(20)
    public static Long zzF(Object object0) {
        return zzdf.zzK(object0) ? zzdf.zzL(object0) : zzdf.zzeL(zzdf.zzD(object0));
    }

    // 去混淆评级： 低(20)
    public static Double zzG(Object object0) {
        return zzdf.zzJ(object0) ? zzdf.getDouble(object0) : zzdf.zzeM(zzdf.zzD(object0));
    }

    // 去混淆评级： 低(20)
    public static Boolean zzH(Object object0) {
        return object0 instanceof Boolean ? ((Boolean)object0) : zzdf.zzeN(zzdf.zzD(object0));
    }

    public static zza zzI(Object object0) {
        boolean z = false;
        zza zzag$zza0 = new zza();
        if(object0 instanceof zza) {
            return (zza)object0;
        }
        if(object0 instanceof String) {
            zzag$zza0.type = 1;
            zzag$zza0.zziR = (String)object0;
            zzag$zza0.zzjb = z;
            return zzag$zza0;
        }
        if(object0 instanceof List) {
            zzag$zza0.type = 2;
            ArrayList arrayList0 = new ArrayList(((List)object0).size());
            boolean z1 = false;
            for(Object object1: ((List)object0)) {
                zza zzag$zza1 = zzdf.zzI(object1);
                if(zzag$zza1 == zzdf.zzaOB) {
                    return zzdf.zzaOB;
                }
                boolean z2 = z1 || zzag$zza1.zzjb;
                arrayList0.add(zzag$zza1);
                z1 = z2;
            }
            zzag$zza0.zziS = (zza[])arrayList0.toArray(new zza[0]);
            z = z1;
            zzag$zza0.zzjb = z;
            return zzag$zza0;
        }
        if(object0 instanceof Map) {
            zzag$zza0.type = 3;
            Set set0 = ((Map)object0).entrySet();
            ArrayList arrayList1 = new ArrayList(set0.size());
            ArrayList arrayList2 = new ArrayList(set0.size());
            boolean z3 = false;
            for(Object object2: set0) {
                zza zzag$zza2 = zzdf.zzI(((Map.Entry)object2).getKey());
                zza zzag$zza3 = zzdf.zzI(((Map.Entry)object2).getValue());
                if(zzag$zza2 == zzdf.zzaOB || zzag$zza3 == zzdf.zzaOB) {
                    return zzdf.zzaOB;
                }
                boolean z4 = z3 || zzag$zza2.zzjb || zzag$zza3.zzjb;
                arrayList1.add(zzag$zza2);
                arrayList2.add(zzag$zza3);
                z3 = z4;
            }
            zzag$zza0.zziT = (zza[])arrayList1.toArray(new zza[0]);
            zzag$zza0.zziU = (zza[])arrayList2.toArray(new zza[0]);
            z = z3;
            zzag$zza0.zzjb = z;
            return zzag$zza0;
        }
        if(zzdf.zzJ(object0)) {
            zzag$zza0.type = 1;
            zzag$zza0.zziR = object0.toString();
            zzag$zza0.zzjb = z;
            return zzag$zza0;
        }
        boolean z5 = false;
        if(zzdf.zzK(object0)) {
            z5 = true;
            zzag$zza0.type = 6;
            zzag$zza0.zziX = zzdf.zzL(object0);
        }
        else if(object0 instanceof Boolean) {
            z5 = true;
            zzag$zza0.type = 8;
            zzag$zza0.zziY = ((Boolean)object0).booleanValue();
        }
        if(z5) {
            zzag$zza0.zzjb = z;
            return zzag$zza0;
        }
        zzbg.zzaz(("Converting to Value from unknown object type: " + (object0 == null ? "null" : object0.getClass().toString())));
        return zzdf.zzaOB;
    }

    // 去混淆评级： 低(40)
    private static boolean zzJ(Object object0) {
        return object0 instanceof Double || object0 instanceof Float || object0 instanceof zzde && ((zzde)object0).zzzF();
    }

    // 去混淆评级： 中等(60)
    private static boolean zzK(Object object0) {
        return object0 instanceof Byte || object0 instanceof Short || object0 instanceof Integer || object0 instanceof Long || object0 instanceof zzde && ((zzde)object0).zzzG();
    }

    private static long zzL(Object object0) {
        if(object0 instanceof Number) {
            return ((Number)object0).longValue();
        }
        zzbg.zzaz("getInt64 received non-Number");
        return 0L;
    }

    public static zza zzeJ(String s) {
        zza zzag$zza0 = new zza();
        zzag$zza0.type = 5;
        zzag$zza0.zziW = s;
        return zzag$zza0;
    }

    private static zzde zzeK(String s) {
        try {
            return zzde.zzeI(s);
        }
        catch(NumberFormatException unused_ex) {
            zzbg.zzaz(("Failed to convert \'" + s + "\' to a number."));
            return zzdf.zzaOw;
        }
    }

    private static Long zzeL(String s) {
        zzde zzde0 = zzdf.zzeK(s);
        return zzde0 == zzdf.zzaOw ? zzdf.zzaOu : zzde0.longValue();
    }

    private static Double zzeM(String s) {
        zzde zzde0 = zzdf.zzeK(s);
        return zzde0 == zzdf.zzaOw ? zzdf.zzaOv : zzde0.doubleValue();
    }

    private static Boolean zzeN(String s) {
        if("true".equalsIgnoreCase(s)) {
            return true;
        }
        return "false".equalsIgnoreCase(s) ? false : zzdf.zzaOy;
    }

    public static String zzg(zza zzag$zza0) {
        return zzdf.zzD(zzdf.zzl(zzag$zza0));
    }

    public static zzde zzh(zza zzag$zza0) {
        return zzdf.zzE(zzdf.zzl(zzag$zza0));
    }

    public static Long zzi(zza zzag$zza0) {
        return zzdf.zzF(zzdf.zzl(zzag$zza0));
    }

    public static Double zzj(zza zzag$zza0) {
        return zzdf.zzG(zzdf.zzl(zzag$zza0));
    }

    public static Boolean zzk(zza zzag$zza0) {
        return zzdf.zzH(zzdf.zzl(zzag$zza0));
    }

    public static Object zzl(zza zzag$zza0) {
        int v = 0;
        if(zzag$zza0 == null) {
            return zzdf.zzaOt;
        }
        switch(zzag$zza0.type) {
            case 1: {
                return zzag$zza0.zziR;
            }
            case 2: {
                ArrayList arrayList0 = new ArrayList(zzag$zza0.zziS.length);
                zza[] arr_zzag$zza = zzag$zza0.zziS;
                while(v < arr_zzag$zza.length) {
                    Object object0 = zzdf.zzl(arr_zzag$zza[v]);
                    if(object0 == zzdf.zzaOt) {
                        return zzdf.zzaOt;
                    }
                    arrayList0.add(object0);
                    ++v;
                }
                return arrayList0;
            }
            case 3: {
                if(zzag$zza0.zziT.length != zzag$zza0.zziU.length) {
                    zzbg.zzaz(("Converting an invalid value to object: " + zzag$zza0.toString()));
                    return zzdf.zzaOt;
                }
                HashMap hashMap0 = new HashMap(zzag$zza0.zziU.length);
                while(v < zzag$zza0.zziT.length) {
                    Object object1 = zzdf.zzl(zzag$zza0.zziT[v]);
                    Object object2 = zzdf.zzl(zzag$zza0.zziU[v]);
                    if(object1 == zzdf.zzaOt || object2 == zzdf.zzaOt) {
                        return zzdf.zzaOt;
                    }
                    hashMap0.put(object1, object2);
                    ++v;
                }
                return hashMap0;
            }
            case 4: {
                zzbg.zzaz("Trying to convert a macro reference to object");
                return zzdf.zzaOt;
            }
            case 5: {
                zzbg.zzaz("Trying to convert a function id to object");
                return zzdf.zzaOt;
            }
            case 6: {
                return zzag$zza0.zziX;
            }
            case 7: {
                StringBuffer stringBuffer0 = new StringBuffer();
                zza[] arr_zzag$zza1 = zzag$zza0.zziZ;
                while(v < arr_zzag$zza1.length) {
                    String s = zzdf.zzg(arr_zzag$zza1[v]);
                    if(s == "") {
                        return zzdf.zzaOt;
                    }
                    stringBuffer0.append(s);
                    ++v;
                }
                return stringBuffer0.toString();
            }
            case 8: {
                return Boolean.valueOf(zzag$zza0.zziY);
            }
            default: {
                zzbg.zzaz(("Failed to convert a value of type: " + zzag$zza0.type));
                return zzdf.zzaOt;
            }
        }
    }

    public static Object zzzK() {
        return zzdf.zzaOt;
    }

    public static Long zzzL() {
        return zzdf.zzaOu;
    }

    public static Double zzzM() {
        return zzdf.zzaOv;
    }

    public static Boolean zzzN() {
        return zzdf.zzaOy;
    }

    public static zzde zzzO() {
        return zzdf.zzaOw;
    }

    public static String zzzP() [...] // Potential decryptor

    public static zza zzzQ() {
        return zzdf.zzaOB;
    }
}

