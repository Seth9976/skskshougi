package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import com.google.android.gms.internal.zzpx.zza;
import com.google.android.gms.internal.zzqf.zzc;
import com.google.android.gms.internal.zzqf.zzg;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzrm;
import com.google.android.gms.internal.zzrn;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

class zzcn implements zzf {
    private final Context mContext;
    private final String zzaKy;
    private zzbf zzaMU;
    private final ExecutorService zzaNb;

    zzcn(Context context0, String s) {
        this.mContext = context0;
        this.zzaKy = s;
        this.zzaNb = Executors.newSingleThreadExecutor();
    }

    @Override  // com.google.android.gms.common.api.Releasable
    public void release() {
        synchronized(this) {
            this.zzaNb.shutdown();
        }
    }

    private zzc zza(ByteArrayOutputStream byteArrayOutputStream0) {
        try {
            return zzaz.zzey(byteArrayOutputStream0.toString("UTF-8"));
        }
        catch(UnsupportedEncodingException unused_ex) {
            zzbg.zzay("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
            return null;
        }
        catch(JSONException unused_ex) {
            zzbg.zzaC("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn\'t contain a JSON container");
            return null;
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzp$zzf
    public void zza(zzbf zzbf0) {
        this.zzaMU = zzbf0;
    }

    @Override  // com.google.android.gms.tagmanager.zzp$zzf
    public void zzb(zza zzpx$zza0) {
        com.google.android.gms.tagmanager.zzcn.2 zzcn$20 = () -> {
            FileOutputStream fileOutputStream0;
            File file0 = zzcn.this.zzzo();
            try {
                fileOutputStream0 = new FileOutputStream(file0);
            }
            catch(FileNotFoundException unused_ex) {
                zzbg.zzaz("Error opening resource file for writing");
                return false;
            }
            try {
                try {
                    fileOutputStream0.write(zzrn.zzf(this.zzaNd));
                    goto label_18;
                }
                catch(IOException unused_ex) {
                }
                zzbg.zzaC("Error writing resource to disk. Removing resource from disk.");
                file0.delete();
            }
            catch(Throwable throwable0) {
                goto label_14;
            }
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
                zzbg.zzaC("error closing stream for writing resource to disk");
            }
            return false;
            try {
            label_14:
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
                zzbg.zzaC("error closing stream for writing resource to disk");
            }
            throw throwable0;
            try {
            label_18:
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
                zzbg.zzaC("error closing stream for writing resource to disk");
            }
            return true;
        };
        this.zzaNb.execute(zzcn$20);

        class com.google.android.gms.tagmanager.zzcn.2 implements Runnable {
            com.google.android.gms.tagmanager.zzcn.2(zza zzpx$zza0) {
            }

            @Override
            public void run() {
                zzcn.this.zzc(this.zzaNd);
            }
        }

    }

    // 检测为 lambda 实现。
    boolean zzc(zza zzpx$zza0) {
        FileOutputStream fileOutputStream0;
        File file0 = this.zzzo();
        try {
            fileOutputStream0 = new FileOutputStream(file0);
        }
        catch(FileNotFoundException unused_ex) {
            zzbg.zzaz("Error opening resource file for writing");
            return false;
        }
        try {
            try {
                fileOutputStream0.write(zzrn.zzf(zzpx$zza0));
                goto label_18;
            }
            catch(IOException unused_ex) {
            }
            zzbg.zzaC("Error writing resource to disk. Removing resource from disk.");
            file0.delete();
        }
        catch(Throwable throwable0) {
            goto label_14;
        }
        try {
            fileOutputStream0.close();
        }
        catch(IOException unused_ex) {
            zzbg.zzaC("error closing stream for writing resource to disk");
        }
        return false;
        try {
        label_14:
            fileOutputStream0.close();
        }
        catch(IOException unused_ex) {
            zzbg.zzaC("error closing stream for writing resource to disk");
        }
        throw throwable0;
        try {
        label_18:
            fileOutputStream0.close();
        }
        catch(IOException unused_ex) {
            zzbg.zzaC("error closing stream for writing resource to disk");
        }
        return true;
    }

    private void zzd(zza zzpx$zza0) throws IllegalArgumentException {
        if(zzpx$zza0.zziO == null && zzpx$zza0.zzaPa == null) {
            throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzp$zzf
    public zzc zziR(int v) {
        InputStream inputStream0;
        try {
            inputStream0 = this.mContext.getResources().openRawResource(v);
        }
        catch(Resources.NotFoundException unused_ex) {
            zzbg.zzaC(("Failed to load the container. No default container resource found with the resource ID " + v));
            return null;
        }
        zzbg.zzaB(("Attempting to load a container from the resource ID " + v + " (" + this.mContext.getResources().getResourceName(v) + ")"));
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            zzqf.zzc(inputStream0, byteArrayOutputStream0);
            zzc zzqf$zzc0 = this.zza(byteArrayOutputStream0);
            if(zzqf$zzc0 != null) {
                zzbg.zzaB("The container was successfully loaded from the resource (using JSON file format)");
                return zzqf$zzc0;
            }
            return this.zzr(byteArrayOutputStream0.toByteArray());
        }
        catch(IOException unused_ex) {
            zzbg.zzaC(("Error reading the default container with resource ID " + v + " (" + this.mContext.getResources().getResourceName(v) + ")"));
            return null;
        }
    }

    private zzc zzr(byte[] arr_b) {
        try {
            zzc zzqf$zzc0 = zzqf.zzb(com.google.android.gms.internal.zzaf.zzf.zzc(arr_b));
            if(zzqf$zzc0 != null) {
                zzbg.zzaB("The container was successfully loaded from the resource (using binary file)");
            }
            return zzqf$zzc0;
        }
        catch(zzrm unused_ex) {
            zzbg.zzaz("The resource file is corrupted. The container cannot be extracted from the binary file");
            return null;
        }
        catch(zzg unused_ex) {
            zzbg.zzaC("The resource file is invalid. The container from the binary file is invalid");
            return null;
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzp$zzf
    public void zzyw() {
        com.google.android.gms.tagmanager.zzcn.1 zzcn$10 = () -> {
            FileInputStream fileInputStream0;
            if(zzcn.this.zzaMU == null) {
                throw new IllegalStateException("Callback must be set before execute");
            }
            zzcn.this.zzaMU.zzyv();
            zzbg.zzaB("Attempting to load resource from disk");
            if(zzcb.zzzf().zzzg() == com.google.android.gms.tagmanager.zzcb.zza.zzaMJ || zzcb.zzzf().zzzg() == com.google.android.gms.tagmanager.zzcb.zza.zzaMK) {
                String s = zzcb.zzzf().getContainerId();
                if(zzcn.this.zzaKy.equals(s)) {
                    zzcn.this.zzaMU.zza(com.google.android.gms.tagmanager.zzbf.zza.zzaMi);
                    return;
                }
            }
            try {
                fileInputStream0 = new FileInputStream(zzcn.this.zzzo());
            }
            catch(FileNotFoundException unused_ex) {
                zzbg.zzay("Failed to find the resource in the disk");
                zzcn.this.zzaMU.zza(com.google.android.gms.tagmanager.zzbf.zza.zzaMi);
                return;
            }
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    zzqf.zzc(fileInputStream0, byteArrayOutputStream0);
                    zza zzpx$zza0 = zza.zzs(byteArrayOutputStream0.toByteArray());
                    zzcn.this.zzd(zzpx$zza0);
                    zzcn.this.zzaMU.zzz(zzpx$zza0);
                    goto label_37;
                }
                catch(IOException unused_ex) {
                }
                catch(IllegalArgumentException unused_ex) {
                    goto label_26;
                }
                zzcn.this.zzaMU.zza(com.google.android.gms.tagmanager.zzbf.zza.zzaMj);
                zzbg.zzaC("Failed to read the resource from disk");
            }
            catch(Throwable throwable0) {
                goto label_33;
            }
            try {
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
                zzbg.zzaC("Error closing stream for reading resource from disk");
            }
            zzbg.zzaB("The Disk resource was successfully read.");
            return;
            try {
            label_26:
                zzcn.this.zzaMU.zza(com.google.android.gms.tagmanager.zzbf.zza.zzaMj);
                zzbg.zzaC("Failed to read the resource from disk. The resource is inconsistent");
            }
            catch(Throwable throwable0) {
                goto label_33;
            }
            try {
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
                zzbg.zzaC("Error closing stream for reading resource from disk");
            }
            zzbg.zzaB("The Disk resource was successfully read.");
            return;
            try {
            label_33:
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
                zzbg.zzaC("Error closing stream for reading resource from disk");
            }
            throw throwable0;
            try {
            label_37:
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
                zzbg.zzaC("Error closing stream for reading resource from disk");
            }
            zzbg.zzaB("The Disk resource was successfully read.");
        };
        this.zzaNb.execute(zzcn$10);

        class com.google.android.gms.tagmanager.zzcn.1 implements Runnable {
            @Override
            public void run() {
                zzcn.this.zzzn();
            }
        }

    }

    // 检测为 lambda 实现。
    void zzzn() {
        FileInputStream fileInputStream0;
        if(this.zzaMU == null) {
            throw new IllegalStateException("Callback must be set before execute");
        }
        this.zzaMU.zzyv();
        zzbg.zzaB("Attempting to load resource from disk");
        if(zzcb.zzzf().zzzg() == com.google.android.gms.tagmanager.zzcb.zza.zzaMJ || zzcb.zzzf().zzzg() == com.google.android.gms.tagmanager.zzcb.zza.zzaMK) {
            String s = zzcb.zzzf().getContainerId();
            if(this.zzaKy.equals(s)) {
                this.zzaMU.zza(com.google.android.gms.tagmanager.zzbf.zza.zzaMi);
                return;
            }
        }
        try {
            fileInputStream0 = new FileInputStream(this.zzzo());
        }
        catch(FileNotFoundException unused_ex) {
            zzbg.zzay("Failed to find the resource in the disk");
            this.zzaMU.zza(com.google.android.gms.tagmanager.zzbf.zza.zzaMi);
            return;
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                zzqf.zzc(fileInputStream0, byteArrayOutputStream0);
                zza zzpx$zza0 = zza.zzs(byteArrayOutputStream0.toByteArray());
                this.zzd(zzpx$zza0);
                this.zzaMU.zzz(zzpx$zza0);
                goto label_37;
            }
            catch(IOException unused_ex) {
            }
            catch(IllegalArgumentException unused_ex) {
                goto label_26;
            }
            this.zzaMU.zza(com.google.android.gms.tagmanager.zzbf.zza.zzaMj);
            zzbg.zzaC("Failed to read the resource from disk");
        }
        catch(Throwable throwable0) {
            goto label_33;
        }
        try {
            fileInputStream0.close();
        }
        catch(IOException unused_ex) {
            zzbg.zzaC("Error closing stream for reading resource from disk");
        }
        zzbg.zzaB("The Disk resource was successfully read.");
        return;
        try {
        label_26:
            this.zzaMU.zza(com.google.android.gms.tagmanager.zzbf.zza.zzaMj);
            zzbg.zzaC("Failed to read the resource from disk. The resource is inconsistent");
        }
        catch(Throwable throwable0) {
            goto label_33;
        }
        try {
            fileInputStream0.close();
        }
        catch(IOException unused_ex) {
            zzbg.zzaC("Error closing stream for reading resource from disk");
        }
        zzbg.zzaB("The Disk resource was successfully read.");
        return;
        try {
        label_33:
            fileInputStream0.close();
        }
        catch(IOException unused_ex) {
            zzbg.zzaC("Error closing stream for reading resource from disk");
        }
        throw throwable0;
        try {
        label_37:
            fileInputStream0.close();
        }
        catch(IOException unused_ex) {
            zzbg.zzaC("Error closing stream for reading resource from disk");
        }
        zzbg.zzaB("The Disk resource was successfully read.");
    }

    File zzzo() {
        return new File(this.mContext.getDir("google_tagmanager", 0), "resource_" + this.zzaKy);
    }
}

