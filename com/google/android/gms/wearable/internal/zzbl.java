package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import java.util.List;

final class zzbl extends zza {
    private final String zzaTD;
    private final IntentFilter[] zzaUk;
    private com.google.android.gms.wearable.zza.zza zzaVb;
    private DataListener zzaVc;
    private MessageListener zzaVd;
    private NodeListener zzaVe;
    private com.google.android.gms.wearable.NodeApi.zza zzaVf;
    private ChannelListener zzaVg;
    private CapabilityListener zzaVh;
    private final String zzaVi;

    private zzbl(com.google.android.gms.wearable.zza.zza zza$zza0, DataListener dataApi$DataListener0, MessageListener messageApi$MessageListener0, NodeListener nodeApi$NodeListener0, com.google.android.gms.wearable.NodeApi.zza nodeApi$zza0, ChannelListener channelApi$ChannelListener0, CapabilityListener capabilityApi$CapabilityListener0, IntentFilter[] arr_intentFilter, String s, String s1) {
        this.zzaVb = zza$zza0;
        this.zzaVc = dataApi$DataListener0;
        this.zzaVd = messageApi$MessageListener0;
        this.zzaVe = nodeApi$NodeListener0;
        this.zzaVf = nodeApi$zza0;
        this.zzaVg = channelApi$ChannelListener0;
        this.zzaVh = capabilityApi$CapabilityListener0;
        this.zzaUk = arr_intentFilter;
        this.zzaVi = s;
        this.zzaTD = s1;
    }

    public void clear() {
        this.zzaVb = null;
        this.zzaVc = null;
        this.zzaVd = null;
        this.zzaVe = null;
        this.zzaVf = null;
        this.zzaVg = null;
        this.zzaVh = null;
    }

    @Override  // com.google.android.gms.wearable.internal.zzas
    public void onConnectedNodes(List list0) {
        if(this.zzaVf != null) {
            this.zzaVf.onConnectedNodes(list0);
        }
    }

    public IntentFilter[] zzBh() {
        return this.zzaUk;
    }

    public String zzBi() {
        return this.zzaVi;
    }

    public String zzBj() {
        return this.zzaTD;
    }

    public static zzbl zza(CapabilityListener capabilityApi$CapabilityListener0, String s) {
        return new zzbl(null, null, null, null, null, null, ((CapabilityListener)zzu.zzu(capabilityApi$CapabilityListener0)), null, null, s);
    }

    public static zzbl zza(ChannelListener channelApi$ChannelListener0, String s) {
        return new zzbl(null, null, null, null, null, ((ChannelListener)zzu.zzu(channelApi$ChannelListener0)), null, null, ((String)zzu.zzu(s)), null);
    }

    public static zzbl zza(DataListener dataApi$DataListener0, IntentFilter[] arr_intentFilter) {
        return new zzbl(null, ((DataListener)zzu.zzu(dataApi$DataListener0)), null, null, null, null, null, arr_intentFilter, null, null);
    }

    public static zzbl zza(MessageListener messageApi$MessageListener0, IntentFilter[] arr_intentFilter) {
        return new zzbl(null, null, ((MessageListener)zzu.zzu(messageApi$MessageListener0)), null, null, null, null, arr_intentFilter, null, null);
    }

    public static zzbl zza(NodeListener nodeApi$NodeListener0) {
        return new zzbl(null, null, null, ((NodeListener)zzu.zzu(nodeApi$NodeListener0)), null, null, null, null, null, null);
    }

    @Override  // com.google.android.gms.wearable.internal.zzas
    public void zza(AncsNotificationParcelable ancsNotificationParcelable0) {
        if(this.zzaVb != null) {
            this.zzaVb.zza(ancsNotificationParcelable0);
        }
    }

    @Override  // com.google.android.gms.wearable.internal.zzas
    public void zza(CapabilityInfoParcelable capabilityInfoParcelable0) {
        if(this.zzaVh != null) {
            this.zzaVh.onCapabilityChanged(capabilityInfoParcelable0);
        }
    }

    @Override  // com.google.android.gms.wearable.internal.zzas
    public void zza(ChannelEventParcelable channelEventParcelable0) {
        if(this.zzaVg != null) {
            channelEventParcelable0.zza(this.zzaVg);
        }
    }

    @Override  // com.google.android.gms.wearable.internal.zzas
    public void zza(MessageEventParcelable messageEventParcelable0) {
        if(this.zzaVd != null) {
            this.zzaVd.onMessageReceived(messageEventParcelable0);
        }
    }

    @Override  // com.google.android.gms.wearable.internal.zzas
    public void zza(NodeParcelable nodeParcelable0) {
        if(this.zzaVe != null) {
            this.zzaVe.onPeerConnected(nodeParcelable0);
        }
    }

    @Override  // com.google.android.gms.wearable.internal.zzas
    public void zzac(DataHolder dataHolder0) {
        if(this.zzaVc != null) {
            try(dataHolder0) {
                this.zzaVc.onDataChanged(new DataEventBuffer(dataHolder0));
            }
        }
    }

    public static zzbl zzb(ChannelListener channelApi$ChannelListener0) {
        return new zzbl(null, null, null, null, null, ((ChannelListener)zzu.zzu(channelApi$ChannelListener0)), null, null, null, null);
    }

    @Override  // com.google.android.gms.wearable.internal.zzas
    public void zzb(NodeParcelable nodeParcelable0) {
        if(this.zzaVe != null) {
            this.zzaVe.onPeerDisconnected(nodeParcelable0);
        }
    }
}

