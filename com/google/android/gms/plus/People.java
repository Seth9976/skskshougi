package com.google.android.gms.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

public interface People {
    public interface LoadPeopleResult extends Releasable, Result {
        String getNextPageToken();

        PersonBuffer getPersonBuffer();
    }

    public interface OrderBy {
        public static final int ALPHABETICAL = 0;
        public static final int BEST = 1;

    }

    Person getCurrentPerson(GoogleApiClient arg1);

    PendingResult load(GoogleApiClient arg1, Collection arg2);

    PendingResult load(GoogleApiClient arg1, String[] arg2);

    PendingResult loadConnected(GoogleApiClient arg1);

    PendingResult loadVisible(GoogleApiClient arg1, int arg2, String arg3);

    PendingResult loadVisible(GoogleApiClient arg1, String arg2);
}

