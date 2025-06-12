package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class zzf extends AbstractDataBuffer {
    private boolean zzYK;
    private ArrayList zzYL;

    protected zzf(DataHolder dataHolder0) {
        super(dataHolder0);
        this.zzYK = false;
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public final Object get(int position) {
        this.zznj();
        return this.zzj(this.zzbk(position), this.zzbl(position));
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public int getCount() {
        this.zznj();
        return this.zzYL.size();
    }

    int zzbk(int v) {
        if(v < 0 || v >= this.zzYL.size()) {
            throw new IllegalArgumentException("Position " + v + " is out of bounds for this buffer");
        }
        return (int)(((Integer)this.zzYL.get(v)));
    }

    protected int zzbl(int v) {
        if(v < 0 || v == this.zzYL.size()) {
            return 0;
        }
        int v1 = v == this.zzYL.size() - 1 ? this.zzWu.getCount() - ((int)(((Integer)this.zzYL.get(v)))) : ((int)(((Integer)this.zzYL.get(v + 1)))) - ((int)(((Integer)this.zzYL.get(v))));
        if(v1 == 1) {
            int v2 = this.zzbk(v);
            int v3 = this.zzWu.zzbh(v2);
            String s = this.zznk();
            return s == null || this.zzWu.zzd(s, v2, v3) != null ? 1 : 0;
        }
        return v1;
    }

    protected abstract Object zzj(int arg1, int arg2);

    protected abstract String zzni();

    private void zznj() {
        synchronized(this) {
            if(!this.zzYK) {
                int v1 = this.zzWu.getCount();
                this.zzYL = new ArrayList();
                if(v1 > 0) {
                    this.zzYL.add(0);
                    String s = this.zzni();
                    int v2 = this.zzWu.zzbh(0);
                    String s1 = this.zzWu.zzd(s, 0, v2);
                    int v3 = 1;
                    while(v3 < v1) {
                        int v4 = this.zzWu.zzbh(v3);
                        String s2 = this.zzWu.zzd(s, v3, v4);
                        if(s2 == null) {
                            throw new NullPointerException("Missing value for markerColumn: " + s + ", at row: " + v3 + ", for window: " + v4);
                        }
                        if(s2.equals(s1)) {
                            s2 = s1;
                        }
                        else {
                            this.zzYL.add(v3);
                        }
                        ++v3;
                        s1 = s2;
                    }
                }
                this.zzYK = true;
            }
        }
    }

    protected String zznk() {
        return null;
    }
}

