package com.loopj.android.http;

import org.apache.http.Header;

public abstract class BaseJsonHttpResponseHandler extends TextHttpResponseHandler {
    private static final String LOG_TAG = "BaseJsonHttpRH";

    public BaseJsonHttpResponseHandler() {
        this("UTF-8");
    }

    public BaseJsonHttpResponseHandler(String encoding) {
        super(encoding);
    }

    @Override  // com.loopj.android.http.TextHttpResponseHandler
    public final void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
        if(responseString != null) {
            com.loopj.android.http.BaseJsonHttpResponseHandler.2 parser = new Runnable() {
                @Override
                public void run() {
                    try {
                        com.loopj.android.http.BaseJsonHttpResponseHandler.2.1 baseJsonHttpResponseHandler$2$10 = new Runnable() {
                            @Override
                            public void run() {
                                BaseJsonHttpResponseHandler.this.onFailure(com.loopj.android.http.BaseJsonHttpResponseHandler.2.this.val$statusCode, com.loopj.android.http.BaseJsonHttpResponseHandler.2.this.val$headers, com.loopj.android.http.BaseJsonHttpResponseHandler.2.this.val$throwable, com.loopj.android.http.BaseJsonHttpResponseHandler.2.this.val$responseString, BaseJsonHttpResponseHandler.this.parseResponse(this.val$responseString, true));
                            }
                        };
                        BaseJsonHttpResponseHandler.this.postRunnable(baseJsonHttpResponseHandler$2$10);
                    }
                    catch(Throwable t) {
                        AsyncHttpClient.log.d("BaseJsonHttpRH", "parseResponse thrown an problem", t);
                        com.loopj.android.http.BaseJsonHttpResponseHandler.2.2 baseJsonHttpResponseHandler$2$20 = new Runnable() {
                            @Override
                            public void run() {
                                BaseJsonHttpResponseHandler.this.onFailure(com.loopj.android.http.BaseJsonHttpResponseHandler.2.this.val$statusCode, com.loopj.android.http.BaseJsonHttpResponseHandler.2.this.val$headers, com.loopj.android.http.BaseJsonHttpResponseHandler.2.this.val$throwable, com.loopj.android.http.BaseJsonHttpResponseHandler.2.this.val$responseString, null);
                            }
                        };
                        BaseJsonHttpResponseHandler.this.postRunnable(baseJsonHttpResponseHandler$2$20);
                    }
                }
            };
            if(!this.getUseSynchronousMode() && !this.getUsePoolThread()) {
                new Thread(parser).start();
                return;
            }
            parser.run();
            return;
        }
        this.onFailure(statusCode, headers, throwable, null, null);
    }

    public abstract void onFailure(int arg1, Header[] arg2, Throwable arg3, String arg4, Object arg5);

    @Override  // com.loopj.android.http.TextHttpResponseHandler
    public final void onSuccess(int statusCode, Header[] headers, String responseString) {
        if(statusCode != 204) {
            com.loopj.android.http.BaseJsonHttpResponseHandler.1 parser = new Runnable() {
                @Override
                public void run() {
                    try {
                        com.loopj.android.http.BaseJsonHttpResponseHandler.1.1 baseJsonHttpResponseHandler$1$10 = new Runnable() {
                            @Override
                            public void run() {
                                BaseJsonHttpResponseHandler.this.onSuccess(com.loopj.android.http.BaseJsonHttpResponseHandler.1.this.val$statusCode, com.loopj.android.http.BaseJsonHttpResponseHandler.1.this.val$headers, com.loopj.android.http.BaseJsonHttpResponseHandler.1.this.val$responseString, BaseJsonHttpResponseHandler.this.parseResponse(this.val$responseString, false));
                            }
                        };
                        BaseJsonHttpResponseHandler.this.postRunnable(baseJsonHttpResponseHandler$1$10);
                    }
                    catch(Throwable t) {
                        AsyncHttpClient.log.d("BaseJsonHttpRH", "parseResponse thrown an problem", t);
                        com.loopj.android.http.BaseJsonHttpResponseHandler.1.2 baseJsonHttpResponseHandler$1$20 = new Runnable() {
                            @Override
                            public void run() {
                                BaseJsonHttpResponseHandler.this.onFailure(com.loopj.android.http.BaseJsonHttpResponseHandler.1.this.val$statusCode, com.loopj.android.http.BaseJsonHttpResponseHandler.1.this.val$headers, t, com.loopj.android.http.BaseJsonHttpResponseHandler.1.this.val$responseString, null);
                            }
                        };
                        BaseJsonHttpResponseHandler.this.postRunnable(baseJsonHttpResponseHandler$1$20);
                    }
                }
            };
            if(!this.getUseSynchronousMode() && !this.getUsePoolThread()) {
                new Thread(parser).start();
                return;
            }
            parser.run();
            return;
        }
        this.onSuccess(204, headers, null, null);
    }

    public abstract void onSuccess(int arg1, Header[] arg2, String arg3, Object arg4);

    protected abstract Object parseResponse(String arg1, boolean arg2) throws Throwable;
}

