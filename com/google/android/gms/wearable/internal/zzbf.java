package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

final class zzbf implements ChannelListener {
    private final String zzaTK;
    private final ChannelListener zzaUO;

    zzbf(String s, ChannelListener channelApi$ChannelListener0) {
        this.zzaTK = (String)zzu.zzu(s);
        this.zzaUO = (ChannelListener)zzu.zzu(channelApi$ChannelListener0);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        return o instanceof zzbf ? this.zzaUO.equals(((zzbf)o).zzaUO) && this.zzaTK.equals(((zzbf)o).zzaTK) : false;
    }

    @Override
    public int hashCode() {
        return this.zzaTK.hashCode() * 0x1F + this.zzaUO.hashCode();
    }

    @Override  // com.google.android.gms.wearable.ChannelApi$ChannelListener
    public void onChannelClosed(Channel channel, int closeReason, int appSpecificErrorCode) {
        this.zzaUO.onChannelClosed(channel, closeReason, appSpecificErrorCode);
    }

    @Override  // com.google.android.gms.wearable.ChannelApi$ChannelListener
    public void onChannelOpened(Channel channel) {
        this.zzaUO.onChannelOpened(channel);
    }

    @Override  // com.google.android.gms.wearable.ChannelApi$ChannelListener
    public void onInputClosed(Channel channel, int closeReason, int appSpecificErrorCode) {
        this.zzaUO.onInputClosed(channel, closeReason, appSpecificErrorCode);
    }

    @Override  // com.google.android.gms.wearable.ChannelApi$ChannelListener
    public void onOutputClosed(Channel channel, int closeReason, int appSpecificErrorCode) {
        this.zzaUO.onOutputClosed(channel, closeReason, appSpecificErrorCode);
    }
}

