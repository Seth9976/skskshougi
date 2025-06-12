package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.internal.constants.PlatformType;

public final class GameInstanceRef extends zzc implements GameInstance {
    GameInstanceRef(DataHolder holder, int dataRow) {
        super(holder, dataRow);
    }

    public String getApplicationId() {
        return this.getString("external_game_id");
    }

    public String getDisplayName() {
        return this.getString("instance_display_name");
    }

    public String getPackageName() {
        return this.getString("package_name");
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("ApplicationId", this.getApplicationId()).zzg("DisplayName", this.getDisplayName()).zzg("SupportsRealTime", Boolean.valueOf(this.zztj())).zzg("SupportsTurnBased", Boolean.valueOf(this.zztk())).zzg("PlatformType", PlatformType.zzfG(this.zzqE())).zzg("PackageName", this.getPackageName()).zzg("PiracyCheckEnabled", Boolean.valueOf(this.zztl())).zzg("Installed", Boolean.valueOf(this.zztm())).toString();
    }

    public int zzqE() {
        return this.getInteger("platform_type");
    }

    public boolean zztj() {
        return this.getInteger("real_time_support") > 0;
    }

    public boolean zztk() {
        return this.getInteger("turn_based_support") > 0;
    }

    public boolean zztl() {
        return this.getInteger("piracy_check") > 0;
    }

    public boolean zztm() {
        return this.getInteger("installed") > 0;
    }
}

