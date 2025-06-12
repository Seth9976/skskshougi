package com.google.android.gms.internal;

import java.io.IOException;

public interface zzpx {
    public static final class zza extends zzrh {
        public long zzaOZ;
        public zzj zzaPa;
        public zzf zziO;

        public zza() {
            this.zzzY();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zza && this.zzaOZ == ((zza)o).zzaOZ) {
                if(this.zziO != null) {
                    if(!this.zziO.equals(((zza)o).zziO)) {
                        return false;
                    }
                label_8:
                    if(this.zzaPa == null) {
                        return ((zza)o).zzaPa == null ? this.zza(((zza)o)) : false;
                    }
                    return this.zzaPa.equals(((zza)o).zzaPa) ? this.zza(((zza)o)) : false;
                }
                else if(((zza)o).zziO == null) {
                    goto label_8;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            int v = (((int)(this.zzaOZ ^ this.zzaOZ >>> 0x20)) + 0x20F) * 0x1F;
            if(this.zziO == null) {
                return this.zzaPa == null ? v * 961 + this.zzBI() : (v * 0x1F + this.zzaPa.hashCode()) * 0x1F + this.zzBI();
            }
            int v1 = this.zziO.hashCode();
            return this.zzaPa == null ? (v1 + v) * 961 + this.zzBI() : ((v1 + v) * 0x1F + this.zzaPa.hashCode()) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB() + zzrg.zzd(1, this.zzaOZ);
            if(this.zziO != null) {
                v += zzrg.zzc(2, this.zziO);
            }
            return this.zzaPa == null ? v : v + zzrg.zzc(3, this.zzaPa);
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            zzrg0.zzb(1, this.zzaOZ);
            if(this.zziO != null) {
                zzrg0.zza(2, this.zziO);
            }
            if(this.zzaPa != null) {
                zzrg0.zza(3, this.zzaPa);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzu(zzrf0);
        }

        public static zza zzs(byte[] arr_b) throws zzrm {
            return (zza)zzrn.zza(new zza(), arr_b);
        }

        public zza zzu(zzrf zzrf0) throws IOException {
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
                        this.zzaOZ = zzrf0.zzBt();
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
                        if(this.zzaPa == null) {
                            this.zzaPa = new zzj();
                        }
                        zzrf0.zza(this.zzaPa);
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }

        public zza zzzY() {
            this.zzaOZ = 0L;
            this.zziO = null;
            this.zzaPa = null;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }
    }

}

