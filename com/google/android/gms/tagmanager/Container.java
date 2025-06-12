package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzaf.zzf;
import com.google.android.gms.internal.zzaf.zzi;
import com.google.android.gms.internal.zzaf.zzj;
import com.google.android.gms.internal.zzqf.zzc;
import com.google.android.gms.internal.zzqf.zzg;
import com.google.android.gms.internal.zzqf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Container {
    public interface FunctionCallMacroCallback {
        Object getValue(String arg1, Map arg2);
    }

    public interface FunctionCallTagCallback {
        void execute(String arg1, Map arg2);
    }

    class zza implements com.google.android.gms.tagmanager.zzt.zza {
        final Container zzaKF;

        private zza() {
        }

        zza(com.google.android.gms.tagmanager.Container.1 container$10) {
        }

        @Override  // com.google.android.gms.tagmanager.zzt$zza
        public Object zzd(String s, Map map0) {
            FunctionCallMacroCallback container$FunctionCallMacroCallback0 = Container.this.zzef(s);
            return container$FunctionCallMacroCallback0 == null ? null : container$FunctionCallMacroCallback0.getValue(s, map0);
        }
    }

    class zzb implements com.google.android.gms.tagmanager.zzt.zza {
        final Container zzaKF;

        private zzb() {
        }

        zzb(com.google.android.gms.tagmanager.Container.1 container$10) {
        }

        @Override  // com.google.android.gms.tagmanager.zzt$zza
        public Object zzd(String s, Map map0) {
            FunctionCallTagCallback container$FunctionCallTagCallback0 = Container.this.zzeg(s);
            if(container$FunctionCallTagCallback0 != null) {
                container$FunctionCallTagCallback0.execute(s, map0);
            }
            return "";
        }
    }

    private final Context mContext;
    private zzcp zzaKA;
    private Map zzaKB;
    private Map zzaKC;
    private volatile long zzaKD;
    private volatile String zzaKE;
    private final String zzaKy;
    private final DataLayer zzaKz;

    Container(Context context, DataLayer dataLayer, String containerId, long lastRefreshTime, zzj resource) {
        this.zzaKB = new HashMap();
        this.zzaKC = new HashMap();
        this.zzaKE = "";
        this.mContext = context;
        this.zzaKz = dataLayer;
        this.zzaKy = containerId;
        this.zzaKD = lastRefreshTime;
        this.zza(resource.zziO);
        if(resource.zziN != null) {
            this.zza(resource.zziN);
        }
    }

    Container(Context context, DataLayer dataLayer, String containerId, long lastRefreshTime, zzc resource) {
        this.zzaKB = new HashMap();
        this.zzaKC = new HashMap();
        this.zzaKE = "";
        this.mContext = context;
        this.zzaKz = dataLayer;
        this.zzaKy = containerId;
        this.zzaKD = lastRefreshTime;
        this.zza(resource);
    }

    public boolean getBoolean(String key) {
        zzcp zzcp0 = this.zzyn();
        if(zzcp0 == null) {
            zzbg.zzaz("getBoolean called for closed container.");
            return zzdf.zzzN().booleanValue();
        }
        try {
            return zzdf.zzk(((com.google.android.gms.internal.zzag.zza)zzcp0.zzeD(key).getObject())).booleanValue();
        }
        catch(Exception exception0) {
            zzbg.zzaz(("Calling getBoolean() threw an exception: " + exception0.getMessage() + " Returning default value."));
            return zzdf.zzzN().booleanValue();
        }
    }

    public String getContainerId() {
        return this.zzaKy;
    }

    public double getDouble(String key) {
        zzcp zzcp0 = this.zzyn();
        if(zzcp0 == null) {
            zzbg.zzaz("getDouble called for closed container.");
            return (double)zzdf.zzzM();
        }
        try {
            return (double)zzdf.zzj(((com.google.android.gms.internal.zzag.zza)zzcp0.zzeD(key).getObject()));
        }
        catch(Exception exception0) {
            zzbg.zzaz(("Calling getDouble() threw an exception: " + exception0.getMessage() + " Returning default value."));
            return (double)zzdf.zzzM();
        }
    }

    public long getLastRefreshTime() {
        return this.zzaKD;
    }

    public long getLong(String key) {
        zzcp zzcp0 = this.zzyn();
        if(zzcp0 == null) {
            zzbg.zzaz("getLong called for closed container.");
            return (long)zzdf.zzzL();
        }
        try {
            return (long)zzdf.zzi(((com.google.android.gms.internal.zzag.zza)zzcp0.zzeD(key).getObject()));
        }
        catch(Exception exception0) {
            zzbg.zzaz(("Calling getLong() threw an exception: " + exception0.getMessage() + " Returning default value."));
            return (long)zzdf.zzzL();
        }
    }

    public String getString(String key) {
        zzcp zzcp0 = this.zzyn();
        if(zzcp0 == null) {
            zzbg.zzaz("getString called for closed container.");
            return "";
        }
        try {
            return zzdf.zzg(((com.google.android.gms.internal.zzag.zza)zzcp0.zzeD(key).getObject()));
        }
        catch(Exception exception0) {
            zzbg.zzaz(("Calling getString() threw an exception: " + exception0.getMessage() + " Returning default value."));
            return "";
        }
    }

    public boolean isDefault() {
        return this.getLastRefreshTime() == 0L;
    }

    public void registerFunctionCallMacroCallback(String customMacroName, FunctionCallMacroCallback customMacroCallback) {
        if(customMacroCallback == null) {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized(this.zzaKB) {
            this.zzaKB.put(customMacroName, customMacroCallback);
        }
    }

    public void registerFunctionCallTagCallback(String customTagName, FunctionCallTagCallback customTagCallback) {
        if(customTagCallback == null) {
            throw new NullPointerException("Tag callback must be non-null");
        }
        synchronized(this.zzaKC) {
            this.zzaKC.put(customTagName, customTagCallback);
        }
    }

    void release() {
        this.zzaKA = null;
    }

    public void unregisterFunctionCallMacroCallback(String customMacroName) {
        synchronized(this.zzaKB) {
            this.zzaKB.remove(customMacroName);
        }
    }

    public void unregisterFunctionCallTagCallback(String customTagName) {
        synchronized(this.zzaKC) {
            this.zzaKC.remove(customTagName);
        }
    }

    private void zza(zzf zzaf$zzf0) {
        zzc zzqf$zzc0;
        if(zzaf$zzf0 == null) {
            throw new NullPointerException();
        }
        try {
            zzqf$zzc0 = zzqf.zzb(zzaf$zzf0);
        }
        catch(zzg zzqf$zzg0) {
            zzbg.zzaz(("Not loading resource: " + zzaf$zzf0 + " because it is invalid: " + zzqf$zzg0.toString()));
            return;
        }
        this.zza(zzqf$zzc0);
    }

    private void zza(zzc zzqf$zzc0) {
        this.zzaKE = zzqf$zzc0.getVersion();
        zzah zzah0 = this.zzei(this.zzaKE);
        zza container$zza0 = new zza(this, null);
        zzb container$zzb0 = new zzb(this, null);
        this.zza(new zzcp(this.mContext, zzqf$zzc0, this.zzaKz, container$zza0, container$zzb0, zzah0));
        if(this.getBoolean("_gtm.loadEventEnabled")) {
            Map map0 = DataLayer.mapOf(new Object[]{"gtm.id", this.zzaKy});
            this.zzaKz.pushEvent("gtm.load", map0);
        }
    }

    private void zza(zzcp zzcp0) {
        synchronized(this) {
            this.zzaKA = zzcp0;
        }
    }

    private void zza(zzi[] arr_zzaf$zzi) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_zzaf$zzi.length; ++v) {
            arrayList0.add(arr_zzaf$zzi[v]);
        }
        this.zzyn().zzs(arrayList0);
    }

    FunctionCallMacroCallback zzef(String s) {
        synchronized(this.zzaKB) {
        }
        return (FunctionCallMacroCallback)this.zzaKB.get(s);
    }

    FunctionCallTagCallback zzeg(String s) {
        synchronized(this.zzaKC) {
        }
        return (FunctionCallTagCallback)this.zzaKC.get(s);
    }

    void zzeh(String s) {
        this.zzyn().zzeh(s);
    }

    zzah zzei(String s) {
        zzcb.zzzf().zzzg().equals(com.google.android.gms.tagmanager.zzcb.zza.zzaMK);
        return new zzbo();
    }

    String zzym() {
        return this.zzaKE;
    }

    private zzcp zzyn() {
        synchronized(this) {
        }
        return this.zzaKA;
    }

    class com.google.android.gms.tagmanager.Container.1 {
    }

}

