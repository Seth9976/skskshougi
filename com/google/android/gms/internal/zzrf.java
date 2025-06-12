package com.google.android.gms.internal;

import java.io.IOException;

public final class zzrf {
    private final byte[] buffer;
    private int zzaVK;
    private int zzaVL;
    private int zzaVM;
    private int zzaVN;
    private int zzaVO;
    private int zzaVP;
    private int zzaVQ;
    private int zzaVR;
    private int zzaVS;

    private zzrf(byte[] arr_b, int v, int v1) {
        this.zzaVP = 0x7FFFFFFF;
        this.zzaVR = 0x40;
        this.zzaVS = 0x4000000;
        this.buffer = arr_b;
        this.zzaVK = v;
        this.zzaVL = v + v1;
        this.zzaVN = v;
    }

    public int getPosition() {
        return this.zzaVN - this.zzaVK;
    }

    public byte[] readBytes() throws IOException {
        int v = this.zzBy();
        if(v <= this.zzaVL - this.zzaVN && v > 0) {
            byte[] arr_b = new byte[v];
            System.arraycopy(this.buffer, this.zzaVN, arr_b, 0, v);
            this.zzaVN = v + this.zzaVN;
            return arr_b;
        }
        return this.zzkF(v);
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(this.zzBB());
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(this.zzBA());
    }

    public String readString() throws IOException {
        int v = this.zzBy();
        if(v <= this.zzaVL - this.zzaVN && v > 0) {
            String s = new String(this.buffer, this.zzaVN, v, "UTF-8");
            this.zzaVN = v + this.zzaVN;
            return s;
        }
        return new String(this.zzkF(v), "UTF-8");
    }

    public int zzBA() throws IOException {
        return this.zzBF() & 0xFF | (this.zzBF() & 0xFF) << 8 | (this.zzBF() & 0xFF) << 16 | (this.zzBF() & 0xFF) << 24;
    }

    public long zzBB() throws IOException {
        int v = this.zzBF();
        return (((long)this.zzBF()) & 0xFFL) << 8 | ((long)v) & 0xFFL | (((long)this.zzBF()) & 0xFFL) << 16 | (((long)this.zzBF()) & 0xFFL) << 24 | (((long)this.zzBF()) & 0xFFL) << 0x20 | (((long)this.zzBF()) & 0xFFL) << 40 | (((long)this.zzBF()) & 0xFFL) << 0x30 | (((long)this.zzBF()) & 0xFFL) << 56;
    }

    private void zzBC() {
        this.zzaVL += this.zzaVM;
        int v = this.zzaVL;
        if(v > this.zzaVP) {
            this.zzaVM = v - this.zzaVP;
            this.zzaVL -= this.zzaVM;
            return;
        }
        this.zzaVM = 0;
    }

    public int zzBD() {
        return this.zzaVP == 0x7FFFFFFF ? -1 : this.zzaVP - this.zzaVN;
    }

    public boolean zzBE() {
        return this.zzaVN == this.zzaVL;
    }

    public byte zzBF() throws IOException {
        if(this.zzaVN == this.zzaVL) {
            throw zzrm.zzBN();
        }
        int v = this.zzaVN;
        this.zzaVN = v + 1;
        return this.buffer[v];
    }

    public int zzBr() throws IOException {
        if(this.zzBE()) {
            this.zzaVO = 0;
            return 0;
        }
        this.zzaVO = this.zzBy();
        if(this.zzaVO == 0) {
            throw zzrm.zzBQ();
        }
        return this.zzaVO;
    }

    public void zzBs() throws IOException {
        do {
            int v = this.zzBr();
        }
        while(v != 0 && this.zzkA(v));
    }

    public long zzBt() throws IOException {
        return this.zzBz();
    }

    public int zzBu() throws IOException {
        return this.zzBy();
    }

    public boolean zzBv() throws IOException {
        return this.zzBy() != 0;
    }

    public int zzBw() throws IOException {
        return zzrf.zzkB(this.zzBy());
    }

    public long zzBx() throws IOException {
        return zzrf.zzV(this.zzBz());
    }

    public int zzBy() throws IOException {
        int v = this.zzBF();
        if(v < 0) {
            int v1 = this.zzBF();
            if(v1 >= 0) {
                return v & 0x7F | v1 << 7;
            }
            int v2 = v & 0x7F | (v1 & 0x7F) << 7;
            int v3 = this.zzBF();
            if(v3 >= 0) {
                return v2 | v3 << 14;
            }
            int v4 = v2 | (v3 & 0x7F) << 14;
            int v5 = this.zzBF();
            if(v5 >= 0) {
                return v4 | v5 << 21;
            }
            int v6 = this.zzBF();
            v = v4 | (v5 & 0x7F) << 21 | v6 << 28;
            if(v6 < 0) {
                for(int v7 = 0; v7 < 5; ++v7) {
                    if(this.zzBF() >= 0) {
                        return v;
                    }
                }
                throw zzrm.zzBP();
            }
        }
        return v;
    }

    public long zzBz() throws IOException {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.zzBF();
            v |= ((long)(v2 & 0x7F)) << v1;
            if((v2 & 0x80) == 0) {
                return v;
            }
        }
        throw zzrm.zzBP();
    }

    public static long zzV(long v) {
        return v >>> 1 ^ -(1L & v);
    }

    public static zzrf zza(byte[] arr_b, int v, int v1) {
        return new zzrf(arr_b, v, v1);
    }

    public void zza(zzrn zzrn0) throws IOException {
        int v = this.zzBy();
        if(this.zzaVQ >= this.zzaVR) {
            throw zzrm.zzBT();
        }
        int v1 = this.zzkC(v);
        ++this.zzaVQ;
        zzrn0.zzb(this);
        this.zzkz(0);
        --this.zzaVQ;
        this.zzkD(v1);
    }

    public void zza(zzrn zzrn0, int v) throws IOException {
        if(this.zzaVQ >= this.zzaVR) {
            throw zzrm.zzBT();
        }
        ++this.zzaVQ;
        zzrn0.zzb(this);
        this.zzkz(zzrq.zzD(v, 4));
        --this.zzaVQ;
    }

    public boolean zzkA(int v) throws IOException {
        switch(v & 7) {
            case 0: {
                this.zzBu();
                return true;
            }
            case 1: {
                this.zzBB();
                return true;
            }
            case 2: {
                this.zzkG(this.zzBy());
                return true;
            }
            case 3: {
                this.zzBs();
                this.zzkz(zzrq.zzD(v >>> 3, 4));
                return true;
            }
            case 4: {
                return false;
            }
            case 5: {
                this.zzBA();
                return true;
            }
            default: {
                throw zzrm.zzBS();
            }
        }
    }

    public static int zzkB(int v) {
        return v >>> 1 ^ -(v & 1);
    }

    public int zzkC(int v) throws zzrm {
        if(v < 0) {
            throw zzrm.zzBO();
        }
        int v1 = this.zzaVN + v;
        int v2 = this.zzaVP;
        if(v1 > v2) {
            throw zzrm.zzBN();
        }
        this.zzaVP = v1;
        this.zzBC();
        return v2;
    }

    public void zzkD(int v) {
        this.zzaVP = v;
        this.zzBC();
    }

    public void zzkE(int v) {
        if(v > this.zzaVN - this.zzaVK) {
            throw new IllegalArgumentException("Position " + v + " is beyond current " + (this.zzaVN - this.zzaVK));
        }
        if(v < 0) {
            throw new IllegalArgumentException("Bad position " + v);
        }
        this.zzaVN = this.zzaVK + v;
    }

    public byte[] zzkF(int v) throws IOException {
        if(v < 0) {
            throw zzrm.zzBO();
        }
        if(this.zzaVN + v > this.zzaVP) {
            this.zzkG(this.zzaVP - this.zzaVN);
            throw zzrm.zzBN();
        }
        if(v > this.zzaVL - this.zzaVN) {
            throw zzrm.zzBN();
        }
        byte[] arr_b = new byte[v];
        System.arraycopy(this.buffer, this.zzaVN, arr_b, 0, v);
        this.zzaVN += v;
        return arr_b;
    }

    public void zzkG(int v) throws IOException {
        if(v < 0) {
            throw zzrm.zzBO();
        }
        if(this.zzaVN + v > this.zzaVP) {
            this.zzkG(this.zzaVP - this.zzaVN);
            throw zzrm.zzBN();
        }
        if(v > this.zzaVL - this.zzaVN) {
            throw zzrm.zzBN();
        }
        this.zzaVN += v;
    }

    public void zzkz(int v) throws zzrm {
        if(this.zzaVO != v) {
            throw zzrm.zzBR();
        }
    }

    public byte[] zzx(int v, int v1) {
        if(v1 == 0) {
            return zzrq.zzaWo;
        }
        byte[] arr_b = new byte[v1];
        System.arraycopy(this.buffer, this.zzaVK + v, arr_b, 0, v1);
        return arr_b;
    }

    public static zzrf zzz(byte[] arr_b) {
        return zzrf.zza(arr_b, 0, arr_b.length);
    }
}

