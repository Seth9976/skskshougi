package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet.zzb;

public class zzqw implements Payments {
    @Override  // com.google.android.gms.wallet.Payments
    public void changeMaskedWallet(GoogleApiClient googleApiClient, String googleTransactionId, String merchantTransactionId, int requestCode) {
        googleApiClient.zza(new zzb(googleApiClient) {
            protected void zza(zzqx zzqx0) {
                zzqx0.zze(googleTransactionId, merchantTransactionId, requestCode);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.wallet.Payments
    public void checkForPreAuthorization(GoogleApiClient googleApiClient, int requestCode) {
        googleApiClient.zza(new zzb(googleApiClient) {
            protected void zza(zzqx zzqx0) {
                zzqx0.zzjB(requestCode);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.wallet.Payments
    public void isNewUser(GoogleApiClient googleApiClient, int requestCode) {
        googleApiClient.zza(new zzb(googleApiClient) {
            protected void zza(zzqx zzqx0) {
                zzqx0.zzjC(requestCode);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.wallet.Payments
    public void loadFullWallet(GoogleApiClient googleApiClient, FullWalletRequest request, int requestCode) {
        googleApiClient.zza(new zzb(googleApiClient) {
            protected void zza(zzqx zzqx0) {
                zzqx0.zza(request, requestCode);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.wallet.Payments
    public void loadMaskedWallet(GoogleApiClient googleApiClient, MaskedWalletRequest request, int requestCode) {
        googleApiClient.zza(new zzb(googleApiClient) {
            protected void zza(zzqx zzqx0) {
                zzqx0.zza(request, requestCode);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.wallet.Payments
    public void notifyTransactionStatus(GoogleApiClient googleApiClient, NotifyTransactionStatusRequest request) {
        googleApiClient.zza(new zzb(googleApiClient) {
            protected void zza(zzqx zzqx0) {
                zzqx0.zza(request);
                this.setResult(Status.zzXP);
            }
        });
    }
}

