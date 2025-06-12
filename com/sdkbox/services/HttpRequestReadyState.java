package com.sdkbox.services;

public enum HttpRequestReadyState {
    UNSENT(0),
    OPENED(1),
    HEADERS_RECEIVED(2),
    LOADING(3),
    DONE(4);

    private int value;

    private HttpRequestReadyState(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}

