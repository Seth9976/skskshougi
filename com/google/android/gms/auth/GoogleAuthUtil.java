package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.zza;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public final class GoogleAuthUtil {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_ANDROID_PACKAGE_NAME = null;
    public static final String KEY_CALLER_UID = null;
    public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";
    @Deprecated
    public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    private static final ComponentName zzOB;
    private static final ComponentName zzOC;

    static {
        GoogleAuthUtil.KEY_CALLER_UID = "callerUid";
        GoogleAuthUtil.KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
        GoogleAuthUtil.zzOB = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        GoogleAuthUtil.zzOC = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
    }

    public static void clearToken(Context context, String token) throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException {
        Context context1 = context.getApplicationContext();
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        GoogleAuthUtil.zzY(context1);
        Bundle bundle0 = new Bundle();
        String s1 = context.getApplicationInfo().packageName;
        bundle0.putString("clientPackageName", s1);
        if(!bundle0.containsKey("androidPackageName")) {
            bundle0.putString("androidPackageName", s1);
        }
        zza zza0 = new zza();
        zzk zzk0 = zzk.zzah(context1);
        if(!zzk0.zza(GoogleAuthUtil.zzOB, zza0, "GoogleAuthUtil")) {
            throw new IOException("Could not bind to service with the given context.");
        }
        try {
            Bundle bundle1 = com.google.android.gms.internal.zzau.zza.zza(zza0.zzmh()).zza(token, bundle0);
            String s2 = bundle1.getString("Error");
            if(!bundle1.getBoolean("booleanResult")) {
                throw new GoogleAuthException(s2);
            }
        }
        catch(RemoteException remoteException0) {
            Log.i("GoogleAuthUtil", "GMS remote exception ", remoteException0);
            throw new IOException("remote exception");
        }
        catch(InterruptedException unused_ex) {
            throw new GoogleAuthException("Interrupted");
        }
        finally {
            zzk0.zzb(GoogleAuthUtil.zzOB, zza0, "GoogleAuthUtil");
        }
    }

    public static List getAccountChangeEvents(Context ctx, int eventIndex, String accountName) throws GoogleAuthException, IOException {
        zzu.zzh(accountName, "accountName must be provided");
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        Context context1 = ctx.getApplicationContext();
        GoogleAuthUtil.zzY(context1);
        zza zza0 = new zza();
        zzk zzk0 = zzk.zzah(context1);
        if(zzk0.zza(GoogleAuthUtil.zzOB, zza0, "GoogleAuthUtil")) {
            try {
                return com.google.android.gms.internal.zzau.zza.zza(zza0.zzmh()).zza(new AccountChangeEventsRequest().setAccountName(accountName).setEventIndex(eventIndex)).getEvents();
            }
            catch(RemoteException remoteException0) {
                Log.i("GoogleAuthUtil", "GMS remote exception ", remoteException0);
                throw new IOException("remote exception");
            }
            catch(InterruptedException unused_ex) {
                throw new GoogleAuthException("Interrupted");
            }
            finally {
                zzk0.zzb(GoogleAuthUtil.zzOB, zza0, "GoogleAuthUtil");
            }
        }
        throw new IOException("Could not bind to service with the given context.");
    }

    public static String getAccountId(Context ctx, String accountName) throws GoogleAuthException, IOException {
        zzu.zzh(accountName, "accountName must be provided");
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        GoogleAuthUtil.zzY(ctx.getApplicationContext());
        return GoogleAuthUtil.getToken(ctx, accountName, "^^_account_id_^^", new Bundle());
    }

    public static String getToken(Context context, Account account, String scope) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return GoogleAuthUtil.getToken(context, account, scope, new Bundle());
    }

    public static String getToken(Context context, Account account, String scope, Bundle extras) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return GoogleAuthUtil.zza(context, account, scope, extras).getString("authtoken");
    }

    @Deprecated
    public static String getToken(Context context, String accountName, String scope) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return GoogleAuthUtil.getToken(context, new Account(accountName, "com.google"), scope);
    }

    @Deprecated
    public static String getToken(Context context, String accountName, String scope, Bundle extras) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return GoogleAuthUtil.getToken(context, new Account(accountName, "com.google"), scope, extras);
    }

    public static String getTokenWithNotification(Context context, Account account, String scope, Bundle extras) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if(extras == null) {
            extras = new Bundle();
        }
        extras.putBoolean("handle_notification", true);
        return GoogleAuthUtil.zzb(context, account, scope, extras);
    }

    public static String getTokenWithNotification(Context context, Account account, String scope, Bundle extras, Intent callback) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        GoogleAuthUtil.zzi(callback);
        if(extras == null) {
            extras = new Bundle();
        }
        extras.putParcelable("callback_intent", callback);
        extras.putBoolean("handle_notification", true);
        return GoogleAuthUtil.zzb(context, account, scope, extras);
    }

    public static String getTokenWithNotification(Context context, Account account, String scope, Bundle extras, String authority, Bundle syncBundle) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if(TextUtils.isEmpty(authority)) {
            throw new IllegalArgumentException("Authority cannot be empty or null.");
        }
        if(extras == null) {
            extras = new Bundle();
        }
        if(syncBundle == null) {
            syncBundle = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle(syncBundle);
        extras.putString("authority", authority);
        extras.putBundle("sync_extras", syncBundle);
        extras.putBoolean("handle_notification", true);
        return GoogleAuthUtil.zzb(context, account, scope, extras);
    }

    @Deprecated
    public static String getTokenWithNotification(Context context, String accountName, String scope, Bundle extras) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return GoogleAuthUtil.getTokenWithNotification(context, new Account(accountName, "com.google"), scope, extras);
    }

    @Deprecated
    public static String getTokenWithNotification(Context context, String accountName, String scope, Bundle extras, Intent callback) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return GoogleAuthUtil.getTokenWithNotification(context, new Account(accountName, "com.google"), scope, extras, callback);
    }

    @Deprecated
    public static String getTokenWithNotification(Context context, String accountName, String scope, Bundle extras, String authority, Bundle syncBundle) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return GoogleAuthUtil.getTokenWithNotification(context, new Account(accountName, "com.google"), scope, extras, authority, syncBundle);
    }

    @Deprecated
    public static void invalidateToken(Context context, String token) {
        AccountManager.get(context).invalidateAuthToken("com.google", token);
    }

    private static void zzY(Context context0) throws GoogleAuthException {
        try {
            GooglePlayServicesUtil.zzY(context0);
        }
        catch(GooglePlayServicesRepairableException googlePlayServicesRepairableException0) {
            throw new GooglePlayServicesAvailabilityException(googlePlayServicesRepairableException0.getConnectionStatusCode(), googlePlayServicesRepairableException0.getMessage(), googlePlayServicesRepairableException0.getIntent());
        }
        catch(GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException0) {
            throw new GoogleAuthException(googlePlayServicesNotAvailableException0.getMessage());
        }
    }

    public static Bundle zza(Context context0, Account account0, String s, Bundle bundle0) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        Bundle bundle2;
        Context context1 = context0.getApplicationContext();
        zzu.zzbZ("Calling this from your main thread can lead to deadlock");
        GoogleAuthUtil.zzY(context1);
        Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
        String s1 = context0.getApplicationInfo().packageName;
        bundle1.putString("clientPackageName", s1);
        if(TextUtils.isEmpty(bundle1.getString("androidPackageName"))) {
            bundle1.putString("androidPackageName", s1);
        }
        zza zza0 = new zza();
        zzk zzk0 = zzk.zzah(context1);
        if(zzk0.zza(GoogleAuthUtil.zzOB, zza0, "GoogleAuthUtil")) {
            try {
                bundle2 = com.google.android.gms.internal.zzau.zza.zza(zza0.zzmh()).zza(account0, s, bundle1);
                if(bundle2 == null) {
                    Log.w("GoogleAuthUtil", "Binder call returned null.");
                    throw new GoogleAuthException("ServiceUnavailable");
                }
                if(TextUtils.isEmpty(bundle2.getString("authtoken"))) {
                    String s2 = bundle2.getString("Error");
                    Intent intent0 = (Intent)bundle2.getParcelable("userRecoveryIntent");
                    if(GoogleAuthUtil.zzbv(s2)) {
                        throw new UserRecoverableAuthException(s2, intent0);
                    }
                    if(!GoogleAuthUtil.zzbu(s2)) {
                        throw new GoogleAuthException(s2);
                    }
                    throw new IOException(s2);
                }
                return bundle2;
            }
            catch(RemoteException remoteException0) {
                Log.i("GoogleAuthUtil", "GMS remote exception ", remoteException0);
                throw new IOException("remote exception");
            }
            catch(InterruptedException unused_ex) {
                throw new GoogleAuthException("Interrupted");
            }
            finally {
                zzk0.zzb(GoogleAuthUtil.zzOB, zza0, "GoogleAuthUtil");
            }
        }
        throw new IOException("Could not bind to service with the given context.");
    }

    private static String zzb(Context context0, Account account0, String s, Bundle bundle0) throws IOException, GoogleAuthException {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        try {
            String s1 = GoogleAuthUtil.getToken(context0, account0, s, bundle0);
            GooglePlayServicesUtil.zzac(context0);
            return s1;
        }
        catch(GooglePlayServicesAvailabilityException googlePlayServicesAvailabilityException0) {
            GooglePlayServicesUtil.showErrorNotification(googlePlayServicesAvailabilityException0.getConnectionStatusCode(), context0);
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
        catch(UserRecoverableAuthException unused_ex) {
            GooglePlayServicesUtil.zzac(context0);
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
    }

    // 去混淆评级： 低(30)
    private static boolean zzbu(String s) {
        return "NetworkError".equals(s) || "ServiceUnavailable".equals(s) || "Timeout".equals(s);
    }

    // 去混淆评级： 高(280)
    private static boolean zzbv(String s) {
        return "BadAuthentication".equals(s) || "CaptchaRequired".equals(s) || "DeviceManagementRequiredOrSyncDisabled".equals(s) || "NeedPermission".equals(s) || "NeedsBrowser".equals(s) || "UserCancel".equals(s) || "AppDownloadRequired".equals(s) || "DeviceManagementSyncDisabled".equals(s) || "DeviceManagementAdminBlocked".equals(s) || "DeviceManagementAdminPendingApproval".equals(s) || "DeviceManagementStaleSyncRequired".equals(s) || "DeviceManagementDeactivated".equals(s) || "DeviceManagementRequired".equals(s) || "ThirdPartyDeviceManagementRequired".equals(s);
    }

    private static void zzi(Intent intent0) {
        if(intent0 == null) {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
        String s = intent0.toUri(1);
        try {
            Intent.parseUri(s, 1);
        }
        catch(URISyntaxException unused_ex) {
            throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }
}

