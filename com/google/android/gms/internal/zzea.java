package com.google.android.gms.internal;

@zzgd
public final class zzea extends zza {
    private final Object zzqt;
    private com.google.android.gms.internal.zzec.zza zzxO;
    private zzdz zzxP;

    public zzea() {
        this.zzqt = new Object();
    }

    @Override  // com.google.android.gms.internal.zzeh
    public void onAdClicked() {
        synchronized(this.zzqt) {
            if(this.zzxP != null) {
                this.zzxP.zzaX();
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzeh
    public void onAdClosed() {
        synchronized(this.zzqt) {
            if(this.zzxP != null) {
                this.zzxP.zzaY();
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzeh
    public void onAdFailedToLoad(int error) {
        synchronized(this.zzqt) {
            if(this.zzxO != null) {
                this.zzxO.zzs((error == 3 ? 1 : 2));
                this.zzxO = null;
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzeh
    public void onAdLeftApplication() {
        synchronized(this.zzqt) {
            if(this.zzxP != null) {
                this.zzxP.zzaZ();
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzeh
    public void onAdLoaded() {
        synchronized(this.zzqt) {
            if(this.zzxO != null) {
                this.zzxO.zzs(0);
                this.zzxO = null;
                return;
            }
            if(this.zzxP != null) {
                this.zzxP.zzbb();
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzeh
    public void onAdOpened() {
        synchronized(this.zzqt) {
            if(this.zzxP != null) {
                this.zzxP.zzba();
            }
        }
    }

    public void zza(zzdz zzdz0) {
        synchronized(this.zzqt) {
            this.zzxP = zzdz0;
        }
    }

    public void zza(com.google.android.gms.internal.zzec.zza zzec$zza0) {
        synchronized(this.zzqt) {
            this.zzxO = zzec$zza0;
        }
    }
}

