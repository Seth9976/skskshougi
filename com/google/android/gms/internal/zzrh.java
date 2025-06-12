package com.google.android.gms.internal;

import java.io.IOException;

public abstract class zzrh extends zzrn {
    protected zzrj zzaVU;

    @Override  // com.google.android.gms.internal.zzrn
    public Object clone() throws CloneNotSupportedException {
        return this.zzBJ();
    }

    @Override  // com.google.android.gms.internal.zzrn
    protected int zzB() {
        if(this.zzaVU != null) {
            int v1 = 0;
            for(int v = 0; v < this.zzaVU.size(); ++v) {
                v1 += this.zzaVU.zzkS(v).zzB();
            }
            return v1;
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    protected final int zzBI() {
        return this.zzaVU != null && !this.zzaVU.isEmpty() ? this.zzaVU.hashCode() : 0;
    }

    public zzrh zzBJ() throws CloneNotSupportedException {
        zzrh zzrh0 = (zzrh)super.zzBK();
        zzrl.zza(this, zzrh0);
        return zzrh0;
    }

    @Override  // com.google.android.gms.internal.zzrn
    public zzrn zzBK() throws CloneNotSupportedException {
        return this.zzBJ();
    }

    public final Object zza(zzri zzri0) {
        if(this.zzaVU == null) {
            return null;
        }
        zzrk zzrk0 = this.zzaVU.zzkR(zzri0.tag >>> 3);
        return zzrk0 == null ? null : zzrk0.zzb(zzri0);
    }

    @Override  // com.google.android.gms.internal.zzrn
    public void zza(zzrg zzrg0) throws IOException {
        if(this.zzaVU != null) {
            for(int v = 0; v < this.zzaVU.size(); ++v) {
                this.zzaVU.zzkS(v).zza(zzrg0);
            }
        }
    }

    protected final boolean zza(zzrf zzrf0, int v) throws IOException {
        int v1 = zzrf0.getPosition();
        if(!zzrf0.zzkA(v)) {
            return false;
        }
        zzrp zzrp0 = new zzrp(v, zzrf0.zzx(v1, zzrf0.getPosition() - v1));
        zzrk zzrk0 = null;
        if(this.zzaVU == null) {
            this.zzaVU = new zzrj();
        }
        else {
            zzrk0 = this.zzaVU.zzkR(v >>> 3);
        }
        if(zzrk0 == null) {
            zzrk0 = new zzrk();
            this.zzaVU.zza(v >>> 3, zzrk0);
        }
        zzrk0.zza(zzrp0);
        return true;
    }

    // 去混淆评级： 低(40)
    protected final boolean zza(zzrh zzrh0) {
        return this.zzaVU != null && !this.zzaVU.isEmpty() ? this.zzaVU.equals(zzrh0.zzaVU) : zzrh0.zzaVU == null || zzrh0.zzaVU.isEmpty();
    }
}

