package org.cocos2dx.lib;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.util.Log;
import java.io.FileInputStream;

public class Cocos2dxMusic {
    private static final String TAG;
    private MediaPlayer mBackgroundMediaPlayer;
    private final Context mContext;
    private String mCurrentPath;
    private boolean mIsLoop;
    private float mLeftVolume;
    private boolean mManualPaused;
    private boolean mPaused;
    private float mRightVolume;

    static {
        Cocos2dxMusic.TAG = "Cocos2dxMusic";
    }

    public Cocos2dxMusic(Context context) {
        this.mIsLoop = false;
        this.mManualPaused = false;
        this.mContext = context;
        this.initData();
    }

    private MediaPlayer createMediaplayer(String path) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            if(path.startsWith("/")) {
                FileInputStream fis = new FileInputStream(path);
                mediaPlayer.setDataSource(fis.getFD());
                fis.close();
            }
            else {
                AssetFileDescriptor assetFileDescriptor0 = this.mContext.getAssets().openFd(path);
                mediaPlayer.setDataSource(assetFileDescriptor0.getFileDescriptor(), assetFileDescriptor0.getStartOffset(), assetFileDescriptor0.getLength());
            }
            mediaPlayer.prepare();
            mediaPlayer.setVolume(this.mLeftVolume, this.mRightVolume);
            return mediaPlayer;
        }
        catch(Exception e) {
            Log.e("Cocos2dxMusic", "error: " + e.getMessage(), e);
            return null;
        }
    }

    public void end() {
        if(this.mBackgroundMediaPlayer != null) {
            this.mBackgroundMediaPlayer.release();
        }
        this.initData();
    }

    public float getBackgroundVolume() {
        return this.mBackgroundMediaPlayer == null ? 0.0f : (this.mLeftVolume + this.mRightVolume) / 2.0f;
    }

    private void initData() {
        this.mLeftVolume = 0.5f;
        this.mRightVolume = 0.5f;
        this.mBackgroundMediaPlayer = null;
        this.mPaused = false;
        this.mCurrentPath = null;
    }

    public boolean isBackgroundMusicPlaying() {
        return this.mBackgroundMediaPlayer == null ? false : this.mBackgroundMediaPlayer.isPlaying();
    }

    public void onEnterBackground() {
        if(this.mBackgroundMediaPlayer != null && this.mBackgroundMediaPlayer.isPlaying()) {
            this.mBackgroundMediaPlayer.pause();
            this.mPaused = true;
        }
    }

    public void onEnterForeground() {
        if(!this.mManualPaused && this.mBackgroundMediaPlayer != null && this.mPaused) {
            this.mBackgroundMediaPlayer.start();
            this.mPaused = false;
        }
    }

    public void pauseBackgroundMusic() {
        if(this.mBackgroundMediaPlayer != null && this.mBackgroundMediaPlayer.isPlaying()) {
            this.mBackgroundMediaPlayer.pause();
            this.mPaused = true;
            this.mManualPaused = true;
        }
    }

    public void playBackgroundMusic(String path, boolean isLoop) {
        if(this.mCurrentPath == null) {
            this.mBackgroundMediaPlayer = this.createMediaplayer(path);
            this.mCurrentPath = path;
        }
        else if(!this.mCurrentPath.equals(path)) {
            if(this.mBackgroundMediaPlayer != null) {
                this.mBackgroundMediaPlayer.release();
            }
            this.mBackgroundMediaPlayer = this.createMediaplayer(path);
            this.mCurrentPath = path;
        }
        if(this.mBackgroundMediaPlayer == null) {
            Log.e("Cocos2dxMusic", "playBackgroundMusic: background media player is null");
            return;
        }
        try {
            if(this.mPaused) {
                this.mBackgroundMediaPlayer.seekTo(0);
                this.mBackgroundMediaPlayer.start();
            }
            else if(this.mBackgroundMediaPlayer.isPlaying()) {
                this.mBackgroundMediaPlayer.seekTo(0);
            }
            else {
                this.mBackgroundMediaPlayer.start();
            }
            this.mBackgroundMediaPlayer.setLooping(isLoop);
            this.mPaused = false;
            this.mIsLoop = isLoop;
        }
        catch(Exception unused_ex) {
            Log.e("Cocos2dxMusic", "playBackgroundMusic: error state");
        }
    }

    public void preloadBackgroundMusic(String path) {
        if(this.mCurrentPath == null || !this.mCurrentPath.equals(path)) {
            if(this.mBackgroundMediaPlayer != null) {
                this.mBackgroundMediaPlayer.release();
            }
            this.mBackgroundMediaPlayer = this.createMediaplayer(path);
            this.mCurrentPath = path;
        }
    }

    public void resumeBackgroundMusic() {
        if(this.mBackgroundMediaPlayer != null && this.mPaused) {
            this.mBackgroundMediaPlayer.start();
            this.mPaused = false;
            this.mManualPaused = false;
        }
    }

    public void rewindBackgroundMusic() {
        if(this.mBackgroundMediaPlayer != null) {
            this.playBackgroundMusic(this.mCurrentPath, this.mIsLoop);
        }
    }

    public void setBackgroundVolume(float volume) {
        if(volume < 0.0f) {
            volume = 0.0f;
        }
        if(volume > 1.0f) {
            volume = 1.0f;
        }
        this.mRightVolume = volume;
        this.mLeftVolume = volume;
        if(this.mBackgroundMediaPlayer != null) {
            this.mBackgroundMediaPlayer.setVolume(this.mLeftVolume, this.mRightVolume);
        }
    }

    public void stopBackgroundMusic() {
        if(this.mBackgroundMediaPlayer != null) {
            this.mBackgroundMediaPlayer.release();
            this.mBackgroundMediaPlayer = this.createMediaplayer(this.mCurrentPath);
            this.mPaused = false;
        }
    }
}

