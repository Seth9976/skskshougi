package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

public final class ChannelEventParcelable implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int type;
    final int zzCY;
    final int zzaTN;
    final int zzaTO;
    final ChannelImpl zzaTP;

    static {
        ChannelEventParcelable.CREATOR = new zzk();
    }

    ChannelEventParcelable(int versionCode, ChannelImpl channel, int type, int closeReason, int appErrorCode) {
        this.zzCY = versionCode;
        this.zzaTP = channel;
        this.type = type;
        this.zzaTN = closeReason;
        this.zzaTO = appErrorCode;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return "ChannelEventParcelable[versionCode=" + this.zzCY + ", channel=" + this.zzaTP + ", type=" + ChannelEventParcelable.zzjT(this.type) + ", closeReason=" + ChannelEventParcelable.zzjU(this.zzaTN) + ", appErrorCode=" + this.zzaTO + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzk.zza(this, dest, flags);
    }

    public void zza(ChannelListener channelApi$ChannelListener0) {
        switch(this.type) {
            case 1: {
                channelApi$ChannelListener0.onChannelOpened(this.zzaTP);
                return;
            }
            case 2: {
                channelApi$ChannelListener0.onChannelClosed(this.zzaTP, this.zzaTN, this.zzaTO);
                return;
            }
            case 3: {
                channelApi$ChannelListener0.onInputClosed(this.zzaTP, this.zzaTN, this.zzaTO);
                return;
            }
            case 4: {
                channelApi$ChannelListener0.onOutputClosed(this.zzaTP, this.zzaTN, this.zzaTO);
                return;
            }
            default: {
                Log.w("ChannelEventParcelable", "Unknown type: " + this.type);
            }
        }
    }

    private static String zzjT(int v) {
        switch(v) {
            case 1: {
                return "CHANNEL_OPENED";
            }
            case 2: {
                return "CHANNEL_CLOSED";
            }
            case 3: {
                return "INPUT_CLOSED";
            }
            case 4: {
                return "OUTPUT_CLOSED";
            }
            default: {
                return Integer.toString(v);
            }
        }
    }

    private static String zzjU(int v) {
        switch(v) {
            case 0: {
                return "CLOSE_REASON_NORMAL";
            }
            case 1: {
                return "CLOSE_REASON_DISCONNECTED";
            }
            case 2: {
                return "CLOSE_REASON_REMOTE_CLOSE";
            }
            case 3: {
                return "CLOSE_REASON_LOCAL_CLOSE";
            }
            default: {
                return Integer.toString(v);
            }
        }
    }
}

