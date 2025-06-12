package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqx;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zzra;
import com.google.android.gms.wallet.wobs.zzj;
import java.util.Locale;

public final class Wallet {
    public static final class WalletOptions implements HasOptions {
        public static final class Builder {
            private int mTheme;
            private int zzaRH;

            public Builder() {
                this.zzaRH = 3;
                this.mTheme = 0;
            }

            public WalletOptions build() {
                return new WalletOptions(this, null);
            }

            public Builder setEnvironment(int environment) {
                if(environment != 0 && (environment != 1 && environment != 2) && environment != 3) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", environment));
                }
                this.zzaRH = environment;
                return this;
            }

            public Builder setTheme(int theme) {
                if(theme != 0 && theme != 1) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", theme));
                }
                this.mTheme = theme;
                return this;
            }
        }

        public final int environment;
        public final int theme;

        private WalletOptions() {
            this(new Builder());
        }

        WalletOptions(com.google.android.gms.wallet.Wallet.1 x0) {
        }

        private WalletOptions(Builder builder) {
            this.environment = builder.zzaRH;
            this.theme = builder.mTheme;
        }

        WalletOptions(Builder x0, com.google.android.gms.wallet.Wallet.1 x1) {
            this(x0);
        }
    }

    public static abstract class zza extends com.google.android.gms.common.api.zza.zza {
        public zza(GoogleApiClient googleApiClient0) {
            super(Wallet.zzNX, googleApiClient0);
        }
    }

    public static abstract class zzb extends zza {
        public zzb(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return x0;
        }

        protected Status zzb(Status status0) [...] // Inlined contents
    }

    public static final Api API;
    public static final Payments Payments;
    private static final ClientKey zzNX;
    private static final com.google.android.gms.common.api.Api.zza zzNY;
    public static final zzj zzaRF;
    public static final com.google.android.gms.wallet.firstparty.zza zzaRG;

    static {
        Wallet.zzNX = new ClientKey();
        Wallet.zzNY = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzqx zza(Context context0, Looper looper0, zze zze0, WalletOptions wallet$WalletOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                zzu.zzb(context0 instanceof Activity, "An Activity must be used for Wallet APIs");
                if(wallet$WalletOptions0 == null) {
                    wallet$WalletOptions0 = new WalletOptions(null);
                }
                String s = zze0.getAccountName();
                return new zzqx(((Activity)context0), looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, wallet$WalletOptions0.environment, s, wallet$WalletOptions0.theme);
            }
        };
        Wallet.API = new Api("Wallet.API", Wallet.zzNY, Wallet.zzNX, new Scope[0]);
        Wallet.Payments = new zzqw();
        Wallet.zzaRF = new zzra();
        Wallet.zzaRG = new zzqz();
    }

    @Deprecated
    public static void changeMaskedWallet(GoogleApiClient googleApiClient, String googleTransactionId, String merchantTransactionId, int requestCode) {
        Wallet.Payments.changeMaskedWallet(googleApiClient, googleTransactionId, merchantTransactionId, requestCode);
    }

    @Deprecated
    public static void checkForPreAuthorization(GoogleApiClient googleApiClient, int requestCode) {
        Wallet.Payments.checkForPreAuthorization(googleApiClient, requestCode);
    }

    @Deprecated
    public static void loadFullWallet(GoogleApiClient googleApiClient, FullWalletRequest request, int requestCode) {
        Wallet.Payments.loadFullWallet(googleApiClient, request, requestCode);
    }

    @Deprecated
    public static void loadMaskedWallet(GoogleApiClient googleApiClient, MaskedWalletRequest request, int requestCode) {
        Wallet.Payments.loadMaskedWallet(googleApiClient, request, requestCode);
    }

    @Deprecated
    public static void notifyTransactionStatus(GoogleApiClient googleApiClient, NotifyTransactionStatusRequest request) {
        Wallet.Payments.notifyTransactionStatus(googleApiClient, request);
    }
}

