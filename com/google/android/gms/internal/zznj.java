package com.google.android.gms.internal;

import java.io.IOException;

public interface zznj {
    public static final class zza extends zzrh {
        public static final class com.google.android.gms.internal.zznj.zza.zza extends zzrh {
            public int viewId;
            private static volatile com.google.android.gms.internal.zznj.zza.zza[] zzawl;
            public String zzawm;
            public String zzawn;

            public com.google.android.gms.internal.zznj.zza.zza() {
                this.zztW();
            }

            @Override
            public boolean equals(Object o) {
                if(o == this) {
                    return true;
                }
                if(o instanceof com.google.android.gms.internal.zznj.zza.zza) {
                    if(this.zzawm != null) {
                        if(!this.zzawm.equals(((com.google.android.gms.internal.zznj.zza.zza)o).zzawm)) {
                            return false;
                        }
                    label_8:
                        if(this.zzawn != null) {
                            if(!this.zzawn.equals(((com.google.android.gms.internal.zznj.zza.zza)o).zzawn)) {
                                return false;
                            }
                            return this.viewId == ((com.google.android.gms.internal.zznj.zza.zza)o).viewId ? this.zza(((com.google.android.gms.internal.zznj.zza.zza)o)) : false;
                        }
                        else if(((com.google.android.gms.internal.zznj.zza.zza)o).zzawn == null) {
                            return this.viewId == ((com.google.android.gms.internal.zznj.zza.zza)o).viewId ? this.zza(((com.google.android.gms.internal.zznj.zza.zza)o)) : false;
                        }
                    }
                    else if(((com.google.android.gms.internal.zznj.zza.zza)o).zzawm == null) {
                        goto label_8;
                    }
                }
                return false;
            }

            @Override
            public int hashCode() {
                if(this.zzawm == null) {
                    return this.zzawn == null ? (this.viewId + 0x7BA4F) * 0x1F + this.zzBI() : ((this.zzawn.hashCode() + 0x3FD1) * 0x1F + this.viewId) * 0x1F + this.zzBI();
                }
                int v = this.zzawm.hashCode();
                return this.zzawn == null ? ((v + 0x20F) * 961 + this.viewId) * 0x1F + this.zzBI() : (((v + 0x20F) * 0x1F + this.zzawn.hashCode()) * 0x1F + this.viewId) * 0x1F + this.zzBI();
            }

            @Override  // com.google.android.gms.internal.zzrh
            protected int zzB() {
                int v = super.zzB();
                if(!this.zzawm.equals("")) {
                    v += zzrg.zzk(1, this.zzawm);
                }
                if(!this.zzawn.equals("")) {
                    v += zzrg.zzk(2, this.zzawn);
                }
                return this.viewId == 0 ? v : v + zzrg.zzA(3, this.viewId);
            }

            @Override  // com.google.android.gms.internal.zzrh
            public void zza(zzrg zzrg0) throws IOException {
                if(!this.zzawm.equals("")) {
                    zzrg0.zzb(1, this.zzawm);
                }
                if(!this.zzawn.equals("")) {
                    zzrg0.zzb(2, this.zzawn);
                }
                if(this.viewId != 0) {
                    zzrg0.zzy(3, this.viewId);
                }
                super.zza(zzrg0);
            }

            @Override  // com.google.android.gms.internal.zzrn
            public zzrn zzb(zzrf zzrf0) throws IOException {
                return this.zzq(zzrf0);
            }

            public com.google.android.gms.internal.zznj.zza.zza zzq(zzrf zzrf0) throws IOException {
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
                            this.zzawm = zzrf0.readString();
                            break;
                        }
                        case 18: {
                            this.zzawn = zzrf0.readString();
                            break;
                        }
                        case 24: {
                            this.viewId = zzrf0.zzBu();
                            break;
                        }
                        default: {
                            goto label_4;
                        }
                    }
                }
            }

            public static com.google.android.gms.internal.zznj.zza.zza[] zztV() {
                if(com.google.android.gms.internal.zznj.zza.zza.zzawl == null) {
                    Object object0 = zzrl.zzaWe;
                    synchronized(object0) {
                        if(com.google.android.gms.internal.zznj.zza.zza.zzawl == null) {
                            com.google.android.gms.internal.zznj.zza.zza.zzawl = new com.google.android.gms.internal.zznj.zza.zza[0];
                        }
                    }
                }
                return com.google.android.gms.internal.zznj.zza.zza.zzawl;
            }

            public com.google.android.gms.internal.zznj.zza.zza zztW() {
                this.zzawm = "";
                this.zzawn = "";
                this.viewId = 0;
                this.zzaVU = null;
                this.zzaWf = -1;
                return this;
            }
        }

        public com.google.android.gms.internal.zznj.zza.zza[] zzawk;

        public zza() {
            this.zztU();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            return !(o instanceof zza) || !zzrl.equals(this.zzawk, ((zza)o).zzawk) ? false : this.zza(((zza)o));
        }

        @Override
        public int hashCode() {
            return (zzrl.hashCode(this.zzawk) + 0x20F) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB();
            if(this.zzawk != null && this.zzawk.length > 0) {
                for(int v1 = 0; v1 < this.zzawk.length; ++v1) {
                    com.google.android.gms.internal.zznj.zza.zza zznj$zza$zza0 = this.zzawk[v1];
                    if(zznj$zza$zza0 != null) {
                        v += zzrg.zzc(1, zznj$zza$zza0);
                    }
                }
            }
            return v;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(this.zzawk != null && this.zzawk.length > 0) {
                for(int v = 0; v < this.zzawk.length; ++v) {
                    com.google.android.gms.internal.zznj.zza.zza zznj$zza$zza0 = this.zzawk[v];
                    if(zznj$zza$zza0 != null) {
                        zzrg0.zza(1, zznj$zza$zza0);
                    }
                }
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzp(zzrf0);
        }

        public zza zzp(zzrf zzrf0) throws IOException {
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
                        int v2 = this.zzawk == null ? 0 : this.zzawk.length;
                        com.google.android.gms.internal.zznj.zza.zza[] arr_zznj$zza$zza = new com.google.android.gms.internal.zznj.zza.zza[v1 + v2];
                        if(v2 != 0) {
                            System.arraycopy(this.zzawk, 0, arr_zznj$zza$zza, 0, v2);
                        }
                        while(v2 < arr_zznj$zza$zza.length - 1) {
                            arr_zznj$zza$zza[v2] = new com.google.android.gms.internal.zznj.zza.zza();
                            zzrf0.zza(arr_zznj$zza$zza[v2]);
                            zzrf0.zzBr();
                            ++v2;
                        }
                        arr_zznj$zza$zza[v2] = new com.google.android.gms.internal.zznj.zza.zza();
                        zzrf0.zza(arr_zznj$zza$zza[v2]);
                        this.zzawk = arr_zznj$zza$zza;
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }

        public zza zztU() {
            this.zzawk = com.google.android.gms.internal.zznj.zza.zza.zztV();
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }
    }

    public static final class zzb extends zzrh {
        public String name;
        private static volatile zzb[] zzawo;
        public zzd zzawp;

        public zzb() {
            this.zztY();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zzb) {
                if(this.name != null) {
                    if(!this.name.equals(((zzb)o).name)) {
                        return false;
                    }
                label_8:
                    if(this.zzawp == null) {
                        return ((zzb)o).zzawp == null ? this.zza(((zzb)o)) : false;
                    }
                    return this.zzawp.equals(((zzb)o).zzawp) ? this.zza(((zzb)o)) : false;
                }
                else if(((zzb)o).name == null) {
                    goto label_8;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            if(this.name == null) {
                return this.zzawp == null ? this.zzBI() + 0x7BA4F : (this.zzawp.hashCode() + 0x3FD1) * 0x1F + this.zzBI();
            }
            int v = this.name.hashCode();
            return this.zzawp == null ? (v + 0x20F) * 961 + this.zzBI() : ((v + 0x20F) * 0x1F + this.zzawp.hashCode()) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB();
            if(!this.name.equals("")) {
                v += zzrg.zzk(1, this.name);
            }
            return this.zzawp == null ? v : v + zzrg.zzc(2, this.zzawp);
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(!this.name.equals("")) {
                zzrg0.zzb(1, this.name);
            }
            if(this.zzawp != null) {
                zzrg0.zza(2, this.zzawp);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzr(zzrf0);
        }

        public zzb zzr(zzrf zzrf0) throws IOException {
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
                        if(this.zzawp == null) {
                            this.zzawp = new zzd();
                        }
                        zzrf0.zza(this.zzawp);
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }

        public static zzb[] zztX() {
            if(zzb.zzawo == null) {
                Object object0 = zzrl.zzaWe;
                synchronized(object0) {
                    if(zzb.zzawo == null) {
                        zzb.zzawo = new zzb[0];
                    }
                }
            }
            return zzb.zzawo;
        }

        public zzb zztY() {
            this.name = "";
            this.zzawp = null;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }
    }

    public static final class zzc extends zzrh {
        public String type;
        public zzb[] zzawq;

        public zzc() {
            this.zztZ();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zzc) {
                if(this.type != null) {
                    if(!this.type.equals(((zzc)o).type)) {
                        return false;
                    }
                    return zzrl.equals(this.zzawq, ((zzc)o).zzawq) ? this.zza(((zzc)o)) : false;
                }
                else if(((zzc)o).type == null) {
                    return zzrl.equals(this.zzawq, ((zzc)o).zzawq) ? this.zza(((zzc)o)) : false;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.type == null ? (zzrl.hashCode(this.zzawq) + 0x3FD1) * 0x1F + this.zzBI() : ((this.type.hashCode() + 0x20F) * 0x1F + zzrl.hashCode(this.zzawq)) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB();
            if(!this.type.equals("")) {
                v += zzrg.zzk(1, this.type);
            }
            if(this.zzawq != null && this.zzawq.length > 0) {
                int v1 = v;
                for(int v2 = 0; v2 < this.zzawq.length; ++v2) {
                    zzb zznj$zzb0 = this.zzawq[v2];
                    if(zznj$zzb0 != null) {
                        v1 += zzrg.zzc(2, zznj$zzb0);
                    }
                }
                return v1;
            }
            return v;
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(!this.type.equals("")) {
                zzrg0.zzb(1, this.type);
            }
            if(this.zzawq != null && this.zzawq.length > 0) {
                for(int v = 0; v < this.zzawq.length; ++v) {
                    zzb zznj$zzb0 = this.zzawq[v];
                    if(zznj$zzb0 != null) {
                        zzrg0.zza(2, zznj$zzb0);
                    }
                }
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzs(zzrf0);
        }

        public zzc zzs(zzrf zzrf0) throws IOException {
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
                        this.type = zzrf0.readString();
                        break;
                    }
                    case 18: {
                        int v1 = zzrq.zzb(zzrf0, 18);
                        int v2 = this.zzawq == null ? 0 : this.zzawq.length;
                        zzb[] arr_zznj$zzb = new zzb[v1 + v2];
                        if(v2 != 0) {
                            System.arraycopy(this.zzawq, 0, arr_zznj$zzb, 0, v2);
                        }
                        while(v2 < arr_zznj$zzb.length - 1) {
                            arr_zznj$zzb[v2] = new zzb();
                            zzrf0.zza(arr_zznj$zzb[v2]);
                            zzrf0.zzBr();
                            ++v2;
                        }
                        arr_zznj$zzb[v2] = new zzb();
                        zzrf0.zza(arr_zznj$zzb[v2]);
                        this.zzawq = arr_zznj$zzb;
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }

        public zzc zztZ() {
            this.type = "";
            this.zzawq = zzb.zztX();
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }
    }

    public static final class zzd extends zzrh {
        public String zzabE;
        public boolean zzawr;
        public long zzaws;
        public double zzawt;
        public zzc zzawu;

        public zzd() {
            this.zzua();
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof zzd && this.zzawr == ((zzd)o).zzawr) {
                if(this.zzabE != null) {
                    if(!this.zzabE.equals(((zzd)o).zzabE)) {
                        return false;
                    }
                label_8:
                    if(this.zzaws == ((zzd)o).zzaws && Double.doubleToLongBits(this.zzawt) == Double.doubleToLongBits(((zzd)o).zzawt)) {
                        if(this.zzawu == null) {
                            return ((zzd)o).zzawu == null ? this.zza(((zzd)o)) : false;
                        }
                        return this.zzawu.equals(((zzd)o).zzawu) ? this.zza(((zzd)o)) : false;
                    }
                }
                else if(((zzd)o).zzabE == null) {
                    goto label_8;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            long v = Double.doubleToLongBits(this.zzawt);
            int v1 = ((((this.zzabE == null ? 0 : this.zzabE.hashCode()) + ((this.zzawr ? 0x4CF : 0x4D5) + 0x20F) * 0x1F) * 0x1F + ((int)(this.zzaws ^ this.zzaws >>> 0x20))) * 0x1F + ((int)(v ^ v >>> 0x20))) * 0x1F;
            return this.zzawu == null ? v1 * 0x1F + this.zzBI() : (v1 + this.zzawu.hashCode()) * 0x1F + this.zzBI();
        }

        @Override  // com.google.android.gms.internal.zzrh
        protected int zzB() {
            int v = super.zzB();
            if(this.zzawr) {
                v += zzrg.zzc(1, this.zzawr);
            }
            if(!this.zzabE.equals("")) {
                v += zzrg.zzk(2, this.zzabE);
            }
            if(this.zzaws != 0L) {
                v += zzrg.zzd(3, this.zzaws);
            }
            if(Double.doubleToLongBits(this.zzawt) != 0L) {
                v += zzrg.zzb(4, this.zzawt);
            }
            return this.zzawu == null ? v : v + zzrg.zzc(5, this.zzawu);
        }

        @Override  // com.google.android.gms.internal.zzrh
        public void zza(zzrg zzrg0) throws IOException {
            if(this.zzawr) {
                zzrg0.zzb(1, this.zzawr);
            }
            if(!this.zzabE.equals("")) {
                zzrg0.zzb(2, this.zzabE);
            }
            if(this.zzaws != 0L) {
                zzrg0.zzb(3, this.zzaws);
            }
            if(Double.doubleToLongBits(this.zzawt) != 0L) {
                zzrg0.zza(4, this.zzawt);
            }
            if(this.zzawu != null) {
                zzrg0.zza(5, this.zzawu);
            }
            super.zza(zzrg0);
        }

        @Override  // com.google.android.gms.internal.zzrn
        public zzrn zzb(zzrf zzrf0) throws IOException {
            return this.zzt(zzrf0);
        }

        public zzd zzt(zzrf zzrf0) throws IOException {
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
                        this.zzawr = zzrf0.zzBv();
                        break;
                    }
                    case 18: {
                        this.zzabE = zzrf0.readString();
                        break;
                    }
                    case 24: {
                        this.zzaws = zzrf0.zzBt();
                        break;
                    }
                    case 33: {
                        this.zzawt = zzrf0.readDouble();
                        break;
                    }
                    case 42: {
                        if(this.zzawu == null) {
                            this.zzawu = new zzc();
                        }
                        zzrf0.zza(this.zzawu);
                        break;
                    }
                    default: {
                        goto label_4;
                    }
                }
            }
        }

        public zzd zzua() {
            this.zzawr = false;
            this.zzabE = "";
            this.zzaws = 0L;
            this.zzawt = 0.0;
            this.zzawu = null;
            this.zzaVU = null;
            this.zzaWf = -1;
            return this;
        }
    }

}

