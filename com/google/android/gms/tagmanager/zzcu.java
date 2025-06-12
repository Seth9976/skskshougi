package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Message;

class zzcu extends zzct {
    private boolean connected;
    private Handler handler;
    private static final Object zzaND;
    private Context zzaNE;
    private zzau zzaNF;
    private volatile zzas zzaNG;
    private int zzaNH;
    private boolean zzaNI;
    private boolean zzaNJ;
    private boolean zzaNK;
    private zzav zzaNL;
    private zzbl zzaNM;
    private boolean zzaNN;
    private static zzcu zzaNO;

    static {
        zzcu.zzaND = new Object();
    }

    private zzcu() {
        this.zzaNH = 1800000;
        this.zzaNI = true;
        this.zzaNJ = false;
        this.connected = true;
        this.zzaNK = true;
        this.zzaNL = new zzav() {
            @Override  // com.google.android.gms.tagmanager.zzav
            public void zzan(boolean z) {
                boolean z1 = zzcu.this.connected;
                zzcu.this.zzd(z, z1);
            }
        };
        this.zzaNN = false;
    }

    @Override  // com.google.android.gms.tagmanager.zzct
    public void dispatch() {
        synchronized(this) {
            if(this.zzaNJ) {
                this.zzaNG.zzf(new Runnable() {
                    @Override
                    public void run() {
                        zzcu.this.zzaNF.dispatch();
                    }
                });
            }
            else {
                zzbg.zzaB("Dispatch call queued. Dispatch will run once initialization is complete.");
                this.zzaNI = true;
            }
        }
    }

    void zza(Context context0, zzas zzas0) {
        synchronized(this) {
            if(this.zzaNE == null) {
                this.zzaNE = context0.getApplicationContext();
                if(this.zzaNG == null) {
                    this.zzaNG = zzas0;
                }
            }
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzct
    void zzao(boolean z) {
        synchronized(this) {
            this.zzd(this.zzaNN, z);
        }
    }

    void zzd(boolean z, boolean z1) {
        synchronized(this) {
            if(this.zzaNN != z || this.connected != z1) {
                if((z || !z1) && this.zzaNH > 0) {
                    this.handler.removeMessages(1, zzcu.zzaND);
                }
                if(!z && z1 && this.zzaNH > 0) {
                    this.handler.sendMessageDelayed(this.handler.obtainMessage(1, zzcu.zzaND), ((long)this.zzaNH));
                }
                zzbg.zzaB(("PowerSaveMode " + (!z && z1 ? "terminated." : "initiated.")));
                this.zzaNN = z;
                this.connected = z1;
            }
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzct
    void zzhK() {
        synchronized(this) {
            if(!this.zzaNN && this.connected && this.zzaNH > 0) {
                this.handler.removeMessages(1, zzcu.zzaND);
                this.handler.sendMessage(this.handler.obtainMessage(1, zzcu.zzaND));
            }
        }
    }

    private void zzzA() {
        this.zzaNM = new zzbl(this);
        this.zzaNM.zzaI(this.zzaNE);
    }

    private void zzzB() {
        this.handler = new Handler(this.zzaNE.getMainLooper(), new Handler.Callback() {
            @Override  // android.os.Handler$Callback
            public boolean handleMessage(Message msg) {
                if(1 == msg.what && zzcu.zzaND.equals(msg.obj)) {
                    zzcu.this.dispatch();
                    if(zzcu.this.zzaNH > 0 && !zzcu.this.zzaNN) {
                        zzcu.this.handler.sendMessageDelayed(zzcu.this.handler.obtainMessage(1, zzcu.zzaND), ((long)zzcu.this.zzaNH));
                    }
                }
                return true;
            }
        });
        if(this.zzaNH > 0) {
            this.handler.sendMessageDelayed(this.handler.obtainMessage(1, zzcu.zzaND), ((long)this.zzaNH));
        }
    }

    zzau zzzC() {
        synchronized(this) {
            if(this.zzaNF == null) {
                if(this.zzaNE == null) {
                    throw new IllegalStateException("Cant get a store unless we have a context");
                }
                this.zzaNF = new zzby(this.zzaNL, this.zzaNE);
            }
            if(this.handler == null) {
                this.zzzB();
            }
            this.zzaNJ = true;
            if(this.zzaNI) {
                this.dispatch();
                this.zzaNI = false;
            }
            if(this.zzaNM == null && this.zzaNK) {
                this.zzzA();
            }
            return this.zzaNF;
        }
    }

    public static zzcu zzzz() {
        if(zzcu.zzaNO == null) {
            zzcu.zzaNO = new zzcu();
        }
        return zzcu.zzaNO;
    }
}

