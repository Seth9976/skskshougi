package com.google.android.gms.appinvite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class AppInviteReferral {
    public static Intent addPlayStoreReferrerToIntent(Intent playStoreReferrerIntent, Intent referralIntent) {
        Bundle bundle0 = AppInviteReferral.zzh(playStoreReferrerIntent);
        if(bundle0 != null && referralIntent != null) {
            referralIntent.putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", bundle0);
        }
        return referralIntent;
    }

    public static Intent addReferralDataToIntent(String invitationId, String deepLink, Intent referralIntent) {
        return referralIntent == null ? null : referralIntent.putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", AppInviteReferral.zza(invitationId, deepLink, false));
    }

    public static String getDeepLink(Intent referralIntent) {
        if(referralIntent != null) {
            Bundle bundle0 = referralIntent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE");
            return bundle0 == null ? null : bundle0.getString("com.google.android.gms.appinvite.DEEP_LINK");
        }
        return null;
    }

    public static String getInvitationId(Intent referralIntent) {
        if(referralIntent != null) {
            Bundle bundle0 = referralIntent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE");
            return bundle0 == null ? null : bundle0.getString("com.google.android.gms.appinvite.INVITATION_ID");
        }
        return null;
    }

    public static boolean hasReferral(Intent referralIntent) {
        return referralIntent != null && referralIntent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE") != null;
    }

    // 去混淆评级： 低(20)
    public static boolean isOpenedFromPlayStore(Intent referralIntent) {
        return AppInviteReferral.hasReferral(referralIntent) && referralIntent.getBundleExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE").getBoolean("com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE", false);
    }

    private static Bundle zza(String s, String s1, boolean z) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("com.google.android.gms.appinvite.INVITATION_ID", s);
        bundle0.putString("com.google.android.gms.appinvite.DEEP_LINK", s1);
        bundle0.putBoolean("com.google.android.gms.appinvite.OPENED_FROM_PLAY_STORE", z);
        return bundle0;
    }

    private static Bundle zzh(Intent intent0) {
        String s1;
        if(intent0 == null || !intent0.getAction().equals("com.android.vending.INSTALL_REFERRER") || intent0.getStringExtra("referrer") == null) {
            return null;
        }
        String s = intent0.getStringExtra("referrer");
        try {
            s1 = URLDecoder.decode(s, "UTF-8");
        }
        catch(UnsupportedEncodingException unused_ex) {
            Log.e("AppInviteReferral", "Error parsing Play Store referrer URL: " + s);
            return null;
        }
        Uri uri0 = Uri.parse(("s://a.b.c?" + s1));
        String s2 = uri0.getQueryParameter("invitation_id");
        String s3 = uri0.getQueryParameter("deep_link_id");
        if(s2 == null && s3 == null) {
            Log.w("AppInviteReferral", "Missing  Referrer query params: " + s1);
            return null;
        }
        return AppInviteReferral.zza(s2, s3, true);
    }
}

