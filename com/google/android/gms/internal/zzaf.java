package com.google.android.gms.internal;

import java.io.IOException;

public interface zzaf {
    public static final class zza extends zzrh {
        public int level;
        public int zzhK;
        public int zzhL;

        public zza() {
            this.zzA();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            return !(o instanceof zza) || this.level != ((zza)o).level || this.zzhK != ((zza)o).zzhK || this.zzhL != ((zza)o).zzhL ? false : this.zza(((zza)o));
        }

        @Override
        public int hashCode() {
            return (((this.level + 0x20F) * 0x1F + this.zzhK) * 0x1F + this.zzhL) * 0x1F + this.zzBI();
        }

        public zza zzA() {
            this.level = 1;
            this.zzhK = 0;
            this.zzhL = 0;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB();
            if(this.level != 1) {
                v += zzrg.zzA(1, this.level);
            }
            if(this.zzhK != 0) {
                v += zzrg.zzA(2, this.zzhK);
            }
            return this.zzhL == 0 ? v : v + zzrg.zzA(3, this.zzhL);
        }

        public zza zza(zzrf zzrf0) throws IOException {
            while(true) {
                int v = zzrf0.zzBr();
                switch(v) {
                    case 0: {
                        return this;
                    label_4:
                        if(this.zza(zzrf0, v)) {
                            break;
                        }
                        return this;
                    }
                    case 8: {
                        int v1 = zzrf0.zzBu();
                        if(v1 != 1 && v1 != 2 && v1 != 3) {
                            break;
                        }
                        this.level = v1;
                        break;
                    }
                    case 16: {
                        this.zzhK = zzrf0.zzBu();
                        break;
                    }
                    case 24: {
                        this.zzhL = zzrf0.zzBu();
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(this.level != 1) {
                zzrg0.zzy(1, this.level);
            }
            if(this.zzhK != 0) {
                zzrg0.zzy(2, this.zzhK);
            }
            if(this.zzhL != 0) {
                zzrg0.zzy(3, this.zzhL);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zza(zzrf0);
        }
    }

    public static final class zzb extends zzrh {
        public int name;
        private static volatile zzb[] zzhM;
        public int[] zzhN;
        public int zzhO;
        public boolean zzhP;
        public boolean zzhQ;

        public zzb() {
            this.zzD();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            return !(o instanceof zzb) || !zzrl.equals(this.zzhN, ((zzb)o).zzhN) || this.zzhO != ((zzb)o).zzhO || this.name != ((zzb)o).name || this.zzhP != ((zzb)o).zzhP || this.zzhQ != ((zzb)o).zzhQ ? false : this.zza(((zzb)o));
        }

        @Override
        public int hashCode() {
            int v = (((zzrl.hashCode(this.zzhN) + 0x20F) * 0x1F + this.zzhO) * 0x1F + this.name) * 0x1F;
            if(this.zzhP) {
                return this.zzhQ ? ((v + 0x4CF) * 0x1F + 0x4CF) * 0x1F + this.zzBI() : ((v + 0x4CF) * 0x1F + 0x4D5) * 0x1F + this.zzBI();
            }
            return this.zzhQ ? ((v + 0x4D5) * 0x1F + 0x4CF) * 0x1F + this.zzBI() : ((v + 0x4D5) * 0x1F + 0x4D5) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v4;
            int v = 0;
            int v1 = super.zzB();
            if(this.zzhQ) {
                v1 += zzrg.zzc(1, this.zzhQ);
            }
            int v2 = zzrg.zzA(2, this.zzhO) + v1;
            if(this.zzhN == null || this.zzhN.length <= 0) {
                v4 = v2;
            }
            else {
                for(int v3 = 0; v3 < this.zzhN.length; ++v3) {
                    v += zzrg.zzkJ(this.zzhN[v3]);
                }
                v4 = v2 + v + this.zzhN.length;
            }
            if(this.name != 0) {
                v4 += zzrg.zzA(4, this.name);
            }
            return this.zzhP ? v4 + zzrg.zzc(6, this.zzhP) : v4;
        }

        public static zzb[] zzC() {
            if(zzb.zzhM == null) {
                Object object0 = zzrl.zzaWe;
                synchronized(object0) {
                    if(zzb.zzhM == null) {
                        zzb.zzhM = new zzb[0];
                    }
                }
            }
            return zzb.zzhM;
        }

        public zzb zzD() {
            this.zzhN = zzrq.zzaWh;
            this.zzhO = 0;
            this.name = 0;
            this.zzhP = false;
            this.zzhQ = false;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(this.zzhQ) {
                zzrg0.zzb(1, this.zzhQ);
            }
            zzrg0.zzy(2, this.zzhO);
            if(this.zzhN != null && this.zzhN.length > 0) {
                for(int v = 0; v < this.zzhN.length; ++v) {
                    zzrg0.zzy(3, this.zzhN[v]);
                }
            }
            if(this.name != 0) {
                zzrg0.zzy(4, this.name);
            }
            if(this.zzhP) {
                zzrg0.zzb(6, this.zzhP);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzc(zzrf0);
        }

        public zzb zzc(zzrf zzrf0) throws IOException {
            while(true) {
                int v = zzrf0.zzBr();
                switch(v) {
                    case 0: {
                        return this;
                    label_4:
                        if(this.zza(zzrf0, v)) {
                            break;
                        }
                        return this;
                    }
                    case 8: {
                        this.zzhQ = zzrf0.zzBv();
                        break;
                    }
                    case 16: {
                        this.zzhO = zzrf0.zzBu();
                        break;
                    }
                    case 24: {
                        int v1 = zzrq.zzb(zzrf0, 24);
                        int v2 = this.zzhN == null ? 0 : this.zzhN.length;
                        int[] arr_v = new int[v1 + v2];
                        if(v2 != 0) {
                            System.arraycopy(this.zzhN, 0, arr_v, 0, v2);
                        }
                        while(v2 < arr_v.length - 1) {
                            arr_v[v2] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v2;
                        }
                        arr_v[v2] = zzrf0.zzBu();
                        this.zzhN = arr_v;
                        break;
                    }
                    case 26: {
                        int v3 = zzrf0.zzkC(zzrf0.zzBy());
                        int v4 = zzrf0.getPosition();
                        int v5;
                        for(v5 = 0; zzrf0.zzBD() > 0; ++v5) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v4);
                        int v6 = this.zzhN == null ? 0 : this.zzhN.length;
                        int[] arr_v1 = new int[v5 + v6];
                        if(v6 != 0) {
                            System.arraycopy(this.zzhN, 0, arr_v1, 0, v6);
                        }
                        while(v6 < arr_v1.length) {
                            arr_v1[v6] = zzrf0.zzBu();
                            ++v6;
                        }
                        this.zzhN = arr_v1;
                        zzrf0.zzkD(v3);
                        break;
                    }
                    case 0x20: {
                        this.name = zzrf0.zzBu();
                        break;
                    }
                    case 0x30: {
                        this.zzhP = zzrf0.zzBv();
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }
    }

    public static final class zzc extends zzrh {
        public String zzaC;
        private static volatile zzc[] zzhR;
        public long zzhS;
        public long zzhT;
        public boolean zzhU;
        public long zzhV;

        public zzc() {
            this.zzF();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zzc) {
                if(this.zzaC != null) {
                    if(!this.zzaC.equals(((zzc)o).zzaC)) {
                        return false;
                    }
                    return this.zzhS != ((zzc)o).zzhS || this.zzhT != ((zzc)o).zzhT || this.zzhU != ((zzc)o).zzhU || this.zzhV != ((zzc)o).zzhV ? false : this.zza(((zzc)o));
                }
                else if(((zzc)o).zzaC == null) {
                    return this.zzhS != ((zzc)o).zzhS || this.zzhT != ((zzc)o).zzhT || this.zzhU != ((zzc)o).zzhU || this.zzhV != ((zzc)o).zzhV ? false : this.zza(((zzc)o));
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            int v = ((((this.zzaC == null ? 0 : this.zzaC.hashCode()) + 0x20F) * 0x1F + ((int)(this.zzhS ^ this.zzhS >>> 0x20))) * 0x1F + ((int)(this.zzhT ^ this.zzhT >>> 0x20))) * 0x1F;
            return this.zzhU ? ((v + 0x4CF) * 0x1F + ((int)(this.zzhV ^ this.zzhV >>> 0x20))) * 0x1F + this.zzBI() : ((v + 0x4D5) * 0x1F + ((int)(this.zzhV ^ this.zzhV >>> 0x20))) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB();
            if(!this.zzaC.equals("")) {
                v += zzrg.zzk(1, this.zzaC);
            }
            if(this.zzhS != 0L) {
                v += zzrg.zzd(2, this.zzhS);
            }
            if(this.zzhT != 0x7FFFFFFFL) {
                v += zzrg.zzd(3, this.zzhT);
            }
            if(this.zzhU) {
                v += zzrg.zzc(4, this.zzhU);
            }
            return this.zzhV == 0L ? v : v + zzrg.zzd(5, this.zzhV);
        }

        public static zzc[] zzE() {
            if(zzc.zzhR == null) {
                Object object0 = zzrl.zzaWe;
                synchronized(object0) {
                    if(zzc.zzhR == null) {
                        zzc.zzhR = new zzc[0];
                    }
                }
            }
            return zzc.zzhR;
        }

        public zzc zzF() {
            this.zzaC = "";
            this.zzhS = 0L;
            this.zzhT = 0x7FFFFFFFL;
            this.zzhU = false;
            this.zzhV = 0L;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(!this.zzaC.equals("")) {
                zzrg0.zzb(1, this.zzaC);
            }
            if(this.zzhS != 0L) {
                zzrg0.zzb(2, this.zzhS);
            }
            if(this.zzhT != 0x7FFFFFFFL) {
                zzrg0.zzb(3, this.zzhT);
            }
            if(this.zzhU) {
                zzrg0.zzb(4, this.zzhU);
            }
            if(this.zzhV != 0L) {
                zzrg0.zzb(5, this.zzhV);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzd(zzrf0);
        }

        public zzc zzd(zzrf zzrf0) throws IOException {
            while(true) {
                int v = zzrf0.zzBr();
                switch(v) {
                    case 0: {
                        return this;
                    label_4:
                        if(this.zza(zzrf0, v)) {
                            break;
                        }
                        return this;
                    }
                    case 10: {
                        this.zzaC = zzrf0.readString();
                        break;
                    }
                    case 16: {
                        this.zzhS = zzrf0.zzBt();
                        break;
                    }
                    case 24: {
                        this.zzhT = zzrf0.zzBt();
                        break;
                    }
                    case 0x20: {
                        this.zzhU = zzrf0.zzBv();
                        break;
                    }
                    case 40: {
                        this.zzhV = zzrf0.zzBt();
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }
    }

    public static final class zzd extends zzrh {
        public com.google.android.gms.internal.zzag.zza[] zzhW;
        public com.google.android.gms.internal.zzag.zza[] zzhX;
        public zzc[] zzhY;

        public zzd() {
            this.zzG();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            return !(o instanceof zzd) || !zzrl.equals(this.zzhW, ((zzd)o).zzhW) || !zzrl.equals(this.zzhX, ((zzd)o).zzhX) || !zzrl.equals(this.zzhY, ((zzd)o).zzhY) ? false : this.zza(((zzd)o));
        }

        @Override
        public int hashCode() {
            return (((zzrl.hashCode(this.zzhW) + 0x20F) * 0x1F + zzrl.hashCode(this.zzhX)) * 0x1F + zzrl.hashCode(this.zzhY)) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v1 = super.zzB();
            if(this.zzhW != null && this.zzhW.length > 0) {
                int v2 = v1;
                for(int v3 = 0; v3 < this.zzhW.length; ++v3) {
                    com.google.android.gms.internal.zzag.zza zzag$zza0 = this.zzhW[v3];
                    if(zzag$zza0 != null) {
                        v2 += zzrg.zzc(1, zzag$zza0);
                    }
                }
                v1 = v2;
            }
            if(this.zzhX != null && this.zzhX.length > 0) {
                int v4 = v1;
                for(int v5 = 0; v5 < this.zzhX.length; ++v5) {
                    com.google.android.gms.internal.zzag.zza zzag$zza1 = this.zzhX[v5];
                    if(zzag$zza1 != null) {
                        v4 += zzrg.zzc(2, zzag$zza1);
                    }
                }
                v1 = v4;
            }
            if(this.zzhY != null && this.zzhY.length > 0) {
                for(int v = 0; v < this.zzhY.length; ++v) {
                    zzc zzaf$zzc0 = this.zzhY[v];
                    if(zzaf$zzc0 != null) {
                        v1 += zzrg.zzc(3, zzaf$zzc0);
                    }
                }
            }
            return v1;
        }

        public zzd zzG() {
            this.zzhW = com.google.android.gms.internal.zzag.zza.zzQ();
            this.zzhX = com.google.android.gms.internal.zzag.zza.zzQ();
            this.zzhY = zzc.zzE();
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(this.zzhW != null && this.zzhW.length > 0) {
                for(int v1 = 0; v1 < this.zzhW.length; ++v1) {
                    com.google.android.gms.internal.zzag.zza zzag$zza0 = this.zzhW[v1];
                    if(zzag$zza0 != null) {
                        zzrg0.zza(1, zzag$zza0);
                    }
                }
            }
            if(this.zzhX != null && this.zzhX.length > 0) {
                for(int v2 = 0; v2 < this.zzhX.length; ++v2) {
                    com.google.android.gms.internal.zzag.zza zzag$zza1 = this.zzhX[v2];
                    if(zzag$zza1 != null) {
                        zzrg0.zza(2, zzag$zza1);
                    }
                }
            }
            if(this.zzhY != null && this.zzhY.length > 0) {
                for(int v = 0; v < this.zzhY.length; ++v) {
                    zzc zzaf$zzc0 = this.zzhY[v];
                    if(zzaf$zzc0 != null) {
                        zzrg0.zza(3, zzaf$zzc0);
                    }
                }
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zze(zzrf0);
        }

        public zzd zze(zzrf zzrf0) throws IOException {
            while(true) {
                int v = zzrf0.zzBr();
                switch(v) {
                    case 0: {
                        return this;
                    label_4:
                        if(this.zza(zzrf0, v)) {
                            break;
                        }
                        return this;
                    }
                    case 10: {
                        int v1 = zzrq.zzb(zzrf0, 10);
                        int v2 = this.zzhW == null ? 0 : this.zzhW.length;
                        com.google.android.gms.internal.zzag.zza[] arr_zzag$zza = new com.google.android.gms.internal.zzag.zza[v1 + v2];
                        if(v2 != 0) {
                            System.arraycopy(this.zzhW, 0, arr_zzag$zza, 0, v2);
                        }
                        while(v2 < arr_zzag$zza.length - 1) {
                            arr_zzag$zza[v2] = new com.google.android.gms.internal.zzag.zza();
                            zzrf0.zza(arr_zzag$zza[v2]);
                            zzrf0.zzBr();
                            ++v2;
                        }
                        arr_zzag$zza[v2] = new com.google.android.gms.internal.zzag.zza();
                        zzrf0.zza(arr_zzag$zza[v2]);
                        this.zzhW = arr_zzag$zza;
                        break;
                    }
                    case 18: {
                        int v3 = zzrq.zzb(zzrf0, 18);
                        int v4 = this.zzhX == null ? 0 : this.zzhX.length;
                        com.google.android.gms.internal.zzag.zza[] arr_zzag$zza1 = new com.google.android.gms.internal.zzag.zza[v3 + v4];
                        if(v4 != 0) {
                            System.arraycopy(this.zzhX, 0, arr_zzag$zza1, 0, v4);
                        }
                        while(v4 < arr_zzag$zza1.length - 1) {
                            arr_zzag$zza1[v4] = new com.google.android.gms.internal.zzag.zza();
                            zzrf0.zza(arr_zzag$zza1[v4]);
                            zzrf0.zzBr();
                            ++v4;
                        }
                        arr_zzag$zza1[v4] = new com.google.android.gms.internal.zzag.zza();
                        zzrf0.zza(arr_zzag$zza1[v4]);
                        this.zzhX = arr_zzag$zza1;
                        break;
                    }
                    case 26: {
                        int v5 = zzrq.zzb(zzrf0, 26);
                        int v6 = this.zzhY == null ? 0 : this.zzhY.length;
                        zzc[] arr_zzaf$zzc = new zzc[v5 + v6];
                        if(v6 != 0) {
                            System.arraycopy(this.zzhY, 0, arr_zzaf$zzc, 0, v6);
                        }
                        while(v6 < arr_zzaf$zzc.length - 1) {
                            arr_zzaf$zzc[v6] = new zzc();
                            zzrf0.zza(arr_zzaf$zzc[v6]);
                            zzrf0.zzBr();
                            ++v6;
                        }
                        arr_zzaf$zzc[v6] = new zzc();
                        zzrf0.zza(arr_zzaf$zzc[v6]);
                        this.zzhY = arr_zzaf$zzc;
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }
    }

    public static final class zze extends zzrh {
        public int key;
        public int value;
        private static volatile zze[] zzhZ;

        public zze() {
            this.zzI();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            return !(o instanceof zze) || this.key != ((zze)o).key || this.value != ((zze)o).value ? false : this.zza(((zze)o));
        }

        @Override
        public int hashCode() {
            return ((this.key + 0x20F) * 0x1F + this.value) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            return super.zzB() + zzrg.zzA(1, this.key) + zzrg.zzA(2, this.value);
        }

        public static zze[] zzH() {
            if(zze.zzhZ == null) {
                Object object0 = zzrl.zzaWe;
                synchronized(object0) {
                    if(zze.zzhZ == null) {
                        zze.zzhZ = new zze[0];
                    }
                }
            }
            return zze.zzhZ;
        }

        public zze zzI() {
            this.key = 0;
            this.value = 0;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            zzrg0.zzy(1, this.key);
            zzrg0.zzy(2, this.value);
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzf(zzrf0);
        }

        public zze zzf(zzrf zzrf0) throws IOException {
            while(true) {
                int v = zzrf0.zzBr();
                switch(v) {
                    case 0: {
                        return this;
                    label_4:
                        if(this.zza(zzrf0, v)) {
                            break;
                        }
                        return this;
                    }
                    case 8: {
                        this.key = zzrf0.zzBu();
                        break;
                    }
                    case 16: {
                        this.value = zzrf0.zzBu();
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }
    }

    public static final class zzf extends zzrh {
        public String version;
        public String[] zzia;
        public String[] zzib;
        public com.google.android.gms.internal.zzag.zza[] zzic;
        public zze[] zzid;
        public zzb[] zzie;
        public zzb[] zzif;
        public zzb[] zzig;
        public zzg[] zzih;
        public String zzii;
        public String zzij;
        public String zzik;
        public zza zzil;
        public float zzim;
        public boolean zzin;
        public String[] zzio;
        public int zzip;

        public zzf() {
            this.zzJ();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zzf) {
                zzf zzaf$zzf0 = (zzf)o;
                if(zzrl.equals(this.zzia, zzaf$zzf0.zzia) && zzrl.equals(this.zzib, zzaf$zzf0.zzib) && zzrl.equals(this.zzic, zzaf$zzf0.zzic) && zzrl.equals(this.zzid, zzaf$zzf0.zzid) && zzrl.equals(this.zzie, zzaf$zzf0.zzie) && zzrl.equals(this.zzif, zzaf$zzf0.zzif) && zzrl.equals(this.zzig, zzaf$zzf0.zzig) && zzrl.equals(this.zzih, zzaf$zzf0.zzih)) {
                    if(this.zzii != null) {
                        if(!this.zzii.equals(zzaf$zzf0.zzii)) {
                            return false;
                        }
                    label_10:
                        if(this.zzij != null) {
                            if(!this.zzij.equals(zzaf$zzf0.zzij)) {
                                return false;
                            }
                        label_15:
                            if(this.zzik != null) {
                                if(!this.zzik.equals(zzaf$zzf0.zzik)) {
                                    return false;
                                }
                            label_20:
                                if(this.version != null) {
                                    if(!this.version.equals(zzaf$zzf0.version)) {
                                        return false;
                                    }
                                label_25:
                                    if(this.zzil != null) {
                                        if(!this.zzil.equals(zzaf$zzf0.zzil)) {
                                            return false;
                                        }
                                        return Float.floatToIntBits(this.zzim) != Float.floatToIntBits(zzaf$zzf0.zzim) || this.zzin != zzaf$zzf0.zzin || !zzrl.equals(this.zzio, zzaf$zzf0.zzio) || this.zzip != zzaf$zzf0.zzip ? false : this.zza(zzaf$zzf0);
                                    }
                                    else if(zzaf$zzf0.zzil == null) {
                                        return Float.floatToIntBits(this.zzim) != Float.floatToIntBits(zzaf$zzf0.zzim) || this.zzin != zzaf$zzf0.zzin || !zzrl.equals(this.zzio, zzaf$zzf0.zzio) || this.zzip != zzaf$zzf0.zzip ? false : this.zza(zzaf$zzf0);
                                    }
                                }
                                else if(zzaf$zzf0.version == null) {
                                    goto label_25;
                                }
                            }
                            else if(zzaf$zzf0.zzik == null) {
                                goto label_20;
                            }
                        }
                        else if(zzaf$zzf0.zzij == null) {
                            goto label_15;
                        }
                    }
                    else if(zzaf$zzf0.zzii == null) {
                        goto label_10;
                    }
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = zzrl.hashCode(this.zzia);
            int v2 = zzrl.hashCode(this.zzib);
            int v3 = zzrl.hashCode(this.zzic);
            int v4 = zzrl.hashCode(this.zzid);
            int v5 = zzrl.hashCode(this.zzie);
            int v6 = zzrl.hashCode(this.zzif);
            int v7 = zzrl.hashCode(this.zzig);
            int v8 = zzrl.hashCode(this.zzih);
            int v9 = this.zzii == null ? 0 : this.zzii.hashCode();
            int v10 = this.zzij == null ? 0 : this.zzij.hashCode();
            int v11 = this.zzik == null ? 0 : this.zzik.hashCode();
            int v12 = this.version == null ? 0 : this.version.hashCode();
            if(this.zzil != null) {
                v = this.zzil.hashCode();
            }
            int v13 = Float.floatToIntBits(this.zzim);
            return this.zzin ? (((v * 961 + v1 * 1507551809 + v2 * -505558625 + v3 * -293403007 + v4 * 0x7B1A55F + v5 * 0x94E4B2C1 + v6 * -196513505 + v7 * 0x94446F01 + v8 * 0x67E12CDF + v9 * 887503681 + v10 * 0x1B4D89F + v11 * 0xE1781 + v12 * 0x745F + v13 * 0x1F - 0x5503F62) * 0x1F + zzrl.hashCode(this.zzio)) * 0x1F + this.zzip) * 0x1F + this.zzBI() : (((v * 961 + v1 * 1507551809 + v2 * -505558625 + v3 * -293403007 + v4 * 0x7B1A55F + v5 * 0x94E4B2C1 + v6 * -196513505 + v7 * 0x94446F01 + v8 * 0x67E12CDF + v9 * 887503681 + v10 * 0x1B4D89F + v11 * 0xE1781 + v12 * 0x745F + v13 * 0x1F - 0x5503F5C) * 0x1F + zzrl.hashCode(this.zzio)) * 0x1F + this.zzip) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v5;
            int v1 = super.zzB();
            if(this.zzib == null || this.zzib.length <= 0) {
                v5 = v1;
            }
            else {
                int v3 = 0;
                int v4 = 0;
                for(int v2 = 0; v2 < this.zzib.length; ++v2) {
                    String s = this.zzib[v2];
                    if(s != null) {
                        ++v4;
                        v3 += zzrg.zzfj(s);
                    }
                }
                v5 = v1 + v3 + v4;
            }
            if(this.zzic != null && this.zzic.length > 0) {
                int v6 = v5;
                for(int v7 = 0; v7 < this.zzic.length; ++v7) {
                    com.google.android.gms.internal.zzag.zza zzag$zza0 = this.zzic[v7];
                    if(zzag$zza0 != null) {
                        v6 += zzrg.zzc(2, zzag$zza0);
                    }
                }
                v5 = v6;
            }
            if(this.zzid != null && this.zzid.length > 0) {
                int v8 = v5;
                for(int v9 = 0; v9 < this.zzid.length; ++v9) {
                    zze zzaf$zze0 = this.zzid[v9];
                    if(zzaf$zze0 != null) {
                        v8 += zzrg.zzc(3, zzaf$zze0);
                    }
                }
                v5 = v8;
            }
            if(this.zzie != null && this.zzie.length > 0) {
                int v10 = v5;
                for(int v11 = 0; v11 < this.zzie.length; ++v11) {
                    zzb zzaf$zzb0 = this.zzie[v11];
                    if(zzaf$zzb0 != null) {
                        v10 += zzrg.zzc(4, zzaf$zzb0);
                    }
                }
                v5 = v10;
            }
            if(this.zzif != null && this.zzif.length > 0) {
                int v12 = v5;
                for(int v13 = 0; v13 < this.zzif.length; ++v13) {
                    zzb zzaf$zzb1 = this.zzif[v13];
                    if(zzaf$zzb1 != null) {
                        v12 += zzrg.zzc(5, zzaf$zzb1);
                    }
                }
                v5 = v12;
            }
            if(this.zzig != null && this.zzig.length > 0) {
                int v14 = v5;
                for(int v15 = 0; v15 < this.zzig.length; ++v15) {
                    zzb zzaf$zzb2 = this.zzig[v15];
                    if(zzaf$zzb2 != null) {
                        v14 += zzrg.zzc(6, zzaf$zzb2);
                    }
                }
                v5 = v14;
            }
            if(this.zzih != null && this.zzih.length > 0) {
                int v16 = v5;
                for(int v17 = 0; v17 < this.zzih.length; ++v17) {
                    zzg zzaf$zzg0 = this.zzih[v17];
                    if(zzaf$zzg0 != null) {
                        v16 += zzrg.zzc(7, zzaf$zzg0);
                    }
                }
                v5 = v16;
            }
            if(!this.zzii.equals("")) {
                v5 += zzrg.zzk(9, this.zzii);
            }
            if(!this.zzij.equals("")) {
                v5 += zzrg.zzk(10, this.zzij);
            }
            if(!this.zzik.equals("0")) {
                v5 += zzrg.zzk(12, this.zzik);
            }
            if(!this.version.equals("")) {
                v5 += zzrg.zzk(13, this.version);
            }
            if(this.zzil != null) {
                v5 += zzrg.zzc(14, this.zzil);
            }
            if(Float.floatToIntBits(this.zzim) != 0) {
                v5 += zzrg.zzc(15, this.zzim);
            }
            if(this.zzio != null && this.zzio.length > 0) {
                int v19 = 0;
                int v20 = 0;
                for(int v18 = 0; v18 < this.zzio.length; ++v18) {
                    String s1 = this.zzio[v18];
                    if(s1 != null) {
                        ++v20;
                        v19 += zzrg.zzfj(s1);
                    }
                }
                v5 = v5 + v19 + v20 * 2;
            }
            if(this.zzip != 0) {
                v5 += zzrg.zzA(17, this.zzip);
            }
            if(this.zzin) {
                v5 += zzrg.zzc(18, this.zzin);
            }
            if(this.zzia != null && this.zzia.length > 0) {
                int v21 = 0;
                int v22 = 0;
                for(int v = 0; v < this.zzia.length; ++v) {
                    String s2 = this.zzia[v];
                    if(s2 != null) {
                        ++v22;
                        v21 += zzrg.zzfj(s2);
                    }
                }
                return v5 + v21 + v22 * 2;
            }
            return v5;
        }

        public zzf zzJ() {
            this.zzia = zzrq.zzaWm;
            this.zzib = zzrq.zzaWm;
            this.zzic = com.google.android.gms.internal.zzag.zza.zzQ();
            this.zzid = zze.zzH();
            this.zzie = zzb.zzC();
            this.zzif = zzb.zzC();
            this.zzig = zzb.zzC();
            this.zzih = zzg.zzK();
            this.zzii = "";
            this.zzij = "";
            this.zzik = "0";
            this.version = "";
            this.zzil = null;
            this.zzim = 0.0f;
            this.zzin = false;
            this.zzio = zzrq.zzaWm;
            this.zzip = 0;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(this.zzib != null && this.zzib.length > 0) {
                for(int v1 = 0; v1 < this.zzib.length; ++v1) {
                    String s = this.zzib[v1];
                    if(s != null) {
                        zzrg0.zzb(1, s);
                    }
                }
            }
            if(this.zzic != null && this.zzic.length > 0) {
                for(int v2 = 0; v2 < this.zzic.length; ++v2) {
                    com.google.android.gms.internal.zzag.zza zzag$zza0 = this.zzic[v2];
                    if(zzag$zza0 != null) {
                        zzrg0.zza(2, zzag$zza0);
                    }
                }
            }
            if(this.zzid != null && this.zzid.length > 0) {
                for(int v3 = 0; v3 < this.zzid.length; ++v3) {
                    zze zzaf$zze0 = this.zzid[v3];
                    if(zzaf$zze0 != null) {
                        zzrg0.zza(3, zzaf$zze0);
                    }
                }
            }
            if(this.zzie != null && this.zzie.length > 0) {
                for(int v4 = 0; v4 < this.zzie.length; ++v4) {
                    zzb zzaf$zzb0 = this.zzie[v4];
                    if(zzaf$zzb0 != null) {
                        zzrg0.zza(4, zzaf$zzb0);
                    }
                }
            }
            if(this.zzif != null && this.zzif.length > 0) {
                for(int v5 = 0; v5 < this.zzif.length; ++v5) {
                    zzb zzaf$zzb1 = this.zzif[v5];
                    if(zzaf$zzb1 != null) {
                        zzrg0.zza(5, zzaf$zzb1);
                    }
                }
            }
            if(this.zzig != null && this.zzig.length > 0) {
                for(int v6 = 0; v6 < this.zzig.length; ++v6) {
                    zzb zzaf$zzb2 = this.zzig[v6];
                    if(zzaf$zzb2 != null) {
                        zzrg0.zza(6, zzaf$zzb2);
                    }
                }
            }
            if(this.zzih != null && this.zzih.length > 0) {
                for(int v7 = 0; v7 < this.zzih.length; ++v7) {
                    zzg zzaf$zzg0 = this.zzih[v7];
                    if(zzaf$zzg0 != null) {
                        zzrg0.zza(7, zzaf$zzg0);
                    }
                }
            }
            if(!this.zzii.equals("")) {
                zzrg0.zzb(9, this.zzii);
            }
            if(!this.zzij.equals("")) {
                zzrg0.zzb(10, this.zzij);
            }
            if(!this.zzik.equals("0")) {
                zzrg0.zzb(12, this.zzik);
            }
            if(!this.version.equals("")) {
                zzrg0.zzb(13, this.version);
            }
            if(this.zzil != null) {
                zzrg0.zza(14, this.zzil);
            }
            if(Float.floatToIntBits(this.zzim) != 0) {
                zzrg0.zzb(15, this.zzim);
            }
            if(this.zzio != null && this.zzio.length > 0) {
                for(int v8 = 0; v8 < this.zzio.length; ++v8) {
                    String s1 = this.zzio[v8];
                    if(s1 != null) {
                        zzrg0.zzb(16, s1);
                    }
                }
            }
            if(this.zzip != 0) {
                zzrg0.zzy(17, this.zzip);
            }
            if(this.zzin) {
                zzrg0.zzb(18, this.zzin);
            }
            if(this.zzia != null && this.zzia.length > 0) {
                for(int v = 0; v < this.zzia.length; ++v) {
                    String s2 = this.zzia[v];
                    if(s2 != null) {
                        zzrg0.zzb(19, s2);
                    }
                }
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzg(zzrf0);
        }

        public static zzf zzc(byte[] arr_b) throws zzrm {
            return (zzf)zzrn.zza(new zzf(), arr_b);
        }

        public zzf zzg(zzrf zzrf0) throws IOException {
            while(true) {
                int v = zzrf0.zzBr();
                switch(v) {
                    case 0: {
                        return this;
                    label_4:
                        if(this.zza(zzrf0, v)) {
                            break;
                        }
                        return this;
                    }
                    case 10: {
                        int v1 = zzrq.zzb(zzrf0, 10);
                        int v2 = this.zzib == null ? 0 : this.zzib.length;
                        String[] arr_s = new String[v1 + v2];
                        if(v2 != 0) {
                            System.arraycopy(this.zzib, 0, arr_s, 0, v2);
                        }
                        while(v2 < arr_s.length - 1) {
                            arr_s[v2] = zzrf0.readString();
                            zzrf0.zzBr();
                            ++v2;
                        }
                        arr_s[v2] = zzrf0.readString();
                        this.zzib = arr_s;
                        break;
                    }
                    case 18: {
                        int v3 = zzrq.zzb(zzrf0, 18);
                        int v4 = this.zzic == null ? 0 : this.zzic.length;
                        com.google.android.gms.internal.zzag.zza[] arr_zzag$zza = new com.google.android.gms.internal.zzag.zza[v3 + v4];
                        if(v4 != 0) {
                            System.arraycopy(this.zzic, 0, arr_zzag$zza, 0, v4);
                        }
                        while(v4 < arr_zzag$zza.length - 1) {
                            arr_zzag$zza[v4] = new com.google.android.gms.internal.zzag.zza();
                            zzrf0.zza(arr_zzag$zza[v4]);
                            zzrf0.zzBr();
                            ++v4;
                        }
                        arr_zzag$zza[v4] = new com.google.android.gms.internal.zzag.zza();
                        zzrf0.zza(arr_zzag$zza[v4]);
                        this.zzic = arr_zzag$zza;
                        break;
                    }
                    case 26: {
                        int v5 = zzrq.zzb(zzrf0, 26);
                        int v6 = this.zzid == null ? 0 : this.zzid.length;
                        zze[] arr_zzaf$zze = new zze[v5 + v6];
                        if(v6 != 0) {
                            System.arraycopy(this.zzid, 0, arr_zzaf$zze, 0, v6);
                        }
                        while(v6 < arr_zzaf$zze.length - 1) {
                            arr_zzaf$zze[v6] = new zze();
                            zzrf0.zza(arr_zzaf$zze[v6]);
                            zzrf0.zzBr();
                            ++v6;
                        }
                        arr_zzaf$zze[v6] = new zze();
                        zzrf0.zza(arr_zzaf$zze[v6]);
                        this.zzid = arr_zzaf$zze;
                        break;
                    }
                    case 34: {
                        int v7 = zzrq.zzb(zzrf0, 34);
                        int v8 = this.zzie == null ? 0 : this.zzie.length;
                        zzb[] arr_zzaf$zzb = new zzb[v7 + v8];
                        if(v8 != 0) {
                            System.arraycopy(this.zzie, 0, arr_zzaf$zzb, 0, v8);
                        }
                        while(v8 < arr_zzaf$zzb.length - 1) {
                            arr_zzaf$zzb[v8] = new zzb();
                            zzrf0.zza(arr_zzaf$zzb[v8]);
                            zzrf0.zzBr();
                            ++v8;
                        }
                        arr_zzaf$zzb[v8] = new zzb();
                        zzrf0.zza(arr_zzaf$zzb[v8]);
                        this.zzie = arr_zzaf$zzb;
                        break;
                    }
                    case 42: {
                        int v9 = zzrq.zzb(zzrf0, 42);
                        int v10 = this.zzif == null ? 0 : this.zzif.length;
                        zzb[] arr_zzaf$zzb1 = new zzb[v9 + v10];
                        if(v10 != 0) {
                            System.arraycopy(this.zzif, 0, arr_zzaf$zzb1, 0, v10);
                        }
                        while(v10 < arr_zzaf$zzb1.length - 1) {
                            arr_zzaf$zzb1[v10] = new zzb();
                            zzrf0.zza(arr_zzaf$zzb1[v10]);
                            zzrf0.zzBr();
                            ++v10;
                        }
                        arr_zzaf$zzb1[v10] = new zzb();
                        zzrf0.zza(arr_zzaf$zzb1[v10]);
                        this.zzif = arr_zzaf$zzb1;
                        break;
                    }
                    case 50: {
                        int v11 = zzrq.zzb(zzrf0, 50);
                        int v12 = this.zzig == null ? 0 : this.zzig.length;
                        zzb[] arr_zzaf$zzb2 = new zzb[v11 + v12];
                        if(v12 != 0) {
                            System.arraycopy(this.zzig, 0, arr_zzaf$zzb2, 0, v12);
                        }
                        while(v12 < arr_zzaf$zzb2.length - 1) {
                            arr_zzaf$zzb2[v12] = new zzb();
                            zzrf0.zza(arr_zzaf$zzb2[v12]);
                            zzrf0.zzBr();
                            ++v12;
                        }
                        arr_zzaf$zzb2[v12] = new zzb();
                        zzrf0.zza(arr_zzaf$zzb2[v12]);
                        this.zzig = arr_zzaf$zzb2;
                        break;
                    }
                    case 58: {
                        int v13 = zzrq.zzb(zzrf0, 58);
                        int v14 = this.zzih == null ? 0 : this.zzih.length;
                        zzg[] arr_zzaf$zzg = new zzg[v13 + v14];
                        if(v14 != 0) {
                            System.arraycopy(this.zzih, 0, arr_zzaf$zzg, 0, v14);
                        }
                        while(v14 < arr_zzaf$zzg.length - 1) {
                            arr_zzaf$zzg[v14] = new zzg();
                            zzrf0.zza(arr_zzaf$zzg[v14]);
                            zzrf0.zzBr();
                            ++v14;
                        }
                        arr_zzaf$zzg[v14] = new zzg();
                        zzrf0.zza(arr_zzaf$zzg[v14]);
                        this.zzih = arr_zzaf$zzg;
                        break;
                    }
                    case 74: {
                        this.zzii = zzrf0.readString();
                        break;
                    }
                    case 82: {
                        this.zzij = zzrf0.readString();
                        break;
                    }
                    case 98: {
                        this.zzik = zzrf0.readString();
                        break;
                    }
                    case 106: {
                        this.version = zzrf0.readString();
                        break;
                    }
                    case 0x72: {
                        if(this.zzil == null) {
                            this.zzil = new zza();
                        }
                        zzrf0.zza(this.zzil);
                        break;
                    }
                    case 0x7D: {
                        this.zzim = zzrf0.readFloat();
                        break;
                    }
                    case 130: {
                        int v15 = zzrq.zzb(zzrf0, 130);
                        int v16 = this.zzio == null ? 0 : this.zzio.length;
                        String[] arr_s1 = new String[v15 + v16];
                        if(v16 != 0) {
                            System.arraycopy(this.zzio, 0, arr_s1, 0, v16);
                        }
                        while(v16 < arr_s1.length - 1) {
                            arr_s1[v16] = zzrf0.readString();
                            zzrf0.zzBr();
                            ++v16;
                        }
                        arr_s1[v16] = zzrf0.readString();
                        this.zzio = arr_s1;
                        break;
                    }
                    case 0x88: {
                        this.zzip = zzrf0.zzBu();
                        break;
                    }
                    case 0x90: {
                        this.zzin = zzrf0.zzBv();
                        break;
                    }
                    case 0x9A: {
                        int v17 = zzrq.zzb(zzrf0, 0x9A);
                        int v18 = this.zzia == null ? 0 : this.zzia.length;
                        String[] arr_s2 = new String[v17 + v18];
                        if(v18 != 0) {
                            System.arraycopy(this.zzia, 0, arr_s2, 0, v18);
                        }
                        while(v18 < arr_s2.length - 1) {
                            arr_s2[v18] = zzrf0.readString();
                            zzrf0.zzBr();
                            ++v18;
                        }
                        arr_s2[v18] = zzrf0.readString();
                        this.zzia = arr_s2;
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }
    }

    public static final class zzg extends zzrh {
        public int[] zziA;
        private static volatile zzg[] zziq;
        public int[] zzir;
        public int[] zzis;
        public int[] zzit;
        public int[] zziu;
        public int[] zziv;
        public int[] zziw;
        public int[] zzix;
        public int[] zziy;
        public int[] zziz;

        public zzg() {
            this.zzL();
        }

        // 去混淆评级： 低(36)
        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            return !(o instanceof zzg) || !zzrl.equals(this.zzir, ((zzg)o).zzir) || !zzrl.equals(this.zzis, ((zzg)o).zzis) || !zzrl.equals(this.zzit, ((zzg)o).zzit) || !zzrl.equals(this.zziu, ((zzg)o).zziu) || !zzrl.equals(this.zziv, ((zzg)o).zziv) || !zzrl.equals(this.zziw, ((zzg)o).zziw) || !zzrl.equals(this.zzix, ((zzg)o).zzix) || !zzrl.equals(this.zziy, ((zzg)o).zziy) || !zzrl.equals(this.zziz, ((zzg)o).zziz) || !zzrl.equals(this.zziA, ((zzg)o).zziA) ? false : this.zza(((zzg)o));
        }

        @Override
        public int hashCode() {
            return ((((((((((zzrl.hashCode(this.zzir) + 0x20F) * 0x1F + zzrl.hashCode(this.zzis)) * 0x1F + zzrl.hashCode(this.zzit)) * 0x1F + zzrl.hashCode(this.zziu)) * 0x1F + zzrl.hashCode(this.zziv)) * 0x1F + zzrl.hashCode(this.zziw)) * 0x1F + zzrl.hashCode(this.zzix)) * 0x1F + zzrl.hashCode(this.zziy)) * 0x1F + zzrl.hashCode(this.zziz)) * 0x1F + zzrl.hashCode(this.zziA)) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v4;
            int v1 = super.zzB();
            if(this.zzir == null || this.zzir.length <= 0) {
                v4 = v1;
            }
            else {
                int v3 = 0;
                for(int v2 = 0; v2 < this.zzir.length; ++v2) {
                    v3 += zzrg.zzkJ(this.zzir[v2]);
                }
                v4 = v1 + v3 + this.zzir.length;
            }
            if(this.zzis != null && this.zzis.length > 0) {
                int v6 = 0;
                for(int v5 = 0; v5 < this.zzis.length; ++v5) {
                    v6 += zzrg.zzkJ(this.zzis[v5]);
                }
                v4 = v4 + v6 + this.zzis.length;
            }
            if(this.zzit != null && this.zzit.length > 0) {
                int v8 = 0;
                for(int v7 = 0; v7 < this.zzit.length; ++v7) {
                    v8 += zzrg.zzkJ(this.zzit[v7]);
                }
                v4 = v4 + v8 + this.zzit.length;
            }
            if(this.zziu != null && this.zziu.length > 0) {
                int v10 = 0;
                for(int v9 = 0; v9 < this.zziu.length; ++v9) {
                    v10 += zzrg.zzkJ(this.zziu[v9]);
                }
                v4 = v4 + v10 + this.zziu.length;
            }
            if(this.zziv != null && this.zziv.length > 0) {
                int v12 = 0;
                for(int v11 = 0; v11 < this.zziv.length; ++v11) {
                    v12 += zzrg.zzkJ(this.zziv[v11]);
                }
                v4 = v4 + v12 + this.zziv.length;
            }
            if(this.zziw != null && this.zziw.length > 0) {
                int v14 = 0;
                for(int v13 = 0; v13 < this.zziw.length; ++v13) {
                    v14 += zzrg.zzkJ(this.zziw[v13]);
                }
                v4 = v4 + v14 + this.zziw.length;
            }
            if(this.zzix != null && this.zzix.length > 0) {
                int v16 = 0;
                for(int v15 = 0; v15 < this.zzix.length; ++v15) {
                    v16 += zzrg.zzkJ(this.zzix[v15]);
                }
                v4 = v4 + v16 + this.zzix.length;
            }
            if(this.zziy != null && this.zziy.length > 0) {
                int v18 = 0;
                for(int v17 = 0; v17 < this.zziy.length; ++v17) {
                    v18 += zzrg.zzkJ(this.zziy[v17]);
                }
                v4 = v4 + v18 + this.zziy.length;
            }
            if(this.zziz != null && this.zziz.length > 0) {
                int v20 = 0;
                for(int v19 = 0; v19 < this.zziz.length; ++v19) {
                    v20 += zzrg.zzkJ(this.zziz[v19]);
                }
                v4 = v4 + v20 + this.zziz.length;
            }
            if(this.zziA != null && this.zziA.length > 0) {
                int v21 = 0;
                for(int v = 0; v < this.zziA.length; ++v) {
                    v21 += zzrg.zzkJ(this.zziA[v]);
                }
                return v4 + v21 + this.zziA.length;
            }
            return v4;
        }

        public static zzg[] zzK() {
            if(zzg.zziq == null) {
                Object object0 = zzrl.zzaWe;
                synchronized(object0) {
                    if(zzg.zziq == null) {
                        zzg.zziq = new zzg[0];
                    }
                }
            }
            return zzg.zziq;
        }

        public zzg zzL() {
            this.zzir = zzrq.zzaWh;
            this.zzis = zzrq.zzaWh;
            this.zzit = zzrq.zzaWh;
            this.zziu = zzrq.zzaWh;
            this.zziv = zzrq.zzaWh;
            this.zziw = zzrq.zzaWh;
            this.zzix = zzrq.zzaWh;
            this.zziy = zzrq.zzaWh;
            this.zziz = zzrq.zzaWh;
            this.zziA = zzrq.zzaWh;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(this.zzir != null && this.zzir.length > 0) {
                for(int v1 = 0; v1 < this.zzir.length; ++v1) {
                    zzrg0.zzy(1, this.zzir[v1]);
                }
            }
            if(this.zzis != null && this.zzis.length > 0) {
                for(int v2 = 0; v2 < this.zzis.length; ++v2) {
                    zzrg0.zzy(2, this.zzis[v2]);
                }
            }
            if(this.zzit != null && this.zzit.length > 0) {
                for(int v3 = 0; v3 < this.zzit.length; ++v3) {
                    zzrg0.zzy(3, this.zzit[v3]);
                }
            }
            if(this.zziu != null && this.zziu.length > 0) {
                for(int v4 = 0; v4 < this.zziu.length; ++v4) {
                    zzrg0.zzy(4, this.zziu[v4]);
                }
            }
            if(this.zziv != null && this.zziv.length > 0) {
                for(int v5 = 0; v5 < this.zziv.length; ++v5) {
                    zzrg0.zzy(5, this.zziv[v5]);
                }
            }
            if(this.zziw != null && this.zziw.length > 0) {
                for(int v6 = 0; v6 < this.zziw.length; ++v6) {
                    zzrg0.zzy(6, this.zziw[v6]);
                }
            }
            if(this.zzix != null && this.zzix.length > 0) {
                for(int v7 = 0; v7 < this.zzix.length; ++v7) {
                    zzrg0.zzy(7, this.zzix[v7]);
                }
            }
            if(this.zziy != null && this.zziy.length > 0) {
                for(int v8 = 0; v8 < this.zziy.length; ++v8) {
                    zzrg0.zzy(8, this.zziy[v8]);
                }
            }
            if(this.zziz != null && this.zziz.length > 0) {
                for(int v9 = 0; v9 < this.zziz.length; ++v9) {
                    zzrg0.zzy(9, this.zziz[v9]);
                }
            }
            if(this.zziA != null && this.zziA.length > 0) {
                for(int v = 0; v < this.zziA.length; ++v) {
                    zzrg0.zzy(10, this.zziA[v]);
                }
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzh(zzrf0);
        }

        public zzg zzh(zzrf zzrf0) throws IOException {
            while(true) {
                int v = zzrf0.zzBr();
                switch(v) {
                    case 0: {
                        return this;
                    label_4:
                        if(this.zza(zzrf0, v)) {
                            break;
                        }
                        return this;
                    }
                    case 8: {
                        int v1 = zzrq.zzb(zzrf0, 8);
                        int v2 = this.zzir == null ? 0 : this.zzir.length;
                        int[] arr_v = new int[v1 + v2];
                        if(v2 != 0) {
                            System.arraycopy(this.zzir, 0, arr_v, 0, v2);
                        }
                        while(v2 < arr_v.length - 1) {
                            arr_v[v2] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v2;
                        }
                        arr_v[v2] = zzrf0.zzBu();
                        this.zzir = arr_v;
                        break;
                    }
                    case 10: {
                        int v3 = zzrf0.zzkC(zzrf0.zzBy());
                        int v4 = zzrf0.getPosition();
                        int v5;
                        for(v5 = 0; zzrf0.zzBD() > 0; ++v5) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v4);
                        int v6 = this.zzir == null ? 0 : this.zzir.length;
                        int[] arr_v1 = new int[v5 + v6];
                        if(v6 != 0) {
                            System.arraycopy(this.zzir, 0, arr_v1, 0, v6);
                        }
                        while(v6 < arr_v1.length) {
                            arr_v1[v6] = zzrf0.zzBu();
                            ++v6;
                        }
                        this.zzir = arr_v1;
                        zzrf0.zzkD(v3);
                        break;
                    }
                    case 16: {
                        int v7 = zzrq.zzb(zzrf0, 16);
                        int v8 = this.zzis == null ? 0 : this.zzis.length;
                        int[] arr_v2 = new int[v7 + v8];
                        if(v8 != 0) {
                            System.arraycopy(this.zzis, 0, arr_v2, 0, v8);
                        }
                        while(v8 < arr_v2.length - 1) {
                            arr_v2[v8] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v8;
                        }
                        arr_v2[v8] = zzrf0.zzBu();
                        this.zzis = arr_v2;
                        break;
                    }
                    case 18: {
                        int v9 = zzrf0.zzkC(zzrf0.zzBy());
                        int v10 = zzrf0.getPosition();
                        int v11;
                        for(v11 = 0; zzrf0.zzBD() > 0; ++v11) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v10);
                        int v12 = this.zzis == null ? 0 : this.zzis.length;
                        int[] arr_v3 = new int[v11 + v12];
                        if(v12 != 0) {
                            System.arraycopy(this.zzis, 0, arr_v3, 0, v12);
                        }
                        while(v12 < arr_v3.length) {
                            arr_v3[v12] = zzrf0.zzBu();
                            ++v12;
                        }
                        this.zzis = arr_v3;
                        zzrf0.zzkD(v9);
                        break;
                    }
                    case 24: {
                        int v13 = zzrq.zzb(zzrf0, 24);
                        int v14 = this.zzit == null ? 0 : this.zzit.length;
                        int[] arr_v4 = new int[v13 + v14];
                        if(v14 != 0) {
                            System.arraycopy(this.zzit, 0, arr_v4, 0, v14);
                        }
                        while(v14 < arr_v4.length - 1) {
                            arr_v4[v14] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v14;
                        }
                        arr_v4[v14] = zzrf0.zzBu();
                        this.zzit = arr_v4;
                        break;
                    }
                    case 26: {
                        int v15 = zzrf0.zzkC(zzrf0.zzBy());
                        int v16 = zzrf0.getPosition();
                        int v17;
                        for(v17 = 0; zzrf0.zzBD() > 0; ++v17) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v16);
                        int v18 = this.zzit == null ? 0 : this.zzit.length;
                        int[] arr_v5 = new int[v17 + v18];
                        if(v18 != 0) {
                            System.arraycopy(this.zzit, 0, arr_v5, 0, v18);
                        }
                        while(v18 < arr_v5.length) {
                            arr_v5[v18] = zzrf0.zzBu();
                            ++v18;
                        }
                        this.zzit = arr_v5;
                        zzrf0.zzkD(v15);
                        break;
                    }
                    case 0x20: {
                        int v19 = zzrq.zzb(zzrf0, 0x20);
                        int v20 = this.zziu == null ? 0 : this.zziu.length;
                        int[] arr_v6 = new int[v19 + v20];
                        if(v20 != 0) {
                            System.arraycopy(this.zziu, 0, arr_v6, 0, v20);
                        }
                        while(v20 < arr_v6.length - 1) {
                            arr_v6[v20] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v20;
                        }
                        arr_v6[v20] = zzrf0.zzBu();
                        this.zziu = arr_v6;
                        break;
                    }
                    case 34: {
                        int v21 = zzrf0.zzkC(zzrf0.zzBy());
                        int v22 = zzrf0.getPosition();
                        int v23;
                        for(v23 = 0; zzrf0.zzBD() > 0; ++v23) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v22);
                        int v24 = this.zziu == null ? 0 : this.zziu.length;
                        int[] arr_v7 = new int[v23 + v24];
                        if(v24 != 0) {
                            System.arraycopy(this.zziu, 0, arr_v7, 0, v24);
                        }
                        while(v24 < arr_v7.length) {
                            arr_v7[v24] = zzrf0.zzBu();
                            ++v24;
                        }
                        this.zziu = arr_v7;
                        zzrf0.zzkD(v21);
                        break;
                    }
                    case 40: {
                        int v25 = zzrq.zzb(zzrf0, 40);
                        int v26 = this.zziv == null ? 0 : this.zziv.length;
                        int[] arr_v8 = new int[v25 + v26];
                        if(v26 != 0) {
                            System.arraycopy(this.zziv, 0, arr_v8, 0, v26);
                        }
                        while(v26 < arr_v8.length - 1) {
                            arr_v8[v26] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v26;
                        }
                        arr_v8[v26] = zzrf0.zzBu();
                        this.zziv = arr_v8;
                        break;
                    }
                    case 42: {
                        int v27 = zzrf0.zzkC(zzrf0.zzBy());
                        int v28 = zzrf0.getPosition();
                        int v29;
                        for(v29 = 0; zzrf0.zzBD() > 0; ++v29) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v28);
                        int v30 = this.zziv == null ? 0 : this.zziv.length;
                        int[] arr_v9 = new int[v29 + v30];
                        if(v30 != 0) {
                            System.arraycopy(this.zziv, 0, arr_v9, 0, v30);
                        }
                        while(v30 < arr_v9.length) {
                            arr_v9[v30] = zzrf0.zzBu();
                            ++v30;
                        }
                        this.zziv = arr_v9;
                        zzrf0.zzkD(v27);
                        break;
                    }
                    case 0x30: {
                        int v31 = zzrq.zzb(zzrf0, 0x30);
                        int v32 = this.zziw == null ? 0 : this.zziw.length;
                        int[] arr_v10 = new int[v31 + v32];
                        if(v32 != 0) {
                            System.arraycopy(this.zziw, 0, arr_v10, 0, v32);
                        }
                        while(v32 < arr_v10.length - 1) {
                            arr_v10[v32] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v32;
                        }
                        arr_v10[v32] = zzrf0.zzBu();
                        this.zziw = arr_v10;
                        break;
                    }
                    case 50: {
                        int v33 = zzrf0.zzkC(zzrf0.zzBy());
                        int v34 = zzrf0.getPosition();
                        int v35;
                        for(v35 = 0; zzrf0.zzBD() > 0; ++v35) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v34);
                        int v36 = this.zziw == null ? 0 : this.zziw.length;
                        int[] arr_v11 = new int[v35 + v36];
                        if(v36 != 0) {
                            System.arraycopy(this.zziw, 0, arr_v11, 0, v36);
                        }
                        while(v36 < arr_v11.length) {
                            arr_v11[v36] = zzrf0.zzBu();
                            ++v36;
                        }
                        this.zziw = arr_v11;
                        zzrf0.zzkD(v33);
                        break;
                    }
                    case 56: {
                        int v37 = zzrq.zzb(zzrf0, 56);
                        int v38 = this.zzix == null ? 0 : this.zzix.length;
                        int[] arr_v12 = new int[v37 + v38];
                        if(v38 != 0) {
                            System.arraycopy(this.zzix, 0, arr_v12, 0, v38);
                        }
                        while(v38 < arr_v12.length - 1) {
                            arr_v12[v38] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v38;
                        }
                        arr_v12[v38] = zzrf0.zzBu();
                        this.zzix = arr_v12;
                        break;
                    }
                    case 58: {
                        int v39 = zzrf0.zzkC(zzrf0.zzBy());
                        int v40 = zzrf0.getPosition();
                        int v41;
                        for(v41 = 0; zzrf0.zzBD() > 0; ++v41) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v40);
                        int v42 = this.zzix == null ? 0 : this.zzix.length;
                        int[] arr_v13 = new int[v41 + v42];
                        if(v42 != 0) {
                            System.arraycopy(this.zzix, 0, arr_v13, 0, v42);
                        }
                        while(v42 < arr_v13.length) {
                            arr_v13[v42] = zzrf0.zzBu();
                            ++v42;
                        }
                        this.zzix = arr_v13;
                        zzrf0.zzkD(v39);
                        break;
                    }
                    case 0x40: {
                        int v43 = zzrq.zzb(zzrf0, 0x40);
                        int v44 = this.zziy == null ? 0 : this.zziy.length;
                        int[] arr_v14 = new int[v43 + v44];
                        if(v44 != 0) {
                            System.arraycopy(this.zziy, 0, arr_v14, 0, v44);
                        }
                        while(v44 < arr_v14.length - 1) {
                            arr_v14[v44] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v44;
                        }
                        arr_v14[v44] = zzrf0.zzBu();
                        this.zziy = arr_v14;
                        break;
                    }
                    case 66: {
                        int v45 = zzrf0.zzkC(zzrf0.zzBy());
                        int v46 = zzrf0.getPosition();
                        int v47;
                        for(v47 = 0; zzrf0.zzBD() > 0; ++v47) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v46);
                        int v48 = this.zziy == null ? 0 : this.zziy.length;
                        int[] arr_v15 = new int[v47 + v48];
                        if(v48 != 0) {
                            System.arraycopy(this.zziy, 0, arr_v15, 0, v48);
                        }
                        while(v48 < arr_v15.length) {
                            arr_v15[v48] = zzrf0.zzBu();
                            ++v48;
                        }
                        this.zziy = arr_v15;
                        zzrf0.zzkD(v45);
                        break;
                    }
                    case 72: {
                        int v49 = zzrq.zzb(zzrf0, 72);
                        int v50 = this.zziz == null ? 0 : this.zziz.length;
                        int[] arr_v16 = new int[v49 + v50];
                        if(v50 != 0) {
                            System.arraycopy(this.zziz, 0, arr_v16, 0, v50);
                        }
                        while(v50 < arr_v16.length - 1) {
                            arr_v16[v50] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v50;
                        }
                        arr_v16[v50] = zzrf0.zzBu();
                        this.zziz = arr_v16;
                        break;
                    }
                    case 74: {
                        int v51 = zzrf0.zzkC(zzrf0.zzBy());
                        int v52 = zzrf0.getPosition();
                        int v53;
                        for(v53 = 0; zzrf0.zzBD() > 0; ++v53) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v52);
                        int v54 = this.zziz == null ? 0 : this.zziz.length;
                        int[] arr_v17 = new int[v53 + v54];
                        if(v54 != 0) {
                            System.arraycopy(this.zziz, 0, arr_v17, 0, v54);
                        }
                        while(v54 < arr_v17.length) {
                            arr_v17[v54] = zzrf0.zzBu();
                            ++v54;
                        }
                        this.zziz = arr_v17;
                        zzrf0.zzkD(v51);
                        break;
                    }
                    case 80: {
                        int v55 = zzrq.zzb(zzrf0, 80);
                        int v56 = this.zziA == null ? 0 : this.zziA.length;
                        int[] arr_v18 = new int[v55 + v56];
                        if(v56 != 0) {
                            System.arraycopy(this.zziA, 0, arr_v18, 0, v56);
                        }
                        while(v56 < arr_v18.length - 1) {
                            arr_v18[v56] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v56;
                        }
                        arr_v18[v56] = zzrf0.zzBu();
                        this.zziA = arr_v18;
                        break;
                    }
                    case 82: {
                        int v57 = zzrf0.zzkC(zzrf0.zzBy());
                        int v58 = zzrf0.getPosition();
                        int v59;
                        for(v59 = 0; zzrf0.zzBD() > 0; ++v59) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v58);
                        int v60 = this.zziA == null ? 0 : this.zziA.length;
                        int[] arr_v19 = new int[v59 + v60];
                        if(v60 != 0) {
                            System.arraycopy(this.zziA, 0, arr_v19, 0, v60);
                        }
                        while(v60 < arr_v19.length) {
                            arr_v19[v60] = zzrf0.zzBu();
                            ++v60;
                        }
                        this.zziA = arr_v19;
                        zzrf0.zzkD(v57);
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }
    }

    public static final class zzh extends zzrh {
        public static final zzri zziB;
        private static final zzh[] zziC;
        public int[] zziD;
        public int[] zziE;
        public int[] zziF;
        public int zziG;
        public int[] zziH;
        public int zziI;
        public int zziJ;

        static {
            zzh.zziB = zzri.zza(11, zzh.class, 810);
            zzh.zziC = new zzh[0];
        }

        public zzh() {
            this.zzM();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            return !(o instanceof zzh) || !zzrl.equals(this.zziD, ((zzh)o).zziD) || !zzrl.equals(this.zziE, ((zzh)o).zziE) || !zzrl.equals(this.zziF, ((zzh)o).zziF) || this.zziG != ((zzh)o).zziG || !zzrl.equals(this.zziH, ((zzh)o).zziH) || this.zziI != ((zzh)o).zziI || this.zziJ != ((zzh)o).zziJ ? false : this.zza(((zzh)o));
        }

        @Override
        public int hashCode() {
            return (((((((zzrl.hashCode(this.zziD) + 0x20F) * 0x1F + zzrl.hashCode(this.zziE)) * 0x1F + zzrl.hashCode(this.zziF)) * 0x1F + this.zziG) * 0x1F + zzrl.hashCode(this.zziH)) * 0x1F + this.zziI) * 0x1F + this.zziJ) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v4;
            int v1 = super.zzB();
            if(this.zziD == null || this.zziD.length <= 0) {
                v4 = v1;
            }
            else {
                int v3 = 0;
                for(int v2 = 0; v2 < this.zziD.length; ++v2) {
                    v3 += zzrg.zzkJ(this.zziD[v2]);
                }
                v4 = v1 + v3 + this.zziD.length;
            }
            if(this.zziE != null && this.zziE.length > 0) {
                int v6 = 0;
                for(int v5 = 0; v5 < this.zziE.length; ++v5) {
                    v6 += zzrg.zzkJ(this.zziE[v5]);
                }
                v4 = v4 + v6 + this.zziE.length;
            }
            if(this.zziF != null && this.zziF.length > 0) {
                int v8 = 0;
                for(int v7 = 0; v7 < this.zziF.length; ++v7) {
                    v8 += zzrg.zzkJ(this.zziF[v7]);
                }
                v4 = v4 + v8 + this.zziF.length;
            }
            if(this.zziG != 0) {
                v4 += zzrg.zzA(4, this.zziG);
            }
            if(this.zziH != null && this.zziH.length > 0) {
                int v9 = 0;
                for(int v = 0; v < this.zziH.length; ++v) {
                    v9 += zzrg.zzkJ(this.zziH[v]);
                }
                v4 = v4 + v9 + this.zziH.length;
            }
            if(this.zziI != 0) {
                v4 += zzrg.zzA(6, this.zziI);
            }
            return this.zziJ == 0 ? v4 : v4 + zzrg.zzA(7, this.zziJ);
        }

        public zzh zzM() {
            this.zziD = zzrq.zzaWh;
            this.zziE = zzrq.zzaWh;
            this.zziF = zzrq.zzaWh;
            this.zziG = 0;
            this.zziH = zzrq.zzaWh;
            this.zziI = 0;
            this.zziJ = 0;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(this.zziD != null && this.zziD.length > 0) {
                for(int v1 = 0; v1 < this.zziD.length; ++v1) {
                    zzrg0.zzy(1, this.zziD[v1]);
                }
            }
            if(this.zziE != null && this.zziE.length > 0) {
                for(int v2 = 0; v2 < this.zziE.length; ++v2) {
                    zzrg0.zzy(2, this.zziE[v2]);
                }
            }
            if(this.zziF != null && this.zziF.length > 0) {
                for(int v3 = 0; v3 < this.zziF.length; ++v3) {
                    zzrg0.zzy(3, this.zziF[v3]);
                }
            }
            if(this.zziG != 0) {
                zzrg0.zzy(4, this.zziG);
            }
            if(this.zziH != null && this.zziH.length > 0) {
                for(int v = 0; v < this.zziH.length; ++v) {
                    zzrg0.zzy(5, this.zziH[v]);
                }
            }
            if(this.zziI != 0) {
                zzrg0.zzy(6, this.zziI);
            }
            if(this.zziJ != 0) {
                zzrg0.zzy(7, this.zziJ);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzi(zzrf0);
        }

        public zzh zzi(zzrf zzrf0) throws IOException {
            while(true) {
                int v = zzrf0.zzBr();
                switch(v) {
                    case 0: {
                        return this;
                    label_4:
                        if(this.zza(zzrf0, v)) {
                            break;
                        }
                        return this;
                    }
                    case 8: {
                        int v1 = zzrq.zzb(zzrf0, 8);
                        int v2 = this.zziD == null ? 0 : this.zziD.length;
                        int[] arr_v = new int[v1 + v2];
                        if(v2 != 0) {
                            System.arraycopy(this.zziD, 0, arr_v, 0, v2);
                        }
                        while(v2 < arr_v.length - 1) {
                            arr_v[v2] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v2;
                        }
                        arr_v[v2] = zzrf0.zzBu();
                        this.zziD = arr_v;
                        break;
                    }
                    case 10: {
                        int v3 = zzrf0.zzkC(zzrf0.zzBy());
                        int v4 = zzrf0.getPosition();
                        int v5;
                        for(v5 = 0; zzrf0.zzBD() > 0; ++v5) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v4);
                        int v6 = this.zziD == null ? 0 : this.zziD.length;
                        int[] arr_v1 = new int[v5 + v6];
                        if(v6 != 0) {
                            System.arraycopy(this.zziD, 0, arr_v1, 0, v6);
                        }
                        while(v6 < arr_v1.length) {
                            arr_v1[v6] = zzrf0.zzBu();
                            ++v6;
                        }
                        this.zziD = arr_v1;
                        zzrf0.zzkD(v3);
                        break;
                    }
                    case 16: {
                        int v7 = zzrq.zzb(zzrf0, 16);
                        int v8 = this.zziE == null ? 0 : this.zziE.length;
                        int[] arr_v2 = new int[v7 + v8];
                        if(v8 != 0) {
                            System.arraycopy(this.zziE, 0, arr_v2, 0, v8);
                        }
                        while(v8 < arr_v2.length - 1) {
                            arr_v2[v8] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v8;
                        }
                        arr_v2[v8] = zzrf0.zzBu();
                        this.zziE = arr_v2;
                        break;
                    }
                    case 18: {
                        int v9 = zzrf0.zzkC(zzrf0.zzBy());
                        int v10 = zzrf0.getPosition();
                        int v11;
                        for(v11 = 0; zzrf0.zzBD() > 0; ++v11) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v10);
                        int v12 = this.zziE == null ? 0 : this.zziE.length;
                        int[] arr_v3 = new int[v11 + v12];
                        if(v12 != 0) {
                            System.arraycopy(this.zziE, 0, arr_v3, 0, v12);
                        }
                        while(v12 < arr_v3.length) {
                            arr_v3[v12] = zzrf0.zzBu();
                            ++v12;
                        }
                        this.zziE = arr_v3;
                        zzrf0.zzkD(v9);
                        break;
                    }
                    case 24: {
                        int v13 = zzrq.zzb(zzrf0, 24);
                        int v14 = this.zziF == null ? 0 : this.zziF.length;
                        int[] arr_v4 = new int[v13 + v14];
                        if(v14 != 0) {
                            System.arraycopy(this.zziF, 0, arr_v4, 0, v14);
                        }
                        while(v14 < arr_v4.length - 1) {
                            arr_v4[v14] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v14;
                        }
                        arr_v4[v14] = zzrf0.zzBu();
                        this.zziF = arr_v4;
                        break;
                    }
                    case 26: {
                        int v15 = zzrf0.zzkC(zzrf0.zzBy());
                        int v16 = zzrf0.getPosition();
                        int v17;
                        for(v17 = 0; zzrf0.zzBD() > 0; ++v17) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v16);
                        int v18 = this.zziF == null ? 0 : this.zziF.length;
                        int[] arr_v5 = new int[v17 + v18];
                        if(v18 != 0) {
                            System.arraycopy(this.zziF, 0, arr_v5, 0, v18);
                        }
                        while(v18 < arr_v5.length) {
                            arr_v5[v18] = zzrf0.zzBu();
                            ++v18;
                        }
                        this.zziF = arr_v5;
                        zzrf0.zzkD(v15);
                        break;
                    }
                    case 0x20: {
                        this.zziG = zzrf0.zzBu();
                        break;
                    }
                    case 40: {
                        int v19 = zzrq.zzb(zzrf0, 40);
                        int v20 = this.zziH == null ? 0 : this.zziH.length;
                        int[] arr_v6 = new int[v19 + v20];
                        if(v20 != 0) {
                            System.arraycopy(this.zziH, 0, arr_v6, 0, v20);
                        }
                        while(v20 < arr_v6.length - 1) {
                            arr_v6[v20] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v20;
                        }
                        arr_v6[v20] = zzrf0.zzBu();
                        this.zziH = arr_v6;
                        break;
                    }
                    case 42: {
                        int v21 = zzrf0.zzkC(zzrf0.zzBy());
                        int v22 = zzrf0.getPosition();
                        int v23;
                        for(v23 = 0; zzrf0.zzBD() > 0; ++v23) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v22);
                        int v24 = this.zziH == null ? 0 : this.zziH.length;
                        int[] arr_v7 = new int[v23 + v24];
                        if(v24 != 0) {
                            System.arraycopy(this.zziH, 0, arr_v7, 0, v24);
                        }
                        while(v24 < arr_v7.length) {
                            arr_v7[v24] = zzrf0.zzBu();
                            ++v24;
                        }
                        this.zziH = arr_v7;
                        zzrf0.zzkD(v21);
                        break;
                    }
                    case 0x30: {
                        this.zziI = zzrf0.zzBu();
                        break;
                    }
                    case 56: {
                        this.zziJ = zzrf0.zzBu();
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }
    }

    public static final class zzi extends zzrh {
        public String name;
        private static volatile zzi[] zziK;
        public com.google.android.gms.internal.zzag.zza zziL;
        public zzd zziM;

        public zzi() {
            this.zzO();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zzi) {
                if(this.name != null) {
                    if(!this.name.equals(((zzi)o).name)) {
                        return false;
                    }
                label_8:
                    if(this.zziL != null) {
                        if(!this.zziL.equals(((zzi)o).zziL)) {
                            return false;
                        }
                    label_13:
                        if(this.zziM == null) {
                            return ((zzi)o).zziM == null ? this.zza(((zzi)o)) : false;
                        }
                        return this.zziM.equals(((zzi)o).zziM) ? this.zza(((zzi)o)) : false;
                    }
                    else if(((zzi)o).zziL == null) {
                        goto label_13;
                    }
                }
                else if(((zzi)o).name == null) {
                    goto label_8;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            int v = this.name == null ? 0 : this.name.hashCode();
            if(this.zziL == null) {
                return this.zziM == null ? (v + 0x20F) * 0x745F + this.zzBI() : ((v + 0x20F) * 961 + this.zziM.hashCode()) * 0x1F + this.zzBI();
            }
            int v1 = this.zziL.hashCode();
            return this.zziM == null ? (v1 + (v + 0x20F) * 0x1F) * 961 + this.zzBI() : ((v1 + (v + 0x20F) * 0x1F) * 0x1F + this.zziM.hashCode()) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB();
            if(!this.name.equals("")) {
                v += zzrg.zzk(1, this.name);
            }
            if(this.zziL != null) {
                v += zzrg.zzc(2, this.zziL);
            }
            return this.zziM == null ? v : v + zzrg.zzc(3, this.zziM);
        }

        public static zzi[] zzN() {
            if(zzi.zziK == null) {
                Object object0 = zzrl.zzaWe;
                synchronized(object0) {
                    if(zzi.zziK == null) {
                        zzi.zziK = new zzi[0];
                    }
                }
            }
            return zzi.zziK;
        }

        public zzi zzO() {
            this.name = "";
            this.zziL = null;
            this.zziM = null;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(!this.name.equals("")) {
                zzrg0.zzb(1, this.name);
            }
            if(this.zziL != null) {
                zzrg0.zza(2, this.zziL);
            }
            if(this.zziM != null) {
                zzrg0.zza(3, this.zziM);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzj(zzrf0);
        }

        public zzi zzj(zzrf zzrf0) throws IOException {
            while(true) {
                int v = zzrf0.zzBr();
                switch(v) {
                    case 0: {
                        return this;
                    label_4:
                        if(this.zza(zzrf0, v)) {
                            break;
                        }
                        return this;
                    }
                    case 10: {
                        this.name = zzrf0.readString();
                        break;
                    }
                    case 18: {
                        if(this.zziL == null) {
                            this.zziL = new com.google.android.gms.internal.zzag.zza();
                        }
                        zzrf0.zza(this.zziL);
                        break;
                    }
                    case 26: {
                        if(this.zziM == null) {
                            this.zziM = new zzd();
                        }
                        zzrf0.zza(this.zziM);
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }
    }

    public static final class zzj extends zzrh {
        public zzi[] zziN;
        public zzf zziO;
        public String zziP;

        public zzj() {
            this.zzP();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zzj && zzrl.equals(this.zziN, ((zzj)o).zziN)) {
                if(this.zziO != null) {
                    if(!this.zziO.equals(((zzj)o).zziO)) {
                        return false;
                    }
                label_8:
                    if(this.zziP == null) {
                        return ((zzj)o).zziP == null ? this.zza(((zzj)o)) : false;
                    }
                    return this.zziP.equals(((zzj)o).zziP) ? this.zza(((zzj)o)) : false;
                }
                else if(((zzj)o).zziO == null) {
                    goto label_8;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            int v = zzrl.hashCode(this.zziN);
            if(this.zziO == null) {
                return this.zziP == null ? (v + 0x20F) * 0x745F + this.zzBI() : ((v + 0x20F) * 961 + this.zziP.hashCode()) * 0x1F + this.zzBI();
            }
            int v1 = this.zziO.hashCode();
            return this.zziP == null ? (v1 + (v + 0x20F) * 0x1F) * 961 + this.zzBI() : ((v1 + (v + 0x20F) * 0x1F) * 0x1F + this.zziP.hashCode()) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB();
            if(this.zziN != null && this.zziN.length > 0) {
                for(int v1 = 0; v1 < this.zziN.length; ++v1) {
                    zzi zzaf$zzi0 = this.zziN[v1];
                    if(zzaf$zzi0 != null) {
                        v += zzrg.zzc(1, zzaf$zzi0);
                    }
                }
            }
            if(this.zziO != null) {
                v += zzrg.zzc(2, this.zziO);
            }
            return this.zziP.equals("") ? v : v + zzrg.zzk(3, this.zziP);
        }

        public zzj zzP() {
            this.zziN = zzi.zzN();
            this.zziO = null;
            this.zziP = "";
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(this.zziN != null && this.zziN.length > 0) {
                for(int v = 0; v < this.zziN.length; ++v) {
                    zzi zzaf$zzi0 = this.zziN[v];
                    if(zzaf$zzi0 != null) {
                        zzrg0.zza(1, zzaf$zzi0);
                    }
                }
            }
            if(this.zziO != null) {
                zzrg0.zza(2, this.zziO);
            }
            if(!this.zziP.equals("")) {
                zzrg0.zzb(3, this.zziP);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzk(zzrf0);
        }

        public static zzj zzd(byte[] arr_b) throws zzrm {
            return (zzj)zzrn.zza(new zzj(), arr_b);
        }

        public zzj zzk(zzrf zzrf0) throws IOException {
            while(true) {
                int v = zzrf0.zzBr();
                switch(v) {
                    case 0: {
                        return this;
                    label_4:
                        if(this.zza(zzrf0, v)) {
                            break;
                        }
                        return this;
                    }
                    case 10: {
                        int v1 = zzrq.zzb(zzrf0, 10);
                        int v2 = this.zziN == null ? 0 : this.zziN.length;
                        zzi[] arr_zzaf$zzi = new zzi[v1 + v2];
                        if(v2 != 0) {
                            System.arraycopy(this.zziN, 0, arr_zzaf$zzi, 0, v2);
                        }
                        while(v2 < arr_zzaf$zzi.length - 1) {
                            arr_zzaf$zzi[v2] = new zzi();
                            zzrf0.zza(arr_zzaf$zzi[v2]);
                            zzrf0.zzBr();
                            ++v2;
                        }
                        arr_zzaf$zzi[v2] = new zzi();
                        zzrf0.zza(arr_zzaf$zzi[v2]);
                        this.zziN = arr_zzaf$zzi;
                        break;
                    }
                    case 18: {
                        if(this.zziO == null) {
                            this.zziO = new zzf();
                        }
                        zzrf0.zza(this.zziO);
                        break;
                    }
                    case 26: {
                        this.zziP = zzrf0.readString();
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }
    }

}

