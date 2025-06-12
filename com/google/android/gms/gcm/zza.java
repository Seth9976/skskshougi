package com.google.android.gms.gcm;

import android.app.Notification.Builder;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;

class zza {
    class com.google.android.gms.gcm.zza.zza extends IllegalArgumentException {
        final zza zzavG;

        private com.google.android.gms.gcm.zza.zza(String s) {
            super(s);
        }

        com.google.android.gms.gcm.zza.zza(String s, com.google.android.gms.gcm.zza.1 zza$10) {
            this(s);
        }
    }

    private Context mContext;
    static zza zzavF;

    private zza(Context context0) {
        this.mContext = context0.getApplicationContext();
    }

    private void zza(String s, Notification notification0) {
        if(Log.isLoggable("GcmNotification", 3)) {
            Log.d("GcmNotification", "Showing notification");
        }
        NotificationManager notificationManager0 = (NotificationManager)this.mContext.getSystemService("notification");
        if(TextUtils.isEmpty(s)) {
            s = "GCM-Notification:" + SystemClock.uptimeMillis();
        }
        notificationManager0.notify(s, 0, notification0);
    }

    static zza zzar(Context context0) {
        synchronized(zza.class) {
            if(zza.zzavF == null) {
                zza.zzavF = new zza(context0);
            }
            return zza.zzavF;
        }
    }

    static String zzb(Bundle bundle0, String s) {
        String s1 = bundle0.getString(s);
        return s1 == null ? bundle0.getString(s.replace("gcm.n.", "gcm.notification.")) : s1;
    }

    private int zzda(String s) {
        if(TextUtils.isEmpty(s)) {
            throw new com.google.android.gms.gcm.zza.zza(this, "Missing icon", null);
        }
        Resources resources0 = this.mContext.getResources();
        int v = resources0.getIdentifier(s, "drawable", "org.dyndns.vivi.SkskShogi");
        if(v == 0) {
            v = resources0.getIdentifier(s, "mipmap", "org.dyndns.vivi.SkskShogi");
            if(v == 0) {
                throw new com.google.android.gms.gcm.zza.zza(this, "Icon resource not found: " + s, null);
            }
        }
        return v;
    }

    private Uri zzdb(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(!"default".equals(s)) {
            throw new com.google.android.gms.gcm.zza.zza(this, "Invalid sound: " + s, null);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    static boolean zzt(Bundle bundle0) {
        return zza.zzb(bundle0, "gcm.n.title") != null;
    }

    boolean zzu(Bundle bundle0) {
        try {
            Notification notification0 = this.zzv(bundle0);
            this.zza(zza.zzb(bundle0, "gcm.n.tag"), notification0);
            return true;
        }
        catch(com.google.android.gms.gcm.zza.zza zza$zza0) {
            Log.w("GcmNotification", "Failed to show notification: " + zza$zza0.getMessage());
            return false;
        }
    }

    private Notification zzv(Bundle bundle0) {
        String s = zza.zzb(bundle0, "gcm.n.title");
        if(TextUtils.isEmpty(s)) {
            throw new com.google.android.gms.gcm.zza.zza(this, "Missing title", null);
        }
        String s1 = zza.zzb(bundle0, "gcm.n.body");
        int v = this.zzda(zza.zzb(bundle0, "gcm.n.icon"));
        Uri uri0 = this.zzdb(zza.zzb(bundle0, "gcm.n.sound"));
        PendingIntent pendingIntent0 = this.zzw(bundle0);
        if(Build.VERSION.SDK_INT >= 11) {
            Notification.Builder notification$Builder0 = new Notification.Builder(this.mContext).setAutoCancel(true).setSmallIcon(v).setContentTitle(s).setContentText(s1);
            if(Build.VERSION.SDK_INT >= 21) {
                String s2 = zza.zzb(bundle0, "gcm.n.color");
                if(!TextUtils.isEmpty(s2)) {
                    notification$Builder0.setColor(Color.parseColor(s2));
                }
            }
            if(uri0 != null) {
                notification$Builder0.setSound(uri0);
            }
            if(pendingIntent0 != null) {
                notification$Builder0.setContentIntent(pendingIntent0);
            }
            return Build.VERSION.SDK_INT < 16 ? notification$Builder0.getNotification() : notification$Builder0.build();
        }
        Notification notification0 = new Notification();
        notification0.flags |= 16;
        notification0.icon = v;
        if(uri0 != null) {
            notification0.sound = uri0;
        }
        if(pendingIntent0 == null) {
            Intent intent0 = new Intent();
            intent0.setPackage("com.google.example.invalidpackage");
            pendingIntent0 = PendingIntent.getBroadcast(this.mContext, 0, intent0, 0);
        }
        notification0.setLatestEventInfo(this.mContext, s, s1, pendingIntent0);
        return notification0;
    }

    private PendingIntent zzw(Bundle bundle0) {
        String s = zza.zzb(bundle0, "gcm.n.click_action");
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        Intent intent0 = new Intent(s);
        intent0.setPackage("org.dyndns.vivi.SkskShogi");
        intent0.setFlags(0x10000000);
        intent0.putExtras(bundle0);
        for(Object object0: bundle0.keySet()) {
            String s1 = (String)object0;
            if(s1.startsWith("gcm.n.") || s1.startsWith("gcm.notification.")) {
                intent0.removeExtra(s1);
            }
        }
        return PendingIntent.getActivity(this.mContext, 0, intent0, 0x40000000);
    }

    class com.google.android.gms.gcm.zza.1 {
    }

}

