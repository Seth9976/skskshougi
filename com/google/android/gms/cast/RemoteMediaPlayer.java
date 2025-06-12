package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzn;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Locale;
import jeb.synthetic.FIN;
import org.json.JSONObject;

public class RemoteMediaPlayer implements MessageReceivedCallback {
    public interface MediaChannelResult extends Result {
        JSONObject getCustomData();
    }

    public interface OnMetadataUpdatedListener {
        void onMetadataUpdated();
    }

    public interface OnPreloadStatusUpdatedListener {
        void onPreloadStatusUpdated();
    }

    public interface OnQueueStatusUpdatedListener {
        void onQueueStatusUpdated();
    }

    public interface OnStatusUpdatedListener {
        void onStatusUpdated();
    }

    class zza implements zzn {
        final class com.google.android.gms.cast.RemoteMediaPlayer.zza.zza implements ResultCallback {
            private final long zzSY;
            final zza zzSZ;

            com.google.android.gms.cast.RemoteMediaPlayer.zza.zza(long v) {
                this.zzSY = v;
            }

            @Override  // com.google.android.gms.common.api.ResultCallback
            public void onResult(Result x0) {
                this.zzm(((Status)x0));
            }

            public void zzm(Status status0) {
                if(!status0.isSuccess()) {
                    RemoteMediaPlayer.this.zzSt.zzb(this.zzSY, status0.getStatusCode());
                }
            }
        }

        private GoogleApiClient zzSW;
        private long zzSX;
        final RemoteMediaPlayer zzSz;

        public zza() {
            this.zzSX = 0L;
        }

        @Override  // com.google.android.gms.cast.internal.zzn
        public void zza(String s, String s1, long v, String s2) throws IOException {
            if(this.zzSW == null) {
                throw new IOException("No GoogleApiClient available");
            }
            Cast.CastApi.sendMessage(this.zzSW, s, s1).setResultCallback(new com.google.android.gms.cast.RemoteMediaPlayer.zza.zza(this, v));
        }

        public void zzb(GoogleApiClient googleApiClient0) {
            this.zzSW = googleApiClient0;
        }

        @Override  // com.google.android.gms.cast.internal.zzn
        public long zzlu() {
            long v = this.zzSX + 1L;
            this.zzSX = v;
            return v;
        }
    }

    static abstract class zzb extends com.google.android.gms.cast.internal.zzb {
        zzo zzTa;

        zzb(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
            this.zzTa = new zzo() {
                @Override  // com.google.android.gms.cast.internal.zzo
                public void zza(long v, int v1, Object object0) {
                    zzc remoteMediaPlayer$zzc0 = new zzc(new Status(v1), (object0 instanceof JSONObject ? ((JSONObject)object0) : null));
                    zzb.this.setResult(remoteMediaPlayer$zzc0);
                }

                @Override  // com.google.android.gms.cast.internal.zzo
                public void zzy(long v) {
                    Status status0 = new Status(2103);
                    MediaChannelResult remoteMediaPlayer$MediaChannelResult0 = zzb.this.zzn(status0);
                    zzb.this.setResult(remoteMediaPlayer$MediaChannelResult0);
                }
            };
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzn(x0);
        }

        public MediaChannelResult zzn(Status status0) {
            return new MediaChannelResult() {
                @Override  // com.google.android.gms.cast.RemoteMediaPlayer$MediaChannelResult
                public JSONObject getCustomData() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static final class zzc implements MediaChannelResult {
        private final Status zzOt;
        private final JSONObject zzRJ;

        zzc(Status status0, JSONObject jSONObject0) {
            this.zzOt = status0;
            this.zzRJ = jSONObject0;
        }

        @Override  // com.google.android.gms.cast.RemoteMediaPlayer$MediaChannelResult
        public JSONObject getCustomData() {
            return this.zzRJ;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    public static final int STATUS_CANCELED = 2101;
    public static final int STATUS_FAILED = 2100;
    public static final int STATUS_REPLACED = 2103;
    public static final int STATUS_SUCCEEDED = 0;
    public static final int STATUS_TIMED_OUT = 2102;
    private final zzm zzSt;
    private final zza zzSu;
    private OnPreloadStatusUpdatedListener zzSv;
    private OnQueueStatusUpdatedListener zzSw;
    private OnMetadataUpdatedListener zzSx;
    private OnStatusUpdatedListener zzSy;
    private final Object zzqt;

    public RemoteMediaPlayer() {
        this.zzqt = new Object();
        this.zzSu = new zza(this);
        this.zzSt = new zzm(null) {
            @Override  // com.google.android.gms.cast.internal.zzm
            protected void onMetadataUpdated() {
                RemoteMediaPlayer.this.onMetadataUpdated();
            }

            @Override  // com.google.android.gms.cast.internal.zzm
            protected void onPreloadStatusUpdated() {
                RemoteMediaPlayer.this.onPreloadStatusUpdated();
            }

            @Override  // com.google.android.gms.cast.internal.zzm
            protected void onQueueStatusUpdated() {
                RemoteMediaPlayer.this.onQueueStatusUpdated();
            }

            @Override  // com.google.android.gms.cast.internal.zzm
            protected void onStatusUpdated() {
                RemoteMediaPlayer.this.onStatusUpdated();
            }
        };
        this.zzSt.zza(this.zzSu);
    }

    public long getApproximateStreamPosition() {
        synchronized(this.zzqt) {
        }
        return this.zzSt.getApproximateStreamPosition();
    }

    public MediaInfo getMediaInfo() {
        synchronized(this.zzqt) {
        }
        return this.zzSt.getMediaInfo();
    }

    public MediaStatus getMediaStatus() {
        synchronized(this.zzqt) {
        }
        return this.zzSt.getMediaStatus();
    }

    public String getNamespace() {
        return this.zzSt.getNamespace();
    }

    public long getStreamDuration() {
        synchronized(this.zzqt) {
        }
        return this.zzSt.getStreamDuration();
    }

    public PendingResult load(GoogleApiClient apiClient, MediaInfo mediaInfo) {
        return this.load(apiClient, mediaInfo, true, 0L, null, null);
    }

    public PendingResult load(GoogleApiClient apiClient, MediaInfo mediaInfo, boolean autoplay) {
        return this.load(apiClient, mediaInfo, autoplay, 0L, null, null);
    }

    public PendingResult load(GoogleApiClient apiClient, MediaInfo mediaInfo, boolean autoplay, long playPosition) {
        return this.load(apiClient, mediaInfo, autoplay, playPosition, null, null);
    }

    public PendingResult load(GoogleApiClient apiClient, MediaInfo mediaInfo, boolean autoplay, long playPosition, JSONObject customData) {
        return this.load(apiClient, mediaInfo, autoplay, playPosition, null, customData);
    }

    public PendingResult load(GoogleApiClient apiClient, MediaInfo mediaInfo, boolean autoplay, long playPosition, long[] activeTrackIds, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, mediaInfo, autoplay, playPosition, activeTrackIds, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    @Override  // com.google.android.gms.cast.Cast$MessageReceivedCallback
    public void onMessageReceived(CastDevice castDevice, String namespace, String message) {
        this.zzSt.zzbB(message);
    }

    private void onMetadataUpdated() {
        if(this.zzSx != null) {
            this.zzSx.onMetadataUpdated();
        }
    }

    private void onPreloadStatusUpdated() {
        if(this.zzSv != null) {
            this.zzSv.onPreloadStatusUpdated();
        }
    }

    private void onQueueStatusUpdated() {
        if(this.zzSw != null) {
            this.zzSw.onQueueStatusUpdated();
        }
    }

    private void onStatusUpdated() {
        if(this.zzSy != null) {
            this.zzSy.onStatusUpdated();
        }
    }

    public PendingResult pause(GoogleApiClient apiClient) {
        return this.pause(apiClient, null);
    }

    public PendingResult pause(GoogleApiClient apiClient, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult play(GoogleApiClient apiClient) {
        return this.play(apiClient, null);
    }

    public PendingResult play(GoogleApiClient apiClient, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zzc(this.zzTa, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult queueAppendItem(GoogleApiClient apiClient, MediaQueueItem item, JSONObject customData) throws IllegalArgumentException {
        return this.queueInsertItems(apiClient, new MediaQueueItem[]{item}, 0, customData);
    }

    public PendingResult queueInsertItems(GoogleApiClient apiClient, MediaQueueItem[] itemsToInsert, int insertBeforeItemId, JSONObject customData) throws IllegalArgumentException {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, itemsToInsert, insertBeforeItemId, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult queueJumpToItem(GoogleApiClient apiClient, int itemId, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                Object object0 = RemoteMediaPlayer.this.zzqt;
                __monitor_enter(object0);
                int v = FIN.finallyOpen$NT();
                if(RemoteMediaPlayer.this.zzaH(itemId) == -1) {
                    this.setResult(this.zzn(new Status(0)));
                    FIN.finallyCodeBegin$NT(v);
                    __monitor_exit(object0);
                    FIN.finallyCodeEnd$NT(v);
                    return;
                }
                RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                try {
                    RemoteMediaPlayer.this.zzSt.zza(this.zzTa, itemId, null, 0, null, customData);
                }
                catch(IOException unused_ex) {
                    this.setResult(this.zzn(new Status(2100)));
                }
                finally {
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                    FIN.finallyExec$NT(v);
                }
            }
        });
    }

    public PendingResult queueLoad(GoogleApiClient apiClient, MediaQueueItem[] items, int startIndex, int repeatMode, JSONObject customData) throws IllegalArgumentException {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, items, startIndex, repeatMode, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult queueMoveItemToNewIndex(GoogleApiClient apiClient, int itemId, int newIndex, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                int v = 0;
                Object object0 = RemoteMediaPlayer.this.zzqt;
                __monitor_enter(object0);
                int v1 = FIN.finallyOpen$NT();
                int v2 = RemoteMediaPlayer.this.zzaH(itemId);
                if(v2 == -1) {
                    this.setResult(this.zzn(new Status(0)));
                    FIN.finallyCodeBegin$NT(v1);
                    __monitor_exit(object0);
                    FIN.finallyCodeEnd$NT(v1);
                    return;
                }
                if(newIndex < 0) {
                    this.setResult(this.zzn(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", newIndex))));
                    FIN.finallyExec$NT(v1);
                    return;
                }
                if(v2 == newIndex) {
                    this.setResult(this.zzn(new Status(0)));
                    FIN.finallyExec$NT(v1);
                    return;
                }
                MediaQueueItem mediaQueueItem0 = RemoteMediaPlayer.this.getMediaStatus().getQueueItem((newIndex <= v2 ? newIndex : newIndex + 1));
                if(mediaQueueItem0 != null) {
                    v = mediaQueueItem0.getItemId();
                }
                RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                try {
                    RemoteMediaPlayer.this.zzSt.zza(this.zzTa, new int[]{itemId}, v, customData);
                }
                catch(IOException unused_ex) {
                    this.setResult(this.zzn(new Status(2100)));
                }
                finally {
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                    FIN.finallyExec$NT(v1);
                }
            }
        });
    }

    public PendingResult queueNext(GoogleApiClient apiClient, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, 0, null, 1, null, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult queuePrev(GoogleApiClient apiClient, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, 0, null, -1, null, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult queueRemoveItem(GoogleApiClient apiClient, int itemId, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                Object object0 = RemoteMediaPlayer.this.zzqt;
                __monitor_enter(object0);
                int v = FIN.finallyOpen$NT();
                if(RemoteMediaPlayer.this.zzaH(itemId) == -1) {
                    this.setResult(this.zzn(new Status(0)));
                    FIN.finallyCodeBegin$NT(v);
                    __monitor_exit(object0);
                    FIN.finallyCodeEnd$NT(v);
                    return;
                }
                RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                try {
                    RemoteMediaPlayer.this.zzSt.zza(this.zzTa, new int[]{itemId}, customData);
                }
                catch(IOException unused_ex) {
                    this.setResult(this.zzn(new Status(2100)));
                }
                finally {
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                    FIN.finallyExec$NT(v);
                }
            }
        });
    }

    public PendingResult queueRemoveItems(GoogleApiClient apiClient, int[] itemIdsToRemove, JSONObject customData) throws IllegalArgumentException {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, itemIdsToRemove, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult queueReorderItems(GoogleApiClient apiClient, int[] itemIdsToReorder, int insertBeforeItemId, JSONObject customData) throws IllegalArgumentException {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, itemIdsToReorder, insertBeforeItemId, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult queueSetRepeatMode(GoogleApiClient apiClient, int repeatMode, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, 0, null, 0, repeatMode, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult queueUpdateItems(GoogleApiClient apiClient, MediaQueueItem[] itemsToUpdate, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, 0, itemsToUpdate, 0, null, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult requestStatus(GoogleApiClient apiClient) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult seek(GoogleApiClient apiClient, long position) {
        return this.seek(apiClient, position, 0, null);
    }

    public PendingResult seek(GoogleApiClient apiClient, long position, int resumeState) {
        return this.seek(apiClient, position, resumeState, null);
    }

    public PendingResult seek(GoogleApiClient apiClient, long position, int resumeState, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, position, resumeState, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult setActiveMediaTracks(GoogleApiClient apiClient, long[] trackIds) {
        if(trackIds == null) {
            throw new IllegalArgumentException("trackIds cannot be null");
        }
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, trackIds);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener listener) {
        this.zzSx = listener;
    }

    public void setOnPreloadStatusUpdatedListener(OnPreloadStatusUpdatedListener listener) {
        this.zzSv = listener;
    }

    public void setOnQueueStatusUpdatedListener(OnQueueStatusUpdatedListener listener) {
        this.zzSw = listener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener listener) {
        this.zzSy = listener;
    }

    public PendingResult setStreamMute(GoogleApiClient apiClient, boolean muteState) {
        return this.setStreamMute(apiClient, muteState, null);
    }

    public PendingResult setStreamMute(GoogleApiClient apiClient, boolean muteState, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, muteState, customData);
                        }
                        catch(IllegalStateException | IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult setStreamVolume(GoogleApiClient apiClient, double volume) throws IllegalArgumentException {
        return this.setStreamVolume(apiClient, volume, null);
    }

    public PendingResult setStreamVolume(GoogleApiClient apiClient, double volume, JSONObject customData) throws IllegalArgumentException {
        if(Double.isInfinite(volume) || Double.isNaN(volume)) {
            throw new IllegalArgumentException("Volume cannot be " + volume);
        }
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, volume, customData);
                        }
                        catch(IllegalStateException | IllegalArgumentException | IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult setTextTrackStyle(GoogleApiClient apiClient, TextTrackStyle trackStyle) {
        if(trackStyle == null) {
            throw new IllegalArgumentException("trackStyle cannot be null");
        }
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zza(this.zzTa, trackStyle);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    public PendingResult stop(GoogleApiClient apiClient) {
        return this.stop(apiClient, null);
    }

    public PendingResult stop(GoogleApiClient apiClient, JSONObject customData) {
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zze zze0) {
                synchronized(RemoteMediaPlayer.this.zzqt) {
                    RemoteMediaPlayer.this.zzSu.zzb(apiClient);
                    try {
                        try {
                            RemoteMediaPlayer.this.zzSt.zzb(this.zzTa, customData);
                        }
                        catch(IOException unused_ex) {
                            this.setResult(this.zzn(new Status(2100)));
                        }
                    }
                    catch(Throwable throwable0) {
                        RemoteMediaPlayer.this.zzSu.zzb(null);
                        throw throwable0;
                    }
                    RemoteMediaPlayer.this.zzSu.zzb(null);
                }
            }
        });
    }

    private int zzaH(int v) {
        MediaStatus mediaStatus0 = this.getMediaStatus();
        for(int v1 = 0; v1 < mediaStatus0.getQueueItemCount(); ++v1) {
            if(mediaStatus0.getQueueItem(v1).getItemId() == v) {
                return v1;
            }
        }
        return -1;
    }
}

