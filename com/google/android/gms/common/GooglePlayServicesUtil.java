package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.string;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzm;
import com.google.android.gms.internal.zzkz;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GooglePlayServicesUtil {
    static class zza extends Handler {
        private final Context zzqw;

        zza(Context context0) {
            super((Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper()));
            this.zzqw = context0.getApplicationContext();
        }

        @Override  // android.os.Handler
        public void handleMessage(Message msg) {
            if(msg.what != 1) {
                Log.w("GooglePlayServicesUtil", "Don\'t know how to handle this message: " + msg.what);
                return;
            }
            int v = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.zzqw);
            if(GooglePlayServicesUtil.isUserRecoverableError(v)) {
                GooglePlayServicesUtil.zza(v, this.zzqw);
            }
        }
    }

    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static boolean zzVS;
    public static boolean zzVT;
    private static int zzVU;
    private static String zzVV;
    private static Integer zzVW;
    static final AtomicBoolean zzVX;
    private static final Object zzoW;

    static {
        GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE = 7571000;
        GooglePlayServicesUtil.zzVS = false;
        GooglePlayServicesUtil.zzVT = false;
        GooglePlayServicesUtil.zzVU = -1;
        GooglePlayServicesUtil.zzoW = new Object();
        GooglePlayServicesUtil.zzVV = null;
        GooglePlayServicesUtil.zzVW = null;
        GooglePlayServicesUtil.zzVX = new AtomicBoolean();
    }

    @Deprecated
    public static Dialog getErrorDialog(int errorCode, Activity activity, int requestCode) {
        return GooglePlayServicesUtil.getErrorDialog(errorCode, activity, requestCode, null);
    }

    @Deprecated
    public static Dialog getErrorDialog(int errorCode, Activity activity, int requestCode, DialogInterface.OnCancelListener cancelListener) {
        return GooglePlayServicesUtil.zza(errorCode, activity, null, requestCode, cancelListener);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int errorCode, Context context, int requestCode) {
        Intent intent0 = GooglePlayServicesUtil.zzaT(errorCode);
        return intent0 == null ? null : PendingIntent.getActivity(context, requestCode, intent0, 0x10000000);
    }

    @Deprecated
    public static String getErrorString(int errorCode) {
        return ConnectionResult.getStatusString(errorCode);
    }

    @Deprecated
    public static String getOpenSourceSoftwareLicenseInfo(Context context) {
        String s;
        Uri uri0 = new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath("raw").appendPath("oss_notice").build();
        try {
            InputStream inputStream0 = context.getContentResolver().openInputStream(uri0);
            try {
                s = new Scanner(inputStream0).useDelimiter("\\A").next();
            }
            catch(NoSuchElementException unused_ex) {
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                return null;
            }
            catch(Throwable throwable0) {
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                throw throwable0;
            }
            if(inputStream0 != null) {
                inputStream0.close();
            }
            return s;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        PackageInfo packageInfo0;
        PackageManager packageManager0 = context.getPackageManager();
        try {
            context.getResources().getString(string.common_google_play_services_unknown_issue);
        }
        catch(Throwable unused_ex) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        GooglePlayServicesUtil.zzaa(context);
        try {
            packageInfo0 = packageManager0.getPackageInfo("com.google.android.gms", 0x40);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
        zzd zzd0 = zzd.zzmn();
        if(!zzkz.zzbP(packageInfo0.versionCode) && !zzkz.zzai(context)) {
            try {
                com.google.android.gms.common.zzc.zza zzc$zza0 = zzd0.zza(packageManager0.getPackageInfo("com.android.vending", 0x40), zzbk.zzVR);
                if(zzc$zza0 == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                    return 9;
                }
                if(zzd0.zza(packageInfo0, new com.google.android.gms.common.zzc.zza[]{zzc$zza0}) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                if(!GooglePlayServicesUtil.zzh(context, "com.android.vending")) {
                    Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
                    return 9;
                }
                Log.w("GooglePlayServicesUtil", "Google Play Store is updating.");
                if(zzd0.zza(packageInfo0, zzbk.zzVR) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            }
        }
        else if(zzd0.zza(packageInfo0, zzbk.zzVR) == null) {
            Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
            return 9;
        }
        if(packageInfo0.versionCode / 1000 < GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE / 1000) {
            Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE + " but found " + packageInfo0.versionCode);
            return 2;
        }
        ApplicationInfo applicationInfo0 = packageInfo0.applicationInfo;
        if(applicationInfo0 == null) {
            try {
                return packageManager0.getApplicationInfo("com.google.android.gms", 0).enabled ? 0 : 3;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
                packageManager$NameNotFoundException0.printStackTrace();
                return 1;
            }
        }
        return applicationInfo0.enabled ? 0 : 3;
    }

    @Deprecated
    public static boolean isUserRecoverableError(int errorCode) {
        return errorCode == 1 || errorCode == 2 || errorCode == 3 || errorCode == 9;
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int errorCode, Activity activity, int requestCode) {
        return GooglePlayServicesUtil.showErrorDialogFragment(errorCode, activity, requestCode, null);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int errorCode, Activity activity, int requestCode, DialogInterface.OnCancelListener cancelListener) {
        return GooglePlayServicesUtil.showErrorDialogFragment(errorCode, activity, null, requestCode, cancelListener);
    }

    public static boolean showErrorDialogFragment(int errorCode, Activity activity, Fragment fragment, int requestCode, DialogInterface.OnCancelListener cancelListener) {
        Dialog dialog0 = GooglePlayServicesUtil.zza(errorCode, activity, fragment, requestCode, cancelListener);
        if(dialog0 == null) {
            return false;
        }
        if(activity instanceof FragmentActivity) {
            FragmentManager fragmentManager0 = ((FragmentActivity)activity).getSupportFragmentManager();
            SupportErrorDialogFragment.newInstance(dialog0, cancelListener).show(fragmentManager0, "GooglePlayServicesErrorDialog");
            return true;
        }
        android.app.FragmentManager fragmentManager1 = activity.getFragmentManager();
        ErrorDialogFragment.newInstance(dialog0, cancelListener).show(fragmentManager1, "GooglePlayServicesErrorDialog");
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int errorCode, Context context) {
        if(zzkz.zzai(context) && errorCode == 2) {
            errorCode = 42;
        }
        if(GooglePlayServicesUtil.zze(context, errorCode) || GooglePlayServicesUtil.zzf(context, errorCode)) {
            GooglePlayServicesUtil.zzab(context);
            return;
        }
        GooglePlayServicesUtil.zza(errorCode, context);
    }

    @Deprecated
    public static void zzY(Context context0) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int v = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context0);
        if(v != 0) {
            Intent intent0 = GooglePlayServicesUtil.zzaT(v);
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + v);
            if(intent0 != null) {
                throw new GooglePlayServicesRepairableException(v, "Google Play Services not available", intent0);
            }
            throw new GooglePlayServicesNotAvailableException(v);
        }
        return;
    }

    private static Dialog zza(int v, Activity activity0, Fragment fragment0, int v1, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        Dialog dialog0 = null;
        if(v == 0) {
            return null;
        }
        if(zzkz.zzai(activity0) && v == 2) {
            v = 42;
        }
        TypedValue typedValue0 = new TypedValue();
        activity0.getTheme().resolveAttribute(0x1010309, typedValue0, true);
        if("Theme.Dialog.Alert".equals(activity0.getResources().getResourceEntryName(typedValue0.resourceId))) {
            dialog0 = new AlertDialog.Builder(activity0, 5);
        }
        if(dialog0 == null) {
            dialog0 = new AlertDialog.Builder(activity0);
        }
        ((AlertDialog.Builder)dialog0).setMessage(zzf.zzb(activity0, v, GooglePlayServicesUtil.zzad(activity0)));
        if(dialogInterface$OnCancelListener0 != null) {
            ((AlertDialog.Builder)dialog0).setOnCancelListener(dialogInterface$OnCancelListener0);
        }
        Intent intent0 = GooglePlayServicesUtil.zzaT(v);
        zzg zzg0 = fragment0 == null ? new zzg(activity0, intent0, v1) : new zzg(fragment0, intent0, v1);
        String s = zzf.zzh(activity0, v);
        if(s != null) {
            ((AlertDialog.Builder)dialog0).setPositiveButton(s, zzg0);
        }
        String s1 = zzf.zzg(activity0, v);
        if(s1 != null) {
            ((AlertDialog.Builder)dialog0).setTitle(s1);
        }
        return ((AlertDialog.Builder)dialog0).create();
    }

    private static void zza(int v, Context context0) {
        GooglePlayServicesUtil.zza(v, context0, null);
    }

    private static void zza(int v, Context context0, String s) {
        int v1;
        Notification notification0;
        Resources resources0 = context0.getResources();
        String s1 = GooglePlayServicesUtil.zzad(context0);
        String s2 = zzf.zzi(context0, v);
        if(s2 == null) {
            s2 = resources0.getString(string.common_google_play_services_notification_ticker);
        }
        String s3 = zzf.zzc(context0, v, s1);
        PendingIntent pendingIntent0 = GooglePlayServicesUtil.getErrorPendingIntent(v, context0, 0);
        if(zzkz.zzai(context0)) {
            Notification.Builder notification$Builder0 = new Notification.Builder(context0).setSmallIcon(drawable.common_ic_googleplayservices).setPriority(2).setAutoCancel(true).setStyle(new Notification.BigTextStyle().bigText(s2 + " " + s3));
            String s4 = resources0.getString(string.common_open_on_phone);
            notification0 = notification$Builder0.addAction(drawable.common_full_open_on_phone, s4, pendingIntent0).build();
        }
        else {
            String s5 = resources0.getString(string.common_google_play_services_notification_ticker);
            Notification.Builder notification$Builder1 = new Notification.Builder(context0).setSmallIcon(0x108008A).setContentTitle(s2).setContentText(s3).setContentIntent(pendingIntent0).setTicker(s5).setAutoCancel(true);
            notification$Builder1.setLocalOnly(true);
            notification$Builder1.setStyle(new Notification.BigTextStyle().bigText(s3));
            Notification notification1 = notification$Builder1.build();
            if(Build.VERSION.SDK_INT == 19) {
                notification1.extras.putBoolean("android.support.localOnly", true);
            }
            notification0 = notification1;
        }
        if(GooglePlayServicesUtil.zzaU(v)) {
            GooglePlayServicesUtil.zzVX.set(false);
            v1 = 10436;
        }
        else {
            v1 = 0x9B6D;
        }
        NotificationManager notificationManager0 = (NotificationManager)context0.getSystemService("notification");
        if(s != null) {
            notificationManager0.notify(s, v1, notification0);
            return;
        }
        notificationManager0.notify(v1, notification0);
    }

    public static boolean zza(Context context0, int v, String s) {
        AppOpsManager appOpsManager0 = (AppOpsManager)context0.getSystemService("appops");
        try {
            appOpsManager0.checkPackage(v, s);
            return true;
        }
        catch(SecurityException unused_ex) {
            return false;
        }
    }

    @Deprecated
    public static Intent zzaT(int v) {
        switch(v) {
            case 1: 
            case 2: {
                return zzm.zzcg("com.google.android.gms");
            }
            case 3: {
                return zzm.zzce("com.google.android.gms");
            }
            case 42: {
                return zzm.zznX();
            }
            default: {
                return null;
            }
        }
    }

    private static boolean zzaU(int v) {
        return v == 1 || v == 2 || v == 3 || v == 18 || v == 42;
    }

    private static void zzaa(Context context0) {
        Integer integer0;
        synchronized(GooglePlayServicesUtil.zzoW) {
            if(GooglePlayServicesUtil.zzVV == null) {
                try {
                    GooglePlayServicesUtil.zzVV = "org.dyndns.vivi.SkskShogi";
                    Bundle bundle0 = context0.getPackageManager().getApplicationInfo("org.dyndns.vivi.SkskShogi", 0x80).metaData;
                    GooglePlayServicesUtil.zzVW = bundle0 == null ? null : bundle0.getInt("com.google.android.gms.version");
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    Log.wtf("GooglePlayServicesUtil", "This should never happen.", packageManager$NameNotFoundException0);
                }
            }
            else if(!GooglePlayServicesUtil.zzVV.equals("org.dyndns.vivi.SkskShogi")) {
                throw new IllegalArgumentException("isGooglePlayServicesAvailable should only be called with Context from your application\'s package. A previous call used package \'" + GooglePlayServicesUtil.zzVV + "\' and this call used package \'" + "org.dyndns.vivi.SkskShogi" + "\'.");
            }
            integer0 = GooglePlayServicesUtil.zzVW;
        }
        if(integer0 == null) {
            throw new IllegalStateException("A required meta-data tag in your app\'s AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        if(((int)integer0) != GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE) {
            throw new IllegalStateException("The meta-data tag in your app\'s AndroidManifest.xml does not have the right value.  Expected " + GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE + " but" + " found " + integer0 + ".  You must have the" + " following declaration within the <application> element: " + "    <meta-data android:name=\"" + "com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
        }
    }

    private static void zzab(Context context0) {
        zza googlePlayServicesUtil$zza0 = new zza(context0);
        googlePlayServicesUtil$zza0.sendMessageDelayed(googlePlayServicesUtil$zza0.obtainMessage(1), 120000L);
    }

    @Deprecated
    public static void zzac(Context context0) {
        if(GooglePlayServicesUtil.zzVX.getAndSet(true)) {
            return;
        }
        try {
            ((NotificationManager)context0.getSystemService("notification")).cancel(10436);
        }
        catch(SecurityException unused_ex) {
        }
    }

    public static String zzad(Context context0) {
        String s = context0.getApplicationInfo().name;
        if(TextUtils.isEmpty(s)) {
            PackageManager packageManager0 = context0.getApplicationContext().getPackageManager();
            try {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("org.dyndns.vivi.SkskShogi", 0);
                return applicationInfo0 == null ? "org.dyndns.vivi.SkskShogi" : packageManager0.getApplicationLabel(applicationInfo0).toString();
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                return "org.dyndns.vivi.SkskShogi";
            }
        }
        return s;
    }

    // 去混淆评级： 低(40)
    public static boolean zzae(Context context0) {
        return context0.getPackageManager().hasSystemFeature("com.google.sidewinder");
    }

    public static boolean zzb(PackageManager packageManager0) {
        synchronized(GooglePlayServicesUtil.zzoW) {
            if(GooglePlayServicesUtil.zzVU == -1) {
                try {
                    GooglePlayServicesUtil.zzVU = zzd.zzmn().zza(packageManager0.getPackageInfo("com.google.android.gms", 0x40), new com.google.android.gms.common.zzc.zza[]{zzc.zzVK[1]}) == null ? 0 : 1;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    GooglePlayServicesUtil.zzVU = 0;
                }
            }
            return GooglePlayServicesUtil.zzVU != 0;
        }
    }

    @Deprecated
    public static boolean zzb(PackageManager packageManager0, String s) {
        return zzd.zzmn().zzb(packageManager0, s);
    }

    // 去混淆评级： 低(20)
    public static boolean zzc(PackageManager packageManager0) {
        return GooglePlayServicesUtil.zzb(packageManager0) || !GooglePlayServicesUtil.zzmm();
    }

    // 去混淆评级： 低(20)
    public static boolean zzd(Context context0, int v) {
        return GooglePlayServicesUtil.zza(context0, v, "com.google.android.gms") && GooglePlayServicesUtil.zzb(context0.getPackageManager(), "com.google.android.gms");
    }

    @Deprecated
    public static boolean zze(Context context0, int v) {
        switch(v) {
            case 1: {
                return GooglePlayServicesUtil.zzh(context0, "com.google.android.gms");
            }
            case 18: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Deprecated
    public static boolean zzf(Context context0, int v) {
        return v == 9 ? GooglePlayServicesUtil.zzh(context0, "com.android.vending") : false;
    }

    public static boolean zzh(Context context0, String s) {
        for(Object object0: context0.getPackageManager().getPackageInstaller().getAllSessions()) {
            if(s.equals(((PackageInstaller.SessionInfo)object0).getAppPackageName())) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private static int zzml() [...] // Inlined contents

    // 去混淆评级： 低(20)
    public static boolean zzmm() {
        return GooglePlayServicesUtil.zzVS ? GooglePlayServicesUtil.zzVT : "user".equals(Build.TYPE);
    }
}

