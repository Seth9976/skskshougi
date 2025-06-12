package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import java.util.ArrayList;
import java.util.List;

@zzgd
public class zzcp extends NativeAppInstallAd {
    private final zzco zzvK;
    private final List zzvL;
    private final zzcl zzvM;

    public zzcp(zzco zzco0) {
        zzcl zzcl1;
        this.zzvL = new ArrayList();
        this.zzvK = zzco0;
        try {
            for(Object object0: this.zzvK.getImages()) {
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
            zzck zzck1 = this.zzvK.zzdy();
            if(zzck1 == null) {
                zzcl1 = null;
                this.zzvM = zzcl1;
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
        this.zzvM = zzcl1;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAppInstallAd
    public CharSequence getBody() {
        try {
            return this.zzvK.getBody();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get body.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeAppInstallAd
    public CharSequence getCallToAction() {
        try {
            return this.zzvK.zzdz();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get call to action.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeAppInstallAd
    public CharSequence getHeadline() {
        try {
            return this.zzvK.zzdx();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get headline.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeAppInstallAd
    public Image getIcon() {
        return this.zzvM;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAppInstallAd
    public List getImages() {
        return this.zzvL;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAppInstallAd
    public CharSequence getPrice() {
        try {
            return this.zzvK.zzdC();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get price.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeAppInstallAd
    public Double getStarRating() {
        try {
            double f = this.zzvK.zzdA();
            return f == -1.0 ? null : f;
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get star rating.", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeAppInstallAd
    public CharSequence getStore() {
        try {
            return this.zzvK.zzdB();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to get store", remoteException0);
            return null;
        }
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
            return this.zzvK.zzdD();
        }
        catch(RemoteException remoteException0) {
            zzb.zzb("Failed to retrieve native ad engine.", remoteException0);
            return null;
        }
    }
}

