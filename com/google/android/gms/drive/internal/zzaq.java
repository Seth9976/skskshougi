package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzrg;
import com.google.android.gms.internal.zzrh;
import com.google.android.gms.internal.zzrn;
import java.io.IOException;

public final class zzaq extends zzrh {
    public int versionCode;
    public long zzafU;
    public long zzafV;
    public long zzafW;

    public zzaq() {
        this.zzpG();
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        return !(o instanceof zzaq) || this.versionCode != ((zzaq)o).versionCode || this.zzafU != ((zzaq)o).zzafU || this.zzafV != ((zzaq)o).zzafV || this.zzafW != ((zzaq)o).zzafW ? false : this.zza(((zzaq)o));
    }

    @Override
    public int hashCode() {
        return ((((this.versionCode + 0x20F) * 0x1F + ((int)(this.zzafU ^ this.zzafU >>> 0x20))) * 0x1F + ((int)(this.zzafV ^ this.zzafV >>> 0x20))) * 0x1F + ((int)(this.zzafW ^ this.zzafW >>> 0x20))) * 0x1F + this.zzBI();
    }

    @Override  // com.google.android.gms.internal.zzrh
    protected int zzB() {
        return super.zzB() + zzrg.zzA(1, this.versionCode) + zzrg.zze(2, this.zzafU) + zzrg.zze(3, this.zzafV) + zzrg.zze(4, this.zzafW);
    }

    @Override  // com.google.android.gms.internal.zzrh
    public void zza(zzrg zzrg0) throws IOException {
        zzrg0.zzy(1, this.versionCode);
        zzrg0.zzc(2, this.zzafU);
        zzrg0.zzc(3, this.zzafV);
        zzrg0.zzc(4, this.zzafW);
        super.zza(zzrg0);
    }

    @Override  // com.google.android.gms.internal.zzrn
    public zzrn zzb(zzrf zzrf0) throws IOException {
        return this.zzm(zzrf0);
    }

    public zzaq zzm(zzrf zzrf0) throws IOException {
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
                    this.versionCode = zzrf0.zzBu();
                    break;
                }
                case 16: {
                    this.zzafU = zzrf0.zzBx();
                    break;
                }
                case 24: {
                    this.zzafV = zzrf0.zzBx();
                    break;
                }
                case 0x20: {
                    this.zzafW = zzrf0.zzBx();
                    break;
                }
                default: {
                    goto label_4;
                }
            }
        }
    }

    public zzaq zzpG() {
        this.versionCode = 1;
        this.zzafU = -1L;
        this.zzafV = -1L;
        this.zzafW = -1L;
        this.zzaVU = null;
        this.zzaWf = -1;
        return this;
    }
}

