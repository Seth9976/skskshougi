package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import com.google.android.gms.common.internal.zzu;

@zzgd
public class zzbq {
    private final Context mContext;

    public zzbq(Context context0) {
        zzu.zzb(context0, "Context can not be null");
        this.mContext = context0;
    }

    public boolean zza(Intent intent0) {
        zzu.zzb(intent0, "Intent can not be null");
        return !this.mContext.getPackageManager().queryIntentActivities(intent0, 0).isEmpty();
    }

    public boolean zzcQ() {
        Intent intent0 = new Intent("android.intent.action.DIAL");
        intent0.setData(Uri.parse("tel:"));
        return this.zza(intent0);
    }

    public boolean zzcR() {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setData(Uri.parse("sms:"));
        return this.zza(intent0);
    }

    public boolean zzcS() {
        return zzbq.zzcU() && this.mContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public boolean zzcT() [...] // Inlined contents

    public static boolean zzcU() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public boolean zzcV() {
        Intent intent0 = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
        return Build.VERSION.SDK_INT >= 14 && this.zza(intent0);
    }
}

