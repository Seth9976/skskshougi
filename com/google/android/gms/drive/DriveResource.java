package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.drive.events.ChangeListener;
import java.util.Set;

public interface DriveResource {
    public interface MetadataResult extends Result {
        Metadata getMetadata();
    }

    PendingResult addChangeListener(GoogleApiClient arg1, ChangeListener arg2);

    PendingResult addChangeSubscription(GoogleApiClient arg1);

    PendingResult delete(GoogleApiClient arg1);

    DriveId getDriveId();

    PendingResult getMetadata(GoogleApiClient arg1);

    PendingResult listParents(GoogleApiClient arg1);

    PendingResult removeChangeListener(GoogleApiClient arg1, ChangeListener arg2);

    PendingResult removeChangeSubscription(GoogleApiClient arg1);

    PendingResult setParents(GoogleApiClient arg1, Set arg2);

    PendingResult trash(GoogleApiClient arg1);

    PendingResult untrash(GoogleApiClient arg1);

    PendingResult updateMetadata(GoogleApiClient arg1, MetadataChangeSet arg2);
}

