package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolylineOptions implements SafeParcelable {
    public static final zzh CREATOR;
    private int mColor;
    private final int zzCY;
    private final List zzaDA;
    private boolean zzaDC;
    private float zzaDa;
    private boolean zzaDb;
    private float zzaDf;

    static {
        PolylineOptions.CREATOR = new zzh();
    }

    public PolylineOptions() {
        this.zzaDf = 10.0f;
        this.mColor = 0xFF000000;
        this.zzaDa = 0.0f;
        this.zzaDb = true;
        this.zzaDC = false;
        this.zzCY = 1;
        this.zzaDA = new ArrayList();
    }

    PolylineOptions(int versionCode, List points, float width, int color, float zIndex, boolean visible, boolean geodesic) {
        this.zzCY = versionCode;
        this.zzaDA = points;
        this.zzaDf = width;
        this.mColor = color;
        this.zzaDa = zIndex;
        this.zzaDb = visible;
        this.zzaDC = geodesic;
    }

    public PolylineOptions add(LatLng point) {
        this.zzaDA.add(point);
        return this;
    }

    public PolylineOptions add(LatLng[] points) {
        List list0 = Arrays.asList(points);
        this.zzaDA.addAll(list0);
        return this;
    }

    public PolylineOptions addAll(Iterable iterable0) {
        for(Object object0: iterable0) {
            this.zzaDA.add(((LatLng)object0));
        }
        return this;
    }

    public PolylineOptions color(int color) {
        this.mColor = color;
        return this;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PolylineOptions geodesic(boolean geodesic) {
        this.zzaDC = geodesic;
        return this;
    }

    public int getColor() {
        return this.mColor;
    }

    public List getPoints() {
        return this.zzaDA;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    public float getWidth() {
        return this.zzaDf;
    }

    public float getZIndex() {
        return this.zzaDa;
    }

    public boolean isGeodesic() {
        return this.zzaDC;
    }

    public boolean isVisible() {
        return this.zzaDb;
    }

    public PolylineOptions visible(boolean visible) {
        this.zzaDb = visible;
        return this;
    }

    public PolylineOptions width(float width) {
        this.zzaDf = width;
        return this;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzh.zza(this, out, flags);
    }

    public PolylineOptions zIndex(float zIndex) {
        this.zzaDa = zIndex;
        return this;
    }
}

