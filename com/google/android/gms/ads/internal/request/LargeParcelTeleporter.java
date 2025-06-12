package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzlg;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class LargeParcelTeleporter implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    ParcelFileDescriptor zzCZ;
    private Parcelable zzDa;
    private boolean zzDb;

    static {
        LargeParcelTeleporter.CREATOR = new zzk();
    }

    LargeParcelTeleporter(int versionCode, ParcelFileDescriptor parcelFileDescriptor) {
        this.zzCY = versionCode;
        this.zzCZ = parcelFileDescriptor;
        this.zzDa = null;
        this.zzDb = true;
    }

    public LargeParcelTeleporter(SafeParcelable teleportee) {
        this.zzCY = 1;
        this.zzCZ = null;
        this.zzDa = teleportee;
        this.zzDb = false;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        byte[] arr_b;
        if(this.zzCZ == null) {
            Parcel parcel1 = Parcel.obtain();
            try {
                this.zzDa.writeToParcel(parcel1, 0);
                arr_b = parcel1.marshall();
            }
            finally {
                parcel1.recycle();
            }
            this.zzCZ = this.zzf(arr_b);
        }
        zzk.zza(this, dest, flags);
    }

    public SafeParcelable zza(Parcelable.Creator parcelable$Creator0) {
        byte[] arr_b;
        if(this.zzDb) {
            if(this.zzCZ == null) {
                zzb.zzaz("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream0 = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zzCZ));
            try {
                arr_b = new byte[dataInputStream0.readInt()];
                dataInputStream0.readFully(arr_b, 0, arr_b.length);
            }
            catch(IOException iOException0) {
                throw new IllegalStateException("Could not read from parcel file descriptor", iOException0);
            }
            finally {
                zzlg.zzb(dataInputStream0);
            }
            Parcel parcel0 = Parcel.obtain();
            try {
                parcel0.unmarshall(arr_b, 0, arr_b.length);
                parcel0.setDataPosition(0);
                this.zzDa = (SafeParcelable)parcelable$Creator0.createFromParcel(parcel0);
            }
            finally {
                parcel0.recycle();
            }
            this.zzDb = false;
        }
        return (SafeParcelable)this.zzDa;
    }

    protected ParcelFileDescriptor zzf(byte[] arr_b) {
        try {
            ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    DataOutputStream dataOutputStream0 = new DataOutputStream(new ParcelFileDescriptor.AutoCloseOutputStream(arr_parcelFileDescriptor[1]));
                    try {
                        dataOutputStream0.writeInt(arr_b.length);
                        dataOutputStream0.write(arr_b);
                    }
                    catch(IOException iOException0) {
                        zzb.zzb("Error transporting the ad response", iOException0);
                        zzo.zzby().zzc(iOException0, true);
                    }
                    finally {
                        zzlg.zzb(dataOutputStream0);
                    }
                }
            }).start();
            return arr_parcelFileDescriptor[0];
        }
        catch(IOException iOException0) {
            zzb.zzb("Error transporting the ad response", iOException0);
            zzo.zzby().zzc(iOException0, true);
            return null;
        }
    }
}

