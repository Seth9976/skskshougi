package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.zzu;

public final class zzi {
    final class zza extends Handler {
        final zzi zzXM;

        public zza(Looper looper0) {
            super(looper0);
        }

        @Override  // android.os.Handler
        public void handleMessage(Message msg) {
            zzu.zzV(msg.what == 1);
            zzi.this.zzb(((zzb)msg.obj));
        }
    }

    public interface zzb {
        void zzmw();

        void zzn(Object arg1);
    }

    private volatile Object mListener;
    private final zza zzXL;

    zzi(Looper looper0, Object object0) {
        this.zzXL = new zza(this, looper0);
        this.mListener = zzu.zzb(object0, "Listener must not be null");
    }

    public void clear() {
        this.mListener = null;
    }

    public void zza(zzb zzi$zzb0) {
        zzu.zzb(zzi$zzb0, "Notifier must not be null");
        Message message0 = this.zzXL.obtainMessage(1, zzi$zzb0);
        this.zzXL.sendMessage(message0);
    }

    void zzb(zzb zzi$zzb0) {
        Object object0 = this.mListener;
        if(object0 == null) {
            zzi$zzb0.zzmw();
            return;
        }
        try {
            zzi$zzb0.zzn(object0);
        }
        catch(RuntimeException runtimeException0) {
            zzi$zzb0.zzmw();
            throw runtimeException0;
        }
    }
}

