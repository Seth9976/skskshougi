package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbg;
import com.google.android.gms.tagmanager.zzdf;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class zzqf {
    public static class zza {
        private final com.google.android.gms.internal.zzag.zza zzaNw;
        private final Map zzaPy;

        private zza(Map map0, com.google.android.gms.internal.zzag.zza zzag$zza0) {
            this.zzaPy = map0;
            this.zzaNw = zzag$zza0;
        }

        zza(Map map0, com.google.android.gms.internal.zzag.zza zzag$zza0, com.google.android.gms.internal.zzqf.1 zzqf$10) {
            this(map0, zzag$zza0);
        }

        @Override
        public String toString() {
            return "Properties: " + this.zzAn() + " pushAfterEvaluate: " + this.zzaNw;
        }

        public static zzb zzAm() {
            return new zzb(null);
        }

        public Map zzAn() {
            return Collections.unmodifiableMap(this.zzaPy);
        }

        public void zza(String s, com.google.android.gms.internal.zzag.zza zzag$zza0) {
            this.zzaPy.put(s, zzag$zza0);
        }

        public com.google.android.gms.internal.zzag.zza zzzs() {
            return this.zzaNw;
        }
    }

    public static class zzb {
        private com.google.android.gms.internal.zzag.zza zzaNw;
        private final Map zzaPy;

        private zzb() {
            this.zzaPy = new HashMap();
        }

        zzb(com.google.android.gms.internal.zzqf.1 zzqf$10) {
        }

        public zza zzAo() {
            return new zza(this.zzaPy, this.zzaNw, null);
        }

        public zzb zzb(String s, com.google.android.gms.internal.zzag.zza zzag$zza0) {
            this.zzaPy.put(s, zzag$zza0);
            return this;
        }

        public zzb zzq(com.google.android.gms.internal.zzag.zza zzag$zza0) {
            this.zzaNw = zzag$zza0;
            return this;
        }
    }

    public static class zzc {
        private final String zzTQ;
        private final Map zzaPA;
        private final int zzaPB;
        private final List zzaPz;

        private zzc(List list0, Map map0, String s, int v) {
            this.zzaPz = Collections.unmodifiableList(list0);
            this.zzaPA = Collections.unmodifiableMap(map0);
            this.zzTQ = s;
            this.zzaPB = v;
        }

        zzc(List list0, Map map0, String s, int v, com.google.android.gms.internal.zzqf.1 zzqf$10) {
            this(list0, map0, s, v);
        }

        public String getVersion() {
            return this.zzTQ;
        }

        @Override
        public String toString() {
            return "Rules: " + this.zzAq() + "  Macros: " + this.zzaPA;
        }

        public static zzd zzAp() {
            return new zzd(null);
        }

        public List zzAq() {
            return this.zzaPz;
        }

        public Map zzAr() {
            return this.zzaPA;
        }
    }

    public static class zzd {
        private String zzTQ;
        private final Map zzaPA;
        private int zzaPB;
        private final List zzaPz;

        private zzd() {
            this.zzaPz = new ArrayList();
            this.zzaPA = new HashMap();
            this.zzTQ = "";
            this.zzaPB = 0;
        }

        zzd(com.google.android.gms.internal.zzqf.1 zzqf$10) {
        }

        public zzc zzAs() {
            return new zzc(this.zzaPz, this.zzaPA, this.zzTQ, this.zzaPB, null);
        }

        public zzd zzb(zze zzqf$zze0) {
            this.zzaPz.add(zzqf$zze0);
            return this;
        }

        public zzd zzc(zza zzqf$zza0) {
            String s = zzdf.zzg(((com.google.android.gms.internal.zzag.zza)zzqf$zza0.zzAn().get("instance_name")));
            List list0 = (List)this.zzaPA.get(s);
            if(list0 == null) {
                list0 = new ArrayList();
                this.zzaPA.put(s, list0);
            }
            list0.add(zzqf$zza0);
            return this;
        }

        public zzd zzeV(String s) {
            this.zzTQ = s;
            return this;
        }

        public zzd zzjb(int v) {
            this.zzaPB = v;
            return this;
        }
    }

    public static class zze {
        private final List zzaPC;
        private final List zzaPD;
        private final List zzaPE;
        private final List zzaPF;
        private final List zzaPG;
        private final List zzaPH;
        private final List zzaPI;
        private final List zzaPJ;
        private final List zzaPK;
        private final List zzaPL;

        private zze(List list0, List list1, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9) {
            this.zzaPC = Collections.unmodifiableList(list0);
            this.zzaPD = Collections.unmodifiableList(list1);
            this.zzaPE = Collections.unmodifiableList(list2);
            this.zzaPF = Collections.unmodifiableList(list3);
            this.zzaPG = Collections.unmodifiableList(list4);
            this.zzaPH = Collections.unmodifiableList(list5);
            this.zzaPI = Collections.unmodifiableList(list6);
            this.zzaPJ = Collections.unmodifiableList(list7);
            this.zzaPK = Collections.unmodifiableList(list8);
            this.zzaPL = Collections.unmodifiableList(list9);
        }

        zze(List list0, List list1, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, com.google.android.gms.internal.zzqf.1 zzqf$10) {
            this(list0, list1, list2, list3, list4, list5, list6, list7, list8, list9);
        }

        @Override
        public String toString() {
            return "Positive predicates: " + this.zzAu() + "  Negative predicates: " + this.zzAv() + "  Add tags: " + this.zzAw() + "  Remove tags: " + this.zzAx() + "  Add macros: " + this.zzAy() + "  Remove macros: " + this.zzAD();
        }

        public List zzAA() {
            return this.zzaPJ;
        }

        public List zzAB() {
            return this.zzaPK;
        }

        public List zzAC() {
            return this.zzaPL;
        }

        public List zzAD() {
            return this.zzaPH;
        }

        public static zzf zzAt() {
            return new zzf(null);
        }

        public List zzAu() {
            return this.zzaPC;
        }

        public List zzAv() {
            return this.zzaPD;
        }

        public List zzAw() {
            return this.zzaPE;
        }

        public List zzAx() {
            return this.zzaPF;
        }

        public List zzAy() {
            return this.zzaPG;
        }

        public List zzAz() {
            return this.zzaPI;
        }
    }

    public static class zzf {
        private final List zzaPC;
        private final List zzaPD;
        private final List zzaPE;
        private final List zzaPF;
        private final List zzaPG;
        private final List zzaPH;
        private final List zzaPI;
        private final List zzaPJ;
        private final List zzaPK;
        private final List zzaPL;

        private zzf() {
            this.zzaPC = new ArrayList();
            this.zzaPD = new ArrayList();
            this.zzaPE = new ArrayList();
            this.zzaPF = new ArrayList();
            this.zzaPG = new ArrayList();
            this.zzaPH = new ArrayList();
            this.zzaPI = new ArrayList();
            this.zzaPJ = new ArrayList();
            this.zzaPK = new ArrayList();
            this.zzaPL = new ArrayList();
        }

        zzf(com.google.android.gms.internal.zzqf.1 zzqf$10) {
        }

        public zze zzAE() {
            return new zze(this.zzaPC, this.zzaPD, this.zzaPE, this.zzaPF, this.zzaPG, this.zzaPH, this.zzaPI, this.zzaPJ, this.zzaPK, this.zzaPL, null);
        }

        public zzf zzd(zza zzqf$zza0) {
            this.zzaPC.add(zzqf$zza0);
            return this;
        }

        public zzf zze(zza zzqf$zza0) {
            this.zzaPD.add(zzqf$zza0);
            return this;
        }

        public zzf zzeW(String s) {
            this.zzaPK.add(s);
            return this;
        }

        public zzf zzeX(String s) {
            this.zzaPL.add(s);
            return this;
        }

        public zzf zzeY(String s) {
            this.zzaPI.add(s);
            return this;
        }

        public zzf zzeZ(String s) {
            this.zzaPJ.add(s);
            return this;
        }

        public zzf zzf(zza zzqf$zza0) {
            this.zzaPE.add(zzqf$zza0);
            return this;
        }

        public zzf zzg(zza zzqf$zza0) {
            this.zzaPF.add(zzqf$zza0);
            return this;
        }

        public zzf zzh(zza zzqf$zza0) {
            this.zzaPG.add(zzqf$zza0);
            return this;
        }

        public zzf zzi(zza zzqf$zza0) {
            this.zzaPH.add(zzqf$zza0);
            return this;
        }
    }

    public static class zzg extends Exception {
        public zzg(String s) {
            super(s);
        }
    }

    private static com.google.android.gms.internal.zzag.zza zza(int v, com.google.android.gms.internal.zzaf.zzf zzaf$zzf0, com.google.android.gms.internal.zzag.zza[] arr_zzag$zza, Set set0) throws zzg {
        int v1 = 0;
        if(set0.contains(v)) {
            zzqf.zzeT(("Value cycle detected.  Current value reference: " + v + "." + "  Previous value references: " + set0 + "."));
        }
        com.google.android.gms.internal.zzag.zza zzag$zza0 = (com.google.android.gms.internal.zzag.zza)zzqf.zza(zzaf$zzf0.zzic, v, "values");
        if(arr_zzag$zza[v] != null) {
            return arr_zzag$zza[v];
        }
        com.google.android.gms.internal.zzag.zza zzag$zza1 = null;
        set0.add(v);
    alab1:
        switch(zzag$zza0.type) {
            case 2: {
                zzh zzaf$zzh0 = zzqf.zzp(zzag$zza0);
                zzag$zza1 = zzqf.zzo(zzag$zza0);
                zzag$zza1.zziS = new com.google.android.gms.internal.zzag.zza[zzaf$zzh0.zziD.length];
                int[] arr_v = zzaf$zzh0.zziD;
                for(int v2 = 0; v1 < arr_v.length; ++v2) {
                    com.google.android.gms.internal.zzag.zza[] arr_zzag$zza1 = zzag$zza1.zziS;
                    arr_zzag$zza1[v2] = zzqf.zza(arr_v[v1], zzaf$zzf0, arr_zzag$zza, set0);
                    ++v1;
                }
                break;
            }
            case 3: {
                zzag$zza1 = zzqf.zzo(zzag$zza0);
                zzh zzaf$zzh1 = zzqf.zzp(zzag$zza0);
                if(zzaf$zzh1.zziE.length != zzaf$zzh1.zziF.length) {
                    zzqf.zzeT(("Uneven map keys (" + zzaf$zzh1.zziE.length + ") and map values (" + zzaf$zzh1.zziF.length + ")"));
                }
                zzag$zza1.zziT = new com.google.android.gms.internal.zzag.zza[zzaf$zzh1.zziE.length];
                zzag$zza1.zziU = new com.google.android.gms.internal.zzag.zza[zzaf$zzh1.zziE.length];
                int[] arr_v1 = zzaf$zzh1.zziE;
                int v3 = 0;
                for(int v4 = 0; v3 < arr_v1.length; ++v4) {
                    com.google.android.gms.internal.zzag.zza[] arr_zzag$zza2 = zzag$zza1.zziT;
                    arr_zzag$zza2[v4] = zzqf.zza(arr_v1[v3], zzaf$zzf0, arr_zzag$zza, set0);
                    ++v3;
                }
                int[] arr_v2 = zzaf$zzh1.zziF;
                for(int v5 = 0; v1 < arr_v2.length; ++v5) {
                    com.google.android.gms.internal.zzag.zza[] arr_zzag$zza3 = zzag$zza1.zziU;
                    arr_zzag$zza3[v5] = zzqf.zza(arr_v2[v1], zzaf$zzf0, arr_zzag$zza, set0);
                    ++v1;
                }
                break;
            }
            case 4: {
                zzag$zza1 = zzqf.zzo(zzag$zza0);
                zzag$zza1.zziV = zzdf.zzg(zzqf.zza(zzqf.zzp(zzag$zza0).zziI, zzaf$zzf0, arr_zzag$zza, set0));
                break;
            }
            case 7: {
                zzag$zza1 = zzqf.zzo(zzag$zza0);
                zzh zzaf$zzh2 = zzqf.zzp(zzag$zza0);
                zzag$zza1.zziZ = new com.google.android.gms.internal.zzag.zza[zzaf$zzh2.zziH.length];
                int[] arr_v3 = zzaf$zzh2.zziH;
                for(int v6 = 0; true; ++v6) {
                    if(v1 >= arr_v3.length) {
                        break alab1;
                    }
                    com.google.android.gms.internal.zzag.zza[] arr_zzag$zza4 = zzag$zza1.zziZ;
                    arr_zzag$zza4[v6] = zzqf.zza(arr_v3[v1], zzaf$zzf0, arr_zzag$zza, set0);
                    ++v1;
                }
            }
            case 1: 
            case 5: 
            case 6: 
            case 8: {
                zzag$zza1 = zzag$zza0;
            }
        }
        if(zzag$zza1 == null) {
            zzqf.zzeT(("Invalid value: " + zzag$zza0));
        }
        arr_zzag$zza[v] = zzag$zza1;
        set0.remove(v);
        return zzag$zza1;
    }

    private static zza zza(com.google.android.gms.internal.zzaf.zzb zzaf$zzb0, com.google.android.gms.internal.zzaf.zzf zzaf$zzf0, com.google.android.gms.internal.zzag.zza[] arr_zzag$zza, int v) throws zzg {
        zzb zzqf$zzb0 = zza.zzAm();
        int[] arr_v = zzaf$zzb0.zzhN;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            com.google.android.gms.internal.zzaf.zze zzaf$zze0 = (com.google.android.gms.internal.zzaf.zze)zzqf.zza(zzaf$zzf0.zzid, arr_v[v1], "properties");
            String s = (String)zzqf.zza(zzaf$zzf0.zzib, zzaf$zze0.key, "keys");
            com.google.android.gms.internal.zzag.zza zzag$zza0 = (com.google.android.gms.internal.zzag.zza)zzqf.zza(arr_zzag$zza, zzaf$zze0.value, "values");
            if("push_after_evaluate".equals(s)) {
                zzqf$zzb0.zzq(zzag$zza0);
            }
            else {
                zzqf$zzb0.zzb(s, zzag$zza0);
            }
        }
        return zzqf$zzb0.zzAo();
    }

    private static zze zza(com.google.android.gms.internal.zzaf.zzg zzaf$zzg0, List list0, List list1, List list2, com.google.android.gms.internal.zzaf.zzf zzaf$zzf0) {
        zzf zzqf$zzf0 = zze.zzAt();
        int[] arr_v = zzaf$zzg0.zzir;
        for(int v = 0; v < arr_v.length; ++v) {
            zzqf$zzf0.zzd(((zza)list2.get(arr_v[v])));
        }
        int[] arr_v1 = zzaf$zzg0.zzis;
        for(int v1 = 0; v1 < arr_v1.length; ++v1) {
            zzqf$zzf0.zze(((zza)list2.get(arr_v1[v1])));
        }
        int[] arr_v2 = zzaf$zzg0.zzit;
        for(int v2 = 0; v2 < arr_v2.length; ++v2) {
            zzqf$zzf0.zzf(((zza)list0.get(arr_v2[v2])));
        }
        int[] arr_v3 = zzaf$zzg0.zziv;
        for(int v3 = 0; v3 < arr_v3.length; ++v3) {
            zzqf$zzf0.zzeW(zzaf$zzf0.zzic[arr_v3[v3]].zziR);
        }
        int[] arr_v4 = zzaf$zzg0.zziu;
        for(int v4 = 0; v4 < arr_v4.length; ++v4) {
            zzqf$zzf0.zzg(((zza)list0.get(arr_v4[v4])));
        }
        int[] arr_v5 = zzaf$zzg0.zziw;
        for(int v5 = 0; v5 < arr_v5.length; ++v5) {
            zzqf$zzf0.zzeX(zzaf$zzf0.zzic[arr_v5[v5]].zziR);
        }
        int[] arr_v6 = zzaf$zzg0.zzix;
        for(int v6 = 0; v6 < arr_v6.length; ++v6) {
            zzqf$zzf0.zzh(((zza)list1.get(arr_v6[v6])));
        }
        int[] arr_v7 = zzaf$zzg0.zziz;
        for(int v7 = 0; v7 < arr_v7.length; ++v7) {
            zzqf$zzf0.zzeY(zzaf$zzf0.zzic[arr_v7[v7]].zziR);
        }
        int[] arr_v8 = zzaf$zzg0.zziy;
        for(int v8 = 0; v8 < arr_v8.length; ++v8) {
            zzqf$zzf0.zzi(((zza)list1.get(arr_v8[v8])));
        }
        int[] arr_v9 = zzaf$zzg0.zziA;
        for(int v9 = 0; v9 < arr_v9.length; ++v9) {
            zzqf$zzf0.zzeZ(zzaf$zzf0.zzic[arr_v9[v9]].zziR);
        }
        return zzqf$zzf0.zzAE();
    }

    private static Object zza(Object[] arr_object, int v, String s) throws zzg {
        if(v < 0 || v >= arr_object.length) {
            zzqf.zzeT(("Index out of bounds detected: " + v + " in " + s));
        }
        return arr_object[v];
    }

    public static zzc zzb(com.google.android.gms.internal.zzaf.zzf zzaf$zzf0) throws zzg {
        com.google.android.gms.internal.zzag.zza[] arr_zzag$zza = new com.google.android.gms.internal.zzag.zza[zzaf$zzf0.zzic.length];
        for(int v1 = 0; v1 < zzaf$zzf0.zzic.length; ++v1) {
            zzqf.zza(v1, zzaf$zzf0, arr_zzag$zza, new HashSet(0));
        }
        zzd zzqf$zzd0 = zzc.zzAp();
        ArrayList arrayList0 = new ArrayList();
        for(int v2 = 0; v2 < zzaf$zzf0.zzif.length; ++v2) {
            arrayList0.add(zzqf.zza(zzaf$zzf0.zzif[v2], zzaf$zzf0, arr_zzag$zza, v2));
        }
        ArrayList arrayList1 = new ArrayList();
        for(int v3 = 0; v3 < zzaf$zzf0.zzig.length; ++v3) {
            arrayList1.add(zzqf.zza(zzaf$zzf0.zzig[v3], zzaf$zzf0, arr_zzag$zza, v3));
        }
        ArrayList arrayList2 = new ArrayList();
        for(int v4 = 0; v4 < zzaf$zzf0.zzie.length; ++v4) {
            zza zzqf$zza0 = zzqf.zza(zzaf$zzf0.zzie[v4], zzaf$zzf0, arr_zzag$zza, v4);
            zzqf$zzd0.zzc(zzqf$zza0);
            arrayList2.add(zzqf$zza0);
        }
        com.google.android.gms.internal.zzaf.zzg[] arr_zzaf$zzg = zzaf$zzf0.zzih;
        for(int v = 0; v < arr_zzaf$zzg.length; ++v) {
            zzqf$zzd0.zzb(zzqf.zza(arr_zzaf$zzg[v], arrayList0, arrayList2, arrayList1, zzaf$zzf0));
        }
        zzqf$zzd0.zzeV(zzaf$zzf0.version);
        zzqf$zzd0.zzjb(zzaf$zzf0.zzip);
        return zzqf$zzd0.zzAs();
    }

    public static void zzc(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        byte[] arr_b = new byte[0x400];
        int v;
        while((v = inputStream0.read(arr_b)) != -1) {
            outputStream0.write(arr_b, 0, v);
        }
    }

    private static void zzeT(String s) throws zzg {
        zzbg.zzaz(s);
        throw new zzg(s);
    }

    public static com.google.android.gms.internal.zzag.zza zzo(com.google.android.gms.internal.zzag.zza zzag$zza0) {
        com.google.android.gms.internal.zzag.zza zzag$zza1 = new com.google.android.gms.internal.zzag.zza();
        zzag$zza1.type = zzag$zza0.type;
        zzag$zza1.zzja = (int[])zzag$zza0.zzja.clone();
        if(zzag$zza0.zzjb) {
            zzag$zza1.zzjb = zzag$zza0.zzjb;
        }
        return zzag$zza1;
    }

    private static zzh zzp(com.google.android.gms.internal.zzag.zza zzag$zza0) throws zzg {
        if(((zzh)zzag$zza0.zza(zzh.zziB)) == null) {
            zzqf.zzeT(("Expected a ServingValue and didn\'t get one. Value is: " + zzag$zza0));
        }
        return (zzh)zzag$zza0.zza(zzh.zziB);
    }

    class com.google.android.gms.internal.zzqf.1 {
    }

}

