package com.google.android.gms.internal;

import java.io.IOException;

public final class zzrd extends zzrh {
    public String[] zzaVE;
    public int[] zzaVF;
    public byte[][] zzaVG;

    public zzrd() {
        this.zzBq();
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        return !(o instanceof zzrd) || !zzrl.equals(this.zzaVE, ((zzrd)o).zzaVE) || !zzrl.equals(this.zzaVF, ((zzrd)o).zzaVF) || !zzrl.zza(this.zzaVG, ((zzrd)o).zzaVG) ? false : this.zza(((zzrd)o));
    }

    @Override
    public int hashCode() {
        return (((zzrl.hashCode(this.zzaVE) + 0x20F) * 0x1F + zzrl.hashCode(this.zzaVF)) * 0x1F + zzrl.zza(this.zzaVG)) * 0x1F + this.zzBI();
    }

    @Override  // com.google.android.gms.internal.zzrh
    protected int zzB() {
        int v5;
        int v1 = super.zzB();
        if(this.zzaVE == null || this.zzaVE.length <= 0) {
            v5 = v1;
        }
        else {
            int v3 = 0;
            int v4 = 0;
            for(int v2 = 0; v2 < this.zzaVE.length; ++v2) {
                String s = this.zzaVE[v2];
                if(s != null) {
                    ++v4;
                    v3 += zzrg.zzfj(s);
                }
            }
            v5 = v1 + v3 + v4;
        }
        if(this.zzaVF != null && this.zzaVF.length > 0) {
            int v7 = 0;
            for(int v6 = 0; v6 < this.zzaVF.length; ++v6) {
                v7 += zzrg.zzkJ(this.zzaVF[v6]);
            }
            v5 = v5 + v7 + this.zzaVF.length;
        }
        if(this.zzaVG != null && this.zzaVG.length > 0) {
            int v8 = 0;
            int v9 = 0;
            for(int v = 0; v < this.zzaVG.length; ++v) {
                byte[] arr_b = this.zzaVG[v];
                if(arr_b != null) {
                    ++v9;
                    v8 += zzrg.zzC(arr_b);
                }
            }
            return v5 + v8 + v9;
        }
        return v5;
    }

    public zzrd zzBq() {
        this.zzaVE = zzrq.zzaWm;
        this.zzaVF = zzrq.zzaWh;
        this.zzaVG = zzrq.zzaWn;
        this.zzaVU = null;
        this.zzaWf = -1;
        return this;
    }

    @Override  // com.google.android.gms.internal.zzrh
    public void zza(zzrg zzrg0) throws IOException {
        if(this.zzaVE != null && this.zzaVE.length > 0) {
            for(int v1 = 0; v1 < this.zzaVE.length; ++v1) {
                String s = this.zzaVE[v1];
                if(s != null) {
                    zzrg0.zzb(1, s);
                }
            }
        }
        if(this.zzaVF != null && this.zzaVF.length > 0) {
            for(int v2 = 0; v2 < this.zzaVF.length; ++v2) {
                zzrg0.zzy(2, this.zzaVF[v2]);
            }
        }
        if(this.zzaVG != null && this.zzaVG.length > 0) {
            for(int v = 0; v < this.zzaVG.length; ++v) {
                byte[] arr_b = this.zzaVG[v];
                if(arr_b != null) {
                    zzrg0.zza(3, arr_b);
                }
            }
        }
        super.zza(zzrg0);
    }

    @Override  // com.google.android.gms.internal.zzrn
    public zzrn zzb(zzrf zzrf0) throws IOException {
        return this.zzz(zzrf0);
    }

    public static zzrd zzx(byte[] arr_b) throws zzrm {
        return (zzrd)zzrn.zza(new zzrd(), arr_b);
    }

    public zzrd zzz(zzrf zzrf0) throws IOException {
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
                    int v2 = this.zzaVE == null ? 0 : this.zzaVE.length;
                    String[] arr_s = new String[v1 + v2];
                    if(v2 != 0) {
                        System.arraycopy(this.zzaVE, 0, arr_s, 0, v2);
                    }
                    while(v2 < arr_s.length - 1) {
                        arr_s[v2] = zzrf0.readString();
                        zzrf0.zzBr();
                        ++v2;
                    }
                    arr_s[v2] = zzrf0.readString();
                    this.zzaVE = arr_s;
                    break;
                }
                case 16: {
                    int v3 = zzrq.zzb(zzrf0, 16);
                    int v4 = this.zzaVF == null ? 0 : this.zzaVF.length;
                    int[] arr_v = new int[v3 + v4];
                    if(v4 != 0) {
                        System.arraycopy(this.zzaVF, 0, arr_v, 0, v4);
                    }
                    while(v4 < arr_v.length - 1) {
                        arr_v[v4] = zzrf0.zzBu();
                        zzrf0.zzBr();
                        ++v4;
                    }
                    arr_v[v4] = zzrf0.zzBu();
                    this.zzaVF = arr_v;
                    break;
                }
                case 18: {
                    int v5 = zzrf0.zzkC(zzrf0.zzBy());
                    int v6 = zzrf0.getPosition();
                    int v7;
                    for(v7 = 0; zzrf0.zzBD() > 0; ++v7) {
                        zzrf0.zzBu();
                    }
                    zzrf0.zzkE(v6);
                    int v8 = this.zzaVF == null ? 0 : this.zzaVF.length;
                    int[] arr_v1 = new int[v7 + v8];
                    if(v8 != 0) {
                        System.arraycopy(this.zzaVF, 0, arr_v1, 0, v8);
                    }
                    while(v8 < arr_v1.length) {
                        arr_v1[v8] = zzrf0.zzBu();
                        ++v8;
                    }
                    this.zzaVF = arr_v1;
                    zzrf0.zzkD(v5);
                    break;
                }
                case 26: {
                    int v9 = zzrq.zzb(zzrf0, 26);
                    int v10 = this.zzaVG == null ? 0 : this.zzaVG.length;
                    byte[][] arr2_b = new byte[v9 + v10][];
                    if(v10 != 0) {
                        System.arraycopy(this.zzaVG, 0, arr2_b, 0, v10);
                    }
                    while(v10 < arr2_b.length - 1) {
                        arr2_b[v10] = zzrf0.readBytes();
                        zzrf0.zzBr();
                        ++v10;
                    }
                    arr2_b[v10] = zzrf0.readBytes();
                    this.zzaVG = arr2_b;
                    break;
                }
                default: {
                    goto label_4;
                }
            }
        }
    }
}

