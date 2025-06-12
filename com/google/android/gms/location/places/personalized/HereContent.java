package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.List;

public class HereContent implements SafeParcelable {
    public static final class Action implements SafeParcelable {
        public static final zza CREATOR;
        final int zzCY;
        private final String zzNb;
        private final String zzadv;

        static {
            Action.CREATOR = new zza();
        }

        Action(int versionCode, String title, String uri) {
            this.zzCY = versionCode;
            this.zzadv = title;
            this.zzNb = uri;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override
        public boolean equals(Object object) {
            if(this == object) {
                return true;
            }
            return object instanceof Action ? zzt.equal(this.zzadv, ((Action)object).zzadv) && zzt.equal(this.zzNb, ((Action)object).zzNb) : false;
        }

        public String getTitle() {
            return this.zzadv;
        }

        public String getUri() {
            return this.zzNb;
        }

        @Override
        public int hashCode() {
            return zzt.hashCode(new Object[]{this.zzadv, this.zzNb});
        }

        @Override
        public String toString() {
            return zzt.zzt(this).zzg("title", this.zzadv).zzg("uri", this.zzNb).toString();
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zza.zza(this, parcel, flags);
        }
    }

    public static final zzb CREATOR;
    final int zzCY;
    private final String zzaBe;
    private final List zzaBf;

    static {
        HereContent.CREATOR = new zzb();
    }

    HereContent(int versionCode, String data, List list0) {
        this.zzCY = versionCode;
        this.zzaBe = data;
        this.zzaBf = list0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        return object instanceof HereContent ? zzt.equal(this.zzaBe, ((HereContent)object).zzaBe) && zzt.equal(this.zzaBf, ((HereContent)object).zzaBf) : false;
    }

    public List getActions() {
        return this.zzaBf;
    }

    public String getData() {
        return this.zzaBe;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzaBe, this.zzaBf});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("data", this.zzaBe).zzg("actions", this.zzaBf).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzb.zza(this, parcel, flags);
    }
}

