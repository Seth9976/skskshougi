package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class zzr extends zzt implements Place {
    private boolean zzaAE;
    private final zzo zzaAH;
    private final String zzazK;

    public zzr(DataHolder dataHolder0, int v, Context context0) {
        super(dataHolder0, v);
        this.zzaAH = context0 == null ? null : zzo.zzax(context0);
        this.zzaAE = this.zzh("place_is_logging_enabled", false);
        this.zzazK = this.zzB("place_id", "");
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzuW();
    }

    @Override  // com.google.android.gms.location.places.Place
    public CharSequence getAddress() {
        this.zzdp("getAddress");
        return this.zzB("place_address", "");
    }

    @Override  // com.google.android.gms.location.places.Place
    public String getId() {
        this.zzdp("getId");
        return this.zzazK;
    }

    @Override  // com.google.android.gms.location.places.Place
    public LatLng getLatLng() {
        this.zzdp("getLatLng");
        return (LatLng)this.zza("place_lat_lng", LatLng.CREATOR);
    }

    @Override  // com.google.android.gms.location.places.Place
    public Locale getLocale() {
        this.zzdp("getLocale");
        String s = this.zzB("place_locale", "");
        return TextUtils.isEmpty(s) ? Locale.getDefault() : new Locale(s);
    }

    @Override  // com.google.android.gms.location.places.Place
    public CharSequence getName() {
        this.zzdp("getName");
        return this.zzB("place_name", "");
    }

    @Override  // com.google.android.gms.location.places.Place
    public CharSequence getPhoneNumber() {
        this.zzdp("getPhoneNumber");
        return this.zzB("place_phone_number", "");
    }

    @Override  // com.google.android.gms.location.places.Place
    public List getPlaceTypes() {
        this.zzdp("getPlaceTypes");
        return this.zza("place_types", Collections.emptyList());
    }

    @Override  // com.google.android.gms.location.places.Place
    public int getPriceLevel() {
        this.zzdp("getPriceLevel");
        return this.zzz("place_price_level", -1);
    }

    @Override  // com.google.android.gms.location.places.Place
    public float getRating() {
        this.zzdp("getRating");
        return this.zzb("place_rating", -1.0f);
    }

    @Override  // com.google.android.gms.location.places.Place
    public LatLngBounds getViewport() {
        this.zzdp("getViewport");
        return (LatLngBounds)this.zza("place_viewport", LatLngBounds.CREATOR);
    }

    @Override  // com.google.android.gms.location.places.Place
    public Uri getWebsiteUri() {
        this.zzdp("getWebsiteUri");
        String s = this.zzB("place_website_uri", null);
        return s == null ? null : Uri.parse(s);
    }

    private void zzdp(String s) {
        if(this.zzaAE && this.zzaAH != null) {
            this.zzaAH.zzA(this.zzazK, s);
        }
    }

    public float zzuO() {
        this.zzdp("getLevelNumber");
        return this.zzb("place_level_number", 0.0f);
    }

    public boolean zzuR() {
        this.zzdp("isPermanentlyClosed");
        return this.zzh("place_is_permanently_closed", false);
    }

    public Place zzuW() {
        zza placeImpl$zza0 = new zza().zzae(this.zzaAE);
        this.zzaAE = false;
        Place place0 = placeImpl$zza0.zzds(this.getAddress().toString()).zzn(this.zzb("place_attributions", Collections.emptyList())).zzdq(this.getId()).zzad(this.zzuR()).zza(this.getLatLng()).zzf(this.zzuO()).zzdr(this.getName().toString()).zzdt(this.getPhoneNumber().toString()).zzgX(this.getPriceLevel()).zzg(this.getRating()).zzm(this.getPlaceTypes()).zza(this.getViewport()).zzk(this.getWebsiteUri()).zzuX();
        ((PlaceImpl)place0).setLocale(this.getLocale());
        ((PlaceImpl)place0).zza(this.zzaAH);
        return place0;
    }
}

