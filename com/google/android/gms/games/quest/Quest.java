package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import java.util.List;

public interface Quest extends Parcelable, Freezable {
    public static final int[] QUEST_STATE_ALL = null;
    public static final String[] QUEST_STATE_NON_TERMINAL = null;
    public static final int STATE_ACCEPTED = 3;
    public static final int STATE_COMPLETED = 4;
    public static final int STATE_EXPIRED = 5;
    public static final int STATE_FAILED = 6;
    public static final int STATE_OPEN = 2;
    public static final int STATE_UPCOMING = 1;
    public static final long UNSET_QUEST_TIMESTAMP = -1L;

    static {
        Quest.QUEST_STATE_ALL = new int[]{1, 2, 3, 4, 6, 5};
        Quest.QUEST_STATE_NON_TERMINAL = new String[]{"1", "2", "3"};
    }

    long getAcceptedTimestamp();

    Uri getBannerImageUri();

    @Deprecated
    String getBannerImageUrl();

    Milestone getCurrentMilestone();

    String getDescription();

    void getDescription(CharArrayBuffer arg1);

    long getEndTimestamp();

    Game getGame();

    Uri getIconImageUri();

    @Deprecated
    String getIconImageUrl();

    long getLastUpdatedTimestamp();

    String getName();

    void getName(CharArrayBuffer arg1);

    String getQuestId();

    long getStartTimestamp();

    int getState();

    int getType();

    boolean isEndingSoon();

    List zztN();

    long zztO();
}

