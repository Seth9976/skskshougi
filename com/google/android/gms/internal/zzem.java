package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzgd
public final class zzem implements MediationBannerListener, MediationInterstitialListener {
    private final zzeh zzyg;

    public zzem(zzeh zzeh0) {
        this.zzyg = zzeh0;
    }

    @Override  // com.google.ads.mediation.MediationBannerListener
    public void onClick(MediationBannerAdapter mediationBannerAdapter0) {
        zzb.zzay("Adapter called onClick.");
        if(!zzk.zzcA().zzgw()) {
            zzb.zzaC("onClick must be called on the main UI thread.");
            com.google.android.gms.internal.zzem.1 zzem$10 = new Runnable() {
                @Override
                public void run() {
                    try {
                        zzem.this.zzyg.onAdClicked();
                    }
                    catch(RemoteException remoteException0) {
                        zzb.zzd("Could not call onAdClicked.", remoteException0);
                    }
                }
            };
            zza.zzGF.post(zzem$10);
            return;
        }
        try {
            this.zzyg.onAdClicked();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call onAdClicked.", remoteException0);
        }
    }

    @Override  // com.google.ads.mediation.MediationBannerListener
    public void onDismissScreen(MediationBannerAdapter mediationBannerAdapter0) {
        zzb.zzay("Adapter called onDismissScreen.");
        if(!zzk.zzcA().zzgw()) {
            zzb.zzaC("onDismissScreen must be called on the main UI thread.");
            com.google.android.gms.internal.zzem.4 zzem$40 = new Runnable() {
                @Override
                public void run() {
                    try {
                        zzem.this.zzyg.onAdClosed();
                    }
                    catch(RemoteException remoteException0) {
                        zzb.zzd("Could not call onAdClosed.", remoteException0);
                    }
                }
            };
            zza.zzGF.post(zzem$40);
            return;
        }
        try {
            this.zzyg.onAdClosed();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call onAdClosed.", remoteException0);
        }
    }

    @Override  // com.google.ads.mediation.MediationInterstitialListener
    public void onDismissScreen(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        zzb.zzay("Adapter called onDismissScreen.");
        if(!zzk.zzcA().zzgw()) {
            zzb.zzaC("onDismissScreen must be called on the main UI thread.");
            com.google.android.gms.internal.zzem.9 zzem$90 = new Runnable() {
                @Override
                public void run() {
                    try {
                        zzem.this.zzyg.onAdClosed();
                    }
                    catch(RemoteException remoteException0) {
                        zzb.zzd("Could not call onAdClosed.", remoteException0);
                    }
                }
            };
            zza.zzGF.post(zzem$90);
            return;
        }
        try {
            this.zzyg.onAdClosed();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call onAdClosed.", remoteException0);
        }
    }

    @Override  // com.google.ads.mediation.MediationBannerListener
    public void onFailedToReceiveAd(MediationBannerAdapter mediationBannerAdapter0, ErrorCode errorCode) {
        zzb.zzay(("Adapter called onFailedToReceiveAd with error. " + errorCode));
        if(!zzk.zzcA().zzgw()) {
            zzb.zzaC("onFailedToReceiveAd must be called on the main UI thread.");
            com.google.android.gms.internal.zzem.5 zzem$50 = new Runnable() {
                @Override
                public void run() {
                    try {
                        int v = zzen.zza(errorCode);
                        zzem.this.zzyg.onAdFailedToLoad(v);
                    }
                    catch(RemoteException remoteException0) {
                        zzb.zzd("Could not call onAdFailedToLoad.", remoteException0);
                    }
                }
            };
            zza.zzGF.post(zzem$50);
            return;
        }
        try {
            int v = zzen.zza(errorCode);
            this.zzyg.onAdFailedToLoad(v);
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call onAdFailedToLoad.", remoteException0);
        }
    }

    @Override  // com.google.ads.mediation.MediationInterstitialListener
    public void onFailedToReceiveAd(MediationInterstitialAdapter mediationInterstitialAdapter0, ErrorCode errorCode) {
        zzb.zzay(("Adapter called onFailedToReceiveAd with error " + errorCode + "."));
        if(!zzk.zzcA().zzgw()) {
            zzb.zzaC("onFailedToReceiveAd must be called on the main UI thread.");
            com.google.android.gms.internal.zzem.10 zzem$100 = new Runnable() {
                @Override
                public void run() {
                    try {
                        int v = zzen.zza(errorCode);
                        zzem.this.zzyg.onAdFailedToLoad(v);
                    }
                    catch(RemoteException remoteException0) {
                        zzb.zzd("Could not call onAdFailedToLoad.", remoteException0);
                    }
                }
            };
            zza.zzGF.post(zzem$100);
            return;
        }
        try {
            int v = zzen.zza(errorCode);
            this.zzyg.onAdFailedToLoad(v);
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call onAdFailedToLoad.", remoteException0);
        }
    }

    @Override  // com.google.ads.mediation.MediationBannerListener
    public void onLeaveApplication(MediationBannerAdapter mediationBannerAdapter0) {
        zzb.zzay("Adapter called onLeaveApplication.");
        if(!zzk.zzcA().zzgw()) {
            zzb.zzaC("onLeaveApplication must be called on the main UI thread.");
            com.google.android.gms.internal.zzem.6 zzem$60 = new Runnable() {
                @Override
                public void run() {
                    try {
                        zzem.this.zzyg.onAdLeftApplication();
                    }
                    catch(RemoteException remoteException0) {
                        zzb.zzd("Could not call onAdLeftApplication.", remoteException0);
                    }
                }
            };
            zza.zzGF.post(zzem$60);
            return;
        }
        try {
            this.zzyg.onAdLeftApplication();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call onAdLeftApplication.", remoteException0);
        }
    }

    @Override  // com.google.ads.mediation.MediationInterstitialListener
    public void onLeaveApplication(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        zzb.zzay("Adapter called onLeaveApplication.");
        if(!zzk.zzcA().zzgw()) {
            zzb.zzaC("onLeaveApplication must be called on the main UI thread.");
            com.google.android.gms.internal.zzem.11 zzem$110 = new Runnable() {
                @Override
                public void run() {
                    try {
                        zzem.this.zzyg.onAdLeftApplication();
                    }
                    catch(RemoteException remoteException0) {
                        zzb.zzd("Could not call onAdLeftApplication.", remoteException0);
                    }
                }
            };
            zza.zzGF.post(zzem$110);
            return;
        }
        try {
            this.zzyg.onAdLeftApplication();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call onAdLeftApplication.", remoteException0);
        }
    }

    @Override  // com.google.ads.mediation.MediationBannerListener
    public void onPresentScreen(MediationBannerAdapter mediationBannerAdapter0) {
        zzb.zzay("Adapter called onPresentScreen.");
        if(!zzk.zzcA().zzgw()) {
            zzb.zzaC("onPresentScreen must be called on the main UI thread.");
            com.google.android.gms.internal.zzem.7 zzem$70 = new Runnable() {
                @Override
                public void run() {
                    try {
                        zzem.this.zzyg.onAdOpened();
                    }
                    catch(RemoteException remoteException0) {
                        zzb.zzd("Could not call onAdOpened.", remoteException0);
                    }
                }
            };
            zza.zzGF.post(zzem$70);
            return;
        }
        try {
            this.zzyg.onAdOpened();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call onAdOpened.", remoteException0);
        }
    }

    @Override  // com.google.ads.mediation.MediationInterstitialListener
    public void onPresentScreen(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        zzb.zzay("Adapter called onPresentScreen.");
        if(!zzk.zzcA().zzgw()) {
            zzb.zzaC("onPresentScreen must be called on the main UI thread.");
            com.google.android.gms.internal.zzem.2 zzem$20 = new Runnable() {
                @Override
                public void run() {
                    try {
                        zzem.this.zzyg.onAdOpened();
                    }
                    catch(RemoteException remoteException0) {
                        zzb.zzd("Could not call onAdOpened.", remoteException0);
                    }
                }
            };
            zza.zzGF.post(zzem$20);
            return;
        }
        try {
            this.zzyg.onAdOpened();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call onAdOpened.", remoteException0);
        }
    }

    @Override  // com.google.ads.mediation.MediationBannerListener
    public void onReceivedAd(MediationBannerAdapter mediationBannerAdapter0) {
        zzb.zzay("Adapter called onReceivedAd.");
        if(!zzk.zzcA().zzgw()) {
            zzb.zzaC("onReceivedAd must be called on the main UI thread.");
            com.google.android.gms.internal.zzem.8 zzem$80 = new Runnable() {
                @Override
                public void run() {
                    try {
                        zzem.this.zzyg.onAdLoaded();
                    }
                    catch(RemoteException remoteException0) {
                        zzb.zzd("Could not call onAdLoaded.", remoteException0);
                    }
                }
            };
            zza.zzGF.post(zzem$80);
            return;
        }
        try {
            this.zzyg.onAdLoaded();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call onAdLoaded.", remoteException0);
        }
    }

    @Override  // com.google.ads.mediation.MediationInterstitialListener
    public void onReceivedAd(MediationInterstitialAdapter mediationInterstitialAdapter0) {
        zzb.zzay("Adapter called onReceivedAd.");
        if(!zzk.zzcA().zzgw()) {
            zzb.zzaC("onReceivedAd must be called on the main UI thread.");
            com.google.android.gms.internal.zzem.3 zzem$30 = new Runnable() {
                @Override
                public void run() {
                    try {
                        zzem.this.zzyg.onAdLoaded();
                    }
                    catch(RemoteException remoteException0) {
                        zzb.zzd("Could not call onAdLoaded.", remoteException0);
                    }
                }
            };
            zza.zzGF.post(zzem$30);
            return;
        }
        try {
            this.zzyg.onAdLoaded();
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call onAdLoaded.", remoteException0);
        }
    }
}

