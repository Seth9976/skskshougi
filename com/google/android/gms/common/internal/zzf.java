package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.R.string;
import com.google.android.gms.internal.zzle;

public final class zzf {
    public static String zzb(Context context0, int v, String s) {
        Resources resources0 = context0.getResources();
        switch(v) {
            case 1: {
                return zzle.zzb(resources0) ? resources0.getString(string.common_google_play_services_install_text_tablet, new Object[]{s}) : resources0.getString(string.common_google_play_services_install_text_phone, new Object[]{s});
            }
            case 2: {
                return resources0.getString(string.common_google_play_services_update_text, new Object[]{s});
            }
            case 3: {
                return resources0.getString(string.common_google_play_services_enable_text, new Object[]{s});
            }
            case 5: {
                return resources0.getString(string.common_google_play_services_invalid_account_text);
            }
            case 7: {
                return resources0.getString(string.common_google_play_services_network_error_text);
            }
            case 9: {
                return resources0.getString(string.common_google_play_services_unsupported_text, new Object[]{s});
            }
            case 16: {
                return resources0.getString(string.common_google_play_services_api_unavailable_text, new Object[]{s});
            }
            case 17: {
                return resources0.getString(string.common_google_play_services_sign_in_failed_text);
            }
            case 18: {
                return resources0.getString(string.common_google_play_services_updating_text, new Object[]{s});
            }
            case 42: {
                return resources0.getString(string.common_android_wear_update_text, new Object[]{s});
            }
            default: {
                return resources0.getString(string.common_google_play_services_unknown_issue);
            }
        }
    }

    public static String zzc(Context context0, int v, String s) {
        Resources resources0 = context0.getResources();
        switch(v) {
            case 1: {
                return zzle.zzb(resources0) ? resources0.getString(string.common_google_play_services_install_text_tablet, new Object[]{s}) : resources0.getString(string.common_google_play_services_install_text_phone, new Object[]{s});
            }
            case 2: {
                return resources0.getString(string.common_google_play_services_update_text, new Object[]{s});
            }
            case 3: {
                return resources0.getString(string.common_google_play_services_enable_text, new Object[]{s});
            }
            case 5: {
                return resources0.getString(string.common_google_play_services_invalid_account_text);
            }
            case 7: {
                return resources0.getString(string.common_google_play_services_network_error_text);
            }
            case 9: {
                return resources0.getString(string.common_google_play_services_unsupported_text, new Object[]{s});
            }
            case 16: {
                return resources0.getString(string.common_google_play_services_api_unavailable_text, new Object[]{s});
            }
            case 17: {
                return resources0.getString(string.common_google_play_services_sign_in_failed_text);
            }
            case 18: {
                return resources0.getString(string.common_google_play_services_updating_text, new Object[]{s});
            }
            case 42: {
                return resources0.getString(string.common_android_wear_notification_needs_update_text, new Object[]{s});
            }
            default: {
                return resources0.getString(string.common_google_play_services_unknown_issue);
            }
        }
    }

    public static final String zzg(Context context0, int v) {
        Resources resources0 = context0.getResources();
        switch(v) {
            case 1: {
                return resources0.getString(string.common_google_play_services_install_title);
            }
            case 2: {
                return resources0.getString(string.common_google_play_services_update_title);
            }
            case 3: {
                return resources0.getString(string.common_google_play_services_enable_title);
            }
            case 5: {
                Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
                return resources0.getString(string.common_google_play_services_invalid_account_title);
            }
            case 4: 
            case 6: {
                break;
            }
            case 7: {
                Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
                return resources0.getString(string.common_google_play_services_network_error_title);
            }
            case 8: {
                Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
                return null;
            }
            case 9: {
                Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
                return resources0.getString(string.common_google_play_services_unsupported_title);
            }
            case 10: {
                Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
                return null;
            }
            case 11: {
                Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
                return null;
            }
            case 16: {
                Log.e("GooglePlayServicesUtil", "One of the API components you attempted to connect to is not available.");
                return null;
            }
            case 17: {
                Log.e("GooglePlayServicesUtil", "The specified account could not be signed in.");
                return resources0.getString(string.common_google_play_services_sign_in_failed_title);
            }
            case 18: {
                return resources0.getString(string.common_google_play_services_updating_title);
            }
            case 42: {
                return resources0.getString(string.common_android_wear_update_title);
            }
            default: {
                Log.e("GooglePlayServicesUtil", "Unexpected error code " + v);
                break;
            }
        }
        return null;
    }

    public static String zzh(Context context0, int v) {
        Resources resources0 = context0.getResources();
        switch(v) {
            case 1: {
                return resources0.getString(string.common_google_play_services_install_button);
            }
            case 3: {
                return resources0.getString(string.common_google_play_services_enable_button);
            }
            case 2: 
            case 42: {
                return resources0.getString(string.common_google_play_services_update_button);
            }
            default: {
                return resources0.getString(0x104000A);
            }
        }
    }

    public static final String zzi(Context context0, int v) {
        Resources resources0 = context0.getResources();
        switch(v) {
            case 1: {
                return resources0.getString(string.common_google_play_services_install_title);
            }
            case 2: {
                return resources0.getString(string.common_google_play_services_update_title);
            }
            case 3: {
                return resources0.getString(string.common_google_play_services_enable_title);
            }
            case 5: {
                Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
                return resources0.getString(string.common_google_play_services_invalid_account_title);
            }
            case 4: 
            case 6: {
                break;
            }
            case 7: {
                Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
                return resources0.getString(string.common_google_play_services_network_error_title);
            }
            case 8: {
                Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
                return null;
            }
            case 9: {
                Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
                return resources0.getString(string.common_google_play_services_unsupported_title);
            }
            case 10: {
                Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
                return null;
            }
            case 11: {
                Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
                return null;
            }
            case 16: {
                Log.e("GooglePlayServicesUtil", "One of the API components you attempted to connect to is not available.");
                return null;
            }
            case 17: {
                Log.e("GooglePlayServicesUtil", "The specified account could not be signed in.");
                return resources0.getString(string.common_google_play_services_sign_in_failed_title);
            }
            case 18: {
                return resources0.getString(string.common_google_play_services_updating_title);
            }
            case 42: {
                return resources0.getString(string.common_android_wear_update_title);
            }
            default: {
                Log.e("GooglePlayServicesUtil", "Unexpected error code " + v);
                break;
            }
        }
        return null;
    }
}

