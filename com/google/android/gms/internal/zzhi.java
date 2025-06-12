package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzo;

@zzgd
public class zzhi extends Handler {
    public zzhi(Looper looper0) {
        super(looper0);
    }

    @Override  // android.os.Handler
    public void handleMessage(Message msg) {
        try {
            super.handleMessage(msg);
        }
        catch(Exception exception0) {
            zzo.zzby().zzc(exception0, false);
            throw exception0;
        }
    }
}

