package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class zzbk extends zzi {
    private final ExecutorService zzaNb;
    private final zzau zzaUR;
    private final zzau zzaUS;
    private final zzau zzaUT;
    private final zzau zzaUU;
    private final zzau zzaUV;
    private final zzau zzaUW;
    private final Map zzaUX;

    public zzbk(Context context0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, zze zze0) {
        super(context0, looper0, 14, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
        this.zzaNb = Executors.newCachedThreadPool();
        this.zzaUR = new zzau();
        this.zzaUS = new zzau();
        this.zzaUT = new zzau();
        this.zzaUU = new zzau();
        this.zzaUV = new zzau();
        this.zzaUW = new zzau();
        this.zzaUX = new HashMap();
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public void disconnect() {
        this.zzaUR.zzb(this);
        this.zzaUT.zzb(this);
        this.zzaUU.zzb(this);
        this.zzaUV.zzb(this);
        this.zzaUW.zzb(this);
        synchronized(this.zzaUX) {
            for(Object object0: this.zzaUX.values()) {
                ((zzau)object0).zzb(this);
            }
        }
        super.disconnect();
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzdS(iBinder0);
    }

    private FutureTask zza(ParcelFileDescriptor parcelFileDescriptor0, byte[] arr_b) {
        return new FutureTask(new Callable() {
            public Boolean zzBg() {
                if(Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: writing data to FD : " + parcelFileDescriptor0);
                }
                ParcelFileDescriptor.AutoCloseOutputStream parcelFileDescriptor$AutoCloseOutputStream0 = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor0);
                try {
                    try {
                        parcelFileDescriptor$AutoCloseOutputStream0.write(arr_b);
                        parcelFileDescriptor$AutoCloseOutputStream0.flush();
                        if(Log.isLoggable("WearableClient", 3)) {
                            Log.d("WearableClient", "processAssets: wrote data: " + parcelFileDescriptor0);
                        }
                        goto label_19;
                    }
                    catch(IOException unused_ex) {
                    }
                    Log.w("WearableClient", "processAssets: writing data failed: " + parcelFileDescriptor0);
                }
                catch(Throwable throwable0) {
                    goto label_15;
                }
                try {
                    if(Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + parcelFileDescriptor0);
                    }
                    parcelFileDescriptor$AutoCloseOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
                return false;
                try {
                label_15:
                    if(Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + parcelFileDescriptor0);
                    }
                    parcelFileDescriptor$AutoCloseOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
                throw throwable0;
                try {
                label_19:
                    if(Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + parcelFileDescriptor0);
                    }
                    parcelFileDescriptor$AutoCloseOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
                return true;
            }
        });
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected void zza(int v, IBinder iBinder0, Bundle bundle0, int v1) {
        if(Log.isLoggable("WearableClient", 2)) {
            Log.d("WearableClient", "onPostInitHandler: statusCode " + v);
        }
        if(v == 0) {
            this.zzaUR.zzdR(iBinder0);
            this.zzaUT.zzdR(iBinder0);
            this.zzaUU.zzdR(iBinder0);
            this.zzaUV.zzdR(iBinder0);
            this.zzaUW.zzdR(iBinder0);
            synchronized(this.zzaUX) {
                for(Object object0: this.zzaUX.values()) {
                    ((zzau)object0).zzdR(iBinder0);
                }
            }
        }
        super.zza(v, iBinder0, bundle0, v1);
    }

    public void zza(zzb zza$zzb0, Uri uri0) throws RemoteException {
        ((zzat)this.zznM()).zza(new zzk(zza$zzb0), uri0);
    }

    public void zza(zzb zza$zzb0, Uri uri0, int v) throws RemoteException {
        ((zzat)this.zznM()).zza(new zzl(zza$zzb0), uri0, v);
    }

    public void zza(zzb zza$zzb0, Asset asset0) throws RemoteException {
        ((zzat)this.zznM()).zza(new zzm(zza$zzb0), asset0);
    }

    public void zza(zzb zza$zzb0, CapabilityListener capabilityApi$CapabilityListener0, String s) throws RemoteException {
        synchronized(this.zzaUX) {
            this.zzfh(s).zza(this, zza$zzb0, capabilityApi$CapabilityListener0, zzbl.zza(capabilityApi$CapabilityListener0, s));
        }
    }

    public void zza(zzb zza$zzb0, ChannelListener channelApi$ChannelListener0, String s) throws RemoteException {
        if(s == null) {
            zzbl zzbl0 = zzbl.zzb(channelApi$ChannelListener0);
            this.zzaUS.zza(this, zza$zzb0, channelApi$ChannelListener0, zzbl0);
            return;
        }
        zzbf zzbf0 = new zzbf(s, channelApi$ChannelListener0);
        zzbl zzbl1 = zzbl.zza(zzbf0, s);
        this.zzaUS.zza(this, zza$zzb0, zzbf0, zzbl1);
    }

    public void zza(zzb zza$zzb0, DataListener dataApi$DataListener0) throws RemoteException {
        this.zzaUT.zza(this, zza$zzb0, dataApi$DataListener0);
    }

    public void zza(zzb zza$zzb0, DataListener dataApi$DataListener0, IntentFilter[] arr_intentFilter) throws RemoteException {
        zzbl zzbl0 = zzbl.zza(dataApi$DataListener0, arr_intentFilter);
        this.zzaUT.zza(this, zza$zzb0, dataApi$DataListener0, zzbl0);
    }

    public void zza(zzb zza$zzb0, DataItemAsset dataItemAsset0) throws RemoteException {
        this.zza(zza$zzb0, Asset.createFromRef(dataItemAsset0.getId()));
    }

    public void zza(zzb zza$zzb0, MessageListener messageApi$MessageListener0) throws RemoteException {
        this.zzaUU.zza(this, zza$zzb0, messageApi$MessageListener0);
    }

    public void zza(zzb zza$zzb0, MessageListener messageApi$MessageListener0, IntentFilter[] arr_intentFilter) throws RemoteException {
        zzbl zzbl0 = zzbl.zza(messageApi$MessageListener0, arr_intentFilter);
        this.zzaUU.zza(this, zza$zzb0, messageApi$MessageListener0, zzbl0);
    }

    public void zza(zzb zza$zzb0, NodeListener nodeApi$NodeListener0) throws RemoteException {
        zzbl zzbl0 = zzbl.zza(nodeApi$NodeListener0);
        this.zzaUV.zza(this, zza$zzb0, nodeApi$NodeListener0, zzbl0);
    }

    public void zza(zzb zza$zzb0, PutDataRequest putDataRequest0) throws RemoteException {
        ParcelFileDescriptor[] arr_parcelFileDescriptor;
        for(Object object0: putDataRequest0.getAssets().entrySet()) {
            Asset asset0 = (Asset)((Map.Entry)object0).getValue();
            if(asset0.getData() == null && asset0.getDigest() == null && asset0.getFd() == null && asset0.getUri() == null) {
                throw new IllegalArgumentException("Put for " + putDataRequest0.getUri() + " contains invalid asset: " + asset0);
            }
            if(false) {
                break;
            }
        }
        PutDataRequest putDataRequest1 = PutDataRequest.zzn(putDataRequest0.getUri());
        putDataRequest1.setData(putDataRequest0.getData());
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: putDataRequest0.getAssets().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            Asset asset1 = (Asset)map$Entry0.getValue();
            if(asset1.getData() == null) {
                putDataRequest1.putAsset(((String)map$Entry0.getKey()), ((Asset)map$Entry0.getValue()));
            }
            else {
                try {
                    arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
                }
                catch(IOException iOException0) {
                    throw new IllegalStateException("Unable to create ParcelFileDescriptor for asset in request: " + putDataRequest0, iOException0);
                }
                if(Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: replacing data with FD in asset: " + asset1 + " read:" + arr_parcelFileDescriptor[0] + " write:" + arr_parcelFileDescriptor[1]);
                }
                putDataRequest1.putAsset(((String)map$Entry0.getKey()), Asset.createFromFd(arr_parcelFileDescriptor[0]));
                FutureTask futureTask0 = this.zza(arr_parcelFileDescriptor[1], asset1.getData());
                arrayList0.add(futureTask0);
                this.zzaNb.submit(futureTask0);
            }
        }
        ((zzat)this.zznM()).zza(new zzq(zza$zzb0, arrayList0), putDataRequest1);
    }

    public void zza(zzb zza$zzb0, String s, Uri uri0, long v, long v1) {
        try {
            FutureTask futureTask0 = this.zzb(zza$zzb0, s, uri0, v, v1);
            this.zzaNb.submit(futureTask0);
        }
        catch(RuntimeException runtimeException0) {
            zza$zzb0.zzr(new Status(8));
            throw runtimeException0;
        }
    }

    public void zza(zzb zza$zzb0, String s, Uri uri0, boolean z) {
        try {
            FutureTask futureTask0 = this.zzb(zza$zzb0, s, uri0, z);
            this.zzaNb.submit(futureTask0);
        }
        catch(RuntimeException runtimeException0) {
            zza$zzb0.zzr(new Status(8));
            throw runtimeException0;
        }
    }

    public void zza(zzb zza$zzb0, String s, String s1, byte[] arr_b) throws RemoteException {
        ((zzat)this.zznM()).zza(new zzt(zza$zzb0), s, s1, arr_b);
    }

    private FutureTask zzb(zzb zza$zzb0, String s, Uri uri0, long v, long v1) {
        zzu.zzu(zza$zzb0);
        zzu.zzu(s);
        zzu.zzu(uri0);
        zzu.zzb(v >= 0L, "startOffset is negative: %s", new Object[]{v});
        zzu.zzb(v1 >= -1L, "invalid length: %s", new Object[]{v1});
        return new FutureTask(new Runnable() {
            @Override
            public void run() {
                ParcelFileDescriptor parcelFileDescriptor0;
                if(Log.isLoggable("WearableClient", 2)) {
                    Log.v("WearableClient", "Executing sendFileToChannelTask");
                }
                if(!"file".equals(uri0.getScheme())) {
                    Log.w("WearableClient", "Channel.sendFile used with non-file URI");
                    Status status0 = new Status(10, "Channel.sendFile used with non-file URI");
                    zza$zzb0.zzr(status0);
                    return;
                }
                File file0 = new File(uri0.getPath());
                try {
                    parcelFileDescriptor0 = ParcelFileDescriptor.open(file0, 0x10000000);
                }
                catch(FileNotFoundException unused_ex) {
                    Log.w("WearableClient", "File couldn\'t be opened for Channel.sendFile: " + file0);
                    Status status1 = new Status(13);
                    zza$zzb0.zzr(status1);
                    return;
                }
                try {
                    try {
                        ((zzat)zzbk.this.zznM()).zza(new zzr(zza$zzb0), s, parcelFileDescriptor0, v, v1);
                        goto label_31;
                    }
                    catch(RemoteException remoteException0) {
                    }
                    Log.w("WearableClient", "Channel.sendFile failed.", remoteException0);
                    Status status2 = new Status(8);
                    zza$zzb0.zzr(status2);
                }
                catch(Throwable throwable0) {
                    goto label_26;
                }
                try {
                    parcelFileDescriptor0.close();
                }
                catch(IOException iOException0) {
                    Log.w("WearableClient", "Failed to close sourceFd", iOException0);
                }
                return;
                try {
                label_26:
                    parcelFileDescriptor0.close();
                }
                catch(IOException iOException1) {
                    Log.w("WearableClient", "Failed to close sourceFd", iOException1);
                }
                throw throwable0;
                try {
                label_31:
                    parcelFileDescriptor0.close();
                }
                catch(IOException iOException2) {
                    Log.w("WearableClient", "Failed to close sourceFd", iOException2);
                }
            }
        }, null);
    }

    private FutureTask zzb(zzb zza$zzb0, String s, Uri uri0, boolean z) {
        zzu.zzu(zza$zzb0);
        zzu.zzu(s);
        zzu.zzu(uri0);
        return new FutureTask(new Runnable() {
            @Override
            public void run() {
                ParcelFileDescriptor parcelFileDescriptor0;
                if(Log.isLoggable("WearableClient", 2)) {
                    Log.v("WearableClient", "Executing receiveFileFromChannelTask");
                }
                if(!"file".equals(uri0.getScheme())) {
                    Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
                    Status status0 = new Status(10, "Channel.receiveFile used with non-file URI");
                    zza$zzb0.zzr(status0);
                    return;
                }
                File file0 = new File(uri0.getPath());
                try {
                    parcelFileDescriptor0 = ParcelFileDescriptor.open(file0, (z ? 0x2000000 : 0) | 0x20000000);
                }
                catch(FileNotFoundException unused_ex) {
                    Log.w("WearableClient", "File couldn\'t be opened for Channel.receiveFile: " + file0);
                    Status status1 = new Status(13);
                    zza$zzb0.zzr(status1);
                    return;
                }
                try {
                    try {
                        ((zzat)zzbk.this.zznM()).zza(new com.google.android.gms.wearable.internal.zzbj.zzu(zza$zzb0), s, parcelFileDescriptor0);
                        goto label_31;
                    }
                    catch(RemoteException remoteException0) {
                    }
                    Log.w("WearableClient", "Channel.receiveFile failed.", remoteException0);
                    Status status2 = new Status(8);
                    zza$zzb0.zzr(status2);
                }
                catch(Throwable throwable0) {
                    goto label_26;
                }
                try {
                    parcelFileDescriptor0.close();
                }
                catch(IOException iOException0) {
                    Log.w("WearableClient", "Failed to close targetFd", iOException0);
                }
                return;
                try {
                label_26:
                    parcelFileDescriptor0.close();
                }
                catch(IOException iOException1) {
                    Log.w("WearableClient", "Failed to close targetFd", iOException1);
                }
                throw throwable0;
                try {
                label_31:
                    parcelFileDescriptor0.close();
                }
                catch(IOException iOException2) {
                    Log.w("WearableClient", "Failed to close targetFd", iOException2);
                }
            }
        }, null);
    }

    public void zzb(zzb zza$zzb0, Uri uri0, int v) throws RemoteException {
        ((zzat)this.zznM()).zzb(new com.google.android.gms.wearable.internal.zzbj.zze(zza$zzb0), uri0, v);
    }

    public void zzb(zzb zza$zzb0, CapabilityListener capabilityApi$CapabilityListener0, String s) throws RemoteException {
        synchronized(this.zzaUX) {
            zzau zzau0 = this.zzfh(s);
            zzau0.zza(this, zza$zzb0, capabilityApi$CapabilityListener0);
            if(zzau0.isEmpty()) {
                this.zzaUX.remove(s);
            }
        }
    }

    public void zzb(zzb zza$zzb0, ChannelListener channelApi$ChannelListener0, String s) throws RemoteException {
        if(s == null) {
            this.zzaUS.zza(this, zza$zzb0, channelApi$ChannelListener0);
            return;
        }
        zzbf zzbf0 = new zzbf(s, channelApi$ChannelListener0);
        this.zzaUS.zza(this, zza$zzb0, zzbf0);
    }

    public void zzb(zzb zza$zzb0, NodeListener nodeApi$NodeListener0) throws RemoteException {
        this.zzaUV.zza(this, zza$zzb0, nodeApi$NodeListener0);
    }

    public void zzd(zzb zza$zzb0, int v) throws RemoteException {
        ((zzat)this.zznM()).zza(new zzf(zza$zzb0), v);
    }

    protected zzat zzdS(IBinder iBinder0) {
        return zza.zzdQ(iBinder0);
    }

    public void zze(zzb zza$zzb0, String s, String s1) throws RemoteException {
        ((zzat)this.zznM()).zza(new zzp(zza$zzb0), s, s1);
    }

    private zzau zzfh(String s) {
        zzau zzau0 = (zzau)this.zzaUX.get(s);
        if(zzau0 == null) {
            zzau0 = new zzau();
            this.zzaUX.put(s, zzau0);
        }
        return zzau0;
    }

    public void zzg(zzb zza$zzb0, String s, int v) throws RemoteException {
        ((zzat)this.zznM()).zza(new zzg(zza$zzb0), s, v);
    }

    public void zzh(zzb zza$zzb0, String s, int v) throws RemoteException {
        ((zzat)this.zznM()).zzb(new zzd(zza$zzb0), s, v);
    }

    public void zzl(zzb zza$zzb0) throws RemoteException {
        ((zzat)this.zznM()).zzb(new zzl(zza$zzb0));
    }

    public void zzm(zzb zza$zzb0) throws RemoteException {
        ((zzat)this.zznM()).zzc(new zzn(zza$zzb0));
    }

    public void zzn(zzb zza$zzb0) throws RemoteException {
        ((zzat)this.zznM()).zzd(new zzj(zza$zzb0));
    }

    public void zzr(zzb zza$zzb0, String s) throws RemoteException {
        ((zzat)this.zznM()).zzd(new com.google.android.gms.wearable.internal.zzbj.zza(zza$zzb0), s);
    }

    public void zzs(zzb zza$zzb0, String s) throws RemoteException {
        ((zzat)this.zznM()).zze(new zzs(zza$zzb0), s);
    }

    public void zzt(zzb zza$zzb0, String s) throws RemoteException {
        ((zzat)this.zznM()).zzf(new zzc(zza$zzb0), s);
    }

    public void zzu(zzb zza$zzb0, String s) throws RemoteException {
        com.google.android.gms.wearable.internal.zzq zzq0 = new com.google.android.gms.wearable.internal.zzq();
        ((zzat)this.zznM()).zza(new zzh(zza$zzb0, zzq0), zzq0, s);
    }

    public void zzv(zzb zza$zzb0, String s) throws RemoteException {
        com.google.android.gms.wearable.internal.zzq zzq0 = new com.google.android.gms.wearable.internal.zzq();
        ((zzat)this.zznM()).zzb(new com.google.android.gms.wearable.internal.zzbj.zzi(zza$zzb0, zzq0), zzq0, s);
    }
}

