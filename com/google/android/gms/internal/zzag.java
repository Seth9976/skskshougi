package com.google.android.gms.internal;

import java.io.IOException;

public interface zzag {
    public static final class zza extends zzrh {
        public int type;
        private static volatile zza[] zziQ;
        public String zziR;
        public zza[] zziS;
        public zza[] zziT;
        public zza[] zziU;
        public String zziV;
        public String zziW;
        public long zziX;
        public boolean zziY;
        public zza[] zziZ;
        public int[] zzja;
        public boolean zzjb;

        public zza() {
            this.zzR();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zza && this.type == ((zza)o).type) {
                if(this.zziR != null) {
                    if(!this.zziR.equals(((zza)o).zziR)) {
                        return false;
                    }
                label_8:
                    if(zzrl.equals(this.zziS, ((zza)o).zziS) && zzrl.equals(this.zziT, ((zza)o).zziT) && zzrl.equals(this.zziU, ((zza)o).zziU)) {
                        if(this.zziV != null) {
                            if(!this.zziV.equals(((zza)o).zziV)) {
                                return false;
                            }
                        label_14:
                            if(this.zziW != null) {
                                if(!this.zziW.equals(((zza)o).zziW)) {
                                    return false;
                                }
                                return this.zziX != ((zza)o).zziX || this.zziY != ((zza)o).zziY || !zzrl.equals(this.zziZ, ((zza)o).zziZ) || !zzrl.equals(this.zzja, ((zza)o).zzja) || this.zzjb != ((zza)o).zzjb ? false : this.zza(((zza)o));
                            }
                            else if(((zza)o).zziW == null) {
                                return this.zziX != ((zza)o).zziX || this.zziY != ((zza)o).zziY || !zzrl.equals(this.zziZ, ((zza)o).zziZ) || !zzrl.equals(this.zzja, ((zza)o).zzja) || this.zzjb != ((zza)o).zzjb ? false : this.zza(((zza)o));
                            }
                        }
                        else if(((zza)o).zziV == null) {
                            goto label_14;
                        }
                    }
                }
                else if(((zza)o).zziR == null) {
                    goto label_8;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = (this.type + 0x20F) * 0x1F;
            int v2 = this.zziR == null ? 0 : this.zziR.hashCode();
            int v3 = zzrl.hashCode(this.zziS);
            int v4 = zzrl.hashCode(this.zziT);
            int v5 = zzrl.hashCode(this.zziU);
            int v6 = this.zziV == null ? 0 : this.zziV.hashCode();
            if(this.zziW != null) {
                v = this.zziW.hashCode();
            }
            int v7 = (((v6 + ((((v2 + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F) * 0x1F + v) * 0x1F + ((int)(this.zziX ^ this.zziX >>> 0x20))) * 0x1F;
            int v8 = this.zziY ? 0x4CF : 0x4D5;
            int v9 = zzrl.hashCode(this.zziZ);
            int v10 = zzrl.hashCode(this.zzja);
            return this.zzjb ? ((((v8 + v7) * 0x1F + v9) * 0x1F + v10) * 0x1F + 0x4CF) * 0x1F + this.zzBI() : ((((v8 + v7) * 0x1F + v9) * 0x1F + v10) * 0x1F + 0x4D5) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v1 = super.zzB() + zzrg.zzA(1, this.type);
            if(!this.zziR.equals("")) {
                v1 += zzrg.zzk(2, this.zziR);
            }
            if(this.zziS != null && this.zziS.length > 0) {
                int v2 = v1;
                for(int v3 = 0; v3 < this.zziS.length; ++v3) {
                    zza zzag$zza0 = this.zziS[v3];
                    if(zzag$zza0 != null) {
                        v2 += zzrg.zzc(3, zzag$zza0);
                    }
                }
                v1 = v2;
            }
            if(this.zziT != null && this.zziT.length > 0) {
                int v4 = v1;
                for(int v5 = 0; v5 < this.zziT.length; ++v5) {
                    zza zzag$zza1 = this.zziT[v5];
                    if(zzag$zza1 != null) {
                        v4 += zzrg.zzc(4, zzag$zza1);
                    }
                }
                v1 = v4;
            }
            if(this.zziU != null && this.zziU.length > 0) {
                int v6 = v1;
                for(int v7 = 0; v7 < this.zziU.length; ++v7) {
                    zza zzag$zza2 = this.zziU[v7];
                    if(zzag$zza2 != null) {
                        v6 += zzrg.zzc(5, zzag$zza2);
                    }
                }
                v1 = v6;
            }
            if(!this.zziV.equals("")) {
                v1 += zzrg.zzk(6, this.zziV);
            }
            if(!this.zziW.equals("")) {
                v1 += zzrg.zzk(7, this.zziW);
            }
            if(this.zziX != 0L) {
                v1 += zzrg.zzd(8, this.zziX);
            }
            if(this.zzjb) {
                v1 += zzrg.zzc(9, this.zzjb);
            }
            if(this.zzja != null && this.zzja.length > 0) {
                int v9 = 0;
                for(int v8 = 0; v8 < this.zzja.length; ++v8) {
                    v9 += zzrg.zzkJ(this.zzja[v8]);
                }
                v1 = v1 + v9 + this.zzja.length;
            }
            if(this.zziZ != null && this.zziZ.length > 0) {
                for(int v = 0; v < this.zziZ.length; ++v) {
                    zza zzag$zza3 = this.zziZ[v];
                    if(zzag$zza3 != null) {
                        v1 += zzrg.zzc(11, zzag$zza3);
                    }
                }
            }
            return this.zziY ? v1 + zzrg.zzc(12, this.zziY) : v1;
        }

        public static zza[] zzQ() {
            if(zza.zziQ == null) {
                Object object0 = zzrl.zzaWe;
                synchronized(object0) {
                    if(zza.zziQ == null) {
                        zza.zziQ = new zza[0];
                    }
                }
            }
            return zza.zziQ;
        }

        public zza zzR() {
            this.type = 1;
            this.zziR = "";
            this.zziS = zza.zzQ();
            this.zziT = zza.zzQ();
            this.zziU = zza.zzQ();
            this.zziV = "";
            this.zziW = "";
            this.zziX = 0L;
            this.zziY = false;
            this.zziZ = zza.zzQ();
            this.zzja = zzrq.zzaWh;
            this.zzjb = false;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            zzrg0.zzy(1, this.type);
            if(!this.zziR.equals("")) {
                zzrg0.zzb(2, this.zziR);
            }
            if(this.zziS != null && this.zziS.length > 0) {
                for(int v1 = 0; v1 < this.zziS.length; ++v1) {
                    zza zzag$zza0 = this.zziS[v1];
                    if(zzag$zza0 != null) {
                        zzrg0.zza(3, zzag$zza0);
                    }
                }
            }
            if(this.zziT != null && this.zziT.length > 0) {
                for(int v2 = 0; v2 < this.zziT.length; ++v2) {
                    zza zzag$zza1 = this.zziT[v2];
                    if(zzag$zza1 != null) {
                        zzrg0.zza(4, zzag$zza1);
                    }
                }
            }
            if(this.zziU != null && this.zziU.length > 0) {
                for(int v3 = 0; v3 < this.zziU.length; ++v3) {
                    zza zzag$zza2 = this.zziU[v3];
                    if(zzag$zza2 != null) {
                        zzrg0.zza(5, zzag$zza2);
                    }
                }
            }
            if(!this.zziV.equals("")) {
                zzrg0.zzb(6, this.zziV);
            }
            if(!this.zziW.equals("")) {
                zzrg0.zzb(7, this.zziW);
            }
            if(this.zziX != 0L) {
                zzrg0.zzb(8, this.zziX);
            }
            if(this.zzjb) {
                zzrg0.zzb(9, this.zzjb);
            }
            if(this.zzja != null && this.zzja.length > 0) {
                for(int v4 = 0; v4 < this.zzja.length; ++v4) {
                    zzrg0.zzy(10, this.zzja[v4]);
                }
            }
            if(this.zziZ != null && this.zziZ.length > 0) {
                for(int v = 0; v < this.zziZ.length; ++v) {
                    zza zzag$zza3 = this.zziZ[v];
                    if(zzag$zza3 != null) {
                        zzrg0.zza(11, zzag$zza3);
                    }
                }
            }
            if(this.zziY) {
                zzrg0.zzb(12, this.zziY);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzl(zzrf0);
        }

        public zza zzl(zzrf zzrf0) throws IOException {
            int v12;
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
                        switch(v1) {
                            case 1: 
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: 
                            case 8: {
                                this.type = v1;
                            }
                        }
                        break;
                    }
                    case 18: {
                        this.zziR = zzrf0.readString();
                        break;
                    }
                    case 26: {
                        int v2 = zzrq.zzb(zzrf0, 26);
                        int v3 = this.zziS == null ? 0 : this.zziS.length;
                        zza[] arr_zzag$zza = new zza[v2 + v3];
                        if(v3 != 0) {
                            System.arraycopy(this.zziS, 0, arr_zzag$zza, 0, v3);
                        }
                        while(v3 < arr_zzag$zza.length - 1) {
                            arr_zzag$zza[v3] = new zza();
                            zzrf0.zza(arr_zzag$zza[v3]);
                            zzrf0.zzBr();
                            ++v3;
                        }
                        arr_zzag$zza[v3] = new zza();
                        zzrf0.zza(arr_zzag$zza[v3]);
                        this.zziS = arr_zzag$zza;
                        break;
                    }
                    case 34: {
                        int v4 = zzrq.zzb(zzrf0, 34);
                        int v5 = this.zziT == null ? 0 : this.zziT.length;
                        zza[] arr_zzag$zza1 = new zza[v4 + v5];
                        if(v5 != 0) {
                            System.arraycopy(this.zziT, 0, arr_zzag$zza1, 0, v5);
                        }
                        while(v5 < arr_zzag$zza1.length - 1) {
                            arr_zzag$zza1[v5] = new zza();
                            zzrf0.zza(arr_zzag$zza1[v5]);
                            zzrf0.zzBr();
                            ++v5;
                        }
                        arr_zzag$zza1[v5] = new zza();
                        zzrf0.zza(arr_zzag$zza1[v5]);
                        this.zziT = arr_zzag$zza1;
                        break;
                    }
                    case 42: {
                        int v6 = zzrq.zzb(zzrf0, 42);
                        int v7 = this.zziU == null ? 0 : this.zziU.length;
                        zza[] arr_zzag$zza2 = new zza[v6 + v7];
                        if(v7 != 0) {
                            System.arraycopy(this.zziU, 0, arr_zzag$zza2, 0, v7);
                        }
                        while(v7 < arr_zzag$zza2.length - 1) {
                            arr_zzag$zza2[v7] = new zza();
                            zzrf0.zza(arr_zzag$zza2[v7]);
                            zzrf0.zzBr();
                            ++v7;
                        }
                        arr_zzag$zza2[v7] = new zza();
                        zzrf0.zza(arr_zzag$zza2[v7]);
                        this.zziU = arr_zzag$zza2;
                        break;
                    }
                    case 50: {
                        this.zziV = zzrf0.readString();
                        break;
                    }
                    case 58: {
                        this.zziW = zzrf0.readString();
                        break;
                    }
                    case 0x40: {
                        this.zziX = zzrf0.zzBt();
                        break;
                    }
                    case 72: {
                        this.zzjb = zzrf0.zzBv();
                        break;
                    }
                    case 80: {
                        int v8 = zzrq.zzb(zzrf0, 80);
                        int[] arr_v = new int[v8];
                        int v9 = 0;
                        int v10;
                        for(v10 = 0; v9 < v8; v10 = v12) {
                            if(v9 != 0) {
                                zzrf0.zzBr();
                            }
                            int v11 = zzrf0.zzBu();
                            switch(v11) {
                                case 1: 
                                case 2: 
                                case 3: 
                                case 4: 
                                case 5: 
                                case 6: 
                                case 7: 
                                case 8: 
                                case 9: 
                                case 10: 
                                case 11: 
                                case 12: 
                                case 13: 
                                case 14: 
                                case 15: 
                                case 16: 
                                case 17: {
                                    v12 = v10 + 1;
                                    arr_v[v10] = v11;
                                    break;
                                }
                                default: {
                                    v12 = v10;
                                }
                            }
                            ++v9;
                        }
                        if(v10 == 0) {
                            break;
                        }
                        int v13 = this.zzja == null ? 0 : this.zzja.length;
                        if(v13 != 0 || v10 != arr_v.length) {
                            int[] arr_v1 = new int[v13 + v10];
                            if(v13 != 0) {
                                System.arraycopy(this.zzja, 0, arr_v1, 0, v13);
                            }
                            System.arraycopy(arr_v, 0, arr_v1, v13, v10);
                            this.zzja = arr_v1;
                        }
                        else {
                            this.zzja = arr_v;
                        }
                        break;
                    }
                    case 82: {
                        int v14 = zzrf0.zzkC(zzrf0.zzBy());
                        int v15 = zzrf0.getPosition();
                        int v16 = 0;
                        while(zzrf0.zzBD() > 0) {
                            switch(zzrf0.zzBu()) {
                                case 1: 
                                case 2: 
                                case 3: 
                                case 4: 
                                case 5: 
                                case 6: 
                                case 7: 
                                case 8: 
                                case 9: 
                                case 10: 
                                case 11: 
                                case 12: 
                                case 13: 
                                case 14: 
                                case 15: 
                                case 16: 
                                case 17: {
                                    ++v16;
                                }
                            }
                        }
                        if(v16 != 0) {
                            zzrf0.zzkE(v15);
                            int v17 = this.zzja == null ? 0 : this.zzja.length;
                            int[] arr_v2 = new int[v16 + v17];
                            if(v17 != 0) {
                                System.arraycopy(this.zzja, 0, arr_v2, 0, v17);
                            }
                            while(zzrf0.zzBD() > 0) {
                                int v18 = zzrf0.zzBu();
                                switch(v18) {
                                    case 1: 
                                    case 2: 
                                    case 3: 
                                    case 4: 
                                    case 5: 
                                    case 6: 
                                    case 7: 
                                    case 8: 
                                    case 9: 
                                    case 10: 
                                    case 11: 
                                    case 12: 
                                    case 13: 
                                    case 14: 
                                    case 15: 
                                    case 16: 
                                    case 17: {
                                        arr_v2[v17] = v18;
                                        ++v17;
                                    }
                                }
                            }
                            this.zzja = arr_v2;
                        }
                        zzrf0.zzkD(v14);
                        break;
                    }
                    case 90: {
                        int v19 = zzrq.zzb(zzrf0, 90);
                        int v20 = this.zziZ == null ? 0 : this.zziZ.length;
                        zza[] arr_zzag$zza3 = new zza[v19 + v20];
                        if(v20 != 0) {
                            System.arraycopy(this.zziZ, 0, arr_zzag$zza3, 0, v20);
                        }
                        while(v20 < arr_zzag$zza3.length - 1) {
                            arr_zzag$zza3[v20] = new zza();
                            zzrf0.zza(arr_zzag$zza3[v20]);
                            zzrf0.zzBr();
                            ++v20;
                        }
                        arr_zzag$zza3[v20] = new zza();
                        zzrf0.zza(arr_zzag$zza3[v20]);
                        this.zziZ = arr_zzag$zza3;
                        break;
                    }
                    case 0x60: {
                        this.zziY = zzrf0.zzBv();
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

