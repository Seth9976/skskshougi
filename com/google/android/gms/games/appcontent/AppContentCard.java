package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public interface AppContentCard extends Parcelable, Freezable {
    List getActions();

    String getDescription();

    Bundle getExtras();

    String getId();

    String getTitle();

    String getType();

    List zzrO();

    String zzrP();

    List zzrZ();

    int zzsa();

    String zzsb();

    int zzsc();
}

