package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.List;

public class GeofencingEvent {
    private final int zzBv;
    private final int zzaxG;
    private final List zzaxH;
    private final Location zzaxI;

    private GeofencingEvent(int errorCode, int transitionType, List list0, Location triggeringLocaton) {
        this.zzBv = errorCode;
        this.zzaxG = transitionType;
        this.zzaxH = list0;
        this.zzaxI = triggeringLocaton;
    }

    public static GeofencingEvent fromIntent(Intent intent) {
        return intent == null ? null : new GeofencingEvent(intent.getIntExtra("gms_error_code", -1), GeofencingEvent.zzs(intent), GeofencingEvent.zzt(intent), ((Location)intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location")));
    }

    public int getErrorCode() {
        return this.zzBv;
    }

    public int getGeofenceTransition() {
        return this.zzaxG;
    }

    public List getTriggeringGeofences() {
        return this.zzaxH;
    }

    public Location getTriggeringLocation() {
        return this.zzaxI;
    }

    public boolean hasError() {
        return this.zzBv != -1;
    }

    private static int zzs(Intent intent0) {
        int v = intent0.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if(v == -1) {
            return -1;
        }
        return v != 1 && v != 2 && v != 4 ? -1 : v;
    }

    private static List zzt(Intent intent0) {
        ArrayList arrayList0 = (ArrayList)intent0.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if(arrayList0 == null) {
            return null;
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        for(Object object0: arrayList0) {
            arrayList1.add(ParcelableGeofence.zzn(((byte[])object0)));
        }
        return arrayList1;
    }
}

