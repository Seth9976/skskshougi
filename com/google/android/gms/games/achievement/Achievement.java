package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Player;

public interface Achievement extends Parcelable, Freezable {
    public static final int STATE_HIDDEN = 2;
    public static final int STATE_REVEALED = 1;
    public static final int STATE_UNLOCKED = 0;
    public static final int TYPE_INCREMENTAL = 1;
    public static final int TYPE_STANDARD;

    String getAchievementId();

    int getCurrentSteps();

    String getDescription();

    void getDescription(CharArrayBuffer arg1);

    String getFormattedCurrentSteps();

    void getFormattedCurrentSteps(CharArrayBuffer arg1);

    String getFormattedTotalSteps();

    void getFormattedTotalSteps(CharArrayBuffer arg1);

    long getLastUpdatedTimestamp();

    String getName();

    void getName(CharArrayBuffer arg1);

    Player getPlayer();

    Uri getRevealedImageUri();

    @Deprecated
    String getRevealedImageUrl();

    int getState();

    int getTotalSteps();

    int getType();

    Uri getUnlockedImageUri();

    @Deprecated
    String getUnlockedImageUrl();

    long getXpValue();
}

