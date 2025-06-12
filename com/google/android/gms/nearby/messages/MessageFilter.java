package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MessageFilter implements SafeParcelable {
    public static final class zza {
        private final List zzaFP;

        public zza() {
            this.zzaFP = new ArrayList();
        }

        private zza zzC(String s, String s1) {
            MessageType messageType0 = new MessageType(s, s1);
            this.zzaFP.add(messageType0);
            return this;
        }

        public zza zzwX() {
            return this.zzC("", "");
        }

        public MessageFilter zzwY() {
            zzu.zza(!this.zzaFP.isEmpty(), "At least one of the include methods must be called.");
            return new MessageFilter(this.zzaFP, null);
        }
    }

    public static final Parcelable.Creator CREATOR;
    final int versionCode;
    public static final MessageFilter zzaFO;
    private final List zzaFP;

    static {
        MessageFilter.CREATOR = new zzb();
        MessageFilter.zzaFO = new zza().zzwX().zzwY();
    }

    MessageFilter(int versionCode, List list0) {
        this.versionCode = versionCode;
        this.zzaFP = Collections.unmodifiableList(((List)zzu.zzu(list0)));
    }

    private MessageFilter(List list0) {
        this(1, list0);
    }

    MessageFilter(List x0, com.google.android.gms.nearby.messages.MessageFilter.1 x1) {
        this(x0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        return o instanceof MessageFilter ? zzt.equal(this.zzaFP, ((MessageFilter)o).zzaFP) : false;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzaFP});
    }

    @Override
    public String toString() {
        return "MessageFilter" + this.zzaFP;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzb.zza(this, dest, flags);
    }

    List zzwW() {
        return this.zzaFP;
    }

    class com.google.android.gms.nearby.messages.MessageFilter.1 {
    }

}

