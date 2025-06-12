package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions implements SafeParcelable {
    public static final zza CREATOR;
    private final int zzCY;
    private Boolean zzaBI;
    private Boolean zzaBJ;
    private int zzaBK;
    private CameraPosition zzaBL;
    private Boolean zzaBM;
    private Boolean zzaBN;
    private Boolean zzaBO;
    private Boolean zzaBP;
    private Boolean zzaBQ;
    private Boolean zzaBR;
    private Boolean zzaBS;
    private Boolean zzaBT;

    static {
        GoogleMapOptions.CREATOR = new zza();
    }

    public GoogleMapOptions() {
        this.zzaBK = -1;
        this.zzCY = 1;
    }

    GoogleMapOptions(int versionCode, byte zOrderOnTop, byte useViewLifecycleInFragment, int mapType, CameraPosition camera, byte zoomControlsEnabled, byte compassEnabled, byte scrollGesturesEnabled, byte zoomGesturesEnabled, byte tiltGesturesEnabled, byte rotateGesturesEnabled, byte liteMode, byte mapToolbarEnabled) {
        this.zzaBK = -1;
        this.zzCY = versionCode;
        this.zzaBI = com.google.android.gms.maps.internal.zza.zza(zOrderOnTop);
        this.zzaBJ = com.google.android.gms.maps.internal.zza.zza(useViewLifecycleInFragment);
        this.zzaBK = mapType;
        this.zzaBL = camera;
        this.zzaBM = com.google.android.gms.maps.internal.zza.zza(zoomControlsEnabled);
        this.zzaBN = com.google.android.gms.maps.internal.zza.zza(compassEnabled);
        this.zzaBO = com.google.android.gms.maps.internal.zza.zza(scrollGesturesEnabled);
        this.zzaBP = com.google.android.gms.maps.internal.zza.zza(zoomGesturesEnabled);
        this.zzaBQ = com.google.android.gms.maps.internal.zza.zza(tiltGesturesEnabled);
        this.zzaBR = com.google.android.gms.maps.internal.zza.zza(rotateGesturesEnabled);
        this.zzaBS = com.google.android.gms.maps.internal.zza.zza(liteMode);
        this.zzaBT = com.google.android.gms.maps.internal.zza.zza(mapToolbarEnabled);
    }

    public GoogleMapOptions camera(CameraPosition camera) {
        this.zzaBL = camera;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean enabled) {
        this.zzaBN = Boolean.valueOf(enabled);
        return this;
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attrs) {
        if(attrs == null) {
            return null;
        }
        TypedArray typedArray0 = context.getResources().obtainAttributes(attrs, styleable.MapAttrs);
        GoogleMapOptions googleMapOptions0 = new GoogleMapOptions();
        if(typedArray0.hasValue(styleable.MapAttrs_mapType)) {
            googleMapOptions0.mapType(typedArray0.getInt(styleable.MapAttrs_mapType, -1));
        }
        if(typedArray0.hasValue(styleable.MapAttrs_zOrderOnTop)) {
            googleMapOptions0.zOrderOnTop(typedArray0.getBoolean(styleable.MapAttrs_zOrderOnTop, false));
        }
        if(typedArray0.hasValue(styleable.MapAttrs_useViewLifecycle)) {
            googleMapOptions0.useViewLifecycleInFragment(typedArray0.getBoolean(styleable.MapAttrs_useViewLifecycle, false));
        }
        if(typedArray0.hasValue(styleable.MapAttrs_uiCompass)) {
            googleMapOptions0.compassEnabled(typedArray0.getBoolean(styleable.MapAttrs_uiCompass, true));
        }
        if(typedArray0.hasValue(styleable.MapAttrs_uiRotateGestures)) {
            googleMapOptions0.rotateGesturesEnabled(typedArray0.getBoolean(styleable.MapAttrs_uiRotateGestures, true));
        }
        if(typedArray0.hasValue(styleable.MapAttrs_uiScrollGestures)) {
            googleMapOptions0.scrollGesturesEnabled(typedArray0.getBoolean(styleable.MapAttrs_uiScrollGestures, true));
        }
        if(typedArray0.hasValue(styleable.MapAttrs_uiTiltGestures)) {
            googleMapOptions0.tiltGesturesEnabled(typedArray0.getBoolean(styleable.MapAttrs_uiTiltGestures, true));
        }
        if(typedArray0.hasValue(styleable.MapAttrs_uiZoomGestures)) {
            googleMapOptions0.zoomGesturesEnabled(typedArray0.getBoolean(styleable.MapAttrs_uiZoomGestures, true));
        }
        if(typedArray0.hasValue(styleable.MapAttrs_uiZoomControls)) {
            googleMapOptions0.zoomControlsEnabled(typedArray0.getBoolean(styleable.MapAttrs_uiZoomControls, true));
        }
        if(typedArray0.hasValue(styleable.MapAttrs_liteMode)) {
            googleMapOptions0.liteMode(typedArray0.getBoolean(styleable.MapAttrs_liteMode, false));
        }
        if(typedArray0.hasValue(styleable.MapAttrs_uiMapToolbar)) {
            googleMapOptions0.mapToolbarEnabled(typedArray0.getBoolean(styleable.MapAttrs_uiMapToolbar, true));
        }
        googleMapOptions0.camera(CameraPosition.createFromAttributes(context, attrs));
        typedArray0.recycle();
        return googleMapOptions0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CameraPosition getCamera() {
        return this.zzaBL;
    }

    public Boolean getCompassEnabled() {
        return this.zzaBN;
    }

    public Boolean getLiteMode() {
        return this.zzaBS;
    }

    public Boolean getMapToolbarEnabled() {
        return this.zzaBT;
    }

    public int getMapType() {
        return this.zzaBK;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.zzaBR;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.zzaBO;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.zzaBQ;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzaBJ;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    public Boolean getZOrderOnTop() {
        return this.zzaBI;
    }

    public Boolean getZoomControlsEnabled() {
        return this.zzaBM;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzaBP;
    }

    public GoogleMapOptions liteMode(boolean enabled) {
        this.zzaBS = Boolean.valueOf(enabled);
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean enabled) {
        this.zzaBT = Boolean.valueOf(enabled);
        return this;
    }

    public GoogleMapOptions mapType(int mapType) {
        this.zzaBK = mapType;
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean enabled) {
        this.zzaBR = Boolean.valueOf(enabled);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean enabled) {
        this.zzaBO = Boolean.valueOf(enabled);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean enabled) {
        this.zzaBQ = Boolean.valueOf(enabled);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean useViewLifecycleInFragment) {
        this.zzaBJ = Boolean.valueOf(useViewLifecycleInFragment);
        return this;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zza.zza(this, out, flags);
    }

    public GoogleMapOptions zOrderOnTop(boolean zOrderOnTop) {
        this.zzaBI = Boolean.valueOf(zOrderOnTop);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean enabled) {
        this.zzaBM = Boolean.valueOf(enabled);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean enabled) {
        this.zzaBP = Boolean.valueOf(enabled);
        return this;
    }

    byte zzvj() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBI);
    }

    byte zzvk() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBJ);
    }

    byte zzvl() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBM);
    }

    byte zzvm() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBN);
    }

    byte zzvn() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBO);
    }

    byte zzvo() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBP);
    }

    byte zzvp() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBQ);
    }

    byte zzvq() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBR);
    }

    byte zzvr() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBS);
    }

    byte zzvs() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBT);
    }
}

