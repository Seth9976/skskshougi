package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import java.io.IOException;

class zza {
    public interface com.google.android.gms.tagmanager.zza.zza {
        Info zzyg();
    }

    private volatile boolean mClosed;
    private final Context mContext;
    private final Thread zzFZ;
    private volatile Info zzJl;
    private volatile long zzaKh;
    private volatile long zzaKi;
    private volatile long zzaKj;
    private com.google.android.gms.tagmanager.zza.zza zzaKk;
    private static Object zzaKl;
    private static zza zzaKm;
    private final zzlb zzpw;

    static {
        zza.zzaKl = new Object();
    }

    private zza(Context context0) {
        this(context0, null, zzld.zzoQ());
    }

    zza(Context context0, com.google.android.gms.tagmanager.zza.zza zza$zza0, zzlb zzlb0) {
        this.zzaKh = 900000L;
        this.zzaKi = 30000L;
        this.mClosed = false;
        this.zzaKk = new com.google.android.gms.tagmanager.zza.zza() {
            @Override  // com.google.android.gms.tagmanager.zza$zza
            public Info zzyg() {
                try {
                    return AdvertisingIdClient.getAdvertisingIdInfo(zza.this.mContext);
                }
                catch(IllegalStateException unused_ex) {
                    zzbg.zzaC("IllegalStateException getting Advertising Id Info");
                    return null;
                }
                catch(GooglePlayServicesRepairableException unused_ex) {
                    zzbg.zzaC("GooglePlayServicesRepairableException getting Advertising Id Info");
                    return null;
                }
                catch(IOException unused_ex) {
                    zzbg.zzaC("IOException getting Ad Id Info");
                    return null;
                }
                catch(GooglePlayServicesNotAvailableException unused_ex) {
                    zzbg.zzaC("GooglePlayServicesNotAvailableException getting Advertising Id Info");
                    return null;
                }
                catch(Exception unused_ex) {
                    zzbg.zzaC("Unknown exception. Could not get the Advertising Id Info.");
                    return null;
                }
            }
        };
        this.zzpw = zzlb0;
        this.mContext = context0 == null ? null : context0.getApplicationContext();
        if(zza$zza0 != null) {
            this.zzaKk = zza$zza0;
        }
        this.zzFZ = new Thread(() -> {
            Process.setThreadPriority(10);
            while(!zza.this.mClosed) {
                try {
                    zza.this.zzJl = zza.this.zzaKk.zzyg();
                    Thread.sleep(zza.this.zzaKh);
                }
                catch(InterruptedException unused_ex) {
                    zzbg.zzaA("sleep interrupted in AdvertiserDataPoller thread; continuing");
                }
            }
        });

        class com.google.android.gms.tagmanager.zza.2 implements Runnable {
            @Override
            public void run() {
                zza.this.zzye();
            }
        }

    }

    void interrupt() {
        this.zzFZ.interrupt();
    }

    public boolean isLimitAdTrackingEnabled() {
        this.zzyf();
        return this.zzJl == null ? true : this.zzJl.isLimitAdTrackingEnabled();
    }

    void start() {
        this.zzFZ.start();
    }

    static zza zzaE(Context context0) {
        if(zza.zzaKm == null) {
            Object object0 = zza.zzaKl;
            synchronized(object0) {
                if(zza.zzaKm == null) {
                    zza.zzaKm = new zza(context0);
                    zza.zzaKm.start();
                }
            }
        }
        return zza.zzaKm;
    }

    public String zzyd() {
        this.zzyf();
        return this.zzJl == null ? null : this.zzJl.getId();
    }

    // 检测为 lambda 实现。
    private void zzye() {
        Process.setThreadPriority(10);
        while(!this.mClosed) {
            try {
                this.zzJl = this.zzaKk.zzyg();
                Thread.sleep(this.zzaKh);
            }
            catch(InterruptedException unused_ex) {
                zzbg.zzaA("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private void zzyf() {
        if(this.zzpw.currentTimeMillis() - this.zzaKj < this.zzaKi) {
            return;
        }
        this.interrupt();
        this.zzaKj = this.zzpw.currentTimeMillis();
    }
}

