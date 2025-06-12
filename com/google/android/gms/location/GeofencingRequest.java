package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.List;

public class GeofencingRequest implements SafeParcelable {
    public static final class Builder {
        private final List zzaxJ;
        private int zzaxK;

        public Builder() {
            this.zzaxJ = new ArrayList();
            this.zzaxK = 5;
        }

        public Builder addGeofence(Geofence geofence) {
            zzu.zzb(geofence, "geofence can\'t be null.");
            zzu.zzb(geofence instanceof ParcelableGeofence, "Geofence must be created using Geofence.Builder.");
            this.zzaxJ.add(((ParcelableGeofence)geofence));
            return this;
        }

        public Builder addGeofences(List list0) {
            if(list0 != null && !list0.isEmpty()) {
                for(Object object0: list0) {
                    Geofence geofence0 = (Geofence)object0;
                    if(geofence0 != null) {
                        this.addGeofence(geofence0);
                    }
                }
            }
            return this;
        }

        public GeofencingRequest build() {
            zzu.zzb(!this.zzaxJ.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.zzaxJ, this.zzaxK, null);
        }

        public Builder setInitialTrigger(int initialTrigger) {
            this.zzaxK = initialTrigger & 7;
            return this;
        }

        public static int zzgr(int v) [...] // Inlined contents
    }

    public static final Parcelable.Creator CREATOR = null;
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final int zzCY;
    private final List zzaxJ;
    private final int zzaxK;

    static {
        GeofencingRequest.CREATOR = new zza();
    }

    GeofencingRequest(int version, List list0, int initialTrigger) {
        this.zzCY = version;
        this.zzaxJ = list0;
        this.zzaxK = initialTrigger;
    }

    private GeofencingRequest(List list0, int initialTrigger) {
        this(1, list0, initialTrigger);
    }

    GeofencingRequest(List x0, int x1, com.google.android.gms.location.GeofencingRequest.1 x2) {
        this(x0, x1);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List getGeofences() {
        List list0 = new ArrayList();
        list0.addAll(this.zzaxJ);
        return list0;
    }

    public int getInitialTrigger() {
        return this.zzaxK;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zza.zza(this, dest, flags);
    }

    public List zzun() {
        return this.zzaxJ;
    }

    class com.google.android.gms.location.GeofencingRequest.1 {
    }

}

