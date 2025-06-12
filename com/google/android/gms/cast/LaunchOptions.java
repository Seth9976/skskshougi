package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Locale;

public class LaunchOptions implements SafeParcelable {
    public static final class Builder {
        private LaunchOptions zzRB;

        public Builder() {
            this.zzRB = new LaunchOptions();
        }

        public LaunchOptions build() {
            return this.zzRB;
        }

        public Builder setLocale(Locale locale) {
            this.zzRB.setLanguage(zzf.zzb(locale));
            return this;
        }

        public Builder setRelaunchIfRunning(boolean relaunchIfRunning) {
            this.zzRB.setRelaunchIfRunning(relaunchIfRunning);
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private String zzRA;
    private boolean zzRz;

    static {
        LaunchOptions.CREATOR = new zzc();
    }

    public LaunchOptions() {
        this(1, false, zzf.zzb(Locale.getDefault()));
    }

    LaunchOptions(int versionCode, boolean relaunchIfRunning, String language) {
        this.zzCY = versionCode;
        this.zzRz = relaunchIfRunning;
        this.zzRA = language;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        return obj instanceof LaunchOptions ? this.zzRz == ((LaunchOptions)obj).zzRz && zzf.zza(this.zzRA, ((LaunchOptions)obj).zzRA) : false;
    }

    public String getLanguage() {
        return this.zzRA;
    }

    public boolean getRelaunchIfRunning() {
        return this.zzRz;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{Boolean.valueOf(this.zzRz), this.zzRA});
    }

    public void setLanguage(String language) {
        this.zzRA = language;
    }

    public void setRelaunchIfRunning(boolean relaunchIfRunning) {
        this.zzRz = relaunchIfRunning;
    }

    @Override
    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", Boolean.valueOf(this.zzRz), this.zzRA);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzc.zza(this, out, flags);
    }
}

