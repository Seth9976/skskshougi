package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.zzbg;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class zzqh {
    private final Context mContext;
    private final ExecutorService zzaNb;
    public static final Integer zzaPM;
    public static final Integer zzaPN;

    static {
        zzqh.zzaPM = 0;
        zzqh.zzaPN = 1;
    }

    public zzqh(Context context0) {
        this(context0, Executors.newSingleThreadExecutor());
    }

    zzqh(Context context0, ExecutorService executorService0) {
        this.mContext = context0;
        this.zzaNb = executorService0;
    }

    public void zza(String s, Integer integer0, zzqb zzqb0, zzqg zzqg0) {
        com.google.android.gms.internal.zzqh.1 zzqh$10 = () -> {
            zzbg.zzaB("DiskLoader: Starting to load resource from Disk.");
            try {
                Object object0 = this.zzaPQ.zzt(zzqh.this.zzm(new FileInputStream(zzqh.this.zzfb(this.zzaPO))));
                if(object0 != null) {
                    zzbg.zzaB(("Saved resource loaded: " + ("resource_" + this.zzaPO)));
                    long v = zzqh.this.zzfa(this.zzaPO);
                    this.zzaPR.zza(Status.zzXP, object0, zzqh.zzaPN, v);
                    return;
                }
            }
            catch(FileNotFoundException unused_ex) {
                zzbg.zzaz(("Saved resource not found: " + ("resource_" + this.zzaPO)));
            }
            catch(zzg unused_ex) {
                zzbg.zzaz(("Saved resource is corrupted: " + ("resource_" + this.zzaPO)));
            }
            if(this.zzaPP == null) {
                this.zzaPR.zza(Status.zzXR, null, null, 0L);
                return;
            }
            try {
                InputStream inputStream0 = zzqh.this.mContext.getResources().openRawResource(((int)this.zzaPP));
                if(inputStream0 != null) {
                    Object object1 = this.zzaPQ.zzt(zzqh.this.zzm(inputStream0));
                    if(object1 != null) {
                        zzbg.zzaB(("Default resource loaded: " + zzqh.this.mContext.getResources().getResourceEntryName(((int)this.zzaPP))));
                        this.zzaPR.zza(Status.zzXP, object1, zzqh.zzaPM, 0L);
                        return;
                    }
                }
            }
            catch(Resources.NotFoundException unused_ex) {
                zzbg.zzaz(("Default resource not found. ID: " + this.zzaPP));
            }
            catch(zzg unused_ex) {
                zzbg.zzaz(("Default resource resource is corrupted: " + this.zzaPP));
            }
            this.zzaPR.zza(Status.zzXR, null, null, 0L);
        };
        this.zzaNb.execute(zzqh$10);

        class com.google.android.gms.internal.zzqh.1 implements Runnable {
            com.google.android.gms.internal.zzqh.1(String s, Integer integer0, zzqb zzqb0, zzqg zzqg0) {
            }

            @Override
            public void run() {
                zzqh.this.zzb(this.zzaPO, this.zzaPP, this.zzaPQ, this.zzaPR);
            }
        }

    }

    // 检测为 lambda 实现。
    void zzb(String s, Integer integer0, zzqb zzqb0, zzqg zzqg0) {
        zzbg.zzaB("DiskLoader: Starting to load resource from Disk.");
        try {
            Object object0 = zzqb0.zzt(this.zzm(new FileInputStream(this.zzfb(s))));
            if(object0 != null) {
                zzbg.zzaB(("Saved resource loaded: " + ("resource_" + s)));
                long v = this.zzfa(s);
                zzqg0.zza(Status.zzXP, object0, zzqh.zzaPN, v);
                return;
            }
        }
        catch(FileNotFoundException unused_ex) {
            zzbg.zzaz(("Saved resource not found: " + ("resource_" + s)));
        }
        catch(zzg unused_ex) {
            zzbg.zzaz(("Saved resource is corrupted: " + ("resource_" + s)));
        }
        if(integer0 == null) {
            zzqg0.zza(Status.zzXR, null, null, 0L);
            return;
        }
        try {
            InputStream inputStream0 = this.mContext.getResources().openRawResource(((int)integer0));
            if(inputStream0 != null) {
                Object object1 = zzqb0.zzt(this.zzm(inputStream0));
                if(object1 != null) {
                    zzbg.zzaB(("Default resource loaded: " + this.mContext.getResources().getResourceEntryName(((int)integer0))));
                    zzqg0.zza(Status.zzXP, object1, zzqh.zzaPM, 0L);
                    return;
                }
            }
        }
        catch(Resources.NotFoundException unused_ex) {
            zzbg.zzaz(("Default resource not found. ID: " + integer0));
        }
        catch(zzg unused_ex) {
            zzbg.zzaz(("Default resource resource is corrupted: " + integer0));
        }
        zzqg0.zza(Status.zzXR, null, null, 0L);
    }

    public void zze(String s, byte[] arr_b) {
        com.google.android.gms.internal.zzqh.2 zzqh$20 = () -> {
            FileOutputStream fileOutputStream0;
            File file0 = zzqh.this.zzfb(this.zzaPO);
            try {
                fileOutputStream0 = new FileOutputStream(file0);
            }
            catch(FileNotFoundException unused_ex) {
                zzbg.zzaz("Error opening resource file for writing");
                return;
            }
            try {
                try {
                    fileOutputStream0.write(this.zzOn);
                    goto label_20;
                }
                catch(IOException unused_ex) {
                }
                zzbg.zzaz("Error writing resource to disk. Removing resource from disk");
                file0.delete();
            }
            catch(Throwable throwable0) {
                goto label_15;
            }
            try {
                fileOutputStream0.close();
                zzbg.zzaB(("Resource " + this.zzaPO + " saved on Disk."));
            }
            catch(IOException unused_ex) {
                zzbg.zzaz("Error closing stream for writing resource to disk");
            }
            return;
            try {
            label_15:
                fileOutputStream0.close();
                zzbg.zzaB(("Resource " + this.zzaPO + " saved on Disk."));
            }
            catch(IOException unused_ex) {
                zzbg.zzaz("Error closing stream for writing resource to disk");
            }
            throw throwable0;
            try {
            label_20:
                fileOutputStream0.close();
                zzbg.zzaB(("Resource " + this.zzaPO + " saved on Disk."));
            }
            catch(IOException unused_ex) {
                zzbg.zzaz("Error closing stream for writing resource to disk");
            }
        };
        this.zzaNb.execute(zzqh$20);

        class com.google.android.gms.internal.zzqh.2 implements Runnable {
            com.google.android.gms.internal.zzqh.2(String s, byte[] arr_b) {
            }

            @Override
            public void run() {
                zzqh.this.zzf(this.zzaPO, this.zzOn);
            }
        }

    }

    // 检测为 lambda 实现。
    void zzf(String s, byte[] arr_b) {
        FileOutputStream fileOutputStream0;
        File file0 = this.zzfb(s);
        try {
            fileOutputStream0 = new FileOutputStream(file0);
        }
        catch(FileNotFoundException unused_ex) {
            zzbg.zzaz("Error opening resource file for writing");
            return;
        }
        try {
            try {
                fileOutputStream0.write(arr_b);
                goto label_20;
            }
            catch(IOException unused_ex) {
            }
            zzbg.zzaz("Error writing resource to disk. Removing resource from disk");
            file0.delete();
        }
        catch(Throwable throwable0) {
            goto label_15;
        }
        try {
            fileOutputStream0.close();
            zzbg.zzaB(("Resource " + s + " saved on Disk."));
        }
        catch(IOException unused_ex) {
            zzbg.zzaz("Error closing stream for writing resource to disk");
        }
        return;
        try {
        label_15:
            fileOutputStream0.close();
            zzbg.zzaB(("Resource " + s + " saved on Disk."));
        }
        catch(IOException unused_ex) {
            zzbg.zzaz("Error closing stream for writing resource to disk");
        }
        throw throwable0;
        try {
        label_20:
            fileOutputStream0.close();
            zzbg.zzaB(("Resource " + s + " saved on Disk."));
        }
        catch(IOException unused_ex) {
            zzbg.zzaz("Error closing stream for writing resource to disk");
        }
    }

    public long zzfa(String s) {
        File file0 = this.zzfb(s);
        return file0.exists() ? file0.lastModified() : 0L;
    }

    File zzfb(String s) {
        return new File(this.mContext.getDir("google_tagmanager", 0), "resource_" + s);
    }

    private String zzfc(String s) [...] // Inlined contents

    private byte[] zzm(InputStream inputStream0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            try {
                zzlg.zza(inputStream0, byteArrayOutputStream0);
                goto label_14;
            }
            catch(IOException unused_ex) {
            }
            zzbg.zzaC("Failed to read the resource from disk");
        }
        catch(Throwable throwable0) {
            goto label_9;
        }
        try {
            inputStream0.close();
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException unused_ex) {
            zzbg.zzaC("Error closing stream for reading resource from disk");
            return null;
        }
        try {
        label_9:
            inputStream0.close();
        }
        catch(IOException unused_ex) {
            zzbg.zzaC("Error closing stream for reading resource from disk");
            return null;
        }
        throw throwable0;
        try {
        label_14:
            inputStream0.close();
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException unused_ex) {
            zzbg.zzaC("Error closing stream for reading resource from disk");
            return null;
        }
    }
}

