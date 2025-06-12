package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzns;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class zzb extends zzd {
    private final zzl zzJq;

    public zzb(zzf zzf0, zzg zzg0) {
        super(zzf0);
        zzu.zzu(zzg0);
        this.zzJq = zzg0.zzj(zzf0);
    }

    void onServiceConnected() {
        this.zzhO();
        this.zzJq.onServiceConnected();
    }

    public void setLocalDispatchPeriod(int dispatchPeriodInSeconds) {
        this.zzia();
        this.zzb("setLocalDispatchPeriod (sec)", dispatchPeriodInSeconds);
        this.zzhS().zze(new Runnable() {
            @Override
            public void run() {
                zzb.this.zzJq.zzs(((long)dispatchPeriodInSeconds) * 1000L);
            }
        });
    }

    public void start() {
        this.zzJq.start();
    }

    public void zzG(boolean z) {
        this.zza("Network connectivity status changed", Boolean.valueOf(z));
        this.zzhS().zze(new Runnable() {
            @Override
            public void run() {
                zzb.this.zzJq.zzG(z);
            }
        });
    }

    public long zza(zzh zzh0) {
        this.zzia();
        zzu.zzu(zzh0);
        this.zzhO();
        long v = this.zzJq.zza(zzh0, true);
        if(v == 0L) {
            this.zzJq.zzc(zzh0);
        }
        return v;
    }

    public void zza(zzab zzab0) {
        zzu.zzu(zzab0);
        this.zzia();
        this.zzb("Hit delivery requested", zzab0);
        this.zzhS().zze(new Runnable() {
            @Override
            public void run() {
                zzb.this.zzJq.zza(zzab0);
            }
        });
    }

    public void zza(zzw zzw0) {
        this.zzia();
        this.zzhS().zze(new Runnable() {
            @Override
            public void run() {
                zzb.this.zzJq.zzb(zzw0);
            }
        });
    }

    public void zza(String s, Runnable runnable0) {
        zzu.zzh(s, "campaign param can\'t be empty");
        this.zzhS().zze(new Runnable() {
            @Override
            public void run() {
                zzb.this.zzJq.zzbb(s);
                if(runnable0 != null) {
                    runnable0.run();
                }
            }
        });
    }

    public void zzhG() {
        this.zzia();
        this.zzhN();
        this.zzhS().zze(new Runnable() {
            @Override
            public void run() {
                zzb.this.zzJq.zzhG();
            }
        });
    }

    public void zzhH() {
        this.zzia();
        Context context0 = this.getContext();
        if(AnalyticsReceiver.zzT(context0) && AnalyticsService.zzU(context0)) {
            Intent intent0 = new Intent(context0, AnalyticsService.class);
            intent0.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context0.startService(intent0);
            return;
        }
        this.zza(null);
    }

    public boolean zzhI() {
        this.zzia();
        Future future0 = this.zzhS().zzb(new Callable() {
            public Void zzgk() throws Exception {
                zzb.this.zzJq.zziF();
                return null;
            }
        });
        try {
            future0.get();
            return true;
        }
        catch(InterruptedException interruptedException0) {
            this.zzd("syncDispatchLocalHits interrupted", interruptedException0);
            return false;
        }
        catch(ExecutionException executionException0) {
            this.zze("syncDispatchLocalHits failed", executionException0);
            return false;
        }
    }

    public void zzhJ() {
        this.zzia();
        zzns.zzhO();
        this.zzJq.zzhJ();
    }

    public void zzhK() {
        this.zzaT("Radio powered up");
        this.zzhH();
    }

    void zzhL() {
        this.zzhO();
        this.zzJq.zzhL();
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
        this.zzJq.zza();
    }
}

