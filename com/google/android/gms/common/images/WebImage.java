package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

public final class WebImage implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final Uri zzZn;
    private final int zznM;
    private final int zznN;

    static {
        WebImage.CREATOR = new zzb();
    }

    WebImage(int versionCode, Uri url, int width, int height) {
        this.zzCY = versionCode;
        this.zzZn = url;
        this.zznM = width;
        this.zznN = height;
    }

    public WebImage(Uri url) throws IllegalArgumentException {
        this(url, 0, 0);
    }

    public WebImage(Uri url, int width, int height) throws IllegalArgumentException {
        this(1, url, width, height);
        if(url == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if(width < 0 || height < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public WebImage(JSONObject json) throws IllegalArgumentException {
        this(WebImage.zzi(json), json.optInt("width", 0), json.optInt("height", 0));
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }
        return other != null && other instanceof WebImage ? zzt.equal(this.zzZn, ((WebImage)other).zzZn) && this.zznM == ((WebImage)other).zznM && this.zznN == ((WebImage)other).zznN : false;
    }

    public int getHeight() {
        return this.zznN;
    }

    public Uri getUrl() {
        return this.zzZn;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    public int getWidth() {
        return this.zznM;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzZn, this.zznM, this.zznN});
    }

    public JSONObject toJson() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("url", this.zzZn.toString());
            jSONObject0.put("width", this.zznM);
            jSONObject0.put("height", this.zznN);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }

    @Override
    public String toString() {
        return String.format("Image %dx%d %s", this.zznM, this.zznN, this.zzZn.toString());
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzb.zza(this, out, flags);
    }

    private static Uri zzi(JSONObject jSONObject0) {
        if(jSONObject0.has("url")) {
            try {
                return Uri.parse(jSONObject0.getString("url"));
            }
            catch(JSONException unused_ex) {
                return null;
            }
        }
        return null;
    }
}

