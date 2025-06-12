package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

public class Strategy implements SafeParcelable {
    public static class zza {
        private int zzaFU;
        private int zzaFV;
        private int zzaFX;
        private int zzaFY;

        public zza() {
            this.zzaFY = 3;
            this.zzaFU = 300;
            this.zzaFV = 0;
            this.zzaFX = 1;
        }

        public zza zzie(int v) {
            this.zzaFX = v;
            return this;
        }

        public zza zzif(int v) {
            zzu.zzb(v == 0x7FFFFFFF || v > 0 && v <= 86400, "ttlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", new Object[]{v, 86400});
            this.zzaFU = v;
            return this;
        }

        public Strategy zzwZ() {
            if(this.zzaFX == 2) {
                if(this.zzaFY != 3) {
                    throw new IllegalStateException("Discovery mode must be DISCOVERY_MODE_DEFAULT.");
                }
                if(this.zzaFV == 1) {
                    throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
                }
            }
            return new Strategy(2, 0, this.zzaFU, this.zzaFV, false, this.zzaFX, this.zzaFY);
        }
    }

    public static final Parcelable.Creator CREATOR;
    final int versionCode;
    public static final Strategy zzaFQ;
    public static final Strategy zzaFR;
    @Deprecated
    public static final Strategy zzaFS;
    @Deprecated
    final int zzaFT;
    final int zzaFU;
    final int zzaFV;
    @Deprecated
    final boolean zzaFW;
    final int zzaFX;
    final int zzaFY;

    static {
        Strategy.CREATOR = new zzf();
        Strategy.zzaFQ = new zza().zzwZ();
        Strategy.zzaFR = new zza().zzie(2).zzif(0x7FFFFFFF).zzwZ();
        Strategy.zzaFS = Strategy.zzaFR;
    }

    Strategy(int versionCode, int broadcastScanStrategy, int ttlSeconds, int distanceType, boolean isBleBeaconStrategy, int discoveryMedium, int discoveryMode) {
        this.versionCode = versionCode;
        this.zzaFT = broadcastScanStrategy;
        if(broadcastScanStrategy == 0) {
            this.zzaFY = discoveryMode;
        }
        else {
            switch(broadcastScanStrategy) {
                case 2: {
                    this.zzaFY = 1;
                    break;
                }
                case 3: {
                    this.zzaFY = 2;
                    break;
                }
                default: {
                    this.zzaFY = 3;
                }
            }
        }
        this.zzaFV = distanceType;
        this.zzaFW = isBleBeaconStrategy;
        if(isBleBeaconStrategy) {
            this.zzaFX = 2;
            this.zzaFU = 0x7FFFFFFF;
            return;
        }
        if(discoveryMedium == 0) {
            this.zzaFX = 1;
            this.zzaFU = ttlSeconds;
            return;
        }
        this.zzaFX = discoveryMedium;
        this.zzaFU = ttlSeconds;
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
        return other instanceof Strategy ? this.versionCode == ((Strategy)other).versionCode && this.zzaFY == ((Strategy)other).zzaFY && this.zzaFU == ((Strategy)other).zzaFU && this.zzaFV == ((Strategy)other).zzaFV && this.zzaFX == ((Strategy)other).zzaFX : false;
    }

    @Override
    public int hashCode() {
        return (((this.versionCode * 0x1F + this.zzaFY) * 0x1F + this.zzaFU) * 0x1F + this.zzaFV) * 0x1F + this.zzaFX;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzf.zza(this, out, flags);
    }
}

