package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

public class Message implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final byte[] content;
    private final String type;
    final int versionCode;
    private final String zzaby;

    static {
        Message.CREATOR = new zza();
    }

    Message(int versionCode, byte[] content, String namespace, String type) {
        zzu.zzb(content.length <= 0x19000, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", new Object[]{((int)content.length), 0x19000});
        this.versionCode = versionCode;
        this.content = (byte[])zzu.zzu(content);
        this.type = (String)zzu.zzu(type);
        if(namespace == null) {
            namespace = "";
        }
        this.zzaby = namespace;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getNamespace() {
        return this.zzaby;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Message{type=\'" + this.type + "\'" + ", namespace=\'" + this.zzaby + "\'" + ", content=[" + this.content.length + " bytes]" + "}";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zza.zza(this, out, flags);
    }

    public byte[] zzwV() {
        return this.content;
    }
}

