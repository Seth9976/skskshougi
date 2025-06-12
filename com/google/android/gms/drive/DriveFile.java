package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface DriveFile extends DriveResource {
    public interface DownloadProgressListener {
        void onProgress(long arg1, long arg2);
    }

    public static final int MODE_READ_ONLY = 0x10000000;
    public static final int MODE_READ_WRITE = 0x30000000;
    public static final int MODE_WRITE_ONLY = 0x20000000;

    PendingResult open(GoogleApiClient arg1, int arg2, DownloadProgressListener arg3);
}

