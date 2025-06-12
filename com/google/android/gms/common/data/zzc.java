package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public abstract class zzc {
    protected final DataHolder zzWu;
    protected int zzYs;
    private int zzYt;

    public zzc(DataHolder dataHolder0, int v) {
        this.zzWu = (DataHolder)zzu.zzu(dataHolder0);
        this.zzbf(v);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object obj) {
        return obj instanceof zzc && zzt.equal(((zzc)obj).zzYs, this.zzYs) && zzt.equal(((zzc)obj).zzYt, this.zzYt) && ((zzc)obj).zzWu == this.zzWu;
    }

    protected boolean getBoolean(String column) {
        return this.zzWu.zze(column, this.zzYs, this.zzYt);
    }

    protected byte[] getByteArray(String column) {
        return this.zzWu.zzg(column, this.zzYs, this.zzYt);
    }

    protected float getFloat(String column) {
        return this.zzWu.zzf(column, this.zzYs, this.zzYt);
    }

    protected int getInteger(String column) {
        return this.zzWu.zzc(column, this.zzYs, this.zzYt);
    }

    protected long getLong(String column) {
        return this.zzWu.zzb(column, this.zzYs, this.zzYt);
    }

    protected String getString(String column) {
        return this.zzWu.zzd(column, this.zzYs, this.zzYt);
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzYs, this.zzYt, this.zzWu});
    }

    public boolean isDataValid() {
        return !this.zzWu.isClosed();
    }

    protected void zza(String s, CharArrayBuffer charArrayBuffer0) {
        this.zzWu.zza(s, this.zzYs, this.zzYt, charArrayBuffer0);
    }

    public boolean zzbV(String s) {
        return this.zzWu.zzbV(s);
    }

    protected Uri zzbW(String s) {
        return this.zzWu.zzh(s, this.zzYs, this.zzYt);
    }

    protected boolean zzbX(String s) {
        return this.zzWu.zzi(s, this.zzYs, this.zzYt);
    }

    protected void zzbf(int v) {
        zzu.zzU(v >= 0 && v < this.zzWu.getCount());
        this.zzYs = v;
        this.zzYt = this.zzWu.zzbh(this.zzYs);
    }

    protected int zzne() {
        return this.zzYs;
    }
}

