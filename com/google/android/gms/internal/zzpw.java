package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.tagmanager.Container;
import com.google.android.gms.tagmanager.ContainerHolder;
import com.google.android.gms.tagmanager.TagManager;
import java.util.HashSet;
import java.util.Set;

public class zzpw {
    public interface zza {
        void zzbm();
    }

    private Context mContext;
    private boolean mStarted;
    private static zzpw zzaOV;
    private final Set zzaOW;
    private TagManager zzaOX;
    private zzpv zzoY;

    zzpw(Context context0, TagManager tagManager0) {
        this.zzaOW = new HashSet();
        this.mContext = context0;
        this.zzaOX = tagManager0;
    }

    public void start() throws IllegalStateException {
        synchronized(this) {
            if(this.mStarted) {
                throw new IllegalStateException("Method start() has already been called");
            }
            if(this.zzoY == null) {
                throw new IllegalStateException("No settings configured");
            }
            this.mStarted = true;
            this.zzaOX.zzc(this.zzoY.zzzT(), -1, "admob").setResultCallback(new ResultCallback() {
                public void zza(ContainerHolder containerHolder0) {
                    Container container0 = containerHolder0.getStatus().isSuccess() ? containerHolder0.getContainer() : null;
                    zzpv zzpv0 = new zzpu(zzpw.this.mContext, container0, zzpw.this.zzzX()).zzzR();
                    zzpw.this.zzoY = zzpv0;
                    zzpw.this.zzgy();
                }
            });
        }
    }

    public void zza(zzpv zzpv0) {
        synchronized(this) {
            if(this.mStarted) {
                throw new IllegalStateException("Settings can\'t be changed after TagManager has been started");
            }
            this.zzoY = zzpv0;
        }
    }

    public void zza(zza zzpw$zza0) {
        synchronized(this) {
            this.zzaOW.add(zzpw$zza0);
        }
    }

    public static zzpw zzaK(Context context0) {
        zzu.zzu(context0);
        if(zzpw.zzaOV == null) {
            synchronized(zzpw.class) {
                if(zzpw.zzaOV == null) {
                    zzpw.zzaOV = new zzpw(context0, TagManager.getInstance(context0.getApplicationContext()));
                }
            }
        }
        return zzpw.zzaOV;
    }

    private void zzgy() {
        synchronized(this) {
            for(Object object0: this.zzaOW) {
                ((zza)object0).zzbm();
            }
        }
    }

    public zzpv zzzX() {
        synchronized(this) {
        }
        return this.zzoY;
    }
}

