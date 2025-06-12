package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;

public class zzm {
    private static final Uri zzaaV;
    private static final Uri zzaaW;

    static {
        zzm.zzaaV = Uri.parse("http://plus.google.com/");
        zzm.zzaaW = zzm.zzaaV.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent zzce(String s) {
        Uri uri0 = Uri.fromParts("package", s, null);
        Intent intent0 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent0.setData(uri0);
        return intent0;
    }

    private static Uri zzcf(String s) {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", s).build();
    }

    public static Intent zzcg(String s) {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setData(zzm.zzcf(s));
        intent0.setPackage("com.android.vending");
        intent0.addFlags(0x80000);
        return intent0;
    }

    public static Intent zznX() {
        Intent intent0 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent0.setPackage("com.google.android.wearable.app");
        return intent0;
    }
}

