package com.google.android.gms.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;

public interface Notifications {
    public interface ContactSettingLoadResult extends Result {
    }

    public interface GameMuteStatusChangeResult extends Result {
    }

    public interface GameMuteStatusLoadResult extends Result {
    }

    public interface InboxCountResult extends Result {
    }

    public static final int NOTIFICATION_TYPES_ALL = 0x1F;
    public static final int NOTIFICATION_TYPES_MULTIPLAYER = 3;
    public static final int NOTIFICATION_TYPE_INVITATION = 1;
    public static final int NOTIFICATION_TYPE_LEVEL_UP = 16;
    public static final int NOTIFICATION_TYPE_MATCH_UPDATE = 2;
    public static final int NOTIFICATION_TYPE_QUEST = 8;
    public static final int NOTIFICATION_TYPE_REQUEST = 4;

    void clear(GoogleApiClient arg1, int arg2);

    void clearAll(GoogleApiClient arg1);
}

