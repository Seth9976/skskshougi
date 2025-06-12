package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.stats.zzb;
import java.util.Collections;
import java.util.List;

public class zzi extends zzd {
    public class zza implements ServiceConnection {
        final zzi zzKa;
        private volatile zzac zzKb;
        private volatile boolean zzKc;

        @Override  // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder binder) {
            zzac zzac0;
            zzu.zzbY("AnalyticsServiceConnection.onServiceConnected");
            synchronized(this) {
                try {
                    if(binder == null) {
                        zzi.this.zzaX("Service connected with null binder");
                        goto label_5;
                    }
                    goto label_10;
                }
                catch(Throwable throwable0) {
                    this.notifyAll();
                    throw throwable0;
                }
            }
        label_5:
            this.notifyAll();
            return;
            try {
                try {
                label_10:
                    zzac0 = null;
                    String s = binder.getInterfaceDescriptor();
                    if("com.google.android.gms.analytics.internal.IAnalyticsService".equals(s)) {
                        zzac0 = com.google.android.gms.analytics.internal.zzac.zza.zzac(binder);
                        zzi.this.zzaT("Bound to IAnalyticsService interface");
                    }
                    else {
                        zzi.this.zze("Got binder with a wrong descriptor", s);
                    }
                }
                catch(RemoteException unused_ex) {
                    zzi.this.zzaX("Service connect failed to get IAnalyticsService");
                }
            }
            catch(Throwable throwable0) {
                this.notifyAll();
                throw throwable0;
            }
            if(zzac0 == null) {
                try {
                    zzb.zzoO().zza(zzi.this.getContext(), zzi.this.zzJW);
                }
                catch(IllegalArgumentException unused_ex) {
                }
                catch(Throwable throwable0) {
                    this.notifyAll();
                    throw throwable0;
                }
            }
            else {
                try {
                    if(this.zzKc) {
                        this.zzKb = zzac0;
                    }
                    else {
                        zzi.this.zzaW("onServiceConnected received after the timeout limit");
                        zzi.this.zzhS().zze(new Runnable() {
                            @Override
                            public void run() {
                                if(!zzi.this.isConnected()) {
                                    zzi.this.zzaU("Connected to service after a timeout");
                                    zzi.this.zza(zzac0);
                                }
                            }
                        });
                    }
                }
                catch(Throwable throwable0) {
                    this.notifyAll();
                    throw throwable0;
                }
            }
            this.notifyAll();
        }

        @Override  // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            zzu.zzbY("AnalyticsServiceConnection.onServiceDisconnected");
            zzi.this.zzhS().zze(new Runnable() {
                @Override
                public void run() {
                    zzi.this.onServiceDisconnected(name);
                }
            });
        }

        public zzac zzip() {
            zzi.this.zzhO();
            Intent intent0 = new Intent("com.google.android.gms.analytics.service.START");
            intent0.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
            Context context0 = zzi.this.getContext();
            intent0.putExtra("app_package_name", "org.dyndns.vivi.SkskShogi");
            zzb zzb0 = zzb.zzoO();
            synchronized(this) {
                this.zzKb = null;
                this.zzKc = true;
                boolean z = zzb0.zza(context0, intent0, zzi.this.zzJW, 0x81);
                zzi.this.zza("Bind to service requested", Boolean.valueOf(z));
                if(!z) {
                    this.zzKc = false;
                    return null;
                }
                try {
                    this.wait(zzi.this.zzhR().zzjs());
                }
                catch(InterruptedException unused_ex) {
                    zzi.this.zzaW("Wait for service connect was interrupted");
                }
                this.zzKc = false;
                zzac zzac0 = this.zzKb;
                this.zzKb = null;
                if(zzac0 == null) {
                    zzi.this.zzaX("Successfully bound to service but never got onServiceConnected callback");
                }
                return zzac0;
            }
        }
    }

    private final zza zzJW;
    private zzac zzJX;
    private final zzt zzJY;
    private zzaj zzJZ;

    protected zzi(zzf zzf0) {
        super(zzf0);
        this.zzJZ = new zzaj(zzf0.zzhP());
        this.zzJW = new zza(this);
        this.zzJY = new zzt(zzf0) {
            @Override  // com.google.android.gms.analytics.internal.zzt
            public void run() {
                zzi.this.zzio();
            }
        };
    }

    public boolean connect() {
        this.zzhO();
        this.zzia();
        if(this.zzJX != null) {
            return true;
        }
        zzac zzac0 = this.zzJW.zzip();
        if(zzac0 != null) {
            this.zzJX = zzac0;
            this.zzin();
            return true;
        }
        return false;
    }

    public void disconnect() {
        this.zzhO();
        this.zzia();
        try {
            zzb.zzoO().zza(this.getContext(), this.zzJW);
        }
        catch(IllegalStateException | IllegalArgumentException unused_ex) {
        }
        if(this.zzJX != null) {
            this.zzJX = null;
            this.onDisconnect();
        }
    }

    public boolean isConnected() {
        this.zzhO();
        this.zzia();
        return this.zzJX != null;
    }

    private void onDisconnect() {
        this.zzhl().zzhJ();
    }

    private void onServiceDisconnected(ComponentName name) {
        this.zzhO();
        if(this.zzJX != null) {
            this.zzJX = null;
            this.zza("Disconnected from device AnalyticsService", name);
            this.onDisconnect();
        }
    }

    private void zza(zzac zzac0) {
        this.zzhO();
        this.zzJX = zzac0;
        this.zzin();
        this.zzhl().onServiceConnected();
    }

    public boolean zzb(zzab zzab0) {
        zzu.zzu(zzab0);
        this.zzhO();
        this.zzia();
        zzac zzac0 = this.zzJX;
        if(zzac0 == null) {
            return false;
        }
        String s = zzab0.zzjY() ? "https://ssl.google-analytics.com" : "http://www.google-analytics.com";
        List list0 = Collections.emptyList();
        try {
            zzac0.zza(zzab0.zzn(), zzab0.zzjW(), s, list0);
            this.zzin();
            return true;
        }
        catch(RemoteException unused_ex) {
            this.zzaT("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
    }

    public boolean zzim() {
        this.zzhO();
        this.zzia();
        zzac zzac0 = this.zzJX;
        if(zzac0 == null) {
            return false;
        }
        try {
            zzac0.zzhG();
            this.zzin();
            return true;
        }
        catch(RemoteException unused_ex) {
            this.zzaT("Failed to clear hits from AnalyticsService");
            return false;
        }
    }

    private void zzin() {
        this.zzJZ.start();
        long v = this.zzhR().zzjr();
        this.zzJY.zzt(v);
    }

    private void zzio() {
        this.zzhO();
        if(!this.isConnected()) {
            return;
        }
        this.zzaT("Inactivity, disconnecting from device AnalyticsService");
        this.disconnect();
    }
}

