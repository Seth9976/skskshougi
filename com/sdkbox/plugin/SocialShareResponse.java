package com.sdkbox.plugin;

public class SocialShareResponse {
    public static enum SocialShareState {
        SocialShareStateNone,
        SocialShareStateUnkonw,
        SocialShareStateBegin,
        SocialShareStateSuccess,
        SocialShareStateFail,
        SocialShareStateCancelled,
        SocialShareStateSelectShow,
        SocialShareStateSelected,
        SocialShareStateSelectCancelled;

    }

    public String error;
    public String platform;
    public SocialShareState state;

    public String getError() {
        return this.error;
    }

    public String getPlatform() {
        return this.platform;
    }

    public int getShareState() {
        return this.state.ordinal();
    }
}

