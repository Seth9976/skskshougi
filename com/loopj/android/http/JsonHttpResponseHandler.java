package com.loopj.android.http;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHttpResponseHandler extends TextHttpResponseHandler {
    private static final String LOG_TAG = "JsonHttpRH";
    private boolean useRFC5179CompatibilityMode;

    public JsonHttpResponseHandler() {
        super("UTF-8");
        this.useRFC5179CompatibilityMode = true;
    }

    public JsonHttpResponseHandler(String encoding) {
        super(encoding);
        this.useRFC5179CompatibilityMode = true;
    }

    public JsonHttpResponseHandler(String encoding, boolean useRFC5179CompatibilityMode) {
        super(encoding);
        this.useRFC5179CompatibilityMode = useRFC5179CompatibilityMode;
    }

    public JsonHttpResponseHandler(boolean useRFC5179CompatibilityMode) {
        super("UTF-8");
        this.useRFC5179CompatibilityMode = useRFC5179CompatibilityMode;
    }

    public boolean isUseRFC5179CompatibilityMode() {
        return this.useRFC5179CompatibilityMode;
    }

    @Override  // com.loopj.android.http.TextHttpResponseHandler
    public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
        AsyncHttpClient.log.w("JsonHttpRH", "onFailure(int, Header[], String, Throwable) was not overriden, but callback was received", throwable);
    }

    public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
        AsyncHttpClient.log.w("JsonHttpRH", "onFailure(int, Header[], Throwable, JSONArray) was not overriden, but callback was received", throwable);
    }

    public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
        AsyncHttpClient.log.w("JsonHttpRH", "onFailure(int, Header[], Throwable, JSONObject) was not overriden, but callback was received", throwable);
    }

    @Override  // com.loopj.android.http.TextHttpResponseHandler
    public final void onFailure(int statusCode, Header[] headers, byte[] responseBytes, Throwable throwable) {
        if(responseBytes != null) {
            com.loopj.android.http.JsonHttpResponseHandler.2 parser = new Runnable() {
                @Override
                public void run() {
                    try {
                        com.loopj.android.http.JsonHttpResponseHandler.2.1 jsonHttpResponseHandler$2$10 = new Runnable() {
                            @Override
                            public void run() {
                                if(!JsonHttpResponseHandler.this.useRFC5179CompatibilityMode && JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes) == null) {
                                    JsonHttpResponseHandler.this.onFailure(com.loopj.android.http.JsonHttpResponseHandler.2.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.2.this.val$headers, null, com.loopj.android.http.JsonHttpResponseHandler.2.this.val$throwable);
                                    return;
                                }
                                if(JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes) instanceof JSONObject) {
                                    JsonHttpResponseHandler.this.onFailure(com.loopj.android.http.JsonHttpResponseHandler.2.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.2.this.val$headers, com.loopj.android.http.JsonHttpResponseHandler.2.this.val$throwable, ((JSONObject)JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes)));
                                    return;
                                }
                                if(JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes) instanceof JSONArray) {
                                    JsonHttpResponseHandler.this.onFailure(com.loopj.android.http.JsonHttpResponseHandler.2.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.2.this.val$headers, com.loopj.android.http.JsonHttpResponseHandler.2.this.val$throwable, ((JSONArray)JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes)));
                                    return;
                                }
                                if(JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes) instanceof String) {
                                    JsonHttpResponseHandler.this.onFailure(com.loopj.android.http.JsonHttpResponseHandler.2.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.2.this.val$headers, ((String)JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes)), com.loopj.android.http.JsonHttpResponseHandler.2.this.val$throwable);
                                    return;
                                }
                                JSONException jSONException0 = new JSONException("Unexpected response type " + JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes).getClass().getName());
                                JsonHttpResponseHandler.this.onFailure(com.loopj.android.http.JsonHttpResponseHandler.2.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.2.this.val$headers, jSONException0, null);
                            }
                        };
                        JsonHttpResponseHandler.this.postRunnable(jsonHttpResponseHandler$2$10);
                    }
                    catch(JSONException ex) {
                        com.loopj.android.http.JsonHttpResponseHandler.2.2 jsonHttpResponseHandler$2$20 = new Runnable() {
                            @Override
                            public void run() {
                                JsonHttpResponseHandler.this.onFailure(com.loopj.android.http.JsonHttpResponseHandler.2.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.2.this.val$headers, ex, null);
                            }
                        };
                        JsonHttpResponseHandler.this.postRunnable(jsonHttpResponseHandler$2$20);
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
        AsyncHttpClient.log.v("JsonHttpRH", "response body is null, calling onFailure(Throwable, JSONObject)");
        this.onFailure(statusCode, headers, throwable, null);
    }

    @Override  // com.loopj.android.http.TextHttpResponseHandler
    public void onSuccess(int statusCode, Header[] headers, String responseString) {
        AsyncHttpClient.log.w("JsonHttpRH", "onSuccess(int, Header[], String) was not overriden, but callback was received");
    }

    public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
        AsyncHttpClient.log.w("JsonHttpRH", "onSuccess(int, Header[], JSONArray) was not overriden, but callback was received");
    }

    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
        AsyncHttpClient.log.w("JsonHttpRH", "onSuccess(int, Header[], JSONObject) was not overriden, but callback was received");
    }

    @Override  // com.loopj.android.http.TextHttpResponseHandler
    public final void onSuccess(int statusCode, Header[] headers, byte[] responseBytes) {
        if(statusCode != 204) {
            com.loopj.android.http.JsonHttpResponseHandler.1 parser = new Runnable() {
                @Override
                public void run() {
                    try {
                        com.loopj.android.http.JsonHttpResponseHandler.1.1 jsonHttpResponseHandler$1$10 = new Runnable() {
                            @Override
                            public void run() {
                                if(!JsonHttpResponseHandler.this.useRFC5179CompatibilityMode && JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes) == null) {
                                    JsonHttpResponseHandler.this.onSuccess(com.loopj.android.http.JsonHttpResponseHandler.1.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.1.this.val$headers, null);
                                    return;
                                }
                                if(JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes) instanceof JSONObject) {
                                    JsonHttpResponseHandler.this.onSuccess(com.loopj.android.http.JsonHttpResponseHandler.1.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.1.this.val$headers, ((JSONObject)JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes)));
                                    return;
                                }
                                if(JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes) instanceof JSONArray) {
                                    JsonHttpResponseHandler.this.onSuccess(com.loopj.android.http.JsonHttpResponseHandler.1.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.1.this.val$headers, ((JSONArray)JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes)));
                                    return;
                                }
                                if(JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes) instanceof String) {
                                    if(JsonHttpResponseHandler.this.useRFC5179CompatibilityMode) {
                                        JSONException jSONException0 = new JSONException("Response cannot be parsed as JSON data");
                                        JsonHttpResponseHandler.this.onFailure(com.loopj.android.http.JsonHttpResponseHandler.1.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.1.this.val$headers, ((String)JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes)), jSONException0);
                                        return;
                                    }
                                    JsonHttpResponseHandler.this.onSuccess(com.loopj.android.http.JsonHttpResponseHandler.1.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.1.this.val$headers, ((String)JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes)));
                                    return;
                                }
                                JSONException jSONException1 = new JSONException("Unexpected response type " + JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes).getClass().getName());
                                JsonHttpResponseHandler.this.onFailure(com.loopj.android.http.JsonHttpResponseHandler.1.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.1.this.val$headers, jSONException1, null);
                            }
                        };
                        JsonHttpResponseHandler.this.postRunnable(jsonHttpResponseHandler$1$10);
                    }
                    catch(JSONException ex) {
                        com.loopj.android.http.JsonHttpResponseHandler.1.2 jsonHttpResponseHandler$1$20 = new Runnable() {
                            @Override
                            public void run() {
                                JsonHttpResponseHandler.this.onFailure(com.loopj.android.http.JsonHttpResponseHandler.1.this.val$statusCode, com.loopj.android.http.JsonHttpResponseHandler.1.this.val$headers, ex, null);
                            }
                        };
                        JsonHttpResponseHandler.this.postRunnable(jsonHttpResponseHandler$1$20);
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
        this.onSuccess(204, headers, new JSONObject());
    }

    protected Object parseResponse(byte[] responseBody) throws JSONException {
        String result;
        if(responseBody == null) {
            return null;
        }
        String jsonString = JsonHttpResponseHandler.getResponseString(responseBody, this.getCharset());
        if(jsonString != null) {
            jsonString = jsonString.trim();
            if(!this.useRFC5179CompatibilityMode) {
                if(jsonString.startsWith("{") && jsonString.endsWith("}") || jsonString.startsWith("[") && jsonString.endsWith("]")) {
                    result = new JSONTokener(jsonString).nextValue();
                    return result == null ? jsonString : result;
                }
                if(jsonString.startsWith("\"") && jsonString.endsWith("\"")) {
                    result = jsonString.substring(1, jsonString.length() - 1);
                    return result == null ? jsonString : result;
                }
            }
            else if(jsonString.startsWith("{") || jsonString.startsWith("[")) {
                result = new JSONTokener(jsonString).nextValue();
                return result == null ? jsonString : result;
            }
        }
        return jsonString;
    }

    public void setUseRFC5179CompatibilityMode(boolean useRFC5179CompatibilityMode) {
        this.useRFC5179CompatibilityMode = useRFC5179CompatibilityMode;
    }
}

