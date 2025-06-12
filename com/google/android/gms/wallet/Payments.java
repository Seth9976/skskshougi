package com.google.android.gms.wallet;

import com.google.android.gms.common.api.GoogleApiClient;

public interface Payments {
    void changeMaskedWallet(GoogleApiClient arg1, String arg2, String arg3, int arg4);

    void checkForPreAuthorization(GoogleApiClient arg1, int arg2);

    void isNewUser(GoogleApiClient arg1, int arg2);

    void loadFullWallet(GoogleApiClient arg1, FullWalletRequest arg2, int arg3);

    void loadMaskedWallet(GoogleApiClient arg1, MaskedWalletRequest arg2, int arg3);

    void notifyTransactionStatus(GoogleApiClient arg1, NotifyTransactionStatusRequest arg2);
}

