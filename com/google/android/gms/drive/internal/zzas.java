package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzrg;
import com.google.android.gms.internal.zzrh;
import com.google.android.gms.internal.zzrn;
import java.io.IOException;

public final class zzas extends zzrh {
    public long zzafV;
    public long zzafY;

    public zzas() {
        this.zzpI();
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        return !(o instanceof zzas) || this.zzafY != ((zzas)o).zzafY || this.zzafV != ((zzas)o).zzafV ? false : this.zza(((zzas)o));
    }

    @Override
    public int hashCode() {
        return ((((int)(this.zzafY ^ this.zzafY >>> 0x20)) + 0x20F) * 0x1F + ((int)(this.zzafV ^ this.zzafV >>> 0x20))) * 0x1F + this.zzBI();
    }

    @Override  // com.google.android.gms.internal.zzrh
    protected int zzB() {
        return super.zzB() + zzrg.zze(1, this.zzafY) + zzrg.zze(2, this.zzafV);
    }

    @Override  // com.google.android.gms.internal.zzrh
    public void zza(zzrg zzrg0) throws IOException {
        zzrg0.zzc(1, this.zzafY);
        zzrg0.zzc(2, this.zzafV);
        super.zza(zzrg0);
    }

    @Override  // com.google.android.gms.internal.zzrn
    public zzrn zzb(zzrf zzrf0) throws IOException {
        return this.zzo(zzrf0);
    }

    public zzas zzo(zzrf zzrf0) throws IOException {
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
                    this.zzafY = zzrf0.zzBx();
                    break;
                }
                case 16: {
                    this.zzafV = zzrf0.zzBx();
                    break;
                }
                default: {
                    goto label_4;
                }
            }
        }
    }

    public zzas zzpI() {
        this.zzafY = -1L;
        this.zzafV = -1L;
        this.zzaVU = null;
        this.zzaWf = -1;
        return this;
    }
}

