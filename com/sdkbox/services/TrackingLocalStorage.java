package com.sdkbox.services;

import com.sdkbox.plugin.SdkboxLog;
import com.sdkbox.plugin.TrackingInfoAndroid;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.TWR;

public class TrackingLocalStorage {
    class Condition {
        private boolean condition;
        private boolean isFalse;

        Condition() {
            this.condition = false;
            this.isFalse = false;
        }

        public boolean isFalse() {
            return this.condition;
        }

        public boolean isTrue() {
            return this.condition;
        }

        public void setFalse() {
            synchronized(this) {
                this.isFalse = true;
                this.notifyAll();
            }
        }

        public void setTrue() {
            synchronized(this) {
                this.condition = true;
                this.notifyAll();
            }
        }

        public void waitForTrue() throws InterruptedException, TimeoutException {
            synchronized(this) {
                this.waitForTrue(0x7FFFFFFFFFFFFFFFL);
            }
        }

        public void waitForTrue(long millis) throws InterruptedException, TimeoutException {
            synchronized(this) {
                if(this.condition) {
                    this.notifyAll();
                }
                else {
                    long t = 0L;
                    for(long ct = System.currentTimeMillis(); !this.condition && t < millis && !this.isFalse; ct = v4) {
                        this.wait();
                        long v4 = System.currentTimeMillis();
                        t += v4 - ct;
                    }
                    if(t >= millis) {
                        throw new TimeoutException();
                    }
                }
            }
        }
    }

    interface SyncWorkerListener {
        void onSynchronizationEnds(boolean arg1);
    }

    class TrackingDescriptor {
        public String url;

        public TrackingDescriptor() {
            this.url = null;
        }

        public TrackingDescriptor(String url) {
            this.url = url;
        }

        public void read(BufferedReader r) throws IOException {
            this.url = r.readLine();
        }

        public void save(BufferedWriter w) throws IOException {
            w.write(this.url);
        }
    }

    class TrackingLocalStorageThreadFactory implements ThreadFactory {
        private AtomicInteger index;

        private TrackingLocalStorageThreadFactory() {
            this.index = new AtomicInteger();
        }

        TrackingLocalStorageThreadFactory(com.sdkbox.services.TrackingLocalStorage.1 x1) {
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setName("TrackingLocalStorage_" + this.index.getAndIncrement());
            t.setDaemon(true);
            return t;
        }
    }

    class TrackingSyncWorker implements Runnable {
        private final String url;
        private final SyncWorkerListener workerListener;

        TrackingSyncWorker(String url, SyncWorkerListener l) {
            this.workerListener = l;
            this.url = url;
        }

        @Override
        public void run() {
            boolean tracked = false;
            if(TrackingInfoAndroid.IsNetworkAvailable()) {
                Condition c = new Condition(TrackingLocalStorage.this);
                XMLHttpRequest req = new XMLHttpRequest();
                req.addEventListener(new HttpRequestListenerAdapter() {
                    @Override  // com.sdkbox.services.HttpRequestListenerAdapter
                    public void onAbort(HttpRequest request) {
                        c.setFalse();
                    }

                    @Override  // com.sdkbox.services.HttpRequestListenerAdapter
                    public void onError(HttpRequest request, String description) {
                        c.setFalse();
                    }

                    @Override  // com.sdkbox.services.HttpRequestListenerAdapter
                    public void onLoad(HttpRequest request) {
                        c.setTrue();
                    }

                    @Override  // com.sdkbox.services.HttpRequestListenerAdapter
                    public void onTimeout(HttpRequest request) {
                        c.setFalse();
                    }
                });
                req.send("GET", this.url, true);
                try {
                    c.waitForTrue(2000L);
                    if(c.isTrue()) {
                        tracked = true;
                    }
                    else {
                        SdkboxLog.d("SDKBOX_CORE", "Track pending request error:\'" + this.url + "\'", new Object[0]);
                    }
                }
                catch(InterruptedException unused_ex) {
                    SdkboxLog.d("SDKBOX_CORE", "Tracking storage interrupted exception.", new Object[0]);
                }
                catch(TimeoutException unused_ex) {
                    SdkboxLog.d("SDKBOX_CORE", "Tracking storage timeout.", new Object[0]);
                }
            }
            else {
                SdkboxLog.d("SDKBOX_CORE", "Network not available while _syncing pending tracking.", new Object[0]);
            }
            this.workerListener.onSynchronizationEnds(tracked);
        }
    }

    public static final int MAX_SIZE = 100;
    public static final String TAG = "SDKBOX_CORE";
    public static final String TRACKING_FILE = "sdkbox_track";
    private ArrayList _elements;
    private ExecutorService _serial_queue;
    private boolean _syncing;

    public TrackingLocalStorage() {
        this._serial_queue = null;
        this._syncing = false;
        this._elements = new ArrayList(100);
        this._serial_queue = Executors.newSingleThreadExecutor(new TrackingLocalStorageThreadFactory(this, null));
        this.loadTracking();
        this.sync();
    }

    protected void add(TrackingDescriptor td, int pos) {
        this._serial_queue.execute(new Runnable() {
            @Override
            public void run() {
                int p = pos;
                if(TrackingLocalStorage.this._elements.size() == 100) {
                    TrackingLocalStorage.this._elements.remove(0);
                    --p;
                }
                try {
                    TrackingLocalStorage.this._elements.add(p, td);
                }
                catch(Exception unused_ex) {
                    SdkboxLog.d("SDKBOX_CORE", "Event Queue full.", new Object[0]);
                    TrackingLocalStorage.this._elements.add(td);
                }
                TrackingLocalStorage.this.sync();
            }
        });
    }

    public void add(String url) {
        this.add(new TrackingDescriptor(this, url), this._elements.size());
    }

    private void loadTracking() {
        DataInputStream freader;
        DataInputStream freader = null;
        try {
            freader = new DataInputStream(new BufferedInputStream(FileUtils.getFileInputAtInternalFolderPath("sdkbox_track")));
            goto label_5;
        }
        catch(Exception exception0) {
            goto label_13;
            try {
            label_5:
                while(freader.available() > 0) {
                    TrackingDescriptor e = new TrackingDescriptor(this, freader.readUTF());
                    this._elements.add(e);
                }
                SdkboxLog.d("SDKBOX_CORE", "Loaded " + this._elements.size() + " tracking info _elements.", new Object[0]);
                goto label_26;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                goto label_24;
            }
            freader = freader;
            try {
            label_13:
                SdkboxLog.d("SDKBOX_CORE", "Can\'t load tracking info: " + exception0.toString(), new Object[0]);
                goto label_18;
            }
            catch(Throwable throwable0) {
            }
            goto label_16;
        }
        catch(Throwable throwable0) {
        label_16:
            TWR.safeClose$NT(freader, throwable0);
            throw throwable0;
        }
    label_18:
        if(freader != null) {
            try {
                freader.close();
            }
            catch(Exception unused_ex) {
            }
            return;
        }
        return;
    label_24:
        TWR.safeClose$NT(freader, throwable0);
        throw throwable0;
        try {
        label_26:
            freader.close();
        }
        catch(Exception unused_ex) {
        }
    }

    protected void removeFront() {
        this._serial_queue.execute(new Runnable() {
            @Override
            public void run() {
                if(TrackingLocalStorage.this._elements.size() > 0) {
                    TrackingLocalStorage.this._elements.remove(0);
                }
            }
        });
    }

    protected void saveTracking() {
        DataOutputStream _w;
        try {
            try {
                _w = null;
                _w = new DataOutputStream(new BufferedOutputStream(FileUtils.getFileOutputAtInternalFolderPath("sdkbox_track")));
                Iterator iterator0 = this._elements.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_17;
                    }
                    Object object0 = iterator0.next();
                    _w.writeUTF(((TrackingDescriptor)object0).url);
                }
            }
            catch(Exception exception0) {
            }
            SdkboxLog.d("SDKBOX_CORE", "Can\'t save tracking info: " + exception0.toString(), new Object[0]);
            if(_w != null) {
                goto label_10;
            }
            return;
        }
        catch(Throwable throwable0) {
            goto label_15;
        }
        try {
        label_10:
            _w.close();
        }
        catch(Exception unused_ex) {
        }
        return;
    label_15:
        TWR.safeClose$NT(_w, throwable0);
        throw throwable0;
        try {
        label_17:
            _w.close();
        }
        catch(Exception unused_ex) {
        }
    }

    public void sync() {
        synchronized(this) {
            if(this._elements.size() == 0 || !TrackingInfoAndroid.IsNetworkAvailable()) {
                this._syncing = false;
                this.saveTracking();
            }
            else if(!this._syncing) {
                this._syncing = true;
                this._serial_queue.execute(new TrackingSyncWorker(this, ((TrackingDescriptor)this._elements.get(0)).url, new SyncWorkerListener() {
                    @Override  // com.sdkbox.services.TrackingLocalStorage$SyncWorkerListener
                    public void onSynchronizationEnds(boolean tracked) {
                        TrackingLocalStorage.this._syncing = false;
                        if(tracked) {
                            TrackingLocalStorage.this.removeFront();
                            TrackingLocalStorage.this.saveTracking();
                        }
                        TrackingLocalStorage.this.sync();
                    }
                }));
            }
        }
    }
}

