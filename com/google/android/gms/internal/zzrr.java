package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

public interface zzrr {
    public static final class zza extends zzrh {
        public String[] zzaWp;
        public String[] zzaWq;
        public int[] zzaWr;
        public int[] zzaWs;

        public zza() {
            this.zzBW();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            return !(o instanceof zza) || !zzrl.equals(this.zzaWp, ((zza)o).zzaWp) || !zzrl.equals(this.zzaWq, ((zza)o).zzaWq) || !zzrl.equals(this.zzaWr, ((zza)o).zzaWr) || !zzrl.equals(this.zzaWs, ((zza)o).zzaWs) ? false : this.zza(((zza)o));
        }

        @Override
        public int hashCode() {
            return ((((zzrl.hashCode(this.zzaWp) + 0x20F) * 0x1F + zzrl.hashCode(this.zzaWq)) * 0x1F + zzrl.hashCode(this.zzaWr)) * 0x1F + zzrl.hashCode(this.zzaWs)) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v5;
            int v1 = super.zzB();
            if(this.zzaWp == null || this.zzaWp.length <= 0) {
                v5 = v1;
            }
            else {
                int v3 = 0;
                int v4 = 0;
                for(int v2 = 0; v2 < this.zzaWp.length; ++v2) {
                    String s = this.zzaWp[v2];
                    if(s != null) {
                        ++v4;
                        v3 += zzrg.zzfj(s);
                    }
                }
                v5 = v1 + v3 + v4;
            }
            if(this.zzaWq != null && this.zzaWq.length > 0) {
                int v7 = 0;
                int v8 = 0;
                for(int v6 = 0; v6 < this.zzaWq.length; ++v6) {
                    String s1 = this.zzaWq[v6];
                    if(s1 != null) {
                        ++v8;
                        v7 += zzrg.zzfj(s1);
                    }
                }
                v5 = v5 + v7 + v8;
            }
            if(this.zzaWr != null && this.zzaWr.length > 0) {
                int v10 = 0;
                for(int v9 = 0; v9 < this.zzaWr.length; ++v9) {
                    v10 += zzrg.zzkJ(this.zzaWr[v9]);
                }
                v5 = v5 + v10 + this.zzaWr.length;
            }
            if(this.zzaWs != null && this.zzaWs.length > 0) {
                int v11 = 0;
                for(int v = 0; v < this.zzaWs.length; ++v) {
                    v11 += zzrg.zzkJ(this.zzaWs[v]);
                }
                return v5 + v11 + this.zzaWs.length;
            }
            return v5;
        }

        public zza zzB(zzrf zzrf0) throws IOException {
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
                        int v2 = this.zzaWp == null ? 0 : this.zzaWp.length;
                        String[] arr_s = new String[v1 + v2];
                        if(v2 != 0) {
                            System.arraycopy(this.zzaWp, 0, arr_s, 0, v2);
                        }
                        while(v2 < arr_s.length - 1) {
                            arr_s[v2] = zzrf0.readString();
                            zzrf0.zzBr();
                            ++v2;
                        }
                        arr_s[v2] = zzrf0.readString();
                        this.zzaWp = arr_s;
                        break;
                    }
                    case 18: {
                        int v3 = zzrq.zzb(zzrf0, 18);
                        int v4 = this.zzaWq == null ? 0 : this.zzaWq.length;
                        String[] arr_s1 = new String[v3 + v4];
                        if(v4 != 0) {
                            System.arraycopy(this.zzaWq, 0, arr_s1, 0, v4);
                        }
                        while(v4 < arr_s1.length - 1) {
                            arr_s1[v4] = zzrf0.readString();
                            zzrf0.zzBr();
                            ++v4;
                        }
                        arr_s1[v4] = zzrf0.readString();
                        this.zzaWq = arr_s1;
                        break;
                    }
                    case 24: {
                        int v5 = zzrq.zzb(zzrf0, 24);
                        int v6 = this.zzaWr == null ? 0 : this.zzaWr.length;
                        int[] arr_v = new int[v5 + v6];
                        if(v6 != 0) {
                            System.arraycopy(this.zzaWr, 0, arr_v, 0, v6);
                        }
                        while(v6 < arr_v.length - 1) {
                            arr_v[v6] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v6;
                        }
                        arr_v[v6] = zzrf0.zzBu();
                        this.zzaWr = arr_v;
                        break;
                    }
                    case 26: {
                        int v7 = zzrf0.zzkC(zzrf0.zzBy());
                        int v8 = zzrf0.getPosition();
                        int v9;
                        for(v9 = 0; zzrf0.zzBD() > 0; ++v9) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v8);
                        int v10 = this.zzaWr == null ? 0 : this.zzaWr.length;
                        int[] arr_v1 = new int[v9 + v10];
                        if(v10 != 0) {
                            System.arraycopy(this.zzaWr, 0, arr_v1, 0, v10);
                        }
                        while(v10 < arr_v1.length) {
                            arr_v1[v10] = zzrf0.zzBu();
                            ++v10;
                        }
                        this.zzaWr = arr_v1;
                        zzrf0.zzkD(v7);
                        break;
                    }
                    case 0x20: {
                        int v11 = zzrq.zzb(zzrf0, 0x20);
                        int v12 = this.zzaWs == null ? 0 : this.zzaWs.length;
                        int[] arr_v2 = new int[v11 + v12];
                        if(v12 != 0) {
                            System.arraycopy(this.zzaWs, 0, arr_v2, 0, v12);
                        }
                        while(v12 < arr_v2.length - 1) {
                            arr_v2[v12] = zzrf0.zzBu();
                            zzrf0.zzBr();
                            ++v12;
                        }
                        arr_v2[v12] = zzrf0.zzBu();
                        this.zzaWs = arr_v2;
                        break;
                    }
                    case 34: {
                        int v13 = zzrf0.zzkC(zzrf0.zzBy());
                        int v14 = zzrf0.getPosition();
                        int v15;
                        for(v15 = 0; zzrf0.zzBD() > 0; ++v15) {
                            zzrf0.zzBu();
                        }
                        zzrf0.zzkE(v14);
                        int v16 = this.zzaWs == null ? 0 : this.zzaWs.length;
                        int[] arr_v3 = new int[v15 + v16];
                        if(v16 != 0) {
                            System.arraycopy(this.zzaWs, 0, arr_v3, 0, v16);
                        }
                        while(v16 < arr_v3.length) {
                            arr_v3[v16] = zzrf0.zzBu();
                            ++v16;
                        }
                        this.zzaWs = arr_v3;
                        zzrf0.zzkD(v13);
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }

        public zza zzBW() {
            this.zzaWp = zzrq.zzaWm;
            this.zzaWq = zzrq.zzaWm;
            this.zzaWr = zzrq.zzaWh;
            this.zzaWs = zzrq.zzaWh;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(this.zzaWp != null && this.zzaWp.length > 0) {
                for(int v1 = 0; v1 < this.zzaWp.length; ++v1) {
                    String s = this.zzaWp[v1];
                    if(s != null) {
                        zzrg0.zzb(1, s);
                    }
                }
            }
            if(this.zzaWq != null && this.zzaWq.length > 0) {
                for(int v2 = 0; v2 < this.zzaWq.length; ++v2) {
                    String s1 = this.zzaWq[v2];
                    if(s1 != null) {
                        zzrg0.zzb(2, s1);
                    }
                }
            }
            if(this.zzaWr != null && this.zzaWr.length > 0) {
                for(int v3 = 0; v3 < this.zzaWr.length; ++v3) {
                    zzrg0.zzy(3, this.zzaWr[v3]);
                }
            }
            if(this.zzaWs != null && this.zzaWs.length > 0) {
                for(int v = 0; v < this.zzaWs.length; ++v) {
                    zzrg0.zzy(4, this.zzaWs[v]);
                }
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzB(zzrf0);
        }
    }

    public static final class zzb extends zzrh {
        public String version;
        public int zzaWt;
        public String zzaWu;

        public zzb() {
            this.zzBX();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zzb && this.zzaWt == ((zzb)o).zzaWt) {
                if(this.zzaWu != null) {
                    if(!this.zzaWu.equals(((zzb)o).zzaWu)) {
                        return false;
                    }
                label_8:
                    if(this.version == null) {
                        return ((zzb)o).version == null ? this.zza(((zzb)o)) : false;
                    }
                    return this.version.equals(((zzb)o).version) ? this.zza(((zzb)o)) : false;
                }
                else if(((zzb)o).zzaWu == null) {
                    goto label_8;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            int v = (this.zzaWt + 0x20F) * 0x1F;
            if(this.zzaWu == null) {
                return this.version == null ? v * 961 + this.zzBI() : (v * 0x1F + this.version.hashCode()) * 0x1F + this.zzBI();
            }
            int v1 = this.zzaWu.hashCode();
            return this.version == null ? (v1 + v) * 961 + this.zzBI() : ((v1 + v) * 0x1F + this.version.hashCode()) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB();
            if(this.zzaWt != 0) {
                v += zzrg.zzA(1, this.zzaWt);
            }
            if(!this.zzaWu.equals("")) {
                v += zzrg.zzk(2, this.zzaWu);
            }
            return this.version.equals("") ? v : v + zzrg.zzk(3, this.version);
        }

        public zzb zzBX() {
            this.zzaWt = 0;
            this.zzaWu = "";
            this.version = "";
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        public zzb zzC(zzrf zzrf0) throws IOException {
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
                            case 0: 
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
                            case 17: 
                            case 18: 
                            case 19: 
                            case 20: 
                            case 21: 
                            case 22: 
                            case 23: 
                            case 24: 
                            case 25: 
                            case 26: {
                                this.zzaWt = v1;
                            }
                        }
                        break;
                    }
                    case 18: {
                        this.zzaWu = zzrf0.readString();
                        break;
                    }
                    case 26: {
                        this.version = zzrf0.readString();
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
            if(this.zzaWt != 0) {
                zzrg0.zzy(1, this.zzaWt);
            }
            if(!this.zzaWu.equals("")) {
                zzrg0.zzb(2, this.zzaWu);
            }
            if(!this.version.equals("")) {
                zzrg0.zzb(3, this.version);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzC(zzrf0);
        }
    }

    public static final class zzc extends zzrh {
        public byte[] zzaWv;
        public byte[][] zzaWw;
        public boolean zzaWx;

        public zzc() {
            this.zzBY();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            return !(o instanceof zzc) || !Arrays.equals(this.zzaWv, ((zzc)o).zzaWv) || !zzrl.zza(this.zzaWw, ((zzc)o).zzaWw) || this.zzaWx != ((zzc)o).zzaWx ? false : this.zza(((zzc)o));
        }

        @Override
        public int hashCode() {
            int v = Arrays.hashCode(this.zzaWv);
            int v1 = zzrl.zza(this.zzaWw);
            return this.zzaWx ? (v * 961 + v1 * 0x1F + 0x7BF1E) * 0x1F + this.zzBI() : (v * 961 + v1 * 0x1F + 0x7BF24) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v1 = super.zzB();
            if(!Arrays.equals(this.zzaWv, zzrq.zzaWo)) {
                v1 += zzrg.zzb(1, this.zzaWv);
            }
            if(this.zzaWw != null && this.zzaWw.length > 0) {
                int v2 = 0;
                int v3 = 0;
                for(int v = 0; v < this.zzaWw.length; ++v) {
                    byte[] arr_b = this.zzaWw[v];
                    if(arr_b != null) {
                        ++v3;
                        v2 += zzrg.zzC(arr_b);
                    }
                }
                v1 = v1 + v2 + v3;
            }
            return this.zzaWx ? v1 + zzrg.zzc(3, this.zzaWx) : v1;
        }

        public zzc zzBY() {
            this.zzaWv = zzrq.zzaWo;
            this.zzaWw = zzrq.zzaWn;
            this.zzaWx = false;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        public zzc zzD(zzrf zzrf0) throws IOException {
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
                        this.zzaWv = zzrf0.readBytes();
                        break;
                    }
                    case 18: {
                        int v1 = zzrq.zzb(zzrf0, 18);
                        int v2 = this.zzaWw == null ? 0 : this.zzaWw.length;
                        byte[][] arr2_b = new byte[v1 + v2][];
                        if(v2 != 0) {
                            System.arraycopy(this.zzaWw, 0, arr2_b, 0, v2);
                        }
                        while(v2 < arr2_b.length - 1) {
                            arr2_b[v2] = zzrf0.readBytes();
                            zzrf0.zzBr();
                            ++v2;
                        }
                        arr2_b[v2] = zzrf0.readBytes();
                        this.zzaWw = arr2_b;
                        break;
                    }
                    case 24: {
                        this.zzaWx = zzrf0.zzBv();
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
            if(!Arrays.equals(this.zzaWv, zzrq.zzaWo)) {
                zzrg0.zza(1, this.zzaWv);
            }
            if(this.zzaWw != null && this.zzaWw.length > 0) {
                for(int v = 0; v < this.zzaWw.length; ++v) {
                    byte[] arr_b = this.zzaWw[v];
                    if(arr_b != null) {
                        zzrg0.zza(2, arr_b);
                    }
                }
            }
            if(this.zzaWx) {
                zzrg0.zzb(3, this.zzaWx);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzD(zzrf0);
        }
    }

    public static final class zzd extends zzrh {
        public String tag;
        public int zzaWA;
        public int zzaWB;
        public boolean zzaWC;
        public zze[] zzaWD;
        public zzb zzaWE;
        public byte[] zzaWF;
        public byte[] zzaWG;
        public byte[] zzaWH;
        public zza zzaWI;
        public String zzaWJ;
        public long zzaWK;
        public zzc zzaWL;
        public byte[] zzaWM;
        public long zzaWy;
        public long zzaWz;

        public zzd() {
            this.zzBZ();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zzd) {
                zzd zzrr$zzd0 = (zzd)o;
                if(this.zzaWy == zzrr$zzd0.zzaWy && this.zzaWz == zzrr$zzd0.zzaWz) {
                    if(this.tag != null) {
                        if(!this.tag.equals(zzrr$zzd0.tag)) {
                            return false;
                        }
                    label_10:
                        if(this.zzaWA == zzrr$zzd0.zzaWA && this.zzaWB == zzrr$zzd0.zzaWB && this.zzaWC == zzrr$zzd0.zzaWC && zzrl.equals(this.zzaWD, zzrr$zzd0.zzaWD)) {
                            if(this.zzaWE != null) {
                                if(!this.zzaWE.equals(zzrr$zzd0.zzaWE)) {
                                    return false;
                                }
                            label_16:
                                if(Arrays.equals(this.zzaWF, zzrr$zzd0.zzaWF) && Arrays.equals(this.zzaWG, zzrr$zzd0.zzaWG) && Arrays.equals(this.zzaWH, zzrr$zzd0.zzaWH)) {
                                    if(this.zzaWI != null) {
                                        if(!this.zzaWI.equals(zzrr$zzd0.zzaWI)) {
                                            return false;
                                        }
                                    label_22:
                                        if(this.zzaWJ != null) {
                                            if(!this.zzaWJ.equals(zzrr$zzd0.zzaWJ)) {
                                                return false;
                                            }
                                        label_27:
                                            if(this.zzaWK == zzrr$zzd0.zzaWK) {
                                                if(this.zzaWL != null) {
                                                    if(!this.zzaWL.equals(zzrr$zzd0.zzaWL)) {
                                                        return false;
                                                    }
                                                    return Arrays.equals(this.zzaWM, zzrr$zzd0.zzaWM) ? this.zza(zzrr$zzd0) : false;
                                                }
                                                else if(zzrr$zzd0.zzaWL == null) {
                                                    return Arrays.equals(this.zzaWM, zzrr$zzd0.zzaWM) ? this.zza(zzrr$zzd0) : false;
                                                }
                                            }
                                        }
                                        else if(zzrr$zzd0.zzaWJ == null) {
                                            goto label_27;
                                        }
                                    }
                                    else if(zzrr$zzd0.zzaWI == null) {
                                        goto label_22;
                                    }
                                }
                            }
                            else if(zzrr$zzd0.zzaWE == null) {
                                goto label_16;
                            }
                        }
                    }
                    else if(zzrr$zzd0.tag == null) {
                        goto label_10;
                    }
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            int v = ((((this.tag == null ? 0 : this.tag.hashCode()) + ((((int)(this.zzaWy ^ this.zzaWy >>> 0x20)) + 0x20F) * 0x1F + ((int)(this.zzaWz ^ this.zzaWz >>> 0x20))) * 0x1F) * 0x1F + this.zzaWA) * 0x1F + this.zzaWB) * 0x1F;
            int v1 = this.zzaWC ? 0x4CF : 0x4D5;
            int v2 = zzrl.hashCode(this.zzaWD);
            int v3 = this.zzaWE == null ? 0 : this.zzaWE.hashCode();
            int v4 = Arrays.hashCode(this.zzaWF);
            int v5 = Arrays.hashCode(this.zzaWG);
            int v6 = Arrays.hashCode(this.zzaWH);
            int v7 = (((this.zzaWJ == null ? 0 : this.zzaWJ.hashCode()) + ((this.zzaWI == null ? 0 : this.zzaWI.hashCode()) + ((((v3 + ((v1 + v) * 0x1F + v2) * 0x1F) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F) * 0x1F) * 0x1F + ((int)(this.zzaWK ^ this.zzaWK >>> 0x20))) * 0x1F;
            return this.zzaWL == null ? (v7 * 0x1F + Arrays.hashCode(this.zzaWM)) * 0x1F + this.zzBI() : ((v7 + this.zzaWL.hashCode()) * 0x1F + Arrays.hashCode(this.zzaWM)) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB();
            if(this.zzaWy != 0L) {
                v += zzrg.zzd(1, this.zzaWy);
            }
            if(!this.tag.equals("")) {
                v += zzrg.zzk(2, this.tag);
            }
            if(this.zzaWD != null && this.zzaWD.length > 0) {
                int v1 = v;
                for(int v2 = 0; v2 < this.zzaWD.length; ++v2) {
                    zze zzrr$zze0 = this.zzaWD[v2];
                    if(zzrr$zze0 != null) {
                        v1 += zzrg.zzc(3, zzrr$zze0);
                    }
                }
                v = v1;
            }
            if(!Arrays.equals(this.zzaWF, zzrq.zzaWo)) {
                v += zzrg.zzb(6, this.zzaWF);
            }
            if(this.zzaWI != null) {
                v += zzrg.zzc(7, this.zzaWI);
            }
            if(!Arrays.equals(this.zzaWG, zzrq.zzaWo)) {
                v += zzrg.zzb(8, this.zzaWG);
            }
            if(this.zzaWE != null) {
                v += zzrg.zzc(9, this.zzaWE);
            }
            if(this.zzaWC) {
                v += zzrg.zzc(10, this.zzaWC);
            }
            if(this.zzaWA != 0) {
                v += zzrg.zzA(11, this.zzaWA);
            }
            if(this.zzaWB != 0) {
                v += zzrg.zzA(12, this.zzaWB);
            }
            if(!Arrays.equals(this.zzaWH, zzrq.zzaWo)) {
                v += zzrg.zzb(13, this.zzaWH);
            }
            if(!this.zzaWJ.equals("")) {
                v += zzrg.zzk(14, this.zzaWJ);
            }
            if(this.zzaWK != 180000L) {
                v += zzrg.zze(15, this.zzaWK);
            }
            if(this.zzaWL != null) {
                v += zzrg.zzc(16, this.zzaWL);
            }
            if(this.zzaWz != 0L) {
                v += zzrg.zzd(17, this.zzaWz);
            }
            return Arrays.equals(this.zzaWM, zzrq.zzaWo) ? v : v + zzrg.zzb(18, this.zzaWM);
        }

        public zzd zzBZ() {
            this.zzaWy = 0L;
            this.zzaWz = 0L;
            this.tag = "";
            this.zzaWA = 0;
            this.zzaWB = 0;
            this.zzaWC = false;
            this.zzaWD = zze.zzCa();
            this.zzaWE = null;
            this.zzaWF = zzrq.zzaWo;
            this.zzaWG = zzrq.zzaWo;
            this.zzaWH = zzrq.zzaWo;
            this.zzaWI = null;
            this.zzaWJ = "";
            this.zzaWK = 180000L;
            this.zzaWL = null;
            this.zzaWM = zzrq.zzaWo;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        public zzd zzE(zzrf zzrf0) throws IOException {
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
                        this.zzaWy = zzrf0.zzBt();
                        break;
                    }
                    case 18: {
                        this.tag = zzrf0.readString();
                        break;
                    }
                    case 26: {
                        int v1 = zzrq.zzb(zzrf0, 26);
                        int v2 = this.zzaWD == null ? 0 : this.zzaWD.length;
                        zze[] arr_zzrr$zze = new zze[v1 + v2];
                        if(v2 != 0) {
                            System.arraycopy(this.zzaWD, 0, arr_zzrr$zze, 0, v2);
                        }
                        while(v2 < arr_zzrr$zze.length - 1) {
                            arr_zzrr$zze[v2] = new zze();
                            zzrf0.zza(arr_zzrr$zze[v2]);
                            zzrf0.zzBr();
                            ++v2;
                        }
                        arr_zzrr$zze[v2] = new zze();
                        zzrf0.zza(arr_zzrr$zze[v2]);
                        this.zzaWD = arr_zzrr$zze;
                        break;
                    }
                    case 50: {
                        this.zzaWF = zzrf0.readBytes();
                        break;
                    }
                    case 58: {
                        if(this.zzaWI == null) {
                            this.zzaWI = new zza();
                        }
                        zzrf0.zza(this.zzaWI);
                        break;
                    }
                    case 66: {
                        this.zzaWG = zzrf0.readBytes();
                        break;
                    }
                    case 74: {
                        if(this.zzaWE == null) {
                            this.zzaWE = new zzb();
                        }
                        zzrf0.zza(this.zzaWE);
                        break;
                    }
                    case 80: {
                        this.zzaWC = zzrf0.zzBv();
                        break;
                    }
                    case 88: {
                        this.zzaWA = zzrf0.zzBu();
                        break;
                    }
                    case 0x60: {
                        this.zzaWB = zzrf0.zzBu();
                        break;
                    }
                    case 106: {
                        this.zzaWH = zzrf0.readBytes();
                        break;
                    }
                    case 0x72: {
                        this.zzaWJ = zzrf0.readString();
                        break;
                    }
                    case 120: {
                        this.zzaWK = zzrf0.zzBx();
                        break;
                    }
                    case 130: {
                        if(this.zzaWL == null) {
                            this.zzaWL = new zzc();
                        }
                        zzrf0.zza(this.zzaWL);
                        break;
                    }
                    case 0x88: {
                        this.zzaWz = zzrf0.zzBt();
                        break;
                    }
                    case 0x92: {
                        this.zzaWM = zzrf0.readBytes();
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
            if(this.zzaWy != 0L) {
                zzrg0.zzb(1, this.zzaWy);
            }
            if(!this.tag.equals("")) {
                zzrg0.zzb(2, this.tag);
            }
            if(this.zzaWD != null && this.zzaWD.length > 0) {
                for(int v = 0; v < this.zzaWD.length; ++v) {
                    zze zzrr$zze0 = this.zzaWD[v];
                    if(zzrr$zze0 != null) {
                        zzrg0.zza(3, zzrr$zze0);
                    }
                }
            }
            if(!Arrays.equals(this.zzaWF, zzrq.zzaWo)) {
                zzrg0.zza(6, this.zzaWF);
            }
            if(this.zzaWI != null) {
                zzrg0.zza(7, this.zzaWI);
            }
            if(!Arrays.equals(this.zzaWG, zzrq.zzaWo)) {
                zzrg0.zza(8, this.zzaWG);
            }
            if(this.zzaWE != null) {
                zzrg0.zza(9, this.zzaWE);
            }
            if(this.zzaWC) {
                zzrg0.zzb(10, this.zzaWC);
            }
            if(this.zzaWA != 0) {
                zzrg0.zzy(11, this.zzaWA);
            }
            if(this.zzaWB != 0) {
                zzrg0.zzy(12, this.zzaWB);
            }
            if(!Arrays.equals(this.zzaWH, zzrq.zzaWo)) {
                zzrg0.zza(13, this.zzaWH);
            }
            if(!this.zzaWJ.equals("")) {
                zzrg0.zzb(14, this.zzaWJ);
            }
            if(this.zzaWK != 180000L) {
                zzrg0.zzc(15, this.zzaWK);
            }
            if(this.zzaWL != null) {
                zzrg0.zza(16, this.zzaWL);
            }
            if(this.zzaWz != 0L) {
                zzrg0.zzb(17, this.zzaWz);
            }
            if(!Arrays.equals(this.zzaWM, zzrq.zzaWo)) {
                zzrg0.zza(18, this.zzaWM);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzE(zzrf0);
        }
    }

    public static final class zze extends zzrh {
        public String value;
        public String zzaC;
        private static volatile zze[] zzaWN;

        public zze() {
            this.zzCb();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zze) {
                if(this.zzaC != null) {
                    if(!this.zzaC.equals(((zze)o).zzaC)) {
                        return false;
                    }
                label_8:
                    if(this.value == null) {
                        return ((zze)o).value == null ? this.zza(((zze)o)) : false;
                    }
                    return this.value.equals(((zze)o).value) ? this.zza(((zze)o)) : false;
                }
                else if(((zze)o).zzaC == null) {
                    goto label_8;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            if(this.zzaC == null) {
                return this.value == null ? this.zzBI() + 0x7BA4F : (this.value.hashCode() + 0x3FD1) * 0x1F + this.zzBI();
            }
            int v = this.zzaC.hashCode();
            return this.value == null ? (v + 0x20F) * 961 + this.zzBI() : ((v + 0x20F) * 0x1F + this.value.hashCode()) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB();
            if(!this.zzaC.equals("")) {
                v += zzrg.zzk(1, this.zzaC);
            }
            return this.value.equals("") ? v : v + zzrg.zzk(2, this.value);
        }

        public static zze[] zzCa() {
            if(zze.zzaWN == null) {
                Object object0 = zzrl.zzaWe;
                synchronized(object0) {
                    if(zze.zzaWN == null) {
                        zze.zzaWN = new zze[0];
                    }
                }
            }
            return zze.zzaWN;
        }

        public zze zzCb() {
            this.zzaC = "";
            this.value = "";
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        public zze zzF(zzrf zzrf0) throws IOException {
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
                    case 18: {
                        this.value = zzrf0.readString();
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
            if(!this.zzaC.equals("")) {
                zzrg0.zzb(1, this.zzaC);
            }
            if(!this.value.equals("")) {
                zzrg0.zzb(2, this.value);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzF(zzrf0);
        }
    }

}

