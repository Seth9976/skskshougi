package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.drive.query.Query;

public interface DriveFolder extends DriveResource {
    public interface DriveFileResult extends Result {
        DriveFile getDriveFile();
    }

    public interface DriveFolderResult extends Result {
        DriveFolder getDriveFolder();
    }

    public static final String MIME_TYPE = "application/vnd.google-apps.folder";

    PendingResult createFile(GoogleApiClient arg1, MetadataChangeSet arg2, DriveContents arg3);

    PendingResult createFile(GoogleApiClient arg1, MetadataChangeSet arg2, DriveContents arg3, ExecutionOptions arg4);

    PendingResult createFolder(GoogleApiClient arg1, MetadataChangeSet arg2);

    PendingResult listChildren(GoogleApiClient arg1);

    PendingResult queryChildren(GoogleApiClient arg1, Query arg2);
}

