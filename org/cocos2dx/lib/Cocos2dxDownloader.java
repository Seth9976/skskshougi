package org.cocos2dx.lib;

import com.loopj.android.http.AsyncHttpClient;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import javax.net.ssl.SSLException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

public class Cocos2dxDownloader {
    private int _countOfMaxProcessingTasks;
    private AsyncHttpClient _httpClient;
    private int _id;
    private HashMap _taskMap;
    private Queue _taskQueue;
    private String _tempFileNameSufix;

    public Cocos2dxDownloader() {
        this._httpClient = new AsyncHttpClient();
        this._taskMap = new HashMap();
        this._taskQueue = new LinkedList();
    }

    public static void cancelAllRequests(Cocos2dxDownloader downloader) {
        Cocos2dxHelper.getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                for(Object object0: downloader._taskMap.entrySet()) {
                    DownloadTask task = (DownloadTask)((Map.Entry)object0).getValue();
                    if(task.handle != null) {
                        task.handle.cancel(true);
                    }
                }
            }
        });
    }

    public static Cocos2dxDownloader createDownloader(int id, int timeoutInSeconds, String tempFileNameSufix, int countOfMaxProcessingTasks) {
        Cocos2dxDownloader downloader = new Cocos2dxDownloader();
        downloader._id = id;
        downloader._httpClient.setEnableRedirects(true);
        if(timeoutInSeconds > 0) {
            downloader._httpClient.setTimeout(timeoutInSeconds * 1000);
        }
        AsyncHttpClient.allowRetryExceptionClass(SSLException.class);
        downloader._tempFileNameSufix = tempFileNameSufix;
        downloader._countOfMaxProcessingTasks = countOfMaxProcessingTasks;
        return downloader;
    }

    public static void createTask(Cocos2dxDownloader downloader, int id_, String url_, String path_) {
        org.cocos2dx.lib.Cocos2dxDownloader.3 taskRunnable = new Runnable() {
            @Override
            public void run() {
                DownloadTask task = new DownloadTask();
                if(path_.length() == 0) {
                    task.handler = new DataTaskHandler(downloader, id_);
                    task.handle = downloader._httpClient.get(Cocos2dxHelper.getActivity(), url_, task.handler);
                }
                if(path_.length() != 0) {
                    File tempFile = new File(path_ + downloader._tempFileNameSufix);
                    if(!tempFile.isDirectory()) {
                        File file1 = tempFile.getParentFile();
                        if(file1.isDirectory() || file1.mkdirs()) {
                            File finalFile = new File(path_);
                            if(!tempFile.isDirectory()) {
                                task.handler = new FileTaskHandler(downloader, id_, tempFile, finalFile);
                                Header[] headers = null;
                                long v = tempFile.length();
                                if(v > 0L) {
                                    ArrayList list = new ArrayList();
                                    list.add(new BasicHeader("Range", "bytes=" + v + "-"));
                                    headers = (Header[])list.toArray(new Header[list.size()]);
                                }
                                task.handle = downloader._httpClient.get(Cocos2dxHelper.getActivity(), url_, headers, null, task.handler);
                            }
                        }
                    }
                }
                if(task.handle == null) {
                    Cocos2dxHelper.runOnGLThread(new Runnable() {
                        @Override
                        public void run() {
                            int v = org.cocos2dx.lib.Cocos2dxDownloader.3.this.val$downloader._id;
                            org.cocos2dx.lib.Cocos2dxDownloader.3.this.val$downloader.nativeOnFinish(v, org.cocos2dx.lib.Cocos2dxDownloader.3.this.val$id, 0, "Can\'t create DownloadTask for " + this.val$url, null);
                        }
                    });
                    return;
                }
                downloader._taskMap.put(id_, task);
            }
        };
        if(downloader._taskQueue.size() < downloader._countOfMaxProcessingTasks) {
            Cocos2dxHelper.getActivity().runOnUiThread(taskRunnable);
            downloader._taskQueue.add(null);
            return;
        }
        downloader._taskQueue.add(taskRunnable);
    }

    public Runnable dequeue() {
        if(!this._taskQueue.isEmpty() && this._taskQueue.element() == null) {
            this._taskQueue.remove();
        }
        return this._taskQueue.isEmpty() ? null : ((Runnable)this._taskQueue.remove());
    }

    // 检测为 lambda 实现。
    native void nativeOnFinish(int arg1, int arg2, int arg3, String arg4, byte[] arg5) {
    }

    // 检测为 lambda 实现。
    native void nativeOnProgress(int arg1, int arg2, long arg3, long arg4, long arg5) {
    }

    public void onFinish(int id, int errCode, String errStr, byte[] data) {
        if(((DownloadTask)this._taskMap.get(id)) == null) {
            return;
        }
        this._taskMap.remove(id);
        Cocos2dxHelper.runOnGLThread(() -> {
        });

        class org.cocos2dx.lib.Cocos2dxDownloader.2 implements Runnable {
            org.cocos2dx.lib.Cocos2dxDownloader.2(int v, int v1, String s, byte[] arr_b) {
            }

            @Override
            public void run() {
                Cocos2dxDownloader.this.nativeOnFinish(Cocos2dxDownloader.this._id, this.val$id, this.val$errCode, this.val$errStr, this.val$data);
            }
        }

    }

    void onProgress(int id, long downloadBytes, long downloadNow, long downloadTotal) {
        DownloadTask task = (DownloadTask)this._taskMap.get(id);
        if(task != null) {
            task.bytesReceived = downloadBytes;
            task.totalBytesReceived = downloadNow;
            task.totalBytesExpected = downloadTotal;
        }
        Cocos2dxHelper.runOnGLThread(() -> {
        });

        class org.cocos2dx.lib.Cocos2dxDownloader.1 implements Runnable {
            org.cocos2dx.lib.Cocos2dxDownloader.1(int v, long v1, long v2, long v3) {
            }

            @Override
            public void run() {
                Cocos2dxDownloader.this.nativeOnProgress(Cocos2dxDownloader.this._id, this.val$id, this.val$downloadBytes, this.val$downloadNow, this.val$downloadTotal);
            }
        }

    }

    public void onStart(int id) {
        DownloadTask task = (DownloadTask)this._taskMap.get(id);
        if(task != null) {
            task.resetStatus();
        }
    }
}

