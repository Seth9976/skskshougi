package com.google.android.gms.common.data;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class BitmapTeleporter implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    ParcelFileDescriptor zzCZ;
    final int zzSq;
    private Bitmap zzYm;
    private boolean zzYn;
    private File zzYo;

    static {
        BitmapTeleporter.CREATOR = new zza();
    }

    BitmapTeleporter(int versionCode, ParcelFileDescriptor parcelFileDescriptor, int type) {
        this.zzCY = versionCode;
        this.zzCZ = parcelFileDescriptor;
        this.zzSq = type;
        this.zzYm = null;
        this.zzYn = false;
    }

    public BitmapTeleporter(Bitmap teleportee) {
        this.zzCY = 1;
        this.zzCZ = null;
        this.zzSq = 0;
        this.zzYm = teleportee;
        this.zzYn = true;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void release() {
        if(!this.zzYn) {
            try {
                this.zzCZ.close();
            }
            catch(IOException iOException0) {
                Log.w("BitmapTeleporter", "Could not close PFD", iOException0);
            }
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        if(this.zzCZ == null) {
            Bitmap bitmap0 = this.zzYm;
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(bitmap0.getRowBytes() * bitmap0.getHeight());
            bitmap0.copyPixelsToBuffer(byteBuffer0);
            byte[] arr_b = byteBuffer0.array();
            DataOutputStream dataOutputStream0 = new DataOutputStream(this.zznd());
            try {
                dataOutputStream0.writeInt(arr_b.length);
                dataOutputStream0.writeInt(bitmap0.getWidth());
                dataOutputStream0.writeInt(bitmap0.getHeight());
                dataOutputStream0.writeUTF(bitmap0.getConfig().toString());
                dataOutputStream0.write(arr_b);
            }
            catch(IOException iOException0) {
                throw new IllegalStateException("Could not write into unlinked file", iOException0);
            }
            finally {
                this.zza(dataOutputStream0);
            }
        }
        zza.zza(this, dest, flags | 1);
        this.zzCZ = null;
    }

    private void zza(Closeable closeable0) {
        try {
            closeable0.close();
        }
        catch(IOException iOException0) {
            Log.w("BitmapTeleporter", "Could not close stream", iOException0);
        }
    }

    public void zzc(File file0) {
        if(file0 == null) {
            throw new NullPointerException("Cannot set null temp directory");
        }
        this.zzYo = file0;
    }

    public Bitmap zznc() {
        Bitmap.Config bitmap$Config0;
        int v2;
        int v1;
        byte[] arr_b;
        if(!this.zzYn) {
            DataInputStream dataInputStream0 = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zzCZ));
            try {
                arr_b = new byte[dataInputStream0.readInt()];
                v1 = dataInputStream0.readInt();
                v2 = dataInputStream0.readInt();
                bitmap$Config0 = Bitmap.Config.valueOf(dataInputStream0.readUTF());
                dataInputStream0.read(arr_b);
            }
            catch(IOException iOException0) {
                throw new IllegalStateException("Could not read from parcel file descriptor", iOException0);
            }
            finally {
                this.zza(dataInputStream0);
            }
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            Bitmap bitmap0 = Bitmap.createBitmap(v1, v2, bitmap$Config0);
            bitmap0.copyPixelsFromBuffer(byteBuffer0);
            this.zzYm = bitmap0;
            this.zzYn = true;
        }
        return this.zzYm;
    }

    private FileOutputStream zznd() {
        FileOutputStream fileOutputStream0;
        File file0;
        if(this.zzYo == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            file0 = File.createTempFile("teleporter", ".tmp", this.zzYo);
        }
        catch(IOException iOException0) {
            throw new IllegalStateException("Could not create temporary file", iOException0);
        }
        try {
            fileOutputStream0 = new FileOutputStream(file0);
            this.zzCZ = ParcelFileDescriptor.open(file0, 0x10000000);
        }
        catch(FileNotFoundException unused_ex) {
            throw new IllegalStateException("Temporary file is somehow already deleted");
        }
        file0.delete();
        return fileOutputStream0;
    }
}

