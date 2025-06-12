package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.InputStream;

public final class zzm extends InputStream {
    private final InputStream zzaTX;
    private volatile zzj zzaTY;

    public zzm(InputStream inputStream0) {
        this.zzaTX = (InputStream)zzu.zzu(inputStream0);
    }

    @Override
    public int available() throws IOException {
        return this.zzaTX.available();
    }

    @Override
    public void close() throws IOException {
        this.zzaTX.close();
    }

    @Override
    public void mark(int readlimit) {
        this.zzaTX.mark(readlimit);
    }

    @Override
    public boolean markSupported() {
        return this.zzaTX.markSupported();
    }

    @Override
    public int read() throws IOException {
        return this.zzjX(this.zzaTX.read());
    }

    @Override
    public int read(byte[] buffer) throws IOException {
        return this.zzjX(this.zzaTX.read(buffer));
    }

    @Override
    public int read(byte[] buffer, int byteOffset, int byteCount) throws IOException {
        return this.zzjX(this.zzaTX.read(buffer, byteOffset, byteCount));
    }

    @Override
    public void reset() throws IOException {
        this.zzaTX.reset();
    }

    @Override
    public long skip(long byteCount) throws IOException {
        return this.zzaTX.skip(byteCount);
    }

    zzr zzBb() {
        return (zzj zzj0) -> zzm.this.zzaTY = (zzj)zzu.zzu(zzj0);

        class com.google.android.gms.wearable.internal.zzm.1 implements zzr {
            @Override  // com.google.android.gms.wearable.internal.zzr
            public void zzb(zzj zzj0) {
                zzm.this.zza(zzj0);
            }
        }

    }

    // 检测为 lambda 实现。
    void zza(zzj zzj0) {
        this.zzaTY = (zzj)zzu.zzu(zzj0);
    }

    private int zzjX(int v) throws ChannelIOException {
        if(v == -1) {
            zzj zzj0 = this.zzaTY;
            if(zzj0 != null) {
                throw new ChannelIOException("Channel closed unexpectedly before stream was finished", zzj0.zzaTN, zzj0.zzaTO);
            }
        }
        return v;
    }
}

