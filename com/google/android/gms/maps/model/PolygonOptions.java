package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolygonOptions implements SafeParcelable {
    public static final zzg CREATOR;
    private final int zzCY;
    private float zzaCX;
    private int zzaCY;
    private int zzaCZ;
    private final List zzaDA;
    private final List zzaDB;
    private boolean zzaDC;
    private float zzaDa;
    private boolean zzaDb;

    static {
        PolygonOptions.CREATOR = new zzg();
    }

    public PolygonOptions() {
        this.zzaCX = 10.0f;
        this.zzaCY = 0xFF000000;
        this.zzaCZ = 0;
        this.zzaDa = 0.0f;
        this.zzaDb = true;
        this.zzaDC = false;
        this.zzCY = 1;
        this.zzaDA = new ArrayList();
        this.zzaDB = new ArrayList();
    }

    PolygonOptions(int versionCode, List list0, List holes, float strokeWidth, int strokeColor, int fillColor, float zIndex, boolean visible, boolean geodesic) {
        this.zzCY = versionCode;
        this.zzaDA = list0;
        this.zzaDB = holes;
        this.zzaCX = strokeWidth;
        this.zzaCY = strokeColor;
        this.zzaCZ = fillColor;
        this.zzaDa = zIndex;
        this.zzaDb = visible;
        this.zzaDC = geodesic;
    }

    public PolygonOptions add(LatLng point) {
        this.zzaDA.add(point);
        return this;
    }

    public PolygonOptions add(LatLng[] points) {
        List list0 = Arrays.asList(points);
        this.zzaDA.addAll(list0);
        return this;
    }

    public PolygonOptions addAll(Iterable iterable0) {
        for(Object object0: iterable0) {
            this.zzaDA.add(((LatLng)object0));
        }
        return this;
    }

    public PolygonOptions addHole(Iterable iterable0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            arrayList0.add(((LatLng)object0));
        }
        this.zzaDB.add(arrayList0);
        return this;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PolygonOptions fillColor(int color) {
        this.zzaCZ = color;
        return this;
    }

    public PolygonOptions geodesic(boolean geodesic) {
        this.zzaDC = geodesic;
        return this;
    }

    public int getFillColor() {
        return this.zzaCZ;
    }

    public List getHoles() {
        return this.zzaDB;
    }

    public List getPoints() {
        return this.zzaDA;
    }

    public int getStrokeColor() {
        return this.zzaCY;
    }

    public float getStrokeWidth() {
        return this.zzaCX;
    }

    int getVersionCode() {
        return this.zzCY;
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

    public PolygonOptions strokeColor(int color) {
        this.zzaCY = color;
        return this;
    }

    public PolygonOptions strokeWidth(float width) {
        this.zzaCX = width;
        return this;
    }

    public PolygonOptions visible(boolean visible) {
        this.zzaDb = visible;
        return this;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzg.zza(this, out, flags);
    }

    public PolygonOptions zIndex(float zIndex) {
        this.zzaDa = zIndex;
        return this;
    }

    List zzvK() {
        return this.zzaDB;
    }
}

