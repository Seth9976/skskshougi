package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TagManager {
    public interface zza {
        zzp zza(Context arg1, TagManager arg2, Looper arg3, String arg4, int arg5, zzs arg6);
    }

    private final Context mContext;
    private final DataLayer zzaKz;
    private final zzs zzaMV;
    private final zza zzaNY;
    private final zzct zzaNZ;
    private final ConcurrentMap zzaOa;
    private static TagManager zzaOb;

    TagManager(Context context, zza containerHolderLoaderProvider, DataLayer dataLayer, zzct serviceManager) {
        if(context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.mContext = context.getApplicationContext();
        this.zzaNZ = serviceManager;
        this.zzaNY = containerHolderLoaderProvider;
        this.zzaOa = new ConcurrentHashMap();
        this.zzaKz = dataLayer;
        com.google.android.gms.tagmanager.TagManager.1 tagManager$10 = new zzb() {
            @Override  // com.google.android.gms.tagmanager.DataLayer$zzb
            public void zzF(Map map0) {
                Object object0 = map0.get("event");
                if(object0 != null) {
                    TagManager.this.zzeF(object0.toString());
                }
            }
        };
        this.zzaKz.zza(tagManager$10);
        zzd zzd0 = new zzd(this.mContext);
        this.zzaKz.zza(zzd0);
        this.zzaMV = new zzs();
        this.zzzE();
    }

    public void dispatch() {
        this.zzaNZ.dispatch();
    }

    public DataLayer getDataLayer() {
        return this.zzaKz;
    }

    public static TagManager getInstance(Context context) {
        synchronized(TagManager.class) {
            if(TagManager.zzaOb == null) {
                if(context == null) {
                    zzbg.zzaz("TagManager.getInstance requires non-null context.");
                    throw new NullPointerException();
                }
                TagManager.zzaOb = new TagManager(context, new zza() {
                    @Override  // com.google.android.gms.tagmanager.TagManager$zza
                    public zzp zza(Context context0, TagManager tagManager0, Looper looper0, String s, int v, zzs zzs0) {
                        return new zzp(context0, tagManager0, looper0, s, v, zzs0);
                    }
                }, new DataLayer(new zzw(context)), zzcu.zzzz());
            }
            return TagManager.zzaOb;
        }
    }

    public PendingResult loadContainerDefaultOnly(String containerId, int defaultContainerResourceId) {
        PendingResult pendingResult0 = this.zzaNY.zza(this.mContext, this, null, containerId, defaultContainerResourceId, this.zzaMV);
        ((zzp)pendingResult0).zzyr();
        return pendingResult0;
    }

    public PendingResult loadContainerDefaultOnly(String containerId, int defaultContainerResourceId, Handler handler) {
        Looper looper0 = handler.getLooper();
        PendingResult pendingResult0 = this.zzaNY.zza(this.mContext, this, looper0, containerId, defaultContainerResourceId, this.zzaMV);
        ((zzp)pendingResult0).zzyr();
        return pendingResult0;
    }

    public PendingResult loadContainerPreferFresh(String containerId, int defaultContainerResourceId) {
        PendingResult pendingResult0 = this.zzaNY.zza(this.mContext, this, null, containerId, defaultContainerResourceId, this.zzaMV);
        ((zzp)pendingResult0).zzyt();
        return pendingResult0;
    }

    public PendingResult loadContainerPreferFresh(String containerId, int defaultContainerResourceId, Handler handler) {
        Looper looper0 = handler.getLooper();
        PendingResult pendingResult0 = this.zzaNY.zza(this.mContext, this, looper0, containerId, defaultContainerResourceId, this.zzaMV);
        ((zzp)pendingResult0).zzyt();
        return pendingResult0;
    }

    public PendingResult loadContainerPreferNonDefault(String containerId, int defaultContainerResourceId) {
        PendingResult pendingResult0 = this.zzaNY.zza(this.mContext, this, null, containerId, defaultContainerResourceId, this.zzaMV);
        ((zzp)pendingResult0).zzys();
        return pendingResult0;
    }

    public PendingResult loadContainerPreferNonDefault(String containerId, int defaultContainerResourceId, Handler handler) {
        Looper looper0 = handler.getLooper();
        PendingResult pendingResult0 = this.zzaNY.zza(this.mContext, this, looper0, containerId, defaultContainerResourceId, this.zzaMV);
        ((zzp)pendingResult0).zzys();
        return pendingResult0;
    }

    public void setVerboseLoggingEnabled(boolean enableVerboseLogging) {
        zzbg.setLogLevel((enableVerboseLogging ? 2 : 5));
    }

    void zza(zzo zzo0) {
        this.zzaOa.put(zzo0, Boolean.TRUE);
    }

    boolean zzb(zzo zzo0) {
        return this.zzaOa.remove(zzo0) != null;
    }

    public PendingResult zzc(String s, int v, String s1) {
        PendingResult pendingResult0 = this.zzaNY.zza(this.mContext, this, null, s, v, this.zzaMV);
        ((zzp)pendingResult0).load(s1);
        return pendingResult0;
    }

    private void zzeF(String s) {
        for(Object object0: this.zzaOa.keySet()) {
            ((zzo)object0).zzeh(s);
        }
    }

    boolean zzl(Uri uri0) {
        boolean z;
        synchronized(this) {
            zzcb zzcb0 = zzcb.zzzf();
            if(zzcb0.zzl(uri0)) {
                String s = zzcb0.getContainerId();
                switch(zzcb0.zzzg()) {
                    case zzaMI: {
                        for(Object object0: this.zzaOa.keySet()) {
                            zzo zzo0 = (zzo)object0;
                            if(zzo0.getContainerId().equals(s)) {
                                zzo0.zzej(null);
                                zzo0.refresh();
                            }
                        }
                        break;
                    }
                    case zzaMJ: 
                    case zzaMK: {
                        for(Object object1: this.zzaOa.keySet()) {
                            zzo zzo1 = (zzo)object1;
                            if(zzo1.getContainerId().equals(s)) {
                                zzo1.zzej(zzcb0.zzzh());
                                zzo1.refresh();
                            }
                            else if(zzo1.zzyo() != null) {
                                zzo1.zzej(null);
                                zzo1.refresh();
                            }
                        }
                    }
                }
                z = true;
            }
            else {
                z = false;
            }
            return z;
        }
    }

    private void zzzE() {
        if(Build.VERSION.SDK_INT >= 14) {
            com.google.android.gms.tagmanager.TagManager.3 tagManager$30 = new ComponentCallbacks2() {
                @Override  // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                }

                @Override  // android.content.ComponentCallbacks
                public void onLowMemory() {
                }

                @Override  // android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
                    if(i == 20) {
                        TagManager.this.dispatch();
                    }
                }
            };
            this.mContext.registerComponentCallbacks(tagManager$30);
        }
    }
}

