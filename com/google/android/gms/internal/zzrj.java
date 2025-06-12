package com.google.android.gms.internal;

class zzrj implements Cloneable {
    private int mSize;
    private static final zzrk zzaVX;
    private boolean zzaVY;
    private int[] zzaVZ;
    private zzrk[] zzaWa;

    static {
        zzrj.zzaVX = new zzrk();
    }

    public zzrj() {
        this(10);
    }

    public zzrj(int v) {
        this.zzaVY = false;
        int v1 = this.idealIntArraySize(v);
        this.zzaVZ = new int[v1];
        this.zzaWa = new zzrk[v1];
        this.mSize = 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zzBL();
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof zzrj)) {
            return false;
        }
        return this.size() == ((zzrj)o).size() ? this.zza(this.zzaVZ, ((zzrj)o).zzaVZ, this.mSize) && this.zza(this.zzaWa, ((zzrj)o).zzaWa, this.mSize) : false;
    }

    private void gc() {
        int v = this.mSize;
        int[] arr_v = this.zzaVZ;
        zzrk[] arr_zzrk = this.zzaWa;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            zzrk zzrk0 = arr_zzrk[v1];
            if(zzrk0 != zzrj.zzaVX) {
                if(v1 != v2) {
                    arr_v[v2] = arr_v[v1];
                    arr_zzrk[v2] = zzrk0;
                    arr_zzrk[v1] = null;
                }
                ++v2;
            }
        }
        this.zzaVY = false;
        this.mSize = v2;
    }

    @Override
    public int hashCode() {
        if(this.zzaVY) {
            this.gc();
        }
        int v = 17;
        for(int v1 = 0; v1 < this.mSize; ++v1) {
            v = (v * 0x1F + this.zzaVZ[v1]) * 0x1F + this.zzaWa[v1].hashCode();
        }
        return v;
    }

    private int idealByteArraySize(int need) {
        for(int v1 = 4; v1 < 0x20; ++v1) {
            if(need <= (1 << v1) - 12) {
                return (1 << v1) - 12;
            }
        }
        return need;
    }

    private int idealIntArraySize(int need) {
        return this.idealByteArraySize(need * 4) / 4;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int size() {
        if(this.zzaVY) {
            this.gc();
        }
        return this.mSize;
    }

    public final zzrj zzBL() {
        int v1 = this.size();
        zzrj zzrj0 = new zzrj(v1);
        System.arraycopy(this.zzaVZ, 0, zzrj0.zzaVZ, 0, v1);
        for(int v = 0; v < v1; ++v) {
            if(this.zzaWa[v] != null) {
                zzrk[] arr_zzrk = zzrj0.zzaWa;
                arr_zzrk[v] = this.zzaWa[v].zzBM();
            }
        }
        zzrj0.mSize = v1;
        return zzrj0;
    }

    private boolean zza(int[] arr_v, int[] arr_v1, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(arr_v[v1] != arr_v1[v1]) {
                return false;
            }
        }
        return true;
    }

    private boolean zza(zzrk[] arr_zzrk, zzrk[] arr_zzrk1, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            if(!arr_zzrk[v1].equals(arr_zzrk1[v1])) {
                return false;
            }
        }
        return true;
    }

    public void zza(int v, zzrk zzrk0) {
        int v1 = this.zzkT(v);
        if(v1 >= 0) {
            this.zzaWa[v1] = zzrk0;
            return;
        }
        int v2 = ~v1;
        if(v2 < this.mSize && this.zzaWa[v2] == zzrj.zzaVX) {
            this.zzaVZ[v2] = v;
            this.zzaWa[v2] = zzrk0;
            return;
        }
        if(this.zzaVY && this.mSize >= this.zzaVZ.length) {
            this.gc();
            v2 = ~this.zzkT(v);
        }
        if(this.mSize >= this.zzaVZ.length) {
            int v3 = this.idealIntArraySize(this.mSize + 1);
            int[] arr_v = new int[v3];
            zzrk[] arr_zzrk = new zzrk[v3];
            System.arraycopy(this.zzaVZ, 0, arr_v, 0, this.zzaVZ.length);
            System.arraycopy(this.zzaWa, 0, arr_zzrk, 0, this.zzaWa.length);
            this.zzaVZ = arr_v;
            this.zzaWa = arr_zzrk;
        }
        if(this.mSize - v2 != 0) {
            System.arraycopy(this.zzaVZ, v2, this.zzaVZ, v2 + 1, this.mSize - v2);
            System.arraycopy(this.zzaWa, v2, this.zzaWa, v2 + 1, this.mSize - v2);
        }
        this.zzaVZ[v2] = v;
        this.zzaWa[v2] = zzrk0;
        ++this.mSize;
    }

    public zzrk zzkR(int v) {
        int v1 = this.zzkT(v);
        return v1 >= 0 && this.zzaWa[v1] != zzrj.zzaVX ? this.zzaWa[v1] : null;
    }

    public zzrk zzkS(int v) {
        if(this.zzaVY) {
            this.gc();
        }
        return this.zzaWa[v];
    }

    private int zzkT(int v) {
        int v1 = 0;
        int v2 = this.mSize - 1;
        while(v1 <= v2) {
            int v3 = v1 + v2 >>> 1;
            int v4 = this.zzaVZ[v3];
            if(v4 < v) {
                v1 = v3 + 1;
                continue;
            }
            if(v4 > v) {
                v2 = v3 - 1;
                continue;
            }
            return v3;
        }
        return ~v1;
    }
}

