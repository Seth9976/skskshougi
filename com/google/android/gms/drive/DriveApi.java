package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.drive.query.Query;
import java.util.List;

public interface DriveApi {
    public interface DriveContentsResult extends Result {
        DriveContents getDriveContents();
    }

    public interface DriveIdResult extends Result {
        DriveId getDriveId();
    }

    public interface MetadataBufferResult extends Releasable, Result {
        MetadataBuffer getMetadataBuffer();
    }

    PendingResult cancelPendingActions(GoogleApiClient arg1, List arg2);

    PendingResult fetchDriveId(GoogleApiClient arg1, String arg2);

    DriveFolder getAppFolder(GoogleApiClient arg1);

    DriveFile getFile(GoogleApiClient arg1, DriveId arg2);

    DriveFolder getFolder(GoogleApiClient arg1, DriveId arg2);

    DriveFolder getRootFolder(GoogleApiClient arg1);

    CreateFileActivityBuilder newCreateFileActivityBuilder();

    PendingResult newDriveContents(GoogleApiClient arg1);

    OpenFileActivityBuilder newOpenFileActivityBuilder();

    PendingResult query(GoogleApiClient arg1, Query arg2);

    PendingResult requestSync(GoogleApiClient arg1);
}

