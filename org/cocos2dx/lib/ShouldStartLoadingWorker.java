package org.cocos2dx.lib;

import java.util.concurrent.CountDownLatch;

class ShouldStartLoadingWorker implements Runnable {
    private CountDownLatch mLatch;
    private boolean[] mResult;
    private final String mUrlString;
    private final int mViewTag;

    ShouldStartLoadingWorker(CountDownLatch latch, boolean[] result, int viewTag, String urlString) {
        this.mLatch = latch;
        this.mResult = result;
        this.mViewTag = viewTag;
        this.mUrlString = urlString;
    }

    @Override
    public void run() {
        boolean[] arr_z = this.mResult;
        arr_z[0] = Cocos2dxWebViewHelper._shouldStartLoading(this.mViewTag, this.mUrlString);
        this.mLatch.countDown();
    }
}

