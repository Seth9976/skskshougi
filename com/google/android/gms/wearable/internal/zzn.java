package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.OutputStream;

public final class zzn extends OutputStream {
    private volatile zzj zzaTY;
    private final OutputStream zzaUa;

    public zzn(OutputStream outputStream0) {
        this.zzaUa = (OutputStream)zzu.zzu(outputStream0);
    }

    @Override
    public void close() throws IOException {
        try {
            this.zzaUa.close();
        }
        catch(IOException iOException0) {
            throw this.zza(iOException0);
        }
    }

    @Override
    public void flush() throws IOException {
        try {
            this.zzaUa.flush();
        }
        catch(IOException iOException0) {
            throw this.zza(iOException0);
        }
    }

    @Override
    public void write(int i) throws IOException {
        try {
            this.zzaUa.write(i);
        }
        catch(IOException iOException0) {
            throw this.zza(iOException0);
        }
    }

    @Override
    public void write(byte[] buffer) throws IOException {
        try {
            this.zzaUa.write(buffer);
        }
        catch(IOException iOException0) {
            throw this.zza(iOException0);
        }
    }

    @Override
    public void write(byte[] buffer, int offset, int count) throws IOException {
        try {
            this.zzaUa.write(buffer, offset, count);
        }
        catch(IOException iOException0) {
            throw this.zza(iOException0);
        }
    }

    zzr zzBb() {
        return (zzj zzj0) -> zzn.this.zzaTY = zzj0;

        class com.google.android.gms.wearable.internal.zzn.1 implements zzr {
            @Override  // com.google.android.gms.wearable.internal.zzr
            public void zzb(zzj zzj0) {
                zzn.this.zzc(zzj0);
            }
        }

    }

    private IOException zza(IOException iOException0) {
        zzj zzj0 = this.zzaTY;
        if(zzj0 != null) {
            if(Log.isLoggable("ChannelOutputStream", 2)) {
                Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", iOException0);
            }
            return new ChannelIOException("Channel closed unexpectedly before stream was finished", zzj0.zzaTN, zzj0.zzaTO);
        }
        return iOException0;
    }

    // 检测为 lambda 实现。
    void zzc(zzj zzj0) {
        this.zzaTY = zzj0;
    }
}

