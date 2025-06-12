package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

public final class zzrc extends zzrh {
    public static final class zza extends zzrh {
        public static final class com.google.android.gms.internal.zzrc.zza.zza extends zzrh {
            public static final class com.google.android.gms.internal.zzrc.zza.zza.zza extends zzrh {
                public String[] zzaVA;
                public long[] zzaVB;
                public float[] zzaVC;
                public long zzaVD;
                public byte[] zzaVq;
                public String zzaVr;
                public double zzaVs;
                public float zzaVt;
                public long zzaVu;
                public int zzaVv;
                public int zzaVw;
                public boolean zzaVx;
                public zza[] zzaVy;
                public com.google.android.gms.internal.zzrc.zza.zza[] zzaVz;

                public com.google.android.gms.internal.zzrc.zza.zza.zza() {
                    this.zzBp();
                }

                @Override
                public boolean equals(Object o) {
                    if(o == this) {
                        return true;
                    }
                    if(o instanceof com.google.android.gms.internal.zzrc.zza.zza.zza && Arrays.equals(this.zzaVq, ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVq)) {
                        if(this.zzaVr != null) {
                            if(!this.zzaVr.equals(((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVr)) {
                                return false;
                            }
                            return Double.doubleToLongBits(this.zzaVs) != Double.doubleToLongBits(((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVs) || Float.floatToIntBits(this.zzaVt) != Float.floatToIntBits(((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVt) || this.zzaVu != ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVu || this.zzaVv != ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVv || this.zzaVw != ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVw || this.zzaVx != ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVx || !zzrl.equals(this.zzaVy, ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVy) || !zzrl.equals(this.zzaVz, ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVz) || !zzrl.equals(this.zzaVA, ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVA) || !zzrl.equals(this.zzaVB, ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVB) || !zzrl.equals(this.zzaVC, ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVC) || this.zzaVD != ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVD ? false : this.zza(((com.google.android.gms.internal.zzrc.zza.zza.zza)o));
                        }
                        else if(((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVr == null) {
                            return Double.doubleToLongBits(this.zzaVs) != Double.doubleToLongBits(((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVs) || Float.floatToIntBits(this.zzaVt) != Float.floatToIntBits(((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVt) || this.zzaVu != ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVu || this.zzaVv != ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVv || this.zzaVw != ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVw || this.zzaVx != ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVx || !zzrl.equals(this.zzaVy, ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVy) || !zzrl.equals(this.zzaVz, ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVz) || !zzrl.equals(this.zzaVA, ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVA) || !zzrl.equals(this.zzaVB, ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVB) || !zzrl.equals(this.zzaVC, ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVC) || this.zzaVD != ((com.google.android.gms.internal.zzrc.zza.zza.zza)o).zzaVD ? false : this.zza(((com.google.android.gms.internal.zzrc.zza.zza.zza)o));
                        }
                    }
                    return false;
                }

                @Override
                public int hashCode() {
                    int v = Arrays.hashCode(this.zzaVq);
                    long v1 = Double.doubleToLongBits(this.zzaVs);
                    int v2 = (((((((this.zzaVr == null ? 0 : this.zzaVr.hashCode()) + (v + 0x20F) * 0x1F) * 0x1F + ((int)(v1 ^ v1 >>> 0x20))) * 0x1F + Float.floatToIntBits(this.zzaVt)) * 0x1F + ((int)(this.zzaVu ^ this.zzaVu >>> 0x20))) * 0x1F + this.zzaVv) * 0x1F + this.zzaVw) * 0x1F;
                    return this.zzaVx ? (((((((v2 + 0x4CF) * 0x1F + zzrl.hashCode(this.zzaVy)) * 0x1F + zzrl.hashCode(this.zzaVz)) * 0x1F + zzrl.hashCode(this.zzaVA)) * 0x1F + zzrl.hashCode(this.zzaVB)) * 0x1F + zzrl.hashCode(this.zzaVC)) * 0x1F + ((int)(this.zzaVD ^ this.zzaVD >>> 0x20))) * 0x1F + this.zzBI() : (((((((v2 + 0x4D5) * 0x1F + zzrl.hashCode(this.zzaVy)) * 0x1F + zzrl.hashCode(this.zzaVz)) * 0x1F + zzrl.hashCode(this.zzaVA)) * 0x1F + zzrl.hashCode(this.zzaVB)) * 0x1F + zzrl.hashCode(this.zzaVC)) * 0x1F + ((int)(this.zzaVD ^ this.zzaVD >>> 0x20))) * 0x1F + this.zzBI();
                }

                @Override  // com.google.android.gms.internal.zzrh
                protected int zzB() {
                    int v1 = super.zzB();
                    if(!Arrays.equals(this.zzaVq, zzrq.zzaWo)) {
                        v1 += zzrg.zzb(1, this.zzaVq);
                    }
                    if(!this.zzaVr.equals("")) {
                        v1 += zzrg.zzk(2, this.zzaVr);
                    }
                    if(Double.doubleToLongBits(this.zzaVs) != 0L) {
                        v1 += zzrg.zzb(3, this.zzaVs);
                    }
                    if(Float.floatToIntBits(this.zzaVt) != 0) {
                        v1 += zzrg.zzc(4, this.zzaVt);
                    }
                    if(this.zzaVu != 0L) {
                        v1 += zzrg.zzd(5, this.zzaVu);
                    }
                    if(this.zzaVv != 0) {
                        v1 += zzrg.zzA(6, this.zzaVv);
                    }
                    if(this.zzaVw != 0) {
                        v1 += zzrg.zzB(7, this.zzaVw);
                    }
                    if(this.zzaVx) {
                        v1 += zzrg.zzc(8, this.zzaVx);
                    }
                    if(this.zzaVy != null && this.zzaVy.length > 0) {
                        int v2 = v1;
                        for(int v3 = 0; v3 < this.zzaVy.length; ++v3) {
                            zza zzrc$zza0 = this.zzaVy[v3];
                            if(zzrc$zza0 != null) {
                                v2 += zzrg.zzc(9, zzrc$zza0);
                            }
                        }
                        v1 = v2;
                    }
                    if(this.zzaVz != null && this.zzaVz.length > 0) {
                        int v4 = v1;
                        for(int v5 = 0; v5 < this.zzaVz.length; ++v5) {
                            com.google.android.gms.internal.zzrc.zza.zza zzrc$zza$zza0 = this.zzaVz[v5];
                            if(zzrc$zza$zza0 != null) {
                                v4 += zzrg.zzc(10, zzrc$zza$zza0);
                            }
                        }
                        v1 = v4;
                    }
                    if(this.zzaVA != null && this.zzaVA.length > 0) {
                        int v7 = 0;
                        int v8 = 0;
                        for(int v6 = 0; v6 < this.zzaVA.length; ++v6) {
                            String s = this.zzaVA[v6];
                            if(s != null) {
                                ++v8;
                                v7 += zzrg.zzfj(s);
                            }
                        }
                        v1 = v1 + v7 + v8;
                    }
                    if(this.zzaVB != null && this.zzaVB.length > 0) {
                        int v9 = 0;
                        for(int v = 0; v < this.zzaVB.length; ++v) {
                            v9 += zzrg.zzY(this.zzaVB[v]);
                        }
                        v1 = v1 + v9 + this.zzaVB.length;
                    }
                    if(this.zzaVD != 0L) {
                        v1 += zzrg.zzd(13, this.zzaVD);
                    }
                    return this.zzaVC == null || this.zzaVC.length <= 0 ? v1 : v1 + this.zzaVC.length * 4 + this.zzaVC.length;
                }

                public com.google.android.gms.internal.zzrc.zza.zza.zza zzBp() {
                    this.zzaVq = zzrq.zzaWo;
                    this.zzaVr = "";
                    this.zzaVs = 0.0;
                    this.zzaVt = 0.0f;
                    this.zzaVu = 0L;
                    this.zzaVv = 0;
                    this.zzaVw = 0;
                    this.zzaVx = false;
                    this.zzaVy = zza.zzBl();
                    this.zzaVz = com.google.android.gms.internal.zzrc.zza.zza.zzBn();
                    this.zzaVA = zzrq.zzaWm;
                    this.zzaVB = zzrq.zzaWi;
                    this.zzaVC = zzrq.zzaWj;
                    this.zzaVD = 0L;
                    this.zzaVU = null;
                    this.zzaWf = -1;
                    return this;
                }

                @Override  // com.google.android.gms.internal.zzrh
                public void zza(zzrg zzrg0) throws IOException {
                    if(!Arrays.equals(this.zzaVq, zzrq.zzaWo)) {
                        zzrg0.zza(1, this.zzaVq);
                    }
                    if(!this.zzaVr.equals("")) {
                        zzrg0.zzb(2, this.zzaVr);
                    }
                    if(Double.doubleToLongBits(this.zzaVs) != 0L) {
                        zzrg0.zza(3, this.zzaVs);
                    }
                    if(Float.floatToIntBits(this.zzaVt) != 0) {
                        zzrg0.zzb(4, this.zzaVt);
                    }
                    if(this.zzaVu != 0L) {
                        zzrg0.zzb(5, this.zzaVu);
                    }
                    if(this.zzaVv != 0) {
                        zzrg0.zzy(6, this.zzaVv);
                    }
                    if(this.zzaVw != 0) {
                        zzrg0.zzz(7, this.zzaVw);
                    }
                    if(this.zzaVx) {
                        zzrg0.zzb(8, this.zzaVx);
                    }
                    if(this.zzaVy != null && this.zzaVy.length > 0) {
                        for(int v1 = 0; v1 < this.zzaVy.length; ++v1) {
                            zza zzrc$zza0 = this.zzaVy[v1];
                            if(zzrc$zza0 != null) {
                                zzrg0.zza(9, zzrc$zza0);
                            }
                        }
                    }
                    if(this.zzaVz != null && this.zzaVz.length > 0) {
                        for(int v2 = 0; v2 < this.zzaVz.length; ++v2) {
                            com.google.android.gms.internal.zzrc.zza.zza zzrc$zza$zza0 = this.zzaVz[v2];
                            if(zzrc$zza$zza0 != null) {
                                zzrg0.zza(10, zzrc$zza$zza0);
                            }
                        }
                    }
                    if(this.zzaVA != null && this.zzaVA.length > 0) {
                        for(int v3 = 0; v3 < this.zzaVA.length; ++v3) {
                            String s = this.zzaVA[v3];
                            if(s != null) {
                                zzrg0.zzb(11, s);
                            }
                        }
                    }
                    if(this.zzaVB != null && this.zzaVB.length > 0) {
                        for(int v4 = 0; v4 < this.zzaVB.length; ++v4) {
                            zzrg0.zzb(12, this.zzaVB[v4]);
                        }
                    }
                    if(this.zzaVD != 0L) {
                        zzrg0.zzb(13, this.zzaVD);
                    }
                    if(this.zzaVC != null && this.zzaVC.length > 0) {
                        for(int v = 0; v < this.zzaVC.length; ++v) {
                            zzrg0.zzb(14, this.zzaVC[v]);
                        }
                    }
                    super.zza(zzrg0);
                }

                @Override  // com.google.android.gms.internal.zzrn
                public zzrn zzb(zzrf zzrf0) throws IOException {
                    return this.zzy(zzrf0);
                }

                public com.google.android.gms.internal.zzrc.zza.zza.zza zzy(zzrf zzrf0) throws IOException {
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
                                this.zzaVq = zzrf0.readBytes();
                                break;
                            }
                            case 18: {
                                this.zzaVr = zzrf0.readString();
                                break;
                            }
                            case 25: {
                                this.zzaVs = zzrf0.readDouble();
                                break;
                            }
                            case 37: {
                                this.zzaVt = zzrf0.readFloat();
                                break;
                            }
                            case 40: {
                                this.zzaVu = zzrf0.zzBt();
                                break;
                            }
                            case 0x30: {
                                this.zzaVv = zzrf0.zzBu();
                                break;
                            }
                            case 56: {
                                this.zzaVw = zzrf0.zzBw();
                                break;
                            }
                            case 0x40: {
                                this.zzaVx = zzrf0.zzBv();
                                break;
                            }
                            case 74: {
                                int v1 = zzrq.zzb(zzrf0, 74);
                                int v2 = this.zzaVy == null ? 0 : this.zzaVy.length;
                                zza[] arr_zzrc$zza = new zza[v1 + v2];
                                if(v2 != 0) {
                                    System.arraycopy(this.zzaVy, 0, arr_zzrc$zza, 0, v2);
                                }
                                while(v2 < arr_zzrc$zza.length - 1) {
                                    arr_zzrc$zza[v2] = new zza();
                                    zzrf0.zza(arr_zzrc$zza[v2]);
                                    zzrf0.zzBr();
                                    ++v2;
                                }
                                arr_zzrc$zza[v2] = new zza();
                                zzrf0.zza(arr_zzrc$zza[v2]);
                                this.zzaVy = arr_zzrc$zza;
                                break;
                            }
                            case 82: {
                                int v3 = zzrq.zzb(zzrf0, 82);
                                int v4 = this.zzaVz == null ? 0 : this.zzaVz.length;
                                com.google.android.gms.internal.zzrc.zza.zza[] arr_zzrc$zza$zza = new com.google.android.gms.internal.zzrc.zza.zza[v3 + v4];
                                if(v4 != 0) {
                                    System.arraycopy(this.zzaVz, 0, arr_zzrc$zza$zza, 0, v4);
                                }
                                while(v4 < arr_zzrc$zza$zza.length - 1) {
                                    arr_zzrc$zza$zza[v4] = new com.google.android.gms.internal.zzrc.zza.zza();
                                    zzrf0.zza(arr_zzrc$zza$zza[v4]);
                                    zzrf0.zzBr();
                                    ++v4;
                                }
                                arr_zzrc$zza$zza[v4] = new com.google.android.gms.internal.zzrc.zza.zza();
                                zzrf0.zza(arr_zzrc$zza$zza[v4]);
                                this.zzaVz = arr_zzrc$zza$zza;
                                break;
                            }
                            case 90: {
                                int v5 = zzrq.zzb(zzrf0, 90);
                                int v6 = this.zzaVA == null ? 0 : this.zzaVA.length;
                                String[] arr_s = new String[v5 + v6];
                                if(v6 != 0) {
                                    System.arraycopy(this.zzaVA, 0, arr_s, 0, v6);
                                }
                                while(v6 < arr_s.length - 1) {
                                    arr_s[v6] = zzrf0.readString();
                                    zzrf0.zzBr();
                                    ++v6;
                                }
                                arr_s[v6] = zzrf0.readString();
                                this.zzaVA = arr_s;
                                break;
                            }
                            case 0x60: {
                                int v7 = zzrq.zzb(zzrf0, 0x60);
                                int v8 = this.zzaVB == null ? 0 : this.zzaVB.length;
                                long[] arr_v = new long[v7 + v8];
                                if(v8 != 0) {
                                    System.arraycopy(this.zzaVB, 0, arr_v, 0, v8);
                                }
                                while(v8 < arr_v.length - 1) {
                                    arr_v[v8] = zzrf0.zzBt();
                                    zzrf0.zzBr();
                                    ++v8;
                                }
                                arr_v[v8] = zzrf0.zzBt();
                                this.zzaVB = arr_v;
                                break;
                            }
                            case 98: {
                                int v9 = zzrf0.zzkC(zzrf0.zzBy());
                                int v10 = zzrf0.getPosition();
                                int v11;
                                for(v11 = 0; zzrf0.zzBD() > 0; ++v11) {
                                    zzrf0.zzBt();
                                }
                                zzrf0.zzkE(v10);
                                int v12 = this.zzaVB == null ? 0 : this.zzaVB.length;
                                long[] arr_v1 = new long[v11 + v12];
                                if(v12 != 0) {
                                    System.arraycopy(this.zzaVB, 0, arr_v1, 0, v12);
                                }
                                while(v12 < arr_v1.length) {
                                    arr_v1[v12] = zzrf0.zzBt();
                                    ++v12;
                                }
                                this.zzaVB = arr_v1;
                                zzrf0.zzkD(v9);
                                break;
                            }
                            case 104: {
                                this.zzaVD = zzrf0.zzBt();
                                break;
                            }
                            case 0x72: {
                                int v13 = zzrf0.zzBy();
                                int v14 = zzrf0.zzkC(v13);
                                int v15 = this.zzaVC == null ? 0 : this.zzaVC.length;
                                float[] arr_f = new float[v13 / 4 + v15];
                                if(v15 != 0) {
                                    System.arraycopy(this.zzaVC, 0, arr_f, 0, v15);
                                }
                                while(v15 < arr_f.length) {
                                    arr_f[v15] = zzrf0.readFloat();
                                    ++v15;
                                }
                                this.zzaVC = arr_f;
                                zzrf0.zzkD(v14);
                                break;
                            }
                            case 0x75: {
                                int v16 = zzrq.zzb(zzrf0, 0x75);
                                int v17 = this.zzaVC == null ? 0 : this.zzaVC.length;
                                float[] arr_f1 = new float[v16 + v17];
                                if(v17 != 0) {
                                    System.arraycopy(this.zzaVC, 0, arr_f1, 0, v17);
                                }
                                while(v17 < arr_f1.length - 1) {
                                    arr_f1[v17] = zzrf0.readFloat();
                                    zzrf0.zzBr();
                                    ++v17;
                                }
                                arr_f1[v17] = zzrf0.readFloat();
                                this.zzaVC = arr_f1;
                                break;
                            }
                            default: {
                                goto label_4;
                            }
                        }
                    }
                }
            }

            public int type;
            private static volatile com.google.android.gms.internal.zzrc.zza.zza[] zzaVo;
            public com.google.android.gms.internal.zzrc.zza.zza.zza zzaVp;

            public com.google.android.gms.internal.zzrc.zza.zza() {
                this.zzBo();
            }

            @Override
            public boolean equals(Object o) {
                if(o == this) {
                    return true;
                }
                if(o instanceof com.google.android.gms.internal.zzrc.zza.zza && this.type == ((com.google.android.gms.internal.zzrc.zza.zza)o).type) {
                    if(this.zzaVp == null) {
                        return ((com.google.android.gms.internal.zzrc.zza.zza)o).zzaVp == null ? this.zza(((com.google.android.gms.internal.zzrc.zza.zza)o)) : false;
                    }
                    return this.zzaVp.equals(((com.google.android.gms.internal.zzrc.zza.zza)o).zzaVp) ? this.zza(((com.google.android.gms.internal.zzrc.zza.zza)o)) : false;
                }
                return false;
            }

            @Override
            public int hashCode() {
                int v = (this.type + 0x20F) * 0x1F;
                return this.zzaVp == null ? v * 0x1F + this.zzBI() : (this.zzaVp.hashCode() + v) * 0x1F + this.zzBI();
            }

            @Override  // com.google.android.gms.internal.zzrh
            protected int zzB() {
                int v = super.zzB() + zzrg.zzA(1, this.type);
                return this.zzaVp == null ? v : v + zzrg.zzc(2, this.zzaVp);
            }

            public static com.google.android.gms.internal.zzrc.zza.zza[] zzBn() {
                if(com.google.android.gms.internal.zzrc.zza.zza.zzaVo == null) {
                    Object object0 = zzrl.zzaWe;
                    synchronized(object0) {
                        if(com.google.android.gms.internal.zzrc.zza.zza.zzaVo == null) {
                            com.google.android.gms.internal.zzrc.zza.zza.zzaVo = new com.google.android.gms.internal.zzrc.zza.zza[0];
                        }
                    }
                }
                return com.google.android.gms.internal.zzrc.zza.zza.zzaVo;
            }

            public com.google.android.gms.internal.zzrc.zza.zza zzBo() {
                this.type = 1;
                this.zzaVp = null;
                this.zzaVU = null;
                this.zzaWf = -1;
                return this;
            }

            @Override  // com.google.android.gms.internal.zzrh
            public void zza(zzrg zzrg0) throws IOException {
                zzrg0.zzy(1, this.type);
                if(this.zzaVp != null) {
                    zzrg0.zza(2, this.zzaVp);
                }
                super.zza(zzrg0);
            }

            @Override  // com.google.android.gms.internal.zzrn
            public zzrn zzb(zzrf zzrf0) throws IOException {
                return this.zzx(zzrf0);
            }

            public com.google.android.gms.internal.zzrc.zza.zza zzx(zzrf zzrf0) throws IOException {
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
                                case 8: 
                                case 9: 
                                case 10: 
                                case 11: 
                                case 12: 
                                case 13: 
                                case 14: 
                                case 15: {
                                    this.type = v1;
                                }
                            }
                            break;
                        }
                        case 18: {
                            if(this.zzaVp == null) {
                                this.zzaVp = new com.google.android.gms.internal.zzrc.zza.zza.zza();
                            }
                            zzrf0.zza(this.zzaVp);
                            break;
                        }
                        default: {
                            goto label_4;
                        }
                    }
                }
            }
        }

        public String name;
        private static volatile zza[] zzaVm;
        public com.google.android.gms.internal.zzrc.zza.zza zzaVn;

        public zza() {
            this.zzBm();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zza) {
                if(this.name != null) {
                    if(!this.name.equals(((zza)o).name)) {
                        return false;
                    }
                label_8:
                    if(this.zzaVn == null) {
                        return ((zza)o).zzaVn == null ? this.zza(((zza)o)) : false;
                    }
                    return this.zzaVn.equals(((zza)o).zzaVn) ? this.zza(((zza)o)) : false;
                }
                else if(((zza)o).name == null) {
                    goto label_8;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            if(this.name == null) {
                return this.zzaVn == null ? this.zzBI() + 0x7BA4F : (this.zzaVn.hashCode() + 0x3FD1) * 0x1F + this.zzBI();
            }
            int v = this.name.hashCode();
            return this.zzaVn == null ? (v + 0x20F) * 961 + this.zzBI() : ((v + 0x20F) * 0x1F + this.zzaVn.hashCode()) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB() + zzrg.zzk(1, this.name);
            return this.zzaVn == null ? v : v + zzrg.zzc(2, this.zzaVn);
        }

        public static zza[] zzBl() {
            if(zza.zzaVm == null) {
                Object object0 = zzrl.zzaWe;
                synchronized(object0) {
                    if(zza.zzaVm == null) {
                        zza.zzaVm = new zza[0];
                    }
                }
            }
            return zza.zzaVm;
        }

        public zza zzBm() {
            this.name = "";
            this.zzaVn = null;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            zzrg0.zzb(1, this.name);
            if(this.zzaVn != null) {
                zzrg0.zza(2, this.zzaVn);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzw(zzrf0);
        }

        public zza zzw(zzrf zzrf0) throws IOException {
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
                        if(this.zzaVn == null) {
                            this.zzaVn = new com.google.android.gms.internal.zzrc.zza.zza();
                        }
                        zzrf0.zza(this.zzaVn);
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }
    }

    public zza[] zzaVl;

    public zzrc() {
        this.zzBk();
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        return !(o instanceof zzrc) || !zzrl.equals(this.zzaVl, ((zzrc)o).zzaVl) ? false : this.zza(((zzrc)o));
    }

    @Override
    public int hashCode() {
        return (zzrl.hashCode(this.zzaVl) + 0x20F) * 0x1F + this.zzBI();
    }

    @Override  // com.google.android.gms.internal.zzrh
    protected int zzB() {
        int v = super.zzB();
        if(this.zzaVl != null && this.zzaVl.length > 0) {
            for(int v1 = 0; v1 < this.zzaVl.length; ++v1) {
                zza zzrc$zza0 = this.zzaVl[v1];
                if(zzrc$zza0 != null) {
                    v += zzrg.zzc(1, zzrc$zza0);
                }
            }
        }
        return v;
    }

    public zzrc zzBk() {
        this.zzaVl = zza.zzBl();
        this.zzaVU = null;
        this.zzaWf = -1;
        return this;
    }

    @Override  // com.google.android.gms.internal.zzrh
    public void zza(zzrg zzrg0) throws IOException {
        if(this.zzaVl != null && this.zzaVl.length > 0) {
            for(int v = 0; v < this.zzaVl.length; ++v) {
                zza zzrc$zza0 = this.zzaVl[v];
                if(zzrc$zza0 != null) {
                    zzrg0.zza(1, zzrc$zza0);
                }
            }
        }
        super.zza(zzrg0);
    }

    @Override  // com.google.android.gms.internal.zzrn
    public zzrn zzb(zzrf zzrf0) throws IOException {
        return this.zzv(zzrf0);
    }

    public zzrc zzv(zzrf zzrf0) throws IOException {
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
                    int v2 = this.zzaVl == null ? 0 : this.zzaVl.length;
                    zza[] arr_zzrc$zza = new zza[v1 + v2];
                    if(v2 != 0) {
                        System.arraycopy(this.zzaVl, 0, arr_zzrc$zza, 0, v2);
                    }
                    while(v2 < arr_zzrc$zza.length - 1) {
                        arr_zzrc$zza[v2] = new zza();
                        zzrf0.zza(arr_zzrc$zza[v2]);
                        zzrf0.zzBr();
                        ++v2;
                    }
                    arr_zzrc$zza[v2] = new zza();
                    zzrf0.zza(arr_zzrc$zza[v2]);
                    this.zzaVl = arr_zzrc$zza;
                    break;
                }
                default: {
                    goto label_4;
                }
            }
        }
    }

    public static zzrc zzw(byte[] arr_b) throws zzrm {
        return (zzrc)zzrn.zza(new zzrc(), arr_b);
    }
}

