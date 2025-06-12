package org.cocos2dx.lib;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController.MediaPlayerControl;
import java.io.IOException;
import java.util.Map;

public class Cocos2dxVideoView extends SurfaceView implements MediaController.MediaPlayerControl {
    public interface OnVideoEventListener {
        void onVideoEvent(int arg1, int arg2);
    }

    private static final String AssetResourceRoot = "assets/";
    private static final int EVENT_COMPLETED = 3;
    private static final int EVENT_PAUSED = 1;
    private static final int EVENT_PLAYING = 0;
    private static final int EVENT_STOPPED = 2;
    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PAUSED = 4;
    private static final int STATE_PLAYBACK_COMPLETED = 5;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    private String TAG;
    private MediaPlayer.OnBufferingUpdateListener mBufferingUpdateListener;
    protected Cocos2dxActivity mCocos2dxActivity;
    private MediaPlayer.OnCompletionListener mCompletionListener;
    private int mCurrentBufferPercentage;
    private int mCurrentState;
    private int mDuration;
    private MediaPlayer.OnErrorListener mErrorListener;
    protected boolean mFullScreenEnabled;
    protected int mFullScreenHeight;
    protected int mFullScreenWidth;
    private boolean mIsAssetRouse;
    private boolean mKeepRatio;
    private MediaPlayer mMediaPlayer;
    private boolean mNeedResume;
    private MediaPlayer.OnErrorListener mOnErrorListener;
    private MediaPlayer.OnPreparedListener mOnPreparedListener;
    private OnVideoEventListener mOnVideoEventListener;
    MediaPlayer.OnPreparedListener mPreparedListener;
    SurfaceHolder.Callback mSHCallback;
    private int mSeekWhenPrepared;
    protected MediaPlayer.OnVideoSizeChangedListener mSizeChangedListener;
    private SurfaceHolder mSurfaceHolder;
    private int mTargetState;
    private String mVideoFilePath;
    private int mVideoHeight;
    private Uri mVideoUri;
    private int mVideoWidth;
    protected int mViewHeight;
    protected int mViewLeft;
    private int mViewTag;
    protected int mViewTop;
    protected int mViewWidth;
    protected int mVisibleHeight;
    protected int mVisibleLeft;
    protected int mVisibleTop;
    protected int mVisibleWidth;

    public Cocos2dxVideoView(Cocos2dxActivity activity, int tag) {
        super(activity);
        this.TAG = "Cocos2dxVideoView";
        this.mCurrentState = 0;
        this.mTargetState = 0;
        this.mSurfaceHolder = null;
        this.mMediaPlayer = null;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.mCocos2dxActivity = null;
        this.mViewLeft = 0;
        this.mViewTop = 0;
        this.mViewWidth = 0;
        this.mViewHeight = 0;
        this.mVisibleLeft = 0;
        this.mVisibleTop = 0;
        this.mVisibleWidth = 0;
        this.mVisibleHeight = 0;
        this.mFullScreenEnabled = false;
        this.mFullScreenWidth = 0;
        this.mFullScreenHeight = 0;
        this.mViewTag = 0;
        this.mNeedResume = false;
        this.mIsAssetRouse = false;
        this.mVideoFilePath = null;
        this.mKeepRatio = false;
        this.mSizeChangedListener = new MediaPlayer.OnVideoSizeChangedListener() {
            @Override  // android.media.MediaPlayer$OnVideoSizeChangedListener
            public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                int v2 = mp.getVideoWidth();
                Cocos2dxVideoView.this.mVideoWidth = v2;
                int v3 = mp.getVideoHeight();
                Cocos2dxVideoView.this.mVideoHeight = v3;
                if(Cocos2dxVideoView.this.mVideoWidth != 0 && Cocos2dxVideoView.this.mVideoHeight != 0) {
                    Cocos2dxVideoView.this.getHolder().setFixedSize(Cocos2dxVideoView.this.mVideoWidth, Cocos2dxVideoView.this.mVideoHeight);
                }
            }
        };
        this.mPreparedListener = new MediaPlayer.OnPreparedListener() {
            @Override  // android.media.MediaPlayer$OnPreparedListener
            public void onPrepared(MediaPlayer mp) {
                Cocos2dxVideoView.this.mCurrentState = 2;
                if(Cocos2dxVideoView.this.mOnPreparedListener != null) {
                    Cocos2dxVideoView.this.mOnPreparedListener.onPrepared(Cocos2dxVideoView.this.mMediaPlayer);
                }
                int v = mp.getVideoWidth();
                Cocos2dxVideoView.this.mVideoWidth = v;
                int v1 = mp.getVideoHeight();
                Cocos2dxVideoView.this.mVideoHeight = v1;
                int v2 = Cocos2dxVideoView.this.mSeekWhenPrepared;
                if(v2 != 0) {
                    Cocos2dxVideoView.this.seekTo(v2);
                }
                if(Cocos2dxVideoView.this.mVideoWidth != 0 && Cocos2dxVideoView.this.mVideoHeight != 0) {
                    Cocos2dxVideoView.this.fixSize();
                }
                if(Cocos2dxVideoView.this.mTargetState == 3) {
                    Cocos2dxVideoView.this.start();
                }
            }
        };
        this.mCompletionListener = new MediaPlayer.OnCompletionListener() {
            @Override  // android.media.MediaPlayer$OnCompletionListener
            public void onCompletion(MediaPlayer mp) {
                Cocos2dxVideoView.this.mCurrentState = 5;
                Cocos2dxVideoView.this.mTargetState = 5;
                Cocos2dxVideoView.this.release(true);
                if(Cocos2dxVideoView.this.mOnVideoEventListener != null) {
                    Cocos2dxVideoView.this.mOnVideoEventListener.onVideoEvent(Cocos2dxVideoView.this.mViewTag, 3);
                }
            }
        };
        this.mErrorListener = new MediaPlayer.OnErrorListener() {
            @Override  // android.media.MediaPlayer$OnErrorListener
            public boolean onError(MediaPlayer mp, int framework_err, int impl_err) {
                Log.d(Cocos2dxVideoView.this.TAG, "Error: " + framework_err + "," + impl_err);
                Cocos2dxVideoView.this.mCurrentState = -1;
                Cocos2dxVideoView.this.mTargetState = -1;
                if((Cocos2dxVideoView.this.mOnErrorListener == null || !Cocos2dxVideoView.this.mOnErrorListener.onError(Cocos2dxVideoView.this.mMediaPlayer, framework_err, impl_err)) && Cocos2dxVideoView.this.getWindowToken() != null) {
                    Resources resources0 = Cocos2dxVideoView.this.mCocos2dxActivity.getResources();
                    int v2 = framework_err == 200 ? resources0.getIdentifier("VideoView_error_text_invalid_progressive_playback", "string", "android") : resources0.getIdentifier("VideoView_error_text_unknown", "string", "android");
                    int v3 = resources0.getIdentifier("VideoView_error_title", "string", "android");
                    int v4 = resources0.getIdentifier("VideoView_error_button", "string", "android");
                    new AlertDialog.Builder(Cocos2dxVideoView.this.mCocos2dxActivity).setTitle(resources0.getString(v3)).setMessage(v2).setPositiveButton(resources0.getString(v4), new DialogInterface.OnClickListener() {
                        @Override  // android.content.DialogInterface$OnClickListener
                        public void onClick(DialogInterface dialog, int whichButton) {
                            if(Cocos2dxVideoView.this.mOnVideoEventListener != null) {
                                Cocos2dxVideoView.this.mOnVideoEventListener.onVideoEvent(Cocos2dxVideoView.this.mViewTag, 3);
                            }
                        }
                    }).setCancelable(false).show();
                    return true;
                }
                return true;
            }
        };
        this.mBufferingUpdateListener = new MediaPlayer.OnBufferingUpdateListener() {
            @Override  // android.media.MediaPlayer$OnBufferingUpdateListener
            public void onBufferingUpdate(MediaPlayer mp, int percent) {
                Cocos2dxVideoView.this.mCurrentBufferPercentage = percent;
            }
        };
        this.mSHCallback = new SurfaceHolder.Callback() {
            @Override  // android.view.SurfaceHolder$Callback
            public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
                if(Cocos2dxVideoView.this.mMediaPlayer != null && Cocos2dxVideoView.this.mTargetState == 3 && (Cocos2dxVideoView.this.mVideoWidth == w && Cocos2dxVideoView.this.mVideoHeight == h)) {
                    if(Cocos2dxVideoView.this.mSeekWhenPrepared != 0) {
                        Cocos2dxVideoView.this.seekTo(Cocos2dxVideoView.this.mSeekWhenPrepared);
                    }
                    Cocos2dxVideoView.this.start();
                }
            }

            @Override  // android.view.SurfaceHolder$Callback
            public void surfaceCreated(SurfaceHolder holder) {
                Cocos2dxVideoView.this.mSurfaceHolder = holder;
                Cocos2dxVideoView.this.openVideo();
            }

            @Override  // android.view.SurfaceHolder$Callback
            public void surfaceDestroyed(SurfaceHolder holder) {
                Cocos2dxVideoView.this.mSurfaceHolder = null;
                Cocos2dxVideoView.this.release(true);
            }
        };
        this.mViewTag = tag;
        this.mCocos2dxActivity = activity;
        this.initVideoView();
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public boolean canSeekBackward() {
        return true;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public boolean canSeekForward() {
        return true;
    }

    public void fixSize() {
        if(this.mFullScreenEnabled) {
            this.fixSize(0, 0, this.mFullScreenWidth, this.mFullScreenHeight);
            return;
        }
        this.fixSize(this.mViewLeft, this.mViewTop, this.mViewWidth, this.mViewHeight);
    }

    public void fixSize(int left, int top, int width, int height) {
        if(this.mVideoWidth == 0 || this.mVideoHeight == 0) {
            this.mVisibleLeft = left;
            this.mVisibleTop = top;
            this.mVisibleWidth = width;
            this.mVisibleHeight = height;
        }
        else if(width == 0 || height == 0) {
            this.mVisibleLeft = left;
            this.mVisibleTop = top;
            this.mVisibleWidth = this.mVideoWidth;
            this.mVisibleHeight = this.mVideoHeight;
        }
        else if(this.mKeepRatio) {
            if(this.mVideoWidth * height > this.mVideoHeight * width) {
                this.mVisibleWidth = width;
                this.mVisibleHeight = this.mVideoHeight * width / this.mVideoWidth;
            }
            else if(this.mVideoWidth * height < this.mVideoHeight * width) {
                this.mVisibleWidth = this.mVideoWidth * height / this.mVideoHeight;
                this.mVisibleHeight = height;
            }
            this.mVisibleLeft = (width - this.mVisibleWidth) / 2 + left;
            this.mVisibleTop = (height - this.mVisibleHeight) / 2 + top;
        }
        else {
            this.mVisibleLeft = left;
            this.mVisibleTop = top;
            this.mVisibleWidth = width;
            this.mVisibleHeight = height;
        }
        this.getHolder().setFixedSize(this.mVisibleWidth, this.mVisibleHeight);
        FrameLayout.LayoutParams lParams = new FrameLayout.LayoutParams(-2, -2);
        lParams.leftMargin = this.mVisibleLeft;
        lParams.topMargin = this.mVisibleTop;
        lParams.gravity = 51;
        this.setLayoutParams(lParams);
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public int getAudioSessionId() {
        return this.mMediaPlayer.getAudioSessionId();
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public int getBufferPercentage() {
        return this.mMediaPlayer == null ? 0 : this.mCurrentBufferPercentage;
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.MediaController$MediaPlayerControl
    public int getCurrentPosition() {
        return this.isInPlaybackState() ? this.mMediaPlayer.getCurrentPosition() : 0;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public int getDuration() {
        if(this.isInPlaybackState()) {
            if(this.mDuration > 0) {
                return this.mDuration;
            }
            this.mDuration = this.mMediaPlayer.getDuration();
            return this.mDuration;
        }
        this.mDuration = -1;
        return -1;
    }

    private void initVideoView() {
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.getHolder().addCallback(this.mSHCallback);
        this.getHolder().setType(3);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.mCurrentState = 0;
        this.mTargetState = 0;
    }

    public boolean isInPlaybackState() {
        return this.mMediaPlayer != null && (this.mCurrentState != -1 && this.mCurrentState != 0 && this.mCurrentState != 1);
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.MediaController$MediaPlayerControl
    public boolean isPlaying() {
        return this.isInPlaybackState() && this.mMediaPlayer.isPlaying();
    }

    @Override  // android.view.SurfaceView
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if(this.mVideoWidth == 0 || this.mVideoHeight == 0) {
            this.setMeasuredDimension(this.mViewWidth, this.mViewHeight);
            Log.i(this.TAG, "" + this.mViewWidth + ":" + this.mViewHeight);
            return;
        }
        this.setMeasuredDimension(this.mVisibleWidth, this.mVisibleHeight);
        Log.i(this.TAG, "" + this.mVisibleWidth + ":" + this.mVisibleHeight);
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if((event.getAction() & 0xFF) == 1) {
            if(this.isPlaying()) {
                this.pause();
                return true;
            }
            if(this.mCurrentState == 4) {
                this.resume();
                return true;
            }
        }
        return true;
    }

    private void openVideo() {
        if(this.mSurfaceHolder != null) {
            if(!this.mIsAssetRouse) {
                if(this.mVideoUri == null) {
                    return;
                }
            }
            else if(this.mVideoFilePath == null) {
                return;
            }
            Intent i = new Intent("com.android.music.musicservicecommand");
            i.putExtra("command", "pause");
            this.mCocos2dxActivity.sendBroadcast(i);
            this.release(false);
            try {
                this.mMediaPlayer = new MediaPlayer();
                this.mMediaPlayer.setOnPreparedListener(this.mPreparedListener);
                this.mMediaPlayer.setOnVideoSizeChangedListener(this.mSizeChangedListener);
                this.mMediaPlayer.setOnCompletionListener(this.mCompletionListener);
                this.mMediaPlayer.setOnErrorListener(this.mErrorListener);
                this.mMediaPlayer.setOnBufferingUpdateListener(this.mBufferingUpdateListener);
                this.mMediaPlayer.setDisplay(this.mSurfaceHolder);
                this.mMediaPlayer.setAudioStreamType(3);
                this.mMediaPlayer.setScreenOnWhilePlaying(true);
                this.mDuration = -1;
                this.mCurrentBufferPercentage = 0;
                if(this.mIsAssetRouse) {
                    AssetFileDescriptor assetFileDescriptor0 = this.mCocos2dxActivity.getAssets().openFd(this.mVideoFilePath);
                    this.mMediaPlayer.setDataSource(assetFileDescriptor0.getFileDescriptor(), assetFileDescriptor0.getStartOffset(), assetFileDescriptor0.getLength());
                }
                else {
                    this.mMediaPlayer.setDataSource(this.mCocos2dxActivity, this.mVideoUri);
                }
                this.mMediaPlayer.prepareAsync();
                this.mCurrentState = 1;
            }
            catch(IOException ex) {
                Log.w(this.TAG, "Unable to open content: " + this.mVideoUri, ex);
                this.mCurrentState = -1;
                this.mTargetState = -1;
                this.mErrorListener.onError(this.mMediaPlayer, 1, 0);
            }
            catch(IllegalArgumentException ex) {
                Log.w(this.TAG, "Unable to open content: " + this.mVideoUri, ex);
                this.mCurrentState = -1;
                this.mTargetState = -1;
                this.mErrorListener.onError(this.mMediaPlayer, 1, 0);
            }
        }
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public void pause() {
        if(this.isInPlaybackState() && this.mMediaPlayer.isPlaying()) {
            this.mMediaPlayer.pause();
            this.mCurrentState = 4;
            if(this.mOnVideoEventListener != null) {
                this.mOnVideoEventListener.onVideoEvent(this.mViewTag, 1);
            }
        }
        this.mTargetState = 4;
    }

    private void release(boolean cleartargetstate) {
        if(this.mMediaPlayer != null) {
            this.mMediaPlayer.reset();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            this.mCurrentState = 0;
            if(cleartargetstate) {
                this.mTargetState = 0;
            }
        }
    }

    public int resolveAdjustedSize(int desiredSize, int measureSpec) {
        int v2 = View.MeasureSpec.getMode(measureSpec);
        int v3 = View.MeasureSpec.getSize(measureSpec);
        switch(v2) {
            case 0x80000000: {
                return Math.min(desiredSize, v3);
            }
            case 0: {
                return desiredSize;
            }
            case 0x40000000: {
                return v3;
            }
            default: {
                return desiredSize;
            }
        }
    }

    public void restart() {
        if(this.isInPlaybackState()) {
            this.mMediaPlayer.seekTo(0);
            this.mMediaPlayer.start();
            this.mCurrentState = 3;
            this.mTargetState = 3;
        }
    }

    public void resume() {
        if(this.isInPlaybackState() && this.mCurrentState == 4) {
            this.mMediaPlayer.start();
            this.mCurrentState = 3;
            if(this.mOnVideoEventListener != null) {
                this.mOnVideoEventListener.onVideoEvent(this.mViewTag, 0);
            }
        }
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public void seekTo(int msec) {
        if(this.isInPlaybackState()) {
            this.mMediaPlayer.seekTo(msec);
            this.mSeekWhenPrepared = 0;
            return;
        }
        this.mSeekWhenPrepared = msec;
    }

    public void setFullScreenEnabled(boolean enabled, int width, int height) {
        if(this.mFullScreenEnabled != enabled) {
            this.mFullScreenEnabled = enabled;
            if(width != 0 && height != 0) {
                this.mFullScreenWidth = width;
                this.mFullScreenHeight = height;
            }
            this.fixSize();
        }
    }

    public void setKeepRatio(boolean enabled) {
        this.mKeepRatio = enabled;
        this.fixSize();
    }

    public void setOnCompletionListener(OnVideoEventListener l) {
        this.mOnVideoEventListener = l;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener l) {
        this.mOnErrorListener = l;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener l) {
        this.mOnPreparedListener = l;
    }

    public void setVideoFileName(String path) {
        if(path.startsWith("assets/")) {
            path = path.substring(7);
        }
        if(path.startsWith("/")) {
            this.mIsAssetRouse = false;
            this.setVideoURI(Uri.parse(path), null);
            return;
        }
        this.mVideoFilePath = path;
        this.mIsAssetRouse = true;
        this.setVideoURI(Uri.parse(path), null);
    }

    public void setVideoRect(int left, int top, int maxWidth, int maxHeight) {
        this.mViewLeft = left;
        this.mViewTop = top;
        this.mViewWidth = maxWidth;
        this.mViewHeight = maxHeight;
        this.fixSize(this.mViewLeft, this.mViewTop, this.mViewWidth, this.mViewHeight);
    }

    private void setVideoURI(Uri uri, Map map0) {
        this.mVideoUri = uri;
        this.mSeekWhenPrepared = 0;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        this.openVideo();
        this.requestLayout();
        this.invalidate();
    }

    public void setVideoURL(String url) {
        this.mIsAssetRouse = false;
        this.setVideoURI(Uri.parse(url), null);
    }

    @Override  // android.view.SurfaceView
    public void setVisibility(int visibility) {
        if(visibility == 4) {
            this.mNeedResume = this.isPlaying();
            if(this.mNeedResume) {
                this.mSeekWhenPrepared = this.getCurrentPosition();
            }
        }
        else if(this.mNeedResume) {
            this.start();
            this.mNeedResume = false;
        }
        super.setVisibility(visibility);
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public void start() {
        if(this.isInPlaybackState()) {
            this.mMediaPlayer.start();
            this.mCurrentState = 3;
            if(this.mOnVideoEventListener != null) {
                this.mOnVideoEventListener.onVideoEvent(this.mViewTag, 0);
            }
        }
        this.mTargetState = 3;
    }

    public void stop() {
        if(this.isInPlaybackState() && this.mMediaPlayer.isPlaying()) {
            this.stopPlayback();
            if(this.mOnVideoEventListener != null) {
                this.mOnVideoEventListener.onVideoEvent(this.mViewTag, 2);
            }
        }
    }

    public void stopPlayback() {
        if(this.mMediaPlayer != null) {
            this.mMediaPlayer.stop();
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            this.mCurrentState = 0;
            this.mTargetState = 0;
        }
    }

    public void suspend() {
        this.release(false);
    }
}

