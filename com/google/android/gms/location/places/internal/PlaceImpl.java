package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class PlaceImpl implements SafeParcelable, Place {
    public static class zza {
        private String mName;
        private int zzCY;
        private String zzKI;
        private long zzaAA;
        private String zzaAC;
        private List zzaAD;
        private boolean zzaAE;
        private Bundle zzaAI;
        private List zzaAJ;
        private float zzaAu;
        private LatLngBounds zzaAv;
        private String zzaAw;
        private boolean zzaAx;
        private float zzaAy;
        private int zzaAz;
        private String zzajO;
        private LatLng zzazn;
        private String zzazp;
        private Uri zzazq;

        public zza() {
            this.zzCY = 0;
        }

        public zza zza(LatLng latLng0) {
            this.zzazn = latLng0;
            return this;
        }

        public zza zza(LatLngBounds latLngBounds0) {
            this.zzaAv = latLngBounds0;
            return this;
        }

        public zza zzad(boolean z) {
            this.zzaAx = z;
            return this;
        }

        public zza zzae(boolean z) {
            this.zzaAE = z;
            return this;
        }

        public zza zzdq(String s) {
            this.zzKI = s;
            return this;
        }

        public zza zzdr(String s) {
            this.mName = s;
            return this;
        }

        public zza zzds(String s) {
            this.zzajO = s;
            return this;
        }

        public zza zzdt(String s) {
            this.zzazp = s;
            return this;
        }

        public zza zzf(float f) {
            this.zzaAu = f;
            return this;
        }

        public zza zzg(float f) {
            this.zzaAy = f;
            return this;
        }

        public zza zzgX(int v) {
            this.zzaAz = v;
            return this;
        }

        public zza zzk(Uri uri0) {
            this.zzazq = uri0;
            return this;
        }

        public zza zzm(List list0) {
            this.zzaAJ = list0;
            return this;
        }

        public zza zzn(List list0) {
            this.zzaAD = list0;
            return this;
        }

        public PlaceImpl zzuX() {
            return new PlaceImpl(this.zzCY, this.zzKI, this.zzaAJ, Collections.emptyList(), this.zzaAI, this.mName, this.zzajO, this.zzazp, this.zzaAC, this.zzaAD, this.zzazn, this.zzaAu, this.zzaAv, this.zzaAw, this.zzazq, this.zzaAx, this.zzaAy, this.zzaAz, this.zzaAA, this.zzaAE, PlaceLocalization.zza(this.mName, this.zzajO, this.zzazp, this.zzaAC, this.zzaAD));
        }
    }

    public static final zzk CREATOR;
    private final String mName;
    final int zzCY;
    private final String zzKI;
    private final long zzaAA;
    private final List zzaAB;
    private final String zzaAC;
    private final List zzaAD;
    final boolean zzaAE;
    private final Map zzaAF;
    private final TimeZone zzaAG;
    private zzo zzaAH;
    private Locale zzaAm;
    private final Bundle zzaAs;
    @Deprecated
    private final PlaceLocalization zzaAt;
    private final float zzaAu;
    private final LatLngBounds zzaAv;
    private final String zzaAw;
    private final boolean zzaAx;
    private final float zzaAy;
    private final int zzaAz;
    private final String zzajO;
    private final LatLng zzazn;
    private final List zzazo;
    private final String zzazp;
    private final Uri zzazq;

    static {
        PlaceImpl.CREATOR = new zzk();
    }

    PlaceImpl(int versionCode, String id, List list0, List list1, Bundle addressComponents, String name, String address, String phoneNumber, String regularOpenHours, List list2, LatLng latlng, float levelNumber, LatLngBounds viewport, String timeZoneId, Uri websiteUri, boolean isPermanentlyClosed, float rating, int priceLevel, long timestampSecs, boolean isLoggingEnabled, PlaceLocalization localization) {
        this.zzCY = versionCode;
        this.zzKI = id;
        this.zzazo = Collections.unmodifiableList(list0);
        this.zzaAB = list1;
        if(addressComponents == null) {
            addressComponents = new Bundle();
        }
        this.zzaAs = addressComponents;
        this.mName = name;
        this.zzajO = address;
        this.zzazp = phoneNumber;
        this.zzaAC = regularOpenHours;
        if(list2 == null) {
            list2 = Collections.emptyList();
        }
        this.zzaAD = list2;
        this.zzazn = latlng;
        this.zzaAu = levelNumber;
        this.zzaAv = viewport;
        if(timeZoneId == null) {
            timeZoneId = "UTC";
        }
        this.zzaAw = timeZoneId;
        this.zzazq = websiteUri;
        this.zzaAx = isPermanentlyClosed;
        this.zzaAy = rating;
        this.zzaAz = priceLevel;
        this.zzaAA = timestampSecs;
        this.zzaAF = Collections.unmodifiableMap(new HashMap());
        this.zzaAG = null;
        this.zzaAm = null;
        this.zzaAE = isLoggingEnabled;
        this.zzaAt = localization;
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
        return object instanceof PlaceImpl ? this.zzKI.equals(((PlaceImpl)object).zzKI) && zzt.equal(this.zzaAm, ((PlaceImpl)object).zzaAm) && this.zzaAA == ((PlaceImpl)object).zzaAA : false;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.location.places.Place
    public CharSequence getAddress() {
        return this.getAddress();
    }

    public String getAddress() {
        this.zzdp("getAddress");
        return this.zzajO;
    }

    @Override  // com.google.android.gms.location.places.Place
    public String getId() {
        this.zzdp("getId");
        return this.zzKI;
    }

    @Override  // com.google.android.gms.location.places.Place
    public LatLng getLatLng() {
        this.zzdp("getLatLng");
        return this.zzazn;
    }

    @Override  // com.google.android.gms.location.places.Place
    public Locale getLocale() {
        this.zzdp("getLocale");
        return this.zzaAm;
    }

    @Override  // com.google.android.gms.location.places.Place
    public CharSequence getName() {
        return this.getName();
    }

    public String getName() {
        this.zzdp("getName");
        return this.mName;
    }

    @Override  // com.google.android.gms.location.places.Place
    public CharSequence getPhoneNumber() {
        return this.getPhoneNumber();
    }

    public String getPhoneNumber() {
        this.zzdp("getPhoneNumber");
        return this.zzazp;
    }

    @Override  // com.google.android.gms.location.places.Place
    public List getPlaceTypes() {
        this.zzdp("getPlaceTypes");
        return this.zzazo;
    }

    @Override  // com.google.android.gms.location.places.Place
    public int getPriceLevel() {
        this.zzdp("getPriceLevel");
        return this.zzaAz;
    }

    @Override  // com.google.android.gms.location.places.Place
    public float getRating() {
        this.zzdp("getRating");
        return this.zzaAy;
    }

    @Override  // com.google.android.gms.location.places.Place
    public LatLngBounds getViewport() {
        this.zzdp("getViewport");
        return this.zzaAv;
    }

    @Override  // com.google.android.gms.location.places.Place
    public Uri getWebsiteUri() {
        this.zzdp("getWebsiteUri");
        return this.zzazq;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzKI, this.zzaAm, this.zzaAA});
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public void setLocale(Locale locale) {
        this.zzaAm = locale;
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("id", this.zzKI).zzg("placeTypes", this.zzazo).zzg("locale", this.zzaAm).zzg("name", this.mName).zzg("address", this.zzajO).zzg("phoneNumber", this.zzazp).zzg("latlng", this.zzazn).zzg("viewport", this.zzaAv).zzg("websiteUri", this.zzazq).zzg("isPermanentlyClosed", Boolean.valueOf(this.zzaAx)).zzg("priceLevel", this.zzaAz).zzg("timestampSecs", this.zzaAA).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzk.zza(this, parcel, flags);
    }

    public void zza(zzo zzo0) {
        this.zzaAH = zzo0;
    }

    private void zzdp(String s) {
        if(this.zzaAE && this.zzaAH != null) {
            this.zzaAH.zzA(this.zzKI, s);
        }
    }

    public List zzuN() {
        this.zzdp("getTypesDeprecated");
        return this.zzaAB;
    }

    public float zzuO() {
        this.zzdp("getLevelNumber");
        return this.zzaAu;
    }

    public String zzuP() {
        this.zzdp("getRegularOpenHours");
        return this.zzaAC;
    }

    public List zzuQ() {
        this.zzdp("getAttributions");
        return this.zzaAD;
    }

    public boolean zzuR() {
        this.zzdp("isPermanentlyClosed");
        return this.zzaAx;
    }

    public long zzuS() {
        return this.zzaAA;
    }

    public Bundle zzuT() {
        return this.zzaAs;
    }

    public String zzuU() {
        return this.zzaAw;
    }

    @Deprecated
    public PlaceLocalization zzuV() {
        this.zzdp("getLocalization");
        return this.zzaAt;
    }

    public Place zzuW() [...] // Inlined contents
}

