package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public class zza extends zzd {
    public static boolean zzJk;
    private Info zzJl;
    private final zzaj zzJm;
    private String zzJn;
    private boolean zzJo;
    private Object zzJp;

    zza(zzf zzf0) {
        super(zzf0);
        this.zzJo = false;
        this.zzJp = new Object();
        this.zzJm = new zzaj(zzf0.zzhP());
    }

    private boolean zza(Info advertisingIdClient$Info0, Info advertisingIdClient$Info1) {
        String s4;
        String s = null;
        String s1 = advertisingIdClient$Info1 == null ? null : advertisingIdClient$Info1.getId();
        if(TextUtils.isEmpty(s1)) {
            return true;
        }
        String s2 = this.zzhV().zziP();
        synchronized(this.zzJp) {
            if(!this.zzJo) {
                this.zzJn = this.zzhF();
                this.zzJo = true;
            }
            else if(TextUtils.isEmpty(this.zzJn)) {
                if(advertisingIdClient$Info0 != null) {
                    s = advertisingIdClient$Info0.getId();
                }
                if(s == null) {
                    return this.zzaS(s1 + s2);
                }
                this.zzJn = zza.zzaR((s + s2));
            }
            String s3 = zza.zzaR((s1 + s2));
            if(TextUtils.isEmpty(s3)) {
                return false;
            }
            if(s3.equals(this.zzJn)) {
                return true;
            }
            if(TextUtils.isEmpty(this.zzJn)) {
                s4 = s2;
            }
            else {
                this.zzaT("Resetting the client id because Advertising Id changed.");
                s4 = this.zzhV().zziQ();
                this.zza("New client Id", s4);
            }
            return this.zzaS(s1 + s4);
        }
    }

    private static String zzaR(String s) {
        MessageDigest messageDigest0 = zzam.zzbl("MD5");
        return messageDigest0 == null ? null : String.format(Locale.US, "%032X", new BigInteger(1, messageDigest0.digest(s.getBytes())));
    }

    private boolean zzaS(String s) {
        try {
            String s1 = zza.zzaR(s);
            this.zzaT("Storing hashed adid.");
            FileOutputStream fileOutputStream0 = this.getContext().openFileOutput("gaClientIdData", 0);
            fileOutputStream0.write(s1.getBytes());
            fileOutputStream0.close();
            this.zzJn = s1;
            return true;
        }
        catch(IOException iOException0) {
            this.zze("Error creating hash file", iOException0);
            return false;
        }
    }

    public String zzhC() {
        this.zzia();
        Info advertisingIdClient$Info0 = this.zzhD();
        if(advertisingIdClient$Info0 != null) {
            String s = advertisingIdClient$Info0.getId();
            return TextUtils.isEmpty(s) ? null : s;
        }
        return TextUtils.isEmpty(null) ? null : null;
    }

    private Info zzhD() {
        synchronized(this) {
            if(this.zzJm.zzv(1000L)) {
                this.zzJm.start();
                Info advertisingIdClient$Info0 = this.zzhE();
                if(this.zza(this.zzJl, advertisingIdClient$Info0)) {
                    this.zzJl = advertisingIdClient$Info0;
                }
                else {
                    this.zzaX("Failed to reset client id on adid change. Not using adid");
                    this.zzJl = new Info("", false);
                }
            }
            return this.zzJl;
        }
    }

    protected Info zzhE() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.getContext());
        }
        catch(IllegalStateException unused_ex) {
            this.zzaW("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added \'<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />\' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        }
        catch(Throwable throwable0) {
            if(!zza.zzJk) {
                zza.zzJk = true;
                this.zzd("Error getting advertiser id", throwable0);
                return null;
            }
            return null;
        }
    }

    protected String zzhF() {
        String s1;
        FileInputStream fileInputStream0;
        String s = null;
        try {
            fileInputStream0 = this.getContext().openFileInput("gaClientIdData");
            byte[] arr_b = new byte[0x80];
            int v = fileInputStream0.read(arr_b, 0, 0x80);
            if(fileInputStream0.available() > 0) {
                this.zzaW("Hash file seems corrupted, deleting it.");
                fileInputStream0.close();
                this.getContext().deleteFile("gaClientIdData");
                return null;
            }
            if(v <= 0) {
                this.zzaT("Hash file is empty.");
                fileInputStream0.close();
                return null;
            }
            s1 = new String(arr_b, 0, v);
            goto label_18;
        }
        catch(FileNotFoundException unused_ex) {
            return null;
        }
        catch(IOException iOException0) {
        }
        this.zzd("Error reading Hash file, deleting it", iOException0);
        this.getContext().deleteFile("gaClientIdData");
        return s;
        try {
        label_18:
            fileInputStream0.close();
            return s1;
        }
        catch(FileNotFoundException unused_ex) {
            return s1;
        }
        catch(IOException iOException1) {
            s = s1;
            iOException0 = iOException1;
        }
        this.zzd("Error reading Hash file, deleting it", iOException0);
        this.getContext().deleteFile("gaClientIdData");
        return s;
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
    }

    public boolean zzhy() {
        this.zzia();
        Info advertisingIdClient$Info0 = this.zzhD();
        return advertisingIdClient$Info0 != null && !advertisingIdClient$Info0.isLimitAdTrackingEnabled();
    }
}

