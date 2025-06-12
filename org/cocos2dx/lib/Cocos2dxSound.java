package org.cocos2dx.lib;

import android.content.Context;
import android.media.SoundPool.OnLoadCompleteListener;
import android.media.SoundPool;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Cocos2dxSound {
    public class OnLoadCompletedListener implements SoundPool.OnLoadCompleteListener {
        @Override  // android.media.SoundPool$OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
            SoundInfoForLoadedCompleted info;
            if(status == 0) {
                info = (SoundInfoForLoadedCompleted)Cocos2dxSound.this.mPlayWhenLoadedEffects.get(sampleId);
                if(info != null) {
                    info.effectID = Cocos2dxSound.this.doPlayEffect(info.path, sampleId, info.isLoop, info.pitch, info.pan, info.gain);
                    synchronized(info) {
                        info.notifyAll();
                    }
                }
            }
        }
    }

    public class SoundInfoForLoadedCompleted {
        public int effectID;
        public float gain;
        public boolean isLoop;
        public float pan;
        public String path;
        public float pitch;

        public SoundInfoForLoadedCompleted(String path, boolean isLoop, float pitch, float pan, float gain) {
            this.path = path;
            this.isLoop = isLoop;
            this.pitch = pitch;
            this.pan = pan;
            this.gain = gain;
            this.effectID = -1;
        }
    }

    private static final int INVALID_SOUND_ID = -1;
    private static final int INVALID_STREAM_ID = -1;
    private static int LOAD_TIME_OUT = 0;
    private static final int MAX_SIMULTANEOUS_STREAMS_DEFAULT = 5;
    private static final int MAX_SIMULTANEOUS_STREAMS_I9100 = 3;
    private static final int SOUND_PRIORITY = 1;
    private static final int SOUND_QUALITY = 5;
    private static final float SOUND_RATE = 1.0f;
    private static final String TAG = "Cocos2dxSound";
    private final Context mContext;
    private float mLeftVolume;
    private final HashMap mPathSoundIDMap;
    private final HashMap mPathStreamIDsMap;
    private ConcurrentHashMap mPlayWhenLoadedEffects;
    private float mRightVolume;
    private SoundPool mSoundPool;

    static {
        Cocos2dxSound.LOAD_TIME_OUT = 500;
    }

    public Cocos2dxSound(Context context) {
        this.mPathStreamIDsMap = new HashMap();
        this.mPathSoundIDMap = new HashMap();
        this.mPlayWhenLoadedEffects = new ConcurrentHashMap();
        this.mContext = context;
        this.initData();
    }

    private float clamp(float value, float min, float max) {
        return Math.max(min, Math.min(value, max));
    }

    public int createSoundIDFromAsset(String path) {
        int soundID;
        try {
            if(path.startsWith("/")) {
                soundID = this.mSoundPool.load(path, 0);
                return soundID == 0 ? -1 : soundID;
            }
            soundID = this.mSoundPool.load(this.mContext.getAssets().openFd(path), 0);
            return soundID == 0 ? -1 : soundID;
        }
        catch(Exception e) {
            Log.e("Cocos2dxSound", "error: " + e.getMessage(), e);
            return -1;
        }
    }

    private int doPlayEffect(String path, int soundId, boolean loop, float pitch, float pan, float gain) {
        int v1 = this.mSoundPool.play(soundId, this.clamp(this.mLeftVolume * gain * (1.0f - this.clamp(pan, 0.0f, 1.0f)), 0.0f, 1.0f), this.clamp(this.mRightVolume * gain * (1.0f - this.clamp(-pan, 0.0f, 1.0f)), 0.0f, 1.0f), 1, (loop ? -1 : 0), this.clamp(1.0f * pitch, 0.5f, 2.0f));
        ArrayList streamIDs = (ArrayList)this.mPathStreamIDsMap.get(path);
        if(streamIDs == null) {
            streamIDs = new ArrayList();
            this.mPathStreamIDsMap.put(path, streamIDs);
        }
        streamIDs.add(v1);
        return v1;
    }

    public void end() {
        this.mSoundPool.release();
        this.mPathStreamIDsMap.clear();
        this.mPathSoundIDMap.clear();
        this.mPlayWhenLoadedEffects.clear();
        this.mLeftVolume = 0.5f;
        this.mRightVolume = 0.5f;
        this.initData();
    }

    public float getEffectsVolume() {
        return (this.mLeftVolume + this.mRightVolume) / 2.0f;
    }

    private void initData() {
        this.mSoundPool = Cocos2dxHelper.getDeviceModel().contains("GT-I9100") ? new SoundPool(3, 3, 5) : new SoundPool(5, 3, 5);
        this.mSoundPool.setOnLoadCompleteListener(new OnLoadCompletedListener(this));
        this.mLeftVolume = 0.5f;
        this.mRightVolume = 0.5f;
    }

    public void onEnterBackground() {
        this.mSoundPool.autoPause();
    }

    public void onEnterForeground() {
        this.mSoundPool.autoResume();
    }

    public void pauseAllEffects() {
        if(!this.mPathStreamIDsMap.isEmpty()) {
            for(Object object0: this.mPathStreamIDsMap.entrySet()) {
                for(Object object1: ((ArrayList)((Map.Entry)object0).getValue())) {
                    this.mSoundPool.pause(((int)(((Integer)object1))));
                }
            }
        }
    }

    public void pauseEffect(int steamID) {
        this.mSoundPool.pause(steamID);
    }

    public int playEffect(String path, boolean loop, float pitch, float pan, float gain) {
        Integer soundID = (Integer)this.mPathSoundIDMap.get(path);
        if(soundID != null) {
            return this.doPlayEffect(path, ((int)soundID), loop, pitch, pan, gain);
        }
        Integer soundID = this.preloadEffect(path);
        if(((int)soundID) != -1) {
            SoundInfoForLoadedCompleted info = new SoundInfoForLoadedCompleted(this, path, loop, pitch, pan, gain);
            this.mPlayWhenLoadedEffects.putIfAbsent(soundID, info);
            synchronized(info) {
                try {
                    info.wait(((long)Cocos2dxSound.LOAD_TIME_OUT));
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
            int streamID = info.effectID;
            this.mPlayWhenLoadedEffects.remove(soundID);
            return streamID;
        }
        return -1;
    }

    public int preloadEffect(String path) {
        Integer soundID = (Integer)this.mPathSoundIDMap.get(path);
        if(soundID == null) {
            soundID = this.createSoundIDFromAsset(path);
            if(((int)soundID) != -1) {
                this.mPathSoundIDMap.put(path, soundID);
            }
        }
        return (int)soundID;
    }

    public void resumeAllEffects() {
        if(!this.mPathStreamIDsMap.isEmpty()) {
            for(Object object0: this.mPathStreamIDsMap.entrySet()) {
                for(Object object1: ((ArrayList)((Map.Entry)object0).getValue())) {
                    this.mSoundPool.resume(((int)(((Integer)object1))));
                }
            }
        }
    }

    public void resumeEffect(int steamID) {
        this.mSoundPool.resume(steamID);
    }

    public void setEffectsVolume(float volume) {
        if(volume < 0.0f) {
            volume = 0.0f;
        }
        if(volume > 1.0f) {
            volume = 1.0f;
        }
        this.mRightVolume = volume;
        this.mLeftVolume = volume;
        if(!this.mPathStreamIDsMap.isEmpty()) {
            for(Object object0: this.mPathStreamIDsMap.entrySet()) {
                for(Object object1: ((ArrayList)((Map.Entry)object0).getValue())) {
                    this.mSoundPool.setVolume(((int)(((Integer)object1))), this.mLeftVolume, this.mRightVolume);
                }
            }
        }
    }

    public void stopAllEffects() {
        if(!this.mPathStreamIDsMap.isEmpty()) {
            for(Object object0: this.mPathStreamIDsMap.entrySet()) {
                for(Object object1: ((ArrayList)((Map.Entry)object0).getValue())) {
                    this.mSoundPool.stop(((int)(((Integer)object1))));
                }
            }
        }
        this.mPathStreamIDsMap.clear();
    }

    public void stopEffect(int steamID) {
        this.mSoundPool.stop(steamID);
        for(Object object0: this.mPathStreamIDsMap.keySet()) {
            String pPath = (String)object0;
            if(((ArrayList)this.mPathStreamIDsMap.get(pPath)).contains(steamID)) {
                ((ArrayList)this.mPathStreamIDsMap.get(pPath)).remove(((ArrayList)this.mPathStreamIDsMap.get(pPath)).indexOf(steamID));
                return;
            }
            if(false) {
                break;
            }
        }
    }

    public void unloadEffect(String path) {
        ArrayList streamIDs = (ArrayList)this.mPathStreamIDsMap.get(path);
        if(streamIDs != null) {
            for(Object object0: streamIDs) {
                this.mSoundPool.stop(((int)(((Integer)object0))));
            }
        }
        this.mPathStreamIDsMap.remove(path);
        Integer soundID = (Integer)this.mPathSoundIDMap.get(path);
        if(soundID != null) {
            this.mSoundPool.unload(((int)soundID));
            this.mPathSoundIDMap.remove(path);
        }
    }
}

