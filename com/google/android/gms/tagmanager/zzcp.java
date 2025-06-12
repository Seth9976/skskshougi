package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzqf.zze;
import com.google.android.gms.internal.zzqf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

class zzcp {
    interface zza {
        void zza(zze arg1, Set arg2, Set arg3, zzck arg4);
    }

    static class zzb {
        private zzbw zzaNv;
        private com.google.android.gms.internal.zzag.zza zzaNw;

        public zzb(zzbw zzbw0, com.google.android.gms.internal.zzag.zza zzag$zza0) {
            this.zzaNv = zzbw0;
            this.zzaNw = zzag$zza0;
        }

        public int getSize() {
            int v = ((com.google.android.gms.internal.zzag.zza)this.zzaNv.getObject()).zzBU();
            return this.zzaNw == null ? v : this.zzaNw.zzBU() + v;
        }

        public zzbw zzzr() {
            return this.zzaNv;
        }

        public com.google.android.gms.internal.zzag.zza zzzs() {
            return this.zzaNw;
        }
    }

    static class zzc {
        private final Map zzaNA;
        private com.google.android.gms.internal.zzqf.zza zzaNB;
        private final Set zzaNm;
        private final Map zzaNx;
        private final Map zzaNy;
        private final Map zzaNz;

        public zzc() {
            this.zzaNm = new HashSet();
            this.zzaNx = new HashMap();
            this.zzaNz = new HashMap();
            this.zzaNy = new HashMap();
            this.zzaNA = new HashMap();
        }

        public void zza(zze zzqf$zze0) {
            this.zzaNm.add(zzqf$zze0);
        }

        public void zza(zze zzqf$zze0, com.google.android.gms.internal.zzqf.zza zzqf$zza0) {
            List list0 = (List)this.zzaNx.get(zzqf$zze0);
            if(list0 == null) {
                list0 = new ArrayList();
                this.zzaNx.put(zzqf$zze0, list0);
            }
            list0.add(zzqf$zza0);
        }

        public void zza(zze zzqf$zze0, String s) {
            List list0 = (List)this.zzaNz.get(zzqf$zze0);
            if(list0 == null) {
                list0 = new ArrayList();
                this.zzaNz.put(zzqf$zze0, list0);
            }
            list0.add(s);
        }

        public void zzb(com.google.android.gms.internal.zzqf.zza zzqf$zza0) {
            this.zzaNB = zzqf$zza0;
        }

        public void zzb(zze zzqf$zze0, com.google.android.gms.internal.zzqf.zza zzqf$zza0) {
            List list0 = (List)this.zzaNy.get(zzqf$zze0);
            if(list0 == null) {
                list0 = new ArrayList();
                this.zzaNy.put(zzqf$zze0, list0);
            }
            list0.add(zzqf$zza0);
        }

        public void zzb(zze zzqf$zze0, String s) {
            List list0 = (List)this.zzaNA.get(zzqf$zze0);
            if(list0 == null) {
                list0 = new ArrayList();
                this.zzaNA.put(zzqf$zze0, list0);
            }
            list0.add(s);
        }

        public Set zzzt() {
            return this.zzaNm;
        }

        public Map zzzu() {
            return this.zzaNx;
        }

        public Map zzzv() {
            return this.zzaNz;
        }

        public Map zzzw() {
            return this.zzaNA;
        }

        public Map zzzx() {
            return this.zzaNy;
        }

        public com.google.android.gms.internal.zzqf.zza zzzy() {
            return this.zzaNB;
        }
    }

    private final DataLayer zzaKz;
    private static final zzbw zzaNe;
    private final com.google.android.gms.internal.zzqf.zzc zzaNf;
    private final zzah zzaNg;
    private final Map zzaNh;
    private final Map zzaNi;
    private final Map zzaNj;
    private final zzl zzaNk;
    private final zzl zzaNl;
    private final Set zzaNm;
    private final Map zzaNn;
    private volatile String zzaNo;
    private int zzaNp;

    static {
        zzcp.zzaNe = new zzbw(zzdf.zzzQ(), true);
    }

    public zzcp(Context context0, com.google.android.gms.internal.zzqf.zzc zzqf$zzc0, DataLayer dataLayer0, com.google.android.gms.tagmanager.zzt.zza zzt$zza0, com.google.android.gms.tagmanager.zzt.zza zzt$zza1, zzah zzah0) {
        if(zzqf$zzc0 == null) {
            throw new NullPointerException("resource cannot be null");
        }
        this.zzaNf = zzqf$zzc0;
        this.zzaNm = new HashSet(zzqf$zzc0.zzAq());
        this.zzaKz = dataLayer0;
        this.zzaNg = zzah0;
        com.google.android.gms.tagmanager.zzcp.1 zzcp$10 = new com.google.android.gms.tagmanager.zzm.zza() {
            public int zza(com.google.android.gms.internal.zzqf.zza zzqf$zza0, zzbw zzbw0) {
                return ((com.google.android.gms.internal.zzag.zza)zzbw0.getObject()).zzBU();
            }
        };
        this.zzaNk = new zzm().zza(0x100000, zzcp$10);
        com.google.android.gms.tagmanager.zzcp.2 zzcp$20 = new com.google.android.gms.tagmanager.zzm.zza() {
            public int zza(String s, zzb zzcp$zzb0) {
                return s.length() + zzcp$zzb0.getSize();
            }
        };
        this.zzaNl = new zzm().zza(0x100000, zzcp$20);
        this.zzaNh = new HashMap();
        this.zzb(new zzj(context0));
        this.zzb(new zzt(zzt$zza1));
        this.zzb(new zzx(dataLayer0));
        this.zzb(new zzdg(context0, dataLayer0));
        this.zzb(new zzdb(context0, dataLayer0));
        this.zzaNi = new HashMap();
        this.zzc(new zzr());
        this.zzc(new zzae());
        this.zzc(new zzaf());
        this.zzc(new zzam());
        this.zzc(new zzan());
        this.zzc(new zzbc());
        this.zzc(new zzbd());
        this.zzc(new zzcf());
        this.zzc(new zzcy());
        this.zzaNj = new HashMap();
        this.zza(new com.google.android.gms.tagmanager.zzb(context0));
        this.zza(new com.google.android.gms.tagmanager.zzc(context0));
        this.zza(new com.google.android.gms.tagmanager.zze(context0));
        this.zza(new zzf(context0));
        this.zza(new zzg(context0));
        this.zza(new zzh(context0));
        this.zza(new zzi(context0));
        this.zza(new zzn());
        this.zza(new zzq(this.zzaNf.getVersion()));
        this.zza(new zzt(zzt$zza0));
        this.zza(new zzv(dataLayer0));
        this.zza(new zzaa(context0));
        this.zza(new zzab());
        this.zza(new zzad());
        this.zza(new zzai(this));
        this.zza(new zzao());
        this.zza(new zzap());
        this.zza(new zzaw(context0));
        this.zza(new zzay());
        this.zza(new zzbb());
        this.zza(new zzbi());
        this.zza(new zzbk(context0));
        this.zza(new zzbx());
        this.zza(new zzbz());
        this.zza(new zzcc());
        this.zza(new zzce());
        this.zza(new zzcg(context0));
        this.zza(new zzcq());
        this.zza(new zzcr());
        this.zza(new zzda());
        this.zza(new zzdh());
        this.zzaNn = new HashMap();
        for(Object object0: this.zzaNm) {
            zze zzqf$zze0 = (zze)object0;
            if(zzah0.zzyL()) {
                zzcp.zza(zzqf$zze0.zzAy(), zzqf$zze0.zzAz(), "add macro");
                zzcp.zza(zzqf$zze0.zzAD(), zzqf$zze0.zzAA(), "remove macro");
                zzcp.zza(zzqf$zze0.zzAw(), zzqf$zze0.zzAB(), "add tag");
                zzcp.zza(zzqf$zze0.zzAx(), zzqf$zze0.zzAC(), "remove tag");
            }
            for(int v = 0; v < zzqf$zze0.zzAy().size(); ++v) {
                com.google.android.gms.internal.zzqf.zza zzqf$zza0 = (com.google.android.gms.internal.zzqf.zza)zzqf$zze0.zzAy().get(v);
                String s = !zzah0.zzyL() || v >= zzqf$zze0.zzAz().size() ? "Unknown" : ((String)zzqf$zze0.zzAz().get(v));
                String s1 = zzcp.zza(zzqf$zza0);
                zzc zzcp$zzc0 = zzcp.zzh(this.zzaNn, s1);
                zzcp$zzc0.zza(zzqf$zze0);
                zzcp$zzc0.zza(zzqf$zze0, zzqf$zza0);
                zzcp$zzc0.zza(zzqf$zze0, s);
            }
            for(int v1 = 0; v1 < zzqf$zze0.zzAD().size(); ++v1) {
                com.google.android.gms.internal.zzqf.zza zzqf$zza1 = (com.google.android.gms.internal.zzqf.zza)zzqf$zze0.zzAD().get(v1);
                String s2 = !zzah0.zzyL() || v1 >= zzqf$zze0.zzAA().size() ? "Unknown" : ((String)zzqf$zze0.zzAA().get(v1));
                String s3 = zzcp.zza(zzqf$zza1);
                zzc zzcp$zzc1 = zzcp.zzh(this.zzaNn, s3);
                zzcp$zzc1.zza(zzqf$zze0);
                zzcp$zzc1.zzb(zzqf$zze0, zzqf$zza1);
                zzcp$zzc1.zzb(zzqf$zze0, s2);
            }
        }
        for(Object object1: this.zzaNf.zzAr().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            for(Object object2: ((List)map$Entry0.getValue())) {
                com.google.android.gms.internal.zzqf.zza zzqf$zza2 = (com.google.android.gms.internal.zzqf.zza)object2;
                if(!zzdf.zzk(((com.google.android.gms.internal.zzag.zza)zzqf$zza2.zzAn().get("not_default_macro"))).booleanValue()) {
                    String s4 = (String)map$Entry0.getKey();
                    zzcp.zzh(this.zzaNn, s4).zzb(zzqf$zza2);
                }
            }
        }
    }

    private zzbw zza(com.google.android.gms.internal.zzag.zza zzag$zza0, Set set0, zzdi zzdi0) {
        if(!zzag$zza0.zzjb) {
            return new zzbw(zzag$zza0, true);
        }
        switch(zzag$zza0.type) {
            case 2: {
                com.google.android.gms.internal.zzag.zza zzag$zza1 = zzqf.zzo(zzag$zza0);
                zzag$zza1.zziS = new com.google.android.gms.internal.zzag.zza[zzag$zza0.zziS.length];
                for(int v = 0; v < zzag$zza0.zziS.length; ++v) {
                    zzbw zzbw0 = this.zza(zzag$zza0.zziS[v], set0, zzdi0.zziU(v));
                    if(zzbw0 == zzcp.zzaNe) {
                        return zzcp.zzaNe;
                    }
                    zzag$zza1.zziS[v] = (com.google.android.gms.internal.zzag.zza)zzbw0.getObject();
                }
                return new zzbw(zzag$zza1, false);
            }
            case 3: {
                com.google.android.gms.internal.zzag.zza zzag$zza2 = zzqf.zzo(zzag$zza0);
                if(zzag$zza0.zziT.length != zzag$zza0.zziU.length) {
                    zzbg.zzaz(("Invalid serving value: " + zzag$zza0.toString()));
                    return zzcp.zzaNe;
                }
                zzag$zza2.zziT = new com.google.android.gms.internal.zzag.zza[zzag$zza0.zziT.length];
                zzag$zza2.zziU = new com.google.android.gms.internal.zzag.zza[zzag$zza0.zziT.length];
                for(int v1 = 0; v1 < zzag$zza0.zziT.length; ++v1) {
                    zzbw zzbw1 = this.zza(zzag$zza0.zziT[v1], set0, zzdi0.zziV(v1));
                    zzbw zzbw2 = this.zza(zzag$zza0.zziU[v1], set0, zzdi0.zziW(v1));
                    if(zzbw1 == zzcp.zzaNe || zzbw2 == zzcp.zzaNe) {
                        return zzcp.zzaNe;
                    }
                    zzag$zza2.zziT[v1] = (com.google.android.gms.internal.zzag.zza)zzbw1.getObject();
                    zzag$zza2.zziU[v1] = (com.google.android.gms.internal.zzag.zza)zzbw2.getObject();
                }
                return new zzbw(zzag$zza2, false);
            }
            case 4: {
                if(set0.contains(zzag$zza0.zziV)) {
                    zzbg.zzaz(("Macro cycle detected.  Current macro reference: " + zzag$zza0.zziV + "." + "  Previous macro references: " + set0.toString() + "."));
                    return zzcp.zzaNe;
                }
                set0.add(zzag$zza0.zziV);
                zzbw zzbw3 = zzdj.zza(this.zza(zzag$zza0.zziV, set0, zzdi0.zzyZ()), zzag$zza0.zzja);
                set0.remove(zzag$zza0.zziV);
                return zzbw3;
            }
            case 7: {
                com.google.android.gms.internal.zzag.zza zzag$zza3 = zzqf.zzo(zzag$zza0);
                zzag$zza3.zziZ = new com.google.android.gms.internal.zzag.zza[zzag$zza0.zziZ.length];
                for(int v2 = 0; v2 < zzag$zza0.zziZ.length; ++v2) {
                    zzbw zzbw4 = this.zza(zzag$zza0.zziZ[v2], set0, zzdi0.zziX(v2));
                    if(zzbw4 == zzcp.zzaNe) {
                        return zzcp.zzaNe;
                    }
                    zzag$zza3.zziZ[v2] = (com.google.android.gms.internal.zzag.zza)zzbw4.getObject();
                }
                return new zzbw(zzag$zza3, false);
            }
            default: {
                zzbg.zzaz(("Unknown type: " + zzag$zza0.type));
                return zzcp.zzaNe;
            }
        }
    }

    private zzbw zza(String s, Set set0, zzbj zzbj0) {
        com.google.android.gms.internal.zzqf.zza zzqf$zza0;
        ++this.zzaNp;
        zzb zzcp$zzb0 = (zzb)this.zzaNl.get(s);
        if(zzcp$zzb0 != null && !this.zzaNg.zzyL()) {
            this.zza(zzcp$zzb0.zzzs(), set0);
            --this.zzaNp;
            return zzcp$zzb0.zzzr();
        }
        Object object0 = this.zzaNn.get(s);
        if(((zzc)object0) == null) {
            zzbg.zzaz((this.zzzq() + "Invalid macro: " + s));
            --this.zzaNp;
            return zzcp.zzaNe;
        }
        zzbw zzbw0 = this.zza(s, ((zzc)object0).zzzt(), ((zzc)object0).zzzu(), ((zzc)object0).zzzv(), ((zzc)object0).zzzx(), ((zzc)object0).zzzw(), set0, zzbj0.zzyB());
        if(((Set)zzbw0.getObject()).isEmpty()) {
            zzqf$zza0 = ((zzc)object0).zzzy();
        }
        else {
            if(((Set)zzbw0.getObject()).size() > 1) {
                zzbg.zzaC((this.zzzq() + "Multiple macros active for macroName " + s));
            }
            Object object1 = ((Set)zzbw0.getObject()).iterator().next();
            zzqf$zza0 = (com.google.android.gms.internal.zzqf.zza)object1;
        }
        if(zzqf$zza0 == null) {
            --this.zzaNp;
            return zzcp.zzaNe;
        }
        zzch zzch0 = zzbj0.zzyR();
        zzbw zzbw1 = this.zza(this.zzaNj, zzqf$zza0, set0, zzch0);
        zzbw zzbw2 = zzbw1 == zzcp.zzaNe ? zzcp.zzaNe : new zzbw(zzbw1.getObject(), zzbw0.zzza() && zzbw1.zzza());
        com.google.android.gms.internal.zzag.zza zzag$zza0 = zzqf$zza0.zzzs();
        if(zzbw2.zzza()) {
            zzb zzcp$zzb1 = new zzb(zzbw2, zzag$zza0);
            this.zzaNl.zzf(s, zzcp$zzb1);
        }
        this.zza(zzag$zza0, set0);
        --this.zzaNp;
        return zzbw2;
    }

    private zzbw zza(Map map0, com.google.android.gms.internal.zzqf.zza zzqf$zza0, Set set0, zzch zzch0) {
        int v1;
        boolean z = true;
        com.google.android.gms.internal.zzag.zza zzag$zza0 = (com.google.android.gms.internal.zzag.zza)zzqf$zza0.zzAn().get("function");
        if(zzag$zza0 == null) {
            zzbg.zzaz("No function id in properties");
            return zzcp.zzaNe;
        }
        String s = zzag$zza0.zziW;
        zzak zzak0 = (zzak)map0.get(s);
        if(zzak0 == null) {
            zzbg.zzaz((s + " has no backing implementation."));
            return zzcp.zzaNe;
        }
        zzbw zzbw0 = (zzbw)this.zzaNk.get(zzqf$zza0);
        if(zzbw0 == null || this.zzaNg.zzyL()) {
            HashMap hashMap0 = new HashMap();
            int v = 1;
            for(Object object0: zzqf$zza0.zzAn().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                zzcj zzcj0 = zzch0.zzez(((String)map$Entry0.getKey()));
                zzbw zzbw1 = this.zza(((com.google.android.gms.internal.zzag.zza)map$Entry0.getValue()), set0, zzcj0.zze(((com.google.android.gms.internal.zzag.zza)map$Entry0.getValue())));
                if(zzbw1 == zzcp.zzaNe) {
                    return zzcp.zzaNe;
                }
                if(zzbw1.zzza()) {
                    zzqf$zza0.zza(((String)map$Entry0.getKey()), ((com.google.android.gms.internal.zzag.zza)zzbw1.getObject()));
                    v1 = v;
                }
                else {
                    v1 = 0;
                }
                hashMap0.put(map$Entry0.getKey(), zzbw1.getObject());
                v = v1;
            }
            if(!zzak0.zzg(hashMap0.keySet())) {
                zzbg.zzaz(("Incorrect keys for function " + s + " required " + zzak0.zzyN() + " had " + hashMap0.keySet()));
                return zzcp.zzaNe;
            }
            if(v == 0 || !zzak0.zzyh()) {
                z = false;
            }
            zzbw0 = new zzbw(zzak0.zzE(hashMap0), z);
            if(z) {
                this.zzaNk.zzf(zzqf$zza0, zzbw0);
            }
            zzch0.zzd(((com.google.android.gms.internal.zzag.zza)zzbw0.getObject()));
            return zzbw0;
        }
        return zzbw0;
    }

    private zzbw zza(Set set0, Set set1, zza zzcp$zza0, zzco zzco0) {
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        boolean z = true;
        for(Object object0: set0) {
            zze zzqf$zze0 = (zze)object0;
            zzck zzck0 = zzco0.zzyY();
            zzbw zzbw0 = this.zza(zzqf$zze0, set1, zzck0);
            if(((Boolean)zzbw0.getObject()).booleanValue()) {
                zzcp$zza0.zza(zzqf$zze0, hashSet0, hashSet1, zzck0);
            }
            z = z && zzbw0.zzza();
        }
        hashSet0.removeAll(hashSet1);
        zzco0.zzh(hashSet0);
        return new zzbw(hashSet0, z);
    }

    // 去混淆评级： 低(20)
    private static String zza(com.google.android.gms.internal.zzqf.zza zzqf$zza0) {
        return zzdf.zzg(((com.google.android.gms.internal.zzag.zza)zzqf$zza0.zzAn().get("instance_name")));
    }

    private void zza(com.google.android.gms.internal.zzag.zza zzag$zza0, Set set0) {
        if(zzag$zza0 != null) {
            zzbw zzbw0 = this.zza(zzag$zza0, set0, new zzbu());
            if(zzbw0 != zzcp.zzaNe) {
                Object object0 = zzdf.zzl(((com.google.android.gms.internal.zzag.zza)zzbw0.getObject()));
                if(object0 instanceof Map) {
                    this.zzaKz.push(((Map)object0));
                    return;
                }
                if(object0 instanceof List) {
                    for(Object object1: ((List)object0)) {
                        if(object1 instanceof Map) {
                            this.zzaKz.push(((Map)object1));
                        }
                        else {
                            zzbg.zzaC("pushAfterEvaluate: value not a Map");
                        }
                    }
                    return;
                }
                zzbg.zzaC("pushAfterEvaluate: value not a Map or List");
            }
        }
    }

    private static void zza(List list0, List list1, String s) {
        if(list0.size() != list1.size()) {
            zzbg.zzaA(("Invalid resource: imbalance of rule names of functions for " + s + " operation. Using default rule name instead"));
        }
    }

    private static void zza(Map map0, zzak zzak0) {
        if(map0.containsKey(zzak0.zzyM())) {
            throw new IllegalArgumentException("Duplicate function type name: " + zzak0.zzyM());
        }
        map0.put(zzak0.zzyM(), zzak0);
    }

    zzbw zza(com.google.android.gms.internal.zzqf.zza zzqf$zza0, Set set0, zzch zzch0) {
        zzbw zzbw0 = this.zza(this.zzaNi, zzqf$zza0, set0, zzch0);
        Boolean boolean0 = zzdf.zzk(((com.google.android.gms.internal.zzag.zza)zzbw0.getObject()));
        zzch0.zzd(zzdf.zzI(boolean0));
        return new zzbw(boolean0, zzbw0.zzza());
    }

    zzbw zza(zze zzqf$zze0, Set set0, zzck zzck0) {
        boolean z = true;
        for(Object object0: zzqf$zze0.zzAv()) {
            zzbw zzbw0 = this.zza(((com.google.android.gms.internal.zzqf.zza)object0), set0, zzck0.zzyS());
            if(((Boolean)zzbw0.getObject()).booleanValue()) {
                zzck0.zzf(zzdf.zzI(Boolean.FALSE));
                return new zzbw(Boolean.FALSE, zzbw0.zzza());
            }
            z = z && zzbw0.zzza();
        }
        for(Object object1: zzqf$zze0.zzAu()) {
            zzbw zzbw1 = this.zza(((com.google.android.gms.internal.zzqf.zza)object1), set0, zzck0.zzyT());
            if(!((Boolean)zzbw1.getObject()).booleanValue()) {
                zzck0.zzf(zzdf.zzI(Boolean.FALSE));
                return new zzbw(Boolean.FALSE, zzbw1.zzza());
            }
            z = z && zzbw1.zzza();
        }
        zzck0.zzf(zzdf.zzI(Boolean.TRUE));
        return new zzbw(Boolean.TRUE, z);
    }

    zzbw zza(String s, Set set0, Map map0, Map map1, Map map2, Map map3, Set set1, zzco zzco0) {
        return this.zza(set0, set1, new zza() {
            @Override  // com.google.android.gms.tagmanager.zzcp$zza
            public void zza(zze zzqf$zze0, Set set0, Set set1, zzck zzck0) {
                List list0 = (List)map0.get(zzqf$zze0);
                List list1 = (List)map1.get(zzqf$zze0);
                if(list0 != null) {
                    set0.addAll(list0);
                    zzck0.zzyU().zzc(list0, list1);
                }
                List list2 = (List)map2.get(zzqf$zze0);
                List list3 = (List)map3.get(zzqf$zze0);
                if(list2 != null) {
                    set1.addAll(list2);
                    zzck0.zzyV().zzc(list2, list3);
                }
            }
        }, zzco0);
    }

    zzbw zza(Set set0, zzco zzco0) {
        return this.zza(set0, new HashSet(), new zza() {
            @Override  // com.google.android.gms.tagmanager.zzcp$zza
            public void zza(zze zzqf$zze0, Set set0, Set set1, zzck zzck0) {
                set0.addAll(zzqf$zze0.zzAw());
                set1.addAll(zzqf$zze0.zzAx());
                zzck0.zzyW().zzc(zzqf$zze0.zzAw(), zzqf$zze0.zzAB());
                zzck0.zzyX().zzc(zzqf$zze0.zzAx(), zzqf$zze0.zzAC());
            }
        }, zzco0);
    }

    void zza(zzak zzak0) {
        zzcp.zza(this.zzaNj, zzak0);
    }

    void zzb(zzak zzak0) {
        zzcp.zza(this.zzaNh, zzak0);
    }

    void zzc(zzak zzak0) {
        zzcp.zza(this.zzaNi, zzak0);
    }

    public zzbw zzeD(String s) {
        this.zzaNp = 0;
        zzag zzag0 = this.zzaNg.zzet(s);
        zzbw zzbw0 = this.zza(s, new HashSet(), zzag0.zzyI());
        zzag0.zzyK();
        return zzbw0;
    }

    void zzeE(String s) {
        synchronized(this) {
            this.zzaNo = s;
        }
    }

    public void zzeh(String s) {
        synchronized(this) {
            this.zzeE(s);
            zzag zzag0 = this.zzaNg.zzeu(s);
            zzu zzu0 = zzag0.zzyJ();
            zzco zzco0 = zzu0.zzyB();
            for(Object object0: ((Set)this.zza(this.zzaNm, zzco0).getObject())) {
                HashSet hashSet0 = new HashSet();
                zzch zzch0 = zzu0.zzyA();
                this.zza(this.zzaNh, ((com.google.android.gms.internal.zzqf.zza)object0), hashSet0, zzch0);
            }
            zzag0.zzyK();
            this.zzeE(null);
        }
    }

    private static zzc zzh(Map map0, String s) {
        zzc zzcp$zzc0 = (zzc)map0.get(s);
        if(zzcp$zzc0 == null) {
            zzcp$zzc0 = new zzc();
            map0.put(s, zzcp$zzc0);
        }
        return zzcp$zzc0;
    }

    public void zzs(List list0) {
        synchronized(this) {
            for(Object object0: list0) {
                com.google.android.gms.internal.zzaf.zzi zzaf$zzi0 = (com.google.android.gms.internal.zzaf.zzi)object0;
                if(zzaf$zzi0.name == null || !zzaf$zzi0.name.startsWith("gaExperiment:")) {
                    zzbg.zzaB(("Ignored supplemental: " + zzaf$zzi0));
                }
                else {
                    zzaj.zza(this.zzaKz, zzaf$zzi0);
                }
            }
        }
    }

    String zzzp() {
        synchronized(this) {
        }
        return this.zzaNo;
    }

    private String zzzq() {
        if(this.zzaNp <= 1) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(Integer.toString(this.zzaNp));
        for(int v = 2; v < this.zzaNp; ++v) {
            stringBuilder0.append(' ');
        }
        stringBuilder0.append(": ");
        return stringBuilder0.toString();
    }
}

