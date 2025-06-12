package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

public interface DrivePreferencesApi {
    public interface FileUploadPreferencesResult extends Result {
        FileUploadPreferences getFileUploadPreferences();
    }

    PendingResult getFileUploadPreferences(GoogleApiClient arg1);

    PendingResult setFileUploadPreferences(GoogleApiClient arg1, FileUploadPreferences arg2);
}

