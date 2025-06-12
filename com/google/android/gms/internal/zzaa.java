package com.google.android.gms.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class zzaa extends ByteArrayOutputStream {
    private final zzu zzar;

    public zzaa(zzu zzu0, int v) {
        this.zzar = zzu0;
        this.buf = this.zzar.zzb(Math.max(v, 0x100));
    }

    @Override
    public void close() throws IOException {
        this.zzar.zza(this.buf);
        this.buf = null;
        super.close();
    }

    @Override
    public void finalize() {
        this.zzar.zza(this.buf);
    }

    @Override
    public void write(int oneByte) {
        synchronized(this) {
            this.zzd(1);
            super.write(oneByte);
        }
    }

    @Override
    public void write(byte[] buffer, int offset, int len) {
        synchronized(this) {
            this.zzd(len);
            super.write(buffer, offset, len);
        }
    }

    private void zzd(int v) {
        if(this.count + v <= this.buf.length) {
            return;
        }
        byte[] arr_b = this.zzar.zzb((this.count + v) * 2);
        System.arraycopy(this.buf, 0, arr_b, 0, this.count);
        this.zzar.zza(this.buf);
        this.buf = arr_b;
    }
}

