package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.internal.zzla;
import com.google.android.gms.internal.zzll;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class zzb {
    private static final Object zzaaJ;
    private static zzb zzack;
    private final List zzacl;
    private final List zzacm;
    private final List zzacn;
    private final List zzaco;
    private static final ComponentName zzacp;
    private zze zzacq;

    static {
        zzb.zzaaJ = new Object();
        zzb.zzacp = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    }

    private zzb() {
        if(this.getLogLevel() == zzd.zzacz) {
            this.zzacl = Collections.EMPTY_LIST;
            this.zzacm = Collections.EMPTY_LIST;
            this.zzacn = Collections.EMPTY_LIST;
            this.zzaco = Collections.EMPTY_LIST;
            return;
        }
        String s = (String)zza.zzacu.get();
        this.zzacl = s == null ? Collections.EMPTY_LIST : Arrays.asList(s.split(","));
        String s1 = (String)zza.zzacv.get();
        this.zzacm = s1 == null ? Collections.EMPTY_LIST : Arrays.asList(s1.split(","));
        String s2 = (String)zza.zzacw.get();
        this.zzacn = s2 == null ? Collections.EMPTY_LIST : Arrays.asList(s2.split(","));
        String s3 = (String)zza.zzacx.get();
        this.zzaco = s3 == null ? Collections.EMPTY_LIST : Arrays.asList(s3.split(","));
        this.zzacq = new zze(0x400, ((long)(((Long)zza.zzacy.get()))));
    }

    private int getLogLevel() {
        try {
            return zzla.zziW() ? ((int)(((Integer)zza.zzact.get()))) : zzd.zzacz;
        }
        catch(SecurityException unused_ex) {
            return zzd.zzacz;
        }
    }

    private void zza(Context context0, ServiceConnection serviceConnection0, String s, Intent intent0, int v) {
    }

    private boolean zza(Context context0, Intent intent0) {
        ComponentName componentName0 = intent0.getComponent();
        return componentName0 == null ? false : zzla.zzi(context0, componentName0.getPackageName());
    }

    private boolean zza(Context context0, String s, Intent intent0, String s1, int v) {
        int v1 = this.getLogLevel();
        if(v1 != zzd.zzacz && this.zzacq != null) {
            if(v == 1 || v == 4) {
                return this.zzacq.zzcq(s1);
            }
            ServiceInfo serviceInfo0 = zzb.zzb(context0, intent0);
            if(serviceInfo0 == null) {
                Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", s, intent0.toUri(0)));
                return false;
            }
            String s2 = zzll.zzaj(context0);
            String s3 = serviceInfo0.processName;
            String s4 = serviceInfo0.name;
            if(!this.zzacl.contains(s2) && !this.zzacm.contains(s) && !this.zzacn.contains(s3) && !this.zzaco.contains(s4) && (!s3.equals(s2) || (v1 & zzd.zzacE) == 0)) {
                this.zzacq.zzcp(s1);
                return true;
            }
        }
        return false;
    }

    public void zza(Context context0, ServiceConnection serviceConnection0) {
        this.zza(context0, serviceConnection0, null, null, 1);
        context0.unbindService(serviceConnection0);
    }

    public void zza(Context context0, ServiceConnection serviceConnection0, String s, Intent intent0) {
        this.zza(context0, serviceConnection0, s, intent0, 3);
    }

    public boolean zza(Context context0, Intent intent0, ServiceConnection serviceConnection0, int v) {
        return this.zza(context0, context0.getClass().getName(), intent0, serviceConnection0, v);
    }

    public boolean zza(Context context0, String s, Intent intent0, ServiceConnection serviceConnection0, int v) {
        if(this.zza(context0, intent0)) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        this.zza(context0, serviceConnection0, s, intent0, 2);
        return context0.bindService(intent0, serviceConnection0, v);
    }

    private static ServiceInfo zzb(Context context0, Intent intent0) {
        List list0 = context0.getPackageManager().queryIntentServices(intent0, 0x80);
        if(list0 == null || list0.size() == 0) {
            Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", intent0.toUri(0), "<bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> "));
            return null;
        }
        if(list0.size() > 1) {
            Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", intent0.toUri(0), "<bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> <bottom of call stack> "));
            Iterator iterator0 = list0.iterator();
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Log.w("ConnectionTracker", ((ResolveInfo)object0).serviceInfo.name);
                return null;
            }
        }
        return ((ResolveInfo)list0.get(0)).serviceInfo;
    }

    private String zzb(ServiceConnection serviceConnection0) {
        return String.valueOf(Process.myPid() << 0x20 | System.identityHashCode(serviceConnection0));
    }

    public void zzb(Context context0, ServiceConnection serviceConnection0) {
        this.zza(context0, serviceConnection0, null, null, 4);
    }

    public static zzb zzoO() {
        synchronized(zzb.zzaaJ) {
            if(zzb.zzack == null) {
                zzb.zzack = new zzb();
            }
            return zzb.zzack;
        }
    }
}

