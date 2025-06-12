package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

class zzat extends Thread implements zzas {
    private volatile boolean mClosed;
    private final Context mContext;
    private volatile boolean zzKU;
    private final LinkedBlockingQueue zzaLO;
    private static zzat zzaLP;
    private volatile zzau zzaLQ;

    private zzat(Context context0) {
        super("GAThread");
        this.zzaLO = new LinkedBlockingQueue();
        this.zzKU = false;
        this.mClosed = false;
        this.mContext = context0 == null ? null : context0.getApplicationContext();
        this.start();
    }

    @Override
    public void run() {
        while(!this.mClosed) {
            try {
                try {
                    Runnable runnable0 = (Runnable)this.zzaLO.take();
                    if(this.zzKU) {
                        continue;
                    }
                    runnable0.run();
                }
                catch(InterruptedException interruptedException0) {
                    zzbg.zzaA(interruptedException0.toString());
                }
            }
            catch(Throwable throwable0) {
                zzbg.zzaz(("Error on Google TagManager Thread: " + this.zzd(throwable0)));
                zzbg.zzaz("Google TagManager is shutting down.");
                this.zzKU = true;
            }
        }
    }

    static zzat zzaH(Context context0) {
        if(zzat.zzaLP == null) {
            zzat.zzaLP = new zzat(context0);
        }
        return zzat.zzaLP;
    }

    private String zzd(Throwable throwable0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        PrintStream printStream0 = new PrintStream(byteArrayOutputStream0);
        throwable0.printStackTrace(printStream0);
        printStream0.flush();
        return new String(byteArrayOutputStream0.toByteArray());
    }

    @Override  // com.google.android.gms.tagmanager.zzas
    public void zzew(String s) {
        this.zzh(s, System.currentTimeMillis());
    }

    @Override  // com.google.android.gms.tagmanager.zzas
    public void zzf(Runnable runnable0) {
        this.zzaLO.add(runnable0);
    }

    void zzh(String s, long v) {
        this.zzf(new Runnable() {
            @Override
            public void run() {
                if(zzat.this.zzaLQ == null) {
                    zzcu zzcu0 = zzcu.zzzz();
                    zzcu0.zza(zzat.this.mContext, this);
                    zzau zzau0 = zzcu0.zzzC();
                    zzat.this.zzaLQ = zzau0;
                }
                zzat.this.zzaLQ.zzg(v, s);
            }
        });
    }
}

