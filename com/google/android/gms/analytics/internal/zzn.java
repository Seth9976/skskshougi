package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class zzn extends zzd {
    private volatile String zzJd;
    private Future zzKG;

    protected zzn(zzf zzf0) {
        super(zzf0);
    }

    protected String zzX(Context context0) {
        String s;
        int v;
        byte[] arr_b;
        FileInputStream fileInputStream0;
        zzu.zzbZ("ClientId should be loaded from worker thread");
        try {
            fileInputStream0 = null;
            fileInputStream0 = context0.openFileInput("gaClientId");
            goto label_9;
        }
        catch(FileNotFoundException unused_ex) {
        }
        catch(IOException iOException0) {
            goto label_41;
        }
        catch(Throwable throwable0) {
            goto label_7;
        }
        FileInputStream fileInputStream1 = null;
        goto label_34;
    label_7:
        Throwable throwable1 = throwable0;
        goto label_51;
        try {
        label_9:
            arr_b = new byte[36];
            v = fileInputStream0.read(arr_b, 0, 36);
            if(fileInputStream0.available() <= 0) {
                if(v < 14) {
                    this.zzaW("clientId file is empty, deleting it.");
                    fileInputStream0.close();
                    context0.deleteFile("gaClientId");
                    goto label_16;
                }
                goto label_21;
            }
            goto label_29;
        }
        catch(FileNotFoundException unused_ex) {
            goto label_33;
        }
        catch(IOException iOException0) {
            goto label_41;
        }
        catch(Throwable throwable1) {
            goto label_51;
        }
        try {
        label_16:
            fileInputStream0.close();
        }
        catch(IOException iOException1) {
            this.zze("Failed to close client id reading stream", iOException1);
        }
        return null;
        try {
        label_21:
            fileInputStream0.close();
            s = new String(arr_b, 0, v);
            this.zza("Read client id from disk", s);
        }
        catch(FileNotFoundException unused_ex) {
            goto label_33;
        }
        catch(IOException iOException0) {
            goto label_41;
        }
        catch(Throwable throwable1) {
            goto label_51;
        }
        try {
            fileInputStream0.close();
        }
        catch(IOException iOException2) {
            this.zze("Failed to close client id reading stream", iOException2);
        }
        return s;
        try {
        label_29:
            this.zzaW("clientId file seems corrupted, deleting it.");
            fileInputStream0.close();
            context0.deleteFile("gaClientId");
            goto label_57;
        }
        catch(FileNotFoundException unused_ex) {
        label_33:
            fileInputStream1 = fileInputStream0;
        label_34:
            if(fileInputStream1 != null) {
                try {
                    fileInputStream1.close();
                }
                catch(IOException iOException3) {
                    this.zze("Failed to close client id reading stream", iOException3);
                }
                return null;
            }
            return null;
        }
        catch(IOException iOException0) {
            try {
            label_41:
                this.zze("Error reading client id file, deleting it", iOException0);
                context0.deleteFile("gaClientId");
                if(fileInputStream0 != null) {
                    goto label_44;
                }
                return null;
            }
            catch(Throwable throwable1) {
                goto label_51;
            }
            try {
            label_44:
                fileInputStream0.close();
            }
            catch(IOException iOException4) {
                this.zze("Failed to close client id reading stream", iOException4);
            }
            return null;
        }
        catch(Throwable throwable1) {
        }
    label_51:
        if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
            }
            catch(IOException iOException5) {
                this.zze("Failed to close client id reading stream", iOException5);
            }
        }
        throw throwable1;
        try {
        label_57:
            fileInputStream0.close();
        }
        catch(IOException iOException6) {
            this.zze("Failed to close client id reading stream", iOException6);
        }
        return null;
    }

    private boolean zzg(Context context0, String s) {
        zzu.zzcj(s);
        zzu.zzbZ("ClientId should be saved from worker thread");
        FileOutputStream fileOutputStream0 = null;
        try {
            try {
                this.zza("Storing clientId", s);
                fileOutputStream0 = context0.openFileOutput("gaClientId", 0);
                fileOutputStream0.write(s.getBytes());
                goto label_31;
            }
            catch(FileNotFoundException fileNotFoundException0) {
            }
            catch(IOException iOException0) {
                goto label_16;
            }
            this.zze("Error creating clientId file", fileNotFoundException0);
            if(fileOutputStream0 != null) {
                goto label_10;
            }
            return false;
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        try {
        label_10:
            fileOutputStream0.close();
        }
        catch(IOException iOException1) {
            this.zze("Failed to close clientId writing stream", iOException1);
        }
        return false;
        try {
        label_16:
            this.zze("Error writing to clientId file", iOException0);
            if(fileOutputStream0 != null) {
                goto label_18;
            }
            return false;
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        try {
        label_18:
            fileOutputStream0.close();
        }
        catch(IOException iOException2) {
            this.zze("Failed to close clientId writing stream", iOException2);
        }
        return false;
    label_25:
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(IOException iOException3) {
                this.zze("Failed to close clientId writing stream", iOException3);
            }
        }
        throw throwable0;
        try {
        label_31:
            fileOutputStream0.close();
        }
        catch(IOException iOException4) {
            this.zze("Failed to close clientId writing stream", iOException4);
        }
        return true;
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
    }

    public String zziP() {
        this.zzia();
        synchronized(this) {
            if(this.zzJd == null) {
                this.zzKG = this.zzhS().zzb(new Callable() {
                    public String zziU() throws Exception {
                        return zzn.this.zziR();
                    }
                });
            }
            if(this.zzKG != null) {
                try {
                    this.zzJd = (String)this.zzKG.get();
                }
                catch(InterruptedException interruptedException0) {
                    this.zzd("ClientId loading or generation was interrupted", interruptedException0);
                    this.zzJd = "0";
                }
                catch(ExecutionException executionException0) {
                    this.zze("Failed to load or generate client id", executionException0);
                    this.zzJd = "0";
                }
                if(this.zzJd == null) {
                    this.zzJd = "0";
                }
                this.zza("Loaded clientId", this.zzJd);
                this.zzKG = null;
            }
            return this.zzJd;
        }
    }

    String zziQ() {
        synchronized(this) {
            this.zzJd = null;
            this.zzKG = this.zzhS().zzb(new Callable() {
                public String zziU() throws Exception {
                    return zzn.this.zziS();
                }
            });
        }
        return this.zziP();
    }

    String zziR() {
        String s = this.zzX(this.zzhS().getContext());
        return s == null ? this.zziS() : s;
    }

    private String zziS() {
        try {
            return this.zzg(this.zzhS().getContext(), "ae0a27c0-8021-4648-9590-69337ba8cdf9") ? "ae0a27c0-8021-4648-9590-69337ba8cdf9" : "0";
        }
        catch(Exception exception0) {
            this.zze("Error saving clientId file", exception0);
            return "0";
        }
    }

    // 去混淆评级： 低(40)
    protected String zziT() [...] // Potential decryptor
}

