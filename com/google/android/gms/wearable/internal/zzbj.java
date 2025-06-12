package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.DataItemBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

final class zzbj {
    static final class zza extends zzb {
        public zza(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(AddLocalCapabilityResponse addLocalCapabilityResponse0) {
            this.zzP(new com.google.android.gms.wearable.internal.zzg.zzb(zzbg.zzfn(addLocalCapabilityResponse0.statusCode)));
        }
    }

    static abstract class zzb extends com.google.android.gms.wearable.internal.zza {
        private com.google.android.gms.common.api.zza.zzb zzNO;

        public zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzNO = zza$zzb0;
        }

        public void zzP(Object object0) {
            com.google.android.gms.common.api.zza.zzb zza$zzb0 = this.zzNO;
            if(zza$zzb0 != null) {
                zza$zzb0.zzm(object0);
                this.zzNO = null;
            }
        }
    }

    static final class zzc extends zzb {
        public zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(CloseChannelResponse closeChannelResponse0) {
            this.zzP(new Status(closeChannelResponse0.statusCode));
        }
    }

    static final class zzd extends zzb {
        public zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zzb(CloseChannelResponse closeChannelResponse0) {
            this.zzP(new Status(closeChannelResponse0.statusCode));
        }
    }

    static final class zze extends zzb {
        public zze(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(DeleteDataItemsResponse deleteDataItemsResponse0) {
            this.zzP(new com.google.android.gms.wearable.internal.zzu.zzc(zzbg.zzfn(deleteDataItemsResponse0.statusCode), deleteDataItemsResponse0.zzaUp));
        }
    }

    static final class zzf extends zzb {
        public zzf(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(GetAllCapabilitiesResponse getAllCapabilitiesResponse0) {
            this.zzP(new com.google.android.gms.wearable.internal.zzg.zzd(zzbg.zzfn(getAllCapabilitiesResponse0.statusCode), zzbj.zzv(getAllCapabilitiesResponse0.zzaUq)));
        }
    }

    static final class zzg extends zzb {
        public zzg(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(GetCapabilityResponse getCapabilityResponse0) {
            this.zzP(new com.google.android.gms.wearable.internal.zzg.zze(zzbg.zzfn(getCapabilityResponse0.statusCode), new com.google.android.gms.wearable.internal.zzg.zzc(getCapabilityResponse0.zzaUr)));
        }
    }

    static final class zzh extends zzb {
        private final zzq zzaUQ;

        public zzh(com.google.android.gms.common.api.zza.zzb zza$zzb0, zzq zzq0) {
            super(zza$zzb0);
            this.zzaUQ = (zzq)zzu.zzu(zzq0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(GetChannelInputStreamResponse getChannelInputStreamResponse0) {
            zzm zzm0 = null;
            if(getChannelInputStreamResponse0.zzaUs != null) {
                zzm0 = new zzm(new ParcelFileDescriptor.AutoCloseInputStream(getChannelInputStreamResponse0.zzaUs));
                zzr zzr0 = zzm0.zzBb();
                this.zzaUQ.zza(zzr0);
            }
            this.zzP(new com.google.android.gms.wearable.internal.ChannelImpl.zza(new Status(getChannelInputStreamResponse0.statusCode), zzm0));
        }
    }

    static final class zzi extends zzb {
        private final zzq zzaUQ;

        public zzi(com.google.android.gms.common.api.zza.zzb zza$zzb0, zzq zzq0) {
            super(zza$zzb0);
            this.zzaUQ = (zzq)zzu.zzu(zzq0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(GetChannelOutputStreamResponse getChannelOutputStreamResponse0) {
            zzn zzn0 = null;
            if(getChannelOutputStreamResponse0.zzaUs != null) {
                zzn0 = new zzn(new ParcelFileDescriptor.AutoCloseOutputStream(getChannelOutputStreamResponse0.zzaUs));
                zzr zzr0 = zzn0.zzBb();
                this.zzaUQ.zza(zzr0);
            }
            this.zzP(new com.google.android.gms.wearable.internal.ChannelImpl.zzb(new Status(getChannelOutputStreamResponse0.statusCode), zzn0));
        }
    }

    static final class zzj extends zzb {
        public zzj(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(GetConnectedNodesResponse getConnectedNodesResponse0) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(getConnectedNodesResponse0.zzaUw);
            this.zzP(new com.google.android.gms.wearable.internal.zzax.zzb(zzbg.zzfn(getConnectedNodesResponse0.statusCode), arrayList0));
        }
    }

    static final class zzk extends zzb {
        public zzk(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(GetDataItemResponse getDataItemResponse0) {
            this.zzP(new com.google.android.gms.wearable.internal.zzu.zzb(zzbg.zzfn(getDataItemResponse0.statusCode), getDataItemResponse0.zzaUx));
        }
    }

    static final class zzl extends zzb {
        public zzl(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zzad(DataHolder dataHolder0) {
            this.zzP(new DataItemBuffer(dataHolder0));
        }
    }

    static final class com.google.android.gms.wearable.internal.zzbj.zzm extends zzb {
        public com.google.android.gms.wearable.internal.zzbj.zzm(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(GetFdForAssetResponse getFdForAssetResponse0) {
            this.zzP(new com.google.android.gms.wearable.internal.zzu.zzd(zzbg.zzfn(getFdForAssetResponse0.statusCode), getFdForAssetResponse0.zzaUy));
        }
    }

    static final class com.google.android.gms.wearable.internal.zzbj.zzn extends zzb {
        public com.google.android.gms.wearable.internal.zzbj.zzn(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(GetLocalNodeResponse getLocalNodeResponse0) {
            this.zzP(new com.google.android.gms.wearable.internal.zzax.zzc(zzbg.zzfn(getLocalNodeResponse0.statusCode), getLocalNodeResponse0.zzaUz));
        }
    }

    static final class zzo extends com.google.android.gms.wearable.internal.zza {
        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(Status status0) {
        }
    }

    static final class zzp extends zzb {
        public zzp(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(OpenChannelResponse openChannelResponse0) {
            this.zzP(new com.google.android.gms.wearable.internal.zzi.zzb(zzbg.zzfn(openChannelResponse0.statusCode), openChannelResponse0.zzaTP));
        }
    }

    static final class com.google.android.gms.wearable.internal.zzbj.zzq extends zzb {
        private final List zzwE;

        com.google.android.gms.wearable.internal.zzbj.zzq(com.google.android.gms.common.api.zza.zzb zza$zzb0, List list0) {
            super(zza$zzb0);
            this.zzwE = list0;
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(PutDataResponse putDataResponse0) {
            this.zzP(new com.google.android.gms.wearable.internal.zzu.zzb(zzbg.zzfn(putDataResponse0.statusCode), putDataResponse0.zzaUx));
            if(putDataResponse0.statusCode != 0) {
                for(Object object0: this.zzwE) {
                    ((FutureTask)object0).cancel(true);
                }
            }
        }
    }

    static final class com.google.android.gms.wearable.internal.zzbj.zzr extends zzb {
        public com.google.android.gms.wearable.internal.zzbj.zzr(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(ChannelSendFileResponse channelSendFileResponse0) {
            this.zzP(new Status(channelSendFileResponse0.statusCode));
        }
    }

    static final class zzs extends zzb {
        public zzs(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(RemoveLocalCapabilityResponse removeLocalCapabilityResponse0) {
            this.zzP(new com.google.android.gms.wearable.internal.zzg.zzb(zzbg.zzfn(removeLocalCapabilityResponse0.statusCode)));
        }
    }

    static final class zzt extends zzb {
        public zzt(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(SendMessageResponse sendMessageResponse0) {
            this.zzP(new com.google.android.gms.wearable.internal.zzav.zzb(zzbg.zzfn(sendMessageResponse0.statusCode), sendMessageResponse0.zzaxg));
        }
    }

    static final class com.google.android.gms.wearable.internal.zzbj.zzu extends zzb {
        public com.google.android.gms.wearable.internal.zzbj.zzu(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.wearable.internal.zza
        public void zza(ChannelReceiveFileResponse channelReceiveFileResponse0) {
            this.zzP(new Status(channelReceiveFileResponse0.statusCode));
        }
    }

    private static Map zzv(List list0) {
        Map map0 = new HashMap(list0.size() * 2);
        for(Object object0: list0) {
            ((HashMap)map0).put(((CapabilityInfoParcelable)object0).getName(), new com.google.android.gms.wearable.internal.zzg.zzc(((CapabilityInfoParcelable)object0)));
        }
        return map0;
    }
}

