package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import java.util.ArrayList;
import java.util.List;

@zzgd
public class zzcr extends NativeContentAd {
    private final List zzvL;
    private final zzcq zzvN;
    private final zzcl zzvO;

    public zzcr(zzcq zzcq0) {
        zzcl zzcl1;
        this.zzvL = new ArrayList();
        this.zzvN = zzcq0;
        try {
            for(Object object0: this.zzvN.getImages()) {
                zzck zzck0 = this.zzd(object0);
                if(zzck0 != null) {
                    zzcl zzcl0 = new zzcl(zzck0);
                    this.zzvL.add(zzcl0);
                }
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get image.", remoteException0);
        }
        try {
            zzck zzck1 = this.zzvN.zzdG();
            if(zzck1 == null) {
                zzcl1 = null;
                this.zzvO = zzcl1;
                return;
            }
            else {
                zzcl1 = new zzcl(zzck1);
            }
        }
        catch(RemoteException remoteException1) {
            zzb.zzb("Failed to get icon.", remoteException1);
            zzcl1 = null;
        }
        this.zzvO = zzcl1;
    }

    @Override  // com.google.android.gms.ads.formats.NativeContentAd
    public CharSequence getAdvertiser() {
        try {
            return this.zzvN.zzdH();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get attribution.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeContentAd
    public CharSequence getBody() {
        try {
            return this.zzvN.getBody();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get body.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeContentAd
    public CharSequence getCallToAction() {
        try {
            return this.zzvN.zzdz();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get call to action.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeContentAd
    public CharSequence getHeadline() {
        try {
            return this.zzvN.zzdx();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get headline.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeContentAd
    public List getImages() {
        return this.zzvL;
    }

    @Override  // com.google.android.gms.ads.formats.NativeContentAd
    public Image getLogo() {
        return this.zzvO;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd
    protected Object zzaH() {
        return this.zzdD();
    }

    // 去混淆评级： 低(20)
    zzck zzd(Object object0) {
        return object0 instanceof IBinder ? zza.zzt(((IBinder)object0)) : null;
    }

    protected zzd zzdD() {
        try {
            return this.zzvN.zzdD();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to retrieve native ad engine.", remoteException0);
            return null;
        }
    }
}

