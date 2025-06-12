package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomPropertyKey implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = null;
    public static final int PRIVATE = 1;
    public static final int PUBLIC;
    final int mVisibility;
    final int zzCY;
    private static final Pattern zzagC;
    final String zztw;

    static {
        CustomPropertyKey.CREATOR = new zzc();
        CustomPropertyKey.zzagC = Pattern.compile("[\\w.!@$%^&*()/-]+");
    }

    CustomPropertyKey(int versionCode, String key, int visibility) {
        boolean z = true;
        super();
        zzu.zzb(key, "key");
        zzu.zzb(CustomPropertyKey.zzagC.matcher(key).matches(), "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
        if(visibility != 0 && visibility != 1) {
            z = false;
        }
        zzu.zzb(z, "visibility must be either PUBLIC or PRIVATE");
        this.zzCY = versionCode;
        this.zztw = key;
        this.mVisibility = visibility;
    }

    public CustomPropertyKey(String key, int visibility) {
        this(1, key, visibility);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        return obj == this ? true : obj instanceof CustomPropertyKey && (((CustomPropertyKey)obj).getKey().equals(this.zztw) && ((CustomPropertyKey)obj).getVisibility() == this.mVisibility);
    }

    public static CustomPropertyKey fromJson(JSONObject jsonObject) throws JSONException {
        return new CustomPropertyKey(jsonObject.getString("key"), jsonObject.getInt("visibility"));
    }

    public String getKey() {
        return this.zztw;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    @Override
    public int hashCode() {
        return (this.zztw + this.mVisibility).hashCode();
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("key", this.getKey());
        jSONObject0.put("visibility", this.getVisibility());
        return jSONObject0;
    }

    @Override
    public String toString() {
        return "CustomPropertyKey(" + this.zztw + "," + this.mVisibility + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzc.zza(this, dest, flags);
    }
}

