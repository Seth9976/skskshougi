package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class AbstractPendingResult implements PendingResult {
    public static class CallbackHandler extends Handler {
        public static final int CALLBACK_ON_COMPLETE = 1;
        public static final int CALLBACK_ON_TIMEOUT = 2;

        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }

        protected void deliverResultCallback(ResultCallback resultCallback0, Result result0) {
            try {
                resultCallback0.onResult(result0);
            }
            catch(RuntimeException runtimeException0) {
                AbstractPendingResult.zzb(result0);
                throw runtimeException0;
            }
        }

        @Override  // android.os.Handler
        public void handleMessage(Message msg) {
            switch(msg.what) {
                case 1: {
                    Pair pair0 = (Pair)msg.obj;
                    this.deliverResultCallback(((ResultCallback)pair0.first), ((Result)pair0.second));
                    return;
                }
                case 2: {
                    ((AbstractPendingResult)msg.obj).forceFailureUnlessReady(Status.zzXS);
                    return;
                }
                default: {
                    Log.wtf("AbstractPendingResult", "Don\'t know how to handle this message.");
                }
            }
        }

        public void removeTimeoutMessages() {
            this.removeMessages(2);
        }

        public void sendResultCallback(ResultCallback resultCallback0, Result result0) {
            this.sendMessage(this.obtainMessage(1, new Pair(resultCallback0, result0)));
        }

        public void sendTimeoutResultCallback(AbstractPendingResult abstractPendingResult0, long millis) {
            this.sendMessageDelayed(this.obtainMessage(2, abstractPendingResult0), millis);
        }
    }

    protected final CallbackHandler mHandler;
    private boolean zzL;
    private final Object zzWb;
    private final ArrayList zzWc;
    private ResultCallback zzWd;
    private volatile Result zzWe;
    private volatile boolean zzWf;
    private boolean zzWg;
    private ICancelToken zzWh;
    private final CountDownLatch zzoD;

    protected AbstractPendingResult(Looper looper) {
        this.zzWb = new Object();
        this.zzoD = new CountDownLatch(1);
        this.zzWc = new ArrayList();
        this.mHandler = new CallbackHandler(looper);
    }

    protected AbstractPendingResult(CallbackHandler abstractPendingResult$CallbackHandler0) {
        this.zzWb = new Object();
        this.zzoD = new CountDownLatch(1);
        this.zzWc = new ArrayList();
        this.mHandler = (CallbackHandler)zzu.zzb(abstractPendingResult$CallbackHandler0, "CallbackHandler must not be null");
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final void addBatchCallback(BatchCallback callback) {
        Object object0;
        boolean z;
        z = this.zzWf ? false : true;
        zzu.zza(z, "Result has already been consumed.");
        object0 = this.zzWb;
        synchronized(object0) {
            if(this.isReady()) {
                callback.zzs(this.zzWe.getStatus());
            }
            else {
                this.zzWc.add(callback);
            }
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final Result await() {
        boolean z = true;
        zzu.zza(Looper.myLooper() != Looper.getMainLooper(), "await must not be called on the UI thread");
        if(this.zzWf) {
            z = false;
        }
        zzu.zza(z, "Result has already been consumed");
        try {
            this.zzoD.await();
        }
        catch(InterruptedException unused_ex) {
            this.forceFailureUnlessReady(Status.zzXQ);
        }
        zzu.zza(this.isReady(), "Result is not ready.");
        return this.zzmo();
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final Result await(long time, TimeUnit units) {
        boolean z = true;
        zzu.zza(time <= 0L || Looper.myLooper() != Looper.getMainLooper(), "await must not be called on the UI thread when time is greater than zero.");
        if(this.zzWf) {
            z = false;
        }
        zzu.zza(z, "Result has already been consumed.");
        try {
            if(!this.zzoD.await(time, units)) {
                this.forceFailureUnlessReady(Status.zzXS);
            }
        }
        catch(InterruptedException unused_ex) {
            this.forceFailureUnlessReady(Status.zzXQ);
        }
        zzu.zza(this.isReady(), "Result is not ready.");
        return this.zzmo();
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public void cancel() {
        synchronized(this.zzWb) {
            if(this.zzL || this.zzWf) {
                return;
            }
            if(this.zzWh != null) {
                try {
                    this.zzWh.cancel();
                }
                catch(RemoteException unused_ex) {
                }
            }
            AbstractPendingResult.zzb(this.zzWe);
            this.zzWd = null;
            this.zzL = true;
            this.zza(this.createFailedResult(Status.zzXT));
        }
    }

    protected abstract Result createFailedResult(Status arg1);

    public final void forceFailureUnlessReady(Status status) {
        synchronized(this.zzWb) {
            if(!this.isReady()) {
                this.setResult(this.createFailedResult(status));
                this.zzWg = true;
            }
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public boolean isCanceled() {
        synchronized(this.zzWb) {
        }
        return this.zzL;
    }

    public final boolean isReady() {
        return this.zzoD.getCount() == 0L;
    }

    protected void onResultConsumed() {
    }

    protected final void setCancelToken(ICancelToken cancelToken) {
        synchronized(this.zzWb) {
            this.zzWh = cancelToken;
        }
    }

    public final void setResult(Result result0) {
        boolean z = true;
        synchronized(this.zzWb) {
            if(this.zzWg || this.zzL) {
                AbstractPendingResult.zzb(result0);
                return;
            }
            zzu.zza(!this.isReady(), "Results have already been set");
            if(this.zzWf) {
                z = false;
            }
            zzu.zza(z, "Result has already been consumed");
            this.zza(result0);
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(ResultCallback resultCallback0) {
        Object object0;
        boolean z;
        z = this.zzWf ? false : true;
        zzu.zza(z, "Result has already been consumed.");
        object0 = this.zzWb;
        synchronized(object0) {
            if(!this.isCanceled()) {
                if(this.isReady()) {
                    Result result0 = this.zzmo();
                    this.mHandler.sendResultCallback(resultCallback0, result0);
                }
                else {
                    this.zzWd = resultCallback0;
                }
            }
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(ResultCallback resultCallback0, long time, TimeUnit units) {
        Object object0;
        boolean z;
        z = this.zzWf ? false : true;
        zzu.zza(z, "Result has already been consumed.");
        object0 = this.zzWb;
        synchronized(object0) {
            if(!this.isCanceled()) {
                if(this.isReady()) {
                    Result result0 = this.zzmo();
                    this.mHandler.sendResultCallback(resultCallback0, result0);
                }
                else {
                    this.zzWd = resultCallback0;
                    long v1 = units.toMillis(time);
                    this.mHandler.sendTimeoutResultCallback(this, v1);
                }
            }
        }
    }

    private void zza(Result result0) {
        this.zzWe = result0;
        this.zzWh = null;
        this.zzoD.countDown();
        Status status0 = this.zzWe.getStatus();
        if(this.zzWd != null) {
            this.mHandler.removeTimeoutMessages();
            if(!this.zzL) {
                ResultCallback resultCallback0 = this.zzWd;
                Result result1 = this.zzmo();
                this.mHandler.sendResultCallback(resultCallback0, result1);
            }
        }
        for(Object object0: this.zzWc) {
            ((BatchCallback)object0).zzs(status0);
        }
        this.zzWc.clear();
    }

    static void zzb(Result result0) {
        if(result0 instanceof Releasable) {
            try {
                ((Releasable)result0).release();
            }
            catch(RuntimeException runtimeException0) {
                Log.w("AbstractPendingResult", "Unable to release " + result0, runtimeException0);
            }
        }
    }

    private Result zzmo() {
        Result result0;
        boolean z = true;
        synchronized(this.zzWb) {
            if(this.zzWf) {
                z = false;
            }
            zzu.zza(z, "Result has already been consumed.");
            zzu.zza(this.isReady(), "Result is not ready.");
            result0 = this.zzWe;
            this.zzWe = null;
            this.zzWd = null;
            this.zzWf = true;
        }
        this.onResultConsumed();
        return result0;
    }
}

