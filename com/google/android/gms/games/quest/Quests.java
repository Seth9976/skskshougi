package com.google.android.gms.games.quest;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public interface Quests {
    public interface AcceptQuestResult extends Result {
        Quest getQuest();
    }

    public interface ClaimMilestoneResult extends Result {
        Milestone getMilestone();

        Quest getQuest();
    }

    public interface LoadQuestsResult extends Releasable, Result {
        QuestBuffer getQuests();
    }

    public static final String EXTRA_QUEST = "quest";
    public static final int SELECT_ACCEPTED = 3;
    public static final int[] SELECT_ALL_QUESTS = null;
    public static final int SELECT_COMPLETED = 4;
    public static final int SELECT_COMPLETED_UNCLAIMED = 101;
    public static final int SELECT_ENDING_SOON = 102;
    public static final int SELECT_EXPIRED = 5;
    public static final int SELECT_FAILED = 6;
    public static final int SELECT_OPEN = 2;
    public static final int SELECT_RECENTLY_FAILED = 103;
    public static final int SELECT_UPCOMING = 1;
    public static final int SORT_ORDER_ENDING_SOON_FIRST = 1;
    public static final int SORT_ORDER_RECENTLY_UPDATED_FIRST;

    static {
        Quests.SELECT_ALL_QUESTS = new int[]{1, 2, 3, 4, 101, 5, 102, 6, 103};
    }

    PendingResult accept(GoogleApiClient arg1, String arg2);

    PendingResult claim(GoogleApiClient arg1, String arg2, String arg3);

    Intent getQuestIntent(GoogleApiClient arg1, String arg2);

    Intent getQuestsIntent(GoogleApiClient arg1, int[] arg2);

    PendingResult load(GoogleApiClient arg1, int[] arg2, int arg3, boolean arg4);

    PendingResult loadByIds(GoogleApiClient arg1, boolean arg2, String[] arg3);

    void registerQuestUpdateListener(GoogleApiClient arg1, QuestUpdateListener arg2);

    void showStateChangedPopup(GoogleApiClient arg1, String arg2);

    void unregisterQuestUpdateListener(GoogleApiClient arg1);
}

