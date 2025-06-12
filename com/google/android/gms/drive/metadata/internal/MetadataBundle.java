package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.internal.zzx;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.zzlo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class MetadataBundle implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final Bundle zzagI;

    static {
        MetadataBundle.CREATOR = new zzh();
    }

    MetadataBundle(int versionCode, Bundle valueBundle) {
        this.zzCY = versionCode;
        this.zzagI = (Bundle)zzu.zzu(valueBundle);
        ClassLoader classLoader0 = this.getClass().getClassLoader();
        this.zzagI.setClassLoader(classLoader0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.zzagI.keySet()) {
            String s = (String)object0;
            if(zze.zzcw(s) == null) {
                arrayList0.add(s);
                zzx.zzu("MetadataBundle", "Ignored unknown metadata field in bundle: " + s);
            }
        }
        for(Object object1: arrayList0) {
            this.zzagI.remove(((String)object1));
        }
    }

    private MetadataBundle(Bundle valueBundle) {
        this(1, valueBundle);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof MetadataBundle)) {
            return false;
        }
        Set set0 = this.zzagI.keySet();
        if(!set0.equals(((MetadataBundle)obj).zzagI.keySet())) {
            return false;
        }
        for(Object object1: set0) {
            if(!zzt.equal(this.zzagI.get(((String)object1)), ((MetadataBundle)obj).zzagI.get(((String)object1)))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int v = 1;
        for(Object object0: this.zzagI.keySet()) {
            v = this.zzagI.get(((String)object0)).hashCode() + v * 0x1F;
        }
        return v;
    }

    public void setContext(Context context) {
        BitmapTeleporter bitmapTeleporter0 = (BitmapTeleporter)this.zza(zzlo.zzaho);
        if(bitmapTeleporter0 != null) {
            bitmapTeleporter0.zzc(context.getCacheDir());
        }
    }

    @Override
    public String toString() {
        return "MetadataBundle [values=" + this.zzagI + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzh.zza(this, dest, flags);
    }

    public static MetadataBundle zza(MetadataField metadataField0, Object object0) {
        MetadataBundle metadataBundle0 = MetadataBundle.zzpX();
        metadataBundle0.zzb(metadataField0, object0);
        return metadataBundle0;
    }

    public static MetadataBundle zza(MetadataBundle metadataBundle0) {
        return new MetadataBundle(new Bundle(metadataBundle0.zzagI));
    }

    public Object zza(MetadataField metadataField0) {
        return metadataField0.zzi(this.zzagI);
    }

    public void zzb(MetadataField metadataField0, Object object0) {
        if(zze.zzcw(metadataField0.getName()) == null) {
            throw new IllegalArgumentException("Unregistered field: " + metadataField0.getName());
        }
        metadataField0.zza(object0, this.zzagI);
    }

    public boolean zzc(MetadataField metadataField0) {
        String s = metadataField0.getName();
        return this.zzagI.containsKey(s);
    }

    public static MetadataBundle zzpX() {
        return new MetadataBundle(new Bundle());
    }

    public Set zzpY() {
        Set set0 = new HashSet();
        for(Object object0: this.zzagI.keySet()) {
            set0.add(zze.zzcw(((String)object0)));
        }
        return set0;
    }
}

