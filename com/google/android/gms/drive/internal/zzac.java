package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.CompletionListener;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.ProgressEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.zzc;
import com.google.android.gms.drive.events.zzf;
import com.google.android.gms.drive.events.zzi;
import com.google.android.gms.drive.events.zzj;
import com.google.android.gms.drive.events.zzl;
import java.util.ArrayList;
import java.util.List;

public class zzac extends zza {
    static class com.google.android.gms.drive.internal.zzac.zza extends Handler {
        private final Context mContext;

        private com.google.android.gms.drive.internal.zzac.zza(Looper looper0, Context context0) {
            super(looper0);
            this.mContext = context0;
        }

        com.google.android.gms.drive.internal.zzac.zza(Looper looper0, Context context0, com.google.android.gms.drive.internal.zzac.1 zzac$10) {
            this(looper0, context0);
        }

        @Override  // android.os.Handler
        public void handleMessage(Message msg) {
            if(msg.what != 1) {
                zzx.zze(this.mContext, "EventCallback", "Don\'t know how to handle this event");
                return;
            }
            Pair pair0 = (Pair)msg.obj;
            zzf zzf0 = (zzf)pair0.first;
            DriveEvent driveEvent0 = (DriveEvent)pair0.second;
            switch(driveEvent0.getType()) {
                case 1: {
                    ((ChangeListener)zzf0).onChange(((ChangeEvent)driveEvent0));
                    return;
                }
                case 2: {
                    ((CompletionListener)zzf0).onCompletion(((CompletionEvent)driveEvent0));
                    return;
                }
                case 3: {
                    com.google.android.gms.drive.internal.zzac.zza.zza(((zzl)zzf0), ((QueryResultEventParcelable)driveEvent0));
                    return;
                }
                case 4: {
                    ((zzc)zzf0).zza(((ChangesAvailableEvent)driveEvent0));
                    return;
                }
                case 5: 
                case 6: {
                    ((zzi)zzf0).zza(((ProgressEvent)driveEvent0));
                    return;
                }
                default: {
                    zzx.zzu("EventCallback", "Unexpected event: " + driveEvent0);
                }
            }
        }

        private static void zza(zzl zzl0, QueryResultEventParcelable queryResultEventParcelable0) {
            DataHolder dataHolder0 = queryResultEventParcelable0.zzpx();
            if(dataHolder0 != null) {
                zzl0.zza(new zzj() {
                });
            }
            if(queryResultEventParcelable0.zzpy()) {
                zzl0.zzck(queryResultEventParcelable0.zzpz());
            }
        }

        public void zza(zzf zzf0, DriveEvent driveEvent0) {
            this.sendMessage(this.obtainMessage(1, new Pair(zzf0, driveEvent0)));
        }
    }

    private final int zzaca;
    private final zzf zzafC;
    private final com.google.android.gms.drive.internal.zzac.zza zzafD;
    private final List zzafE;

    public zzac(Looper looper0, Context context0, int v, zzf zzf0) {
        this.zzafE = new ArrayList();
        this.zzaca = v;
        this.zzafC = zzf0;
        this.zzafD = new com.google.android.gms.drive.internal.zzac.zza(looper0, context0, null);
    }

    @Override  // com.google.android.gms.drive.internal.zzam
    public void zzc(OnEventResponse onEventResponse0) throws RemoteException {
        DriveEvent driveEvent0 = onEventResponse0.zzpO();
        int v = driveEvent0.getType();
        zzu.zzU(this.zzaca == v);
        Integer integer0 = driveEvent0.getType();
        zzu.zzU(this.zzafE.contains(integer0));
        this.zzafD.zza(this.zzafC, driveEvent0);
    }

    public void zzcA(int v) {
        this.zzafE.add(v);
    }

    public boolean zzcB(int v) {
        return this.zzafE.contains(v);
    }

    class com.google.android.gms.drive.internal.zzac.1 {
    }

}

