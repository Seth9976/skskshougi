package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.Cast.CastApi;
import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.games.GameManagerClient.GameManagerInstanceResult;
import com.google.android.gms.cast.games.GameManagerClient.GameManagerResult;
import com.google.android.gms.cast.games.GameManagerClient.Listener;
import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.games.GameManagerState;
import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzc;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.cast.internal.zzp;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class zzjs extends zzc {
    public abstract class zza extends zzb {
        final zzjs zzTB;

        public zza() {
            this.zzTa = new zzo() {
                @Override  // com.google.android.gms.cast.internal.zzo
                public void zza(long v, int v1, Object object0) {
                    try {
                        if(object0 == null) {
                            zze zzjs$zze0 = new zze(new Status(v1, null, null), null, v, null);
                            zza.this.setResult(zzjs$zze0);
                            return;
                        }
                        String s = ((zzju)object0).getPlayerId();
                        if(v1 == 0 && s != null) {
                            zzjs.this.zzTA = s;
                        }
                        zze zzjs$zze1 = new zze(new Status(v1, ((zzju)object0).zzlD(), null), s, ((zzju)object0).getRequestId(), ((zzju)object0).getExtraMessageData());
                        zza.this.setResult(zzjs$zze1);
                    }
                    catch(ClassCastException unused_ex) {
                        Status status0 = new Status(13);
                        GameManagerResult gameManagerClient$GameManagerResult0 = zza.this.zzo(status0);
                        zza.this.setResult(gameManagerClient$GameManagerResult0);
                    }
                }

                @Override  // com.google.android.gms.cast.internal.zzo
                public void zzy(long v) {
                    Status status0 = new Status(2103);
                    GameManagerResult gameManagerClient$GameManagerResult0 = zza.this.zzo(status0);
                    zza.this.setResult(gameManagerClient$GameManagerResult0);
                }
            };
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzo(x0);
        }

        public GameManagerResult zzo(Status status0) {
            return new zze(status0, null, -1L, null);
        }
    }

    public abstract class zzb extends com.google.android.gms.cast.internal.zzb {
        final zzjs zzTB;
        protected zzo zzTa;

        public zzb() {
            super(zzjs0.zzTr);
        }

        public abstract void execute();

        protected void zza(com.google.android.gms.cast.internal.zze zze0) {
            this.execute();
        }

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((com.google.android.gms.cast.internal.zze)api$Client0));
        }

        public zzo zzlA() {
            return this.zzTa;
        }
    }

    public abstract class com.google.android.gms.internal.zzjs.zzc extends zzb {
        final zzjs zzTB;
        private GameManagerClient zzTJ;

        public com.google.android.gms.internal.zzjs.zzc(GameManagerClient gameManagerClient0) {
            this.zzTJ = gameManagerClient0;
            this.zzTa = new zzo() {
                @Override  // com.google.android.gms.cast.internal.zzo
                public void zza(long v, int v1, Object object0) {
                    try {
                        if(object0 == null) {
                            zzd zzjs$zzd0 = new zzd(new Status(v1, null, null), com.google.android.gms.internal.zzjs.zzc.this.zzTJ);
                            com.google.android.gms.internal.zzjs.zzc.this.setResult(zzjs$zzd0);
                            return;
                        }
                        zzjt zzjt0 = ((zzju)object0).zzlH();
                        if(zzjt0 != null && !zzf.zza("1.0.0", zzjt0.getVersion())) {
                            Status status0 = new Status(2150, String.format(Locale.ROOT, "Incorrect Game Manager SDK version. Receiver: %s Sender: %s", zzjt0.getVersion(), "1.0.0"));
                            GameManagerInstanceResult gameManagerClient$GameManagerInstanceResult0 = com.google.android.gms.internal.zzjs.zzc.this.zzp(status0);
                            com.google.android.gms.internal.zzjs.zzc.this.setResult(gameManagerClient$GameManagerInstanceResult0);
                            zzjs.this.zzTs = null;
                            return;
                        }
                        zzd zzjs$zzd1 = new zzd(new Status(v1, ((zzju)object0).zzlD(), null), com.google.android.gms.internal.zzjs.zzc.this.zzTJ);
                        com.google.android.gms.internal.zzjs.zzc.this.setResult(zzjs$zzd1);
                    }
                    catch(ClassCastException unused_ex) {
                        Status status1 = new Status(13);
                        GameManagerInstanceResult gameManagerClient$GameManagerInstanceResult1 = com.google.android.gms.internal.zzjs.zzc.this.zzp(status1);
                        com.google.android.gms.internal.zzjs.zzc.this.setResult(gameManagerClient$GameManagerInstanceResult1);
                    }
                }

                @Override  // com.google.android.gms.cast.internal.zzo
                public void zzy(long v) {
                    Status status0 = new Status(2103);
                    GameManagerInstanceResult gameManagerClient$GameManagerInstanceResult0 = com.google.android.gms.internal.zzjs.zzc.this.zzp(status0);
                    com.google.android.gms.internal.zzjs.zzc.this.setResult(gameManagerClient$GameManagerInstanceResult0);
                }
            };
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzp(x0);
        }

        public GameManagerInstanceResult zzp(Status status0) {
            return new zzd(status0, null);
        }
    }

    static final class zzd implements GameManagerInstanceResult {
        private final Status zzOt;
        private final GameManagerClient zzTJ;

        zzd(Status status0, GameManagerClient gameManagerClient0) {
            this.zzOt = status0;
            this.zzTJ = gameManagerClient0;
        }

        @Override  // com.google.android.gms.cast.games.GameManagerClient$GameManagerInstanceResult
        public GameManagerClient getGameManagerClient() {
            return this.zzTJ;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final class zze implements GameManagerResult {
        private final Status zzOt;
        private final String zzTL;
        private final long zzTM;
        private final JSONObject zzTN;

        zze(Status status0, String s, long v, JSONObject jSONObject0) {
            this.zzOt = status0;
            this.zzTL = s;
            this.zzTM = v;
            this.zzTN = jSONObject0;
        }

        @Override  // com.google.android.gms.cast.games.GameManagerClient$GameManagerResult
        public JSONObject getExtraMessageData() {
            return this.zzTN;
        }

        @Override  // com.google.android.gms.cast.games.GameManagerClient$GameManagerResult
        public String getPlayerId() {
            return this.zzTL;
        }

        @Override  // com.google.android.gms.cast.games.GameManagerClient$GameManagerResult
        public long getRequestId() {
            return this.zzTM;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final String NAMESPACE;
    private static final zzl zzQW;
    private String zzTA;
    private final Map zzTn;
    private final List zzTo;
    private final String zzTp;
    private final CastApi zzTq;
    private final GoogleApiClient zzTr;
    private zzjt zzTs;
    private boolean zzTt;
    private GameManagerState zzTu;
    private GameManagerState zzTv;
    private String zzTw;
    private JSONObject zzTx;
    private long zzTy;
    private Listener zzTz;
    private final SharedPreferences zztB;

    static {
        zzjs.NAMESPACE = "urn:x-cast:com.google.cast.games";
        zzjs.zzQW = new zzl("GameManagerChannel");
    }

    public zzjs(GoogleApiClient googleApiClient0, String s, CastApi cast$CastApi0) throws IllegalArgumentException, IllegalStateException {
        super("urn:x-cast:com.google.cast.games", "CastGameManagerChannel", null);
        this.zzTn = new ConcurrentHashMap();
        this.zzTt = false;
        this.zzTy = 0L;
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("castSessionId cannot be null.");
        }
        if(googleApiClient0 == null || !googleApiClient0.isConnected() || !googleApiClient0.hasConnectedApi(Cast.API)) {
            throw new IllegalArgumentException("googleApiClient needs to be connected and contain the Cast.API API.");
        }
        this.zzTo = new ArrayList();
        this.zzTp = s;
        this.zzTq = cast$CastApi0;
        this.zzTr = googleApiClient0;
        this.zztB = googleApiClient0.getContext().getApplicationContext().getApplicationContext().getSharedPreferences("org.dyndns.vivi.SkskShogi.game_manager_channel_data", 0);
        this.zzTv = null;
        this.zzTu = new zzjw(0, 0, "", null, new ArrayList(), "", -1);
    }

    public void dispose() throws IllegalStateException {
        synchronized(this) {
            if(!this.zzTt) {
                try {
                    this.zzTu = null;
                    this.zzTv = null;
                    this.zzTw = null;
                    this.zzTx = null;
                    this.zzTt = true;
                    String s = this.getNamespace();
                    this.zzTq.removeMessageReceivedCallbacks(this.zzTr, s);
                }
                catch(IOException iOException0) {
                    zzjs.zzQW.zzf("Exception while detaching game manager channel.", new Object[]{iOException0});
                }
            }
        }
    }

    public GameManagerState getCurrentState() throws IllegalStateException {
        synchronized(this) {
            this.zzlv();
            return this.zzTu;
        }
    }

    public String getLastUsedPlayerId() throws IllegalStateException {
        synchronized(this) {
            this.zzlv();
            return this.zzTA;
        }
    }

    public boolean isDisposed() {
        synchronized(this) {
        }
        return this.zzTt;
    }

    public boolean isInitialized() {
        synchronized(this) {
        }
        return this.zzTs != null;
    }

    public void sendGameMessage(String playerId, JSONObject extraMessageData) throws IllegalStateException {
        synchronized(this) {
            this.zzlv();
            long v1 = this.zzTy + 1L;
            this.zzTy = v1;
            JSONObject jSONObject1 = this.zza(v1, playerId, 7, extraMessageData);
            if(jSONObject1 != null) {
                String s1 = this.getNamespace();
                this.zzTq.sendMessage(this.zzTr, s1, jSONObject1.toString());
            }
        }
    }

    public PendingResult sendGameRequest(String playerId, JSONObject extraMessageData) throws IllegalStateException {
        synchronized(this) {
            this.zzlv();
            com.google.android.gms.internal.zzjs.3 zzjs$30 = new zza() {
                @Override  // com.google.android.gms.internal.zzjs$zzb
                public void execute() {
                    zzo zzo0 = this.zzlA();
                    zzjs.this.zza(playerId, 6, extraMessageData, zzo0);
                }
            };
            return this.zzTr.zzb(zzjs$30);
        }
    }

    public void setListener(Listener listener) {
        synchronized(this) {
            this.zzTz = listener;
        }
    }

    private JSONObject zza(long v, String s, int v1, JSONObject jSONObject0) {
        try {
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("requestId", v);
            jSONObject1.put("type", v1);
            jSONObject1.put("extraMessageData", jSONObject0);
            jSONObject1.put("playerId", s);
            jSONObject1.put("playerToken", this.zzbA(s));
            return jSONObject1;
        }
        catch(JSONException jSONException0) {
            zzjs.zzQW.zzf("JSONException when trying to create a message: %s", new Object[]{jSONException0.getMessage()});
            return null;
        }
    }

    private void zza(zzju zzju0) {
        boolean z = true;
        synchronized(this) {
            if(zzju0.zzlC() != 1) {
                z = false;
            }
            this.zzTv = this.zzTu;
            if(z && zzju0.zzlH() != null) {
                this.zzTs = zzju0.zzlH();
            }
            if(this.isInitialized()) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: zzju0.zzlE()) {
                    String s = ((zzjy)object0).getPlayerId();
                    arrayList0.add(new zzjx(s, ((zzjy)object0).getPlayerState(), ((zzjy)object0).getPlayerData(), this.zzTn.containsKey(s)));
                }
                this.zzTu = new zzjw(zzju0.getLobbyState(), zzju0.getGameplayState(), zzju0.zzlF(), zzju0.getGameData(), arrayList0, this.zzTs.zzlB(), this.zzTs.getMaxPlayers());
                PlayerInfo playerInfo0 = this.zzTu.getPlayer(zzju0.getPlayerId());
                if(playerInfo0 != null && playerInfo0.isControllable() && zzju0.zzlC() == 2) {
                    this.zzTw = zzju0.getPlayerId();
                    this.zzTx = zzju0.getExtraMessageData();
                }
            }
        }
    }

    private void zza(String s, int v, JSONObject jSONObject0, zzo zzo0) {
        long v1 = this.zzTy + 1L;
        this.zzTy = v1;
        JSONObject jSONObject1 = this.zza(v1, s, v, jSONObject0);
        if(jSONObject1 == null) {
            zzo0.zza(-1L, 2001, null);
            zzjs.zzQW.zzf("Not sending request because it was invalid.", new Object[0]);
            return;
        }
        zzp zzp0 = new zzp(30000L);
        zzp0.zza(v1, zzo0);
        this.zzTo.add(zzp0);
        this.zzQ(true);
        String s1 = this.getNamespace();
        this.zzTq.sendMessage(this.zzTr, s1, jSONObject1.toString()).setResultCallback(new ResultCallback() {
            public void zzm(Status status0) {
                if(!status0.isSuccess()) {
                    zzjs.this.zzb(v1, status0.getStatusCode());
                }
            }
        });
    }

    public PendingResult zza(GameManagerClient gameManagerClient0) throws IllegalArgumentException {
        synchronized(this) {
            if(gameManagerClient0 == null) {
                throw new IllegalArgumentException("gameManagerClient can\'t be null.");
            }
            com.google.android.gms.internal.zzjs.1 zzjs$10 = new com.google.android.gms.internal.zzjs.zzc(gameManagerClient0) {
                @Override  // com.google.android.gms.internal.zzjs$zzb
                public void execute() {
                    try {
                        zzjs.this.zzTq.setMessageReceivedCallbacks(zzjs.this.zzTr, zzjs.this.getNamespace(), new MessageReceivedCallback() {
                            @Override  // com.google.android.gms.cast.Cast$MessageReceivedCallback
                            public void onMessageReceived(CastDevice castDevice, String namespace, String message) {
                                zzjs.this.zzbB(message);
                            }
                        });
                    }
                    catch(IOException | IllegalStateException unused_ex) {
                        this.zzlA().zza(-1L, 8, null);
                        return;
                    }
                    zzjs.this.zzly();
                    zzjs.this.zzlx();
                    zzo zzo0 = this.zzlA();
                    zzjs.this.zza(null, 1100, null, zzo0);
                }
            };
            return this.zzTr.zzb(zzjs$10);
        }
    }

    public PendingResult zza(String s, int v, JSONObject jSONObject0) throws IllegalStateException {
        synchronized(this) {
            this.zzlv();
            com.google.android.gms.internal.zzjs.2 zzjs$20 = new zza() {
                @Override  // com.google.android.gms.internal.zzjs$zzb
                public void execute() {
                    int v = zzjv.zzaJ(v);
                    if(v == 0) {
                        this.zzlA().zza(-1L, 2001, null);
                        zzjs.zzQW.zzf("sendPlayerRequest for unsupported playerState: %d", new Object[]{v});
                        return;
                    }
                    zzo zzo0 = this.zzlA();
                    zzjs.this.zza(s, v, jSONObject0, zzo0);
                }
            };
            return this.zzTr.zzb(zzjs$20);
        }
    }

    private int zzaI(int v) {
        switch(v) {
            case 0: {
                return 0;
            }
            case 1: {
                return 2001;
            }
            case 2: {
                return 2003;
            }
            case 3: {
                return 2150;
            }
            case 4: {
                return 0x867;
            }
            default: {
                zzjs.zzQW.zzf("Unknown GameManager protocol status code: " + v, new Object[0]);
                return 13;
            }
        }
    }

    private void zzb(long v, int v1, Object object0) {
        Iterator iterator0 = this.zzTo.iterator();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(((zzp)object1).zzc(v, v1, object0)) {
                iterator0.remove();
            }
        }
    }

    @Override  // com.google.android.gms.cast.internal.zzd
    public void zzb(long v, int v1) {
        this.zzb(v, v1, null);
    }

    public String zzbA(String s) throws IllegalStateException {
        synchronized(this) {
            return s == null ? null : ((String)this.zzTn.get(s));
        }
    }

    @Override  // com.google.android.gms.cast.internal.zzd
    public final void zzbB(String s) {
        zzju zzju0;
        zzjs.zzQW.zzb("message received: %s", new Object[]{s});
        try {
            zzju0 = zzju.zzh(new JSONObject(s));
        }
        catch(JSONException jSONException0) {
            zzjs.zzQW.zzf("Message is malformed (%s); ignoring: %s", new Object[]{jSONException0.getMessage(), s});
            return;
        }
        if(zzju0 == null) {
            zzjs.zzQW.zzf("Could not parse game manager message from string: %s", new Object[]{s});
            return;
        }
        if((this.isInitialized() || zzju0.zzlH() != null) && !this.isDisposed()) {
            boolean z = zzju0.zzlC() == 1;
            if(z && !TextUtils.isEmpty(zzju0.zzlG())) {
                this.zzTn.put(zzju0.getPlayerId(), zzju0.zzlG());
                this.zzlx();
            }
            if(zzju0.getStatusCode() == 0) {
                this.zza(zzju0);
            }
            else {
                zzjs.zzQW.zzf("Not updating from game message because the message contains error code: %d", new Object[]{zzju0.getStatusCode()});
            }
            int v = this.zzaI(zzju0.getStatusCode());
            if(z) {
                this.zzb(zzju0.getRequestId(), v, zzju0);
            }
            if(this.isInitialized() && v == 0) {
                this.zzlw();
            }
        }
    }

    private void zzlv() throws IllegalStateException {
        synchronized(this) {
            if(!this.isInitialized()) {
                throw new IllegalStateException("Attempted to perform an operation on the GameManagerChannel before it is initialized.");
            }
            if(this.isDisposed()) {
                throw new IllegalStateException("Attempted to perform an operation on the GameManagerChannel after it has been disposed.");
            }
        }
    }

    private void zzlw() {
        if(this.zzTz != null) {
            if(this.zzTv != null && !this.zzTu.equals(this.zzTv)) {
                this.zzTz.onStateChanged(this.zzTu, this.zzTv);
            }
            if(this.zzTx != null && this.zzTw != null) {
                this.zzTz.onGameMessageReceived(this.zzTw, this.zzTx);
            }
        }
        this.zzTv = null;
        this.zzTw = null;
        this.zzTx = null;
    }

    private void zzlx() {
        synchronized(this) {
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("castSessionId", this.zzTp);
                jSONObject0.put("playerTokenMap", new JSONObject(this.zzTn));
                this.zztB.edit().putString("save_data", jSONObject0.toString()).commit();
            }
            catch(JSONException jSONException0) {
                zzjs.zzQW.zzf("Error while saving data: %s", new Object[]{jSONException0.getMessage()});
            }
        }
    }

    private void zzly() {
        synchronized(this) {
            String s = this.zztB.getString("save_data", null);
            if(s != null) {
                try {
                    JSONObject jSONObject0 = new JSONObject(s);
                    String s1 = jSONObject0.getString("castSessionId");
                    if(this.zzTp.equals(s1)) {
                        JSONObject jSONObject1 = jSONObject0.getJSONObject("playerTokenMap");
                        Iterator iterator0 = jSONObject1.keys();
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            String s2 = jSONObject1.getString(((String)object0));
                            this.zzTn.put(((String)object0), s2);
                        }
                        this.zzTy = 0L;
                    }
                }
                catch(JSONException jSONException0) {
                    zzjs.zzQW.zzf("Error while loading data: %s", new Object[]{jSONException0.getMessage()});
                }
            }
        }
    }

    @Override  // com.google.android.gms.cast.internal.zzc
    protected boolean zzz(long v) {
        Iterator iterator0 = this.zzTo.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((zzp)object0).zzd(v, 15)) {
                iterator0.remove();
            }
        }
        boolean z = false;
        synchronized(zzp.zzVr) {
            for(Object object2: this.zzTo) {
                if(((zzp)object2).zzme()) {
                    z = true;
                    break;
                }
            }
            return z;
        }
    }
}

