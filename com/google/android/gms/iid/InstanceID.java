package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class InstanceID {
    public static final String ERROR_BACKOFF = "RETRY_LATER";
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_MISSING_INSTANCEID_SERVICE = "MISSING_INSTANCEID_SERVICE";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String ERROR_TIMEOUT = "TIMEOUT";
    Context mContext;
    static Map zzawN;
    private static zzd zzawO;
    private static zzc zzawP;
    KeyPair zzawQ;
    String zzawR;
    long zzawS;
    static String zzawT;

    static {
        InstanceID.zzawN = new HashMap();
    }

    protected InstanceID(Context context, String subtype, Bundle options) {
        this.zzawR = "";
        this.mContext = context.getApplicationContext();
        this.zzawR = subtype;
    }

    public void deleteInstanceID() throws IOException {
        this.zzb("*", "*", null);
        this.zzuf();
    }

    public void deleteToken(String authorizedEntity, String scope) throws IOException {
        this.zzb(authorizedEntity, scope, null);
    }

    public long getCreationTime() {
        if(this.zzawS == 0L) {
            String s = InstanceID.zzawO.get(this.zzawR, "cre");
            if(s != null) {
                this.zzawS = Long.parseLong(s);
            }
        }
        return this.zzawS;
    }

    public String getId() {
        return InstanceID.zza(this.zzue());
    }

    public static InstanceID getInstance(Context context) {
        return InstanceID.zza(context, null);
    }

    public String getToken(String authorizedEntity, String scope) throws IOException {
        return this.getToken(authorizedEntity, scope, null);
    }

    public String getToken(String authorizedEntity, String scope, Bundle extras) throws IOException {
        if(Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        String s2 = this.zzui() ? null : InstanceID.zzawO.zzg(this.zzawR, authorizedEntity, scope);
        if(s2 == null) {
            if(extras == null) {
                extras = new Bundle();
            }
            s2 = this.zzc(authorizedEntity, scope, extras);
            if(s2 != null) {
                InstanceID.zzawO.zza(this.zzawR, authorizedEntity, scope, s2, InstanceID.zzawT);
                return s2;
            }
        }
        return s2;
    }

    public static InstanceID zza(Context context0, Bundle bundle0) {
        synchronized(InstanceID.class) {
            String s = bundle0 == null ? "" : bundle0.getString("subtype");
            String s1 = s == null ? "" : s;
            Context context1 = context0.getApplicationContext();
            if(InstanceID.zzawO == null) {
                InstanceID.zzawO = new zzd(context1);
                InstanceID.zzawP = new zzc(context1);
            }
            InstanceID.zzawT = Integer.toString(InstanceID.zzau(context1));
            InstanceID instanceID0 = (InstanceID)InstanceID.zzawN.get(s1);
            if(instanceID0 == null) {
                instanceID0 = new InstanceID(context1, s1, bundle0);
                InstanceID.zzawN.put(s1, instanceID0);
            }
            return instanceID0;
        }
    }

    static String zza(KeyPair keyPair0) {
        byte[] arr_b = keyPair0.getPublic().getEncoded();
        try {
            byte[] arr_b1 = MessageDigest.getInstance("SHA1").digest(arr_b);
            arr_b1[0] = (byte)((arr_b1[0] & 15) + 0x70 & 0xFF);
            return Base64.encodeToString(arr_b1, 0, 8, 11);
        }
        catch(NoSuchAlgorithmException unused_ex) {
            Log.w("InstanceID", "Unexpected error, device missing required alghorithms");
            return null;
        }
    }

    static int zzau(Context context0) {
        try {
            return context0.getPackageManager().getPackageInfo("org.dyndns.vivi.SkskShogi", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.w("InstanceID", "Never happens: can\'t find own package " + packageManager$NameNotFoundException0);
            return 0;
        }
    }

    public void zzb(String s, String s1, Bundle bundle0) throws IOException {
        if(Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        InstanceID.zzawO.zzh(this.zzawR, s, s1);
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        bundle0.putString("sender", s);
        if(s1 != null) {
            bundle0.putString("scope", s1);
        }
        bundle0.putString("subscription", s);
        bundle0.putString("delete", "1");
        bundle0.putString("X-delete", "1");
        bundle0.putString("subtype", ("".equals(this.zzawR) ? s : this.zzawR));
        if(!"".equals(this.zzawR)) {
            s = this.zzawR;
        }
        bundle0.putString("X-subtype", s);
        Intent intent0 = InstanceID.zzawP.zza(bundle0, this.zzue());
        InstanceID.zzawP.zzp(intent0);
    }

    public String zzc(String s, String s1, Bundle bundle0) throws IOException {
        if(s1 != null) {
            bundle0.putString("scope", s1);
        }
        bundle0.putString("sender", s);
        String s2 = "".equals(this.zzawR) ? s : this.zzawR;
        if(!bundle0.containsKey("legacy.register")) {
            bundle0.putString("subscription", s);
            bundle0.putString("subtype", s2);
            bundle0.putString("X-subscription", s);
            bundle0.putString("X-subtype", s2);
        }
        Intent intent0 = InstanceID.zzawP.zza(bundle0, this.zzue());
        return InstanceID.zzawP.zzp(intent0);
    }

    static String zzm(byte[] arr_b) {
        return Base64.encodeToString(arr_b, 11);
    }

    KeyPair zzue() {
        if(this.zzawQ == null) {
            this.zzawQ = InstanceID.zzawO.zzdg(this.zzawR);
        }
        if(this.zzawQ == null) {
            this.zzawS = System.currentTimeMillis();
            this.zzawQ = InstanceID.zzawO.zze(this.zzawR, this.zzawS);
        }
        return this.zzawQ;
    }

    void zzuf() {
        this.zzawS = 0L;
        InstanceID.zzawO.zzdh(this.zzawR);
        this.zzawQ = null;
    }

    zzd zzug() {
        return InstanceID.zzawO;
    }

    zzc zzuh() {
        return InstanceID.zzawP;
    }

    boolean zzui() {
        String s = InstanceID.zzawO.get("appVersion");
        if(s == null || !s.equals(InstanceID.zzawT)) {
            return true;
        }
        String s1 = InstanceID.zzawO.get("lastToken");
        return s1 == null || System.currentTimeMillis() / 1000L - Long.parseLong(s1) > 604800L;
    }
}

