package org.cocos2dx.lib;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

public class Cocos2dxVideoHelper {
    class VideoEventRunnable implements Runnable {
        private int mVideoEvent;
        private int mVideoTag;

        public VideoEventRunnable(int tag, int event) {
            this.mVideoTag = tag;
            this.mVideoEvent = event;
        }

        @Override
        public void run() {
            Cocos2dxVideoHelper.nativeExecuteVideoCallback(this.mVideoTag, this.mVideoEvent);
        }
    }

    static class VideoHandler extends Handler {
        WeakReference mReference;

        VideoHandler(Cocos2dxVideoHelper helper) {
            this.mReference = new WeakReference(helper);
        }

        @Override  // android.os.Handler
        public void handleMessage(Message msg) {
            switch(msg.what) {
                case 0: {
                    ((Cocos2dxVideoHelper)this.mReference.get())._createVideoView(msg.arg1);
                    break;
                }
                case 1: {
                    ((Cocos2dxVideoHelper)this.mReference.get())._removeVideoView(msg.arg1);
                    break;
                }
                case 2: {
                    ((Cocos2dxVideoHelper)this.mReference.get())._setVideoURL(msg.arg1, msg.arg2, ((String)msg.obj));
                    break;
                }
                case 3: {
                    ((Cocos2dxVideoHelper)this.mReference.get())._setVideoRect(msg.arg1, ((Rect)msg.obj).left, ((Rect)msg.obj).top, ((Rect)msg.obj).right, ((Rect)msg.obj).bottom);
                    break;
                }
                case 4: {
                    ((Cocos2dxVideoHelper)this.mReference.get())._startVideo(msg.arg1);
                    break;
                }
                case 5: {
                    ((Cocos2dxVideoHelper)this.mReference.get())._pauseVideo(msg.arg1);
                    break;
                }
                case 6: {
                    ((Cocos2dxVideoHelper)this.mReference.get())._resumeVideo(msg.arg1);
                    break;
                }
                case 7: {
                    ((Cocos2dxVideoHelper)this.mReference.get())._stopVideo(msg.arg1);
                    break;
                }
                case 8: {
                    ((Cocos2dxVideoHelper)this.mReference.get())._seekVideoTo(msg.arg1, msg.arg2);
                    break;
                }
                case 9: {
                    Cocos2dxVideoHelper helper = (Cocos2dxVideoHelper)this.mReference.get();
                    if(msg.arg2 == 1) {
                        helper._setVideoVisible(msg.arg1, true);
                    }
                    else {
                        helper._setVideoVisible(msg.arg1, false);
                    }
                    break;
                }
                case 10: {
                    ((Cocos2dxVideoHelper)this.mReference.get())._restartVideo(msg.arg1);
                    break;
                }
                case 11: {
                    Cocos2dxVideoHelper helper = (Cocos2dxVideoHelper)this.mReference.get();
                    if(msg.arg2 == 1) {
                        helper._setVideoKeepRatio(msg.arg1, true);
                    }
                    else {
                        helper._setVideoKeepRatio(msg.arg1, false);
                    }
                    break;
                }
                case 12: {
                    Cocos2dxVideoHelper helper = (Cocos2dxVideoHelper)this.mReference.get();
                    Rect rect = (Rect)msg.obj;
                    if(msg.arg2 == 1) {
                        helper._setFullScreenEnabled(msg.arg1, true, rect.right, rect.bottom);
                    }
                    else {
                        helper._setFullScreenEnabled(msg.arg1, false, rect.right, rect.bottom);
                    }
                    break;
                }
                case 1000: {
                    ((Cocos2dxVideoHelper)this.mReference.get()).onBackKeyEvent();
                }
            }
            super.handleMessage(msg);
        }
    }

    static final int KeyEventBack = 1000;
    private static final int VideoTaskCreate = 0;
    private static final int VideoTaskFullScreen = 12;
    private static final int VideoTaskKeepRatio = 11;
    private static final int VideoTaskPause = 5;
    private static final int VideoTaskRemove = 1;
    private static final int VideoTaskRestart = 10;
    private static final int VideoTaskResume = 6;
    private static final int VideoTaskSeek = 8;
    private static final int VideoTaskSetRect = 3;
    private static final int VideoTaskSetSource = 2;
    private static final int VideoTaskSetVisible = 9;
    private static final int VideoTaskStart = 4;
    private static final int VideoTaskStop = 7;
    private Cocos2dxActivity mActivity;
    private FrameLayout mLayout;
    static VideoHandler mVideoHandler;
    private SparseArray sVideoViews;
    OnVideoEventListener videoEventListener;
    private static int videoTag;

    static {
        Cocos2dxVideoHelper.mVideoHandler = null;
        Cocos2dxVideoHelper.videoTag = 0;
    }

    Cocos2dxVideoHelper(Cocos2dxActivity activity, FrameLayout layout) {
        this.mLayout = null;
        this.mActivity = null;
        this.sVideoViews = null;
        this.videoEventListener = new OnVideoEventListener() {
            @Override  // org.cocos2dx.lib.Cocos2dxVideoView$OnVideoEventListener
            public void onVideoEvent(int tag, int event) {
                Cocos2dxVideoHelper.this.mActivity.runOnGLThread(new VideoEventRunnable(Cocos2dxVideoHelper.this, tag, event));
            }
        };
        this.mActivity = activity;
        this.mLayout = layout;
        Cocos2dxVideoHelper.mVideoHandler = new VideoHandler(this);
        this.sVideoViews = new SparseArray();
    }

    private void _createVideoView(int index) {
        Cocos2dxVideoView videoView = new Cocos2dxVideoView(this.mActivity, index);
        this.sVideoViews.put(index, videoView);
        FrameLayout.LayoutParams lParams = new FrameLayout.LayoutParams(-2, -2);
        this.mLayout.addView(videoView, lParams);
        videoView.setZOrderOnTop(true);
        videoView.setOnCompletionListener(this.videoEventListener);
    }

    private void _pauseVideo(int index) {
        Cocos2dxVideoView videoView = (Cocos2dxVideoView)this.sVideoViews.get(index);
        if(videoView != null) {
            videoView.pause();
        }
    }

    private void _removeVideoView(int index) {
        Cocos2dxVideoView view = (Cocos2dxVideoView)this.sVideoViews.get(index);
        if(view != null) {
            view.stopPlayback();
            this.sVideoViews.remove(index);
            this.mLayout.removeView(view);
        }
    }

    private void _restartVideo(int index) {
        Cocos2dxVideoView videoView = (Cocos2dxVideoView)this.sVideoViews.get(index);
        if(videoView != null) {
            videoView.restart();
        }
    }

    private void _resumeVideo(int index) {
        Cocos2dxVideoView videoView = (Cocos2dxVideoView)this.sVideoViews.get(index);
        if(videoView != null) {
            videoView.resume();
        }
    }

    private void _seekVideoTo(int index, int msec) {
        Cocos2dxVideoView videoView = (Cocos2dxVideoView)this.sVideoViews.get(index);
        if(videoView != null) {
            videoView.seekTo(msec);
        }
    }

    private void _setFullScreenEnabled(int index, boolean enabled, int width, int height) {
        Cocos2dxVideoView videoView = (Cocos2dxVideoView)this.sVideoViews.get(index);
        if(videoView != null) {
            videoView.setFullScreenEnabled(enabled, width, height);
        }
    }

    private void _setVideoKeepRatio(int index, boolean enable) {
        Cocos2dxVideoView videoView = (Cocos2dxVideoView)this.sVideoViews.get(index);
        if(videoView != null) {
            videoView.setKeepRatio(enable);
        }
    }

    private void _setVideoRect(int index, int left, int top, int maxWidth, int maxHeight) {
        Cocos2dxVideoView videoView = (Cocos2dxVideoView)this.sVideoViews.get(index);
        if(videoView != null) {
            videoView.setVideoRect(left, top, maxWidth, maxHeight);
        }
    }

    private void _setVideoURL(int index, int videoSource, String videoUrl) {
        Cocos2dxVideoView videoView = (Cocos2dxVideoView)this.sVideoViews.get(index);
        if(videoView != null) {
            switch(videoSource) {
                case 0: {
                    videoView.setVideoFileName(videoUrl);
                    return;
                }
                case 1: {
                    videoView.setVideoURL(videoUrl);
                }
            }
        }
    }

    private void _setVideoVisible(int index, boolean visible) {
        Cocos2dxVideoView videoView = (Cocos2dxVideoView)this.sVideoViews.get(index);
        if(videoView != null) {
            if(visible) {
                videoView.fixSize();
                videoView.setVisibility(0);
                return;
            }
            videoView.setVisibility(4);
        }
    }

    private void _startVideo(int index) {
        Cocos2dxVideoView videoView = (Cocos2dxVideoView)this.sVideoViews.get(index);
        if(videoView != null) {
            videoView.start();
        }
    }

    private void _stopVideo(int index) {
        Cocos2dxVideoView videoView = (Cocos2dxVideoView)this.sVideoViews.get(index);
        if(videoView != null) {
            videoView.stop();
        }
    }

    public static int createVideoWidget() {
        Message msg = new Message();
        msg.what = 0;
        msg.arg1 = Cocos2dxVideoHelper.videoTag;
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
        int v = Cocos2dxVideoHelper.videoTag;
        Cocos2dxVideoHelper.videoTag = v + 1;
        return v;
    }

    // 检测为 lambda 实现。
    public static native void nativeExecuteVideoCallback(int arg0, int arg1) {
    }

    private void onBackKeyEvent() {
        int v = this.sVideoViews.size();
        for(int i = 0; i < v; ++i) {
            int v2 = this.sVideoViews.keyAt(i);
            Cocos2dxVideoView videoView = (Cocos2dxVideoView)this.sVideoViews.get(v2);
            if(videoView != null) {
                videoView.setFullScreenEnabled(false, 0, 0);
                this.mActivity.runOnGLThread(() -> {
                });
            }
        }
    }

    public static void pauseVideo(int index) {
        Message msg = new Message();
        msg.what = 5;
        msg.arg1 = index;
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
    }

    public static void removeVideoWidget(int index) {
        Message msg = new Message();
        msg.what = 1;
        msg.arg1 = index;
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
    }

    public static void restartVideo(int index) {
        Message msg = new Message();
        msg.what = 10;
        msg.arg1 = index;
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
    }

    public static void resumeVideo(int index) {
        Message msg = new Message();
        msg.what = 6;
        msg.arg1 = index;
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
    }

    public static void seekVideoTo(int index, int msec) {
        Message msg = new Message();
        msg.what = 8;
        msg.arg1 = index;
        msg.arg2 = msec;
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
    }

    public static void setFullScreenEnabled(int index, boolean enabled, int width, int height) {
        Message msg = new Message();
        msg.what = 12;
        msg.arg1 = index;
        msg.arg2 = enabled ? 1 : 0;
        msg.obj = new Rect(0, 0, width, height);
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
    }

    public static void setVideoKeepRatioEnabled(int index, boolean enable) {
        Message msg = new Message();
        msg.what = 11;
        msg.arg1 = index;
        msg.arg2 = enable ? 1 : 0;
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
    }

    public static void setVideoRect(int index, int left, int top, int maxWidth, int maxHeight) {
        Message msg = new Message();
        msg.what = 3;
        msg.arg1 = index;
        msg.obj = new Rect(left, top, maxWidth, maxHeight);
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
    }

    public static void setVideoUrl(int index, int videoSource, String videoUrl) {
        Message msg = new Message();
        msg.what = 2;
        msg.arg1 = index;
        msg.arg2 = videoSource;
        msg.obj = videoUrl;
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
    }

    public static void setVideoVisible(int index, boolean visible) {
        Message msg = new Message();
        msg.what = 9;
        msg.arg1 = index;
        msg.arg2 = visible ? 1 : 0;
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
    }

    public static void startVideo(int index) {
        Message msg = new Message();
        msg.what = 4;
        msg.arg1 = index;
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
    }

    public static void stopVideo(int index) {
        Message msg = new Message();
        msg.what = 7;
        msg.arg1 = index;
        Cocos2dxVideoHelper.mVideoHandler.sendMessage(msg);
    }
}

