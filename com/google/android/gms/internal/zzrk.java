package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class zzrk implements Cloneable {
    private zzri zzaWb;
    private Object zzaWc;
    private List zzaWd;

    zzrk() {
        this.zzaWd = new ArrayList();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zzBM();
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(o instanceof zzrk) {
            if(this.zzaWc == null || ((zzrk)o).zzaWc == null) {
                if(this.zzaWd != null && ((zzrk)o).zzaWd != null) {
                    return this.zzaWd.equals(((zzrk)o).zzaWd);
                }
                try {
                    return Arrays.equals(new byte[0], new byte[0]);
                }
                catch(IOException iOException0) {
                    throw new IllegalStateException(iOException0);
                }
            }
            else if(this.zzaWb == ((zzrk)o).zzaWb) {
                if(!this.zzaWb.zzaVV.isArray()) {
                    return this.zzaWc.equals(((zzrk)o).zzaWc);
                }
                if(this.zzaWc instanceof byte[]) {
                    return Arrays.equals(((byte[])this.zzaWc), ((byte[])((zzrk)o).zzaWc));
                }
                if(this.zzaWc instanceof int[]) {
                    return Arrays.equals(((int[])this.zzaWc), ((int[])((zzrk)o).zzaWc));
                }
                if(this.zzaWc instanceof long[]) {
                    return Arrays.equals(((long[])this.zzaWc), ((long[])((zzrk)o).zzaWc));
                }
                if(this.zzaWc instanceof float[]) {
                    return Arrays.equals(((float[])this.zzaWc), ((float[])((zzrk)o).zzaWc));
                }
                if(this.zzaWc instanceof double[]) {
                    return Arrays.equals(((double[])this.zzaWc), ((double[])((zzrk)o).zzaWc));
                }
                return this.zzaWc instanceof boolean[] ? Arrays.equals(((boolean[])this.zzaWc), ((boolean[])((zzrk)o).zzaWc)) : Arrays.deepEquals(((Object[])this.zzaWc), ((Object[])((zzrk)o).zzaWc));
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        try {
            return Arrays.hashCode(new byte[0]) + 0x20F;
        }
        catch(IOException iOException0) {
            throw new IllegalStateException(iOException0);
        }
    }

    private byte[] toByteArray() throws IOException [...] // Potential decryptor

    int zzB() {
        if(this.zzaWc != null) {
            return this.zzaWb.zzQ(this.zzaWc);
        }
        int v = 0;
        for(Object object0: this.zzaWd) {
            v = ((zzrp)object0).zzB() + v;
        }
        return v;
    }

    public final zzrk zzBM() {
        zzrk zzrk0 = new zzrk();
        try {
            zzrk0.zzaWb = this.zzaWb;
            if(this.zzaWd == null) {
                zzrk0.zzaWd = null;
            }
            else {
                zzrk0.zzaWd.addAll(this.zzaWd);
            }
            if(this.zzaWc == null) {
                return zzrk0;
            }
            if(this.zzaWc instanceof zzrn) {
                zzrk0.zzaWc = ((zzrn)this.zzaWc).zzBK();
                return zzrk0;
            }
            if(this.zzaWc instanceof byte[]) {
                zzrk0.zzaWc = ((byte[])this.zzaWc).clone();
                return zzrk0;
            }
            if(!(this.zzaWc instanceof byte[][])) {
                if(this.zzaWc instanceof boolean[]) {
                    zzrk0.zzaWc = ((boolean[])this.zzaWc).clone();
                    return zzrk0;
                }
                if(this.zzaWc instanceof int[]) {
                    zzrk0.zzaWc = ((int[])this.zzaWc).clone();
                    return zzrk0;
                }
                if(this.zzaWc instanceof long[]) {
                    zzrk0.zzaWc = ((long[])this.zzaWc).clone();
                    return zzrk0;
                }
                if(this.zzaWc instanceof float[]) {
                    zzrk0.zzaWc = ((float[])this.zzaWc).clone();
                    return zzrk0;
                }
                if(this.zzaWc instanceof double[]) {
                    zzrk0.zzaWc = ((double[])this.zzaWc).clone();
                    return zzrk0;
                }
                if(this.zzaWc instanceof zzrn[]) {
                    zzrn[] arr_zzrn = (zzrn[])this.zzaWc;
                    zzrn[] arr_zzrn1 = new zzrn[arr_zzrn.length];
                    zzrk0.zzaWc = arr_zzrn1;
                    for(int v = 0; v < arr_zzrn.length; ++v) {
                        arr_zzrn1[v] = arr_zzrn[v].zzBK();
                    }
                }
                return zzrk0;
            }
            byte[][] arr2_b = (byte[][])this.zzaWc;
            byte[][] arr2_b1 = new byte[arr2_b.length][];
            zzrk0.zzaWc = arr2_b1;
            for(int v1 = 0; v1 < arr2_b.length; ++v1) {
                arr2_b1[v1] = (byte[])arr2_b[v1].clone();
            }
            return zzrk0;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
    }

    void zza(zzrg zzrg0) throws IOException {
        if(this.zzaWc != null) {
            this.zzaWb.zza(this.zzaWc, zzrg0);
            return;
        }
        for(Object object0: this.zzaWd) {
            ((zzrp)object0).zza(zzrg0);
        }
    }

    void zza(zzrp zzrp0) {
        this.zzaWd.add(zzrp0);
    }

    Object zzb(zzri zzri0) {
        if(this.zzaWc == null) {
            this.zzaWb = zzri0;
            this.zzaWc = zzri0.zzx(this.zzaWd);
            this.zzaWd = null;
        }
        else if(this.zzaWb != zzri0) {
            throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
        }
        return this.zzaWc;
    }
}

