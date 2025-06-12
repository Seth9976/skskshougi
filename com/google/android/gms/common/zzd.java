package com.google.android.gms.common;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;

public class zzd {
    private static final zzd zzVY;

    static {
        zzd.zzVY = new zzd();
    }

    private boolean zza(PackageInfo packageInfo0, boolean z) {
        if(packageInfo0.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return false;
        }
        zzb zzc$zzb0 = new zzb(packageInfo0.signatures[0].toByteArray());
        if((z ? zzc.zzmi() : zzc.zzmj()).contains(zzc$zzb0)) {
            return true;
        }
        if(Log.isLoggable("GoogleSignatureVerifier", 2)) {
            Log.v("GoogleSignatureVerifier", "Signature not valid.  Found: \n" + Base64.encodeToString(zzc$zzb0.getBytes(), 0));
        }
        return false;
    }

    zza zza(PackageInfo packageInfo0, zza[] arr_zzc$zza) {
        if(packageInfo0.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        zzb zzc$zzb0 = new zzb(packageInfo0.signatures[0].toByteArray());
        for(int v = 0; v < arr_zzc$zza.length; ++v) {
            if(arr_zzc$zza[v].equals(zzc$zzb0)) {
                return arr_zzc$zza[v];
            }
        }
        if(Log.isLoggable("GoogleSignatureVerifier", 2)) {
            Log.v("GoogleSignatureVerifier", "Signature not valid.  Found: \n" + Base64.encodeToString(zzc$zzb0.getBytes(), 0));
        }
        return null;
    }

    public boolean zza(PackageManager packageManager0, PackageInfo packageInfo0) {
        boolean z = false;
        if(packageInfo0 != null) {
            if(GooglePlayServicesUtil.zzc(packageManager0)) {
                return this.zza(packageInfo0, true);
            }
            z = this.zza(packageInfo0, false);
            if(!z && this.zza(packageInfo0, true)) {
                Log.w("GoogleSignatureVerifier", "Test-keys aren\'t accepted on this build.");
                return z;
            }
        }
        return z;
    }

    public boolean zzb(PackageManager packageManager0, String s) {
        try {
            return this.zza(packageManager0, packageManager0.getPackageInfo(s, 0x40));
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            if(Log.isLoggable("GoogleSignatureVerifier", 3)) {
                Log.d("GoogleSignatureVerifier", "Package manager can\'t find package " + s + ", defaulting to false");
            }
            return false;
        }
    }

    public static zzd zzmn() {
        return zzd.zzVY;
    }
}

