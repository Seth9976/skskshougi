package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzrg;
import com.google.android.gms.internal.zzrh;
import com.google.android.gms.internal.zzrm;
import com.google.android.gms.internal.zzrn;
import java.io.IOException;

public final class zzar extends zzrh {
    public int versionCode;
    public long zzafV;
    public String zzafX;
    public long zzafY;
    public int zzafZ;

    public zzar() {
        this.zzpH();
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(o instanceof zzar && this.versionCode == ((zzar)o).versionCode) {
            if(this.zzafX != null) {
                if(!this.zzafX.equals(((zzar)o).zzafX)) {
                    return false;
                }
                return this.zzafY != ((zzar)o).zzafY || this.zzafV != ((zzar)o).zzafV || this.zzafZ != ((zzar)o).zzafZ ? false : this.zza(((zzar)o));
            }
            else if(((zzar)o).zzafX == null) {
                return this.zzafY != ((zzar)o).zzafY || this.zzafV != ((zzar)o).zzafV || this.zzafZ != ((zzar)o).zzafZ ? false : this.zza(((zzar)o));
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = (this.versionCode + 0x20F) * 0x1F;
        return this.zzafX == null ? (((v * 0x1F + ((int)(this.zzafY ^ this.zzafY >>> 0x20))) * 0x1F + ((int)(this.zzafV ^ this.zzafV >>> 0x20))) * 0x1F + this.zzafZ) * 0x1F + this.zzBI() : ((((this.zzafX.hashCode() + v) * 0x1F + ((int)(this.zzafY ^ this.zzafY >>> 0x20))) * 0x1F + ((int)(this.zzafV ^ this.zzafV >>> 0x20))) * 0x1F + this.zzafZ) * 0x1F + this.zzBI();
    }

    @Override  // com.google.android.gms.internal.zzrh
    protected int zzB() {
        int v = super.zzB() + zzrg.zzA(1, this.versionCode) + zzrg.zzk(2, this.zzafX) + zzrg.zze(3, this.zzafY) + zzrg.zze(4, this.zzafV);
        return this.zzafZ == -1 ? v : v + zzrg.zzA(5, this.zzafZ);
    }

    @Override  // com.google.android.gms.internal.zzrh
    public void zza(zzrg zzrg0) throws IOException {
        zzrg0.zzy(1, this.versionCode);
        zzrg0.zzb(2, this.zzafX);
        zzrg0.zzc(3, this.zzafY);
        zzrg0.zzc(4, this.zzafV);
        if(this.zzafZ != -1) {
            zzrg0.zzy(5, this.zzafZ);
        }
        super.zza(zzrg0);
    }

    @Override  // com.google.android.gms.internal.zzrn
    public zzrn zzb(zzrf zzrf0) throws IOException {
        return this.zzn(zzrf0);
    }

    public static zzar zzl(byte[] arr_b) throws zzrm {
        return (zzar)zzrn.zza(new zzar(), arr_b);
    }

    public zzar zzn(zzrf zzrf0) throws IOException {
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
                case 18: {
                    this.zzafX = zzrf0.readString();
                    break;
                }
                case 24: {
                    this.zzafY = zzrf0.zzBx();
                    break;
                }
                case 0x20: {
                    this.zzafV = zzrf0.zzBx();
                    break;
                }
                case 40: {
                    this.zzafZ = zzrf0.zzBu();
                    break;
                }
                default: {
                    goto label_4;
                }
            }
        }
    }

    public zzar zzpH() {
        this.versionCode = 1;
        this.zzafX = "";
        this.zzafY = -1L;
        this.zzafV = -1L;
        this.zzafZ = -1;
        this.zzaVU = null;
        this.zzaWf = -1;
        return this;
    }
}

