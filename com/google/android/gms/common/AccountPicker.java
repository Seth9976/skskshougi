package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public final class AccountPicker {
    public static Intent newChooseAccountIntent(Account selectedAccount, ArrayList arrayList0, String[] allowableAccountTypes, boolean alwaysPromptForAccount, String descriptionOverrideText, String addAccountAuthTokenType, String[] addAccountRequiredFeatures, Bundle addAccountOptions) {
        return AccountPicker.zza(selectedAccount, arrayList0, allowableAccountTypes, alwaysPromptForAccount, descriptionOverrideText, addAccountAuthTokenType, addAccountRequiredFeatures, addAccountOptions, false);
    }

    public static Intent zza(Account account0, ArrayList arrayList0, String[] arr_s, boolean z, String s, String s1, String[] arr_s1, Bundle bundle0, boolean z1) {
        return AccountPicker.zza(account0, arrayList0, arr_s, z, s, s1, arr_s1, bundle0, z1, 0, 0);
    }

    public static Intent zza(Account account0, ArrayList arrayList0, String[] arr_s, boolean z, String s, String s1, String[] arr_s1, Bundle bundle0, boolean z1, int v, int v1) {
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("allowableAccounts", arrayList0);
        intent0.putExtra("allowableAccountTypes", arr_s);
        intent0.putExtra("addAccountOptions", bundle0);
        intent0.putExtra("selectedAccount", account0);
        intent0.putExtra("alwaysPromptForAccount", z);
        intent0.putExtra("descriptionTextOverride", s);
        intent0.putExtra("authTokenType", s1);
        intent0.putExtra("addAccountRequiredFeatures", arr_s1);
        intent0.putExtra("setGmsCoreAccount", z1);
        intent0.putExtra("overrideTheme", v);
        intent0.putExtra("overrideCustomTheme", v1);
        return intent0;
    }
}

